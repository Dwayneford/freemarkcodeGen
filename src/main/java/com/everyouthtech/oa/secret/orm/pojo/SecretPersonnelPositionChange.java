package com.everyouthtech.oa.secret.orm.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * t_secret_personnel_position_change
 */
//涉密人员岗位变动情况
public class SecretPersonnelPositionChange implements Serializable {
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
     * 岗位名称
     */
    //@swagger//@ApiModelProperty(value = "岗位名称;长度为50", required=true)
    private String positionName;

    /**
     * 在岗起始时间
     */
    //@swagger//@ApiModelProperty(value = "在岗起始时间;长度为19", required=false)
    private Date startTime;

    /**
     * 在岗结束时间
     */
    //@swagger//@ApiModelProperty(value = "在岗结束时间;长度为19", required=false)
    private Date endTime;

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

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName == null ? null : positionName.trim();
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
        sb.append(", positionName=").append(positionName);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}