package com.ethan.oasy.pojo;

import java.util.ArrayList;
import java.util.List;

public class BoardroomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BoardroomExample() {
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

        public Criteria andBdIdIsNull() {
            addCriterion("bd_id is null");
            return (Criteria) this;
        }

        public Criteria andBdIdIsNotNull() {
            addCriterion("bd_id is not null");
            return (Criteria) this;
        }

        public Criteria andBdIdEqualTo(Integer value) {
            addCriterion("bd_id =", value, "bdId");
            return (Criteria) this;
        }

        public Criteria andBdIdNotEqualTo(Integer value) {
            addCriterion("bd_id <>", value, "bdId");
            return (Criteria) this;
        }

        public Criteria andBdIdGreaterThan(Integer value) {
            addCriterion("bd_id >", value, "bdId");
            return (Criteria) this;
        }

        public Criteria andBdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bd_id >=", value, "bdId");
            return (Criteria) this;
        }

        public Criteria andBdIdLessThan(Integer value) {
            addCriterion("bd_id <", value, "bdId");
            return (Criteria) this;
        }

        public Criteria andBdIdLessThanOrEqualTo(Integer value) {
            addCriterion("bd_id <=", value, "bdId");
            return (Criteria) this;
        }

        public Criteria andBdIdIn(List<Integer> values) {
            addCriterion("bd_id in", values, "bdId");
            return (Criteria) this;
        }

        public Criteria andBdIdNotIn(List<Integer> values) {
            addCriterion("bd_id not in", values, "bdId");
            return (Criteria) this;
        }

        public Criteria andBdIdBetween(Integer value1, Integer value2) {
            addCriterion("bd_id between", value1, value2, "bdId");
            return (Criteria) this;
        }

        public Criteria andBdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bd_id not between", value1, value2, "bdId");
            return (Criteria) this;
        }

        public Criteria andBdNameIsNull() {
            addCriterion("bd_name is null");
            return (Criteria) this;
        }

        public Criteria andBdNameIsNotNull() {
            addCriterion("bd_name is not null");
            return (Criteria) this;
        }

        public Criteria andBdNameEqualTo(String value) {
            addCriterion("bd_name =", value, "bdName");
            return (Criteria) this;
        }

        public Criteria andBdNameNotEqualTo(String value) {
            addCriterion("bd_name <>", value, "bdName");
            return (Criteria) this;
        }

        public Criteria andBdNameGreaterThan(String value) {
            addCriterion("bd_name >", value, "bdName");
            return (Criteria) this;
        }

        public Criteria andBdNameGreaterThanOrEqualTo(String value) {
            addCriterion("bd_name >=", value, "bdName");
            return (Criteria) this;
        }

        public Criteria andBdNameLessThan(String value) {
            addCriterion("bd_name <", value, "bdName");
            return (Criteria) this;
        }

        public Criteria andBdNameLessThanOrEqualTo(String value) {
            addCriterion("bd_name <=", value, "bdName");
            return (Criteria) this;
        }

        public Criteria andBdNameLike(String value) {
            addCriterion("bd_name like", value, "bdName");
            return (Criteria) this;
        }

        public Criteria andBdNameNotLike(String value) {
            addCriterion("bd_name not like", value, "bdName");
            return (Criteria) this;
        }

        public Criteria andBdNameIn(List<String> values) {
            addCriterion("bd_name in", values, "bdName");
            return (Criteria) this;
        }

        public Criteria andBdNameNotIn(List<String> values) {
            addCriterion("bd_name not in", values, "bdName");
            return (Criteria) this;
        }

        public Criteria andBdNameBetween(String value1, String value2) {
            addCriterion("bd_name between", value1, value2, "bdName");
            return (Criteria) this;
        }

        public Criteria andBdNameNotBetween(String value1, String value2) {
            addCriterion("bd_name not between", value1, value2, "bdName");
            return (Criteria) this;
        }

        public Criteria andBdSpaceIsNull() {
            addCriterion("bd_space is null");
            return (Criteria) this;
        }

        public Criteria andBdSpaceIsNotNull() {
            addCriterion("bd_space is not null");
            return (Criteria) this;
        }

        public Criteria andBdSpaceEqualTo(Integer value) {
            addCriterion("bd_space =", value, "bdSpace");
            return (Criteria) this;
        }

        public Criteria andBdSpaceNotEqualTo(Integer value) {
            addCriterion("bd_space <>", value, "bdSpace");
            return (Criteria) this;
        }

        public Criteria andBdSpaceGreaterThan(Integer value) {
            addCriterion("bd_space >", value, "bdSpace");
            return (Criteria) this;
        }

        public Criteria andBdSpaceGreaterThanOrEqualTo(Integer value) {
            addCriterion("bd_space >=", value, "bdSpace");
            return (Criteria) this;
        }

        public Criteria andBdSpaceLessThan(Integer value) {
            addCriterion("bd_space <", value, "bdSpace");
            return (Criteria) this;
        }

        public Criteria andBdSpaceLessThanOrEqualTo(Integer value) {
            addCriterion("bd_space <=", value, "bdSpace");
            return (Criteria) this;
        }

        public Criteria andBdSpaceIn(List<Integer> values) {
            addCriterion("bd_space in", values, "bdSpace");
            return (Criteria) this;
        }

        public Criteria andBdSpaceNotIn(List<Integer> values) {
            addCriterion("bd_space not in", values, "bdSpace");
            return (Criteria) this;
        }

        public Criteria andBdSpaceBetween(Integer value1, Integer value2) {
            addCriterion("bd_space between", value1, value2, "bdSpace");
            return (Criteria) this;
        }

        public Criteria andBdSpaceNotBetween(Integer value1, Integer value2) {
            addCriterion("bd_space not between", value1, value2, "bdSpace");
            return (Criteria) this;
        }

        public Criteria andBdPlaceIsNull() {
            addCriterion("bd_place is null");
            return (Criteria) this;
        }

        public Criteria andBdPlaceIsNotNull() {
            addCriterion("bd_place is not null");
            return (Criteria) this;
        }

        public Criteria andBdPlaceEqualTo(String value) {
            addCriterion("bd_place =", value, "bdPlace");
            return (Criteria) this;
        }

        public Criteria andBdPlaceNotEqualTo(String value) {
            addCriterion("bd_place <>", value, "bdPlace");
            return (Criteria) this;
        }

        public Criteria andBdPlaceGreaterThan(String value) {
            addCriterion("bd_place >", value, "bdPlace");
            return (Criteria) this;
        }

        public Criteria andBdPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("bd_place >=", value, "bdPlace");
            return (Criteria) this;
        }

        public Criteria andBdPlaceLessThan(String value) {
            addCriterion("bd_place <", value, "bdPlace");
            return (Criteria) this;
        }

        public Criteria andBdPlaceLessThanOrEqualTo(String value) {
            addCriterion("bd_place <=", value, "bdPlace");
            return (Criteria) this;
        }

        public Criteria andBdPlaceLike(String value) {
            addCriterion("bd_place like", value, "bdPlace");
            return (Criteria) this;
        }

        public Criteria andBdPlaceNotLike(String value) {
            addCriterion("bd_place not like", value, "bdPlace");
            return (Criteria) this;
        }

        public Criteria andBdPlaceIn(List<String> values) {
            addCriterion("bd_place in", values, "bdPlace");
            return (Criteria) this;
        }

        public Criteria andBdPlaceNotIn(List<String> values) {
            addCriterion("bd_place not in", values, "bdPlace");
            return (Criteria) this;
        }

        public Criteria andBdPlaceBetween(String value1, String value2) {
            addCriterion("bd_place between", value1, value2, "bdPlace");
            return (Criteria) this;
        }

        public Criteria andBdPlaceNotBetween(String value1, String value2) {
            addCriterion("bd_place not between", value1, value2, "bdPlace");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNull() {
            addCriterion("close_time is null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNotNull() {
            addCriterion("close_time is not null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeEqualTo(String value) {
            addCriterion("close_time =", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotEqualTo(String value) {
            addCriterion("close_time <>", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThan(String value) {
            addCriterion("close_time >", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("close_time >=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThan(String value) {
            addCriterion("close_time <", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThanOrEqualTo(String value) {
            addCriterion("close_time <=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLike(String value) {
            addCriterion("close_time like", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotLike(String value) {
            addCriterion("close_time not like", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIn(List<String> values) {
            addCriterion("close_time in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotIn(List<String> values) {
            addCriterion("close_time not in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeBetween(String value1, String value2) {
            addCriterion("close_time between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotBetween(String value1, String value2) {
            addCriterion("close_time not between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCreatePelIsNull() {
            addCriterion("create_pel is null");
            return (Criteria) this;
        }

        public Criteria andCreatePelIsNotNull() {
            addCriterion("create_pel is not null");
            return (Criteria) this;
        }

        public Criteria andCreatePelEqualTo(String value) {
            addCriterion("create_pel =", value, "createPel");
            return (Criteria) this;
        }

        public Criteria andCreatePelNotEqualTo(String value) {
            addCriterion("create_pel <>", value, "createPel");
            return (Criteria) this;
        }

        public Criteria andCreatePelGreaterThan(String value) {
            addCriterion("create_pel >", value, "createPel");
            return (Criteria) this;
        }

        public Criteria andCreatePelGreaterThanOrEqualTo(String value) {
            addCriterion("create_pel >=", value, "createPel");
            return (Criteria) this;
        }

        public Criteria andCreatePelLessThan(String value) {
            addCriterion("create_pel <", value, "createPel");
            return (Criteria) this;
        }

        public Criteria andCreatePelLessThanOrEqualTo(String value) {
            addCriterion("create_pel <=", value, "createPel");
            return (Criteria) this;
        }

        public Criteria andCreatePelLike(String value) {
            addCriterion("create_pel like", value, "createPel");
            return (Criteria) this;
        }

        public Criteria andCreatePelNotLike(String value) {
            addCriterion("create_pel not like", value, "createPel");
            return (Criteria) this;
        }

        public Criteria andCreatePelIn(List<String> values) {
            addCriterion("create_pel in", values, "createPel");
            return (Criteria) this;
        }

        public Criteria andCreatePelNotIn(List<String> values) {
            addCriterion("create_pel not in", values, "createPel");
            return (Criteria) this;
        }

        public Criteria andCreatePelBetween(String value1, String value2) {
            addCriterion("create_pel between", value1, value2, "createPel");
            return (Criteria) this;
        }

        public Criteria andCreatePelNotBetween(String value1, String value2) {
            addCriterion("create_pel not between", value1, value2, "createPel");
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

        public Criteria andDataStatusEqualTo(Byte value) {
            addCriterion("data_status =", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotEqualTo(Byte value) {
            addCriterion("data_status <>", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThan(Byte value) {
            addCriterion("data_status >", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("data_status >=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThan(Byte value) {
            addCriterion("data_status <", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThanOrEqualTo(Byte value) {
            addCriterion("data_status <=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusIn(List<Byte> values) {
            addCriterion("data_status in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotIn(List<Byte> values) {
            addCriterion("data_status not in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusBetween(Byte value1, Byte value2) {
            addCriterion("data_status between", value1, value2, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotBetween(Byte value1, Byte value2) {
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