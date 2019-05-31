package com.ethan.oasy.pojo;

import java.util.ArrayList;
import java.util.List;

public class EntryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EntryExample() {
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

        public Criteria andEnIdIsNull() {
            addCriterion("en_id is null");
            return (Criteria) this;
        }

        public Criteria andEnIdIsNotNull() {
            addCriterion("en_id is not null");
            return (Criteria) this;
        }

        public Criteria andEnIdEqualTo(String value) {
            addCriterion("en_id =", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdNotEqualTo(String value) {
            addCriterion("en_id <>", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdGreaterThan(String value) {
            addCriterion("en_id >", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdGreaterThanOrEqualTo(String value) {
            addCriterion("en_id >=", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdLessThan(String value) {
            addCriterion("en_id <", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdLessThanOrEqualTo(String value) {
            addCriterion("en_id <=", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdLike(String value) {
            addCriterion("en_id like", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdNotLike(String value) {
            addCriterion("en_id not like", value, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdIn(List<String> values) {
            addCriterion("en_id in", values, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdNotIn(List<String> values) {
            addCriterion("en_id not in", values, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdBetween(String value1, String value2) {
            addCriterion("en_id between", value1, value2, "enId");
            return (Criteria) this;
        }

        public Criteria andEnIdNotBetween(String value1, String value2) {
            addCriterion("en_id not between", value1, value2, "enId");
            return (Criteria) this;
        }

        public Criteria andEnNumIsNull() {
            addCriterion("en_num is null");
            return (Criteria) this;
        }

        public Criteria andEnNumIsNotNull() {
            addCriterion("en_num is not null");
            return (Criteria) this;
        }

        public Criteria andEnNumEqualTo(String value) {
            addCriterion("en_num =", value, "enNum");
            return (Criteria) this;
        }

        public Criteria andEnNumNotEqualTo(String value) {
            addCriterion("en_num <>", value, "enNum");
            return (Criteria) this;
        }

        public Criteria andEnNumGreaterThan(String value) {
            addCriterion("en_num >", value, "enNum");
            return (Criteria) this;
        }

        public Criteria andEnNumGreaterThanOrEqualTo(String value) {
            addCriterion("en_num >=", value, "enNum");
            return (Criteria) this;
        }

        public Criteria andEnNumLessThan(String value) {
            addCriterion("en_num <", value, "enNum");
            return (Criteria) this;
        }

        public Criteria andEnNumLessThanOrEqualTo(String value) {
            addCriterion("en_num <=", value, "enNum");
            return (Criteria) this;
        }

        public Criteria andEnNumLike(String value) {
            addCriterion("en_num like", value, "enNum");
            return (Criteria) this;
        }

        public Criteria andEnNumNotLike(String value) {
            addCriterion("en_num not like", value, "enNum");
            return (Criteria) this;
        }

        public Criteria andEnNumIn(List<String> values) {
            addCriterion("en_num in", values, "enNum");
            return (Criteria) this;
        }

        public Criteria andEnNumNotIn(List<String> values) {
            addCriterion("en_num not in", values, "enNum");
            return (Criteria) this;
        }

        public Criteria andEnNumBetween(String value1, String value2) {
            addCriterion("en_num between", value1, value2, "enNum");
            return (Criteria) this;
        }

        public Criteria andEnNumNotBetween(String value1, String value2) {
            addCriterion("en_num not between", value1, value2, "enNum");
            return (Criteria) this;
        }

        public Criteria andEnNameIsNull() {
            addCriterion("en_name is null");
            return (Criteria) this;
        }

        public Criteria andEnNameIsNotNull() {
            addCriterion("en_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnNameEqualTo(String value) {
            addCriterion("en_name =", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotEqualTo(String value) {
            addCriterion("en_name <>", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameGreaterThan(String value) {
            addCriterion("en_name >", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("en_name >=", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLessThan(String value) {
            addCriterion("en_name <", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLessThanOrEqualTo(String value) {
            addCriterion("en_name <=", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameLike(String value) {
            addCriterion("en_name like", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotLike(String value) {
            addCriterion("en_name not like", value, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameIn(List<String> values) {
            addCriterion("en_name in", values, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotIn(List<String> values) {
            addCriterion("en_name not in", values, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameBetween(String value1, String value2) {
            addCriterion("en_name between", value1, value2, "enName");
            return (Criteria) this;
        }

        public Criteria andEnNameNotBetween(String value1, String value2) {
            addCriterion("en_name not between", value1, value2, "enName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNull() {
            addCriterion("staff_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("staff_name =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("staff_name <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("staff_name >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_name >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("staff_name <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("staff_name <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("staff_name like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("staff_name not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("staff_name in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("staff_name not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("staff_name between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("staff_name not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(String value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(String value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(String value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(String value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(String value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLike(String value) {
            addCriterion("staff_id like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotLike(String value) {
            addCriterion("staff_id not like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<String> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<String> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(String value1, String value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(String value1, String value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffSexIsNull() {
            addCriterion("staff_sex is null");
            return (Criteria) this;
        }

        public Criteria andStaffSexIsNotNull() {
            addCriterion("staff_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStaffSexEqualTo(Integer value) {
            addCriterion("staff_sex =", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotEqualTo(Integer value) {
            addCriterion("staff_sex <>", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexGreaterThan(Integer value) {
            addCriterion("staff_sex >", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_sex >=", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLessThan(Integer value) {
            addCriterion("staff_sex <", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexLessThanOrEqualTo(Integer value) {
            addCriterion("staff_sex <=", value, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexIn(List<Integer> values) {
            addCriterion("staff_sex in", values, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotIn(List<Integer> values) {
            addCriterion("staff_sex not in", values, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexBetween(Integer value1, Integer value2) {
            addCriterion("staff_sex between", value1, value2, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffSexNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_sex not between", value1, value2, "staffSex");
            return (Criteria) this;
        }

        public Criteria andStaffInDateIsNull() {
            addCriterion("staff_in_date is null");
            return (Criteria) this;
        }

        public Criteria andStaffInDateIsNotNull() {
            addCriterion("staff_in_date is not null");
            return (Criteria) this;
        }

        public Criteria andStaffInDateEqualTo(String value) {
            addCriterion("staff_in_date =", value, "staffInDate");
            return (Criteria) this;
        }

        public Criteria andStaffInDateNotEqualTo(String value) {
            addCriterion("staff_in_date <>", value, "staffInDate");
            return (Criteria) this;
        }

        public Criteria andStaffInDateGreaterThan(String value) {
            addCriterion("staff_in_date >", value, "staffInDate");
            return (Criteria) this;
        }

        public Criteria andStaffInDateGreaterThanOrEqualTo(String value) {
            addCriterion("staff_in_date >=", value, "staffInDate");
            return (Criteria) this;
        }

        public Criteria andStaffInDateLessThan(String value) {
            addCriterion("staff_in_date <", value, "staffInDate");
            return (Criteria) this;
        }

        public Criteria andStaffInDateLessThanOrEqualTo(String value) {
            addCriterion("staff_in_date <=", value, "staffInDate");
            return (Criteria) this;
        }

        public Criteria andStaffInDateLike(String value) {
            addCriterion("staff_in_date like", value, "staffInDate");
            return (Criteria) this;
        }

        public Criteria andStaffInDateNotLike(String value) {
            addCriterion("staff_in_date not like", value, "staffInDate");
            return (Criteria) this;
        }

        public Criteria andStaffInDateIn(List<String> values) {
            addCriterion("staff_in_date in", values, "staffInDate");
            return (Criteria) this;
        }

        public Criteria andStaffInDateNotIn(List<String> values) {
            addCriterion("staff_in_date not in", values, "staffInDate");
            return (Criteria) this;
        }

        public Criteria andStaffInDateBetween(String value1, String value2) {
            addCriterion("staff_in_date between", value1, value2, "staffInDate");
            return (Criteria) this;
        }

        public Criteria andStaffInDateNotBetween(String value1, String value2) {
            addCriterion("staff_in_date not between", value1, value2, "staffInDate");
            return (Criteria) this;
        }

        public Criteria andStaffDepartIdIsNull() {
            addCriterion("staff_depart_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffDepartIdIsNotNull() {
            addCriterion("staff_depart_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffDepartIdEqualTo(String value) {
            addCriterion("staff_depart_id =", value, "staffDepartId");
            return (Criteria) this;
        }

        public Criteria andStaffDepartIdNotEqualTo(String value) {
            addCriterion("staff_depart_id <>", value, "staffDepartId");
            return (Criteria) this;
        }

        public Criteria andStaffDepartIdGreaterThan(String value) {
            addCriterion("staff_depart_id >", value, "staffDepartId");
            return (Criteria) this;
        }

        public Criteria andStaffDepartIdGreaterThanOrEqualTo(String value) {
            addCriterion("staff_depart_id >=", value, "staffDepartId");
            return (Criteria) this;
        }

        public Criteria andStaffDepartIdLessThan(String value) {
            addCriterion("staff_depart_id <", value, "staffDepartId");
            return (Criteria) this;
        }

        public Criteria andStaffDepartIdLessThanOrEqualTo(String value) {
            addCriterion("staff_depart_id <=", value, "staffDepartId");
            return (Criteria) this;
        }

        public Criteria andStaffDepartIdLike(String value) {
            addCriterion("staff_depart_id like", value, "staffDepartId");
            return (Criteria) this;
        }

        public Criteria andStaffDepartIdNotLike(String value) {
            addCriterion("staff_depart_id not like", value, "staffDepartId");
            return (Criteria) this;
        }

        public Criteria andStaffDepartIdIn(List<String> values) {
            addCriterion("staff_depart_id in", values, "staffDepartId");
            return (Criteria) this;
        }

        public Criteria andStaffDepartIdNotIn(List<String> values) {
            addCriterion("staff_depart_id not in", values, "staffDepartId");
            return (Criteria) this;
        }

        public Criteria andStaffDepartIdBetween(String value1, String value2) {
            addCriterion("staff_depart_id between", value1, value2, "staffDepartId");
            return (Criteria) this;
        }

        public Criteria andStaffDepartIdNotBetween(String value1, String value2) {
            addCriterion("staff_depart_id not between", value1, value2, "staffDepartId");
            return (Criteria) this;
        }

        public Criteria andStaffPosiIdIsNull() {
            addCriterion("staff_posi_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffPosiIdIsNotNull() {
            addCriterion("staff_posi_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffPosiIdEqualTo(String value) {
            addCriterion("staff_posi_id =", value, "staffPosiId");
            return (Criteria) this;
        }

        public Criteria andStaffPosiIdNotEqualTo(String value) {
            addCriterion("staff_posi_id <>", value, "staffPosiId");
            return (Criteria) this;
        }

        public Criteria andStaffPosiIdGreaterThan(String value) {
            addCriterion("staff_posi_id >", value, "staffPosiId");
            return (Criteria) this;
        }

        public Criteria andStaffPosiIdGreaterThanOrEqualTo(String value) {
            addCriterion("staff_posi_id >=", value, "staffPosiId");
            return (Criteria) this;
        }

        public Criteria andStaffPosiIdLessThan(String value) {
            addCriterion("staff_posi_id <", value, "staffPosiId");
            return (Criteria) this;
        }

        public Criteria andStaffPosiIdLessThanOrEqualTo(String value) {
            addCriterion("staff_posi_id <=", value, "staffPosiId");
            return (Criteria) this;
        }

        public Criteria andStaffPosiIdLike(String value) {
            addCriterion("staff_posi_id like", value, "staffPosiId");
            return (Criteria) this;
        }

        public Criteria andStaffPosiIdNotLike(String value) {
            addCriterion("staff_posi_id not like", value, "staffPosiId");
            return (Criteria) this;
        }

        public Criteria andStaffPosiIdIn(List<String> values) {
            addCriterion("staff_posi_id in", values, "staffPosiId");
            return (Criteria) this;
        }

        public Criteria andStaffPosiIdNotIn(List<String> values) {
            addCriterion("staff_posi_id not in", values, "staffPosiId");
            return (Criteria) this;
        }

        public Criteria andStaffPosiIdBetween(String value1, String value2) {
            addCriterion("staff_posi_id between", value1, value2, "staffPosiId");
            return (Criteria) this;
        }

        public Criteria andStaffPosiIdNotBetween(String value1, String value2) {
            addCriterion("staff_posi_id not between", value1, value2, "staffPosiId");
            return (Criteria) this;
        }

        public Criteria andStaffTypeIsNull() {
            addCriterion("staff_type is null");
            return (Criteria) this;
        }

        public Criteria andStaffTypeIsNotNull() {
            addCriterion("staff_type is not null");
            return (Criteria) this;
        }

        public Criteria andStaffTypeEqualTo(Integer value) {
            addCriterion("staff_type =", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeNotEqualTo(Integer value) {
            addCriterion("staff_type <>", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeGreaterThan(Integer value) {
            addCriterion("staff_type >", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_type >=", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeLessThan(Integer value) {
            addCriterion("staff_type <", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeLessThanOrEqualTo(Integer value) {
            addCriterion("staff_type <=", value, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeIn(List<Integer> values) {
            addCriterion("staff_type in", values, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeNotIn(List<Integer> values) {
            addCriterion("staff_type not in", values, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeBetween(Integer value1, Integer value2) {
            addCriterion("staff_type between", value1, value2, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_type not between", value1, value2, "staffType");
            return (Criteria) this;
        }

        public Criteria andStaffSchoolIsNull() {
            addCriterion("staff_school is null");
            return (Criteria) this;
        }

        public Criteria andStaffSchoolIsNotNull() {
            addCriterion("staff_school is not null");
            return (Criteria) this;
        }

        public Criteria andStaffSchoolEqualTo(String value) {
            addCriterion("staff_school =", value, "staffSchool");
            return (Criteria) this;
        }

        public Criteria andStaffSchoolNotEqualTo(String value) {
            addCriterion("staff_school <>", value, "staffSchool");
            return (Criteria) this;
        }

        public Criteria andStaffSchoolGreaterThan(String value) {
            addCriterion("staff_school >", value, "staffSchool");
            return (Criteria) this;
        }

        public Criteria andStaffSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("staff_school >=", value, "staffSchool");
            return (Criteria) this;
        }

        public Criteria andStaffSchoolLessThan(String value) {
            addCriterion("staff_school <", value, "staffSchool");
            return (Criteria) this;
        }

        public Criteria andStaffSchoolLessThanOrEqualTo(String value) {
            addCriterion("staff_school <=", value, "staffSchool");
            return (Criteria) this;
        }

        public Criteria andStaffSchoolLike(String value) {
            addCriterion("staff_school like", value, "staffSchool");
            return (Criteria) this;
        }

        public Criteria andStaffSchoolNotLike(String value) {
            addCriterion("staff_school not like", value, "staffSchool");
            return (Criteria) this;
        }

        public Criteria andStaffSchoolIn(List<String> values) {
            addCriterion("staff_school in", values, "staffSchool");
            return (Criteria) this;
        }

        public Criteria andStaffSchoolNotIn(List<String> values) {
            addCriterion("staff_school not in", values, "staffSchool");
            return (Criteria) this;
        }

        public Criteria andStaffSchoolBetween(String value1, String value2) {
            addCriterion("staff_school between", value1, value2, "staffSchool");
            return (Criteria) this;
        }

        public Criteria andStaffSchoolNotBetween(String value1, String value2) {
            addCriterion("staff_school not between", value1, value2, "staffSchool");
            return (Criteria) this;
        }

        public Criteria andStaffFormalIsNull() {
            addCriterion("staff_formal is null");
            return (Criteria) this;
        }

        public Criteria andStaffFormalIsNotNull() {
            addCriterion("staff_formal is not null");
            return (Criteria) this;
        }

        public Criteria andStaffFormalEqualTo(String value) {
            addCriterion("staff_formal =", value, "staffFormal");
            return (Criteria) this;
        }

        public Criteria andStaffFormalNotEqualTo(String value) {
            addCriterion("staff_formal <>", value, "staffFormal");
            return (Criteria) this;
        }

        public Criteria andStaffFormalGreaterThan(String value) {
            addCriterion("staff_formal >", value, "staffFormal");
            return (Criteria) this;
        }

        public Criteria andStaffFormalGreaterThanOrEqualTo(String value) {
            addCriterion("staff_formal >=", value, "staffFormal");
            return (Criteria) this;
        }

        public Criteria andStaffFormalLessThan(String value) {
            addCriterion("staff_formal <", value, "staffFormal");
            return (Criteria) this;
        }

        public Criteria andStaffFormalLessThanOrEqualTo(String value) {
            addCriterion("staff_formal <=", value, "staffFormal");
            return (Criteria) this;
        }

        public Criteria andStaffFormalLike(String value) {
            addCriterion("staff_formal like", value, "staffFormal");
            return (Criteria) this;
        }

        public Criteria andStaffFormalNotLike(String value) {
            addCriterion("staff_formal not like", value, "staffFormal");
            return (Criteria) this;
        }

        public Criteria andStaffFormalIn(List<String> values) {
            addCriterion("staff_formal in", values, "staffFormal");
            return (Criteria) this;
        }

        public Criteria andStaffFormalNotIn(List<String> values) {
            addCriterion("staff_formal not in", values, "staffFormal");
            return (Criteria) this;
        }

        public Criteria andStaffFormalBetween(String value1, String value2) {
            addCriterion("staff_formal between", value1, value2, "staffFormal");
            return (Criteria) this;
        }

        public Criteria andStaffFormalNotBetween(String value1, String value2) {
            addCriterion("staff_formal not between", value1, value2, "staffFormal");
            return (Criteria) this;
        }

        public Criteria andStaffMajorIsNull() {
            addCriterion("staff_major is null");
            return (Criteria) this;
        }

        public Criteria andStaffMajorIsNotNull() {
            addCriterion("staff_major is not null");
            return (Criteria) this;
        }

        public Criteria andStaffMajorEqualTo(String value) {
            addCriterion("staff_major =", value, "staffMajor");
            return (Criteria) this;
        }

        public Criteria andStaffMajorNotEqualTo(String value) {
            addCriterion("staff_major <>", value, "staffMajor");
            return (Criteria) this;
        }

        public Criteria andStaffMajorGreaterThan(String value) {
            addCriterion("staff_major >", value, "staffMajor");
            return (Criteria) this;
        }

        public Criteria andStaffMajorGreaterThanOrEqualTo(String value) {
            addCriterion("staff_major >=", value, "staffMajor");
            return (Criteria) this;
        }

        public Criteria andStaffMajorLessThan(String value) {
            addCriterion("staff_major <", value, "staffMajor");
            return (Criteria) this;
        }

        public Criteria andStaffMajorLessThanOrEqualTo(String value) {
            addCriterion("staff_major <=", value, "staffMajor");
            return (Criteria) this;
        }

        public Criteria andStaffMajorLike(String value) {
            addCriterion("staff_major like", value, "staffMajor");
            return (Criteria) this;
        }

        public Criteria andStaffMajorNotLike(String value) {
            addCriterion("staff_major not like", value, "staffMajor");
            return (Criteria) this;
        }

        public Criteria andStaffMajorIn(List<String> values) {
            addCriterion("staff_major in", values, "staffMajor");
            return (Criteria) this;
        }

        public Criteria andStaffMajorNotIn(List<String> values) {
            addCriterion("staff_major not in", values, "staffMajor");
            return (Criteria) this;
        }

        public Criteria andStaffMajorBetween(String value1, String value2) {
            addCriterion("staff_major between", value1, value2, "staffMajor");
            return (Criteria) this;
        }

        public Criteria andStaffMajorNotBetween(String value1, String value2) {
            addCriterion("staff_major not between", value1, value2, "staffMajor");
            return (Criteria) this;
        }

        public Criteria andStaffGraduDateIsNull() {
            addCriterion("staff_gradu_date is null");
            return (Criteria) this;
        }

        public Criteria andStaffGraduDateIsNotNull() {
            addCriterion("staff_gradu_date is not null");
            return (Criteria) this;
        }

        public Criteria andStaffGraduDateEqualTo(String value) {
            addCriterion("staff_gradu_date =", value, "staffGraduDate");
            return (Criteria) this;
        }

        public Criteria andStaffGraduDateNotEqualTo(String value) {
            addCriterion("staff_gradu_date <>", value, "staffGraduDate");
            return (Criteria) this;
        }

        public Criteria andStaffGraduDateGreaterThan(String value) {
            addCriterion("staff_gradu_date >", value, "staffGraduDate");
            return (Criteria) this;
        }

        public Criteria andStaffGraduDateGreaterThanOrEqualTo(String value) {
            addCriterion("staff_gradu_date >=", value, "staffGraduDate");
            return (Criteria) this;
        }

        public Criteria andStaffGraduDateLessThan(String value) {
            addCriterion("staff_gradu_date <", value, "staffGraduDate");
            return (Criteria) this;
        }

        public Criteria andStaffGraduDateLessThanOrEqualTo(String value) {
            addCriterion("staff_gradu_date <=", value, "staffGraduDate");
            return (Criteria) this;
        }

        public Criteria andStaffGraduDateLike(String value) {
            addCriterion("staff_gradu_date like", value, "staffGraduDate");
            return (Criteria) this;
        }

        public Criteria andStaffGraduDateNotLike(String value) {
            addCriterion("staff_gradu_date not like", value, "staffGraduDate");
            return (Criteria) this;
        }

        public Criteria andStaffGraduDateIn(List<String> values) {
            addCriterion("staff_gradu_date in", values, "staffGraduDate");
            return (Criteria) this;
        }

        public Criteria andStaffGraduDateNotIn(List<String> values) {
            addCriterion("staff_gradu_date not in", values, "staffGraduDate");
            return (Criteria) this;
        }

        public Criteria andStaffGraduDateBetween(String value1, String value2) {
            addCriterion("staff_gradu_date between", value1, value2, "staffGraduDate");
            return (Criteria) this;
        }

        public Criteria andStaffGraduDateNotBetween(String value1, String value2) {
            addCriterion("staff_gradu_date not between", value1, value2, "staffGraduDate");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipStartDateIsNull() {
            addCriterion("staff_internship_start_date is null");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipStartDateIsNotNull() {
            addCriterion("staff_internship_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipStartDateEqualTo(String value) {
            addCriterion("staff_internship_start_date =", value, "staffInternshipStartDate");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipStartDateNotEqualTo(String value) {
            addCriterion("staff_internship_start_date <>", value, "staffInternshipStartDate");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipStartDateGreaterThan(String value) {
            addCriterion("staff_internship_start_date >", value, "staffInternshipStartDate");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("staff_internship_start_date >=", value, "staffInternshipStartDate");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipStartDateLessThan(String value) {
            addCriterion("staff_internship_start_date <", value, "staffInternshipStartDate");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipStartDateLessThanOrEqualTo(String value) {
            addCriterion("staff_internship_start_date <=", value, "staffInternshipStartDate");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipStartDateLike(String value) {
            addCriterion("staff_internship_start_date like", value, "staffInternshipStartDate");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipStartDateNotLike(String value) {
            addCriterion("staff_internship_start_date not like", value, "staffInternshipStartDate");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipStartDateIn(List<String> values) {
            addCriterion("staff_internship_start_date in", values, "staffInternshipStartDate");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipStartDateNotIn(List<String> values) {
            addCriterion("staff_internship_start_date not in", values, "staffInternshipStartDate");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipStartDateBetween(String value1, String value2) {
            addCriterion("staff_internship_start_date between", value1, value2, "staffInternshipStartDate");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipStartDateNotBetween(String value1, String value2) {
            addCriterion("staff_internship_start_date not between", value1, value2, "staffInternshipStartDate");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipEndDateIsNull() {
            addCriterion("staff_internship_end_date is null");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipEndDateIsNotNull() {
            addCriterion("staff_internship_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipEndDateEqualTo(String value) {
            addCriterion("staff_internship_end_date =", value, "staffInternshipEndDate");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipEndDateNotEqualTo(String value) {
            addCriterion("staff_internship_end_date <>", value, "staffInternshipEndDate");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipEndDateGreaterThan(String value) {
            addCriterion("staff_internship_end_date >", value, "staffInternshipEndDate");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("staff_internship_end_date >=", value, "staffInternshipEndDate");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipEndDateLessThan(String value) {
            addCriterion("staff_internship_end_date <", value, "staffInternshipEndDate");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipEndDateLessThanOrEqualTo(String value) {
            addCriterion("staff_internship_end_date <=", value, "staffInternshipEndDate");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipEndDateLike(String value) {
            addCriterion("staff_internship_end_date like", value, "staffInternshipEndDate");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipEndDateNotLike(String value) {
            addCriterion("staff_internship_end_date not like", value, "staffInternshipEndDate");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipEndDateIn(List<String> values) {
            addCriterion("staff_internship_end_date in", values, "staffInternshipEndDate");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipEndDateNotIn(List<String> values) {
            addCriterion("staff_internship_end_date not in", values, "staffInternshipEndDate");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipEndDateBetween(String value1, String value2) {
            addCriterion("staff_internship_end_date between", value1, value2, "staffInternshipEndDate");
            return (Criteria) this;
        }

        public Criteria andStaffInternshipEndDateNotBetween(String value1, String value2) {
            addCriterion("staff_internship_end_date not between", value1, value2, "staffInternshipEndDate");
            return (Criteria) this;
        }

        public Criteria andStaffOringinPartIsNull() {
            addCriterion("staff_oringin_part is null");
            return (Criteria) this;
        }

        public Criteria andStaffOringinPartIsNotNull() {
            addCriterion("staff_oringin_part is not null");
            return (Criteria) this;
        }

        public Criteria andStaffOringinPartEqualTo(String value) {
            addCriterion("staff_oringin_part =", value, "staffOringinPart");
            return (Criteria) this;
        }

        public Criteria andStaffOringinPartNotEqualTo(String value) {
            addCriterion("staff_oringin_part <>", value, "staffOringinPart");
            return (Criteria) this;
        }

        public Criteria andStaffOringinPartGreaterThan(String value) {
            addCriterion("staff_oringin_part >", value, "staffOringinPart");
            return (Criteria) this;
        }

        public Criteria andStaffOringinPartGreaterThanOrEqualTo(String value) {
            addCriterion("staff_oringin_part >=", value, "staffOringinPart");
            return (Criteria) this;
        }

        public Criteria andStaffOringinPartLessThan(String value) {
            addCriterion("staff_oringin_part <", value, "staffOringinPart");
            return (Criteria) this;
        }

        public Criteria andStaffOringinPartLessThanOrEqualTo(String value) {
            addCriterion("staff_oringin_part <=", value, "staffOringinPart");
            return (Criteria) this;
        }

        public Criteria andStaffOringinPartLike(String value) {
            addCriterion("staff_oringin_part like", value, "staffOringinPart");
            return (Criteria) this;
        }

        public Criteria andStaffOringinPartNotLike(String value) {
            addCriterion("staff_oringin_part not like", value, "staffOringinPart");
            return (Criteria) this;
        }

        public Criteria andStaffOringinPartIn(List<String> values) {
            addCriterion("staff_oringin_part in", values, "staffOringinPart");
            return (Criteria) this;
        }

        public Criteria andStaffOringinPartNotIn(List<String> values) {
            addCriterion("staff_oringin_part not in", values, "staffOringinPart");
            return (Criteria) this;
        }

        public Criteria andStaffOringinPartBetween(String value1, String value2) {
            addCriterion("staff_oringin_part between", value1, value2, "staffOringinPart");
            return (Criteria) this;
        }

        public Criteria andStaffOringinPartNotBetween(String value1, String value2) {
            addCriterion("staff_oringin_part not between", value1, value2, "staffOringinPart");
            return (Criteria) this;
        }

        public Criteria andStaffResidencePartIsNull() {
            addCriterion("staff_residence_part is null");
            return (Criteria) this;
        }

        public Criteria andStaffResidencePartIsNotNull() {
            addCriterion("staff_residence_part is not null");
            return (Criteria) this;
        }

        public Criteria andStaffResidencePartEqualTo(String value) {
            addCriterion("staff_residence_part =", value, "staffResidencePart");
            return (Criteria) this;
        }

        public Criteria andStaffResidencePartNotEqualTo(String value) {
            addCriterion("staff_residence_part <>", value, "staffResidencePart");
            return (Criteria) this;
        }

        public Criteria andStaffResidencePartGreaterThan(String value) {
            addCriterion("staff_residence_part >", value, "staffResidencePart");
            return (Criteria) this;
        }

        public Criteria andStaffResidencePartGreaterThanOrEqualTo(String value) {
            addCriterion("staff_residence_part >=", value, "staffResidencePart");
            return (Criteria) this;
        }

        public Criteria andStaffResidencePartLessThan(String value) {
            addCriterion("staff_residence_part <", value, "staffResidencePart");
            return (Criteria) this;
        }

        public Criteria andStaffResidencePartLessThanOrEqualTo(String value) {
            addCriterion("staff_residence_part <=", value, "staffResidencePart");
            return (Criteria) this;
        }

        public Criteria andStaffResidencePartLike(String value) {
            addCriterion("staff_residence_part like", value, "staffResidencePart");
            return (Criteria) this;
        }

        public Criteria andStaffResidencePartNotLike(String value) {
            addCriterion("staff_residence_part not like", value, "staffResidencePart");
            return (Criteria) this;
        }

        public Criteria andStaffResidencePartIn(List<String> values) {
            addCriterion("staff_residence_part in", values, "staffResidencePart");
            return (Criteria) this;
        }

        public Criteria andStaffResidencePartNotIn(List<String> values) {
            addCriterion("staff_residence_part not in", values, "staffResidencePart");
            return (Criteria) this;
        }

        public Criteria andStaffResidencePartBetween(String value1, String value2) {
            addCriterion("staff_residence_part between", value1, value2, "staffResidencePart");
            return (Criteria) this;
        }

        public Criteria andStaffResidencePartNotBetween(String value1, String value2) {
            addCriterion("staff_residence_part not between", value1, value2, "staffResidencePart");
            return (Criteria) this;
        }

        public Criteria andPrivateEmailIsNull() {
            addCriterion("private_email is null");
            return (Criteria) this;
        }

        public Criteria andPrivateEmailIsNotNull() {
            addCriterion("private_email is not null");
            return (Criteria) this;
        }

        public Criteria andPrivateEmailEqualTo(String value) {
            addCriterion("private_email =", value, "privateEmail");
            return (Criteria) this;
        }

        public Criteria andPrivateEmailNotEqualTo(String value) {
            addCriterion("private_email <>", value, "privateEmail");
            return (Criteria) this;
        }

        public Criteria andPrivateEmailGreaterThan(String value) {
            addCriterion("private_email >", value, "privateEmail");
            return (Criteria) this;
        }

        public Criteria andPrivateEmailGreaterThanOrEqualTo(String value) {
            addCriterion("private_email >=", value, "privateEmail");
            return (Criteria) this;
        }

        public Criteria andPrivateEmailLessThan(String value) {
            addCriterion("private_email <", value, "privateEmail");
            return (Criteria) this;
        }

        public Criteria andPrivateEmailLessThanOrEqualTo(String value) {
            addCriterion("private_email <=", value, "privateEmail");
            return (Criteria) this;
        }

        public Criteria andPrivateEmailLike(String value) {
            addCriterion("private_email like", value, "privateEmail");
            return (Criteria) this;
        }

        public Criteria andPrivateEmailNotLike(String value) {
            addCriterion("private_email not like", value, "privateEmail");
            return (Criteria) this;
        }

        public Criteria andPrivateEmailIn(List<String> values) {
            addCriterion("private_email in", values, "privateEmail");
            return (Criteria) this;
        }

        public Criteria andPrivateEmailNotIn(List<String> values) {
            addCriterion("private_email not in", values, "privateEmail");
            return (Criteria) this;
        }

        public Criteria andPrivateEmailBetween(String value1, String value2) {
            addCriterion("private_email between", value1, value2, "privateEmail");
            return (Criteria) this;
        }

        public Criteria andPrivateEmailNotBetween(String value1, String value2) {
            addCriterion("private_email not between", value1, value2, "privateEmail");
            return (Criteria) this;
        }

        public Criteria andOfficeTelIsNull() {
            addCriterion("office_tel is null");
            return (Criteria) this;
        }

        public Criteria andOfficeTelIsNotNull() {
            addCriterion("office_tel is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeTelEqualTo(String value) {
            addCriterion("office_tel =", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelNotEqualTo(String value) {
            addCriterion("office_tel <>", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelGreaterThan(String value) {
            addCriterion("office_tel >", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelGreaterThanOrEqualTo(String value) {
            addCriterion("office_tel >=", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelLessThan(String value) {
            addCriterion("office_tel <", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelLessThanOrEqualTo(String value) {
            addCriterion("office_tel <=", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelLike(String value) {
            addCriterion("office_tel like", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelNotLike(String value) {
            addCriterion("office_tel not like", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelIn(List<String> values) {
            addCriterion("office_tel in", values, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelNotIn(List<String> values) {
            addCriterion("office_tel not in", values, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelBetween(String value1, String value2) {
            addCriterion("office_tel between", value1, value2, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelNotBetween(String value1, String value2) {
            addCriterion("office_tel not between", value1, value2, "officeTel");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNull() {
            addCriterion("mobile_phone is null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNotNull() {
            addCriterion("mobile_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneEqualTo(String value) {
            addCriterion("mobile_phone =", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotEqualTo(String value) {
            addCriterion("mobile_phone <>", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThan(String value) {
            addCriterion("mobile_phone >", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_phone >=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThan(String value) {
            addCriterion("mobile_phone <", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("mobile_phone <=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLike(String value) {
            addCriterion("mobile_phone like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotLike(String value) {
            addCriterion("mobile_phone not like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIn(List<String> values) {
            addCriterion("mobile_phone in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotIn(List<String> values) {
            addCriterion("mobile_phone not in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneBetween(String value1, String value2) {
            addCriterion("mobile_phone between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("mobile_phone not between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIsNull() {
            addCriterion("company_email is null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIsNotNull() {
            addCriterion("company_email is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailEqualTo(String value) {
            addCriterion("company_email =", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotEqualTo(String value) {
            addCriterion("company_email <>", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailGreaterThan(String value) {
            addCriterion("company_email >", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailGreaterThanOrEqualTo(String value) {
            addCriterion("company_email >=", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLessThan(String value) {
            addCriterion("company_email <", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLessThanOrEqualTo(String value) {
            addCriterion("company_email <=", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailLike(String value) {
            addCriterion("company_email like", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotLike(String value) {
            addCriterion("company_email not like", value, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailIn(List<String> values) {
            addCriterion("company_email in", values, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotIn(List<String> values) {
            addCriterion("company_email not in", values, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailBetween(String value1, String value2) {
            addCriterion("company_email between", value1, value2, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andCompanyEmailNotBetween(String value1, String value2) {
            addCriterion("company_email not between", value1, value2, "companyEmail");
            return (Criteria) this;
        }

        public Criteria andStaffNowPartIsNull() {
            addCriterion("staff_now_part is null");
            return (Criteria) this;
        }

        public Criteria andStaffNowPartIsNotNull() {
            addCriterion("staff_now_part is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNowPartEqualTo(String value) {
            addCriterion("staff_now_part =", value, "staffNowPart");
            return (Criteria) this;
        }

        public Criteria andStaffNowPartNotEqualTo(String value) {
            addCriterion("staff_now_part <>", value, "staffNowPart");
            return (Criteria) this;
        }

        public Criteria andStaffNowPartGreaterThan(String value) {
            addCriterion("staff_now_part >", value, "staffNowPart");
            return (Criteria) this;
        }

        public Criteria andStaffNowPartGreaterThanOrEqualTo(String value) {
            addCriterion("staff_now_part >=", value, "staffNowPart");
            return (Criteria) this;
        }

        public Criteria andStaffNowPartLessThan(String value) {
            addCriterion("staff_now_part <", value, "staffNowPart");
            return (Criteria) this;
        }

        public Criteria andStaffNowPartLessThanOrEqualTo(String value) {
            addCriterion("staff_now_part <=", value, "staffNowPart");
            return (Criteria) this;
        }

        public Criteria andStaffNowPartLike(String value) {
            addCriterion("staff_now_part like", value, "staffNowPart");
            return (Criteria) this;
        }

        public Criteria andStaffNowPartNotLike(String value) {
            addCriterion("staff_now_part not like", value, "staffNowPart");
            return (Criteria) this;
        }

        public Criteria andStaffNowPartIn(List<String> values) {
            addCriterion("staff_now_part in", values, "staffNowPart");
            return (Criteria) this;
        }

        public Criteria andStaffNowPartNotIn(List<String> values) {
            addCriterion("staff_now_part not in", values, "staffNowPart");
            return (Criteria) this;
        }

        public Criteria andStaffNowPartBetween(String value1, String value2) {
            addCriterion("staff_now_part between", value1, value2, "staffNowPart");
            return (Criteria) this;
        }

        public Criteria andStaffNowPartNotBetween(String value1, String value2) {
            addCriterion("staff_now_part not between", value1, value2, "staffNowPart");
            return (Criteria) this;
        }

        public Criteria andStaffNumIsNull() {
            addCriterion("staff_num is null");
            return (Criteria) this;
        }

        public Criteria andStaffNumIsNotNull() {
            addCriterion("staff_num is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNumEqualTo(String value) {
            addCriterion("staff_num =", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumNotEqualTo(String value) {
            addCriterion("staff_num <>", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumGreaterThan(String value) {
            addCriterion("staff_num >", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumGreaterThanOrEqualTo(String value) {
            addCriterion("staff_num >=", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumLessThan(String value) {
            addCriterion("staff_num <", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumLessThanOrEqualTo(String value) {
            addCriterion("staff_num <=", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumLike(String value) {
            addCriterion("staff_num like", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumNotLike(String value) {
            addCriterion("staff_num not like", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumIn(List<String> values) {
            addCriterion("staff_num in", values, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumNotIn(List<String> values) {
            addCriterion("staff_num not in", values, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumBetween(String value1, String value2) {
            addCriterion("staff_num between", value1, value2, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumNotBetween(String value1, String value2) {
            addCriterion("staff_num not between", value1, value2, "staffNum");
            return (Criteria) this;
        }

        public Criteria andOaNumIsNull() {
            addCriterion("oa_num is null");
            return (Criteria) this;
        }

        public Criteria andOaNumIsNotNull() {
            addCriterion("oa_num is not null");
            return (Criteria) this;
        }

        public Criteria andOaNumEqualTo(String value) {
            addCriterion("oa_num =", value, "oaNum");
            return (Criteria) this;
        }

        public Criteria andOaNumNotEqualTo(String value) {
            addCriterion("oa_num <>", value, "oaNum");
            return (Criteria) this;
        }

        public Criteria andOaNumGreaterThan(String value) {
            addCriterion("oa_num >", value, "oaNum");
            return (Criteria) this;
        }

        public Criteria andOaNumGreaterThanOrEqualTo(String value) {
            addCriterion("oa_num >=", value, "oaNum");
            return (Criteria) this;
        }

        public Criteria andOaNumLessThan(String value) {
            addCriterion("oa_num <", value, "oaNum");
            return (Criteria) this;
        }

        public Criteria andOaNumLessThanOrEqualTo(String value) {
            addCriterion("oa_num <=", value, "oaNum");
            return (Criteria) this;
        }

        public Criteria andOaNumLike(String value) {
            addCriterion("oa_num like", value, "oaNum");
            return (Criteria) this;
        }

        public Criteria andOaNumNotLike(String value) {
            addCriterion("oa_num not like", value, "oaNum");
            return (Criteria) this;
        }

        public Criteria andOaNumIn(List<String> values) {
            addCriterion("oa_num in", values, "oaNum");
            return (Criteria) this;
        }

        public Criteria andOaNumNotIn(List<String> values) {
            addCriterion("oa_num not in", values, "oaNum");
            return (Criteria) this;
        }

        public Criteria andOaNumBetween(String value1, String value2) {
            addCriterion("oa_num between", value1, value2, "oaNum");
            return (Criteria) this;
        }

        public Criteria andOaNumNotBetween(String value1, String value2) {
            addCriterion("oa_num not between", value1, value2, "oaNum");
            return (Criteria) this;
        }

        public Criteria andStaffBankNameIsNull() {
            addCriterion("staff_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffBankNameIsNotNull() {
            addCriterion("staff_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffBankNameEqualTo(String value) {
            addCriterion("staff_bank_name =", value, "staffBankName");
            return (Criteria) this;
        }

        public Criteria andStaffBankNameNotEqualTo(String value) {
            addCriterion("staff_bank_name <>", value, "staffBankName");
            return (Criteria) this;
        }

        public Criteria andStaffBankNameGreaterThan(String value) {
            addCriterion("staff_bank_name >", value, "staffBankName");
            return (Criteria) this;
        }

        public Criteria andStaffBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_bank_name >=", value, "staffBankName");
            return (Criteria) this;
        }

        public Criteria andStaffBankNameLessThan(String value) {
            addCriterion("staff_bank_name <", value, "staffBankName");
            return (Criteria) this;
        }

        public Criteria andStaffBankNameLessThanOrEqualTo(String value) {
            addCriterion("staff_bank_name <=", value, "staffBankName");
            return (Criteria) this;
        }

        public Criteria andStaffBankNameLike(String value) {
            addCriterion("staff_bank_name like", value, "staffBankName");
            return (Criteria) this;
        }

        public Criteria andStaffBankNameNotLike(String value) {
            addCriterion("staff_bank_name not like", value, "staffBankName");
            return (Criteria) this;
        }

        public Criteria andStaffBankNameIn(List<String> values) {
            addCriterion("staff_bank_name in", values, "staffBankName");
            return (Criteria) this;
        }

        public Criteria andStaffBankNameNotIn(List<String> values) {
            addCriterion("staff_bank_name not in", values, "staffBankName");
            return (Criteria) this;
        }

        public Criteria andStaffBankNameBetween(String value1, String value2) {
            addCriterion("staff_bank_name between", value1, value2, "staffBankName");
            return (Criteria) this;
        }

        public Criteria andStaffBankNameNotBetween(String value1, String value2) {
            addCriterion("staff_bank_name not between", value1, value2, "staffBankName");
            return (Criteria) this;
        }

        public Criteria andStaffBankNumIsNull() {
            addCriterion("staff_bank_num is null");
            return (Criteria) this;
        }

        public Criteria andStaffBankNumIsNotNull() {
            addCriterion("staff_bank_num is not null");
            return (Criteria) this;
        }

        public Criteria andStaffBankNumEqualTo(String value) {
            addCriterion("staff_bank_num =", value, "staffBankNum");
            return (Criteria) this;
        }

        public Criteria andStaffBankNumNotEqualTo(String value) {
            addCriterion("staff_bank_num <>", value, "staffBankNum");
            return (Criteria) this;
        }

        public Criteria andStaffBankNumGreaterThan(String value) {
            addCriterion("staff_bank_num >", value, "staffBankNum");
            return (Criteria) this;
        }

        public Criteria andStaffBankNumGreaterThanOrEqualTo(String value) {
            addCriterion("staff_bank_num >=", value, "staffBankNum");
            return (Criteria) this;
        }

        public Criteria andStaffBankNumLessThan(String value) {
            addCriterion("staff_bank_num <", value, "staffBankNum");
            return (Criteria) this;
        }

        public Criteria andStaffBankNumLessThanOrEqualTo(String value) {
            addCriterion("staff_bank_num <=", value, "staffBankNum");
            return (Criteria) this;
        }

        public Criteria andStaffBankNumLike(String value) {
            addCriterion("staff_bank_num like", value, "staffBankNum");
            return (Criteria) this;
        }

        public Criteria andStaffBankNumNotLike(String value) {
            addCriterion("staff_bank_num not like", value, "staffBankNum");
            return (Criteria) this;
        }

        public Criteria andStaffBankNumIn(List<String> values) {
            addCriterion("staff_bank_num in", values, "staffBankNum");
            return (Criteria) this;
        }

        public Criteria andStaffBankNumNotIn(List<String> values) {
            addCriterion("staff_bank_num not in", values, "staffBankNum");
            return (Criteria) this;
        }

        public Criteria andStaffBankNumBetween(String value1, String value2) {
            addCriterion("staff_bank_num between", value1, value2, "staffBankNum");
            return (Criteria) this;
        }

        public Criteria andStaffBankNumNotBetween(String value1, String value2) {
            addCriterion("staff_bank_num not between", value1, value2, "staffBankNum");
            return (Criteria) this;
        }

        public Criteria andSocialInsurancePartIsNull() {
            addCriterion("social_insurance_part is null");
            return (Criteria) this;
        }

        public Criteria andSocialInsurancePartIsNotNull() {
            addCriterion("social_insurance_part is not null");
            return (Criteria) this;
        }

        public Criteria andSocialInsurancePartEqualTo(String value) {
            addCriterion("social_insurance_part =", value, "socialInsurancePart");
            return (Criteria) this;
        }

        public Criteria andSocialInsurancePartNotEqualTo(String value) {
            addCriterion("social_insurance_part <>", value, "socialInsurancePart");
            return (Criteria) this;
        }

        public Criteria andSocialInsurancePartGreaterThan(String value) {
            addCriterion("social_insurance_part >", value, "socialInsurancePart");
            return (Criteria) this;
        }

        public Criteria andSocialInsurancePartGreaterThanOrEqualTo(String value) {
            addCriterion("social_insurance_part >=", value, "socialInsurancePart");
            return (Criteria) this;
        }

        public Criteria andSocialInsurancePartLessThan(String value) {
            addCriterion("social_insurance_part <", value, "socialInsurancePart");
            return (Criteria) this;
        }

        public Criteria andSocialInsurancePartLessThanOrEqualTo(String value) {
            addCriterion("social_insurance_part <=", value, "socialInsurancePart");
            return (Criteria) this;
        }

        public Criteria andSocialInsurancePartLike(String value) {
            addCriterion("social_insurance_part like", value, "socialInsurancePart");
            return (Criteria) this;
        }

        public Criteria andSocialInsurancePartNotLike(String value) {
            addCriterion("social_insurance_part not like", value, "socialInsurancePart");
            return (Criteria) this;
        }

        public Criteria andSocialInsurancePartIn(List<String> values) {
            addCriterion("social_insurance_part in", values, "socialInsurancePart");
            return (Criteria) this;
        }

        public Criteria andSocialInsurancePartNotIn(List<String> values) {
            addCriterion("social_insurance_part not in", values, "socialInsurancePart");
            return (Criteria) this;
        }

        public Criteria andSocialInsurancePartBetween(String value1, String value2) {
            addCriterion("social_insurance_part between", value1, value2, "socialInsurancePart");
            return (Criteria) this;
        }

        public Criteria andSocialInsurancePartNotBetween(String value1, String value2) {
            addCriterion("social_insurance_part not between", value1, value2, "socialInsurancePart");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceNumIsNull() {
            addCriterion("social_insurance_num is null");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceNumIsNotNull() {
            addCriterion("social_insurance_num is not null");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceNumEqualTo(String value) {
            addCriterion("social_insurance_num =", value, "socialInsuranceNum");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceNumNotEqualTo(String value) {
            addCriterion("social_insurance_num <>", value, "socialInsuranceNum");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceNumGreaterThan(String value) {
            addCriterion("social_insurance_num >", value, "socialInsuranceNum");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceNumGreaterThanOrEqualTo(String value) {
            addCriterion("social_insurance_num >=", value, "socialInsuranceNum");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceNumLessThan(String value) {
            addCriterion("social_insurance_num <", value, "socialInsuranceNum");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceNumLessThanOrEqualTo(String value) {
            addCriterion("social_insurance_num <=", value, "socialInsuranceNum");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceNumLike(String value) {
            addCriterion("social_insurance_num like", value, "socialInsuranceNum");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceNumNotLike(String value) {
            addCriterion("social_insurance_num not like", value, "socialInsuranceNum");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceNumIn(List<String> values) {
            addCriterion("social_insurance_num in", values, "socialInsuranceNum");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceNumNotIn(List<String> values) {
            addCriterion("social_insurance_num not in", values, "socialInsuranceNum");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceNumBetween(String value1, String value2) {
            addCriterion("social_insurance_num between", value1, value2, "socialInsuranceNum");
            return (Criteria) this;
        }

        public Criteria andSocialInsuranceNumNotBetween(String value1, String value2) {
            addCriterion("social_insurance_num not between", value1, value2, "socialInsuranceNum");
            return (Criteria) this;
        }

        public Criteria andStaffSignTypeIsNull() {
            addCriterion("staff_sign_type is null");
            return (Criteria) this;
        }

        public Criteria andStaffSignTypeIsNotNull() {
            addCriterion("staff_sign_type is not null");
            return (Criteria) this;
        }

        public Criteria andStaffSignTypeEqualTo(Integer value) {
            addCriterion("staff_sign_type =", value, "staffSignType");
            return (Criteria) this;
        }

        public Criteria andStaffSignTypeNotEqualTo(Integer value) {
            addCriterion("staff_sign_type <>", value, "staffSignType");
            return (Criteria) this;
        }

        public Criteria andStaffSignTypeGreaterThan(Integer value) {
            addCriterion("staff_sign_type >", value, "staffSignType");
            return (Criteria) this;
        }

        public Criteria andStaffSignTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_sign_type >=", value, "staffSignType");
            return (Criteria) this;
        }

        public Criteria andStaffSignTypeLessThan(Integer value) {
            addCriterion("staff_sign_type <", value, "staffSignType");
            return (Criteria) this;
        }

        public Criteria andStaffSignTypeLessThanOrEqualTo(Integer value) {
            addCriterion("staff_sign_type <=", value, "staffSignType");
            return (Criteria) this;
        }

        public Criteria andStaffSignTypeIn(List<Integer> values) {
            addCriterion("staff_sign_type in", values, "staffSignType");
            return (Criteria) this;
        }

        public Criteria andStaffSignTypeNotIn(List<Integer> values) {
            addCriterion("staff_sign_type not in", values, "staffSignType");
            return (Criteria) this;
        }

        public Criteria andStaffSignTypeBetween(Integer value1, Integer value2) {
            addCriterion("staff_sign_type between", value1, value2, "staffSignType");
            return (Criteria) this;
        }

        public Criteria andStaffSignTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_sign_type not between", value1, value2, "staffSignType");
            return (Criteria) this;
        }

        public Criteria andPrStatusIsNull() {
            addCriterion("pr_status is null");
            return (Criteria) this;
        }

        public Criteria andPrStatusIsNotNull() {
            addCriterion("pr_status is not null");
            return (Criteria) this;
        }

        public Criteria andPrStatusEqualTo(Integer value) {
            addCriterion("pr_status =", value, "prStatus");
            return (Criteria) this;
        }

        public Criteria andPrStatusNotEqualTo(Integer value) {
            addCriterion("pr_status <>", value, "prStatus");
            return (Criteria) this;
        }

        public Criteria andPrStatusGreaterThan(Integer value) {
            addCriterion("pr_status >", value, "prStatus");
            return (Criteria) this;
        }

        public Criteria andPrStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pr_status >=", value, "prStatus");
            return (Criteria) this;
        }

        public Criteria andPrStatusLessThan(Integer value) {
            addCriterion("pr_status <", value, "prStatus");
            return (Criteria) this;
        }

        public Criteria andPrStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pr_status <=", value, "prStatus");
            return (Criteria) this;
        }

        public Criteria andPrStatusIn(List<Integer> values) {
            addCriterion("pr_status in", values, "prStatus");
            return (Criteria) this;
        }

        public Criteria andPrStatusNotIn(List<Integer> values) {
            addCriterion("pr_status not in", values, "prStatus");
            return (Criteria) this;
        }

        public Criteria andPrStatusBetween(Integer value1, Integer value2) {
            addCriterion("pr_status between", value1, value2, "prStatus");
            return (Criteria) this;
        }

        public Criteria andPrStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pr_status not between", value1, value2, "prStatus");
            return (Criteria) this;
        }

        public Criteria andEnDateIsNull() {
            addCriterion("en_date is null");
            return (Criteria) this;
        }

        public Criteria andEnDateIsNotNull() {
            addCriterion("en_date is not null");
            return (Criteria) this;
        }

        public Criteria andEnDateEqualTo(String value) {
            addCriterion("en_date =", value, "enDate");
            return (Criteria) this;
        }

        public Criteria andEnDateNotEqualTo(String value) {
            addCriterion("en_date <>", value, "enDate");
            return (Criteria) this;
        }

        public Criteria andEnDateGreaterThan(String value) {
            addCriterion("en_date >", value, "enDate");
            return (Criteria) this;
        }

        public Criteria andEnDateGreaterThanOrEqualTo(String value) {
            addCriterion("en_date >=", value, "enDate");
            return (Criteria) this;
        }

        public Criteria andEnDateLessThan(String value) {
            addCriterion("en_date <", value, "enDate");
            return (Criteria) this;
        }

        public Criteria andEnDateLessThanOrEqualTo(String value) {
            addCriterion("en_date <=", value, "enDate");
            return (Criteria) this;
        }

        public Criteria andEnDateLike(String value) {
            addCriterion("en_date like", value, "enDate");
            return (Criteria) this;
        }

        public Criteria andEnDateNotLike(String value) {
            addCriterion("en_date not like", value, "enDate");
            return (Criteria) this;
        }

        public Criteria andEnDateIn(List<String> values) {
            addCriterion("en_date in", values, "enDate");
            return (Criteria) this;
        }

        public Criteria andEnDateNotIn(List<String> values) {
            addCriterion("en_date not in", values, "enDate");
            return (Criteria) this;
        }

        public Criteria andEnDateBetween(String value1, String value2) {
            addCriterion("en_date between", value1, value2, "enDate");
            return (Criteria) this;
        }

        public Criteria andEnDateNotBetween(String value1, String value2) {
            addCriterion("en_date not between", value1, value2, "enDate");
            return (Criteria) this;
        }

        public Criteria andPrIdIsNull() {
            addCriterion("pr_id is null");
            return (Criteria) this;
        }

        public Criteria andPrIdIsNotNull() {
            addCriterion("pr_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrIdEqualTo(Integer value) {
            addCriterion("pr_id =", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdNotEqualTo(Integer value) {
            addCriterion("pr_id <>", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdGreaterThan(Integer value) {
            addCriterion("pr_id >", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pr_id >=", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdLessThan(Integer value) {
            addCriterion("pr_id <", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdLessThanOrEqualTo(Integer value) {
            addCriterion("pr_id <=", value, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdIn(List<Integer> values) {
            addCriterion("pr_id in", values, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdNotIn(List<Integer> values) {
            addCriterion("pr_id not in", values, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdBetween(Integer value1, Integer value2) {
            addCriterion("pr_id between", value1, value2, "prId");
            return (Criteria) this;
        }

        public Criteria andPrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pr_id not between", value1, value2, "prId");
            return (Criteria) this;
        }

        public Criteria andDataStatusIsNull() {
            addCriterion("data_status is null");
            return (Criteria) this;
        }

        public Criteria andDataStatusIsNotNull() {
            addCriterion("data_status is not null");
            return (Criteria) this;
        }

        public Criteria andDataStatusEqualTo(Integer value) {
            addCriterion("data_status =", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotEqualTo(Integer value) {
            addCriterion("data_status <>", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThan(Integer value) {
            addCriterion("data_status >", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_status >=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThan(Integer value) {
            addCriterion("data_status <", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThanOrEqualTo(Integer value) {
            addCriterion("data_status <=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusIn(List<Integer> values) {
            addCriterion("data_status in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotIn(List<Integer> values) {
            addCriterion("data_status not in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusBetween(Integer value1, Integer value2) {
            addCriterion("data_status between", value1, value2, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("data_status not between", value1, value2, "dataStatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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