package com.ethan.oasy.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OfficeSuppliesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OfficeSuppliesExample() {
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

        public Criteria andOsNameIsNull() {
            addCriterion("os_name is null");
            return (Criteria) this;
        }

        public Criteria andOsNameIsNotNull() {
            addCriterion("os_name is not null");
            return (Criteria) this;
        }

        public Criteria andOsNameEqualTo(String value) {
            addCriterion("os_name =", value, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameNotEqualTo(String value) {
            addCriterion("os_name <>", value, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameGreaterThan(String value) {
            addCriterion("os_name >", value, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameGreaterThanOrEqualTo(String value) {
            addCriterion("os_name >=", value, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameLessThan(String value) {
            addCriterion("os_name <", value, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameLessThanOrEqualTo(String value) {
            addCriterion("os_name <=", value, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameLike(String value) {
            addCriterion("os_name like", value, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameNotLike(String value) {
            addCriterion("os_name not like", value, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameIn(List<String> values) {
            addCriterion("os_name in", values, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameNotIn(List<String> values) {
            addCriterion("os_name not in", values, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameBetween(String value1, String value2) {
            addCriterion("os_name between", value1, value2, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameNotBetween(String value1, String value2) {
            addCriterion("os_name not between", value1, value2, "osName");
            return (Criteria) this;
        }

        public Criteria andOsOrdNumIsNull() {
            addCriterion("os_ord_num is null");
            return (Criteria) this;
        }

        public Criteria andOsOrdNumIsNotNull() {
            addCriterion("os_ord_num is not null");
            return (Criteria) this;
        }

        public Criteria andOsOrdNumEqualTo(String value) {
            addCriterion("os_ord_num =", value, "osOrdNum");
            return (Criteria) this;
        }

        public Criteria andOsOrdNumNotEqualTo(String value) {
            addCriterion("os_ord_num <>", value, "osOrdNum");
            return (Criteria) this;
        }

        public Criteria andOsOrdNumGreaterThan(String value) {
            addCriterion("os_ord_num >", value, "osOrdNum");
            return (Criteria) this;
        }

        public Criteria andOsOrdNumGreaterThanOrEqualTo(String value) {
            addCriterion("os_ord_num >=", value, "osOrdNum");
            return (Criteria) this;
        }

        public Criteria andOsOrdNumLessThan(String value) {
            addCriterion("os_ord_num <", value, "osOrdNum");
            return (Criteria) this;
        }

        public Criteria andOsOrdNumLessThanOrEqualTo(String value) {
            addCriterion("os_ord_num <=", value, "osOrdNum");
            return (Criteria) this;
        }

        public Criteria andOsOrdNumLike(String value) {
            addCriterion("os_ord_num like", value, "osOrdNum");
            return (Criteria) this;
        }

        public Criteria andOsOrdNumNotLike(String value) {
            addCriterion("os_ord_num not like", value, "osOrdNum");
            return (Criteria) this;
        }

        public Criteria andOsOrdNumIn(List<String> values) {
            addCriterion("os_ord_num in", values, "osOrdNum");
            return (Criteria) this;
        }

        public Criteria andOsOrdNumNotIn(List<String> values) {
            addCriterion("os_ord_num not in", values, "osOrdNum");
            return (Criteria) this;
        }

        public Criteria andOsOrdNumBetween(String value1, String value2) {
            addCriterion("os_ord_num between", value1, value2, "osOrdNum");
            return (Criteria) this;
        }

        public Criteria andOsOrdNumNotBetween(String value1, String value2) {
            addCriterion("os_ord_num not between", value1, value2, "osOrdNum");
            return (Criteria) this;
        }

        public Criteria andOsCategoryIsNull() {
            addCriterion("os_category is null");
            return (Criteria) this;
        }

        public Criteria andOsCategoryIsNotNull() {
            addCriterion("os_category is not null");
            return (Criteria) this;
        }

        public Criteria andOsCategoryEqualTo(Integer value) {
            addCriterion("os_category =", value, "osCategory");
            return (Criteria) this;
        }

        public Criteria andOsCategoryNotEqualTo(Integer value) {
            addCriterion("os_category <>", value, "osCategory");
            return (Criteria) this;
        }

        public Criteria andOsCategoryGreaterThan(Integer value) {
            addCriterion("os_category >", value, "osCategory");
            return (Criteria) this;
        }

        public Criteria andOsCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("os_category >=", value, "osCategory");
            return (Criteria) this;
        }

        public Criteria andOsCategoryLessThan(Integer value) {
            addCriterion("os_category <", value, "osCategory");
            return (Criteria) this;
        }

        public Criteria andOsCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("os_category <=", value, "osCategory");
            return (Criteria) this;
        }

        public Criteria andOsCategoryIn(List<Integer> values) {
            addCriterion("os_category in", values, "osCategory");
            return (Criteria) this;
        }

        public Criteria andOsCategoryNotIn(List<Integer> values) {
            addCriterion("os_category not in", values, "osCategory");
            return (Criteria) this;
        }

        public Criteria andOsCategoryBetween(Integer value1, Integer value2) {
            addCriterion("os_category between", value1, value2, "osCategory");
            return (Criteria) this;
        }

        public Criteria andOsCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("os_category not between", value1, value2, "osCategory");
            return (Criteria) this;
        }

        public Criteria andOsSpecificationIsNull() {
            addCriterion("os_specification is null");
            return (Criteria) this;
        }

        public Criteria andOsSpecificationIsNotNull() {
            addCriterion("os_specification is not null");
            return (Criteria) this;
        }

        public Criteria andOsSpecificationEqualTo(String value) {
            addCriterion("os_specification =", value, "osSpecification");
            return (Criteria) this;
        }

        public Criteria andOsSpecificationNotEqualTo(String value) {
            addCriterion("os_specification <>", value, "osSpecification");
            return (Criteria) this;
        }

        public Criteria andOsSpecificationGreaterThan(String value) {
            addCriterion("os_specification >", value, "osSpecification");
            return (Criteria) this;
        }

        public Criteria andOsSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("os_specification >=", value, "osSpecification");
            return (Criteria) this;
        }

        public Criteria andOsSpecificationLessThan(String value) {
            addCriterion("os_specification <", value, "osSpecification");
            return (Criteria) this;
        }

        public Criteria andOsSpecificationLessThanOrEqualTo(String value) {
            addCriterion("os_specification <=", value, "osSpecification");
            return (Criteria) this;
        }

        public Criteria andOsSpecificationLike(String value) {
            addCriterion("os_specification like", value, "osSpecification");
            return (Criteria) this;
        }

        public Criteria andOsSpecificationNotLike(String value) {
            addCriterion("os_specification not like", value, "osSpecification");
            return (Criteria) this;
        }

        public Criteria andOsSpecificationIn(List<String> values) {
            addCriterion("os_specification in", values, "osSpecification");
            return (Criteria) this;
        }

        public Criteria andOsSpecificationNotIn(List<String> values) {
            addCriterion("os_specification not in", values, "osSpecification");
            return (Criteria) this;
        }

        public Criteria andOsSpecificationBetween(String value1, String value2) {
            addCriterion("os_specification between", value1, value2, "osSpecification");
            return (Criteria) this;
        }

        public Criteria andOsSpecificationNotBetween(String value1, String value2) {
            addCriterion("os_specification not between", value1, value2, "osSpecification");
            return (Criteria) this;
        }

        public Criteria andOsUnitIsNull() {
            addCriterion("os_unit is null");
            return (Criteria) this;
        }

        public Criteria andOsUnitIsNotNull() {
            addCriterion("os_unit is not null");
            return (Criteria) this;
        }

        public Criteria andOsUnitEqualTo(Integer value) {
            addCriterion("os_unit =", value, "osUnit");
            return (Criteria) this;
        }

        public Criteria andOsUnitNotEqualTo(Integer value) {
            addCriterion("os_unit <>", value, "osUnit");
            return (Criteria) this;
        }

        public Criteria andOsUnitGreaterThan(Integer value) {
            addCriterion("os_unit >", value, "osUnit");
            return (Criteria) this;
        }

        public Criteria andOsUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("os_unit >=", value, "osUnit");
            return (Criteria) this;
        }

        public Criteria andOsUnitLessThan(Integer value) {
            addCriterion("os_unit <", value, "osUnit");
            return (Criteria) this;
        }

        public Criteria andOsUnitLessThanOrEqualTo(Integer value) {
            addCriterion("os_unit <=", value, "osUnit");
            return (Criteria) this;
        }

        public Criteria andOsUnitIn(List<Integer> values) {
            addCriterion("os_unit in", values, "osUnit");
            return (Criteria) this;
        }

        public Criteria andOsUnitNotIn(List<Integer> values) {
            addCriterion("os_unit not in", values, "osUnit");
            return (Criteria) this;
        }

        public Criteria andOsUnitBetween(Integer value1, Integer value2) {
            addCriterion("os_unit between", value1, value2, "osUnit");
            return (Criteria) this;
        }

        public Criteria andOsUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("os_unit not between", value1, value2, "osUnit");
            return (Criteria) this;
        }

        public Criteria andOsPriceIsNull() {
            addCriterion("os_price is null");
            return (Criteria) this;
        }

        public Criteria andOsPriceIsNotNull() {
            addCriterion("os_price is not null");
            return (Criteria) this;
        }

        public Criteria andOsPriceEqualTo(BigDecimal value) {
            addCriterion("os_price =", value, "osPrice");
            return (Criteria) this;
        }

        public Criteria andOsPriceNotEqualTo(BigDecimal value) {
            addCriterion("os_price <>", value, "osPrice");
            return (Criteria) this;
        }

        public Criteria andOsPriceGreaterThan(BigDecimal value) {
            addCriterion("os_price >", value, "osPrice");
            return (Criteria) this;
        }

        public Criteria andOsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("os_price >=", value, "osPrice");
            return (Criteria) this;
        }

        public Criteria andOsPriceLessThan(BigDecimal value) {
            addCriterion("os_price <", value, "osPrice");
            return (Criteria) this;
        }

        public Criteria andOsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("os_price <=", value, "osPrice");
            return (Criteria) this;
        }

        public Criteria andOsPriceIn(List<BigDecimal> values) {
            addCriterion("os_price in", values, "osPrice");
            return (Criteria) this;
        }

        public Criteria andOsPriceNotIn(List<BigDecimal> values) {
            addCriterion("os_price not in", values, "osPrice");
            return (Criteria) this;
        }

        public Criteria andOsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("os_price between", value1, value2, "osPrice");
            return (Criteria) this;
        }

        public Criteria andOsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("os_price not between", value1, value2, "osPrice");
            return (Criteria) this;
        }

        public Criteria andOsTotalIsNull() {
            addCriterion("os_total is null");
            return (Criteria) this;
        }

        public Criteria andOsTotalIsNotNull() {
            addCriterion("os_total is not null");
            return (Criteria) this;
        }

        public Criteria andOsTotalEqualTo(Integer value) {
            addCriterion("os_total =", value, "osTotal");
            return (Criteria) this;
        }

        public Criteria andOsTotalNotEqualTo(Integer value) {
            addCriterion("os_total <>", value, "osTotal");
            return (Criteria) this;
        }

        public Criteria andOsTotalGreaterThan(Integer value) {
            addCriterion("os_total >", value, "osTotal");
            return (Criteria) this;
        }

        public Criteria andOsTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("os_total >=", value, "osTotal");
            return (Criteria) this;
        }

        public Criteria andOsTotalLessThan(Integer value) {
            addCriterion("os_total <", value, "osTotal");
            return (Criteria) this;
        }

        public Criteria andOsTotalLessThanOrEqualTo(Integer value) {
            addCriterion("os_total <=", value, "osTotal");
            return (Criteria) this;
        }

        public Criteria andOsTotalIn(List<Integer> values) {
            addCriterion("os_total in", values, "osTotal");
            return (Criteria) this;
        }

        public Criteria andOsTotalNotIn(List<Integer> values) {
            addCriterion("os_total not in", values, "osTotal");
            return (Criteria) this;
        }

        public Criteria andOsTotalBetween(Integer value1, Integer value2) {
            addCriterion("os_total between", value1, value2, "osTotal");
            return (Criteria) this;
        }

        public Criteria andOsTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("os_total not between", value1, value2, "osTotal");
            return (Criteria) this;
        }

        public Criteria andOsNotInputIsNull() {
            addCriterion("os_not_input is null");
            return (Criteria) this;
        }

        public Criteria andOsNotInputIsNotNull() {
            addCriterion("os_not_input is not null");
            return (Criteria) this;
        }

        public Criteria andOsNotInputEqualTo(Integer value) {
            addCriterion("os_not_input =", value, "osNotInput");
            return (Criteria) this;
        }

        public Criteria andOsNotInputNotEqualTo(Integer value) {
            addCriterion("os_not_input <>", value, "osNotInput");
            return (Criteria) this;
        }

        public Criteria andOsNotInputGreaterThan(Integer value) {
            addCriterion("os_not_input >", value, "osNotInput");
            return (Criteria) this;
        }

        public Criteria andOsNotInputGreaterThanOrEqualTo(Integer value) {
            addCriterion("os_not_input >=", value, "osNotInput");
            return (Criteria) this;
        }

        public Criteria andOsNotInputLessThan(Integer value) {
            addCriterion("os_not_input <", value, "osNotInput");
            return (Criteria) this;
        }

        public Criteria andOsNotInputLessThanOrEqualTo(Integer value) {
            addCriterion("os_not_input <=", value, "osNotInput");
            return (Criteria) this;
        }

        public Criteria andOsNotInputIn(List<Integer> values) {
            addCriterion("os_not_input in", values, "osNotInput");
            return (Criteria) this;
        }

        public Criteria andOsNotInputNotIn(List<Integer> values) {
            addCriterion("os_not_input not in", values, "osNotInput");
            return (Criteria) this;
        }

        public Criteria andOsNotInputBetween(Integer value1, Integer value2) {
            addCriterion("os_not_input between", value1, value2, "osNotInput");
            return (Criteria) this;
        }

        public Criteria andOsNotInputNotBetween(Integer value1, Integer value2) {
            addCriterion("os_not_input not between", value1, value2, "osNotInput");
            return (Criteria) this;
        }

        public Criteria andOsStatisticalDateIsNull() {
            addCriterion("os_statistical_date is null");
            return (Criteria) this;
        }

        public Criteria andOsStatisticalDateIsNotNull() {
            addCriterion("os_statistical_date is not null");
            return (Criteria) this;
        }

        public Criteria andOsStatisticalDateEqualTo(String value) {
            addCriterion("os_statistical_date =", value, "osStatisticalDate");
            return (Criteria) this;
        }

        public Criteria andOsStatisticalDateNotEqualTo(String value) {
            addCriterion("os_statistical_date <>", value, "osStatisticalDate");
            return (Criteria) this;
        }

        public Criteria andOsStatisticalDateGreaterThan(String value) {
            addCriterion("os_statistical_date >", value, "osStatisticalDate");
            return (Criteria) this;
        }

        public Criteria andOsStatisticalDateGreaterThanOrEqualTo(String value) {
            addCriterion("os_statistical_date >=", value, "osStatisticalDate");
            return (Criteria) this;
        }

        public Criteria andOsStatisticalDateLessThan(String value) {
            addCriterion("os_statistical_date <", value, "osStatisticalDate");
            return (Criteria) this;
        }

        public Criteria andOsStatisticalDateLessThanOrEqualTo(String value) {
            addCriterion("os_statistical_date <=", value, "osStatisticalDate");
            return (Criteria) this;
        }

        public Criteria andOsStatisticalDateLike(String value) {
            addCriterion("os_statistical_date like", value, "osStatisticalDate");
            return (Criteria) this;
        }

        public Criteria andOsStatisticalDateNotLike(String value) {
            addCriterion("os_statistical_date not like", value, "osStatisticalDate");
            return (Criteria) this;
        }

        public Criteria andOsStatisticalDateIn(List<String> values) {
            addCriterion("os_statistical_date in", values, "osStatisticalDate");
            return (Criteria) this;
        }

        public Criteria andOsStatisticalDateNotIn(List<String> values) {
            addCriterion("os_statistical_date not in", values, "osStatisticalDate");
            return (Criteria) this;
        }

        public Criteria andOsStatisticalDateBetween(String value1, String value2) {
            addCriterion("os_statistical_date between", value1, value2, "osStatisticalDate");
            return (Criteria) this;
        }

        public Criteria andOsStatisticalDateNotBetween(String value1, String value2) {
            addCriterion("os_statistical_date not between", value1, value2, "osStatisticalDate");
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