package com.ruoyi.web.controller.zhanxin;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.zhanxin.domain.Task;
import com.ruoyi.zhanxin.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ty/task")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    AjaxResult addTask(@RequestBody Task task) {
        taskService.save(task);
        return AjaxResult.success("新建任务成功");
    }
}
