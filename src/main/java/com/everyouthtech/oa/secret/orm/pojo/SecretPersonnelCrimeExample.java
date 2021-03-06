package com.everyouthtech.oa.secret.orm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SecretPersonnelCrimeExample {
    /**
    
     */
    protected String orderByClause;

    /**
    
     */
    protected boolean distinct;

    /**
    
     */
    protected List<Criteria> oredCriteria;

    public SecretPersonnelCrimeExample() {
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
     * This class corresponds to the database table t_secret_personnel_crime
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

        public Criteria andCrimeTimeIsNull() {
            addCriterion("crime_time is null");
            return (Criteria) this;
        }

        public Criteria andCrimeTimeIsNotNull() {
            addCriterion("crime_time is not null");
            return (Criteria) this;
        }

        public Criteria andCrimeTimeEqualTo(Date value) {
            addCriterion("crime_time =", value, "crimeTime");
            return (Criteria) this;
        }

        public Criteria andCrimeTimeNotEqualTo(Date value) {
            addCriterion("crime_time <>", value, "crimeTime");
            return (Criteria) this;
        }

        public Criteria andCrimeTimeGreaterThan(Date value) {
            addCriterion("crime_time >", value, "crimeTime");
            return (Criteria) this;
        }

        public Criteria andCrimeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("crime_time >=", value, "crimeTime");
            return (Criteria) this;
        }

        public Criteria andCrimeTimeLessThan(Date value) {
            addCriterion("crime_time <", value, "crimeTime");
            return (Criteria) this;
        }

        public Criteria andCrimeTimeLessThanOrEqualTo(Date value) {
            addCriterion("crime_time <=", value, "crimeTime");
            return (Criteria) this;
        }

        public Criteria andCrimeTimeIn(List<Date> values) {
            addCriterion("crime_time in", values, "crimeTime");
            return (Criteria) this;
        }

        public Criteria andCrimeTimeNotIn(List<Date> values) {
            addCriterion("crime_time not in", values, "crimeTime");
            return (Criteria) this;
        }

        public Criteria andCrimeTimeBetween(Date value1, Date value2) {
            addCriterion("crime_time between", value1, value2, "crimeTime");
            return (Criteria) this;
        }

        public Criteria andCrimeTimeNotBetween(Date value1, Date value2) {
            addCriterion("crime_time not between", value1, value2, "crimeTime");
            return (Criteria) this;
        }

        public Criteria andProcessResultIsNull() {
            addCriterion("process_result is null");
            return (Criteria) this;
        }

        public Criteria andProcessResultIsNotNull() {
            addCriterion("process_result is not null");
            return (Criteria) this;
        }

        public Criteria andProcessResultEqualTo(String value) {
            addCriterion("process_result =", value, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultNotEqualTo(String value) {
            addCriterion("process_result <>", value, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultGreaterThan(String value) {
            addCriterion("process_result >", value, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultGreaterThanOrEqualTo(String value) {
            addCriterion("process_result >=", value, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultLessThan(String value) {
            addCriterion("process_result <", value, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultLessThanOrEqualTo(String value) {
            addCriterion("process_result <=", value, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultLike(String value) {
            addCriterion("process_result like", value, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultNotLike(String value) {
            addCriterion("process_result not like", value, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultIn(List<String> values) {
            addCriterion("process_result in", values, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultNotIn(List<String> values) {
            addCriterion("process_result not in", values, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultBetween(String value1, String value2) {
            addCriterion("process_result between", value1, value2, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessResultNotBetween(String value1, String value2) {
            addCriterion("process_result not between", value1, value2, "processResult");
            return (Criteria) this;
        }

        public Criteria andProcessingAgencyIsNull() {
            addCriterion("processing_agency is null");
            return (Criteria) this;
        }

        public Criteria andProcessingAgencyIsNotNull() {
            addCriterion("processing_agency is not null");
            return (Criteria) this;
        }

        public Criteria andProcessingAgencyEqualTo(String value) {
            addCriterion("processing_agency =", value, "processingAgency");
            return (Criteria) this;
        }

        public Criteria andProcessingAgencyNotEqualTo(String value) {
            addCriterion("processing_agency <>", value, "processingAgency");
            return (Criteria) this;
        }

        public Criteria andProcessingAgencyGreaterThan(String value) {
            addCriterion("processing_agency >", value, "processingAgency");
            return (Criteria) this;
        }

        public Criteria andProcessingAgencyGreaterThanOrEqualTo(String value) {
            addCriterion("processing_agency >=", value, "processingAgency");
            return (Criteria) this;
        }

        public Criteria andProcessingAgencyLessThan(String value) {
            addCriterion("processing_agency <", value, "processingAgency");
            return (Criteria) this;
        }

        public Criteria andProcessingAgencyLessThanOrEqualTo(String value) {
            addCriterion("processing_agency <=", value, "processingAgency");
            return (Criteria) this;
        }

        public Criteria andProcessingAgencyLike(String value) {
            addCriterion("processing_agency like", value, "processingAgency");
            return (Criteria) this;
        }

        public Criteria andProcessingAgencyNotLike(String value) {
            addCriterion("processing_agency not like", value, "processingAgency");
            return (Criteria) this;
        }

        public Criteria andProcessingAgencyIn(List<String> values) {
            addCriterion("processing_agency in", values, "processingAgency");
            return (Criteria) this;
        }

        public Criteria andProcessingAgencyNotIn(List<String> values) {
            addCriterion("processing_agency not in", values, "processingAgency");
            return (Criteria) this;
        }

        public Criteria andProcessingAgencyBetween(String value1, String value2) {
            addCriterion("processing_agency between", value1, value2, "processingAgency");
            return (Criteria) this;
        }

        public Criteria andProcessingAgencyNotBetween(String value1, String value2) {
            addCriterion("processing_agency not between", value1, value2, "processingAgency");
            return (Criteria) this;
        }

        public Criteria andProcessingInstructionsIsNull() {
            addCriterion("processing_instructions is null");
            return (Criteria) this;
        }

        public Criteria andProcessingInstructionsIsNotNull() {
            addCriterion("processing_instructions is not null");
            return (Criteria) this;
        }

        public Criteria andProcessingInstructionsEqualTo(String value) {
            addCriterion("processing_instructions =", value, "processingInstructions");
            return (Criteria) this;
        }

        public Criteria andProcessingInstructionsNotEqualTo(String value) {
            addCriterion("processing_instructions <>", value, "processingInstructions");
            return (Criteria) this;
        }

        public Criteria andProcessingInstructionsGreaterThan(String value) {
            addCriterion("processing_instructions >", value, "processingInstructions");
            return (Criteria) this;
        }

        public Criteria andProcessingInstructionsGreaterThanOrEqualTo(String value) {
            addCriterion("processing_instructions >=", value, "processingInstructions");
            return (Criteria) this;
        }

        public Criteria andProcessingInstructionsLessThan(String value) {
            addCriterion("processing_instructions <", value, "processingInstructions");
            return (Criteria) this;
        }

        public Criteria andProcessingInstructionsLessThanOrEqualTo(String value) {
            addCriterion("processing_instructions <=", value, "processingInstructions");
            return (Criteria) this;
        }

        public Criteria andProcessingInstructionsLike(String value) {
            addCriterion("processing_instructions like", value, "processingInstructions");
            return (Criteria) this;
        }

        public Criteria andProcessingInstructionsNotLike(String value) {
            addCriterion("processing_instructions not like", value, "processingInstructions");
            return (Criteria) this;
        }

        public Criteria andProcessingInstructionsIn(List<String> values) {
            addCriterion("processing_instructions in", values, "processingInstructions");
            return (Criteria) this;
        }

        public Criteria andProcessingInstructionsNotIn(List<String> values) {
            addCriterion("processing_instructions not in", values, "processingInstructions");
            return (Criteria) this;
        }

        public Criteria andProcessingInstructionsBetween(String value1, String value2) {
            addCriterion("processing_instructions between", value1, value2, "processingInstructions");
            return (Criteria) this;
        }

        public Criteria andProcessingInstructionsNotBetween(String value1, String value2) {
            addCriterion("processing_instructions not between", value1, value2, "processingInstructions");
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
    t_secret_personnel_crime
     *
     * @mbg.generated do_not_delete_during_merge Fri Mar 05 15:46:26 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class corresponds to the database table t_secret_personnel_crime
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