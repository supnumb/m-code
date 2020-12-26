package cn.zhidiancan.application.models;

import cn.zhidiancan.framework.model.BaseModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("企业组织")
public class Company extends BaseModel {
    private String Name;
    private String Contact;
    private String Telephone;

    @ApiModelProperty("是否是新奥集团内部公司")
    private boolean IsInside;
}
