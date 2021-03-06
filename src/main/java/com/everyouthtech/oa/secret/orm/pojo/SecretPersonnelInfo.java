package com.everyouthtech.oa.secret.orm.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * t_secret_personnel_info
 */
//涉密人员台账表
public class SecretPersonnelInfo implements Serializable {
    /**
     * 涉密人员id
     */
    //@swagger//@ApiModelProperty(value = "涉密人员id;长度为19", required=true)
    private Long id;

    /**
     * 姓名
     */
    //@swagger//@ApiModelProperty(value = "姓名;长度为20", required=true)
    private String name;

    /**
     * 性别
     */
    //@swagger//@ApiModelProperty(value = "性别;长度为10", required=true)
    private Integer sex;

    /**
     * 民族（字典表）
     */
    //@swagger//@ApiModelProperty(value = "民族（字典表）;长度为19", required=true)
    private Long nation;

    /**
     * 曾用名
     */
    //@swagger//@ApiModelProperty(value = "曾用名;长度为20", required=false)
    private String formerName;

    /**
     * 出生日期
     */
    //@swagger//@ApiModelProperty(value = "出生日期;长度为19", required=true)
    private Date birthday;

    /**
     * 头像保存位置
     */
    //@swagger//@ApiModelProperty(value = "头像保存位置;长度为255", required=false)
    private String image;

    /**
     * 婚姻状况：1未婚；2已婚；3离异；4丧偶
     */
    //@swagger//@ApiModelProperty(value = "婚姻状况：1未婚；2已婚；3离异；4丧偶;长度为10", required=true)
    private Integer maritalStatus;

    /**
     * 出生地
     */
    //@swagger//@ApiModelProperty(value = "出生地;长度为60", required=true)
    private String birthplace;

    /**
     * 籍贯
     */
    //@swagger//@ApiModelProperty(value = "籍贯;长度为60", required=true)
    private String hometown;

    /**
     * 国籍（字典表）
     */
    //@swagger//@ApiModelProperty(value = "国籍（字典表）;长度为19", required=true)
    private Long nationality;

    /**
     * 身份证号码
     */
    //@swagger//@ApiModelProperty(value = "身份证号码;长度为18", required=true)
    private String identityNumber;

    /**
     * 政治面貌1其它；2群众；3共青团员；4党员
     */
    //@swagger//@ApiModelProperty(value = "政治面貌1其它；2群众；3共青团员；4党员;长度为10", required=true)
    private Integer politicalStatus;

    /**
     * 入党（团）时间
     */
    //@swagger//@ApiModelProperty(value = "入党（团）时间;长度为19", required=false)
    private Date joinPoliticalTime;

    /**
     * 文化程度
     */
    //@swagger//@ApiModelProperty(value = "文化程度;长度为15", required=false)
    private String educationLevel;

    /**
     * 学历：1小学；2初中；3高中；4中专；5大专；6本科；7研究生
     */
    //@swagger//@ApiModelProperty(value = "学历：1小学；2初中；3高中；4中专；5大专；6本科；7研究生;长度为10", required=false)
    private Integer education;

    /**
     * 学位：1学士；2硕士；3博士
     */
    //@swagger//@ApiModelProperty(value = "学位：1学士；2硕士；3博士;长度为10", required=false)
    private Integer academicDegree;

    /**
     * 毕业学校
     */
    //@swagger//@ApiModelProperty(value = "毕业学校;长度为30", required=false)
    private String graduatedSchool;

    /**
     * 专业
     */
    //@swagger//@ApiModelProperty(value = "专业;长度为30", required=false)
    private String major;

    /**
     * 工龄
     */
    //@swagger//@ApiModelProperty(value = "工龄;长度为10", required=false)
    private Integer workingYears;

    /**
     * 掌握语言
     */
    //@swagger//@ApiModelProperty(value = "掌握语言;长度为255", required=false)
    private String language;

    /**
     * 语言熟悉程度
     */
    //@swagger//@ApiModelProperty(value = "语言熟悉程度;长度为255", required=false)
    private String languageFamiliarity;

    /**
     * 户籍所在地(XX市XX区)
     */
    //@swagger//@ApiModelProperty(value = "户籍所在地(XX市XX区);长度为255", required=true)
    private String registeredResidence;

    /**
     * 户籍派出所(XX市XX区XX派出所)
     */
    //@swagger//@ApiModelProperty(value = "户籍派出所(XX市XX区XX派出所);长度为255", required=true)
    private String registeredResidencePoliceStation;

    /**
     * 现住址(XX区XX小区XX门牌号)
     */
    //@swagger//@ApiModelProperty(value = "现住址(XX区XX小区XX门牌号);长度为255", required=true)
    private String currentAddress;

    /**
     * 办公地点(XX市XX区)
     */
    //@swagger//@ApiModelProperty(value = "办公地点(XX市XX区);长度为255", required=false)
    private String officeLocation;

    /**
     * 联系电话
     */
    //@swagger//@ApiModelProperty(value = "联系电话;长度为10", required=false)
    private Integer contactNumber;

    /**
     * 手机号码
     */
    //@swagger//@ApiModelProperty(value = "手机号码;长度为10", required=false)
    private Integer phoneNumber;

    /**
     * 行政职务
     */
    //@swagger//@ApiModelProperty(value = "行政职务;长度为50", required=false)
    private String administrativePosition;

    /**
     * 技术职务
     */
    //@swagger//@ApiModelProperty(value = "技术职务;长度为50", required=false)
    private String technicalPosition;

    /**
     * 部门id
     */
    //@swagger//@ApiModelProperty(value = "部门id;长度为19", required=false)
    private Long departmentId;

    /**
     * 涉密岗位id
     */
    //@swagger//@ApiModelProperty(value = "涉密岗位id;长度为19", required=false)
    private Long secretPosition;

    /**
     * 涉密等级1公开2秘密3机密4绝密
     */
    //@swagger//@ApiModelProperty(value = "涉密等级1公开2秘密3机密4绝密;长度为10", required=false)
    private Integer classifiedGrades;

    /**
     * 聘用类型1本部合同工2劳务外包工3返聘4借调5实习
     */
    //@swagger//@ApiModelProperty(value = "聘用类型1本部合同工2劳务外包工3返聘4借调5实习;长度为10", required=false)
    private Integer employmentType;

    /**
     * 人员类别1技术2行政3管理4生产5辅助6离岗人员7退休人员
     */
    //@swagger//@ApiModelProperty(value = "人员类别1技术2行政3管理4生产5辅助6离岗人员7退休人员;长度为10", required=false)
    private Integer personnelCategory;

    /**
     * 进入本单位时间
     */
    //@swagger//@ApiModelProperty(value = "进入本单位时间;长度为19", required=false)
    private Date joinTime;

    /**
     * 进入涉密岗位时间
     */
    //@swagger//@ApiModelProperty(value = "进入涉密岗位时间;长度为19", required=false)
    private Date joinSecretPositionTime;

    /**
     * 员工卡号
     */
    //@swagger//@ApiModelProperty(value = "员工卡号;长度为30", required=false)
    private String employeeCardNumber;

    /**
     * 保密补贴
     */
    //@swagger//@ApiModelProperty(value = "保密补贴;长度为15", required=false)
    private Double confidentialityAllowance;

    /**
     * 人员状态1在岗在职2离岗离职3离岗退休
     */
    //@swagger//@ApiModelProperty(value = "人员状态1在岗在职2离岗离职3离岗退休;长度为10", required=false)
    private Integer personnelStatus;

    /**
     * 离岗时间
     */
    //@swagger//@ApiModelProperty(value = "离岗时间;长度为19", required=false)
    private Date leaveTime;

    /**
     * 脱密期
     */
    //@swagger//@ApiModelProperty(value = "脱密期;长度为19", required=false)
    private Date declassificationTime;

    /**
     * 不良嗜好（赌博酗酒吸毒等）
     */
    //@swagger//@ApiModelProperty(value = "不良嗜好（赌博酗酒吸毒等）;长度为255", required=false)
    private String badHabits;

    /**
     * 其他需要说明的情况
     */
    //@swagger//@ApiModelProperty(value = "其他需要说明的情况;长度为255", required=false)
    private String otherSituations;

    /**
     * 本人是否承诺
     */
    //@swagger//@ApiModelProperty(value = "本人是否承诺;长度为3", required=false)
    private Byte promise;

    /**
     * 承诺时间
     */
    //@swagger//@ApiModelProperty(value = "承诺时间;长度为19", required=false)
    private Date promiseTime;

    /**
     * 承诺书保存位置
     */
    //@swagger//@ApiModelProperty(value = "承诺书保存位置;长度为255", required=false)
    private String promiseFileLocation;

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
     * 更新时间
     */
    //@swagger//@ApiModelProperty(value = "更新时间;长度为19", required=false)
    private Date updateTime;

    /**
     * 更新人
     */
    //@swagger//@ApiModelProperty(value = "更新人;长度为19", required=false)
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Long getNation() {
        return nation;
    }

    public void setNation(Long nation) {
        this.nation = nation;
    }

    public String getFormerName() {
        return formerName;
    }

    public void setFormerName(String formerName) {
        this.formerName = formerName == null ? null : formerName.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Integer getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Integer maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace == null ? null : birthplace.trim();
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown == null ? null : hometown.trim();
    }

    public Long getNationality() {
        return nationality;
    }

    public void setNationality(Long nationality) {
        this.nationality = nationality;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber == null ? null : identityNumber.trim();
    }

    public Integer getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(Integer politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    public Date getJoinPoliticalTime() {
        return joinPoliticalTime;
    }

    public void setJoinPoliticalTime(Date joinPoliticalTime) {
        this.joinPoliticalTime = joinPoliticalTime;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel == null ? null : educationLevel.trim();
    }

    public Integer getEducation() {
        return education;
    }

    public void setEducation(Integer education) {
        this.education = education;
    }

    public Integer getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(Integer academicDegree) {
        this.academicDegree = academicDegree;
    }

    public String getGraduatedSchool() {
        return graduatedSchool;
    }

    public void setGraduatedSchool(String graduatedSchool) {
        this.graduatedSchool = graduatedSchool == null ? null : graduatedSchool.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public Integer getWorkingYears() {
        return workingYears;
    }

    public void setWorkingYears(Integer workingYears) {
        this.workingYears = workingYears;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getLanguageFamiliarity() {
        return languageFamiliarity;
    }

    public void setLanguageFamiliarity(String languageFamiliarity) {
        this.languageFamiliarity = languageFamiliarity == null ? null : languageFamiliarity.trim();
    }

    public String getRegisteredResidence() {
        return registeredResidence;
    }

    public void setRegisteredResidence(String registeredResidence) {
        this.registeredResidence = registeredResidence == null ? null : registeredResidence.trim();
    }

    public String getRegisteredResidencePoliceStation() {
        return registeredResidencePoliceStation;
    }

    public void setRegisteredResidencePoliceStation(String registeredResidencePoliceStation) {
        this.registeredResidencePoliceStation = registeredResidencePoliceStation == null ? null : registeredResidencePoliceStation.trim();
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress == null ? null : currentAddress.trim();
    }

    public String getOfficeLocation() {
        return officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation == null ? null : officeLocation.trim();
    }

    public Integer getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Integer contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdministrativePosition() {
        return administrativePosition;
    }

    public void setAdministrativePosition(String administrativePosition) {
        this.administrativePosition = administrativePosition == null ? null : administrativePosition.trim();
    }

    public String getTechnicalPosition() {
        return technicalPosition;
    }

    public void setTechnicalPosition(String technicalPosition) {
        this.technicalPosition = technicalPosition == null ? null : technicalPosition.trim();
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Long getSecretPosition() {
        return secretPosition;
    }

    public void setSecretPosition(Long secretPosition) {
        this.secretPosition = secretPosition;
    }

    public Integer getClassifiedGrades() {
        return classifiedGrades;
    }

    public void setClassifiedGrades(Integer classifiedGrades) {
        this.classifiedGrades = classifiedGrades;
    }

    public Integer getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(Integer employmentType) {
        this.employmentType = employmentType;
    }

    public Integer getPersonnelCategory() {
        return personnelCategory;
    }

    public void setPersonnelCategory(Integer personnelCategory) {
        this.personnelCategory = personnelCategory;
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public Date getJoinSecretPositionTime() {
        return joinSecretPositionTime;
    }

    public void setJoinSecretPositionTime(Date joinSecretPositionTime) {
        this.joinSecretPositionTime = joinSecretPositionTime;
    }

    public String getEmployeeCardNumber() {
        return employeeCardNumber;
    }

    public void setEmployeeCardNumber(String employeeCardNumber) {
        this.employeeCardNumber = employeeCardNumber == null ? null : employeeCardNumber.trim();
    }

    public Double getConfidentialityAllowance() {
        return confidentialityAllowance;
    }

    public void setConfidentialityAllowance(Double confidentialityAllowance) {
        this.confidentialityAllowance = confidentialityAllowance;
    }

    public Integer getPersonnelStatus() {
        return personnelStatus;
    }

    public void setPersonnelStatus(Integer personnelStatus) {
        this.personnelStatus = personnelStatus;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public Date getDeclassificationTime() {
        return declassificationTime;
    }

    public void setDeclassificationTime(Date declassificationTime) {
        this.declassificationTime = declassificationTime;
    }

    public String getBadHabits() {
        return badHabits;
    }

    public void setBadHabits(String badHabits) {
        this.badHabits = badHabits == null ? null : badHabits.trim();
    }

    public String getOtherSituations() {
        return otherSituations;
    }

    public void setOtherSituations(String otherSituations) {
        this.otherSituations = otherSituations == null ? null : otherSituations.trim();
    }

    public Byte getPromise() {
        return promise;
    }

    public void setPromise(Byte promise) {
        this.promise = promise;
    }

    public Date getPromiseTime() {
        return promiseTime;
    }

    public void setPromiseTime(Date promiseTime) {
        this.promiseTime = promiseTime;
    }

    public String getPromiseFileLocation() {
        return promiseFileLocation;
    }

    public void setPromiseFileLocation(String promiseFileLocation) {
        this.promiseFileLocation = promiseFileLocation == null ? null : promiseFileLocation.trim();
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
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", nation=").append(nation);
        sb.append(", formerName=").append(formerName);
        sb.append(", birthday=").append(birthday);
        sb.append(", image=").append(image);
        sb.append(", maritalStatus=").append(maritalStatus);
        sb.append(", birthplace=").append(birthplace);
        sb.append(", hometown=").append(hometown);
        sb.append(", nationality=").append(nationality);
        sb.append(", identityNumber=").append(identityNumber);
        sb.append(", politicalStatus=").append(politicalStatus);
        sb.append(", joinPoliticalTime=").append(joinPoliticalTime);
        sb.append(", educationLevel=").append(educationLevel);
        sb.append(", education=").append(education);
        sb.append(", academicDegree=").append(academicDegree);
        sb.append(", graduatedSchool=").append(graduatedSchool);
        sb.append(", major=").append(major);
        sb.append(", workingYears=").append(workingYears);
        sb.append(", language=").append(language);
        sb.append(", languageFamiliarity=").append(languageFamiliarity);
        sb.append(", registeredResidence=").append(registeredResidence);
        sb.append(", registeredResidencePoliceStation=").append(registeredResidencePoliceStation);
        sb.append(", currentAddress=").append(currentAddress);
        sb.append(", officeLocation=").append(officeLocation);
        sb.append(", contactNumber=").append(contactNumber);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", administrativePosition=").append(administrativePosition);
        sb.append(", technicalPosition=").append(technicalPosition);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", secretPosition=").append(secretPosition);
        sb.append(", classifiedGrades=").append(classifiedGrades);
        sb.append(", employmentType=").append(employmentType);
        sb.append(", personnelCategory=").append(personnelCategory);
        sb.append(", joinTime=").append(joinTime);
        sb.append(", joinSecretPositionTime=").append(joinSecretPositionTime);
        sb.append(", employeeCardNumber=").append(employeeCardNumber);
        sb.append(", confidentialityAllowance=").append(confidentialityAllowance);
        sb.append(", personnelStatus=").append(personnelStatus);
        sb.append(", leaveTime=").append(leaveTime);
        sb.append(", declassificationTime=").append(declassificationTime);
        sb.append(", badHabits=").append(badHabits);
        sb.append(", otherSituations=").append(otherSituations);
        sb.append(", promise=").append(promise);
        sb.append(", promiseTime=").append(promiseTime);
        sb.append(", promiseFileLocation=").append(promiseFileLocation);
        sb.append(", remarks=").append(remarks);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}