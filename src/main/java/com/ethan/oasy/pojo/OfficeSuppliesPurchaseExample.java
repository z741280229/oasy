package com.ethan.oasy.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OfficeSuppliesPurchaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OfficeSuppliesPurchaseExample() {
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

        public Criteria andOsbIdIsNull() {
            addCriterion("osb_id is null");
            return (Criteria) this;
        }

        public Criteria andOsbIdIsNotNull() {
            addCriterion("osb_id is not null");
            return (Criteria) this;
        }

        public Criteria andOsbIdEqualTo(String value) {
            addCriterion("osb_id =", value, "osbId");
            return (Criteria) this;
        }

        public Criteria andOsbIdNotEqualTo(String value) {
            addCriterion("osb_id <>", value, "osbId");
            return (Criteria) this;
        }

        public Criteria andOsbIdGreaterThan(String value) {
            addCriterion("osb_id >", value, "osbId");
            return (Criteria) this;
        }

        public Criteria andOsbIdGreaterThanOrEqualTo(String value) {
            addCriterion("osb_id >=", value, "osbId");
            return (Criteria) this;
        }

        public Criteria andOsbIdLessThan(String value) {
            addCriterion("osb_id <", value, "osbId");
            return (Criteria) this;
        }

        public Criteria andOsbIdLessThanOrEqualTo(String value) {
            addCriterion("osb_id <=", value, "osbId");
            return (Criteria) this;
        }

        public Criteria andOsbIdLike(String value) {
            addCriterion("osb_id like", value, "osbId");
            return (Criteria) this;
        }

        public Criteria andOsbIdNotLike(String value) {
            addCriterion("osb_id not like", value, "osbId");
            return (Criteria) this;
        }

        public Criteria andOsbIdIn(List<String> values) {
            addCriterion("osb_id in", values, "osbId");
            return (Criteria) this;
        }

        public Criteria andOsbIdNotIn(List<String> values) {
            addCriterion("osb_id not in", values, "osbId");
            return (Criteria) this;
        }

        public Criteria andOsbIdBetween(String value1, String value2) {
            addCriterion("osb_id between", value1, value2, "osbId");
            return (Criteria) this;
        }

        public Criteria andOsbIdNotBetween(String value1, String value2) {
            addCriterion("osb_id not between", value1, value2, "osbId");
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

        public Criteria andPurchaserIdIsNull() {
            addCriterion("purchaser_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdIsNotNull() {
            addCriterion("purchaser_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdEqualTo(String value) {
            addCriterion("purchaser_id =", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdNotEqualTo(String value) {
            addCriterion("purchaser_id <>", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdGreaterThan(String value) {
            addCriterion("purchaser_id >", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdGreaterThanOrEqualTo(String value) {
            addCriterion("purchaser_id >=", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdLessThan(String value) {
            addCriterion("purchaser_id <", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdLessThanOrEqualTo(String value) {
            addCriterion("purchaser_id <=", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdLike(String value) {
            addCriterion("purchaser_id like", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdNotLike(String value) {
            addCriterion("purchaser_id not like", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdIn(List<String> values) {
            addCriterion("purchaser_id in", values, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdNotIn(List<String> values) {
            addCriterion("purchaser_id not in", values, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdBetween(String value1, String value2) {
            addCriterion("purchaser_id between", value1, value2, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdNotBetween(String value1, String value2) {
            addCriterion("purchaser_id not between", value1, value2, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserNameIsNull() {
            addCriterion("purchaser_name is null");
            return (Criteria) this;
        }

        public Criteria andPurchaserNameIsNotNull() {
            addCriterion("purchaser_name is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaserNameEqualTo(String value) {
            addCriterion("purchaser_name =", value, "purchaserName");
            return (Criteria) this;
        }

        public Criteria andPurchaserNameNotEqualTo(String value) {
            addCriterion("purchaser_name <>", value, "purchaserName");
            return (Criteria) this;
        }

        public Criteria andPurchaserNameGreaterThan(String value) {
            addCriterion("purchaser_name >", value, "purchaserName");
            return (Criteria) this;
        }

        public Criteria andPurchaserNameGreaterThanOrEqualTo(String value) {
            addCriterion("purchaser_name >=", value, "purchaserName");
            return (Criteria) this;
        }

        public Criteria andPurchaserNameLessThan(String value) {
            addCriterion("purchaser_name <", value, "purchaserName");
            return (Criteria) this;
        }

        public Criteria andPurchaserNameLessThanOrEqualTo(String value) {
            addCriterion("purchaser_name <=", value, "purchaserName");
            return (Criteria) this;
        }

        public Criteria andPurchaserNameLike(String value) {
            addCriterion("purchaser_name like", value, "purchaserName");
            return (Criteria) this;
        }

        public Criteria andPurchaserNameNotLike(String value) {
            addCriterion("purchaser_name not like", value, "purchaserName");
            return (Criteria) this;
        }

        public Criteria andPurchaserNameIn(List<String> values) {
            addCriterion("purchaser_name in", values, "purchaserName");
            return (Criteria) this;
        }

        public Criteria andPurchaserNameNotIn(List<String> values) {
            addCriterion("purchaser_name not in", values, "purchaserName");
            return (Criteria) this;
        }

        public Criteria andPurchaserNameBetween(String value1, String value2) {
            addCriterion("purchaser_name between", value1, value2, "purchaserName");
            return (Criteria) this;
        }

        public Criteria andPurchaserNameNotBetween(String value1, String value2) {
            addCriterion("purchaser_name not between", value1, value2, "purchaserName");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserNameIsNull() {
            addCriterion("agree_purchaser_name is null");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserNameIsNotNull() {
            addCriterion("agree_purchaser_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserNameEqualTo(String value) {
            addCriterion("agree_purchaser_name =", value, "agreePurchaserName");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserNameNotEqualTo(String value) {
            addCriterion("agree_purchaser_name <>", value, "agreePurchaserName");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserNameGreaterThan(String value) {
            addCriterion("agree_purchaser_name >", value, "agreePurchaserName");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserNameGreaterThanOrEqualTo(String value) {
            addCriterion("agree_purchaser_name >=", value, "agreePurchaserName");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserNameLessThan(String value) {
            addCriterion("agree_purchaser_name <", value, "agreePurchaserName");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserNameLessThanOrEqualTo(String value) {
            addCriterion("agree_purchaser_name <=", value, "agreePurchaserName");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserNameLike(String value) {
            addCriterion("agree_purchaser_name like", value, "agreePurchaserName");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserNameNotLike(String value) {
            addCriterion("agree_purchaser_name not like", value, "agreePurchaserName");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserNameIn(List<String> values) {
            addCriterion("agree_purchaser_name in", values, "agreePurchaserName");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserNameNotIn(List<String> values) {
            addCriterion("agree_purchaser_name not in", values, "agreePurchaserName");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserNameBetween(String value1, String value2) {
            addCriterion("agree_purchaser_name between", value1, value2, "agreePurchaserName");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserNameNotBetween(String value1, String value2) {
            addCriterion("agree_purchaser_name not between", value1, value2, "agreePurchaserName");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserIdIsNull() {
            addCriterion("agree_purchaser_id is null");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserIdIsNotNull() {
            addCriterion("agree_purchaser_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserIdEqualTo(String value) {
            addCriterion("agree_purchaser_id =", value, "agreePurchaserId");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserIdNotEqualTo(String value) {
            addCriterion("agree_purchaser_id <>", value, "agreePurchaserId");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserIdGreaterThan(String value) {
            addCriterion("agree_purchaser_id >", value, "agreePurchaserId");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserIdGreaterThanOrEqualTo(String value) {
            addCriterion("agree_purchaser_id >=", value, "agreePurchaserId");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserIdLessThan(String value) {
            addCriterion("agree_purchaser_id <", value, "agreePurchaserId");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserIdLessThanOrEqualTo(String value) {
            addCriterion("agree_purchaser_id <=", value, "agreePurchaserId");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserIdLike(String value) {
            addCriterion("agree_purchaser_id like", value, "agreePurchaserId");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserIdNotLike(String value) {
            addCriterion("agree_purchaser_id not like", value, "agreePurchaserId");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserIdIn(List<String> values) {
            addCriterion("agree_purchaser_id in", values, "agreePurchaserId");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserIdNotIn(List<String> values) {
            addCriterion("agree_purchaser_id not in", values, "agreePurchaserId");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserIdBetween(String value1, String value2) {
            addCriterion("agree_purchaser_id between", value1, value2, "agreePurchaserId");
            return (Criteria) this;
        }

        public Criteria andAgreePurchaserIdNotBetween(String value1, String value2) {
            addCriterion("agree_purchaser_id not between", value1, value2, "agreePurchaserId");
            return (Criteria) this;
        }

        public Criteria andAppPurchaseNumIsNull() {
            addCriterion("app_purchase_num is null");
            return (Criteria) this;
        }

        public Criteria andAppPurchaseNumIsNotNull() {
            addCriterion("app_purchase_num is not null");
            return (Criteria) this;
        }

        public Criteria andAppPurchaseNumEqualTo(Integer value) {
            addCriterion("app_purchase_num =", value, "appPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andAppPurchaseNumNotEqualTo(Integer value) {
            addCriterion("app_purchase_num <>", value, "appPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andAppPurchaseNumGreaterThan(Integer value) {
            addCriterion("app_purchase_num >", value, "appPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andAppPurchaseNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_purchase_num >=", value, "appPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andAppPurchaseNumLessThan(Integer value) {
            addCriterion("app_purchase_num <", value, "appPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andAppPurchaseNumLessThanOrEqualTo(Integer value) {
            addCriterion("app_purchase_num <=", value, "appPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andAppPurchaseNumIn(List<Integer> values) {
            addCriterion("app_purchase_num in", values, "appPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andAppPurchaseNumNotIn(List<Integer> values) {
            addCriterion("app_purchase_num not in", values, "appPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andAppPurchaseNumBetween(Integer value1, Integer value2) {
            addCriterion("app_purchase_num between", value1, value2, "appPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andAppPurchaseNumNotBetween(Integer value1, Integer value2) {
            addCriterion("app_purchase_num not between", value1, value2, "appPurchaseNum");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNull() {
            addCriterion("apply_date is null");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNotNull() {
            addCriterion("apply_date is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDateEqualTo(String value) {
            addCriterion("apply_date =", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotEqualTo(String value) {
            addCriterion("apply_date <>", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThan(String value) {
            addCriterion("apply_date >", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThanOrEqualTo(String value) {
            addCriterion("apply_date >=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThan(String value) {
            addCriterion("apply_date <", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThanOrEqualTo(String value) {
            addCriterion("apply_date <=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLike(String value) {
            addCriterion("apply_date like", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotLike(String value) {
            addCriterion("apply_date not like", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateIn(List<String> values) {
            addCriterion("apply_date in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotIn(List<String> values) {
            addCriterion("apply_date not in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateBetween(String value1, String value2) {
            addCriterion("apply_date between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotBetween(String value1, String value2) {
            addCriterion("apply_date not between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumIsNull() {
            addCriterion("purchase_num is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumIsNotNull() {
            addCriterion("purchase_num is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumEqualTo(Integer value) {
            addCriterion("purchase_num =", value, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumNotEqualTo(Integer value) {
            addCriterion("purchase_num <>", value, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumGreaterThan(Integer value) {
            addCriterion("purchase_num >", value, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_num >=", value, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumLessThan(Integer value) {
            addCriterion("purchase_num <", value, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_num <=", value, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumIn(List<Integer> values) {
            addCriterion("purchase_num in", values, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumNotIn(List<Integer> values) {
            addCriterion("purchase_num not in", values, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumBetween(Integer value1, Integer value2) {
            addCriterion("purchase_num between", value1, value2, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseNumNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_num not between", value1, value2, "purchaseNum");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountIsNull() {
            addCriterion("estimated_amount is null");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountIsNotNull() {
            addCriterion("estimated_amount is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountEqualTo(BigDecimal value) {
            addCriterion("estimated_amount =", value, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountNotEqualTo(BigDecimal value) {
            addCriterion("estimated_amount <>", value, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountGreaterThan(BigDecimal value) {
            addCriterion("estimated_amount >", value, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("estimated_amount >=", value, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountLessThan(BigDecimal value) {
            addCriterion("estimated_amount <", value, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("estimated_amount <=", value, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountIn(List<BigDecimal> values) {
            addCriterion("estimated_amount in", values, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountNotIn(List<BigDecimal> values) {
            addCriterion("estimated_amount not in", values, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("estimated_amount between", value1, value2, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andEstimatedAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("estimated_amount not between", value1, value2, "estimatedAmount");
            return (Criteria) this;
        }

        public Criteria andUseMoneyIsNull() {
            addCriterion("use_money is null");
            return (Criteria) this;
        }

        public Criteria andUseMoneyIsNotNull() {
            addCriterion("use_money is not null");
            return (Criteria) this;
        }

        public Criteria andUseMoneyEqualTo(BigDecimal value) {
            addCriterion("use_money =", value, "useMoney");
            return (Criteria) this;
        }

        public Criteria andUseMoneyNotEqualTo(BigDecimal value) {
            addCriterion("use_money <>", value, "useMoney");
            return (Criteria) this;
        }

        public Criteria andUseMoneyGreaterThan(BigDecimal value) {
            addCriterion("use_money >", value, "useMoney");
            return (Criteria) this;
        }

        public Criteria andUseMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("use_money >=", value, "useMoney");
            return (Criteria) this;
        }

        public Criteria andUseMoneyLessThan(BigDecimal value) {
            addCriterion("use_money <", value, "useMoney");
            return (Criteria) this;
        }

        public Criteria andUseMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("use_money <=", value, "useMoney");
            return (Criteria) this;
        }

        public Criteria andUseMoneyIn(List<BigDecimal> values) {
            addCriterion("use_money in", values, "useMoney");
            return (Criteria) this;
        }

        public Criteria andUseMoneyNotIn(List<BigDecimal> values) {
            addCriterion("use_money not in", values, "useMoney");
            return (Criteria) this;
        }

        public Criteria andUseMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_money between", value1, value2, "useMoney");
            return (Criteria) this;
        }

        public Criteria andUseMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_money not between", value1, value2, "useMoney");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIsNull() {
            addCriterion("purchase_date is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIsNotNull() {
            addCriterion("purchase_date is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateEqualTo(String value) {
            addCriterion("purchase_date =", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotEqualTo(String value) {
            addCriterion("purchase_date <>", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateGreaterThan(String value) {
            addCriterion("purchase_date >", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_date >=", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateLessThan(String value) {
            addCriterion("purchase_date <", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateLessThanOrEqualTo(String value) {
            addCriterion("purchase_date <=", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateLike(String value) {
            addCriterion("purchase_date like", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotLike(String value) {
            addCriterion("purchase_date not like", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIn(List<String> values) {
            addCriterion("purchase_date in", values, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotIn(List<String> values) {
            addCriterion("purchase_date not in", values, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateBetween(String value1, String value2) {
            addCriterion("purchase_date between", value1, value2, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotBetween(String value1, String value2) {
            addCriterion("purchase_date not between", value1, value2, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andInputerNameIsNull() {
            addCriterion("inputer_name is null");
            return (Criteria) this;
        }

        public Criteria andInputerNameIsNotNull() {
            addCriterion("inputer_name is not null");
            return (Criteria) this;
        }

        public Criteria andInputerNameEqualTo(String value) {
            addCriterion("inputer_name =", value, "inputerName");
            return (Criteria) this;
        }

        public Criteria andInputerNameNotEqualTo(String value) {
            addCriterion("inputer_name <>", value, "inputerName");
            return (Criteria) this;
        }

        public Criteria andInputerNameGreaterThan(String value) {
            addCriterion("inputer_name >", value, "inputerName");
            return (Criteria) this;
        }

        public Criteria andInputerNameGreaterThanOrEqualTo(String value) {
            addCriterion("inputer_name >=", value, "inputerName");
            return (Criteria) this;
        }

        public Criteria andInputerNameLessThan(String value) {
            addCriterion("inputer_name <", value, "inputerName");
            return (Criteria) this;
        }

        public Criteria andInputerNameLessThanOrEqualTo(String value) {
            addCriterion("inputer_name <=", value, "inputerName");
            return (Criteria) this;
        }

        public Criteria andInputerNameLike(String value) {
            addCriterion("inputer_name like", value, "inputerName");
            return (Criteria) this;
        }

        public Criteria andInputerNameNotLike(String value) {
            addCriterion("inputer_name not like", value, "inputerName");
            return (Criteria) this;
        }

        public Criteria andInputerNameIn(List<String> values) {
            addCriterion("inputer_name in", values, "inputerName");
            return (Criteria) this;
        }

        public Criteria andInputerNameNotIn(List<String> values) {
            addCriterion("inputer_name not in", values, "inputerName");
            return (Criteria) this;
        }

        public Criteria andInputerNameBetween(String value1, String value2) {
            addCriterion("inputer_name between", value1, value2, "inputerName");
            return (Criteria) this;
        }

        public Criteria andInputerNameNotBetween(String value1, String value2) {
            addCriterion("inputer_name not between", value1, value2, "inputerName");
            return (Criteria) this;
        }

        public Criteria andInputerIdIsNull() {
            addCriterion("inputer_id is null");
            return (Criteria) this;
        }

        public Criteria andInputerIdIsNotNull() {
            addCriterion("inputer_id is not null");
            return (Criteria) this;
        }

        public Criteria andInputerIdEqualTo(String value) {
            addCriterion("inputer_id =", value, "inputerId");
            return (Criteria) this;
        }

        public Criteria andInputerIdNotEqualTo(String value) {
            addCriterion("inputer_id <>", value, "inputerId");
            return (Criteria) this;
        }

        public Criteria andInputerIdGreaterThan(String value) {
            addCriterion("inputer_id >", value, "inputerId");
            return (Criteria) this;
        }

        public Criteria andInputerIdGreaterThanOrEqualTo(String value) {
            addCriterion("inputer_id >=", value, "inputerId");
            return (Criteria) this;
        }

        public Criteria andInputerIdLessThan(String value) {
            addCriterion("inputer_id <", value, "inputerId");
            return (Criteria) this;
        }

        public Criteria andInputerIdLessThanOrEqualTo(String value) {
            addCriterion("inputer_id <=", value, "inputerId");
            return (Criteria) this;
        }

        public Criteria andInputerIdLike(String value) {
            addCriterion("inputer_id like", value, "inputerId");
            return (Criteria) this;
        }

        public Criteria andInputerIdNotLike(String value) {
            addCriterion("inputer_id not like", value, "inputerId");
            return (Criteria) this;
        }

        public Criteria andInputerIdIn(List<String> values) {
            addCriterion("inputer_id in", values, "inputerId");
            return (Criteria) this;
        }

        public Criteria andInputerIdNotIn(List<String> values) {
            addCriterion("inputer_id not in", values, "inputerId");
            return (Criteria) this;
        }

        public Criteria andInputerIdBetween(String value1, String value2) {
            addCriterion("inputer_id between", value1, value2, "inputerId");
            return (Criteria) this;
        }

        public Criteria andInputerIdNotBetween(String value1, String value2) {
            addCriterion("inputer_id not between", value1, value2, "inputerId");
            return (Criteria) this;
        }

        public Criteria andInputDateIsNull() {
            addCriterion("input_date is null");
            return (Criteria) this;
        }

        public Criteria andInputDateIsNotNull() {
            addCriterion("input_date is not null");
            return (Criteria) this;
        }

        public Criteria andInputDateEqualTo(String value) {
            addCriterion("input_date =", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotEqualTo(String value) {
            addCriterion("input_date <>", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateGreaterThan(String value) {
            addCriterion("input_date >", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateGreaterThanOrEqualTo(String value) {
            addCriterion("input_date >=", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLessThan(String value) {
            addCriterion("input_date <", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLessThanOrEqualTo(String value) {
            addCriterion("input_date <=", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateLike(String value) {
            addCriterion("input_date like", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotLike(String value) {
            addCriterion("input_date not like", value, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateIn(List<String> values) {
            addCriterion("input_date in", values, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotIn(List<String> values) {
            addCriterion("input_date not in", values, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateBetween(String value1, String value2) {
            addCriterion("input_date between", value1, value2, "inputDate");
            return (Criteria) this;
        }

        public Criteria andInputDateNotBetween(String value1, String value2) {
            addCriterion("input_date not between", value1, value2, "inputDate");
            return (Criteria) this;
        }

        public Criteria andNotInputNumIsNull() {
            addCriterion("not_input_num is null");
            return (Criteria) this;
        }

        public Criteria andNotInputNumIsNotNull() {
            addCriterion("not_input_num is not null");
            return (Criteria) this;
        }

        public Criteria andNotInputNumEqualTo(Integer value) {
            addCriterion("not_input_num =", value, "notInputNum");
            return (Criteria) this;
        }

        public Criteria andNotInputNumNotEqualTo(Integer value) {
            addCriterion("not_input_num <>", value, "notInputNum");
            return (Criteria) this;
        }

        public Criteria andNotInputNumGreaterThan(Integer value) {
            addCriterion("not_input_num >", value, "notInputNum");
            return (Criteria) this;
        }

        public Criteria andNotInputNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("not_input_num >=", value, "notInputNum");
            return (Criteria) this;
        }

        public Criteria andNotInputNumLessThan(Integer value) {
            addCriterion("not_input_num <", value, "notInputNum");
            return (Criteria) this;
        }

        public Criteria andNotInputNumLessThanOrEqualTo(Integer value) {
            addCriterion("not_input_num <=", value, "notInputNum");
            return (Criteria) this;
        }

        public Criteria andNotInputNumIn(List<Integer> values) {
            addCriterion("not_input_num in", values, "notInputNum");
            return (Criteria) this;
        }

        public Criteria andNotInputNumNotIn(List<Integer> values) {
            addCriterion("not_input_num not in", values, "notInputNum");
            return (Criteria) this;
        }

        public Criteria andNotInputNumBetween(Integer value1, Integer value2) {
            addCriterion("not_input_num between", value1, value2, "notInputNum");
            return (Criteria) this;
        }

        public Criteria andNotInputNumNotBetween(Integer value1, Integer value2) {
            addCriterion("not_input_num not between", value1, value2, "notInputNum");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusIsNull() {
            addCriterion("purchase_status is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusIsNotNull() {
            addCriterion("purchase_status is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusEqualTo(Integer value) {
            addCriterion("purchase_status =", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusNotEqualTo(Integer value) {
            addCriterion("purchase_status <>", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusGreaterThan(Integer value) {
            addCriterion("purchase_status >", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_status >=", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusLessThan(Integer value) {
            addCriterion("purchase_status <", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_status <=", value, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusIn(List<Integer> values) {
            addCriterion("purchase_status in", values, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusNotIn(List<Integer> values) {
            addCriterion("purchase_status not in", values, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusBetween(Integer value1, Integer value2) {
            addCriterion("purchase_status between", value1, value2, "purchaseStatus");
            return (Criteria) this;
        }

        public Criteria andPurchaseStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_status not between", value1, value2, "purchaseStatus");
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