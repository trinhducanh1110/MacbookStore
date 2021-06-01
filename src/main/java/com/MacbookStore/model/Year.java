package com.MacbookStore.model;
//import com.sun.source.tree.BinaryTree;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Year")
public class Year {
    private String id;
    private String yearID;
    private String yearName;

    public String getYearID() {
        return yearID;
    }

    public void setYearID(String yearID) {
        this.yearID = yearID;
    }

    public String getYearName() {
        return yearName;
    }

    public void setYearName(String yearName) {
        this.yearName = yearName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
