package cn.zhidiancan.application.service;

import cn.zhidiancan.application.mapper.ApplicationMapper;
import cn.zhidiancan.application.models.Application;
import cn.zhidiancan.framework.untility.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {

	@Autowired
	ApplicationMapper applicationMapper;

	public Integer save(Application application) {
		String appCode = CodeUtil.generateApplicationID();
		String secret = CodeUtil.generateSecret();

		application.setAppCode(appCode);
		application.setSecret(secret);

		return applicationMapper.save(application);
	}

	public List<Application> list() {
		return applicationMapper.list();
	}
}
