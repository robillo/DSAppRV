package com.appbusters.robinkamboj.dsapprv.model;

public class Data {
    private String header;
    private int drawable;
    private int category;

    public Data(String header, int drawable, int category) {
        this.header = header;
        this.drawable = drawable;
        this.category = category;
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
