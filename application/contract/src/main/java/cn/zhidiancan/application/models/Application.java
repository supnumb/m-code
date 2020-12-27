package cn.zhidiancan.application.models;

import cn.zhidiancan.framework.model.BaseModel;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel("注册到中台的应用程序")
public class Application extends BaseModel {
    private String AppCode;
    private String Secret;

    private String Name;
    private int CompanyID;
    private Company Company;
    private String Description;
}
