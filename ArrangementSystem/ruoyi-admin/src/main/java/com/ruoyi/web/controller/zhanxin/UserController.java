package com.ruoyi.web.controller.zhanxin;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.zhanxin.domain.SysUserPlus;
import com.ruoyi.zhanxin.service.SysUserPlusService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ty/user")
public class UserController {
    private final SysUserPlusService userService;

    @Autowired
    public UserController(SysUserPlusService userService) {
        this.userService = userService;
    }
    @ApiOperation("根据id获取用户信息")
    @GetMapping("/get/byId/{id}")
    AjaxResult getUserMsgById(@PathVariable Integer id){
        return AjaxResult.success(userService.getById(id));
 }
    @ApiOperation("根据name获取用户信息")
    @GetMapping("/get/byName/{name}")
    AjaxResult getUserMsgByName(@PathVariable String name){
        LambdaQueryWrapper<SysUserPlus> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(SysUserPlus::getNickName,name);
        return AjaxResult.success(userService.getOne(queryWrapper));
    }
}
