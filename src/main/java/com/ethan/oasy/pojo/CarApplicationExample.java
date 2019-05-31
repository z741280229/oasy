package com.ethan.oasy.pojo;

import java.util.ArrayList;
import java.util.List;

public class CarApplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarApplicationExample() {
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

        public Criteria andCarAppIdIsNull() {
            addCriterion("car_app_id is null");
            return (Criteria) this;
        }

        public Criteria andCarAppIdIsNotNull() {
            addCriterion("car_app_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarAppIdEqualTo(String value) {
            addCriterion("car_app_id =", value, "carAppId");
            return (Criteria) this;
        }

        public Criteria andCarAppIdNotEqualTo(String value) {
            addCriterion("car_app_id <>", value, "carAppId");
            return (Criteria) this;
        }

        public Criteria andCarAppIdGreaterThan(String value) {
            addCriterion("car_app_id >", value, "carAppId");
            return (Criteria) this;
        }

        public Criteria andCarAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("car_app_id >=", value, "carAppId");
            return (Criteria) this;
        }

        public Criteria andCarAppIdLessThan(String value) {
            addCriterion("car_app_id <", value, "carAppId");
            return (Criteria) this;
        }

        public Criteria andCarAppIdLessThanOrEqualTo(String value) {
            addCriterion("car_app_id <=", value, "carAppId");
            return (Criteria) this;
        }

        public Criteria andCarAppIdLike(String value) {
            addCriterion("car_app_id like", value, "carAppId");
            return (Criteria) this;
        }

        public Criteria andCarAppIdNotLike(String value) {
            addCriterion("car_app_id not like", value, "carAppId");
            return (Criteria) this;
        }

        public Criteria andCarAppIdIn(List<String> values) {
            addCriterion("car_app_id in", values, "carAppId");
            return (Criteria) this;
        }

        public Criteria andCarAppIdNotIn(List<String> values) {
            addCriterion("car_app_id not in", values, "carAppId");
            return (Criteria) this;
        }

        public Criteria andCarAppIdBetween(String value1, String value2) {
            addCriterion("car_app_id between", value1, value2, "carAppId");
            return (Criteria) this;
        }

        public Criteria andCarAppIdNotBetween(String value1, String value2) {
            addCriterion("car_app_id not between", value1, value2, "carAppId");
            return (Criteria) this;
        }

        public Criteria andCarAppUserIdIsNull() {
            addCriterion("car_app_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCarAppUserIdIsNotNull() {
            addCriterion("car_app_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarAppUserIdEqualTo(String value) {
            addCriterion("car_app_user_id =", value, "carAppUserId");
            return (Criteria) this;
        }

        public Criteria andCarAppUserIdNotEqualTo(String value) {
            addCriterion("car_app_user_id <>", value, "carAppUserId");
            return (Criteria) this;
        }

        public Criteria andCarAppUserIdGreaterThan(String value) {
            addCriterion("car_app_user_id >", value, "carAppUserId");
            return (Criteria) this;
        }

        public Criteria andCarAppUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("car_app_user_id >=", value, "carAppUserId");
            return (Criteria) this;
        }

        public Criteria andCarAppUserIdLessThan(String value) {
            addCriterion("car_app_user_id <", value, "carAppUserId");
            return (Criteria) this;
        }

        public Criteria andCarAppUserIdLessThanOrEqualTo(String value) {
            addCriterion("car_app_user_id <=", value, "carAppUserId");
            return (Criteria) this;
        }

        public Criteria andCarAppUserIdLike(String value) {
            addCriterion("car_app_user_id like", value, "carAppUserId");
            return (Criteria) this;
        }

        public Criteria andCarAppUserIdNotLike(String value) {
            addCriterion("car_app_user_id not like", value, "carAppUserId");
            return (Criteria) this;
        }

        public Criteria andCarAppUserIdIn(List<String> values) {
            addCriterion("car_app_user_id in", values, "carAppUserId");
            return (Criteria) this;
        }

        public Criteria andCarAppUserIdNotIn(List<String> values) {
            addCriterion("car_app_user_id not in", values, "carAppUserId");
            return (Criteria) this;
        }

        public Criteria andCarAppUserIdBetween(String value1, String value2) {
            addCriterion("car_app_user_id between", value1, value2, "carAppUserId");
            return (Criteria) this;
        }

        public Criteria andCarAppUserIdNotBetween(String value1, String value2) {
            addCriterion("car_app_user_id not between", value1, value2, "carAppUserId");
            return (Criteria) this;
        }

        public Criteria andCarAppUserNameIsNull() {
            addCriterion("car_app_user_name is null");
            return (Criteria) this;
        }

        public Criteria andCarAppUserNameIsNotNull() {
            addCriterion("car_app_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andCarAppUserNameEqualTo(String value) {
            addCriterion("car_app_user_name =", value, "carAppUserName");
            return (Criteria) this;
        }

        public Criteria andCarAppUserNameNotEqualTo(String value) {
            addCriterion("car_app_user_name <>", value, "carAppUserName");
            return (Criteria) this;
        }

        public Criteria andCarAppUserNameGreaterThan(String value) {
            addCriterion("car_app_user_name >", value, "carAppUserName");
            return (Criteria) this;
        }

        public Criteria andCarAppUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("car_app_user_name >=", value, "carAppUserName");
            return (Criteria) this;
        }

        public Criteria andCarAppUserNameLessThan(String value) {
            addCriterion("car_app_user_name <", value, "carAppUserName");
            return (Criteria) this;
        }

        public Criteria andCarAppUserNameLessThanOrEqualTo(String value) {
            addCriterion("car_app_user_name <=", value, "carAppUserName");
            return (Criteria) this;
        }

        public Criteria andCarAppUserNameLike(String value) {
            addCriterion("car_app_user_name like", value, "carAppUserName");
            return (Criteria) this;
        }

        public Criteria andCarAppUserNameNotLike(String value) {
            addCriterion("car_app_user_name not like", value, "carAppUserName");
            return (Criteria) this;
        }

        public Criteria andCarAppUserNameIn(List<String> values) {
            addCriterion("car_app_user_name in", values, "carAppUserName");
            return (Criteria) this;
        }

        public Criteria andCarAppUserNameNotIn(List<String> values) {
            addCriterion("car_app_user_name not in", values, "carAppUserName");
            return (Criteria) this;
        }

        public Criteria andCarAppUserNameBetween(String value1, String value2) {
            addCriterion("car_app_user_name between", value1, value2, "carAppUserName");
            return (Criteria) this;
        }

        public Criteria andCarAppUserNameNotBetween(String value1, String value2) {
            addCriterion("car_app_user_name not between", value1, value2, "carAppUserName");
            return (Criteria) this;
        }

        public Criteria andCarAppUserTelIsNull() {
            addCriterion("car_app_user_tel is null");
            return (Criteria) this;
        }

        public Criteria andCarAppUserTelIsNotNull() {
            addCriterion("car_app_user_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCarAppUserTelEqualTo(String value) {
            addCriterion("car_app_user_tel =", value, "carAppUserTel");
            return (Criteria) this;
        }

        public Criteria andCarAppUserTelNotEqualTo(String value) {
            addCriterion("car_app_user_tel <>", value, "carAppUserTel");
            return (Criteria) this;
        }

        public Criteria andCarAppUserTelGreaterThan(String value) {
            addCriterion("car_app_user_tel >", value, "carAppUserTel");
            return (Criteria) this;
        }

        public Criteria andCarAppUserTelGreaterThanOrEqualTo(String value) {
            addCriterion("car_app_user_tel >=", value, "carAppUserTel");
            return (Criteria) this;
        }

        public Criteria andCarAppUserTelLessThan(String value) {
            addCriterion("car_app_user_tel <", value, "carAppUserTel");
            return (Criteria) this;
        }

        public Criteria andCarAppUserTelLessThanOrEqualTo(String value) {
            addCriterion("car_app_user_tel <=", value, "carAppUserTel");
            return (Criteria) this;
        }

        public Criteria andCarAppUserTelLike(String value) {
            addCriterion("car_app_user_tel like", value, "carAppUserTel");
            return (Criteria) this;
        }

        public Criteria andCarAppUserTelNotLike(String value) {
            addCriterion("car_app_user_tel not like", value, "carAppUserTel");
            return (Criteria) this;
        }

        public Criteria andCarAppUserTelIn(List<String> values) {
            addCriterion("car_app_user_tel in", values, "carAppUserTel");
            return (Criteria) this;
        }

        public Criteria andCarAppUserTelNotIn(List<String> values) {
            addCriterion("car_app_user_tel not in", values, "carAppUserTel");
            return (Criteria) this;
        }

        public Criteria andCarAppUserTelBetween(String value1, String value2) {
            addCriterion("car_app_user_tel between", value1, value2, "carAppUserTel");
            return (Criteria) this;
        }

        public Criteria andCarAppUserTelNotBetween(String value1, String value2) {
            addCriterion("car_app_user_tel not between", value1, value2, "carAppUserTel");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(String value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(String value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(String value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(String value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(String value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(String value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLike(String value) {
            addCriterion("car_id like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotLike(String value) {
            addCriterion("car_id not like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<String> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<String> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(String value1, String value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(String value1, String value2) {
            addCriterion("car_id not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarNameIsNull() {
            addCriterion("car_name is null");
            return (Criteria) this;
        }

        public Criteria andCarNameIsNotNull() {
            addCriterion("car_name is not null");
            return (Criteria) this;
        }

        public Criteria andCarNameEqualTo(String value) {
            addCriterion("car_name =", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotEqualTo(String value) {
            addCriterion("car_name <>", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameGreaterThan(String value) {
            addCriterion("car_name >", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameGreaterThanOrEqualTo(String value) {
            addCriterion("car_name >=", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLessThan(String value) {
            addCriterion("car_name <", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLessThanOrEqualTo(String value) {
            addCriterion("car_name <=", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameLike(String value) {
            addCriterion("car_name like", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotLike(String value) {
            addCriterion("car_name not like", value, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameIn(List<String> values) {
            addCriterion("car_name in", values, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotIn(List<String> values) {
            addCriterion("car_name not in", values, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameBetween(String value1, String value2) {
            addCriterion("car_name between", value1, value2, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNameNotBetween(String value1, String value2) {
            addCriterion("car_name not between", value1, value2, "carName");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNull() {
            addCriterion("car_num is null");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNotNull() {
            addCriterion("car_num is not null");
            return (Criteria) this;
        }

        public Criteria andCarNumEqualTo(String value) {
            addCriterion("car_num =", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotEqualTo(String value) {
            addCriterion("car_num <>", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThan(String value) {
            addCriterion("car_num >", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThanOrEqualTo(String value) {
            addCriterion("car_num >=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThan(String value) {
            addCriterion("car_num <", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThanOrEqualTo(String value) {
            addCriterion("car_num <=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLike(String value) {
            addCriterion("car_num like", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotLike(String value) {
            addCriterion("car_num not like", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumIn(List<String> values) {
            addCriterion("car_num in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotIn(List<String> values) {
            addCriterion("car_num not in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumBetween(String value1, String value2) {
            addCriterion("car_num between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotBetween(String value1, String value2) {
            addCriterion("car_num not between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNull() {
            addCriterion("driver_id is null");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNotNull() {
            addCriterion("driver_id is not null");
            return (Criteria) this;
        }

        public Criteria andDriverIdEqualTo(String value) {
            addCriterion("driver_id =", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotEqualTo(String value) {
            addCriterion("driver_id <>", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThan(String value) {
            addCriterion("driver_id >", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThanOrEqualTo(String value) {
            addCriterion("driver_id >=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThan(String value) {
            addCriterion("driver_id <", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThanOrEqualTo(String value) {
            addCriterion("driver_id <=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLike(String value) {
            addCriterion("driver_id like", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotLike(String value) {
            addCriterion("driver_id not like", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdIn(List<String> values) {
            addCriterion("driver_id in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotIn(List<String> values) {
            addCriterion("driver_id not in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdBetween(String value1, String value2) {
            addCriterion("driver_id between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotBetween(String value1, String value2) {
            addCriterion("driver_id not between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNull() {
            addCriterion("driver_name is null");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNotNull() {
            addCriterion("driver_name is not null");
            return (Criteria) this;
        }

        public Criteria andDriverNameEqualTo(String value) {
            addCriterion("driver_name =", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotEqualTo(String value) {
            addCriterion("driver_name <>", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThan(String value) {
            addCriterion("driver_name >", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThanOrEqualTo(String value) {
            addCriterion("driver_name >=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThan(String value) {
            addCriterion("driver_name <", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThanOrEqualTo(String value) {
            addCriterion("driver_name <=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLike(String value) {
            addCriterion("driver_name like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotLike(String value) {
            addCriterion("driver_name not like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameIn(List<String> values) {
            addCriterion("driver_name in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotIn(List<String> values) {
            addCriterion("driver_name not in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameBetween(String value1, String value2) {
            addCriterion("driver_name between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotBetween(String value1, String value2) {
            addCriterion("driver_name not between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverTelIsNull() {
            addCriterion("driver_tel is null");
            return (Criteria) this;
        }

        public Criteria andDriverTelIsNotNull() {
            addCriterion("driver_tel is not null");
            return (Criteria) this;
        }

        public Criteria andDriverTelEqualTo(String value) {
            addCriterion("driver_tel =", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelNotEqualTo(String value) {
            addCriterion("driver_tel <>", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelGreaterThan(String value) {
            addCriterion("driver_tel >", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelGreaterThanOrEqualTo(String value) {
            addCriterion("driver_tel >=", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelLessThan(String value) {
            addCriterion("driver_tel <", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelLessThanOrEqualTo(String value) {
            addCriterion("driver_tel <=", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelLike(String value) {
            addCriterion("driver_tel like", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelNotLike(String value) {
            addCriterion("driver_tel not like", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelIn(List<String> values) {
            addCriterion("driver_tel in", values, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelNotIn(List<String> values) {
            addCriterion("driver_tel not in", values, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelBetween(String value1, String value2) {
            addCriterion("driver_tel between", value1, value2, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelNotBetween(String value1, String value2) {
            addCriterion("driver_tel not between", value1, value2, "driverTel");
            return (Criteria) this;
        }

        public Criteria andNatureIsNull() {
            addCriterion("nature is null");
            return (Criteria) this;
        }

        public Criteria andNatureIsNotNull() {
            addCriterion("nature is not null");
            return (Criteria) this;
        }

        public Criteria andNatureEqualTo(Integer value) {
            addCriterion("nature =", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotEqualTo(Integer value) {
            addCriterion("nature <>", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThan(Integer value) {
            addCriterion("nature >", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThanOrEqualTo(Integer value) {
            addCriterion("nature >=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThan(Integer value) {
            addCriterion("nature <", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThanOrEqualTo(Integer value) {
            addCriterion("nature <=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureIn(List<Integer> values) {
            addCriterion("nature in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotIn(List<Integer> values) {
            addCriterion("nature not in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureBetween(Integer value1, Integer value2) {
            addCriterion("nature between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotBetween(Integer value1, Integer value2) {
            addCriterion("nature not between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("end_time like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("end_time not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andPreRunIsNull() {
            addCriterion("pre_run is null");
            return (Criteria) this;
        }

        public Criteria andPreRunIsNotNull() {
            addCriterion("pre_run is not null");
            return (Criteria) this;
        }

        public Criteria andPreRunEqualTo(Integer value) {
            addCriterion("pre_run =", value, "preRun");
            return (Criteria) this;
        }

        public Criteria andPreRunNotEqualTo(Integer value) {
            addCriterion("pre_run <>", value, "preRun");
            return (Criteria) this;
        }

        public Criteria andPreRunGreaterThan(Integer value) {
            addCriterion("pre_run >", value, "preRun");
            return (Criteria) this;
        }

        public Criteria andPreRunGreaterThanOrEqualTo(Integer value) {
            addCriterion("pre_run >=", value, "preRun");
            return (Criteria) this;
        }

        public Criteria andPreRunLessThan(Integer value) {
            addCriterion("pre_run <", value, "preRun");
            return (Criteria) this;
        }

        public Criteria andPreRunLessThanOrEqualTo(Integer value) {
            addCriterion("pre_run <=", value, "preRun");
            return (Criteria) this;
        }

        public Criteria andPreRunIn(List<Integer> values) {
            addCriterion("pre_run in", values, "preRun");
            return (Criteria) this;
        }

        public Criteria andPreRunNotIn(List<Integer> values) {
            addCriterion("pre_run not in", values, "preRun");
            return (Criteria) this;
        }

        public Criteria andPreRunBetween(Integer value1, Integer value2) {
            addCriterion("pre_run between", value1, value2, "preRun");
            return (Criteria) this;
        }

        public Criteria andPreRunNotBetween(Integer value1, Integer value2) {
            addCriterion("pre_run not between", value1, value2, "preRun");
            return (Criteria) this;
        }

        public Criteria andFactRunIsNull() {
            addCriterion("fact_run is null");
            return (Criteria) this;
        }

        public Criteria andFactRunIsNotNull() {
            addCriterion("fact_run is not null");
            return (Criteria) this;
        }

        public Criteria andFactRunEqualTo(Integer value) {
            addCriterion("fact_run =", value, "factRun");
            return (Criteria) this;
        }

        public Criteria andFactRunNotEqualTo(Integer value) {
            addCriterion("fact_run <>", value, "factRun");
            return (Criteria) this;
        }

        public Criteria andFactRunGreaterThan(Integer value) {
            addCriterion("fact_run >", value, "factRun");
            return (Criteria) this;
        }

        public Criteria andFactRunGreaterThanOrEqualTo(Integer value) {
            addCriterion("fact_run >=", value, "factRun");
            return (Criteria) this;
        }

        public Criteria andFactRunLessThan(Integer value) {
            addCriterion("fact_run <", value, "factRun");
            return (Criteria) this;
        }

        public Criteria andFactRunLessThanOrEqualTo(Integer value) {
            addCriterion("fact_run <=", value, "factRun");
            return (Criteria) this;
        }

        public Criteria andFactRunIn(List<Integer> values) {
            addCriterion("fact_run in", values, "factRun");
            return (Criteria) this;
        }

        public Criteria andFactRunNotIn(List<Integer> values) {
            addCriterion("fact_run not in", values, "factRun");
            return (Criteria) this;
        }

        public Criteria andFactRunBetween(Integer value1, Integer value2) {
            addCriterion("fact_run between", value1, value2, "factRun");
            return (Criteria) this;
        }

        public Criteria andFactRunNotBetween(Integer value1, Integer value2) {
            addCriterion("fact_run not between", value1, value2, "factRun");
            return (Criteria) this;
        }

        public Criteria andStartPartIsNull() {
            addCriterion("start_part is null");
            return (Criteria) this;
        }

        public Criteria andStartPartIsNotNull() {
            addCriterion("start_part is not null");
            return (Criteria) this;
        }

        public Criteria andStartPartEqualTo(String value) {
            addCriterion("start_part =", value, "startPart");
            return (Criteria) this;
        }

        public Criteria andStartPartNotEqualTo(String value) {
            addCriterion("start_part <>", value, "startPart");
            return (Criteria) this;
        }

        public Criteria andStartPartGreaterThan(String value) {
            addCriterion("start_part >", value, "startPart");
            return (Criteria) this;
        }

        public Criteria andStartPartGreaterThanOrEqualTo(String value) {
            addCriterion("start_part >=", value, "startPart");
            return (Criteria) this;
        }

        public Criteria andStartPartLessThan(String value) {
            addCriterion("start_part <", value, "startPart");
            return (Criteria) this;
        }

        public Criteria andStartPartLessThanOrEqualTo(String value) {
            addCriterion("start_part <=", value, "startPart");
            return (Criteria) this;
        }

        public Criteria andStartPartLike(String value) {
            addCriterion("start_part like", value, "startPart");
            return (Criteria) this;
        }

        public Criteria andStartPartNotLike(String value) {
            addCriterion("start_part not like", value, "startPart");
            return (Criteria) this;
        }

        public Criteria andStartPartIn(List<String> values) {
            addCriterion("start_part in", values, "startPart");
            return (Criteria) this;
        }

        public Criteria andStartPartNotIn(List<String> values) {
            addCriterion("start_part not in", values, "startPart");
            return (Criteria) this;
        }

        public Criteria andStartPartBetween(String value1, String value2) {
            addCriterion("start_part between", value1, value2, "startPart");
            return (Criteria) this;
        }

        public Criteria andStartPartNotBetween(String value1, String value2) {
            addCriterion("start_part not between", value1, value2, "startPart");
            return (Criteria) this;
        }

        public Criteria andEndPartIsNull() {
            addCriterion("end_part is null");
            return (Criteria) this;
        }

        public Criteria andEndPartIsNotNull() {
            addCriterion("end_part is not null");
            return (Criteria) this;
        }

        public Criteria andEndPartEqualTo(String value) {
            addCriterion("end_part =", value, "endPart");
            return (Criteria) this;
        }

        public Criteria andEndPartNotEqualTo(String value) {
            addCriterion("end_part <>", value, "endPart");
            return (Criteria) this;
        }

        public Criteria andEndPartGreaterThan(String value) {
            addCriterion("end_part >", value, "endPart");
            return (Criteria) this;
        }

        public Criteria andEndPartGreaterThanOrEqualTo(String value) {
            addCriterion("end_part >=", value, "endPart");
            return (Criteria) this;
        }

        public Criteria andEndPartLessThan(String value) {
            addCriterion("end_part <", value, "endPart");
            return (Criteria) this;
        }

        public Criteria andEndPartLessThanOrEqualTo(String value) {
            addCriterion("end_part <=", value, "endPart");
            return (Criteria) this;
        }

        public Criteria andEndPartLike(String value) {
            addCriterion("end_part like", value, "endPart");
            return (Criteria) this;
        }

        public Criteria andEndPartNotLike(String value) {
            addCriterion("end_part not like", value, "endPart");
            return (Criteria) this;
        }

        public Criteria andEndPartIn(List<String> values) {
            addCriterion("end_part in", values, "endPart");
            return (Criteria) this;
        }

        public Criteria andEndPartNotIn(List<String> values) {
            addCriterion("end_part not in", values, "endPart");
            return (Criteria) this;
        }

        public Criteria andEndPartBetween(String value1, String value2) {
            addCriterion("end_part between", value1, value2, "endPart");
            return (Criteria) this;
        }

        public Criteria andEndPartNotBetween(String value1, String value2) {
            addCriterion("end_part not between", value1, value2, "endPart");
            return (Criteria) this;
        }

        public Criteria andCarAppStatusIsNull() {
            addCriterion("car_app_status is null");
            return (Criteria) this;
        }

        public Criteria andCarAppStatusIsNotNull() {
            addCriterion("car_app_status is not null");
            return (Criteria) this;
        }

        public Criteria andCarAppStatusEqualTo(Integer value) {
            addCriterion("car_app_status =", value, "carAppStatus");
            return (Criteria) this;
        }

        public Criteria andCarAppStatusNotEqualTo(Integer value) {
            addCriterion("car_app_status <>", value, "carAppStatus");
            return (Criteria) this;
        }

        public Criteria andCarAppStatusGreaterThan(Integer value) {
            addCriterion("car_app_status >", value, "carAppStatus");
            return (Criteria) this;
        }

        public Criteria andCarAppStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_app_status >=", value, "carAppStatus");
            return (Criteria) this;
        }

        public Criteria andCarAppStatusLessThan(Integer value) {
            addCriterion("car_app_status <", value, "carAppStatus");
            return (Criteria) this;
        }

        public Criteria andCarAppStatusLessThanOrEqualTo(Integer value) {
            addCriterion("car_app_status <=", value, "carAppStatus");
            return (Criteria) this;
        }

        public Criteria andCarAppStatusIn(List<Integer> values) {
            addCriterion("car_app_status in", values, "carAppStatus");
            return (Criteria) this;
        }

        public Criteria andCarAppStatusNotIn(List<Integer> values) {
            addCriterion("car_app_status not in", values, "carAppStatus");
            return (Criteria) this;
        }

        public Criteria andCarAppStatusBetween(Integer value1, Integer value2) {
            addCriterion("car_app_status between", value1, value2, "carAppStatus");
            return (Criteria) this;
        }

        public Criteria andCarAppStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("car_app_status not between", value1, value2, "carAppStatus");
            return (Criteria) this;
        }

        public Criteria andToStaffIsNull() {
            addCriterion("to_staff is null");
            return (Criteria) this;
        }

        public Criteria andToStaffIsNotNull() {
            addCriterion("to_staff is not null");
            return (Criteria) this;
        }

        public Criteria andToStaffEqualTo(String value) {
            addCriterion("to_staff =", value, "toStaff");
            return (Criteria) this;
        }

        public Criteria andToStaffNotEqualTo(String value) {
            addCriterion("to_staff <>", value, "toStaff");
            return (Criteria) this;
        }

        public Criteria andToStaffGreaterThan(String value) {
            addCriterion("to_staff >", value, "toStaff");
            return (Criteria) this;
        }

        public Criteria andToStaffGreaterThanOrEqualTo(String value) {
            addCriterion("to_staff >=", value, "toStaff");
            return (Criteria) this;
        }

        public Criteria andToStaffLessThan(String value) {
            addCriterion("to_staff <", value, "toStaff");
            return (Criteria) this;
        }

        public Criteria andToStaffLessThanOrEqualTo(String value) {
            addCriterion("to_staff <=", value, "toStaff");
            return (Criteria) this;
        }

        public Criteria andToStaffLike(String value) {
            addCriterion("to_staff like", value, "toStaff");
            return (Criteria) this;
        }

        public Criteria andToStaffNotLike(String value) {
            addCriterion("to_staff not like", value, "toStaff");
            return (Criteria) this;
        }

        public Criteria andToStaffIn(List<String> values) {
            addCriterion("to_staff in", values, "toStaff");
            return (Criteria) this;
        }

        public Criteria andToStaffNotIn(List<String> values) {
            addCriterion("to_staff not in", values, "toStaff");
            return (Criteria) this;
        }

        public Criteria andToStaffBetween(String value1, String value2) {
            addCriterion("to_staff between", value1, value2, "toStaff");
            return (Criteria) this;
        }

        public Criteria andToStaffNotBetween(String value1, String value2) {
            addCriterion("to_staff not between", value1, value2, "toStaff");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNull() {
            addCriterion("return_date is null");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNotNull() {
            addCriterion("return_date is not null");
            return (Criteria) this;
        }

        public Criteria andReturnDateEqualTo(String value) {
            addCriterion("return_date =", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotEqualTo(String value) {
            addCriterion("return_date <>", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThan(String value) {
            addCriterion("return_date >", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThanOrEqualTo(String value) {
            addCriterion("return_date >=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThan(String value) {
            addCriterion("return_date <", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThanOrEqualTo(String value) {
            addCriterion("return_date <=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLike(String value) {
            addCriterion("return_date like", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotLike(String value) {
            addCriterion("return_date not like", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateIn(List<String> values) {
            addCriterion("return_date in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotIn(List<String> values) {
            addCriterion("return_date not in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateBetween(String value1, String value2) {
            addCriterion("return_date between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotBetween(String value1, String value2) {
            addCriterion("return_date not between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andAppCarTimeIsNull() {
            addCriterion("app_car_time is null");
            return (Criteria) this;
        }

        public Criteria andAppCarTimeIsNotNull() {
            addCriterion("app_car_time is not null");
            return (Criteria) this;
        }

        public Criteria andAppCarTimeEqualTo(String value) {
            addCriterion("app_car_time =", value, "appCarTime");
            return (Criteria) this;
        }

        public Criteria andAppCarTimeNotEqualTo(String value) {
            addCriterion("app_car_time <>", value, "appCarTime");
            return (Criteria) this;
        }

        public Criteria andAppCarTimeGreaterThan(String value) {
            addCriterion("app_car_time >", value, "appCarTime");
            return (Criteria) this;
        }

        public Criteria andAppCarTimeGreaterThanOrEqualTo(String value) {
            addCriterion("app_car_time >=", value, "appCarTime");
            return (Criteria) this;
        }

        public Criteria andAppCarTimeLessThan(String value) {
            addCriterion("app_car_time <", value, "appCarTime");
            return (Criteria) this;
        }

        public Criteria andAppCarTimeLessThanOrEqualTo(String value) {
            addCriterion("app_car_time <=", value, "appCarTime");
            return (Criteria) this;
        }

        public Criteria andAppCarTimeLike(String value) {
            addCriterion("app_car_time like", value, "appCarTime");
            return (Criteria) this;
        }

        public Criteria andAppCarTimeNotLike(String value) {
            addCriterion("app_car_time not like", value, "appCarTime");
            return (Criteria) this;
        }

        public Criteria andAppCarTimeIn(List<String> values) {
            addCriterion("app_car_time in", values, "appCarTime");
            return (Criteria) this;
        }

        public Criteria andAppCarTimeNotIn(List<String> values) {
            addCriterion("app_car_time not in", values, "appCarTime");
            return (Criteria) this;
        }

        public Criteria andAppCarTimeBetween(String value1, String value2) {
            addCriterion("app_car_time between", value1, value2, "appCarTime");
            return (Criteria) this;
        }

        public Criteria andAppCarTimeNotBetween(String value1, String value2) {
            addCriterion("app_car_time not between", value1, value2, "appCarTime");
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