package com.pansoft.wechatkotlindemo;

/**
 * 作者：吕振鹏
 * E-mail:lvzhenpeng@pansoft.com
 * 创建时间：2018年08月10日
 * 时间：18:37
 * 版本：v1.0.0
 * 类描述：
 * 修改时间：
 */
public class ItemBean {

    public static final ItemBean EMPTY = new ItemBean(null, -1, false);

    private String imageUrl;
    private int position;
    private boolean canMove;

    public ItemBean() {
    }

    public ItemBean(String imageUrl, int position, boolean canMove) {
        this.imageUrl = imageUrl;
        this.position = position;
        this.canMove = canMove;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isCanMove() {
        return canMove;
    }

    public void setCanMove(boolean canMove) {
        this.canMove = canMove;
    }
}
