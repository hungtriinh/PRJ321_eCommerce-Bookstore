/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Hung Trinh
 */
public class Product {
    private String pid;
    private String name;
    private String description;
    private float price;
    private int quantity;
    private String catid;
    private String image;

    public Product(String pid, String name, String description, float price, int quantity, String catid, String image) {
        this.pid = pid;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.catid = catid;
        this.image = image;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCatid() {
        return catid;
    }

    public void setCatid(String catid) {
        this.catid = catid;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
    public float getTotal(){
        return (float) quantity * price;
    }
    
    
}
