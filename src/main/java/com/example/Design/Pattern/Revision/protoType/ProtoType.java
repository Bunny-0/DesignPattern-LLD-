package com.example.Design.Pattern.Revision.protoType;

public class ProtoType implements Cloneable {


    String name;
    String type;
    String description;
    int id;
    String createdBy;
    ProtoType(String name, String type, String description, int id, String createdBy) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.id = id;
        this.createdBy = createdBy;
    }

    @Override
    public ProtoType clone() {

        try {
            return (ProtoType) super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    @Override
    public String toString() {
        return "ProtoType [name=" + name + ", type=" + type + ", description=" + description +
                ", id=" + id + ", createdBy=" + createdBy + "]";
    }


}
