package com.everyouthtech.oa.secret.orm.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * t_regulation
 */
//规章制度
public class Regulation implements Serializable {
    /**
     * 章程id
     */
    //@swagger//@ApiModelProperty(value = "章程id;长度为19", required=true)
    private Long id;

    /**
     * 所属菜单id
     */
    //@swagger//@ApiModelProperty(value = "所属菜单id;长度为19", required=true)
    private Long menuId;

    /**
     * 1文件，2文件夹
     */
    //@swagger//@ApiModelProperty(value = "1文件，2文件夹;长度为10", required=true)
    private Integer fileType;

    /**
     * 所属文件夹id
     */
    //@swagger//@ApiModelProperty(value = "所属文件夹id;长度为19", required=false)
    private Long parentId;

    /**
     * 文件名
     */
    //@swagger//@ApiModelProperty(value = "文件名;长度为50", required=true)
    private String fileName;

    /**
     * 文件密级1公开2秘密3机密4绝密
     */
    //@swagger//@ApiModelProperty(value = "文件密级1公开2秘密3机密4绝密;长度为10", required=true)
    private Integer fileClassifiedGrades;

    /**
     * 文件摘要
     */
    //@swagger//@ApiModelProperty(value = "文件摘要;长度为255", required=false)
    private String fileSummary;

    /**
     * 文件存放位置
     */
    //@swagger//@ApiModelProperty(value = "文件存放位置;长度为255", required=false)
    private String fileLocation;

    /**
     * 创建时间
     */
    //@swagger//@ApiModelProperty(value = "创建时间;长度为19", required=true)
    private Date createdTime;

    /**
     * 创建人
     */
    //@swagger//@ApiModelProperty(value = "创建人;长度为19", required=true)
    private Long createdBy;

    /**
     * 上传人
     */
    //@swagger//@ApiModelProperty(value = "上传人;长度为20", required=true)
    private String uploadBy;

    /**
     * 更新时间
     */
    //@swagger//@ApiModelProperty(value = "更新时间;长度为19", required=false)
    private Date updateTime;

    /**
     * 更新人id
     */
    //@swagger//@ApiModelProperty(value = "更新人id;长度为19", required=false)
    private Long updateBy;

    /**
    
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Integer getFileType() {
        return fileType;
    }

    public void setFileType(Integer fileType) {
        this.fileType = fileType;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Integer getFileClassifiedGrades() {
        return fileClassifiedGrades;
    }

    public void setFileClassifiedGrades(Integer fileClassifiedGrades) {
        this.fileClassifiedGrades = fileClassifiedGrades;
    }

    public String getFileSummary() {
        return fileSummary;
    }

    public void setFileSummary(String fileSummary) {
        this.fileSummary = fileSummary == null ? null : fileSummary.trim();
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation == null ? null : fileLocation.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public String getUploadBy() {
        return uploadBy;
    }

    public void setUploadBy(String uploadBy) {
        this.uploadBy = uploadBy == null ? null : uploadBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", menuId=").append(menuId);
        sb.append(", fileType=").append(fileType);
        sb.append(", parentId=").append(parentId);
        sb.append(", fileName=").append(fileName);
        sb.append(", fileClassifiedGrades=").append(fileClassifiedGrades);
        sb.append(", fileSummary=").append(fileSummary);
        sb.append(", fileLocation=").append(fileLocation);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", uploadBy=").append(uploadBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}