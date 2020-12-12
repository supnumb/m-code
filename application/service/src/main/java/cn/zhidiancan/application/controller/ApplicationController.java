package cn.zhidiancan.application.controller;

import cn.zhidiancan.application.models.Application;
import cn.zhidiancan.application.models.models.Result;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/")
public class ApplicationController {

    @PutMapping("save")
    public Result saveApplication(Application application) {
        return null;
    }
}
