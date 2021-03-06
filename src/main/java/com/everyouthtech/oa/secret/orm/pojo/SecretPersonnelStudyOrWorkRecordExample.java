package com.everyouthtech.oa.secret.orm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SecretPersonnelStudyOrWorkRecordExample {
    /**
    
     */
    protected String orderByClause;

    /**
    
     */
    protected boolean distinct;

    /**
    
     */
    protected List<Criteria> oredCriteria;

    public SecretPersonnelStudyOrWorkRecordExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class corresponds to the database table t_secret_personnel_study_or_work_record
     *
     * @mbg.generated Fri Mar 05 15:46:26 CST 2021
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSecretPersonnelIdIsNull() {
            addCriterion("secret_personnel_id is null");
            return (Criteria) this;
        }

        public Criteria andSecretPersonnelIdIsNotNull() {
            addCriterion("secret_personnel_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecretPersonnelIdEqualTo(Long value) {
            addCriterion("secret_personnel_id =", value, "secretPersonnelId");
            return (Criteria) this;
        }

        public Criteria andSecretPersonnelIdNotEqualTo(Long value) {
            addCriterion("secret_personnel_id <>", value, "secretPersonnelId");
            return (Criteria) this;
        }

        public Criteria andSecretPersonnelIdGreaterThan(Long value) {
            addCriterion("secret_personnel_id >", value, "secretPersonnelId");
            return (Criteria) this;
        }

        public Criteria andSecretPersonnelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("secret_personnel_id >=", value, "secretPersonnelId");
            return (Criteria) this;
        }

        public Criteria andSecretPersonnelIdLessThan(Long value) {
            addCriterion("secret_personnel_id <", value, "secretPersonnelId");
            return (Criteria) this;
        }

        public Criteria andSecretPersonnelIdLessThanOrEqualTo(Long value) {
            addCriterion("secret_personnel_id <=", value, "secretPersonnelId");
            return (Criteria) this;
        }

        public Criteria andSecretPersonnelIdIn(List<Long> values) {
            addCriterion("secret_personnel_id in", values, "secretPersonnelId");
            return (Criteria) this;
        }

        public Criteria andSecretPersonnelIdNotIn(List<Long> values) {
            addCriterion("secret_personnel_id not in", values, "secretPersonnelId");
            return (Criteria) this;
        }

        public Criteria andSecretPersonnelIdBetween(Long value1, Long value2) {
            addCriterion("secret_personnel_id between", value1, value2, "secretPersonnelId");
            return (Criteria) this;
        }

        public Criteria andSecretPersonnelIdNotBetween(Long value1, Long value2) {
            addCriterion("secret_personnel_id not between", value1, value2, "secretPersonnelId");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameIsNull() {
            addCriterion("institution_name is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameIsNotNull() {
            addCriterion("institution_name is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameEqualTo(String value) {
            addCriterion("institution_name =", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameNotEqualTo(String value) {
            addCriterion("institution_name <>", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameGreaterThan(String value) {
            addCriterion("institution_name >", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameGreaterThanOrEqualTo(String value) {
            addCriterion("institution_name >=", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameLessThan(String value) {
            addCriterion("institution_name <", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameLessThanOrEqualTo(String value) {
            addCriterion("institution_name <=", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameLike(String value) {
            addCriterion("institution_name like", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameNotLike(String value) {
            addCriterion("institution_name not like", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameIn(List<String> values) {
            addCriterion("institution_name in", values, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameNotIn(List<String> values) {
            addCriterion("institution_name not in", values, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameBetween(String value1, String value2) {
            addCriterion("institution_name between", value1, value2, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameNotBetween(String value1, String value2) {
            addCriterion("institution_name not between", value1, value2, "institutionName");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andProveIsNull() {
            addCriterion("prove is null");
            return (Criteria) this;
        }

        public Criteria andProveIsNotNull() {
            addCriterion("prove is not null");
            return (Criteria) this;
        }

        public Criteria andProveEqualTo(String value) {
            addCriterion("prove =", value, "prove");
            return (Criteria) this;
        }

        public Criteria andProveNotEqualTo(String value) {
            addCriterion("prove <>", value, "prove");
            return (Criteria) this;
        }

        public Criteria andProveGreaterThan(String value) {
            addCriterion("prove >", value, "prove");
            return (Criteria) this;
        }

        public Criteria andProveGreaterThanOrEqualTo(String value) {
            addCriterion("prove >=", value, "prove");
            return (Criteria) this;
        }

        public Criteria andProveLessThan(String value) {
            addCriterion("prove <", value, "prove");
            return (Criteria) this;
        }

        public Criteria andProveLessThanOrEqualTo(String value) {
            addCriterion("prove <=", value, "prove");
            return (Criteria) this;
        }

        public Criteria andProveLike(String value) {
            addCriterion("prove like", value, "prove");
            return (Criteria) this;
        }

        public Criteria andProveNotLike(String value) {
            addCriterion("prove not like", value, "prove");
            return (Criteria) this;
        }

        public Criteria andProveIn(List<String> values) {
            addCriterion("prove in", values, "prove");
            return (Criteria) this;
        }

        public Criteria andProveNotIn(List<String> values) {
            addCriterion("prove not in", values, "prove");
            return (Criteria) this;
        }

        public Criteria andProveBetween(String value1, String value2) {
            addCriterion("prove between", value1, value2, "prove");
            return (Criteria) this;
        }

        public Criteria andProveNotBetween(String value1, String value2) {
            addCriterion("prove not between", value1, value2, "prove");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionClassifiedGradesIsNull() {
            addCriterion("position_classified_grades is null");
            return (Criteria) this;
        }

        public Criteria andPositionClassifiedGradesIsNotNull() {
            addCriterion("position_classified_grades is not null");
            return (Criteria) this;
        }

        public Criteria andPositionClassifiedGradesEqualTo(Integer value) {
            addCriterion("position_classified_grades =", value, "positionClassifiedGrades");
            return (Criteria) this;
        }

        public Criteria andPositionClassifiedGradesNotEqualTo(Integer value) {
            addCriterion("position_classified_grades <>", value, "positionClassifiedGrades");
            return (Criteria) this;
        }

        public Criteria andPositionClassifiedGradesGreaterThan(Integer value) {
            addCriterion("position_classified_grades >", value, "positionClassifiedGrades");
            return (Criteria) this;
        }

        public Criteria andPositionClassifiedGradesGreaterThanOrEqualTo(Integer value) {
            addCriterion("position_classified_grades >=", value, "positionClassifiedGrades");
            return (Criteria) this;
        }

        public Criteria andPositionClassifiedGradesLessThan(Integer value) {
            addCriterion("position_classified_grades <", value, "positionClassifiedGrades");
            return (Criteria) this;
        }

        public Criteria andPositionClassifiedGradesLessThanOrEqualTo(Integer value) {
            addCriterion("position_classified_grades <=", value, "positionClassifiedGrades");
            return (Criteria) this;
        }

        public Criteria andPositionClassifiedGradesIn(List<Integer> values) {
            addCriterion("position_classified_grades in", values, "positionClassifiedGrades");
            return (Criteria) this;
        }

        public Criteria andPositionClassifiedGradesNotIn(List<Integer> values) {
            addCriterion("position_classified_grades not in", values, "positionClassifiedGrades");
            return (Criteria) this;
        }

        public Criteria andPositionClassifiedGradesBetween(Integer value1, Integer value2) {
            addCriterion("position_classified_grades between", value1, value2, "positionClassifiedGrades");
            return (Criteria) this;
        }

        public Criteria andPositionClassifiedGradesNotBetween(Integer value1, Integer value2) {
            addCriterion("position_classified_grades not between", value1, value2, "positionClassifiedGrades");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(Long value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(Long value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(Long value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Long value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(Long value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Long value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<Long> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<Long> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(Long value1, Long value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(Long value1, Long value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
    t_secret_personnel_study_or_work_record
     *
     * @mbg.generated do_not_delete_during_merge Fri Mar 05 15:46:26 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class corresponds to the database table t_secret_personnel_study_or_work_record
     *
     * @mbg.generated Fri Mar 05 15:46:26 CST 2021
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}