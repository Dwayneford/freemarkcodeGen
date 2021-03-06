package com.everyouthtech.oa.secret.orm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SecretPersonnelInfoExample {
    /**
    
     */
    protected String orderByClause;

    /**
    
     */
    protected boolean distinct;

    /**
    
     */
    protected List<Criteria> oredCriteria;

    public SecretPersonnelInfoExample() {
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
     * This class corresponds to the database table t_secret_personnel_info
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(Long value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(Long value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(Long value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(Long value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(Long value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(Long value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<Long> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<Long> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(Long value1, Long value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(Long value1, Long value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andFormerNameIsNull() {
            addCriterion("former_name is null");
            return (Criteria) this;
        }

        public Criteria andFormerNameIsNotNull() {
            addCriterion("former_name is not null");
            return (Criteria) this;
        }

        public Criteria andFormerNameEqualTo(String value) {
            addCriterion("former_name =", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameNotEqualTo(String value) {
            addCriterion("former_name <>", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameGreaterThan(String value) {
            addCriterion("former_name >", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameGreaterThanOrEqualTo(String value) {
            addCriterion("former_name >=", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameLessThan(String value) {
            addCriterion("former_name <", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameLessThanOrEqualTo(String value) {
            addCriterion("former_name <=", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameLike(String value) {
            addCriterion("former_name like", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameNotLike(String value) {
            addCriterion("former_name not like", value, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameIn(List<String> values) {
            addCriterion("former_name in", values, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameNotIn(List<String> values) {
            addCriterion("former_name not in", values, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameBetween(String value1, String value2) {
            addCriterion("former_name between", value1, value2, "formerName");
            return (Criteria) this;
        }

        public Criteria andFormerNameNotBetween(String value1, String value2) {
            addCriterion("former_name not between", value1, value2, "formerName");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNull() {
            addCriterion("marital_status is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("marital_status is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(Integer value) {
            addCriterion("marital_status =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(Integer value) {
            addCriterion("marital_status <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(Integer value) {
            addCriterion("marital_status >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("marital_status >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(Integer value) {
            addCriterion("marital_status <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(Integer value) {
            addCriterion("marital_status <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<Integer> values) {
            addCriterion("marital_status in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<Integer> values) {
            addCriterion("marital_status not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(Integer value1, Integer value2) {
            addCriterion("marital_status between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("marital_status not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIsNull() {
            addCriterion("birthplace is null");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIsNotNull() {
            addCriterion("birthplace is not null");
            return (Criteria) this;
        }

        public Criteria andBirthplaceEqualTo(String value) {
            addCriterion("birthplace =", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotEqualTo(String value) {
            addCriterion("birthplace <>", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceGreaterThan(String value) {
            addCriterion("birthplace >", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceGreaterThanOrEqualTo(String value) {
            addCriterion("birthplace >=", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLessThan(String value) {
            addCriterion("birthplace <", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLessThanOrEqualTo(String value) {
            addCriterion("birthplace <=", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLike(String value) {
            addCriterion("birthplace like", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotLike(String value) {
            addCriterion("birthplace not like", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIn(List<String> values) {
            addCriterion("birthplace in", values, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotIn(List<String> values) {
            addCriterion("birthplace not in", values, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceBetween(String value1, String value2) {
            addCriterion("birthplace between", value1, value2, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotBetween(String value1, String value2) {
            addCriterion("birthplace not between", value1, value2, "birthplace");
            return (Criteria) this;
        }

        public Criteria andHometownIsNull() {
            addCriterion("hometown is null");
            return (Criteria) this;
        }

        public Criteria andHometownIsNotNull() {
            addCriterion("hometown is not null");
            return (Criteria) this;
        }

        public Criteria andHometownEqualTo(String value) {
            addCriterion("hometown =", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownNotEqualTo(String value) {
            addCriterion("hometown <>", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownGreaterThan(String value) {
            addCriterion("hometown >", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownGreaterThanOrEqualTo(String value) {
            addCriterion("hometown >=", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownLessThan(String value) {
            addCriterion("hometown <", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownLessThanOrEqualTo(String value) {
            addCriterion("hometown <=", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownLike(String value) {
            addCriterion("hometown like", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownNotLike(String value) {
            addCriterion("hometown not like", value, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownIn(List<String> values) {
            addCriterion("hometown in", values, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownNotIn(List<String> values) {
            addCriterion("hometown not in", values, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownBetween(String value1, String value2) {
            addCriterion("hometown between", value1, value2, "hometown");
            return (Criteria) this;
        }

        public Criteria andHometownNotBetween(String value1, String value2) {
            addCriterion("hometown not between", value1, value2, "hometown");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNull() {
            addCriterion("nationality is null");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNotNull() {
            addCriterion("nationality is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityEqualTo(Long value) {
            addCriterion("nationality =", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotEqualTo(Long value) {
            addCriterion("nationality <>", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThan(Long value) {
            addCriterion("nationality >", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThanOrEqualTo(Long value) {
            addCriterion("nationality >=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThan(Long value) {
            addCriterion("nationality <", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThanOrEqualTo(Long value) {
            addCriterion("nationality <=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityIn(List<Long> values) {
            addCriterion("nationality in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotIn(List<Long> values) {
            addCriterion("nationality not in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityBetween(Long value1, Long value2) {
            addCriterion("nationality between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotBetween(Long value1, Long value2) {
            addCriterion("nationality not between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberIsNull() {
            addCriterion("identity_number is null");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberIsNotNull() {
            addCriterion("identity_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberEqualTo(String value) {
            addCriterion("identity_number =", value, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberNotEqualTo(String value) {
            addCriterion("identity_number <>", value, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberGreaterThan(String value) {
            addCriterion("identity_number >", value, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberGreaterThanOrEqualTo(String value) {
            addCriterion("identity_number >=", value, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberLessThan(String value) {
            addCriterion("identity_number <", value, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberLessThanOrEqualTo(String value) {
            addCriterion("identity_number <=", value, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberLike(String value) {
            addCriterion("identity_number like", value, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberNotLike(String value) {
            addCriterion("identity_number not like", value, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberIn(List<String> values) {
            addCriterion("identity_number in", values, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberNotIn(List<String> values) {
            addCriterion("identity_number not in", values, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberBetween(String value1, String value2) {
            addCriterion("identity_number between", value1, value2, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andIdentityNumberNotBetween(String value1, String value2) {
            addCriterion("identity_number not between", value1, value2, "identityNumber");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIsNull() {
            addCriterion("political_status is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIsNotNull() {
            addCriterion("political_status is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusEqualTo(Integer value) {
            addCriterion("political_status =", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotEqualTo(Integer value) {
            addCriterion("political_status <>", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusGreaterThan(Integer value) {
            addCriterion("political_status >", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("political_status >=", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLessThan(Integer value) {
            addCriterion("political_status <", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLessThanOrEqualTo(Integer value) {
            addCriterion("political_status <=", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIn(List<Integer> values) {
            addCriterion("political_status in", values, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotIn(List<Integer> values) {
            addCriterion("political_status not in", values, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusBetween(Integer value1, Integer value2) {
            addCriterion("political_status between", value1, value2, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("political_status not between", value1, value2, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andJoinPoliticalTimeIsNull() {
            addCriterion("join_political_time is null");
            return (Criteria) this;
        }

        public Criteria andJoinPoliticalTimeIsNotNull() {
            addCriterion("join_political_time is not null");
            return (Criteria) this;
        }

        public Criteria andJoinPoliticalTimeEqualTo(Date value) {
            addCriterion("join_political_time =", value, "joinPoliticalTime");
            return (Criteria) this;
        }

        public Criteria andJoinPoliticalTimeNotEqualTo(Date value) {
            addCriterion("join_political_time <>", value, "joinPoliticalTime");
            return (Criteria) this;
        }

        public Criteria andJoinPoliticalTimeGreaterThan(Date value) {
            addCriterion("join_political_time >", value, "joinPoliticalTime");
            return (Criteria) this;
        }

        public Criteria andJoinPoliticalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("join_political_time >=", value, "joinPoliticalTime");
            return (Criteria) this;
        }

        public Criteria andJoinPoliticalTimeLessThan(Date value) {
            addCriterion("join_political_time <", value, "joinPoliticalTime");
            return (Criteria) this;
        }

        public Criteria andJoinPoliticalTimeLessThanOrEqualTo(Date value) {
            addCriterion("join_political_time <=", value, "joinPoliticalTime");
            return (Criteria) this;
        }

        public Criteria andJoinPoliticalTimeIn(List<Date> values) {
            addCriterion("join_political_time in", values, "joinPoliticalTime");
            return (Criteria) this;
        }

        public Criteria andJoinPoliticalTimeNotIn(List<Date> values) {
            addCriterion("join_political_time not in", values, "joinPoliticalTime");
            return (Criteria) this;
        }

        public Criteria andJoinPoliticalTimeBetween(Date value1, Date value2) {
            addCriterion("join_political_time between", value1, value2, "joinPoliticalTime");
            return (Criteria) this;
        }

        public Criteria andJoinPoliticalTimeNotBetween(Date value1, Date value2) {
            addCriterion("join_political_time not between", value1, value2, "joinPoliticalTime");
            return (Criteria) this;
        }

        public Criteria andEducationLevelIsNull() {
            addCriterion("education_level is null");
            return (Criteria) this;
        }

        public Criteria andEducationLevelIsNotNull() {
            addCriterion("education_level is not null");
            return (Criteria) this;
        }

        public Criteria andEducationLevelEqualTo(String value) {
            addCriterion("education_level =", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelNotEqualTo(String value) {
            addCriterion("education_level <>", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelGreaterThan(String value) {
            addCriterion("education_level >", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelGreaterThanOrEqualTo(String value) {
            addCriterion("education_level >=", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelLessThan(String value) {
            addCriterion("education_level <", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelLessThanOrEqualTo(String value) {
            addCriterion("education_level <=", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelLike(String value) {
            addCriterion("education_level like", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelNotLike(String value) {
            addCriterion("education_level not like", value, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelIn(List<String> values) {
            addCriterion("education_level in", values, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelNotIn(List<String> values) {
            addCriterion("education_level not in", values, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelBetween(String value1, String value2) {
            addCriterion("education_level between", value1, value2, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationLevelNotBetween(String value1, String value2) {
            addCriterion("education_level not between", value1, value2, "educationLevel");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(Integer value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(Integer value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(Integer value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(Integer value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(Integer value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(Integer value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<Integer> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<Integer> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(Integer value1, Integer value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(Integer value1, Integer value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andAcademicDegreeIsNull() {
            addCriterion("academic_degree is null");
            return (Criteria) this;
        }

        public Criteria andAcademicDegreeIsNotNull() {
            addCriterion("academic_degree is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicDegreeEqualTo(Integer value) {
            addCriterion("academic_degree =", value, "academicDegree");
            return (Criteria) this;
        }

        public Criteria andAcademicDegreeNotEqualTo(Integer value) {
            addCriterion("academic_degree <>", value, "academicDegree");
            return (Criteria) this;
        }

        public Criteria andAcademicDegreeGreaterThan(Integer value) {
            addCriterion("academic_degree >", value, "academicDegree");
            return (Criteria) this;
        }

        public Criteria andAcademicDegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("academic_degree >=", value, "academicDegree");
            return (Criteria) this;
        }

        public Criteria andAcademicDegreeLessThan(Integer value) {
            addCriterion("academic_degree <", value, "academicDegree");
            return (Criteria) this;
        }

        public Criteria andAcademicDegreeLessThanOrEqualTo(Integer value) {
            addCriterion("academic_degree <=", value, "academicDegree");
            return (Criteria) this;
        }

        public Criteria andAcademicDegreeIn(List<Integer> values) {
            addCriterion("academic_degree in", values, "academicDegree");
            return (Criteria) this;
        }

        public Criteria andAcademicDegreeNotIn(List<Integer> values) {
            addCriterion("academic_degree not in", values, "academicDegree");
            return (Criteria) this;
        }

        public Criteria andAcademicDegreeBetween(Integer value1, Integer value2) {
            addCriterion("academic_degree between", value1, value2, "academicDegree");
            return (Criteria) this;
        }

        public Criteria andAcademicDegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("academic_degree not between", value1, value2, "academicDegree");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolIsNull() {
            addCriterion("graduated_school is null");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolIsNotNull() {
            addCriterion("graduated_school is not null");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolEqualTo(String value) {
            addCriterion("graduated_school =", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolNotEqualTo(String value) {
            addCriterion("graduated_school <>", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolGreaterThan(String value) {
            addCriterion("graduated_school >", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("graduated_school >=", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolLessThan(String value) {
            addCriterion("graduated_school <", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolLessThanOrEqualTo(String value) {
            addCriterion("graduated_school <=", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolLike(String value) {
            addCriterion("graduated_school like", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolNotLike(String value) {
            addCriterion("graduated_school not like", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolIn(List<String> values) {
            addCriterion("graduated_school in", values, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolNotIn(List<String> values) {
            addCriterion("graduated_school not in", values, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolBetween(String value1, String value2) {
            addCriterion("graduated_school between", value1, value2, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolNotBetween(String value1, String value2) {
            addCriterion("graduated_school not between", value1, value2, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsIsNull() {
            addCriterion("working_years is null");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsIsNotNull() {
            addCriterion("working_years is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsEqualTo(Integer value) {
            addCriterion("working_years =", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsNotEqualTo(Integer value) {
            addCriterion("working_years <>", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsGreaterThan(Integer value) {
            addCriterion("working_years >", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("working_years >=", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsLessThan(Integer value) {
            addCriterion("working_years <", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsLessThanOrEqualTo(Integer value) {
            addCriterion("working_years <=", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsIn(List<Integer> values) {
            addCriterion("working_years in", values, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsNotIn(List<Integer> values) {
            addCriterion("working_years not in", values, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsBetween(Integer value1, Integer value2) {
            addCriterion("working_years between", value1, value2, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("working_years not between", value1, value2, "workingYears");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageFamiliarityIsNull() {
            addCriterion("language_familiarity is null");
            return (Criteria) this;
        }

        public Criteria andLanguageFamiliarityIsNotNull() {
            addCriterion("language_familiarity is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageFamiliarityEqualTo(String value) {
            addCriterion("language_familiarity =", value, "languageFamiliarity");
            return (Criteria) this;
        }

        public Criteria andLanguageFamiliarityNotEqualTo(String value) {
            addCriterion("language_familiarity <>", value, "languageFamiliarity");
            return (Criteria) this;
        }

        public Criteria andLanguageFamiliarityGreaterThan(String value) {
            addCriterion("language_familiarity >", value, "languageFamiliarity");
            return (Criteria) this;
        }

        public Criteria andLanguageFamiliarityGreaterThanOrEqualTo(String value) {
            addCriterion("language_familiarity >=", value, "languageFamiliarity");
            return (Criteria) this;
        }

        public Criteria andLanguageFamiliarityLessThan(String value) {
            addCriterion("language_familiarity <", value, "languageFamiliarity");
            return (Criteria) this;
        }

        public Criteria andLanguageFamiliarityLessThanOrEqualTo(String value) {
            addCriterion("language_familiarity <=", value, "languageFamiliarity");
            return (Criteria) this;
        }

        public Criteria andLanguageFamiliarityLike(String value) {
            addCriterion("language_familiarity like", value, "languageFamiliarity");
            return (Criteria) this;
        }

        public Criteria andLanguageFamiliarityNotLike(String value) {
            addCriterion("language_familiarity not like", value, "languageFamiliarity");
            return (Criteria) this;
        }

        public Criteria andLanguageFamiliarityIn(List<String> values) {
            addCriterion("language_familiarity in", values, "languageFamiliarity");
            return (Criteria) this;
        }

        public Criteria andLanguageFamiliarityNotIn(List<String> values) {
            addCriterion("language_familiarity not in", values, "languageFamiliarity");
            return (Criteria) this;
        }

        public Criteria andLanguageFamiliarityBetween(String value1, String value2) {
            addCriterion("language_familiarity between", value1, value2, "languageFamiliarity");
            return (Criteria) this;
        }

        public Criteria andLanguageFamiliarityNotBetween(String value1, String value2) {
            addCriterion("language_familiarity not between", value1, value2, "languageFamiliarity");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceIsNull() {
            addCriterion("registered_residence is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceIsNotNull() {
            addCriterion("registered_residence is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceEqualTo(String value) {
            addCriterion("registered_residence =", value, "registeredResidence");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceNotEqualTo(String value) {
            addCriterion("registered_residence <>", value, "registeredResidence");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceGreaterThan(String value) {
            addCriterion("registered_residence >", value, "registeredResidence");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceGreaterThanOrEqualTo(String value) {
            addCriterion("registered_residence >=", value, "registeredResidence");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceLessThan(String value) {
            addCriterion("registered_residence <", value, "registeredResidence");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceLessThanOrEqualTo(String value) {
            addCriterion("registered_residence <=", value, "registeredResidence");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceLike(String value) {
            addCriterion("registered_residence like", value, "registeredResidence");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceNotLike(String value) {
            addCriterion("registered_residence not like", value, "registeredResidence");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceIn(List<String> values) {
            addCriterion("registered_residence in", values, "registeredResidence");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceNotIn(List<String> values) {
            addCriterion("registered_residence not in", values, "registeredResidence");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceBetween(String value1, String value2) {
            addCriterion("registered_residence between", value1, value2, "registeredResidence");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceNotBetween(String value1, String value2) {
            addCriterion("registered_residence not between", value1, value2, "registeredResidence");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidencePoliceStationIsNull() {
            addCriterion("registered_residence_police_station is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidencePoliceStationIsNotNull() {
            addCriterion("registered_residence_police_station is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidencePoliceStationEqualTo(String value) {
            addCriterion("registered_residence_police_station =", value, "registeredResidencePoliceStation");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidencePoliceStationNotEqualTo(String value) {
            addCriterion("registered_residence_police_station <>", value, "registeredResidencePoliceStation");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidencePoliceStationGreaterThan(String value) {
            addCriterion("registered_residence_police_station >", value, "registeredResidencePoliceStation");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidencePoliceStationGreaterThanOrEqualTo(String value) {
            addCriterion("registered_residence_police_station >=", value, "registeredResidencePoliceStation");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidencePoliceStationLessThan(String value) {
            addCriterion("registered_residence_police_station <", value, "registeredResidencePoliceStation");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidencePoliceStationLessThanOrEqualTo(String value) {
            addCriterion("registered_residence_police_station <=", value, "registeredResidencePoliceStation");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidencePoliceStationLike(String value) {
            addCriterion("registered_residence_police_station like", value, "registeredResidencePoliceStation");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidencePoliceStationNotLike(String value) {
            addCriterion("registered_residence_police_station not like", value, "registeredResidencePoliceStation");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidencePoliceStationIn(List<String> values) {
            addCriterion("registered_residence_police_station in", values, "registeredResidencePoliceStation");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidencePoliceStationNotIn(List<String> values) {
            addCriterion("registered_residence_police_station not in", values, "registeredResidencePoliceStation");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidencePoliceStationBetween(String value1, String value2) {
            addCriterion("registered_residence_police_station between", value1, value2, "registeredResidencePoliceStation");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidencePoliceStationNotBetween(String value1, String value2) {
            addCriterion("registered_residence_police_station not between", value1, value2, "registeredResidencePoliceStation");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressIsNull() {
            addCriterion("current_address is null");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressIsNotNull() {
            addCriterion("current_address is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressEqualTo(String value) {
            addCriterion("current_address =", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressNotEqualTo(String value) {
            addCriterion("current_address <>", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressGreaterThan(String value) {
            addCriterion("current_address >", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressGreaterThanOrEqualTo(String value) {
            addCriterion("current_address >=", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressLessThan(String value) {
            addCriterion("current_address <", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressLessThanOrEqualTo(String value) {
            addCriterion("current_address <=", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressLike(String value) {
            addCriterion("current_address like", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressNotLike(String value) {
            addCriterion("current_address not like", value, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressIn(List<String> values) {
            addCriterion("current_address in", values, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressNotIn(List<String> values) {
            addCriterion("current_address not in", values, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressBetween(String value1, String value2) {
            addCriterion("current_address between", value1, value2, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andCurrentAddressNotBetween(String value1, String value2) {
            addCriterion("current_address not between", value1, value2, "currentAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeLocationIsNull() {
            addCriterion("office_location is null");
            return (Criteria) this;
        }

        public Criteria andOfficeLocationIsNotNull() {
            addCriterion("office_location is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeLocationEqualTo(String value) {
            addCriterion("office_location =", value, "officeLocation");
            return (Criteria) this;
        }

        public Criteria andOfficeLocationNotEqualTo(String value) {
            addCriterion("office_location <>", value, "officeLocation");
            return (Criteria) this;
        }

        public Criteria andOfficeLocationGreaterThan(String value) {
            addCriterion("office_location >", value, "officeLocation");
            return (Criteria) this;
        }

        public Criteria andOfficeLocationGreaterThanOrEqualTo(String value) {
            addCriterion("office_location >=", value, "officeLocation");
            return (Criteria) this;
        }

        public Criteria andOfficeLocationLessThan(String value) {
            addCriterion("office_location <", value, "officeLocation");
            return (Criteria) this;
        }

        public Criteria andOfficeLocationLessThanOrEqualTo(String value) {
            addCriterion("office_location <=", value, "officeLocation");
            return (Criteria) this;
        }

        public Criteria andOfficeLocationLike(String value) {
            addCriterion("office_location like", value, "officeLocation");
            return (Criteria) this;
        }

        public Criteria andOfficeLocationNotLike(String value) {
            addCriterion("office_location not like", value, "officeLocation");
            return (Criteria) this;
        }

        public Criteria andOfficeLocationIn(List<String> values) {
            addCriterion("office_location in", values, "officeLocation");
            return (Criteria) this;
        }

        public Criteria andOfficeLocationNotIn(List<String> values) {
            addCriterion("office_location not in", values, "officeLocation");
            return (Criteria) this;
        }

        public Criteria andOfficeLocationBetween(String value1, String value2) {
            addCriterion("office_location between", value1, value2, "officeLocation");
            return (Criteria) this;
        }

        public Criteria andOfficeLocationNotBetween(String value1, String value2) {
            addCriterion("office_location not between", value1, value2, "officeLocation");
            return (Criteria) this;
        }

        public Criteria andContactNumberIsNull() {
            addCriterion("contact_number is null");
            return (Criteria) this;
        }

        public Criteria andContactNumberIsNotNull() {
            addCriterion("contact_number is not null");
            return (Criteria) this;
        }

        public Criteria andContactNumberEqualTo(Integer value) {
            addCriterion("contact_number =", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotEqualTo(Integer value) {
            addCriterion("contact_number <>", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberGreaterThan(Integer value) {
            addCriterion("contact_number >", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("contact_number >=", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLessThan(Integer value) {
            addCriterion("contact_number <", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLessThanOrEqualTo(Integer value) {
            addCriterion("contact_number <=", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberIn(List<Integer> values) {
            addCriterion("contact_number in", values, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotIn(List<Integer> values) {
            addCriterion("contact_number not in", values, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberBetween(Integer value1, Integer value2) {
            addCriterion("contact_number between", value1, value2, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("contact_number not between", value1, value2, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNull() {
            addCriterion("phone_number is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIsNotNull() {
            addCriterion("phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberEqualTo(Integer value) {
            addCriterion("phone_number =", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotEqualTo(Integer value) {
            addCriterion("phone_number <>", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThan(Integer value) {
            addCriterion("phone_number >", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("phone_number >=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThan(Integer value) {
            addCriterion("phone_number <", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberLessThanOrEqualTo(Integer value) {
            addCriterion("phone_number <=", value, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIn(List<Integer> values) {
            addCriterion("phone_number in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotIn(List<Integer> values) {
            addCriterion("phone_number not in", values, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberBetween(Integer value1, Integer value2) {
            addCriterion("phone_number between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("phone_number not between", value1, value2, "phoneNumber");
            return (Criteria) this;
        }

        public Criteria andAdministrativePositionIsNull() {
            addCriterion("administrative_position is null");
            return (Criteria) this;
        }

        public Criteria andAdministrativePositionIsNotNull() {
            addCriterion("administrative_position is not null");
            return (Criteria) this;
        }

        public Criteria andAdministrativePositionEqualTo(String value) {
            addCriterion("administrative_position =", value, "administrativePosition");
            return (Criteria) this;
        }

        public Criteria andAdministrativePositionNotEqualTo(String value) {
            addCriterion("administrative_position <>", value, "administrativePosition");
            return (Criteria) this;
        }

        public Criteria andAdministrativePositionGreaterThan(String value) {
            addCriterion("administrative_position >", value, "administrativePosition");
            return (Criteria) this;
        }

        public Criteria andAdministrativePositionGreaterThanOrEqualTo(String value) {
            addCriterion("administrative_position >=", value, "administrativePosition");
            return (Criteria) this;
        }

        public Criteria andAdministrativePositionLessThan(String value) {
            addCriterion("administrative_position <", value, "administrativePosition");
            return (Criteria) this;
        }

        public Criteria andAdministrativePositionLessThanOrEqualTo(String value) {
            addCriterion("administrative_position <=", value, "administrativePosition");
            return (Criteria) this;
        }

        public Criteria andAdministrativePositionLike(String value) {
            addCriterion("administrative_position like", value, "administrativePosition");
            return (Criteria) this;
        }

        public Criteria andAdministrativePositionNotLike(String value) {
            addCriterion("administrative_position not like", value, "administrativePosition");
            return (Criteria) this;
        }

        public Criteria andAdministrativePositionIn(List<String> values) {
            addCriterion("administrative_position in", values, "administrativePosition");
            return (Criteria) this;
        }

        public Criteria andAdministrativePositionNotIn(List<String> values) {
            addCriterion("administrative_position not in", values, "administrativePosition");
            return (Criteria) this;
        }

        public Criteria andAdministrativePositionBetween(String value1, String value2) {
            addCriterion("administrative_position between", value1, value2, "administrativePosition");
            return (Criteria) this;
        }

        public Criteria andAdministrativePositionNotBetween(String value1, String value2) {
            addCriterion("administrative_position not between", value1, value2, "administrativePosition");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionIsNull() {
            addCriterion("technical_position is null");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionIsNotNull() {
            addCriterion("technical_position is not null");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionEqualTo(String value) {
            addCriterion("technical_position =", value, "technicalPosition");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionNotEqualTo(String value) {
            addCriterion("technical_position <>", value, "technicalPosition");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionGreaterThan(String value) {
            addCriterion("technical_position >", value, "technicalPosition");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionGreaterThanOrEqualTo(String value) {
            addCriterion("technical_position >=", value, "technicalPosition");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionLessThan(String value) {
            addCriterion("technical_position <", value, "technicalPosition");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionLessThanOrEqualTo(String value) {
            addCriterion("technical_position <=", value, "technicalPosition");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionLike(String value) {
            addCriterion("technical_position like", value, "technicalPosition");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionNotLike(String value) {
            addCriterion("technical_position not like", value, "technicalPosition");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionIn(List<String> values) {
            addCriterion("technical_position in", values, "technicalPosition");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionNotIn(List<String> values) {
            addCriterion("technical_position not in", values, "technicalPosition");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionBetween(String value1, String value2) {
            addCriterion("technical_position between", value1, value2, "technicalPosition");
            return (Criteria) this;
        }

        public Criteria andTechnicalPositionNotBetween(String value1, String value2) {
            addCriterion("technical_position not between", value1, value2, "technicalPosition");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Long value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Long value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Long value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Long value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Long value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Long> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Long> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Long value1, Long value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Long value1, Long value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andSecretPositionIsNull() {
            addCriterion("secret_position is null");
            return (Criteria) this;
        }

        public Criteria andSecretPositionIsNotNull() {
            addCriterion("secret_position is not null");
            return (Criteria) this;
        }

        public Criteria andSecretPositionEqualTo(Long value) {
            addCriterion("secret_position =", value, "secretPosition");
            return (Criteria) this;
        }

        public Criteria andSecretPositionNotEqualTo(Long value) {
            addCriterion("secret_position <>", value, "secretPosition");
            return (Criteria) this;
        }

        public Criteria andSecretPositionGreaterThan(Long value) {
            addCriterion("secret_position >", value, "secretPosition");
            return (Criteria) this;
        }

        public Criteria andSecretPositionGreaterThanOrEqualTo(Long value) {
            addCriterion("secret_position >=", value, "secretPosition");
            return (Criteria) this;
        }

        public Criteria andSecretPositionLessThan(Long value) {
            addCriterion("secret_position <", value, "secretPosition");
            return (Criteria) this;
        }

        public Criteria andSecretPositionLessThanOrEqualTo(Long value) {
            addCriterion("secret_position <=", value, "secretPosition");
            return (Criteria) this;
        }

        public Criteria andSecretPositionIn(List<Long> values) {
            addCriterion("secret_position in", values, "secretPosition");
            return (Criteria) this;
        }

        public Criteria andSecretPositionNotIn(List<Long> values) {
            addCriterion("secret_position not in", values, "secretPosition");
            return (Criteria) this;
        }

        public Criteria andSecretPositionBetween(Long value1, Long value2) {
            addCriterion("secret_position between", value1, value2, "secretPosition");
            return (Criteria) this;
        }

        public Criteria andSecretPositionNotBetween(Long value1, Long value2) {
            addCriterion("secret_position not between", value1, value2, "secretPosition");
            return (Criteria) this;
        }

        public Criteria andClassifiedGradesIsNull() {
            addCriterion("classified_grades is null");
            return (Criteria) this;
        }

        public Criteria andClassifiedGradesIsNotNull() {
            addCriterion("classified_grades is not null");
            return (Criteria) this;
        }

        public Criteria andClassifiedGradesEqualTo(Integer value) {
            addCriterion("classified_grades =", value, "classifiedGrades");
            return (Criteria) this;
        }

        public Criteria andClassifiedGradesNotEqualTo(Integer value) {
            addCriterion("classified_grades <>", value, "classifiedGrades");
            return (Criteria) this;
        }

        public Criteria andClassifiedGradesGreaterThan(Integer value) {
            addCriterion("classified_grades >", value, "classifiedGrades");
            return (Criteria) this;
        }

        public Criteria andClassifiedGradesGreaterThanOrEqualTo(Integer value) {
            addCriterion("classified_grades >=", value, "classifiedGrades");
            return (Criteria) this;
        }

        public Criteria andClassifiedGradesLessThan(Integer value) {
            addCriterion("classified_grades <", value, "classifiedGrades");
            return (Criteria) this;
        }

        public Criteria andClassifiedGradesLessThanOrEqualTo(Integer value) {
            addCriterion("classified_grades <=", value, "classifiedGrades");
            return (Criteria) this;
        }

        public Criteria andClassifiedGradesIn(List<Integer> values) {
            addCriterion("classified_grades in", values, "classifiedGrades");
            return (Criteria) this;
        }

        public Criteria andClassifiedGradesNotIn(List<Integer> values) {
            addCriterion("classified_grades not in", values, "classifiedGrades");
            return (Criteria) this;
        }

        public Criteria andClassifiedGradesBetween(Integer value1, Integer value2) {
            addCriterion("classified_grades between", value1, value2, "classifiedGrades");
            return (Criteria) this;
        }

        public Criteria andClassifiedGradesNotBetween(Integer value1, Integer value2) {
            addCriterion("classified_grades not between", value1, value2, "classifiedGrades");
            return (Criteria) this;
        }

        public Criteria andEmploymentTypeIsNull() {
            addCriterion("employment_type is null");
            return (Criteria) this;
        }

        public Criteria andEmploymentTypeIsNotNull() {
            addCriterion("employment_type is not null");
            return (Criteria) this;
        }

        public Criteria andEmploymentTypeEqualTo(Integer value) {
            addCriterion("employment_type =", value, "employmentType");
            return (Criteria) this;
        }

        public Criteria andEmploymentTypeNotEqualTo(Integer value) {
            addCriterion("employment_type <>", value, "employmentType");
            return (Criteria) this;
        }

        public Criteria andEmploymentTypeGreaterThan(Integer value) {
            addCriterion("employment_type >", value, "employmentType");
            return (Criteria) this;
        }

        public Criteria andEmploymentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("employment_type >=", value, "employmentType");
            return (Criteria) this;
        }

        public Criteria andEmploymentTypeLessThan(Integer value) {
            addCriterion("employment_type <", value, "employmentType");
            return (Criteria) this;
        }

        public Criteria andEmploymentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("employment_type <=", value, "employmentType");
            return (Criteria) this;
        }

        public Criteria andEmploymentTypeIn(List<Integer> values) {
            addCriterion("employment_type in", values, "employmentType");
            return (Criteria) this;
        }

        public Criteria andEmploymentTypeNotIn(List<Integer> values) {
            addCriterion("employment_type not in", values, "employmentType");
            return (Criteria) this;
        }

        public Criteria andEmploymentTypeBetween(Integer value1, Integer value2) {
            addCriterion("employment_type between", value1, value2, "employmentType");
            return (Criteria) this;
        }

        public Criteria andEmploymentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("employment_type not between", value1, value2, "employmentType");
            return (Criteria) this;
        }

        public Criteria andPersonnelCategoryIsNull() {
            addCriterion("personnel_category is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelCategoryIsNotNull() {
            addCriterion("personnel_category is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelCategoryEqualTo(Integer value) {
            addCriterion("personnel_category =", value, "personnelCategory");
            return (Criteria) this;
        }

        public Criteria andPersonnelCategoryNotEqualTo(Integer value) {
            addCriterion("personnel_category <>", value, "personnelCategory");
            return (Criteria) this;
        }

        public Criteria andPersonnelCategoryGreaterThan(Integer value) {
            addCriterion("personnel_category >", value, "personnelCategory");
            return (Criteria) this;
        }

        public Criteria andPersonnelCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("personnel_category >=", value, "personnelCategory");
            return (Criteria) this;
        }

        public Criteria andPersonnelCategoryLessThan(Integer value) {
            addCriterion("personnel_category <", value, "personnelCategory");
            return (Criteria) this;
        }

        public Criteria andPersonnelCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("personnel_category <=", value, "personnelCategory");
            return (Criteria) this;
        }

        public Criteria andPersonnelCategoryIn(List<Integer> values) {
            addCriterion("personnel_category in", values, "personnelCategory");
            return (Criteria) this;
        }

        public Criteria andPersonnelCategoryNotIn(List<Integer> values) {
            addCriterion("personnel_category not in", values, "personnelCategory");
            return (Criteria) this;
        }

        public Criteria andPersonnelCategoryBetween(Integer value1, Integer value2) {
            addCriterion("personnel_category between", value1, value2, "personnelCategory");
            return (Criteria) this;
        }

        public Criteria andPersonnelCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("personnel_category not between", value1, value2, "personnelCategory");
            return (Criteria) this;
        }

        public Criteria andJoinTimeIsNull() {
            addCriterion("join_time is null");
            return (Criteria) this;
        }

        public Criteria andJoinTimeIsNotNull() {
            addCriterion("join_time is not null");
            return (Criteria) this;
        }

        public Criteria andJoinTimeEqualTo(Date value) {
            addCriterion("join_time =", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeNotEqualTo(Date value) {
            addCriterion("join_time <>", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeGreaterThan(Date value) {
            addCriterion("join_time >", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("join_time >=", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeLessThan(Date value) {
            addCriterion("join_time <", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeLessThanOrEqualTo(Date value) {
            addCriterion("join_time <=", value, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeIn(List<Date> values) {
            addCriterion("join_time in", values, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeNotIn(List<Date> values) {
            addCriterion("join_time not in", values, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeBetween(Date value1, Date value2) {
            addCriterion("join_time between", value1, value2, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinTimeNotBetween(Date value1, Date value2) {
            addCriterion("join_time not between", value1, value2, "joinTime");
            return (Criteria) this;
        }

        public Criteria andJoinSecretPositionTimeIsNull() {
            addCriterion("join_secret_position_time is null");
            return (Criteria) this;
        }

        public Criteria andJoinSecretPositionTimeIsNotNull() {
            addCriterion("join_secret_position_time is not null");
            return (Criteria) this;
        }

        public Criteria andJoinSecretPositionTimeEqualTo(Date value) {
            addCriterion("join_secret_position_time =", value, "joinSecretPositionTime");
            return (Criteria) this;
        }

        public Criteria andJoinSecretPositionTimeNotEqualTo(Date value) {
            addCriterion("join_secret_position_time <>", value, "joinSecretPositionTime");
            return (Criteria) this;
        }

        public Criteria andJoinSecretPositionTimeGreaterThan(Date value) {
            addCriterion("join_secret_position_time >", value, "joinSecretPositionTime");
            return (Criteria) this;
        }

        public Criteria andJoinSecretPositionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("join_secret_position_time >=", value, "joinSecretPositionTime");
            return (Criteria) this;
        }

        public Criteria andJoinSecretPositionTimeLessThan(Date value) {
            addCriterion("join_secret_position_time <", value, "joinSecretPositionTime");
            return (Criteria) this;
        }

        public Criteria andJoinSecretPositionTimeLessThanOrEqualTo(Date value) {
            addCriterion("join_secret_position_time <=", value, "joinSecretPositionTime");
            return (Criteria) this;
        }

        public Criteria andJoinSecretPositionTimeIn(List<Date> values) {
            addCriterion("join_secret_position_time in", values, "joinSecretPositionTime");
            return (Criteria) this;
        }

        public Criteria andJoinSecretPositionTimeNotIn(List<Date> values) {
            addCriterion("join_secret_position_time not in", values, "joinSecretPositionTime");
            return (Criteria) this;
        }

        public Criteria andJoinSecretPositionTimeBetween(Date value1, Date value2) {
            addCriterion("join_secret_position_time between", value1, value2, "joinSecretPositionTime");
            return (Criteria) this;
        }

        public Criteria andJoinSecretPositionTimeNotBetween(Date value1, Date value2) {
            addCriterion("join_secret_position_time not between", value1, value2, "joinSecretPositionTime");
            return (Criteria) this;
        }

        public Criteria andEmployeeCardNumberIsNull() {
            addCriterion("employee_card_number is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeCardNumberIsNotNull() {
            addCriterion("employee_card_number is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeCardNumberEqualTo(String value) {
            addCriterion("employee_card_number =", value, "employeeCardNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeCardNumberNotEqualTo(String value) {
            addCriterion("employee_card_number <>", value, "employeeCardNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeCardNumberGreaterThan(String value) {
            addCriterion("employee_card_number >", value, "employeeCardNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("employee_card_number >=", value, "employeeCardNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeCardNumberLessThan(String value) {
            addCriterion("employee_card_number <", value, "employeeCardNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeCardNumberLessThanOrEqualTo(String value) {
            addCriterion("employee_card_number <=", value, "employeeCardNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeCardNumberLike(String value) {
            addCriterion("employee_card_number like", value, "employeeCardNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeCardNumberNotLike(String value) {
            addCriterion("employee_card_number not like", value, "employeeCardNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeCardNumberIn(List<String> values) {
            addCriterion("employee_card_number in", values, "employeeCardNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeCardNumberNotIn(List<String> values) {
            addCriterion("employee_card_number not in", values, "employeeCardNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeCardNumberBetween(String value1, String value2) {
            addCriterion("employee_card_number between", value1, value2, "employeeCardNumber");
            return (Criteria) this;
        }

        public Criteria andEmployeeCardNumberNotBetween(String value1, String value2) {
            addCriterion("employee_card_number not between", value1, value2, "employeeCardNumber");
            return (Criteria) this;
        }

        public Criteria andConfidentialityAllowanceIsNull() {
            addCriterion("confidentiality_allowance is null");
            return (Criteria) this;
        }

        public Criteria andConfidentialityAllowanceIsNotNull() {
            addCriterion("confidentiality_allowance is not null");
            return (Criteria) this;
        }

        public Criteria andConfidentialityAllowanceEqualTo(Double value) {
            addCriterion("confidentiality_allowance =", value, "confidentialityAllowance");
            return (Criteria) this;
        }

        public Criteria andConfidentialityAllowanceNotEqualTo(Double value) {
            addCriterion("confidentiality_allowance <>", value, "confidentialityAllowance");
            return (Criteria) this;
        }

        public Criteria andConfidentialityAllowanceGreaterThan(Double value) {
            addCriterion("confidentiality_allowance >", value, "confidentialityAllowance");
            return (Criteria) this;
        }

        public Criteria andConfidentialityAllowanceGreaterThanOrEqualTo(Double value) {
            addCriterion("confidentiality_allowance >=", value, "confidentialityAllowance");
            return (Criteria) this;
        }

        public Criteria andConfidentialityAllowanceLessThan(Double value) {
            addCriterion("confidentiality_allowance <", value, "confidentialityAllowance");
            return (Criteria) this;
        }

        public Criteria andConfidentialityAllowanceLessThanOrEqualTo(Double value) {
            addCriterion("confidentiality_allowance <=", value, "confidentialityAllowance");
            return (Criteria) this;
        }

        public Criteria andConfidentialityAllowanceIn(List<Double> values) {
            addCriterion("confidentiality_allowance in", values, "confidentialityAllowance");
            return (Criteria) this;
        }

        public Criteria andConfidentialityAllowanceNotIn(List<Double> values) {
            addCriterion("confidentiality_allowance not in", values, "confidentialityAllowance");
            return (Criteria) this;
        }

        public Criteria andConfidentialityAllowanceBetween(Double value1, Double value2) {
            addCriterion("confidentiality_allowance between", value1, value2, "confidentialityAllowance");
            return (Criteria) this;
        }

        public Criteria andConfidentialityAllowanceNotBetween(Double value1, Double value2) {
            addCriterion("confidentiality_allowance not between", value1, value2, "confidentialityAllowance");
            return (Criteria) this;
        }

        public Criteria andPersonnelStatusIsNull() {
            addCriterion("personnel_status is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelStatusIsNotNull() {
            addCriterion("personnel_status is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelStatusEqualTo(Integer value) {
            addCriterion("personnel_status =", value, "personnelStatus");
            return (Criteria) this;
        }

        public Criteria andPersonnelStatusNotEqualTo(Integer value) {
            addCriterion("personnel_status <>", value, "personnelStatus");
            return (Criteria) this;
        }

        public Criteria andPersonnelStatusGreaterThan(Integer value) {
            addCriterion("personnel_status >", value, "personnelStatus");
            return (Criteria) this;
        }

        public Criteria andPersonnelStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("personnel_status >=", value, "personnelStatus");
            return (Criteria) this;
        }

        public Criteria andPersonnelStatusLessThan(Integer value) {
            addCriterion("personnel_status <", value, "personnelStatus");
            return (Criteria) this;
        }

        public Criteria andPersonnelStatusLessThanOrEqualTo(Integer value) {
            addCriterion("personnel_status <=", value, "personnelStatus");
            return (Criteria) this;
        }

        public Criteria andPersonnelStatusIn(List<Integer> values) {
            addCriterion("personnel_status in", values, "personnelStatus");
            return (Criteria) this;
        }

        public Criteria andPersonnelStatusNotIn(List<Integer> values) {
            addCriterion("personnel_status not in", values, "personnelStatus");
            return (Criteria) this;
        }

        public Criteria andPersonnelStatusBetween(Integer value1, Integer value2) {
            addCriterion("personnel_status between", value1, value2, "personnelStatus");
            return (Criteria) this;
        }

        public Criteria andPersonnelStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("personnel_status not between", value1, value2, "personnelStatus");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNull() {
            addCriterion("leave_time is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNotNull() {
            addCriterion("leave_time is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEqualTo(Date value) {
            addCriterion("leave_time =", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotEqualTo(Date value) {
            addCriterion("leave_time <>", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThan(Date value) {
            addCriterion("leave_time >", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("leave_time >=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThan(Date value) {
            addCriterion("leave_time <", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThanOrEqualTo(Date value) {
            addCriterion("leave_time <=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIn(List<Date> values) {
            addCriterion("leave_time in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotIn(List<Date> values) {
            addCriterion("leave_time not in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeBetween(Date value1, Date value2) {
            addCriterion("leave_time between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotBetween(Date value1, Date value2) {
            addCriterion("leave_time not between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andDeclassificationTimeIsNull() {
            addCriterion("declassification_time is null");
            return (Criteria) this;
        }

        public Criteria andDeclassificationTimeIsNotNull() {
            addCriterion("declassification_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeclassificationTimeEqualTo(Date value) {
            addCriterion("declassification_time =", value, "declassificationTime");
            return (Criteria) this;
        }

        public Criteria andDeclassificationTimeNotEqualTo(Date value) {
            addCriterion("declassification_time <>", value, "declassificationTime");
            return (Criteria) this;
        }

        public Criteria andDeclassificationTimeGreaterThan(Date value) {
            addCriterion("declassification_time >", value, "declassificationTime");
            return (Criteria) this;
        }

        public Criteria andDeclassificationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("declassification_time >=", value, "declassificationTime");
            return (Criteria) this;
        }

        public Criteria andDeclassificationTimeLessThan(Date value) {
            addCriterion("declassification_time <", value, "declassificationTime");
            return (Criteria) this;
        }

        public Criteria andDeclassificationTimeLessThanOrEqualTo(Date value) {
            addCriterion("declassification_time <=", value, "declassificationTime");
            return (Criteria) this;
        }

        public Criteria andDeclassificationTimeIn(List<Date> values) {
            addCriterion("declassification_time in", values, "declassificationTime");
            return (Criteria) this;
        }

        public Criteria andDeclassificationTimeNotIn(List<Date> values) {
            addCriterion("declassification_time not in", values, "declassificationTime");
            return (Criteria) this;
        }

        public Criteria andDeclassificationTimeBetween(Date value1, Date value2) {
            addCriterion("declassification_time between", value1, value2, "declassificationTime");
            return (Criteria) this;
        }

        public Criteria andDeclassificationTimeNotBetween(Date value1, Date value2) {
            addCriterion("declassification_time not between", value1, value2, "declassificationTime");
            return (Criteria) this;
        }

        public Criteria andBadHabitsIsNull() {
            addCriterion("bad_habits is null");
            return (Criteria) this;
        }

        public Criteria andBadHabitsIsNotNull() {
            addCriterion("bad_habits is not null");
            return (Criteria) this;
        }

        public Criteria andBadHabitsEqualTo(String value) {
            addCriterion("bad_habits =", value, "badHabits");
            return (Criteria) this;
        }

        public Criteria andBadHabitsNotEqualTo(String value) {
            addCriterion("bad_habits <>", value, "badHabits");
            return (Criteria) this;
        }

        public Criteria andBadHabitsGreaterThan(String value) {
            addCriterion("bad_habits >", value, "badHabits");
            return (Criteria) this;
        }

        public Criteria andBadHabitsGreaterThanOrEqualTo(String value) {
            addCriterion("bad_habits >=", value, "badHabits");
            return (Criteria) this;
        }

        public Criteria andBadHabitsLessThan(String value) {
            addCriterion("bad_habits <", value, "badHabits");
            return (Criteria) this;
        }

        public Criteria andBadHabitsLessThanOrEqualTo(String value) {
            addCriterion("bad_habits <=", value, "badHabits");
            return (Criteria) this;
        }

        public Criteria andBadHabitsLike(String value) {
            addCriterion("bad_habits like", value, "badHabits");
            return (Criteria) this;
        }

        public Criteria andBadHabitsNotLike(String value) {
            addCriterion("bad_habits not like", value, "badHabits");
            return (Criteria) this;
        }

        public Criteria andBadHabitsIn(List<String> values) {
            addCriterion("bad_habits in", values, "badHabits");
            return (Criteria) this;
        }

        public Criteria andBadHabitsNotIn(List<String> values) {
            addCriterion("bad_habits not in", values, "badHabits");
            return (Criteria) this;
        }

        public Criteria andBadHabitsBetween(String value1, String value2) {
            addCriterion("bad_habits between", value1, value2, "badHabits");
            return (Criteria) this;
        }

        public Criteria andBadHabitsNotBetween(String value1, String value2) {
            addCriterion("bad_habits not between", value1, value2, "badHabits");
            return (Criteria) this;
        }

        public Criteria andOtherSituationsIsNull() {
            addCriterion("other_situations is null");
            return (Criteria) this;
        }

        public Criteria andOtherSituationsIsNotNull() {
            addCriterion("other_situations is not null");
            return (Criteria) this;
        }

        public Criteria andOtherSituationsEqualTo(String value) {
            addCriterion("other_situations =", value, "otherSituations");
            return (Criteria) this;
        }

        public Criteria andOtherSituationsNotEqualTo(String value) {
            addCriterion("other_situations <>", value, "otherSituations");
            return (Criteria) this;
        }

        public Criteria andOtherSituationsGreaterThan(String value) {
            addCriterion("other_situations >", value, "otherSituations");
            return (Criteria) this;
        }

        public Criteria andOtherSituationsGreaterThanOrEqualTo(String value) {
            addCriterion("other_situations >=", value, "otherSituations");
            return (Criteria) this;
        }

        public Criteria andOtherSituationsLessThan(String value) {
            addCriterion("other_situations <", value, "otherSituations");
            return (Criteria) this;
        }

        public Criteria andOtherSituationsLessThanOrEqualTo(String value) {
            addCriterion("other_situations <=", value, "otherSituations");
            return (Criteria) this;
        }

        public Criteria andOtherSituationsLike(String value) {
            addCriterion("other_situations like", value, "otherSituations");
            return (Criteria) this;
        }

        public Criteria andOtherSituationsNotLike(String value) {
            addCriterion("other_situations not like", value, "otherSituations");
            return (Criteria) this;
        }

        public Criteria andOtherSituationsIn(List<String> values) {
            addCriterion("other_situations in", values, "otherSituations");
            return (Criteria) this;
        }

        public Criteria andOtherSituationsNotIn(List<String> values) {
            addCriterion("other_situations not in", values, "otherSituations");
            return (Criteria) this;
        }

        public Criteria andOtherSituationsBetween(String value1, String value2) {
            addCriterion("other_situations between", value1, value2, "otherSituations");
            return (Criteria) this;
        }

        public Criteria andOtherSituationsNotBetween(String value1, String value2) {
            addCriterion("other_situations not between", value1, value2, "otherSituations");
            return (Criteria) this;
        }

        public Criteria andPromiseIsNull() {
            addCriterion("promise is null");
            return (Criteria) this;
        }

        public Criteria andPromiseIsNotNull() {
            addCriterion("promise is not null");
            return (Criteria) this;
        }

        public Criteria andPromiseEqualTo(Byte value) {
            addCriterion("promise =", value, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseNotEqualTo(Byte value) {
            addCriterion("promise <>", value, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseGreaterThan(Byte value) {
            addCriterion("promise >", value, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseGreaterThanOrEqualTo(Byte value) {
            addCriterion("promise >=", value, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseLessThan(Byte value) {
            addCriterion("promise <", value, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseLessThanOrEqualTo(Byte value) {
            addCriterion("promise <=", value, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseIn(List<Byte> values) {
            addCriterion("promise in", values, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseNotIn(List<Byte> values) {
            addCriterion("promise not in", values, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseBetween(Byte value1, Byte value2) {
            addCriterion("promise between", value1, value2, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseNotBetween(Byte value1, Byte value2) {
            addCriterion("promise not between", value1, value2, "promise");
            return (Criteria) this;
        }

        public Criteria andPromiseTimeIsNull() {
            addCriterion("promise_time is null");
            return (Criteria) this;
        }

        public Criteria andPromiseTimeIsNotNull() {
            addCriterion("promise_time is not null");
            return (Criteria) this;
        }

        public Criteria andPromiseTimeEqualTo(Date value) {
            addCriterion("promise_time =", value, "promiseTime");
            return (Criteria) this;
        }

        public Criteria andPromiseTimeNotEqualTo(Date value) {
            addCriterion("promise_time <>", value, "promiseTime");
            return (Criteria) this;
        }

        public Criteria andPromiseTimeGreaterThan(Date value) {
            addCriterion("promise_time >", value, "promiseTime");
            return (Criteria) this;
        }

        public Criteria andPromiseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("promise_time >=", value, "promiseTime");
            return (Criteria) this;
        }

        public Criteria andPromiseTimeLessThan(Date value) {
            addCriterion("promise_time <", value, "promiseTime");
            return (Criteria) this;
        }

        public Criteria andPromiseTimeLessThanOrEqualTo(Date value) {
            addCriterion("promise_time <=", value, "promiseTime");
            return (Criteria) this;
        }

        public Criteria andPromiseTimeIn(List<Date> values) {
            addCriterion("promise_time in", values, "promiseTime");
            return (Criteria) this;
        }

        public Criteria andPromiseTimeNotIn(List<Date> values) {
            addCriterion("promise_time not in", values, "promiseTime");
            return (Criteria) this;
        }

        public Criteria andPromiseTimeBetween(Date value1, Date value2) {
            addCriterion("promise_time between", value1, value2, "promiseTime");
            return (Criteria) this;
        }

        public Criteria andPromiseTimeNotBetween(Date value1, Date value2) {
            addCriterion("promise_time not between", value1, value2, "promiseTime");
            return (Criteria) this;
        }

        public Criteria andPromiseFileLocationIsNull() {
            addCriterion("promise_file_location is null");
            return (Criteria) this;
        }

        public Criteria andPromiseFileLocationIsNotNull() {
            addCriterion("promise_file_location is not null");
            return (Criteria) this;
        }

        public Criteria andPromiseFileLocationEqualTo(String value) {
            addCriterion("promise_file_location =", value, "promiseFileLocation");
            return (Criteria) this;
        }

        public Criteria andPromiseFileLocationNotEqualTo(String value) {
            addCriterion("promise_file_location <>", value, "promiseFileLocation");
            return (Criteria) this;
        }

        public Criteria andPromiseFileLocationGreaterThan(String value) {
            addCriterion("promise_file_location >", value, "promiseFileLocation");
            return (Criteria) this;
        }

        public Criteria andPromiseFileLocationGreaterThanOrEqualTo(String value) {
            addCriterion("promise_file_location >=", value, "promiseFileLocation");
            return (Criteria) this;
        }

        public Criteria andPromiseFileLocationLessThan(String value) {
            addCriterion("promise_file_location <", value, "promiseFileLocation");
            return (Criteria) this;
        }

        public Criteria andPromiseFileLocationLessThanOrEqualTo(String value) {
            addCriterion("promise_file_location <=", value, "promiseFileLocation");
            return (Criteria) this;
        }

        public Criteria andPromiseFileLocationLike(String value) {
            addCriterion("promise_file_location like", value, "promiseFileLocation");
            return (Criteria) this;
        }

        public Criteria andPromiseFileLocationNotLike(String value) {
            addCriterion("promise_file_location not like", value, "promiseFileLocation");
            return (Criteria) this;
        }

        public Criteria andPromiseFileLocationIn(List<String> values) {
            addCriterion("promise_file_location in", values, "promiseFileLocation");
            return (Criteria) this;
        }

        public Criteria andPromiseFileLocationNotIn(List<String> values) {
            addCriterion("promise_file_location not in", values, "promiseFileLocation");
            return (Criteria) this;
        }

        public Criteria andPromiseFileLocationBetween(String value1, String value2) {
            addCriterion("promise_file_location between", value1, value2, "promiseFileLocation");
            return (Criteria) this;
        }

        public Criteria andPromiseFileLocationNotBetween(String value1, String value2) {
            addCriterion("promise_file_location not between", value1, value2, "promiseFileLocation");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(Long value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(Long value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(Long value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(Long value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(Long value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(Long value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<Long> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<Long> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(Long value1, Long value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(Long value1, Long value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
    t_secret_personnel_info
     *
     * @mbg.generated do_not_delete_during_merge Fri Mar 05 15:46:26 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class corresponds to the database table t_secret_personnel_info
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