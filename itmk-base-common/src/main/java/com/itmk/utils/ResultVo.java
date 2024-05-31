package com.itmk.utils;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data   //自动生成get和set方法（包括这里）
@AllArgsConstructor // 这个帮你写了 但是IDE不知道 所以IDE要把lombok插件装上
// 这里使用了lombok
public class ResultVo<T> {
    private String msg;
    private int code;
    private T data;

    // 按理来说要手动写这个方法 刚才报错的地方才能调用
//    public ResultVo(String msg, int code, T data) {
//        this.msg = msg;
//        this.code = code;
//        this.data = data;
//    }
//
//    //这些逗帮你省略了
//    public String getMsg() {
//        return msg;
//    }
//
//    public void setMsg(String msg) {
//        this.msg = msg;
//    }
//
//    public int getCode() {
//        return code;
//    }
//
//    public void setCode(int code) {
//        this.code = code;
//    }
//
//    public T getData() {
//        return data;
//    }
//
//    public void setData(T data) {
//        this.data = data;
//    }
}
