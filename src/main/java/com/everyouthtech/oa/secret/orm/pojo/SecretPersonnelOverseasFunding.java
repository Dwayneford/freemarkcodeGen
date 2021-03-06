package com.everyouthtech.oa.secret.orm.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * t_secret_personnel_overseas_funding
 */
//涉密人员接受境外资助情况
public class SecretPersonnelOverseasFunding implements Serializable {
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
     * 接受时间
     */
    //@swagger//@ApiModelProperty(value = "接受时间;长度为19", required=false)
    private Date acceptanceTime;

    /**
     * 国家地区
     */
    //@swagger//@ApiModelProperty(value = "国家地区;长度为50", required=false)
    private String country;

    /**
     * 处理机构
     */
    //@swagger//@ApiModelProperty(value = "处理机构;长度为60", required=false)
    private String agency;

    /**
     * 资助内容
     */
    //@swagger//@ApiModelProperty(value = "资助内容;长度为255", required=true)
    private String fundingContent;

    /**
     * 资助金额
     */
    //@swagger//@ApiModelProperty(value = "资助金额;长度为50", required=false)
    private Double amount;

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

    public Date getAcceptanceTime() {
        return acceptanceTime;
    }

    public void setAcceptanceTime(Date acceptanceTime) {
        this.acceptanceTime = acceptanceTime;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency == null ? null : agency.trim();
    }

    public String getFundingContent() {
        return fundingContent;
    }

    public void setFundingContent(String fundingContent) {
        this.fundingContent = fundingContent == null ? null : fundingContent.trim();
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
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
        sb.append(", acceptanceTime=").append(acceptanceTime);
        sb.append(", country=").append(country);
        sb.append(", agency=").append(agency);
        sb.append(", fundingContent=").append(fundingContent);
        sb.append(", amount=").append(amount);
        sb.append(", remarks=").append(remarks);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}