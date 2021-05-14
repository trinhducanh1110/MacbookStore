package com.MacbookStore.model;
//import com.sun.source.tree.BinaryTree;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "HardDrive")
public class HardDrive {
    private String _id;
    private String hardDriveID;
    private String hardDriveName;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }


    public String getHardDriveID() {
        return hardDriveID;
    }

    public void setHardDriveID(String hardDriveID) {
        this.hardDriveID = hardDriveID;
    }

    public String getHardDriveName() {
        return hardDriveName;
    }

    public void setHardDriveName(String hardDriveName) {
        this.hardDriveName = hardDriveName;
    }
}
