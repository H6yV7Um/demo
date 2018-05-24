package com.victor.spring.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class SceneCodeInfoEntity implements Serializable{
    private String id;

    private String sceneCodeName;

    private String sceneCodeDesc;

    private Integer billDetailCount;

    private Integer status;

    private Timestamp createdAt;

    private Timestamp updatedAt;

    private Timestamp datachangeLasttime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSceneCodeName() {
        return sceneCodeName;
    }

    public void setSceneCodeName(String sceneCodeName) {
        this.sceneCodeName = sceneCodeName == null ? null : sceneCodeName.trim();
    }

    public String getSceneCodeDesc() {
        return sceneCodeDesc;
    }

    public void setSceneCodeDesc(String sceneCodeDesc) {
        this.sceneCodeDesc = sceneCodeDesc == null ? null : sceneCodeDesc.trim();
    }

    public Integer getBillDetailCount() {
        return billDetailCount;
    }

    public void setBillDetailCount(Integer billDetailCount) {
        this.billDetailCount = billDetailCount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Timestamp getDatachangeLasttime() {
        return datachangeLasttime;
    }

    public void setDatachangeLasttime(Timestamp datachangeLasttime) {
        this.datachangeLasttime = datachangeLasttime;
    }
}