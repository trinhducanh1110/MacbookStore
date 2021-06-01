package com.MacbookStore.model;
//import com.sun.source.tree.BinaryTree;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "RAM")
public class RAM {
    private String id;
    private String ramID;
    private String ramName;

    public String getRamID() {
        return ramID;
    }

    public void setRamID(String ramID) {
        this.ramID = ramID;
    }

    public String getRamName() {
        return ramName;
    }

    public void setRamName(String ramName) {
        this.ramName = ramName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
