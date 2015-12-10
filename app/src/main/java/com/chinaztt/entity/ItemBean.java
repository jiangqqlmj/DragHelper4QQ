package com.chinaztt.entity;

/**
 * 当前类注释:
 * ProjectName：DragHelper4QQ
 * Author:<a href="http://www.cniao5.com">菜鸟窝</a>
 * Description：
 * 菜鸟窝是一个只专注做Android开发技能的在线学习平台，课程以实战项目为主，对课程与服务”吹毛求疵”般的要求，
 * 打造极致课程，是菜鸟窝不变的承诺
 */
public class ItemBean {
    private int img;
    private String title;
    private boolean isUpdate=false;

    public ItemBean() {
    }

    public ItemBean(int img, String title, boolean isUpdate) {
        this.img = img;
        this.title = title;
        this.isUpdate = isUpdate;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUpdate() {
        return isUpdate;
    }

    public void setIsUpdate(boolean isUpdate) {
        this.isUpdate = isUpdate;
    }

    @Override
    public String toString() {
        return "ItemBean{" +
                "img=" + img +
                ", title='" + title + '\'' +
                ", isUpdate=" + isUpdate +
                '}';
    }
}
