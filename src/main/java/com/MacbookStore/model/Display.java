package com.MacbookStore.model;
//import com.sun.source.tree.BinaryTree;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Display")
public class Display {
    private String id;
    private String displayID;
    private String displayName;

    public String getDisplayID() {
        return displayID;
    }

    public void setDisplayID(String displayID) {
        this.displayID = displayID;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
