package com.ethan.oasy.pojo;

import java.util.ArrayList;
import java.util.List;

public class OfficeSuppliesCheckLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OfficeSuppliesCheckLogExample() {
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

        public Criteria andOsCheckIdIsNull() {
            addCriterion("os_check_Id is null");
            return (Criteria) this;
        }

        public Criteria andOsCheckIdIsNotNull() {
            addCriterion("os_check_Id is not null");
            return (Criteria) this;
        }

        public Criteria andOsCheckIdEqualTo(Integer value) {
            addCriterion("os_check_Id =", value, "osCheckId");
            return (Criteria) this;
        }

        public Criteria andOsCheckIdNotEqualTo(Integer value) {
            addCriterion("os_check_Id <>", value, "osCheckId");
            return (Criteria) this;
        }

        public Criteria andOsCheckIdGreaterThan(Integer value) {
            addCriterion("os_check_Id >", value, "osCheckId");
            return (Criteria) this;
        }

        public Criteria andOsCheckIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("os_check_Id >=", value, "osCheckId");
            return (Criteria) this;
        }

        public Criteria andOsCheckIdLessThan(Integer value) {
            addCriterion("os_check_Id <", value, "osCheckId");
            return (Criteria) this;
        }

        public Criteria andOsCheckIdLessThanOrEqualTo(Integer value) {
            addCriterion("os_check_Id <=", value, "osCheckId");
            return (Criteria) this;
        }

        public Criteria andOsCheckIdIn(List<Integer> values) {
            addCriterion("os_check_Id in", values, "osCheckId");
            return (Criteria) this;
        }

        public Criteria andOsCheckIdNotIn(List<Integer> values) {
            addCriterion("os_check_Id not in", values, "osCheckId");
            return (Criteria) this;
        }

        public Criteria andOsCheckIdBetween(Integer value1, Integer value2) {
            addCriterion("os_check_Id between", value1, value2, "osCheckId");
            return (Criteria) this;
        }

        public Criteria andOsCheckIdNotBetween(Integer value1, Integer value2) {
            addCriterion("os_check_Id not between", value1, value2, "osCheckId");
            return (Criteria) this;
        }

        public Criteria andOsIdIsNull() {
            addCriterion("os_id is null");
            return (Criteria) this;
        }

        public Criteria andOsIdIsNotNull() {
            addCriterion("os_id is not null");
            return (Criteria) this;
        }

        public Criteria andOsIdEqualTo(String value) {
            addCriterion("os_id =", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdNotEqualTo(String value) {
            addCriterion("os_id <>", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdGreaterThan(String value) {
            addCriterion("os_id >", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdGreaterThanOrEqualTo(String value) {
            addCriterion("os_id >=", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdLessThan(String value) {
            addCriterion("os_id <", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdLessThanOrEqualTo(String value) {
            addCriterion("os_id <=", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdLike(String value) {
            addCriterion("os_id like", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdNotLike(String value) {
            addCriterion("os_id not like", value, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdIn(List<String> values) {
            addCriterion("os_id in", values, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdNotIn(List<String> values) {
            addCriterion("os_id not in", values, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdBetween(String value1, String value2) {
            addCriterion("os_id between", value1, value2, "osId");
            return (Criteria) this;
        }

        public Criteria andOsIdNotBetween(String value1, String value2) {
            addCriterion("os_id not between", value1, value2, "osId");
            return (Criteria) this;
        }

        public Criteria andOsNowNumIsNull() {
            addCriterion("os_now_num is null");
            return (Criteria) this;
        }

        public Criteria andOsNowNumIsNotNull() {
            addCriterion("os_now_num is not null");
            return (Criteria) this;
        }

        public Criteria andOsNowNumEqualTo(Integer value) {
            addCriterion("os_now_num =", value, "osNowNum");
            return (Criteria) this;
        }

        public Criteria andOsNowNumNotEqualTo(Integer value) {
            addCriterion("os_now_num <>", value, "osNowNum");
            return (Criteria) this;
        }

        public Criteria andOsNowNumGreaterThan(Integer value) {
            addCriterion("os_now_num >", value, "osNowNum");
            return (Criteria) this;
        }

        public Criteria andOsNowNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("os_now_num >=", value, "osNowNum");
            return (Criteria) this;
        }

        public Criteria andOsNowNumLessThan(Integer value) {
            addCriterion("os_now_num <", value, "osNowNum");
            return (Criteria) this;
        }

        public Criteria andOsNowNumLessThanOrEqualTo(Integer value) {
            addCriterion("os_now_num <=", value, "osNowNum");
            return (Criteria) this;
        }

        public Criteria andOsNowNumIn(List<Integer> values) {
            addCriterion("os_now_num in", values, "osNowNum");
            return (Criteria) this;
        }

        public Criteria andOsNowNumNotIn(List<Integer> values) {
            addCriterion("os_now_num not in", values, "osNowNum");
            return (Criteria) this;
        }

        public Criteria andOsNowNumBetween(Integer value1, Integer value2) {
            addCriterion("os_now_num between", value1, value2, "osNowNum");
            return (Criteria) this;
        }

        public Criteria andOsNowNumNotBetween(Integer value1, Integer value2) {
            addCriterion("os_now_num not between", value1, value2, "osNowNum");
            return (Criteria) this;
        }

        public Criteria andOsNowCheckNumIsNull() {
            addCriterion("os_now_check_num is null");
            return (Criteria) this;
        }

        public Criteria andOsNowCheckNumIsNotNull() {
            addCriterion("os_now_check_num is not null");
            return (Criteria) this;
        }

        public Criteria andOsNowCheckNumEqualTo(Integer value) {
            addCriterion("os_now_check_num =", value, "osNowCheckNum");
            return (Criteria) this;
        }

        public Criteria andOsNowCheckNumNotEqualTo(Integer value) {
            addCriterion("os_now_check_num <>", value, "osNowCheckNum");
            return (Criteria) this;
        }

        public Criteria andOsNowCheckNumGreaterThan(Integer value) {
            addCriterion("os_now_check_num >", value, "osNowCheckNum");
            return (Criteria) this;
        }

        public Criteria andOsNowCheckNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("os_now_check_num >=", value, "osNowCheckNum");
            return (Criteria) this;
        }

        public Criteria andOsNowCheckNumLessThan(Integer value) {
            addCriterion("os_now_check_num <", value, "osNowCheckNum");
            return (Criteria) this;
        }

        public Criteria andOsNowCheckNumLessThanOrEqualTo(Integer value) {
            addCriterion("os_now_check_num <=", value, "osNowCheckNum");
            return (Criteria) this;
        }

        public Criteria andOsNowCheckNumIn(List<Integer> values) {
            addCriterion("os_now_check_num in", values, "osNowCheckNum");
            return (Criteria) this;
        }

        public Criteria andOsNowCheckNumNotIn(List<Integer> values) {
            addCriterion("os_now_check_num not in", values, "osNowCheckNum");
            return (Criteria) this;
        }

        public Criteria andOsNowCheckNumBetween(Integer value1, Integer value2) {
            addCriterion("os_now_check_num between", value1, value2, "osNowCheckNum");
            return (Criteria) this;
        }

        public Criteria andOsNowCheckNumNotBetween(Integer value1, Integer value2) {
            addCriterion("os_now_check_num not between", value1, value2, "osNowCheckNum");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(String value) {
            addCriterion("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(String value) {
            addCriterion("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(String value) {
            addCriterion("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(String value) {
            addCriterion("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(String value) {
            addCriterion("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(String value) {
            addCriterion("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLike(String value) {
            addCriterion("check_time like", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotLike(String value) {
            addCriterion("check_time not like", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<String> values) {
            addCriterion("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<String> values) {
            addCriterion("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(String value1, String value2) {
            addCriterion("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(String value1, String value2) {
            addCriterion("check_time not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckStaffIsNull() {
            addCriterion("check_staff is null");
            return (Criteria) this;
        }

        public Criteria andCheckStaffIsNotNull() {
            addCriterion("check_staff is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStaffEqualTo(String value) {
            addCriterion("check_staff =", value, "checkStaff");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNotEqualTo(String value) {
            addCriterion("check_staff <>", value, "checkStaff");
            return (Criteria) this;
        }

        public Criteria andCheckStaffGreaterThan(String value) {
            addCriterion("check_staff >", value, "checkStaff");
            return (Criteria) this;
        }

        public Criteria andCheckStaffGreaterThanOrEqualTo(String value) {
            addCriterion("check_staff >=", value, "checkStaff");
            return (Criteria) this;
        }

        public Criteria andCheckStaffLessThan(String value) {
            addCriterion("check_staff <", value, "checkStaff");
            return (Criteria) this;
        }

        public Criteria andCheckStaffLessThanOrEqualTo(String value) {
            addCriterion("check_staff <=", value, "checkStaff");
            return (Criteria) this;
        }

        public Criteria andCheckStaffLike(String value) {
            addCriterion("check_staff like", value, "checkStaff");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNotLike(String value) {
            addCriterion("check_staff not like", value, "checkStaff");
            return (Criteria) this;
        }

        public Criteria andCheckStaffIn(List<String> values) {
            addCriterion("check_staff in", values, "checkStaff");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNotIn(List<String> values) {
            addCriterion("check_staff not in", values, "checkStaff");
            return (Criteria) this;
        }

        public Criteria andCheckStaffBetween(String value1, String value2) {
            addCriterion("check_staff between", value1, value2, "checkStaff");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNotBetween(String value1, String value2) {
            addCriterion("check_staff not between", value1, value2, "checkStaff");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameIsNull() {
            addCriterion("check_staff_name is null");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameIsNotNull() {
            addCriterion("check_staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameEqualTo(String value) {
            addCriterion("check_staff_name =", value, "checkStaffName");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameNotEqualTo(String value) {
            addCriterion("check_staff_name <>", value, "checkStaffName");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameGreaterThan(String value) {
            addCriterion("check_staff_name >", value, "checkStaffName");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("check_staff_name >=", value, "checkStaffName");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameLessThan(String value) {
            addCriterion("check_staff_name <", value, "checkStaffName");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameLessThanOrEqualTo(String value) {
            addCriterion("check_staff_name <=", value, "checkStaffName");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameLike(String value) {
            addCriterion("check_staff_name like", value, "checkStaffName");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameNotLike(String value) {
            addCriterion("check_staff_name not like", value, "checkStaffName");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameIn(List<String> values) {
            addCriterion("check_staff_name in", values, "checkStaffName");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameNotIn(List<String> values) {
            addCriterion("check_staff_name not in", values, "checkStaffName");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameBetween(String value1, String value2) {
            addCriterion("check_staff_name between", value1, value2, "checkStaffName");
            return (Criteria) this;
        }

        public Criteria andCheckStaffNameNotBetween(String value1, String value2) {
            addCriterion("check_staff_name not between", value1, value2, "checkStaffName");
            return (Criteria) this;
        }

        public Criteria andDatatstatusIsNull() {
            addCriterion("datatStatus is null");
            return (Criteria) this;
        }

        public Criteria andDatatstatusIsNotNull() {
            addCriterion("datatStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDatatstatusEqualTo(Integer value) {
            addCriterion("datatStatus =", value, "datatstatus");
            return (Criteria) this;
        }

        public Criteria andDatatstatusNotEqualTo(Integer value) {
            addCriterion("datatStatus <>", value, "datatstatus");
            return (Criteria) this;
        }

        public Criteria andDatatstatusGreaterThan(Integer value) {
            addCriterion("datatStatus >", value, "datatstatus");
            return (Criteria) this;
        }

        public Criteria andDatatstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("datatStatus >=", value, "datatstatus");
            return (Criteria) this;
        }

        public Criteria andDatatstatusLessThan(Integer value) {
            addCriterion("datatStatus <", value, "datatstatus");
            return (Criteria) this;
        }

        public Criteria andDatatstatusLessThanOrEqualTo(Integer value) {
            addCriterion("datatStatus <=", value, "datatstatus");
            return (Criteria) this;
        }

        public Criteria andDatatstatusIn(List<Integer> values) {
            addCriterion("datatStatus in", values, "datatstatus");
            return (Criteria) this;
        }

        public Criteria andDatatstatusNotIn(List<Integer> values) {
            addCriterion("datatStatus not in", values, "datatstatus");
            return (Criteria) this;
        }

        public Criteria andDatatstatusBetween(Integer value1, Integer value2) {
            addCriterion("datatStatus between", value1, value2, "datatstatus");
            return (Criteria) this;
        }

        public Criteria andDatatstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("datatStatus not between", value1, value2, "datatstatus");
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