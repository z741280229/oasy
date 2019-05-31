package com.ethan.oasy.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarExample() {
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

        public Criteria andCarNumberIsNull() {
            addCriterion("car_number is null");
            return (Criteria) this;
        }

        public Criteria andCarNumberIsNotNull() {
            addCriterion("car_number is not null");
            return (Criteria) this;
        }

        public Criteria andCarNumberEqualTo(String value) {
            addCriterion("car_number =", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotEqualTo(String value) {
            addCriterion("car_number <>", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberGreaterThan(String value) {
            addCriterion("car_number >", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberGreaterThanOrEqualTo(String value) {
            addCriterion("car_number >=", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLessThan(String value) {
            addCriterion("car_number <", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLessThanOrEqualTo(String value) {
            addCriterion("car_number <=", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberLike(String value) {
            addCriterion("car_number like", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotLike(String value) {
            addCriterion("car_number not like", value, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberIn(List<String> values) {
            addCriterion("car_number in", values, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotIn(List<String> values) {
            addCriterion("car_number not in", values, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberBetween(String value1, String value2) {
            addCriterion("car_number between", value1, value2, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarNumberNotBetween(String value1, String value2) {
            addCriterion("car_number not between", value1, value2, "carNumber");
            return (Criteria) this;
        }

        public Criteria andCarBrandIsNull() {
            addCriterion("car_brand is null");
            return (Criteria) this;
        }

        public Criteria andCarBrandIsNotNull() {
            addCriterion("car_brand is not null");
            return (Criteria) this;
        }

        public Criteria andCarBrandEqualTo(String value) {
            addCriterion("car_brand =", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotEqualTo(String value) {
            addCriterion("car_brand <>", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandGreaterThan(String value) {
            addCriterion("car_brand >", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandGreaterThanOrEqualTo(String value) {
            addCriterion("car_brand >=", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLessThan(String value) {
            addCriterion("car_brand <", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLessThanOrEqualTo(String value) {
            addCriterion("car_brand <=", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandLike(String value) {
            addCriterion("car_brand like", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotLike(String value) {
            addCriterion("car_brand not like", value, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandIn(List<String> values) {
            addCriterion("car_brand in", values, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotIn(List<String> values) {
            addCriterion("car_brand not in", values, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandBetween(String value1, String value2) {
            addCriterion("car_brand between", value1, value2, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarBrandNotBetween(String value1, String value2) {
            addCriterion("car_brand not between", value1, value2, "carBrand");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNull() {
            addCriterion("car_type is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNotNull() {
            addCriterion("car_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeEqualTo(Integer value) {
            addCriterion("car_type =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(Integer value) {
            addCriterion("car_type <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(Integer value) {
            addCriterion("car_type >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_type >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(Integer value) {
            addCriterion("car_type <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(Integer value) {
            addCriterion("car_type <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<Integer> values) {
            addCriterion("car_type in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<Integer> values) {
            addCriterion("car_type not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(Integer value1, Integer value2) {
            addCriterion("car_type between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("car_type not between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarSpaceIsNull() {
            addCriterion("car_space is null");
            return (Criteria) this;
        }

        public Criteria andCarSpaceIsNotNull() {
            addCriterion("car_space is not null");
            return (Criteria) this;
        }

        public Criteria andCarSpaceEqualTo(Integer value) {
            addCriterion("car_space =", value, "carSpace");
            return (Criteria) this;
        }

        public Criteria andCarSpaceNotEqualTo(Integer value) {
            addCriterion("car_space <>", value, "carSpace");
            return (Criteria) this;
        }

        public Criteria andCarSpaceGreaterThan(Integer value) {
            addCriterion("car_space >", value, "carSpace");
            return (Criteria) this;
        }

        public Criteria andCarSpaceGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_space >=", value, "carSpace");
            return (Criteria) this;
        }

        public Criteria andCarSpaceLessThan(Integer value) {
            addCriterion("car_space <", value, "carSpace");
            return (Criteria) this;
        }

        public Criteria andCarSpaceLessThanOrEqualTo(Integer value) {
            addCriterion("car_space <=", value, "carSpace");
            return (Criteria) this;
        }

        public Criteria andCarSpaceIn(List<Integer> values) {
            addCriterion("car_space in", values, "carSpace");
            return (Criteria) this;
        }

        public Criteria andCarSpaceNotIn(List<Integer> values) {
            addCriterion("car_space not in", values, "carSpace");
            return (Criteria) this;
        }

        public Criteria andCarSpaceBetween(Integer value1, Integer value2) {
            addCriterion("car_space between", value1, value2, "carSpace");
            return (Criteria) this;
        }

        public Criteria andCarSpaceNotBetween(Integer value1, Integer value2) {
            addCriterion("car_space not between", value1, value2, "carSpace");
            return (Criteria) this;
        }

        public Criteria andCarDriverIdIsNull() {
            addCriterion("car_driver_id is null");
            return (Criteria) this;
        }

        public Criteria andCarDriverIdIsNotNull() {
            addCriterion("car_driver_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarDriverIdEqualTo(String value) {
            addCriterion("car_driver_id =", value, "carDriverId");
            return (Criteria) this;
        }

        public Criteria andCarDriverIdNotEqualTo(String value) {
            addCriterion("car_driver_id <>", value, "carDriverId");
            return (Criteria) this;
        }

        public Criteria andCarDriverIdGreaterThan(String value) {
            addCriterion("car_driver_id >", value, "carDriverId");
            return (Criteria) this;
        }

        public Criteria andCarDriverIdGreaterThanOrEqualTo(String value) {
            addCriterion("car_driver_id >=", value, "carDriverId");
            return (Criteria) this;
        }

        public Criteria andCarDriverIdLessThan(String value) {
            addCriterion("car_driver_id <", value, "carDriverId");
            return (Criteria) this;
        }

        public Criteria andCarDriverIdLessThanOrEqualTo(String value) {
            addCriterion("car_driver_id <=", value, "carDriverId");
            return (Criteria) this;
        }

        public Criteria andCarDriverIdLike(String value) {
            addCriterion("car_driver_id like", value, "carDriverId");
            return (Criteria) this;
        }

        public Criteria andCarDriverIdNotLike(String value) {
            addCriterion("car_driver_id not like", value, "carDriverId");
            return (Criteria) this;
        }

        public Criteria andCarDriverIdIn(List<String> values) {
            addCriterion("car_driver_id in", values, "carDriverId");
            return (Criteria) this;
        }

        public Criteria andCarDriverIdNotIn(List<String> values) {
            addCriterion("car_driver_id not in", values, "carDriverId");
            return (Criteria) this;
        }

        public Criteria andCarDriverIdBetween(String value1, String value2) {
            addCriterion("car_driver_id between", value1, value2, "carDriverId");
            return (Criteria) this;
        }

        public Criteria andCarDriverIdNotBetween(String value1, String value2) {
            addCriterion("car_driver_id not between", value1, value2, "carDriverId");
            return (Criteria) this;
        }

        public Criteria andCarDriverNameIsNull() {
            addCriterion("car_driver_name is null");
            return (Criteria) this;
        }

        public Criteria andCarDriverNameIsNotNull() {
            addCriterion("car_driver_name is not null");
            return (Criteria) this;
        }

        public Criteria andCarDriverNameEqualTo(String value) {
            addCriterion("car_driver_name =", value, "carDriverName");
            return (Criteria) this;
        }

        public Criteria andCarDriverNameNotEqualTo(String value) {
            addCriterion("car_driver_name <>", value, "carDriverName");
            return (Criteria) this;
        }

        public Criteria andCarDriverNameGreaterThan(String value) {
            addCriterion("car_driver_name >", value, "carDriverName");
            return (Criteria) this;
        }

        public Criteria andCarDriverNameGreaterThanOrEqualTo(String value) {
            addCriterion("car_driver_name >=", value, "carDriverName");
            return (Criteria) this;
        }

        public Criteria andCarDriverNameLessThan(String value) {
            addCriterion("car_driver_name <", value, "carDriverName");
            return (Criteria) this;
        }

        public Criteria andCarDriverNameLessThanOrEqualTo(String value) {
            addCriterion("car_driver_name <=", value, "carDriverName");
            return (Criteria) this;
        }

        public Criteria andCarDriverNameLike(String value) {
            addCriterion("car_driver_name like", value, "carDriverName");
            return (Criteria) this;
        }

        public Criteria andCarDriverNameNotLike(String value) {
            addCriterion("car_driver_name not like", value, "carDriverName");
            return (Criteria) this;
        }

        public Criteria andCarDriverNameIn(List<String> values) {
            addCriterion("car_driver_name in", values, "carDriverName");
            return (Criteria) this;
        }

        public Criteria andCarDriverNameNotIn(List<String> values) {
            addCriterion("car_driver_name not in", values, "carDriverName");
            return (Criteria) this;
        }

        public Criteria andCarDriverNameBetween(String value1, String value2) {
            addCriterion("car_driver_name between", value1, value2, "carDriverName");
            return (Criteria) this;
        }

        public Criteria andCarDriverNameNotBetween(String value1, String value2) {
            addCriterion("car_driver_name not between", value1, value2, "carDriverName");
            return (Criteria) this;
        }

        public Criteria andCarDriverTelIsNull() {
            addCriterion("car_driver_tel is null");
            return (Criteria) this;
        }

        public Criteria andCarDriverTelIsNotNull() {
            addCriterion("car_driver_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCarDriverTelEqualTo(String value) {
            addCriterion("car_driver_tel =", value, "carDriverTel");
            return (Criteria) this;
        }

        public Criteria andCarDriverTelNotEqualTo(String value) {
            addCriterion("car_driver_tel <>", value, "carDriverTel");
            return (Criteria) this;
        }

        public Criteria andCarDriverTelGreaterThan(String value) {
            addCriterion("car_driver_tel >", value, "carDriverTel");
            return (Criteria) this;
        }

        public Criteria andCarDriverTelGreaterThanOrEqualTo(String value) {
            addCriterion("car_driver_tel >=", value, "carDriverTel");
            return (Criteria) this;
        }

        public Criteria andCarDriverTelLessThan(String value) {
            addCriterion("car_driver_tel <", value, "carDriverTel");
            return (Criteria) this;
        }

        public Criteria andCarDriverTelLessThanOrEqualTo(String value) {
            addCriterion("car_driver_tel <=", value, "carDriverTel");
            return (Criteria) this;
        }

        public Criteria andCarDriverTelLike(String value) {
            addCriterion("car_driver_tel like", value, "carDriverTel");
            return (Criteria) this;
        }

        public Criteria andCarDriverTelNotLike(String value) {
            addCriterion("car_driver_tel not like", value, "carDriverTel");
            return (Criteria) this;
        }

        public Criteria andCarDriverTelIn(List<String> values) {
            addCriterion("car_driver_tel in", values, "carDriverTel");
            return (Criteria) this;
        }

        public Criteria andCarDriverTelNotIn(List<String> values) {
            addCriterion("car_driver_tel not in", values, "carDriverTel");
            return (Criteria) this;
        }

        public Criteria andCarDriverTelBetween(String value1, String value2) {
            addCriterion("car_driver_tel between", value1, value2, "carDriverTel");
            return (Criteria) this;
        }

        public Criteria andCarDriverTelNotBetween(String value1, String value2) {
            addCriterion("car_driver_tel not between", value1, value2, "carDriverTel");
            return (Criteria) this;
        }

        public Criteria andCarLimitsIsNull() {
            addCriterion("car_limits is null");
            return (Criteria) this;
        }

        public Criteria andCarLimitsIsNotNull() {
            addCriterion("car_limits is not null");
            return (Criteria) this;
        }

        public Criteria andCarLimitsEqualTo(Integer value) {
            addCriterion("car_limits =", value, "carLimits");
            return (Criteria) this;
        }

        public Criteria andCarLimitsNotEqualTo(Integer value) {
            addCriterion("car_limits <>", value, "carLimits");
            return (Criteria) this;
        }

        public Criteria andCarLimitsGreaterThan(Integer value) {
            addCriterion("car_limits >", value, "carLimits");
            return (Criteria) this;
        }

        public Criteria andCarLimitsGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_limits >=", value, "carLimits");
            return (Criteria) this;
        }

        public Criteria andCarLimitsLessThan(Integer value) {
            addCriterion("car_limits <", value, "carLimits");
            return (Criteria) this;
        }

        public Criteria andCarLimitsLessThanOrEqualTo(Integer value) {
            addCriterion("car_limits <=", value, "carLimits");
            return (Criteria) this;
        }

        public Criteria andCarLimitsIn(List<Integer> values) {
            addCriterion("car_limits in", values, "carLimits");
            return (Criteria) this;
        }

        public Criteria andCarLimitsNotIn(List<Integer> values) {
            addCriterion("car_limits not in", values, "carLimits");
            return (Criteria) this;
        }

        public Criteria andCarLimitsBetween(Integer value1, Integer value2) {
            addCriterion("car_limits between", value1, value2, "carLimits");
            return (Criteria) this;
        }

        public Criteria andCarLimitsNotBetween(Integer value1, Integer value2) {
            addCriterion("car_limits not between", value1, value2, "carLimits");
            return (Criteria) this;
        }

        public Criteria andCarDateSafeIsNull() {
            addCriterion("car_date_safe is null");
            return (Criteria) this;
        }

        public Criteria andCarDateSafeIsNotNull() {
            addCriterion("car_date_safe is not null");
            return (Criteria) this;
        }

        public Criteria andCarDateSafeEqualTo(String value) {
            addCriterion("car_date_safe =", value, "carDateSafe");
            return (Criteria) this;
        }

        public Criteria andCarDateSafeNotEqualTo(String value) {
            addCriterion("car_date_safe <>", value, "carDateSafe");
            return (Criteria) this;
        }

        public Criteria andCarDateSafeGreaterThan(String value) {
            addCriterion("car_date_safe >", value, "carDateSafe");
            return (Criteria) this;
        }

        public Criteria andCarDateSafeGreaterThanOrEqualTo(String value) {
            addCriterion("car_date_safe >=", value, "carDateSafe");
            return (Criteria) this;
        }

        public Criteria andCarDateSafeLessThan(String value) {
            addCriterion("car_date_safe <", value, "carDateSafe");
            return (Criteria) this;
        }

        public Criteria andCarDateSafeLessThanOrEqualTo(String value) {
            addCriterion("car_date_safe <=", value, "carDateSafe");
            return (Criteria) this;
        }

        public Criteria andCarDateSafeLike(String value) {
            addCriterion("car_date_safe like", value, "carDateSafe");
            return (Criteria) this;
        }

        public Criteria andCarDateSafeNotLike(String value) {
            addCriterion("car_date_safe not like", value, "carDateSafe");
            return (Criteria) this;
        }

        public Criteria andCarDateSafeIn(List<String> values) {
            addCriterion("car_date_safe in", values, "carDateSafe");
            return (Criteria) this;
        }

        public Criteria andCarDateSafeNotIn(List<String> values) {
            addCriterion("car_date_safe not in", values, "carDateSafe");
            return (Criteria) this;
        }

        public Criteria andCarDateSafeBetween(String value1, String value2) {
            addCriterion("car_date_safe between", value1, value2, "carDateSafe");
            return (Criteria) this;
        }

        public Criteria andCarDateSafeNotBetween(String value1, String value2) {
            addCriterion("car_date_safe not between", value1, value2, "carDateSafe");
            return (Criteria) this;
        }

        public Criteria andCarStatusIsNull() {
            addCriterion("car_status is null");
            return (Criteria) this;
        }

        public Criteria andCarStatusIsNotNull() {
            addCriterion("car_status is not null");
            return (Criteria) this;
        }

        public Criteria andCarStatusEqualTo(Integer value) {
            addCriterion("car_status =", value, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusNotEqualTo(Integer value) {
            addCriterion("car_status <>", value, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusGreaterThan(Integer value) {
            addCriterion("car_status >", value, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_status >=", value, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusLessThan(Integer value) {
            addCriterion("car_status <", value, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusLessThanOrEqualTo(Integer value) {
            addCriterion("car_status <=", value, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusIn(List<Integer> values) {
            addCriterion("car_status in", values, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusNotIn(List<Integer> values) {
            addCriterion("car_status not in", values, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusBetween(Integer value1, Integer value2) {
            addCriterion("car_status between", value1, value2, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("car_status not between", value1, value2, "carStatus");
            return (Criteria) this;
        }

        public Criteria andCarMileageIsNull() {
            addCriterion("car_mileage is null");
            return (Criteria) this;
        }

        public Criteria andCarMileageIsNotNull() {
            addCriterion("car_mileage is not null");
            return (Criteria) this;
        }

        public Criteria andCarMileageEqualTo(Integer value) {
            addCriterion("car_mileage =", value, "carMileage");
            return (Criteria) this;
        }

        public Criteria andCarMileageNotEqualTo(Integer value) {
            addCriterion("car_mileage <>", value, "carMileage");
            return (Criteria) this;
        }

        public Criteria andCarMileageGreaterThan(Integer value) {
            addCriterion("car_mileage >", value, "carMileage");
            return (Criteria) this;
        }

        public Criteria andCarMileageGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_mileage >=", value, "carMileage");
            return (Criteria) this;
        }

        public Criteria andCarMileageLessThan(Integer value) {
            addCriterion("car_mileage <", value, "carMileage");
            return (Criteria) this;
        }

        public Criteria andCarMileageLessThanOrEqualTo(Integer value) {
            addCriterion("car_mileage <=", value, "carMileage");
            return (Criteria) this;
        }

        public Criteria andCarMileageIn(List<Integer> values) {
            addCriterion("car_mileage in", values, "carMileage");
            return (Criteria) this;
        }

        public Criteria andCarMileageNotIn(List<Integer> values) {
            addCriterion("car_mileage not in", values, "carMileage");
            return (Criteria) this;
        }

        public Criteria andCarMileageBetween(Integer value1, Integer value2) {
            addCriterion("car_mileage between", value1, value2, "carMileage");
            return (Criteria) this;
        }

        public Criteria andCarMileageNotBetween(Integer value1, Integer value2) {
            addCriterion("car_mileage not between", value1, value2, "carMileage");
            return (Criteria) this;
        }

        public Criteria andCOilMassIsNull() {
            addCriterion("c_oil_mass is null");
            return (Criteria) this;
        }

        public Criteria andCOilMassIsNotNull() {
            addCriterion("c_oil_mass is not null");
            return (Criteria) this;
        }

        public Criteria andCOilMassEqualTo(BigDecimal value) {
            addCriterion("c_oil_mass =", value, "cOilMass");
            return (Criteria) this;
        }

        public Criteria andCOilMassNotEqualTo(BigDecimal value) {
            addCriterion("c_oil_mass <>", value, "cOilMass");
            return (Criteria) this;
        }

        public Criteria andCOilMassGreaterThan(BigDecimal value) {
            addCriterion("c_oil_mass >", value, "cOilMass");
            return (Criteria) this;
        }

        public Criteria andCOilMassGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c_oil_mass >=", value, "cOilMass");
            return (Criteria) this;
        }

        public Criteria andCOilMassLessThan(BigDecimal value) {
            addCriterion("c_oil_mass <", value, "cOilMass");
            return (Criteria) this;
        }

        public Criteria andCOilMassLessThanOrEqualTo(BigDecimal value) {
            addCriterion("c_oil_mass <=", value, "cOilMass");
            return (Criteria) this;
        }

        public Criteria andCOilMassIn(List<BigDecimal> values) {
            addCriterion("c_oil_mass in", values, "cOilMass");
            return (Criteria) this;
        }

        public Criteria andCOilMassNotIn(List<BigDecimal> values) {
            addCriterion("c_oil_mass not in", values, "cOilMass");
            return (Criteria) this;
        }

        public Criteria andCOilMassBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_oil_mass between", value1, value2, "cOilMass");
            return (Criteria) this;
        }

        public Criteria andCOilMassNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c_oil_mass not between", value1, value2, "cOilMass");
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