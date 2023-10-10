package com.ruoyi.web.controller.zhanxin;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.zhanxin.domain.Project;
import com.ruoyi.zhanxin.domain.ProjectMember;
import com.ruoyi.zhanxin.service.ProjectMemberService;
import com.ruoyi.zhanxin.service.ProjectService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Anonymous
@RequestMapping("/ty/project")
public class ProjectController {
    //定义需要用到的service
    private final ProjectService projectService;
    private final ProjectMemberService memberService;

    //构造器注入
    @Autowired
    public ProjectController(ProjectService projectService, ProjectMemberService memberService) {
        this.projectService = projectService;
        this.memberService = memberService;
    }

    @ApiOperation("创建新项目")
    @PostMapping("/create")
    AjaxResult createProject(@RequestBody Project project) {
        projectService.save(project);
        ProjectMember member = new ProjectMember();
        member.setProjectId(project.getId());
        member.setMemberId(Math.toIntExact(SecurityUtils.getUserId()));
        member.setRole("超级管理员");
        return AjaxResult.success("新建项目成功");
    }

    @ApiOperation("修改项目信息")
    @PostMapping("/update")
    AjaxResult updateProject(@RequestBody Project project) {
        Project pj = projectService.getById(project.getId());
        if (pj == null) return AjaxResult.error("项目编号不存在或为空");
        projectService.updateById(project);
        return AjaxResult.success("修改项目成功");
    }

    @ApiOperation("查询项目")
    @GetMapping("/get/project/{userId}")
    AjaxResult getProjects(@PathVariable Integer userId) {
        LambdaQueryWrapper<ProjectMember> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(ProjectMember::getMemberId, userId);
        List<ProjectMember> projectMembers = memberService.list(queryWrapper);
        List<Integer> membersId = new ArrayList<>();
        for (ProjectMember projectMember : projectMembers) {
            membersId.add(projectMember.getProjectId());
        }
        LambdaQueryWrapper<Project> projectQueryWrapper = new LambdaQueryWrapper<>();
        projectQueryWrapper.in(Project::getId, membersId).or().eq(Project::getVisibility, "公开");
        List<Project> list = projectService.list(projectQueryWrapper);
        return AjaxResult.success(list);
    }

    @ApiOperation("添加成员进项目")
    @PostMapping("/add/member")
    AjaxResult addMember(@RequestBody ProjectMember member) {
        memberService.save(member);
        return AjaxResult.success("添加成员成功");
    }
}
