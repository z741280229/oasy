package com.ethan.oasy.pojo;

public class Resources {
    private Integer id;

    private String name;

    private Integer parentid;

    private String type;

    private String resurl;

    private String icon;

    private String reskey;

    private Integer level;

    private Integer ishide;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getResurl() {
        return resurl;
    }

    public void setResurl(String resurl) {
        this.resurl = resurl == null ? null : resurl.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getReskey() {
        return reskey;
    }

    public void setReskey(String reskey) {
        this.reskey = reskey == null ? null : reskey.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getIshide() {
        return ishide;
    }

    public void setIshide(Integer ishide) {
        this.ishide = ishide;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    @Override
    public String toString() {
        return "Resources{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentid=" + parentid +
                ", type='" + type + '\'' +
                ", resurl='" + resurl + '\'' +
                ", icon='" + icon + '\'' +
                ", reskey='" + reskey + '\'' +
                ", level=" + level +
                ", ishide=" + ishide +
                ", description='" + description + '\'' +
                '}';
    }
}