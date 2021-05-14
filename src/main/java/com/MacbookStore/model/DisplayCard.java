package com.MacbookStore.model;
//import com.sun.source.tree.BinaryTree;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "DisplayCard")
public class DisplayCard {
    private String _id;
    private String displayCardID;
    private String displayCardName;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

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
}
