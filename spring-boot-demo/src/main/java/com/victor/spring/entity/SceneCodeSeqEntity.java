package com.victor.spring.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class SceneCodeSeqEntity implements Serializable{
    private String id;

    private String sceneCodeId;

    private Integer transSeq;

    private Integer atomTransType;

    private String subAccConfigIds;

    private Integer procType;

    private String extendInfo;

    private String remark;

    private Timestamp createdAt;

    private Timestamp updatedAt;

    private Timestamp datachangeLasttime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSceneCodeId() {
        return sceneCodeId;
    }

    public void setSceneCodeId(String sceneCodeId) {
        this.sceneCodeId = sceneCodeId == null ? null : sceneCodeId.trim();
    }

    public Integer getTransSeq() {
        return transSeq;
    }

    public void setTransSeq(Integer transSeq) {
        this.transSeq = transSeq;
    }

    public Integer getAtomTransType() {
        return atomTransType;
    }

    public void setAtomTransType(Integer atomTransType) {
        this.atomTransType = atomTransType;
    }

    public String getSubAccConfigIds() {
        return subAccConfigIds;
    }

    public void setSubAccConfigIds(String subAccConfigIds) {
        this.subAccConfigIds = subAccConfigIds == null ? null : subAccConfigIds.trim();
    }

    public Integer getProcType() {
        return procType;
    }

    public void setProcType(Integer procType) {
        this.procType = procType;
    }

    public String getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(String extendInfo) {
        this.extendInfo = extendInfo == null ? null : extendInfo.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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