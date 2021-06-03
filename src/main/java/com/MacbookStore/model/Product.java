package com.MacbookStore.model;

//import com.sun.source.tree.BinaryTree;
import org.springframework.data.mongodb.core.mapping.Document;

import java.text.DecimalFormat;

@Document(collection = "Product")
public class Product {
    private String id;
    private String productName;
    private String Description;
    private String Price;
    private String Sold;
    private String status;
    private String Stock;
    private String colorID;
    private String cpuID;
    private String displayCardID;
    private String displayID;
    private String groupID;
    private String hardDriveID;
    private String productID;
    private String yearID;
    private String ramID;
    private String image;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getStock() {
        return Stock;
    }

    public void setStock(String stock) {
        Stock = stock;
    }

    public String getSold() {
        return Sold;
    }

    public void setSold(String sold) {
        Sold = sold;
    }

    public String getCpuID() {
        return cpuID;
    }

    public void setCpuID(String cpuID) {
        this.cpuID = cpuID;
    }

    public String getDisplayCardID() {
        return displayCardID;
    }

    public void setDisplayCardID(String displayCardID) {
        this.displayCardID = displayCardID;
    }

    public String getDisplayID() {
        return displayID;
    }

    public void setDisplayID(String displayID) {
        this.displayID = displayID;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public String getHardDriveID() {
        return hardDriveID;
    }

    public void setHardDriveID(String hardDriveID) {
        this.hardDriveID = hardDriveID;
    }

    public String getColorID() {
        return colorID;
    }

    public void setColorID(String colorID) {
        this.colorID = colorID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        status = status;
    }

    public String getYearID() {
        return yearID;
    }

    public void setYearID(String yearID) {
        this.yearID = yearID;
    }

    public String getRamID() {
        return ramID;
    }

    public void setRamID(String ramID) {
        this.ramID = ramID;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
