package com.ethan.oasy.pojo;

import java.util.ArrayList;
import java.util.List;

public class PositionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PositionExample() {
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

        public Criteria andPosiIdIsNull() {
            addCriterion("posi_id is null");
            return (Criteria) this;
        }

        public Criteria andPosiIdIsNotNull() {
            addCriterion("posi_id is not null");
            return (Criteria) this;
        }

        public Criteria andPosiIdEqualTo(String value) {
            addCriterion("posi_id =", value, "posiId");
            return (Criteria) this;
        }

        public Criteria andPosiIdNotEqualTo(String value) {
            addCriterion("posi_id <>", value, "posiId");
            return (Criteria) this;
        }

        public Criteria andPosiIdGreaterThan(String value) {
            addCriterion("posi_id >", value, "posiId");
            return (Criteria) this;
        }

        public Criteria andPosiIdGreaterThanOrEqualTo(String value) {
            addCriterion("posi_id >=", value, "posiId");
            return (Criteria) this;
        }

        public Criteria andPosiIdLessThan(String value) {
            addCriterion("posi_id <", value, "posiId");
            return (Criteria) this;
        }

        public Criteria andPosiIdLessThanOrEqualTo(String value) {
            addCriterion("posi_id <=", value, "posiId");
            return (Criteria) this;
        }

        public Criteria andPosiIdLike(String value) {
            addCriterion("posi_id like", value, "posiId");
            return (Criteria) this;
        }

        public Criteria andPosiIdNotLike(String value) {
            addCriterion("posi_id not like", value, "posiId");
            return (Criteria) this;
        }

        public Criteria andPosiIdIn(List<String> values) {
            addCriterion("posi_id in", values, "posiId");
            return (Criteria) this;
        }

        public Criteria andPosiIdNotIn(List<String> values) {
            addCriterion("posi_id not in", values, "posiId");
            return (Criteria) this;
        }

        public Criteria andPosiIdBetween(String value1, String value2) {
            addCriterion("posi_id between", value1, value2, "posiId");
            return (Criteria) this;
        }

        public Criteria andPosiIdNotBetween(String value1, String value2) {
            addCriterion("posi_id not between", value1, value2, "posiId");
            return (Criteria) this;
        }

        public Criteria andPosiNameIsNull() {
            addCriterion("posi_name is null");
            return (Criteria) this;
        }

        public Criteria andPosiNameIsNotNull() {
            addCriterion("posi_name is not null");
            return (Criteria) this;
        }

        public Criteria andPosiNameEqualTo(String value) {
            addCriterion("posi_name =", value, "posiName");
            return (Criteria) this;
        }

        public Criteria andPosiNameNotEqualTo(String value) {
            addCriterion("posi_name <>", value, "posiName");
            return (Criteria) this;
        }

        public Criteria andPosiNameGreaterThan(String value) {
            addCriterion("posi_name >", value, "posiName");
            return (Criteria) this;
        }

        public Criteria andPosiNameGreaterThanOrEqualTo(String value) {
            addCriterion("posi_name >=", value, "posiName");
            return (Criteria) this;
        }

        public Criteria andPosiNameLessThan(String value) {
            addCriterion("posi_name <", value, "posiName");
            return (Criteria) this;
        }

        public Criteria andPosiNameLessThanOrEqualTo(String value) {
            addCriterion("posi_name <=", value, "posiName");
            return (Criteria) this;
        }

        public Criteria andPosiNameLike(String value) {
            addCriterion("posi_name like", value, "posiName");
            return (Criteria) this;
        }

        public Criteria andPosiNameNotLike(String value) {
            addCriterion("posi_name not like", value, "posiName");
            return (Criteria) this;
        }

        public Criteria andPosiNameIn(List<String> values) {
            addCriterion("posi_name in", values, "posiName");
            return (Criteria) this;
        }

        public Criteria andPosiNameNotIn(List<String> values) {
            addCriterion("posi_name not in", values, "posiName");
            return (Criteria) this;
        }

        public Criteria andPosiNameBetween(String value1, String value2) {
            addCriterion("posi_name between", value1, value2, "posiName");
            return (Criteria) this;
        }

        public Criteria andPosiNameNotBetween(String value1, String value2) {
            addCriterion("posi_name not between", value1, value2, "posiName");
            return (Criteria) this;
        }

        public Criteria andPosiContentIsNull() {
            addCriterion("posi_content is null");
            return (Criteria) this;
        }

        public Criteria andPosiContentIsNotNull() {
            addCriterion("posi_content is not null");
            return (Criteria) this;
        }

        public Criteria andPosiContentEqualTo(String value) {
            addCriterion("posi_content =", value, "posiContent");
            return (Criteria) this;
        }

        public Criteria andPosiContentNotEqualTo(String value) {
            addCriterion("posi_content <>", value, "posiContent");
            return (Criteria) this;
        }

        public Criteria andPosiContentGreaterThan(String value) {
            addCriterion("posi_content >", value, "posiContent");
            return (Criteria) this;
        }

        public Criteria andPosiContentGreaterThanOrEqualTo(String value) {
            addCriterion("posi_content >=", value, "posiContent");
            return (Criteria) this;
        }

        public Criteria andPosiContentLessThan(String value) {
            addCriterion("posi_content <", value, "posiContent");
            return (Criteria) this;
        }

        public Criteria andPosiContentLessThanOrEqualTo(String value) {
            addCriterion("posi_content <=", value, "posiContent");
            return (Criteria) this;
        }

        public Criteria andPosiContentLike(String value) {
            addCriterion("posi_content like", value, "posiContent");
            return (Criteria) this;
        }

        public Criteria andPosiContentNotLike(String value) {
            addCriterion("posi_content not like", value, "posiContent");
            return (Criteria) this;
        }

        public Criteria andPosiContentIn(List<String> values) {
            addCriterion("posi_content in", values, "posiContent");
            return (Criteria) this;
        }

        public Criteria andPosiContentNotIn(List<String> values) {
            addCriterion("posi_content not in", values, "posiContent");
            return (Criteria) this;
        }

        public Criteria andPosiContentBetween(String value1, String value2) {
            addCriterion("posi_content between", value1, value2, "posiContent");
            return (Criteria) this;
        }

        public Criteria andPosiContentNotBetween(String value1, String value2) {
            addCriterion("posi_content not between", value1, value2, "posiContent");
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

        public Criteria andSubPosiIsNull() {
            addCriterion("sub_posi is null");
            return (Criteria) this;
        }

        public Criteria andSubPosiIsNotNull() {
            addCriterion("sub_posi is not null");
            return (Criteria) this;
        }

        public Criteria andSubPosiEqualTo(String value) {
            addCriterion("sub_posi =", value, "subPosi");
            return (Criteria) this;
        }

        public Criteria andSubPosiNotEqualTo(String value) {
            addCriterion("sub_posi <>", value, "subPosi");
            return (Criteria) this;
        }

        public Criteria andSubPosiGreaterThan(String value) {
            addCriterion("sub_posi >", value, "subPosi");
            return (Criteria) this;
        }

        public Criteria andSubPosiGreaterThanOrEqualTo(String value) {
            addCriterion("sub_posi >=", value, "subPosi");
            return (Criteria) this;
        }

        public Criteria andSubPosiLessThan(String value) {
            addCriterion("sub_posi <", value, "subPosi");
            return (Criteria) this;
        }

        public Criteria andSubPosiLessThanOrEqualTo(String value) {
            addCriterion("sub_posi <=", value, "subPosi");
            return (Criteria) this;
        }

        public Criteria andSubPosiLike(String value) {
            addCriterion("sub_posi like", value, "subPosi");
            return (Criteria) this;
        }

        public Criteria andSubPosiNotLike(String value) {
            addCriterion("sub_posi not like", value, "subPosi");
            return (Criteria) this;
        }

        public Criteria andSubPosiIn(List<String> values) {
            addCriterion("sub_posi in", values, "subPosi");
            return (Criteria) this;
        }

        public Criteria andSubPosiNotIn(List<String> values) {
            addCriterion("sub_posi not in", values, "subPosi");
            return (Criteria) this;
        }

        public Criteria andSubPosiBetween(String value1, String value2) {
            addCriterion("sub_posi between", value1, value2, "subPosi");
            return (Criteria) this;
        }

        public Criteria andSubPosiNotBetween(String value1, String value2) {
            addCriterion("sub_posi not between", value1, value2, "subPosi");
            return (Criteria) this;
        }

        public Criteria andParentPosiIsNull() {
            addCriterion("parent_posi is null");
            return (Criteria) this;
        }

        public Criteria andParentPosiIsNotNull() {
            addCriterion("parent_posi is not null");
            return (Criteria) this;
        }

        public Criteria andParentPosiEqualTo(String value) {
            addCriterion("parent_posi =", value, "parentPosi");
            return (Criteria) this;
        }

        public Criteria andParentPosiNotEqualTo(String value) {
            addCriterion("parent_posi <>", value, "parentPosi");
            return (Criteria) this;
        }

        public Criteria andParentPosiGreaterThan(String value) {
            addCriterion("parent_posi >", value, "parentPosi");
            return (Criteria) this;
        }

        public Criteria andParentPosiGreaterThanOrEqualTo(String value) {
            addCriterion("parent_posi >=", value, "parentPosi");
            return (Criteria) this;
        }

        public Criteria andParentPosiLessThan(String value) {
            addCriterion("parent_posi <", value, "parentPosi");
            return (Criteria) this;
        }

        public Criteria andParentPosiLessThanOrEqualTo(String value) {
            addCriterion("parent_posi <=", value, "parentPosi");
            return (Criteria) this;
        }

        public Criteria andParentPosiLike(String value) {
            addCriterion("parent_posi like", value, "parentPosi");
            return (Criteria) this;
        }

        public Criteria andParentPosiNotLike(String value) {
            addCriterion("parent_posi not like", value, "parentPosi");
            return (Criteria) this;
        }

        public Criteria andParentPosiIn(List<String> values) {
            addCriterion("parent_posi in", values, "parentPosi");
            return (Criteria) this;
        }

        public Criteria andParentPosiNotIn(List<String> values) {
            addCriterion("parent_posi not in", values, "parentPosi");
            return (Criteria) this;
        }

        public Criteria andParentPosiBetween(String value1, String value2) {
            addCriterion("parent_posi between", value1, value2, "parentPosi");
            return (Criteria) this;
        }

        public Criteria andParentPosiNotBetween(String value1, String value2) {
            addCriterion("parent_posi not between", value1, value2, "parentPosi");
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