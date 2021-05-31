package com.MacbookStore.model;
//import com.sun.source.tree.BinaryTree;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "CPU")
public class CPU {
    private String id;
    private String cpuID;
    private String cpuName;

    public String getCpuID() {
        return cpuID;
    }

    public void setCpuID(String cpuID) {
        this.cpuID = cpuID;
    }

    public String getCpuName() {
        return cpuName;
    }

    public void setCpuName(String cpuName) {
        this.cpuName = cpuName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
