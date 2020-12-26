package cn.zhidiancan.application.service;

import cn.zhidiancan.application.mapper.ApplicationMapper;
import cn.zhidiancan.application.models.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {

    @Autowired
    ApplicationMapper applicationMapper;

    public Integer save(Application application) {
        return applicationMapper.save(application);
    }

    public List<Application> list() {
        return applicationMapper.list();
    }
}
