package cn.jjz.fileup;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.*;

/**
 * Created by lenovo on 2017/10/30.
 */
public class FileUpAction extends ActionSupport {
    //具体上传文件的 引用 , 指向临时目录中的临时文件
    private File upload;
    //上传文件的类型， ContentType 固定的写法
    private String uploadContentType;
    // 上传文件的名字 ,FileName 固定的写法
    private String uploadFileName;
    //上传文件的路径
    private String savePath;
    public String fileup() throws IOException {
        byte[] buffer=new byte[1024];
        FileInputStream fis=new FileInputStream(getUpload());
        FileOutputStream fos=new FileOutputStream(getSavePath()+"\\"+getUploadFileName());
        int length=fis.read(buffer);
        while (length>0){
            fos.write(buffer,0,length);
            length=fis.read(buffer);
        }
        fos.flush();
        fos.close();
        fis.close();
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
    //getRealPath()把相对路径转化为绝对路径
    public String getSavePath() {
        return ServletActionContext.getServletContext().getRealPath(savePath);
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }
}
