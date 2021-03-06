package com.everyouthtech.oa.secret.orm.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * t_secret_personnel_crime
 */
//涉密人员违法犯罪情况
public class SecretPersonnelCrime implements Serializable {
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
     * 违法犯罪时间
     */
    //@swagger//@ApiModelProperty(value = "违法犯罪时间;长度为19", required=false)
    private Date crimeTime;

    /**
     * 处理结果
     */
    //@swagger//@ApiModelProperty(value = "处理结果;长度为255", required=true)
    private String processResult;

    /**
     * 处理机构
     */
    //@swagger//@ApiModelProperty(value = "处理机构;长度为50", required=true)
    private String processingAgency;

    /**
     * 处理说明
     */
    //@swagger//@ApiModelProperty(value = "处理说明;长度为255", required=false)
    private String processingInstructions;

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

    public Date getCrimeTime() {
        return crimeTime;
    }

    public void setCrimeTime(Date crimeTime) {
        this.crimeTime = crimeTime;
    }

    public String getProcessResult() {
        return processResult;
    }

    public void setProcessResult(String processResult) {
        this.processResult = processResult == null ? null : processResult.trim();
    }

    public String getProcessingAgency() {
        return processingAgency;
    }

    public void setProcessingAgency(String processingAgency) {
        this.processingAgency = processingAgency == null ? null : processingAgency.trim();
    }

    public String getProcessingInstructions() {
        return processingInstructions;
    }

    public void setProcessingInstructions(String processingInstructions) {
        this.processingInstructions = processingInstructions == null ? null : processingInstructions.trim();
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
        sb.append(", crimeTime=").append(crimeTime);
        sb.append(", processResult=").append(processResult);
        sb.append(", processingAgency=").append(processingAgency);
        sb.append(", processingInstructions=").append(processingInstructions);
        sb.append(", remarks=").append(remarks);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}