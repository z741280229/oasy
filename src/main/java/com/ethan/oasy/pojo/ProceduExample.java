package com.ethan.oasy.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProceduExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProceduExample() {
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

        public Criteria andPrTypeIdIsNull() {
            addCriterion("pr_type_id is null");
            return (Criteria) this;
        }

        public Criteria andPrTypeIdIsNotNull() {
            addCriterion("pr_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrTypeIdEqualTo(Integer value) {
            addCriterion("pr_type_id =", value, "prTypeId");
            return (Criteria) this;
        }

        public Criteria andPrTypeIdNotEqualTo(Integer value) {
            addCriterion("pr_type_id <>", value, "prTypeId");
            return (Criteria) this;
        }

        public Criteria andPrTypeIdGreaterThan(Integer value) {
            addCriterion("pr_type_id >", value, "prTypeId");
            return (Criteria) this;
        }

        public Criteria andPrTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pr_type_id >=", value, "prTypeId");
            return (Criteria) this;
        }

        public Criteria andPrTypeIdLessThan(Integer value) {
            addCriterion("pr_type_id <", value, "prTypeId");
            return (Criteria) this;
        }

        public Criteria andPrTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("pr_type_id <=", value, "prTypeId");
            return (Criteria) this;
        }

        public Criteria andPrTypeIdIn(List<Integer> values) {
            addCriterion("pr_type_id in", values, "prTypeId");
            return (Criteria) this;
        }

        public Criteria andPrTypeIdNotIn(List<Integer> values) {
            addCriterion("pr_type_id not in", values, "prTypeId");
            return (Criteria) this;
        }

        public Criteria andPrTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("pr_type_id between", value1, value2, "prTypeId");
            return (Criteria) this;
        }

        public Criteria andPrTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pr_type_id not between", value1, value2, "prTypeId");
            return (Criteria) this;
        }

        public Criteria andPrNameIsNull() {
            addCriterion("pr_name is null");
            return (Criteria) this;
        }

        public Criteria andPrNameIsNotNull() {
            addCriterion("pr_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrNameEqualTo(String value) {
            addCriterion("pr_name =", value, "prName");
            return (Criteria) this;
        }

        public Criteria andPrNameNotEqualTo(String value) {
            addCriterion("pr_name <>", value, "prName");
            return (Criteria) this;
        }

        public Criteria andPrNameGreaterThan(String value) {
            addCriterion("pr_name >", value, "prName");
            return (Criteria) this;
        }

        public Criteria andPrNameGreaterThanOrEqualTo(String value) {
            addCriterion("pr_name >=", value, "prName");
            return (Criteria) this;
        }

        public Criteria andPrNameLessThan(String value) {
            addCriterion("pr_name <", value, "prName");
            return (Criteria) this;
        }

        public Criteria andPrNameLessThanOrEqualTo(String value) {
            addCriterion("pr_name <=", value, "prName");
            return (Criteria) this;
        }

        public Criteria andPrNameLike(String value) {
            addCriterion("pr_name like", value, "prName");
            return (Criteria) this;
        }

        public Criteria andPrNameNotLike(String value) {
            addCriterion("pr_name not like", value, "prName");
            return (Criteria) this;
        }

        public Criteria andPrNameIn(List<String> values) {
            addCriterion("pr_name in", values, "prName");
            return (Criteria) this;
        }

        public Criteria andPrNameNotIn(List<String> values) {
            addCriterion("pr_name not in", values, "prName");
            return (Criteria) this;
        }

        public Criteria andPrNameBetween(String value1, String value2) {
            addCriterion("pr_name between", value1, value2, "prName");
            return (Criteria) this;
        }

        public Criteria andPrNameNotBetween(String value1, String value2) {
            addCriterion("pr_name not between", value1, value2, "prName");
            return (Criteria) this;
        }

        public Criteria andPrStaffIdIsNull() {
            addCriterion("pr_staff_id is null");
            return (Criteria) this;
        }

        public Criteria andPrStaffIdIsNotNull() {
            addCriterion("pr_staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrStaffIdEqualTo(String value) {
            addCriterion("pr_staff_id =", value, "prStaffId");
            return (Criteria) this;
        }

        public Criteria andPrStaffIdNotEqualTo(String value) {
            addCriterion("pr_staff_id <>", value, "prStaffId");
            return (Criteria) this;
        }

        public Criteria andPrStaffIdGreaterThan(String value) {
            addCriterion("pr_staff_id >", value, "prStaffId");
            return (Criteria) this;
        }

        public Criteria andPrStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("pr_staff_id >=", value, "prStaffId");
            return (Criteria) this;
        }

        public Criteria andPrStaffIdLessThan(String value) {
            addCriterion("pr_staff_id <", value, "prStaffId");
            return (Criteria) this;
        }

        public Criteria andPrStaffIdLessThanOrEqualTo(String value) {
            addCriterion("pr_staff_id <=", value, "prStaffId");
            return (Criteria) this;
        }

        public Criteria andPrStaffIdLike(String value) {
            addCriterion("pr_staff_id like", value, "prStaffId");
            return (Criteria) this;
        }

        public Criteria andPrStaffIdNotLike(String value) {
            addCriterion("pr_staff_id not like", value, "prStaffId");
            return (Criteria) this;
        }

        public Criteria andPrStaffIdIn(List<String> values) {
            addCriterion("pr_staff_id in", values, "prStaffId");
            return (Criteria) this;
        }

        public Criteria andPrStaffIdNotIn(List<String> values) {
            addCriterion("pr_staff_id not in", values, "prStaffId");
            return (Criteria) this;
        }

        public Criteria andPrStaffIdBetween(String value1, String value2) {
            addCriterion("pr_staff_id between", value1, value2, "prStaffId");
            return (Criteria) this;
        }

        public Criteria andPrStaffIdNotBetween(String value1, String value2) {
            addCriterion("pr_staff_id not between", value1, value2, "prStaffId");
            return (Criteria) this;
        }

        public Criteria andPrNumberIsNull() {
            addCriterion("pr_number is null");
            return (Criteria) this;
        }

        public Criteria andPrNumberIsNotNull() {
            addCriterion("pr_number is not null");
            return (Criteria) this;
        }

        public Criteria andPrNumberEqualTo(Integer value) {
            addCriterion("pr_number =", value, "prNumber");
            return (Criteria) this;
        }

        public Criteria andPrNumberNotEqualTo(Integer value) {
            addCriterion("pr_number <>", value, "prNumber");
            return (Criteria) this;
        }

        public Criteria andPrNumberGreaterThan(Integer value) {
            addCriterion("pr_number >", value, "prNumber");
            return (Criteria) this;
        }

        public Criteria andPrNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("pr_number >=", value, "prNumber");
            return (Criteria) this;
        }

        public Criteria andPrNumberLessThan(Integer value) {
            addCriterion("pr_number <", value, "prNumber");
            return (Criteria) this;
        }

        public Criteria andPrNumberLessThanOrEqualTo(Integer value) {
            addCriterion("pr_number <=", value, "prNumber");
            return (Criteria) this;
        }

        public Criteria andPrNumberIn(List<Integer> values) {
            addCriterion("pr_number in", values, "prNumber");
            return (Criteria) this;
        }

        public Criteria andPrNumberNotIn(List<Integer> values) {
            addCriterion("pr_number not in", values, "prNumber");
            return (Criteria) this;
        }

        public Criteria andPrNumberBetween(Integer value1, Integer value2) {
            addCriterion("pr_number between", value1, value2, "prNumber");
            return (Criteria) this;
        }

        public Criteria andPrNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("pr_number not between", value1, value2, "prNumber");
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