package com.appbusters.robinkamboj.dsapprv.model;

public class Data {
    private String header;
    private int drawable;
    private int category;
    private int color;

    public Data(String header, int drawable, int category, int color) {
        this.header = header;
        this.drawable = drawable;
        this.category = category;
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public int getDrawable() {
        return drawable;
    }

    public void setDrawable(int drawable) {
        this.drawable = drawable;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
}
