package com.everyouthtech.oa.secret.orm.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * t_secret_personnel_related_project
 */
//本岗位主要从事国家秘密细目
public class SecretPersonnelRelatedProject implements Serializable {
    /**
     * 
     */
    //@swagger//@ApiModelProperty(value = ";长度为19", required=true)
    private Long id;

    /**
     * 涉密人员id
     */
    //@swagger//@ApiModelProperty(value = "涉密人员id;长度为19", required=false)
    private Long secretPersonnelId;

    /**
     * 涉密项目明细
     */
    //@swagger//@ApiModelProperty(value = "涉密项目明细;长度为255", required=true)
    private String projectName;

    /**
     * 涉密等级1公开2秘密3机密4绝密
     */
    //@swagger//@ApiModelProperty(value = "涉密等级1公开2秘密3机密4绝密;长度为10", required=false)
    private Integer classifiedGrades;

    /**
     * 创建时间
     */
    //@swagger//@ApiModelProperty(value = "创建时间;长度为19", required=false)
    private Date createdTime;

    /**
     * 创建人
     */
    //@swagger//@ApiModelProperty(value = "创建人;长度为19", required=false)
    private Long createdBy;

    /**
    
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSecretPersonnelId() {
        return secretPersonnelId;
    }

    public void setSecretPersonnelId(Long secretPersonnelId) {
        this.secretPersonnelId = secretPersonnelId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public Integer getClassifiedGrades() {
        return classifiedGrades;
    }

    public void setClassifiedGrades(Integer classifiedGrades) {
        this.classifiedGrades = classifiedGrades;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", secretPersonnelId=").append(secretPersonnelId);
        sb.append(", projectName=").append(projectName);
        sb.append(", classifiedGrades=").append(classifiedGrades);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}