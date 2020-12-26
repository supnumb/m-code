package cn.zhidiancan.framework.model;

import lombok.Data;

import java.util.Date;

@Data
public class BaseModel {
    private int ID;
    private int Status;
    private int Flag;
    private Date CreateTime;
    private Date UpdateTime;
}
