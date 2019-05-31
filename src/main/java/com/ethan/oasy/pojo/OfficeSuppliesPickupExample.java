package com.ethan.oasy.pojo;

import java.util.ArrayList;
import java.util.List;

public class OfficeSuppliesPickupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OfficeSuppliesPickupExample() {
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

        public Criteria andOspIdIsNull() {
            addCriterion("osp_id is null");
            return (Criteria) this;
        }

        public Criteria andOspIdIsNotNull() {
            addCriterion("osp_id is not null");
            return (Criteria) this;
        }

        public Criteria andOspIdEqualTo(String value) {
            addCriterion("osp_id =", value, "ospId");
            return (Criteria) this;
        }

        public Criteria andOspIdNotEqualTo(String value) {
            addCriterion("osp_id <>", value, "ospId");
            return (Criteria) this;
        }

        public Criteria andOspIdGreaterThan(String value) {
            addCriterion("osp_id >", value, "ospId");
            return (Criteria) this;
        }

        public Criteria andOspIdGreaterThanOrEqualTo(String value) {
            addCriterion("osp_id >=", value, "ospId");
            return (Criteria) this;
        }

        public Criteria andOspIdLessThan(String value) {
            addCriterion("osp_id <", value, "ospId");
            return (Criteria) this;
        }

        public Criteria andOspIdLessThanOrEqualTo(String value) {
            addCriterion("osp_id <=", value, "ospId");
            return (Criteria) this;
        }

        public Criteria andOspIdLike(String value) {
            addCriterion("osp_id like", value, "ospId");
            return (Criteria) this;
        }

        public Criteria andOspIdNotLike(String value) {
            addCriterion("osp_id not like", value, "ospId");
            return (Criteria) this;
        }

        public Criteria andOspIdIn(List<String> values) {
            addCriterion("osp_id in", values, "ospId");
            return (Criteria) this;
        }

        public Criteria andOspIdNotIn(List<String> values) {
            addCriterion("osp_id not in", values, "ospId");
            return (Criteria) this;
        }

        public Criteria andOspIdBetween(String value1, String value2) {
            addCriterion("osp_id between", value1, value2, "ospId");
            return (Criteria) this;
        }

        public Criteria andOspIdNotBetween(String value1, String value2) {
            addCriterion("osp_id not between", value1, value2, "ospId");
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

        public Criteria andPickupStaffIdIsNull() {
            addCriterion("pickup_staff_id is null");
            return (Criteria) this;
        }

        public Criteria andPickupStaffIdIsNotNull() {
            addCriterion("pickup_staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andPickupStaffIdEqualTo(String value) {
            addCriterion("pickup_staff_id =", value, "pickupStaffId");
            return (Criteria) this;
        }

        public Criteria andPickupStaffIdNotEqualTo(String value) {
            addCriterion("pickup_staff_id <>", value, "pickupStaffId");
            return (Criteria) this;
        }

        public Criteria andPickupStaffIdGreaterThan(String value) {
            addCriterion("pickup_staff_id >", value, "pickupStaffId");
            return (Criteria) this;
        }

        public Criteria andPickupStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("pickup_staff_id >=", value, "pickupStaffId");
            return (Criteria) this;
        }

        public Criteria andPickupStaffIdLessThan(String value) {
            addCriterion("pickup_staff_id <", value, "pickupStaffId");
            return (Criteria) this;
        }

        public Criteria andPickupStaffIdLessThanOrEqualTo(String value) {
            addCriterion("pickup_staff_id <=", value, "pickupStaffId");
            return (Criteria) this;
        }

        public Criteria andPickupStaffIdLike(String value) {
            addCriterion("pickup_staff_id like", value, "pickupStaffId");
            return (Criteria) this;
        }

        public Criteria andPickupStaffIdNotLike(String value) {
            addCriterion("pickup_staff_id not like", value, "pickupStaffId");
            return (Criteria) this;
        }

        public Criteria andPickupStaffIdIn(List<String> values) {
            addCriterion("pickup_staff_id in", values, "pickupStaffId");
            return (Criteria) this;
        }

        public Criteria andPickupStaffIdNotIn(List<String> values) {
            addCriterion("pickup_staff_id not in", values, "pickupStaffId");
            return (Criteria) this;
        }

        public Criteria andPickupStaffIdBetween(String value1, String value2) {
            addCriterion("pickup_staff_id between", value1, value2, "pickupStaffId");
            return (Criteria) this;
        }

        public Criteria andPickupStaffIdNotBetween(String value1, String value2) {
            addCriterion("pickup_staff_id not between", value1, value2, "pickupStaffId");
            return (Criteria) this;
        }

        public Criteria andPickupStaffNameIsNull() {
            addCriterion("pickup_staff_name is null");
            return (Criteria) this;
        }

        public Criteria andPickupStaffNameIsNotNull() {
            addCriterion("pickup_staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andPickupStaffNameEqualTo(String value) {
            addCriterion("pickup_staff_name =", value, "pickupStaffName");
            return (Criteria) this;
        }

        public Criteria andPickupStaffNameNotEqualTo(String value) {
            addCriterion("pickup_staff_name <>", value, "pickupStaffName");
            return (Criteria) this;
        }

        public Criteria andPickupStaffNameGreaterThan(String value) {
            addCriterion("pickup_staff_name >", value, "pickupStaffName");
            return (Criteria) this;
        }

        public Criteria andPickupStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("pickup_staff_name >=", value, "pickupStaffName");
            return (Criteria) this;
        }

        public Criteria andPickupStaffNameLessThan(String value) {
            addCriterion("pickup_staff_name <", value, "pickupStaffName");
            return (Criteria) this;
        }

        public Criteria andPickupStaffNameLessThanOrEqualTo(String value) {
            addCriterion("pickup_staff_name <=", value, "pickupStaffName");
            return (Criteria) this;
        }

        public Criteria andPickupStaffNameLike(String value) {
            addCriterion("pickup_staff_name like", value, "pickupStaffName");
            return (Criteria) this;
        }

        public Criteria andPickupStaffNameNotLike(String value) {
            addCriterion("pickup_staff_name not like", value, "pickupStaffName");
            return (Criteria) this;
        }

        public Criteria andPickupStaffNameIn(List<String> values) {
            addCriterion("pickup_staff_name in", values, "pickupStaffName");
            return (Criteria) this;
        }

        public Criteria andPickupStaffNameNotIn(List<String> values) {
            addCriterion("pickup_staff_name not in", values, "pickupStaffName");
            return (Criteria) this;
        }

        public Criteria andPickupStaffNameBetween(String value1, String value2) {
            addCriterion("pickup_staff_name between", value1, value2, "pickupStaffName");
            return (Criteria) this;
        }

        public Criteria andPickupStaffNameNotBetween(String value1, String value2) {
            addCriterion("pickup_staff_name not between", value1, value2, "pickupStaffName");
            return (Criteria) this;
        }

        public Criteria andPickupStaffDepartIsNull() {
            addCriterion("pickup_staff_depart is null");
            return (Criteria) this;
        }

        public Criteria andPickupStaffDepartIsNotNull() {
            addCriterion("pickup_staff_depart is not null");
            return (Criteria) this;
        }

        public Criteria andPickupStaffDepartEqualTo(String value) {
            addCriterion("pickup_staff_depart =", value, "pickupStaffDepart");
            return (Criteria) this;
        }

        public Criteria andPickupStaffDepartNotEqualTo(String value) {
            addCriterion("pickup_staff_depart <>", value, "pickupStaffDepart");
            return (Criteria) this;
        }

        public Criteria andPickupStaffDepartGreaterThan(String value) {
            addCriterion("pickup_staff_depart >", value, "pickupStaffDepart");
            return (Criteria) this;
        }

        public Criteria andPickupStaffDepartGreaterThanOrEqualTo(String value) {
            addCriterion("pickup_staff_depart >=", value, "pickupStaffDepart");
            return (Criteria) this;
        }

        public Criteria andPickupStaffDepartLessThan(String value) {
            addCriterion("pickup_staff_depart <", value, "pickupStaffDepart");
            return (Criteria) this;
        }

        public Criteria andPickupStaffDepartLessThanOrEqualTo(String value) {
            addCriterion("pickup_staff_depart <=", value, "pickupStaffDepart");
            return (Criteria) this;
        }

        public Criteria andPickupStaffDepartLike(String value) {
            addCriterion("pickup_staff_depart like", value, "pickupStaffDepart");
            return (Criteria) this;
        }

        public Criteria andPickupStaffDepartNotLike(String value) {
            addCriterion("pickup_staff_depart not like", value, "pickupStaffDepart");
            return (Criteria) this;
        }

        public Criteria andPickupStaffDepartIn(List<String> values) {
            addCriterion("pickup_staff_depart in", values, "pickupStaffDepart");
            return (Criteria) this;
        }

        public Criteria andPickupStaffDepartNotIn(List<String> values) {
            addCriterion("pickup_staff_depart not in", values, "pickupStaffDepart");
            return (Criteria) this;
        }

        public Criteria andPickupStaffDepartBetween(String value1, String value2) {
            addCriterion("pickup_staff_depart between", value1, value2, "pickupStaffDepart");
            return (Criteria) this;
        }

        public Criteria andPickupStaffDepartNotBetween(String value1, String value2) {
            addCriterion("pickup_staff_depart not between", value1, value2, "pickupStaffDepart");
            return (Criteria) this;
        }

        public Criteria andPickupNumIsNull() {
            addCriterion("pickup_num is null");
            return (Criteria) this;
        }

        public Criteria andPickupNumIsNotNull() {
            addCriterion("pickup_num is not null");
            return (Criteria) this;
        }

        public Criteria andPickupNumEqualTo(Integer value) {
            addCriterion("pickup_num =", value, "pickupNum");
            return (Criteria) this;
        }

        public Criteria andPickupNumNotEqualTo(Integer value) {
            addCriterion("pickup_num <>", value, "pickupNum");
            return (Criteria) this;
        }

        public Criteria andPickupNumGreaterThan(Integer value) {
            addCriterion("pickup_num >", value, "pickupNum");
            return (Criteria) this;
        }

        public Criteria andPickupNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pickup_num >=", value, "pickupNum");
            return (Criteria) this;
        }

        public Criteria andPickupNumLessThan(Integer value) {
            addCriterion("pickup_num <", value, "pickupNum");
            return (Criteria) this;
        }

        public Criteria andPickupNumLessThanOrEqualTo(Integer value) {
            addCriterion("pickup_num <=", value, "pickupNum");
            return (Criteria) this;
        }

        public Criteria andPickupNumIn(List<Integer> values) {
            addCriterion("pickup_num in", values, "pickupNum");
            return (Criteria) this;
        }

        public Criteria andPickupNumNotIn(List<Integer> values) {
            addCriterion("pickup_num not in", values, "pickupNum");
            return (Criteria) this;
        }

        public Criteria andPickupNumBetween(Integer value1, Integer value2) {
            addCriterion("pickup_num between", value1, value2, "pickupNum");
            return (Criteria) this;
        }

        public Criteria andPickupNumNotBetween(Integer value1, Integer value2) {
            addCriterion("pickup_num not between", value1, value2, "pickupNum");
            return (Criteria) this;
        }

        public Criteria andPickupDateIsNull() {
            addCriterion("pickup_date is null");
            return (Criteria) this;
        }

        public Criteria andPickupDateIsNotNull() {
            addCriterion("pickup_date is not null");
            return (Criteria) this;
        }

        public Criteria andPickupDateEqualTo(String value) {
            addCriterion("pickup_date =", value, "pickupDate");
            return (Criteria) this;
        }

        public Criteria andPickupDateNotEqualTo(String value) {
            addCriterion("pickup_date <>", value, "pickupDate");
            return (Criteria) this;
        }

        public Criteria andPickupDateGreaterThan(String value) {
            addCriterion("pickup_date >", value, "pickupDate");
            return (Criteria) this;
        }

        public Criteria andPickupDateGreaterThanOrEqualTo(String value) {
            addCriterion("pickup_date >=", value, "pickupDate");
            return (Criteria) this;
        }

        public Criteria andPickupDateLessThan(String value) {
            addCriterion("pickup_date <", value, "pickupDate");
            return (Criteria) this;
        }

        public Criteria andPickupDateLessThanOrEqualTo(String value) {
            addCriterion("pickup_date <=", value, "pickupDate");
            return (Criteria) this;
        }

        public Criteria andPickupDateLike(String value) {
            addCriterion("pickup_date like", value, "pickupDate");
            return (Criteria) this;
        }

        public Criteria andPickupDateNotLike(String value) {
            addCriterion("pickup_date not like", value, "pickupDate");
            return (Criteria) this;
        }

        public Criteria andPickupDateIn(List<String> values) {
            addCriterion("pickup_date in", values, "pickupDate");
            return (Criteria) this;
        }

        public Criteria andPickupDateNotIn(List<String> values) {
            addCriterion("pickup_date not in", values, "pickupDate");
            return (Criteria) this;
        }

        public Criteria andPickupDateBetween(String value1, String value2) {
            addCriterion("pickup_date between", value1, value2, "pickupDate");
            return (Criteria) this;
        }

        public Criteria andPickupDateNotBetween(String value1, String value2) {
            addCriterion("pickup_date not between", value1, value2, "pickupDate");
            return (Criteria) this;
        }

        public Criteria andAppDateIsNull() {
            addCriterion("app_date is null");
            return (Criteria) this;
        }

        public Criteria andAppDateIsNotNull() {
            addCriterion("app_date is not null");
            return (Criteria) this;
        }

        public Criteria andAppDateEqualTo(String value) {
            addCriterion("app_date =", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateNotEqualTo(String value) {
            addCriterion("app_date <>", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateGreaterThan(String value) {
            addCriterion("app_date >", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateGreaterThanOrEqualTo(String value) {
            addCriterion("app_date >=", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateLessThan(String value) {
            addCriterion("app_date <", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateLessThanOrEqualTo(String value) {
            addCriterion("app_date <=", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateLike(String value) {
            addCriterion("app_date like", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateNotLike(String value) {
            addCriterion("app_date not like", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateIn(List<String> values) {
            addCriterion("app_date in", values, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateNotIn(List<String> values) {
            addCriterion("app_date not in", values, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateBetween(String value1, String value2) {
            addCriterion("app_date between", value1, value2, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateNotBetween(String value1, String value2) {
            addCriterion("app_date not between", value1, value2, "appDate");
            return (Criteria) this;
        }

        public Criteria andToAppIdIsNull() {
            addCriterion("to_app_id is null");
            return (Criteria) this;
        }

        public Criteria andToAppIdIsNotNull() {
            addCriterion("to_app_id is not null");
            return (Criteria) this;
        }

        public Criteria andToAppIdEqualTo(String value) {
            addCriterion("to_app_id =", value, "toAppId");
            return (Criteria) this;
        }

        public Criteria andToAppIdNotEqualTo(String value) {
            addCriterion("to_app_id <>", value, "toAppId");
            return (Criteria) this;
        }

        public Criteria andToAppIdGreaterThan(String value) {
            addCriterion("to_app_id >", value, "toAppId");
            return (Criteria) this;
        }

        public Criteria andToAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("to_app_id >=", value, "toAppId");
            return (Criteria) this;
        }

        public Criteria andToAppIdLessThan(String value) {
            addCriterion("to_app_id <", value, "toAppId");
            return (Criteria) this;
        }

        public Criteria andToAppIdLessThanOrEqualTo(String value) {
            addCriterion("to_app_id <=", value, "toAppId");
            return (Criteria) this;
        }

        public Criteria andToAppIdLike(String value) {
            addCriterion("to_app_id like", value, "toAppId");
            return (Criteria) this;
        }

        public Criteria andToAppIdNotLike(String value) {
            addCriterion("to_app_id not like", value, "toAppId");
            return (Criteria) this;
        }

        public Criteria andToAppIdIn(List<String> values) {
            addCriterion("to_app_id in", values, "toAppId");
            return (Criteria) this;
        }

        public Criteria andToAppIdNotIn(List<String> values) {
            addCriterion("to_app_id not in", values, "toAppId");
            return (Criteria) this;
        }

        public Criteria andToAppIdBetween(String value1, String value2) {
            addCriterion("to_app_id between", value1, value2, "toAppId");
            return (Criteria) this;
        }

        public Criteria andToAppIdNotBetween(String value1, String value2) {
            addCriterion("to_app_id not between", value1, value2, "toAppId");
            return (Criteria) this;
        }

        public Criteria andAppStatusIsNull() {
            addCriterion("app_status is null");
            return (Criteria) this;
        }

        public Criteria andAppStatusIsNotNull() {
            addCriterion("app_status is not null");
            return (Criteria) this;
        }

        public Criteria andAppStatusEqualTo(Integer value) {
            addCriterion("app_status =", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusNotEqualTo(Integer value) {
            addCriterion("app_status <>", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusGreaterThan(Integer value) {
            addCriterion("app_status >", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_status >=", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusLessThan(Integer value) {
            addCriterion("app_status <", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusLessThanOrEqualTo(Integer value) {
            addCriterion("app_status <=", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusIn(List<Integer> values) {
            addCriterion("app_status in", values, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusNotIn(List<Integer> values) {
            addCriterion("app_status not in", values, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusBetween(Integer value1, Integer value2) {
            addCriterion("app_status between", value1, value2, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("app_status not between", value1, value2, "appStatus");
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