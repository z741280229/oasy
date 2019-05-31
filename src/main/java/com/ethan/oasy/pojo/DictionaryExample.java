package com.ethan.oasy.pojo;

import java.util.ArrayList;
import java.util.List;

public class DictionaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictionaryExample() {
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

        public Criteria andDictIdIsNull() {
            addCriterion("dict_id is null");
            return (Criteria) this;
        }

        public Criteria andDictIdIsNotNull() {
            addCriterion("dict_id is not null");
            return (Criteria) this;
        }

        public Criteria andDictIdEqualTo(Integer value) {
            addCriterion("dict_id =", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdNotEqualTo(Integer value) {
            addCriterion("dict_id <>", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdGreaterThan(Integer value) {
            addCriterion("dict_id >", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dict_id >=", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdLessThan(Integer value) {
            addCriterion("dict_id <", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdLessThanOrEqualTo(Integer value) {
            addCriterion("dict_id <=", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdIn(List<Integer> values) {
            addCriterion("dict_id in", values, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdNotIn(List<Integer> values) {
            addCriterion("dict_id not in", values, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdBetween(Integer value1, Integer value2) {
            addCriterion("dict_id between", value1, value2, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dict_id not between", value1, value2, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdIsNull() {
            addCriterion("dict_type_id is null");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdIsNotNull() {
            addCriterion("dict_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdEqualTo(String value) {
            addCriterion("dict_type_id =", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdNotEqualTo(String value) {
            addCriterion("dict_type_id <>", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdGreaterThan(String value) {
            addCriterion("dict_type_id >", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("dict_type_id >=", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdLessThan(String value) {
            addCriterion("dict_type_id <", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdLessThanOrEqualTo(String value) {
            addCriterion("dict_type_id <=", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdLike(String value) {
            addCriterion("dict_type_id like", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdNotLike(String value) {
            addCriterion("dict_type_id not like", value, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdIn(List<String> values) {
            addCriterion("dict_type_id in", values, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdNotIn(List<String> values) {
            addCriterion("dict_type_id not in", values, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdBetween(String value1, String value2) {
            addCriterion("dict_type_id between", value1, value2, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeIdNotBetween(String value1, String value2) {
            addCriterion("dict_type_id not between", value1, value2, "dictTypeId");
            return (Criteria) this;
        }

        public Criteria andDictTypeNumIsNull() {
            addCriterion("dict_type_num is null");
            return (Criteria) this;
        }

        public Criteria andDictTypeNumIsNotNull() {
            addCriterion("dict_type_num is not null");
            return (Criteria) this;
        }

        public Criteria andDictTypeNumEqualTo(String value) {
            addCriterion("dict_type_num =", value, "dictTypeNum");
            return (Criteria) this;
        }

        public Criteria andDictTypeNumNotEqualTo(String value) {
            addCriterion("dict_type_num <>", value, "dictTypeNum");
            return (Criteria) this;
        }

        public Criteria andDictTypeNumGreaterThan(String value) {
            addCriterion("dict_type_num >", value, "dictTypeNum");
            return (Criteria) this;
        }

        public Criteria andDictTypeNumGreaterThanOrEqualTo(String value) {
            addCriterion("dict_type_num >=", value, "dictTypeNum");
            return (Criteria) this;
        }

        public Criteria andDictTypeNumLessThan(String value) {
            addCriterion("dict_type_num <", value, "dictTypeNum");
            return (Criteria) this;
        }

        public Criteria andDictTypeNumLessThanOrEqualTo(String value) {
            addCriterion("dict_type_num <=", value, "dictTypeNum");
            return (Criteria) this;
        }

        public Criteria andDictTypeNumLike(String value) {
            addCriterion("dict_type_num like", value, "dictTypeNum");
            return (Criteria) this;
        }

        public Criteria andDictTypeNumNotLike(String value) {
            addCriterion("dict_type_num not like", value, "dictTypeNum");
            return (Criteria) this;
        }

        public Criteria andDictTypeNumIn(List<String> values) {
            addCriterion("dict_type_num in", values, "dictTypeNum");
            return (Criteria) this;
        }

        public Criteria andDictTypeNumNotIn(List<String> values) {
            addCriterion("dict_type_num not in", values, "dictTypeNum");
            return (Criteria) this;
        }

        public Criteria andDictTypeNumBetween(String value1, String value2) {
            addCriterion("dict_type_num between", value1, value2, "dictTypeNum");
            return (Criteria) this;
        }

        public Criteria andDictTypeNumNotBetween(String value1, String value2) {
            addCriterion("dict_type_num not between", value1, value2, "dictTypeNum");
            return (Criteria) this;
        }

        public Criteria andDictTypeDetailsIsNull() {
            addCriterion("dict_type_details is null");
            return (Criteria) this;
        }

        public Criteria andDictTypeDetailsIsNotNull() {
            addCriterion("dict_type_details is not null");
            return (Criteria) this;
        }

        public Criteria andDictTypeDetailsEqualTo(String value) {
            addCriterion("dict_type_details =", value, "dictTypeDetails");
            return (Criteria) this;
        }

        public Criteria andDictTypeDetailsNotEqualTo(String value) {
            addCriterion("dict_type_details <>", value, "dictTypeDetails");
            return (Criteria) this;
        }

        public Criteria andDictTypeDetailsGreaterThan(String value) {
            addCriterion("dict_type_details >", value, "dictTypeDetails");
            return (Criteria) this;
        }

        public Criteria andDictTypeDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("dict_type_details >=", value, "dictTypeDetails");
            return (Criteria) this;
        }

        public Criteria andDictTypeDetailsLessThan(String value) {
            addCriterion("dict_type_details <", value, "dictTypeDetails");
            return (Criteria) this;
        }

        public Criteria andDictTypeDetailsLessThanOrEqualTo(String value) {
            addCriterion("dict_type_details <=", value, "dictTypeDetails");
            return (Criteria) this;
        }

        public Criteria andDictTypeDetailsLike(String value) {
            addCriterion("dict_type_details like", value, "dictTypeDetails");
            return (Criteria) this;
        }

        public Criteria andDictTypeDetailsNotLike(String value) {
            addCriterion("dict_type_details not like", value, "dictTypeDetails");
            return (Criteria) this;
        }

        public Criteria andDictTypeDetailsIn(List<String> values) {
            addCriterion("dict_type_details in", values, "dictTypeDetails");
            return (Criteria) this;
        }

        public Criteria andDictTypeDetailsNotIn(List<String> values) {
            addCriterion("dict_type_details not in", values, "dictTypeDetails");
            return (Criteria) this;
        }

        public Criteria andDictTypeDetailsBetween(String value1, String value2) {
            addCriterion("dict_type_details between", value1, value2, "dictTypeDetails");
            return (Criteria) this;
        }

        public Criteria andDictTypeDetailsNotBetween(String value1, String value2) {
            addCriterion("dict_type_details not between", value1, value2, "dictTypeDetails");
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