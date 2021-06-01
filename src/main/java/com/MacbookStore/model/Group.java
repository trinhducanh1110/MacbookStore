package com.MacbookStore.model;
//import com.sun.source.tree.BinaryTree;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Group")
public class Group {
    private String id;
    private String groupID;
    private String groupName;

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
