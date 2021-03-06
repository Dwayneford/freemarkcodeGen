package com.everyouthtech.oa.secret.orm.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * t_secret_personnel_study_or_work_record
 */
//个人学习工作经历
public class SecretPersonnelStudyOrWorkRecord implements Serializable {
    /**
     * id
     */
    //@swagger//@ApiModelProperty(value = "id;长度为19", required=true)
    private Long id;

    /**
     * 涉密人员id
     */
    //@swagger//@ApiModelProperty(value = "涉密人员id;长度为19", required=true)
    private Long secretPersonnelId;

    /**
     * 单位名称
     */
    //@swagger//@ApiModelProperty(value = "单位名称;长度为50", required=true)
    private String institutionName;

    /**
     * 起始时间
     */
    //@swagger//@ApiModelProperty(value = "起始时间;长度为19", required=false)
    private Date startTime;

    /**
     * 结束时间
     */
    //@swagger//@ApiModelProperty(value = "结束时间;长度为19", required=false)
    private Date endTime;

    /**
     * 主要学习经历、工作单位及任职情况
     */
    //@swagger//@ApiModelProperty(value = "主要学习经历、工作单位及任职情况;长度为255", required=true)
    private String content;

    /**
     * 证明
     */
    //@swagger//@ApiModelProperty(value = "证明;长度为50", required=false)
    private String prove;

    /**
     * 任职及承担的岗位
     */
    //@swagger//@ApiModelProperty(value = "任职及承担的岗位;长度为50", required=false)
    private String position;

    /**
     * 1公开2秘密3机密4绝密
     */
    //@swagger//@ApiModelProperty(value = "1公开2秘密3机密4绝密;长度为10", required=false)
    private Integer positionClassifiedGrades;

    /**
     * 备注
     */
    //@swagger//@ApiModelProperty(value = "备注;长度为255", required=false)
    private String remarks;

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

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName == null ? null : institutionName.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getProve() {
        return prove;
    }

    public void setProve(String prove) {
        this.prove = prove == null ? null : prove.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Integer getPositionClassifiedGrades() {
        return positionClassifiedGrades;
    }

    public void setPositionClassifiedGrades(Integer positionClassifiedGrades) {
        this.positionClassifiedGrades = positionClassifiedGrades;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
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
        sb.append(", institutionName=").append(institutionName);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", content=").append(content);
        sb.append(", prove=").append(prove);
        sb.append(", position=").append(position);
        sb.append(", positionClassifiedGrades=").append(positionClassifiedGrades);
        sb.append(", remarks=").append(remarks);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}