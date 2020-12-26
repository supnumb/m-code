package cn.zhidiancan.application.controller;

import cn.zhidiancan.application.models.Application;
import cn.zhidiancan.framework.model.Result;
import cn.zhidiancan.application.service.ApplicationService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/application/")
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;

    @ApiOperation("注册第三方应用到中台")
    @PutMapping("save")
    public Result saveApplication(@RequestBody Application application) {

        Integer back=applicationService.save(application);

        return Result.dbExecute(back,"注册第三方应用到中台");
    }

    @ApiOperation("列出所有注册应用")
    @GetMapping(value = "list")
    public Result list() {

        List<Application> list=applicationService.list();

        if (list!=null){
            return Result.success("列出所有注册应用").setData(list);
        }else{
            return Result.failure("列出所有注册应用");
        }
    }
}
