package com.ethan.oasy.pojo;

/**
 * @program: oasy
 * @description: 其他文件（非正规类文件的上传）
 * @author: sam
 * @create: 2019-04-09 09:11
 */
public class OtherFile {
    private String type;
    private String fileRealName;
    private Integer length;
    private String fileNumName;
    private String path;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFileRealName() {
        return fileRealName;
    }

    public void setFileRealName(String fileRealName) {
        this.fileRealName = fileRealName;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getFileNumName() {
        return fileNumName;
    }

    public void setFileNumName(String fileNumName) {
        this.fileNumName = fileNumName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "OtherFile{" +
                "type='" + type + '\'' +
                ", fileRealName='" + fileRealName + '\'' +
                ", length=" + length +
                ", fileNumName='" + fileNumName + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
