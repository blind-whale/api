package me.kaohongshu.tuicool.entity;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Administrator on 2017/5/15 0015.
 */
@XmlRootElement(name="result")
public class Result {
    private int status;
    private int errorCode;
    private String errorInfo;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public List<? extends Bean> getData() {
        return data;
    }

    public void setData(List<? extends Bean> data) {
        this.data = data;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    private List<? extends Bean> data;
}
