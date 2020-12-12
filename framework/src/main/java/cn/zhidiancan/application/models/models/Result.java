package cn.zhidiancan.application.models.models;

import lombok.Data;

@Data
public class Result {
    private int Code;
    private String Message;
    private Object Extra;
}
