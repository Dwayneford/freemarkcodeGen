package com.everyouthtech.oa.secret.orm.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * t_secret_personnel_passport
 */
//涉密人员护照通行证情况
public class SecretPersonnelPassport implements Serializable {
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
     * 护照号码
     */
    //@swagger//@ApiModelProperty(value = "护照号码;长度为25", required=false)
    private String passportNumber;

    /**
     * 护照类型1因私2因公3港澳通行证4台湾通行证
     */
    //@swagger//@ApiModelProperty(value = "护照类型1因私2因公3港澳通行证4台湾通行证;长度为10", required=false)
    private Integer passportType;

    /**
     * 证件是否有效
     */
    //@swagger//@ApiModelProperty(value = "证件是否有效;长度为3", required=false)
    private Byte valid;

    /**
     * 有效期起始时间
     */
    //@swagger//@ApiModelProperty(value = "有效期起始时间;长度为19", required=false)
    private Date validStartTime;

    /**
     * 有效期结束时间
     */
    //@swagger//@ApiModelProperty(value = "有效期结束时间;长度为19", required=false)
    private Date validEndTime;

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

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber == null ? null : passportNumber.trim();
    }

    public Integer getPassportType() {
        return passportType;
    }

    public void setPassportType(Integer passportType) {
        this.passportType = passportType;
    }

    public Byte getValid() {
        return valid;
    }

    public void setValid(Byte valid) {
        this.valid = valid;
    }

    public Date getValidStartTime() {
        return validStartTime;
    }

    public void setValidStartTime(Date validStartTime) {
        this.validStartTime = validStartTime;
    }

    public Date getValidEndTime() {
        return validEndTime;
    }

    public void setValidEndTime(Date validEndTime) {
        this.validEndTime = validEndTime;
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
        sb.append(", passportNumber=").append(passportNumber);
        sb.append(", passportType=").append(passportType);
        sb.append(", valid=").append(valid);
        sb.append(", validStartTime=").append(validStartTime);
        sb.append(", validEndTime=").append(validEndTime);
        sb.append(", remarks=").append(remarks);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}