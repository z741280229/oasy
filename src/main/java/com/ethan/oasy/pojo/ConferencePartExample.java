package com.ethan.oasy.pojo;

import java.util.ArrayList;
import java.util.List;

public class ConferencePartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConferencePartExample() {
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

        public Criteria andConferenceIdIsNull() {
            addCriterion("conference_id is null");
            return (Criteria) this;
        }

        public Criteria andConferenceIdIsNotNull() {
            addCriterion("conference_id is not null");
            return (Criteria) this;
        }

        public Criteria andConferenceIdEqualTo(String value) {
            addCriterion("conference_id =", value, "conferenceId");
            return (Criteria) this;
        }

        public Criteria andConferenceIdNotEqualTo(String value) {
            addCriterion("conference_id <>", value, "conferenceId");
            return (Criteria) this;
        }

        public Criteria andConferenceIdGreaterThan(String value) {
            addCriterion("conference_id >", value, "conferenceId");
            return (Criteria) this;
        }

        public Criteria andConferenceIdGreaterThanOrEqualTo(String value) {
            addCriterion("conference_id >=", value, "conferenceId");
            return (Criteria) this;
        }

        public Criteria andConferenceIdLessThan(String value) {
            addCriterion("conference_id <", value, "conferenceId");
            return (Criteria) this;
        }

        public Criteria andConferenceIdLessThanOrEqualTo(String value) {
            addCriterion("conference_id <=", value, "conferenceId");
            return (Criteria) this;
        }

        public Criteria andConferenceIdLike(String value) {
            addCriterion("conference_id like", value, "conferenceId");
            return (Criteria) this;
        }

        public Criteria andConferenceIdNotLike(String value) {
            addCriterion("conference_id not like", value, "conferenceId");
            return (Criteria) this;
        }

        public Criteria andConferenceIdIn(List<String> values) {
            addCriterion("conference_id in", values, "conferenceId");
            return (Criteria) this;
        }

        public Criteria andConferenceIdNotIn(List<String> values) {
            addCriterion("conference_id not in", values, "conferenceId");
            return (Criteria) this;
        }

        public Criteria andConferenceIdBetween(String value1, String value2) {
            addCriterion("conference_id between", value1, value2, "conferenceId");
            return (Criteria) this;
        }

        public Criteria andConferenceIdNotBetween(String value1, String value2) {
            addCriterion("conference_id not between", value1, value2, "conferenceId");
            return (Criteria) this;
        }

        public Criteria andPartNameIsNull() {
            addCriterion("part_name is null");
            return (Criteria) this;
        }

        public Criteria andPartNameIsNotNull() {
            addCriterion("part_name is not null");
            return (Criteria) this;
        }

        public Criteria andPartNameEqualTo(String value) {
            addCriterion("part_name =", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotEqualTo(String value) {
            addCriterion("part_name <>", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameGreaterThan(String value) {
            addCriterion("part_name >", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameGreaterThanOrEqualTo(String value) {
            addCriterion("part_name >=", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLessThan(String value) {
            addCriterion("part_name <", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLessThanOrEqualTo(String value) {
            addCriterion("part_name <=", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLike(String value) {
            addCriterion("part_name like", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotLike(String value) {
            addCriterion("part_name not like", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameIn(List<String> values) {
            addCriterion("part_name in", values, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotIn(List<String> values) {
            addCriterion("part_name not in", values, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameBetween(String value1, String value2) {
            addCriterion("part_name between", value1, value2, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotBetween(String value1, String value2) {
            addCriterion("part_name not between", value1, value2, "partName");
            return (Criteria) this;
        }

        public Criteria andPartIdIsNull() {
            addCriterion("part_id is null");
            return (Criteria) this;
        }

        public Criteria andPartIdIsNotNull() {
            addCriterion("part_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartIdEqualTo(String value) {
            addCriterion("part_id =", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotEqualTo(String value) {
            addCriterion("part_id <>", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdGreaterThan(String value) {
            addCriterion("part_id >", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdGreaterThanOrEqualTo(String value) {
            addCriterion("part_id >=", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdLessThan(String value) {
            addCriterion("part_id <", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdLessThanOrEqualTo(String value) {
            addCriterion("part_id <=", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdLike(String value) {
            addCriterion("part_id like", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotLike(String value) {
            addCriterion("part_id not like", value, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdIn(List<String> values) {
            addCriterion("part_id in", values, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotIn(List<String> values) {
            addCriterion("part_id not in", values, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdBetween(String value1, String value2) {
            addCriterion("part_id between", value1, value2, "partId");
            return (Criteria) this;
        }

        public Criteria andPartIdNotBetween(String value1, String value2) {
            addCriterion("part_id not between", value1, value2, "partId");
            return (Criteria) this;
        }

        public Criteria andConferenceNameIsNull() {
            addCriterion("conference_name is null");
            return (Criteria) this;
        }

        public Criteria andConferenceNameIsNotNull() {
            addCriterion("conference_name is not null");
            return (Criteria) this;
        }

        public Criteria andConferenceNameEqualTo(String value) {
            addCriterion("conference_name =", value, "conferenceName");
            return (Criteria) this;
        }

        public Criteria andConferenceNameNotEqualTo(String value) {
            addCriterion("conference_name <>", value, "conferenceName");
            return (Criteria) this;
        }

        public Criteria andConferenceNameGreaterThan(String value) {
            addCriterion("conference_name >", value, "conferenceName");
            return (Criteria) this;
        }

        public Criteria andConferenceNameGreaterThanOrEqualTo(String value) {
            addCriterion("conference_name >=", value, "conferenceName");
            return (Criteria) this;
        }

        public Criteria andConferenceNameLessThan(String value) {
            addCriterion("conference_name <", value, "conferenceName");
            return (Criteria) this;
        }

        public Criteria andConferenceNameLessThanOrEqualTo(String value) {
            addCriterion("conference_name <=", value, "conferenceName");
            return (Criteria) this;
        }

        public Criteria andConferenceNameLike(String value) {
            addCriterion("conference_name like", value, "conferenceName");
            return (Criteria) this;
        }

        public Criteria andConferenceNameNotLike(String value) {
            addCriterion("conference_name not like", value, "conferenceName");
            return (Criteria) this;
        }

        public Criteria andConferenceNameIn(List<String> values) {
            addCriterion("conference_name in", values, "conferenceName");
            return (Criteria) this;
        }

        public Criteria andConferenceNameNotIn(List<String> values) {
            addCriterion("conference_name not in", values, "conferenceName");
            return (Criteria) this;
        }

        public Criteria andConferenceNameBetween(String value1, String value2) {
            addCriterion("conference_name between", value1, value2, "conferenceName");
            return (Criteria) this;
        }

        public Criteria andConferenceNameNotBetween(String value1, String value2) {
            addCriterion("conference_name not between", value1, value2, "conferenceName");
            return (Criteria) this;
        }

        public Criteria andPartTypeIsNull() {
            addCriterion("part_type is null");
            return (Criteria) this;
        }

        public Criteria andPartTypeIsNotNull() {
            addCriterion("part_type is not null");
            return (Criteria) this;
        }

        public Criteria andPartTypeEqualTo(Integer value) {
            addCriterion("part_type =", value, "partType");
            return (Criteria) this;
        }

        public Criteria andPartTypeNotEqualTo(Integer value) {
            addCriterion("part_type <>", value, "partType");
            return (Criteria) this;
        }

        public Criteria andPartTypeGreaterThan(Integer value) {
            addCriterion("part_type >", value, "partType");
            return (Criteria) this;
        }

        public Criteria andPartTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("part_type >=", value, "partType");
            return (Criteria) this;
        }

        public Criteria andPartTypeLessThan(Integer value) {
            addCriterion("part_type <", value, "partType");
            return (Criteria) this;
        }

        public Criteria andPartTypeLessThanOrEqualTo(Integer value) {
            addCriterion("part_type <=", value, "partType");
            return (Criteria) this;
        }

        public Criteria andPartTypeIn(List<Integer> values) {
            addCriterion("part_type in", values, "partType");
            return (Criteria) this;
        }

        public Criteria andPartTypeNotIn(List<Integer> values) {
            addCriterion("part_type not in", values, "partType");
            return (Criteria) this;
        }

        public Criteria andPartTypeBetween(Integer value1, Integer value2) {
            addCriterion("part_type between", value1, value2, "partType");
            return (Criteria) this;
        }

        public Criteria andPartTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("part_type not between", value1, value2, "partType");
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