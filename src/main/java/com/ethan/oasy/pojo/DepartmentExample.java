package com.ethan.oasy.pojo;

import java.util.ArrayList;
import java.util.List;

public class DepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentExample() {
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

        public Criteria andDepartIdIsNull() {
            addCriterion("depart_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartIdIsNotNull() {
            addCriterion("depart_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartIdEqualTo(String value) {
            addCriterion("depart_id =", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotEqualTo(String value) {
            addCriterion("depart_id <>", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThan(String value) {
            addCriterion("depart_id >", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThanOrEqualTo(String value) {
            addCriterion("depart_id >=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThan(String value) {
            addCriterion("depart_id <", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThanOrEqualTo(String value) {
            addCriterion("depart_id <=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLike(String value) {
            addCriterion("depart_id like", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotLike(String value) {
            addCriterion("depart_id not like", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdIn(List<String> values) {
            addCriterion("depart_id in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotIn(List<String> values) {
            addCriterion("depart_id not in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdBetween(String value1, String value2) {
            addCriterion("depart_id between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotBetween(String value1, String value2) {
            addCriterion("depart_id not between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartNumIsNull() {
            addCriterion("depart_num is null");
            return (Criteria) this;
        }

        public Criteria andDepartNumIsNotNull() {
            addCriterion("depart_num is not null");
            return (Criteria) this;
        }

        public Criteria andDepartNumEqualTo(String value) {
            addCriterion("depart_num =", value, "departNum");
            return (Criteria) this;
        }

        public Criteria andDepartNumNotEqualTo(String value) {
            addCriterion("depart_num <>", value, "departNum");
            return (Criteria) this;
        }

        public Criteria andDepartNumGreaterThan(String value) {
            addCriterion("depart_num >", value, "departNum");
            return (Criteria) this;
        }

        public Criteria andDepartNumGreaterThanOrEqualTo(String value) {
            addCriterion("depart_num >=", value, "departNum");
            return (Criteria) this;
        }

        public Criteria andDepartNumLessThan(String value) {
            addCriterion("depart_num <", value, "departNum");
            return (Criteria) this;
        }

        public Criteria andDepartNumLessThanOrEqualTo(String value) {
            addCriterion("depart_num <=", value, "departNum");
            return (Criteria) this;
        }

        public Criteria andDepartNumLike(String value) {
            addCriterion("depart_num like", value, "departNum");
            return (Criteria) this;
        }

        public Criteria andDepartNumNotLike(String value) {
            addCriterion("depart_num not like", value, "departNum");
            return (Criteria) this;
        }

        public Criteria andDepartNumIn(List<String> values) {
            addCriterion("depart_num in", values, "departNum");
            return (Criteria) this;
        }

        public Criteria andDepartNumNotIn(List<String> values) {
            addCriterion("depart_num not in", values, "departNum");
            return (Criteria) this;
        }

        public Criteria andDepartNumBetween(String value1, String value2) {
            addCriterion("depart_num between", value1, value2, "departNum");
            return (Criteria) this;
        }

        public Criteria andDepartNumNotBetween(String value1, String value2) {
            addCriterion("depart_num not between", value1, value2, "departNum");
            return (Criteria) this;
        }

        public Criteria andDepartLeaderIsNull() {
            addCriterion("depart_leader is null");
            return (Criteria) this;
        }

        public Criteria andDepartLeaderIsNotNull() {
            addCriterion("depart_leader is not null");
            return (Criteria) this;
        }

        public Criteria andDepartLeaderEqualTo(String value) {
            addCriterion("depart_leader =", value, "departLeader");
            return (Criteria) this;
        }

        public Criteria andDepartLeaderNotEqualTo(String value) {
            addCriterion("depart_leader <>", value, "departLeader");
            return (Criteria) this;
        }

        public Criteria andDepartLeaderGreaterThan(String value) {
            addCriterion("depart_leader >", value, "departLeader");
            return (Criteria) this;
        }

        public Criteria andDepartLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("depart_leader >=", value, "departLeader");
            return (Criteria) this;
        }

        public Criteria andDepartLeaderLessThan(String value) {
            addCriterion("depart_leader <", value, "departLeader");
            return (Criteria) this;
        }

        public Criteria andDepartLeaderLessThanOrEqualTo(String value) {
            addCriterion("depart_leader <=", value, "departLeader");
            return (Criteria) this;
        }

        public Criteria andDepartLeaderLike(String value) {
            addCriterion("depart_leader like", value, "departLeader");
            return (Criteria) this;
        }

        public Criteria andDepartLeaderNotLike(String value) {
            addCriterion("depart_leader not like", value, "departLeader");
            return (Criteria) this;
        }

        public Criteria andDepartLeaderIn(List<String> values) {
            addCriterion("depart_leader in", values, "departLeader");
            return (Criteria) this;
        }

        public Criteria andDepartLeaderNotIn(List<String> values) {
            addCriterion("depart_leader not in", values, "departLeader");
            return (Criteria) this;
        }

        public Criteria andDepartLeaderBetween(String value1, String value2) {
            addCriterion("depart_leader between", value1, value2, "departLeader");
            return (Criteria) this;
        }

        public Criteria andDepartLeaderNotBetween(String value1, String value2) {
            addCriterion("depart_leader not between", value1, value2, "departLeader");
            return (Criteria) this;
        }

        public Criteria andDepartNameIsNull() {
            addCriterion("depart_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartNameIsNotNull() {
            addCriterion("depart_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartNameEqualTo(String value) {
            addCriterion("depart_name =", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotEqualTo(String value) {
            addCriterion("depart_name <>", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameGreaterThan(String value) {
            addCriterion("depart_name >", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameGreaterThanOrEqualTo(String value) {
            addCriterion("depart_name >=", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLessThan(String value) {
            addCriterion("depart_name <", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLessThanOrEqualTo(String value) {
            addCriterion("depart_name <=", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLike(String value) {
            addCriterion("depart_name like", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotLike(String value) {
            addCriterion("depart_name not like", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameIn(List<String> values) {
            addCriterion("depart_name in", values, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotIn(List<String> values) {
            addCriterion("depart_name not in", values, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameBetween(String value1, String value2) {
            addCriterion("depart_name between", value1, value2, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotBetween(String value1, String value2) {
            addCriterion("depart_name not between", value1, value2, "departName");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("parent_id like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("parent_id not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andSubSdIsNull() {
            addCriterion("sub_sd is null");
            return (Criteria) this;
        }

        public Criteria andSubSdIsNotNull() {
            addCriterion("sub_sd is not null");
            return (Criteria) this;
        }

        public Criteria andSubSdEqualTo(String value) {
            addCriterion("sub_sd =", value, "subSd");
            return (Criteria) this;
        }

        public Criteria andSubSdNotEqualTo(String value) {
            addCriterion("sub_sd <>", value, "subSd");
            return (Criteria) this;
        }

        public Criteria andSubSdGreaterThan(String value) {
            addCriterion("sub_sd >", value, "subSd");
            return (Criteria) this;
        }

        public Criteria andSubSdGreaterThanOrEqualTo(String value) {
            addCriterion("sub_sd >=", value, "subSd");
            return (Criteria) this;
        }

        public Criteria andSubSdLessThan(String value) {
            addCriterion("sub_sd <", value, "subSd");
            return (Criteria) this;
        }

        public Criteria andSubSdLessThanOrEqualTo(String value) {
            addCriterion("sub_sd <=", value, "subSd");
            return (Criteria) this;
        }

        public Criteria andSubSdLike(String value) {
            addCriterion("sub_sd like", value, "subSd");
            return (Criteria) this;
        }

        public Criteria andSubSdNotLike(String value) {
            addCriterion("sub_sd not like", value, "subSd");
            return (Criteria) this;
        }

        public Criteria andSubSdIn(List<String> values) {
            addCriterion("sub_sd in", values, "subSd");
            return (Criteria) this;
        }

        public Criteria andSubSdNotIn(List<String> values) {
            addCriterion("sub_sd not in", values, "subSd");
            return (Criteria) this;
        }

        public Criteria andSubSdBetween(String value1, String value2) {
            addCriterion("sub_sd between", value1, value2, "subSd");
            return (Criteria) this;
        }

        public Criteria andSubSdNotBetween(String value1, String value2) {
            addCriterion("sub_sd not between", value1, value2, "subSd");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(String value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(String value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(String value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(String value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(String value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLike(String value) {
            addCriterion("create_date like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotLike(String value) {
            addCriterion("create_date not like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<String> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<String> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(String value1, String value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(String value1, String value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateIsNull() {
            addCriterion("close_date is null");
            return (Criteria) this;
        }

        public Criteria andCloseDateIsNotNull() {
            addCriterion("close_date is not null");
            return (Criteria) this;
        }

        public Criteria andCloseDateEqualTo(String value) {
            addCriterion("close_date =", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateNotEqualTo(String value) {
            addCriterion("close_date <>", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateGreaterThan(String value) {
            addCriterion("close_date >", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateGreaterThanOrEqualTo(String value) {
            addCriterion("close_date >=", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateLessThan(String value) {
            addCriterion("close_date <", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateLessThanOrEqualTo(String value) {
            addCriterion("close_date <=", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateLike(String value) {
            addCriterion("close_date like", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateNotLike(String value) {
            addCriterion("close_date not like", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateIn(List<String> values) {
            addCriterion("close_date in", values, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateNotIn(List<String> values) {
            addCriterion("close_date not in", values, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateBetween(String value1, String value2) {
            addCriterion("close_date between", value1, value2, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateNotBetween(String value1, String value2) {
            addCriterion("close_date not between", value1, value2, "closeDate");
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

        public Criteria andDapartTypeIsNull() {
            addCriterion("dapart_type is null");
            return (Criteria) this;
        }

        public Criteria andDapartTypeIsNotNull() {
            addCriterion("dapart_type is not null");
            return (Criteria) this;
        }

        public Criteria andDapartTypeEqualTo(Integer value) {
            addCriterion("dapart_type =", value, "dapartType");
            return (Criteria) this;
        }

        public Criteria andDapartTypeNotEqualTo(Integer value) {
            addCriterion("dapart_type <>", value, "dapartType");
            return (Criteria) this;
        }

        public Criteria andDapartTypeGreaterThan(Integer value) {
            addCriterion("dapart_type >", value, "dapartType");
            return (Criteria) this;
        }

        public Criteria andDapartTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dapart_type >=", value, "dapartType");
            return (Criteria) this;
        }

        public Criteria andDapartTypeLessThan(Integer value) {
            addCriterion("dapart_type <", value, "dapartType");
            return (Criteria) this;
        }

        public Criteria andDapartTypeLessThanOrEqualTo(Integer value) {
            addCriterion("dapart_type <=", value, "dapartType");
            return (Criteria) this;
        }

        public Criteria andDapartTypeIn(List<Integer> values) {
            addCriterion("dapart_type in", values, "dapartType");
            return (Criteria) this;
        }

        public Criteria andDapartTypeNotIn(List<Integer> values) {
            addCriterion("dapart_type not in", values, "dapartType");
            return (Criteria) this;
        }

        public Criteria andDapartTypeBetween(Integer value1, Integer value2) {
            addCriterion("dapart_type between", value1, value2, "dapartType");
            return (Criteria) this;
        }

        public Criteria andDapartTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("dapart_type not between", value1, value2, "dapartType");
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