package com.ethan.oasy.pojo;

import java.util.List;

/**
 * @program: oasy
 * @description: 导航栏菜单
 * @author: sam
 * @create: 2019-03-31 16:32
 */
public class Menu {
    private Integer Id;

    private String name;

    private String icon;

    private List<Resources> subs;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Resources> getSubs() {
        return subs;
    }

    public void setSubs(List<Resources> subs) {
        this.subs = subs;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", subs=" + subs +
                '}';
    }
}
