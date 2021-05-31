package com.MacbookStore.model;
//import com.sun.source.tree.BinaryTree;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Color")
public class Color {
    private String id;
    private String colorID;
    private String colorName;


    public String getColorID() {
        return colorID;
    }

    public void setColorID(String colorID) {
        this.colorID = colorID;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
