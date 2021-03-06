package com.everyouthtech.oa.secret.orm.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * t_secret_personnel_family_member
 */
//涉密人员家庭关系
public class SecretPersonnelFamilyMember implements Serializable {
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
     * 与本人关系
     */
    //@swagger//@ApiModelProperty(value = "与本人关系;长度为20", required=true)
    private String relationship;

    /**
     * 姓名
     */
    //@swagger//@ApiModelProperty(value = "姓名;长度为20", required=true)
    private String name;

    /**
     * 国籍（字典表）
     */
    //@swagger//@ApiModelProperty(value = "国籍（字典表）;长度为19", required=false)
    private Long nationality;

    /**
     * 性别1男性；2女性；3其他
     */
    //@swagger//@ApiModelProperty(value = "性别1男性；2女性；3其他;长度为10", required=false)
    private Integer sex;

    /**
     * 出生日期
     */
    //@swagger//@ApiModelProperty(value = "出生日期;长度为19", required=false)
    private Date birthday;

    /**
     * 政治面貌1其它；2群众；3共青团员；4党员
     */
    //@swagger//@ApiModelProperty(value = "政治面貌1其它；2群众；3共青团员；4党员;长度为10", required=false)
    private Integer politicalStatus;

    /**
     * 现住址(XX区XX小区XX门牌号)
     */
    //@swagger//@ApiModelProperty(value = "现住址(XX区XX小区XX门牌号);长度为255", required=false)
    private String currentAddress;

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

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship == null ? null : relationship.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getNationality() {
        return nationality;
    }

    public void setNationality(Long nationality) {
        this.nationality = nationality;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(Integer politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress == null ? null : currentAddress.trim();
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
        sb.append(", relationship=").append(relationship);
        sb.append(", name=").append(name);
        sb.append(", nationality=").append(nationality);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", politicalStatus=").append(politicalStatus);
        sb.append(", currentAddress=").append(currentAddress);
        sb.append(", remarks=").append(remarks);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}