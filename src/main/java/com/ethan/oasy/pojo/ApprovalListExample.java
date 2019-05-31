package com.ethan.oasy.pojo;

import java.util.ArrayList;
import java.util.List;

public class ApprovalListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApprovalListExample() {
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

        public Criteria andAlIdIsNull() {
            addCriterion("al_id is null");
            return (Criteria) this;
        }

        public Criteria andAlIdIsNotNull() {
            addCriterion("al_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlIdEqualTo(Integer value) {
            addCriterion("al_id =", value, "alId");
            return (Criteria) this;
        }

        public Criteria andAlIdNotEqualTo(Integer value) {
            addCriterion("al_id <>", value, "alId");
            return (Criteria) this;
        }

        public Criteria andAlIdGreaterThan(Integer value) {
            addCriterion("al_id >", value, "alId");
            return (Criteria) this;
        }

        public Criteria andAlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("al_id >=", value, "alId");
            return (Criteria) this;
        }

        public Criteria andAlIdLessThan(Integer value) {
            addCriterion("al_id <", value, "alId");
            return (Criteria) this;
        }

        public Criteria andAlIdLessThanOrEqualTo(Integer value) {
            addCriterion("al_id <=", value, "alId");
            return (Criteria) this;
        }

        public Criteria andAlIdIn(List<Integer> values) {
            addCriterion("al_id in", values, "alId");
            return (Criteria) this;
        }

        public Criteria andAlIdNotIn(List<Integer> values) {
            addCriterion("al_id not in", values, "alId");
            return (Criteria) this;
        }

        public Criteria andAlIdBetween(Integer value1, Integer value2) {
            addCriterion("al_id between", value1, value2, "alId");
            return (Criteria) this;
        }

        public Criteria andAlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("al_id not between", value1, value2, "alId");
            return (Criteria) this;
        }

        public Criteria andAlTitleIsNull() {
            addCriterion("al_title is null");
            return (Criteria) this;
        }

        public Criteria andAlTitleIsNotNull() {
            addCriterion("al_title is not null");
            return (Criteria) this;
        }

        public Criteria andAlTitleEqualTo(String value) {
            addCriterion("al_title =", value, "alTitle");
            return (Criteria) this;
        }

        public Criteria andAlTitleNotEqualTo(String value) {
            addCriterion("al_title <>", value, "alTitle");
            return (Criteria) this;
        }

        public Criteria andAlTitleGreaterThan(String value) {
            addCriterion("al_title >", value, "alTitle");
            return (Criteria) this;
        }

        public Criteria andAlTitleGreaterThanOrEqualTo(String value) {
            addCriterion("al_title >=", value, "alTitle");
            return (Criteria) this;
        }

        public Criteria andAlTitleLessThan(String value) {
            addCriterion("al_title <", value, "alTitle");
            return (Criteria) this;
        }

        public Criteria andAlTitleLessThanOrEqualTo(String value) {
            addCriterion("al_title <=", value, "alTitle");
            return (Criteria) this;
        }

        public Criteria andAlTitleLike(String value) {
            addCriterion("al_title like", value, "alTitle");
            return (Criteria) this;
        }

        public Criteria andAlTitleNotLike(String value) {
            addCriterion("al_title not like", value, "alTitle");
            return (Criteria) this;
        }

        public Criteria andAlTitleIn(List<String> values) {
            addCriterion("al_title in", values, "alTitle");
            return (Criteria) this;
        }

        public Criteria andAlTitleNotIn(List<String> values) {
            addCriterion("al_title not in", values, "alTitle");
            return (Criteria) this;
        }

        public Criteria andAlTitleBetween(String value1, String value2) {
            addCriterion("al_title between", value1, value2, "alTitle");
            return (Criteria) this;
        }

        public Criteria andAlTitleNotBetween(String value1, String value2) {
            addCriterion("al_title not between", value1, value2, "alTitle");
            return (Criteria) this;
        }

        public Criteria andAlImgIsNull() {
            addCriterion("al_img is null");
            return (Criteria) this;
        }

        public Criteria andAlImgIsNotNull() {
            addCriterion("al_img is not null");
            return (Criteria) this;
        }

        public Criteria andAlImgEqualTo(String value) {
            addCriterion("al_img =", value, "alImg");
            return (Criteria) this;
        }

        public Criteria andAlImgNotEqualTo(String value) {
            addCriterion("al_img <>", value, "alImg");
            return (Criteria) this;
        }

        public Criteria andAlImgGreaterThan(String value) {
            addCriterion("al_img >", value, "alImg");
            return (Criteria) this;
        }

        public Criteria andAlImgGreaterThanOrEqualTo(String value) {
            addCriterion("al_img >=", value, "alImg");
            return (Criteria) this;
        }

        public Criteria andAlImgLessThan(String value) {
            addCriterion("al_img <", value, "alImg");
            return (Criteria) this;
        }

        public Criteria andAlImgLessThanOrEqualTo(String value) {
            addCriterion("al_img <=", value, "alImg");
            return (Criteria) this;
        }

        public Criteria andAlImgLike(String value) {
            addCriterion("al_img like", value, "alImg");
            return (Criteria) this;
        }

        public Criteria andAlImgNotLike(String value) {
            addCriterion("al_img not like", value, "alImg");
            return (Criteria) this;
        }

        public Criteria andAlImgIn(List<String> values) {
            addCriterion("al_img in", values, "alImg");
            return (Criteria) this;
        }

        public Criteria andAlImgNotIn(List<String> values) {
            addCriterion("al_img not in", values, "alImg");
            return (Criteria) this;
        }

        public Criteria andAlImgBetween(String value1, String value2) {
            addCriterion("al_img between", value1, value2, "alImg");
            return (Criteria) this;
        }

        public Criteria andAlImgNotBetween(String value1, String value2) {
            addCriterion("al_img not between", value1, value2, "alImg");
            return (Criteria) this;
        }

        public Criteria andAlLinkIsNull() {
            addCriterion("al_link is null");
            return (Criteria) this;
        }

        public Criteria andAlLinkIsNotNull() {
            addCriterion("al_link is not null");
            return (Criteria) this;
        }

        public Criteria andAlLinkEqualTo(String value) {
            addCriterion("al_link =", value, "alLink");
            return (Criteria) this;
        }

        public Criteria andAlLinkNotEqualTo(String value) {
            addCriterion("al_link <>", value, "alLink");
            return (Criteria) this;
        }

        public Criteria andAlLinkGreaterThan(String value) {
            addCriterion("al_link >", value, "alLink");
            return (Criteria) this;
        }

        public Criteria andAlLinkGreaterThanOrEqualTo(String value) {
            addCriterion("al_link >=", value, "alLink");
            return (Criteria) this;
        }

        public Criteria andAlLinkLessThan(String value) {
            addCriterion("al_link <", value, "alLink");
            return (Criteria) this;
        }

        public Criteria andAlLinkLessThanOrEqualTo(String value) {
            addCriterion("al_link <=", value, "alLink");
            return (Criteria) this;
        }

        public Criteria andAlLinkLike(String value) {
            addCriterion("al_link like", value, "alLink");
            return (Criteria) this;
        }

        public Criteria andAlLinkNotLike(String value) {
            addCriterion("al_link not like", value, "alLink");
            return (Criteria) this;
        }

        public Criteria andAlLinkIn(List<String> values) {
            addCriterion("al_link in", values, "alLink");
            return (Criteria) this;
        }

        public Criteria andAlLinkNotIn(List<String> values) {
            addCriterion("al_link not in", values, "alLink");
            return (Criteria) this;
        }

        public Criteria andAlLinkBetween(String value1, String value2) {
            addCriterion("al_link between", value1, value2, "alLink");
            return (Criteria) this;
        }

        public Criteria andAlLinkNotBetween(String value1, String value2) {
            addCriterion("al_link not between", value1, value2, "alLink");
            return (Criteria) this;
        }

        public Criteria andAlTypeIsNull() {
            addCriterion("al_type is null");
            return (Criteria) this;
        }

        public Criteria andAlTypeIsNotNull() {
            addCriterion("al_type is not null");
            return (Criteria) this;
        }

        public Criteria andAlTypeEqualTo(Integer value) {
            addCriterion("al_type =", value, "alType");
            return (Criteria) this;
        }

        public Criteria andAlTypeNotEqualTo(Integer value) {
            addCriterion("al_type <>", value, "alType");
            return (Criteria) this;
        }

        public Criteria andAlTypeGreaterThan(Integer value) {
            addCriterion("al_type >", value, "alType");
            return (Criteria) this;
        }

        public Criteria andAlTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("al_type >=", value, "alType");
            return (Criteria) this;
        }

        public Criteria andAlTypeLessThan(Integer value) {
            addCriterion("al_type <", value, "alType");
            return (Criteria) this;
        }

        public Criteria andAlTypeLessThanOrEqualTo(Integer value) {
            addCriterion("al_type <=", value, "alType");
            return (Criteria) this;
        }

        public Criteria andAlTypeIn(List<Integer> values) {
            addCriterion("al_type in", values, "alType");
            return (Criteria) this;
        }

        public Criteria andAlTypeNotIn(List<Integer> values) {
            addCriterion("al_type not in", values, "alType");
            return (Criteria) this;
        }

        public Criteria andAlTypeBetween(Integer value1, Integer value2) {
            addCriterion("al_type between", value1, value2, "alType");
            return (Criteria) this;
        }

        public Criteria andAlTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("al_type not between", value1, value2, "alType");
            return (Criteria) this;
        }

        public Criteria andAlParentIsNull() {
            addCriterion("al_parent is null");
            return (Criteria) this;
        }

        public Criteria andAlParentIsNotNull() {
            addCriterion("al_parent is not null");
            return (Criteria) this;
        }

        public Criteria andAlParentEqualTo(Integer value) {
            addCriterion("al_parent =", value, "alParent");
            return (Criteria) this;
        }

        public Criteria andAlParentNotEqualTo(Integer value) {
            addCriterion("al_parent <>", value, "alParent");
            return (Criteria) this;
        }

        public Criteria andAlParentGreaterThan(Integer value) {
            addCriterion("al_parent >", value, "alParent");
            return (Criteria) this;
        }

        public Criteria andAlParentGreaterThanOrEqualTo(Integer value) {
            addCriterion("al_parent >=", value, "alParent");
            return (Criteria) this;
        }

        public Criteria andAlParentLessThan(Integer value) {
            addCriterion("al_parent <", value, "alParent");
            return (Criteria) this;
        }

        public Criteria andAlParentLessThanOrEqualTo(Integer value) {
            addCriterion("al_parent <=", value, "alParent");
            return (Criteria) this;
        }

        public Criteria andAlParentIn(List<Integer> values) {
            addCriterion("al_parent in", values, "alParent");
            return (Criteria) this;
        }

        public Criteria andAlParentNotIn(List<Integer> values) {
            addCriterion("al_parent not in", values, "alParent");
            return (Criteria) this;
        }

        public Criteria andAlParentBetween(Integer value1, Integer value2) {
            addCriterion("al_parent between", value1, value2, "alParent");
            return (Criteria) this;
        }

        public Criteria andAlParentNotBetween(Integer value1, Integer value2) {
            addCriterion("al_parent not between", value1, value2, "alParent");
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