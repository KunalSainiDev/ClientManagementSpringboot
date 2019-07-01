package com.prudential.client.clientmanagement.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeFieldsEntity {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fieldName;
    private String groupName;
    private String status;


    public EmployeeFieldsEntity() {

    }
    public EmployeeFieldsEntity(int id, String fieldName, String groupName, String status) {
        this.id = id;
        this.fieldName = fieldName;
        this.groupName = groupName;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }


    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "EmployeeFieldsEntity{" +
                "id=" + id +
                ", fieldName=" + fieldName +
                ", groupName='" + groupName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
