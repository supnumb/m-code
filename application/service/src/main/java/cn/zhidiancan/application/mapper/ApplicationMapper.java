package cn.zhidiancan.application.mapper;

import cn.zhidiancan.application.models.Application;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ApplicationMapper {

    Integer save(Application application);

    List<Application> list();
}
