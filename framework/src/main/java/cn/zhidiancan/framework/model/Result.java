package cn.zhidiancan.framework.model;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel("接口调用返回结果")
public class Result {
    private int code;
    private String message;
    private Object data;
    private Object extra;

    public Result setExtra(Object extra) {
        this.extra = extra;
        return this;
    }

    public Result setData(Object data) {
        this.data = data;
        return this;
    }

    public static Result success(String message) {
        Result result = new Result();

        result.setCode(0);
        result.setMessage(String.format("%s 操作成功", message));

        return result;
    }

    public static Result failure(String message) {
        Result result = new Result();

        result.setCode(-1);
        result.setMessage(String.format("%s 操作失败", message));

        return result;
    }

    /**
     * 通常根据数据库脚本的执行影响行数返回调用方结果；如果影响行数大于0，则返回成功；反之返回失败；适用于更新、插入数字的情况；
     *
     * @param back    数据库脚本返回操作影响行数
     * @param message 返回调用方接口操作结果描述
     * @return
     */
    public static Result dbExecute(Integer back, String message) {
        Result result = new Result();

        if (back > 0) {
            result.setCode(0);
            result.setMessage(String.format("%s 操作成功", message));
        } else {
            result.setCode(-1);
            result.setMessage(String.format("%s 操作失败", message));
        }

        return result;
    }
}
