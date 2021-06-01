package com.MacbookStore.model;
//import com.sun.source.tree.BinaryTree;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "DisplayCard")
public class DisplayCard {
    private String id;
    private String displayCardID;
    private String displayCardName;

    public String getDisplayCardID() {
        return displayCardID;
    }

    public void setDisplayCardID(String displayCardID) {
        this.displayCardID = displayCardID;
    }

    public String getDisplayCardName() {
        return displayCardName;
    }

    public void setDisplayCardName(String displayCardName) {
        this.displayCardName = displayCardName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
