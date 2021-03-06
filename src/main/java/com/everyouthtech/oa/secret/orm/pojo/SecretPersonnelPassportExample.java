package com.everyouthtech.oa.secret.orm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SecretPersonnelPassportExample {
    /**
    
     */
    protected String orderByClause;

    /**
    
     */
    protected boolean distinct;

    /**
    
     */
    protected List<Criteria> oredCriteria;

    public SecretPersonnelPassportExample() {
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
     * This class corresponds to the database table t_secret_personnel_passport
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

        public Criteria andPassportNumberIsNull() {
            addCriterion("passport_number is null");
            return (Criteria) this;
        }

        public Criteria andPassportNumberIsNotNull() {
            addCriterion("passport_number is not null");
            return (Criteria) this;
        }

        public Criteria andPassportNumberEqualTo(String value) {
            addCriterion("passport_number =", value, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberNotEqualTo(String value) {
            addCriterion("passport_number <>", value, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberGreaterThan(String value) {
            addCriterion("passport_number >", value, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberGreaterThanOrEqualTo(String value) {
            addCriterion("passport_number >=", value, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberLessThan(String value) {
            addCriterion("passport_number <", value, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberLessThanOrEqualTo(String value) {
            addCriterion("passport_number <=", value, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberLike(String value) {
            addCriterion("passport_number like", value, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberNotLike(String value) {
            addCriterion("passport_number not like", value, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberIn(List<String> values) {
            addCriterion("passport_number in", values, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberNotIn(List<String> values) {
            addCriterion("passport_number not in", values, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberBetween(String value1, String value2) {
            addCriterion("passport_number between", value1, value2, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportNumberNotBetween(String value1, String value2) {
            addCriterion("passport_number not between", value1, value2, "passportNumber");
            return (Criteria) this;
        }

        public Criteria andPassportTypeIsNull() {
            addCriterion("passport_type is null");
            return (Criteria) this;
        }

        public Criteria andPassportTypeIsNotNull() {
            addCriterion("passport_type is not null");
            return (Criteria) this;
        }

        public Criteria andPassportTypeEqualTo(Integer value) {
            addCriterion("passport_type =", value, "passportType");
            return (Criteria) this;
        }

        public Criteria andPassportTypeNotEqualTo(Integer value) {
            addCriterion("passport_type <>", value, "passportType");
            return (Criteria) this;
        }

        public Criteria andPassportTypeGreaterThan(Integer value) {
            addCriterion("passport_type >", value, "passportType");
            return (Criteria) this;
        }

        public Criteria andPassportTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("passport_type >=", value, "passportType");
            return (Criteria) this;
        }

        public Criteria andPassportTypeLessThan(Integer value) {
            addCriterion("passport_type <", value, "passportType");
            return (Criteria) this;
        }

        public Criteria andPassportTypeLessThanOrEqualTo(Integer value) {
            addCriterion("passport_type <=", value, "passportType");
            return (Criteria) this;
        }

        public Criteria andPassportTypeIn(List<Integer> values) {
            addCriterion("passport_type in", values, "passportType");
            return (Criteria) this;
        }

        public Criteria andPassportTypeNotIn(List<Integer> values) {
            addCriterion("passport_type not in", values, "passportType");
            return (Criteria) this;
        }

        public Criteria andPassportTypeBetween(Integer value1, Integer value2) {
            addCriterion("passport_type between", value1, value2, "passportType");
            return (Criteria) this;
        }

        public Criteria andPassportTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("passport_type not between", value1, value2, "passportType");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("valid is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("valid is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(Byte value) {
            addCriterion("valid =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(Byte value) {
            addCriterion("valid <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(Byte value) {
            addCriterion("valid >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(Byte value) {
            addCriterion("valid >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(Byte value) {
            addCriterion("valid <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(Byte value) {
            addCriterion("valid <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<Byte> values) {
            addCriterion("valid in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<Byte> values) {
            addCriterion("valid not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(Byte value1, Byte value2) {
            addCriterion("valid between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(Byte value1, Byte value2) {
            addCriterion("valid not between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidStartTimeIsNull() {
            addCriterion("valid_start_time is null");
            return (Criteria) this;
        }

        public Criteria andValidStartTimeIsNotNull() {
            addCriterion("valid_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andValidStartTimeEqualTo(Date value) {
            addCriterion("valid_start_time =", value, "validStartTime");
            return (Criteria) this;
        }

        public Criteria andValidStartTimeNotEqualTo(Date value) {
            addCriterion("valid_start_time <>", value, "validStartTime");
            return (Criteria) this;
        }

        public Criteria andValidStartTimeGreaterThan(Date value) {
            addCriterion("valid_start_time >", value, "validStartTime");
            return (Criteria) this;
        }

        public Criteria andValidStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("valid_start_time >=", value, "validStartTime");
            return (Criteria) this;
        }

        public Criteria andValidStartTimeLessThan(Date value) {
            addCriterion("valid_start_time <", value, "validStartTime");
            return (Criteria) this;
        }

        public Criteria andValidStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("valid_start_time <=", value, "validStartTime");
            return (Criteria) this;
        }

        public Criteria andValidStartTimeIn(List<Date> values) {
            addCriterion("valid_start_time in", values, "validStartTime");
            return (Criteria) this;
        }

        public Criteria andValidStartTimeNotIn(List<Date> values) {
            addCriterion("valid_start_time not in", values, "validStartTime");
            return (Criteria) this;
        }

        public Criteria andValidStartTimeBetween(Date value1, Date value2) {
            addCriterion("valid_start_time between", value1, value2, "validStartTime");
            return (Criteria) this;
        }

        public Criteria andValidStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("valid_start_time not between", value1, value2, "validStartTime");
            return (Criteria) this;
        }

        public Criteria andValidEndTimeIsNull() {
            addCriterion("valid_end_time is null");
            return (Criteria) this;
        }

        public Criteria andValidEndTimeIsNotNull() {
            addCriterion("valid_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andValidEndTimeEqualTo(Date value) {
            addCriterion("valid_end_time =", value, "validEndTime");
            return (Criteria) this;
        }

        public Criteria andValidEndTimeNotEqualTo(Date value) {
            addCriterion("valid_end_time <>", value, "validEndTime");
            return (Criteria) this;
        }

        public Criteria andValidEndTimeGreaterThan(Date value) {
            addCriterion("valid_end_time >", value, "validEndTime");
            return (Criteria) this;
        }

        public Criteria andValidEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("valid_end_time >=", value, "validEndTime");
            return (Criteria) this;
        }

        public Criteria andValidEndTimeLessThan(Date value) {
            addCriterion("valid_end_time <", value, "validEndTime");
            return (Criteria) this;
        }

        public Criteria andValidEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("valid_end_time <=", value, "validEndTime");
            return (Criteria) this;
        }

        public Criteria andValidEndTimeIn(List<Date> values) {
            addCriterion("valid_end_time in", values, "validEndTime");
            return (Criteria) this;
        }

        public Criteria andValidEndTimeNotIn(List<Date> values) {
            addCriterion("valid_end_time not in", values, "validEndTime");
            return (Criteria) this;
        }

        public Criteria andValidEndTimeBetween(Date value1, Date value2) {
            addCriterion("valid_end_time between", value1, value2, "validEndTime");
            return (Criteria) this;
        }

        public Criteria andValidEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("valid_end_time not between", value1, value2, "validEndTime");
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
    t_secret_personnel_passport
     *
     * @mbg.generated do_not_delete_during_merge Fri Mar 05 15:46:26 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class corresponds to the database table t_secret_personnel_passport
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