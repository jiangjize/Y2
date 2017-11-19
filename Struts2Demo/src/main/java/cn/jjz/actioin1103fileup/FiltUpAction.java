package cn.jjz.actioin1103fileup;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.File;

/**
 * Created by lenovo on 2017/11/3.
 */
public class FiltUpAction extends ActionSupport {
    //具体上传文件的 引用 , 指向临时目录中的临时文件
    private File upload;
    //上传文件的类型， ContentType 固定的写法
    private String uploadContentType;
    // 上传文件的名字 ,FileName 固定的写法
    private String uploadFileName;
    //上传文件的路径
    private String savePath;
    public String execute(){

        return SUCCESS;
    }

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String getSavePath() {
        return ServletActionContext.getServletContext().getRealPath(savePath);
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }
}
