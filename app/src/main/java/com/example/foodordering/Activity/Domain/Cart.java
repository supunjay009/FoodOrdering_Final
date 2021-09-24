package com.example.foodordering.Activity.Domain;

public class Cart {

    private String fid,fname,price,qty,images;

    public Cart() {
    }

    public Cart(String fid, String fname, String images,String price, String qty) {
        this.fid = fid;
        this.fname = fname;
        this.fname = images;
        this.price = price;
        this.qty = qty;
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }
}
