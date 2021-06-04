package com.MacbookStore.model;

//import com.sun.source.tree.BinaryTree;
import org.springframework.data.mongodb.core.mapping.Document;

import java.text.DecimalFormat;

@Document(collection = "Product")
public class Product {
    private String id;
    private String productName;
    private String description;
    private String price;
    private String sold;
    private String status;
    private String stock;
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
    private String image1;
    private String image2;
    private String image3;


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
        this.status = status;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSold() {
        return sold;
    }

    public void setSold(String sold) {
        this.sold = sold;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }
}
