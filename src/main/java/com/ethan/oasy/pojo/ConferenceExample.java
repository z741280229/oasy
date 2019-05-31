package com.ethan.oasy.pojo;

import java.util.ArrayList;
import java.util.List;

public class ConferenceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConferenceExample() {
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

        public Criteria andConIdIsNull() {
            addCriterion("con_id is null");
            return (Criteria) this;
        }

        public Criteria andConIdIsNotNull() {
            addCriterion("con_id is not null");
            return (Criteria) this;
        }

        public Criteria andConIdEqualTo(String value) {
            addCriterion("con_id =", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdNotEqualTo(String value) {
            addCriterion("con_id <>", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdGreaterThan(String value) {
            addCriterion("con_id >", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdGreaterThanOrEqualTo(String value) {
            addCriterion("con_id >=", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdLessThan(String value) {
            addCriterion("con_id <", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdLessThanOrEqualTo(String value) {
            addCriterion("con_id <=", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdLike(String value) {
            addCriterion("con_id like", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdNotLike(String value) {
            addCriterion("con_id not like", value, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdIn(List<String> values) {
            addCriterion("con_id in", values, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdNotIn(List<String> values) {
            addCriterion("con_id not in", values, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdBetween(String value1, String value2) {
            addCriterion("con_id between", value1, value2, "conId");
            return (Criteria) this;
        }

        public Criteria andConIdNotBetween(String value1, String value2) {
            addCriterion("con_id not between", value1, value2, "conId");
            return (Criteria) this;
        }

        public Criteria andConThemeIsNull() {
            addCriterion("con_theme is null");
            return (Criteria) this;
        }

        public Criteria andConThemeIsNotNull() {
            addCriterion("con_theme is not null");
            return (Criteria) this;
        }

        public Criteria andConThemeEqualTo(String value) {
            addCriterion("con_theme =", value, "conTheme");
            return (Criteria) this;
        }

        public Criteria andConThemeNotEqualTo(String value) {
            addCriterion("con_theme <>", value, "conTheme");
            return (Criteria) this;
        }

        public Criteria andConThemeGreaterThan(String value) {
            addCriterion("con_theme >", value, "conTheme");
            return (Criteria) this;
        }

        public Criteria andConThemeGreaterThanOrEqualTo(String value) {
            addCriterion("con_theme >=", value, "conTheme");
            return (Criteria) this;
        }

        public Criteria andConThemeLessThan(String value) {
            addCriterion("con_theme <", value, "conTheme");
            return (Criteria) this;
        }

        public Criteria andConThemeLessThanOrEqualTo(String value) {
            addCriterion("con_theme <=", value, "conTheme");
            return (Criteria) this;
        }

        public Criteria andConThemeLike(String value) {
            addCriterion("con_theme like", value, "conTheme");
            return (Criteria) this;
        }

        public Criteria andConThemeNotLike(String value) {
            addCriterion("con_theme not like", value, "conTheme");
            return (Criteria) this;
        }

        public Criteria andConThemeIn(List<String> values) {
            addCriterion("con_theme in", values, "conTheme");
            return (Criteria) this;
        }

        public Criteria andConThemeNotIn(List<String> values) {
            addCriterion("con_theme not in", values, "conTheme");
            return (Criteria) this;
        }

        public Criteria andConThemeBetween(String value1, String value2) {
            addCriterion("con_theme between", value1, value2, "conTheme");
            return (Criteria) this;
        }

        public Criteria andConThemeNotBetween(String value1, String value2) {
            addCriterion("con_theme not between", value1, value2, "conTheme");
            return (Criteria) this;
        }

        public Criteria andConTypeIsNull() {
            addCriterion("con_type is null");
            return (Criteria) this;
        }

        public Criteria andConTypeIsNotNull() {
            addCriterion("con_type is not null");
            return (Criteria) this;
        }

        public Criteria andConTypeEqualTo(Integer value) {
            addCriterion("con_type =", value, "conType");
            return (Criteria) this;
        }

        public Criteria andConTypeNotEqualTo(Integer value) {
            addCriterion("con_type <>", value, "conType");
            return (Criteria) this;
        }

        public Criteria andConTypeGreaterThan(Integer value) {
            addCriterion("con_type >", value, "conType");
            return (Criteria) this;
        }

        public Criteria andConTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("con_type >=", value, "conType");
            return (Criteria) this;
        }

        public Criteria andConTypeLessThan(Integer value) {
            addCriterion("con_type <", value, "conType");
            return (Criteria) this;
        }

        public Criteria andConTypeLessThanOrEqualTo(Integer value) {
            addCriterion("con_type <=", value, "conType");
            return (Criteria) this;
        }

        public Criteria andConTypeIn(List<Integer> values) {
            addCriterion("con_type in", values, "conType");
            return (Criteria) this;
        }

        public Criteria andConTypeNotIn(List<Integer> values) {
            addCriterion("con_type not in", values, "conType");
            return (Criteria) this;
        }

        public Criteria andConTypeBetween(Integer value1, Integer value2) {
            addCriterion("con_type between", value1, value2, "conType");
            return (Criteria) this;
        }

        public Criteria andConTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("con_type not between", value1, value2, "conType");
            return (Criteria) this;
        }

        public Criteria andConCompereNameIsNull() {
            addCriterion("con_compere_name is null");
            return (Criteria) this;
        }

        public Criteria andConCompereNameIsNotNull() {
            addCriterion("con_compere_name is not null");
            return (Criteria) this;
        }

        public Criteria andConCompereNameEqualTo(String value) {
            addCriterion("con_compere_name =", value, "conCompereName");
            return (Criteria) this;
        }

        public Criteria andConCompereNameNotEqualTo(String value) {
            addCriterion("con_compere_name <>", value, "conCompereName");
            return (Criteria) this;
        }

        public Criteria andConCompereNameGreaterThan(String value) {
            addCriterion("con_compere_name >", value, "conCompereName");
            return (Criteria) this;
        }

        public Criteria andConCompereNameGreaterThanOrEqualTo(String value) {
            addCriterion("con_compere_name >=", value, "conCompereName");
            return (Criteria) this;
        }

        public Criteria andConCompereNameLessThan(String value) {
            addCriterion("con_compere_name <", value, "conCompereName");
            return (Criteria) this;
        }

        public Criteria andConCompereNameLessThanOrEqualTo(String value) {
            addCriterion("con_compere_name <=", value, "conCompereName");
            return (Criteria) this;
        }

        public Criteria andConCompereNameLike(String value) {
            addCriterion("con_compere_name like", value, "conCompereName");
            return (Criteria) this;
        }

        public Criteria andConCompereNameNotLike(String value) {
            addCriterion("con_compere_name not like", value, "conCompereName");
            return (Criteria) this;
        }

        public Criteria andConCompereNameIn(List<String> values) {
            addCriterion("con_compere_name in", values, "conCompereName");
            return (Criteria) this;
        }

        public Criteria andConCompereNameNotIn(List<String> values) {
            addCriterion("con_compere_name not in", values, "conCompereName");
            return (Criteria) this;
        }

        public Criteria andConCompereNameBetween(String value1, String value2) {
            addCriterion("con_compere_name between", value1, value2, "conCompereName");
            return (Criteria) this;
        }

        public Criteria andConCompereNameNotBetween(String value1, String value2) {
            addCriterion("con_compere_name not between", value1, value2, "conCompereName");
            return (Criteria) this;
        }

        public Criteria andConCompereIsNull() {
            addCriterion("con_compere is null");
            return (Criteria) this;
        }

        public Criteria andConCompereIsNotNull() {
            addCriterion("con_compere is not null");
            return (Criteria) this;
        }

        public Criteria andConCompereEqualTo(String value) {
            addCriterion("con_compere =", value, "conCompere");
            return (Criteria) this;
        }

        public Criteria andConCompereNotEqualTo(String value) {
            addCriterion("con_compere <>", value, "conCompere");
            return (Criteria) this;
        }

        public Criteria andConCompereGreaterThan(String value) {
            addCriterion("con_compere >", value, "conCompere");
            return (Criteria) this;
        }

        public Criteria andConCompereGreaterThanOrEqualTo(String value) {
            addCriterion("con_compere >=", value, "conCompere");
            return (Criteria) this;
        }

        public Criteria andConCompereLessThan(String value) {
            addCriterion("con_compere <", value, "conCompere");
            return (Criteria) this;
        }

        public Criteria andConCompereLessThanOrEqualTo(String value) {
            addCriterion("con_compere <=", value, "conCompere");
            return (Criteria) this;
        }

        public Criteria andConCompereLike(String value) {
            addCriterion("con_compere like", value, "conCompere");
            return (Criteria) this;
        }

        public Criteria andConCompereNotLike(String value) {
            addCriterion("con_compere not like", value, "conCompere");
            return (Criteria) this;
        }

        public Criteria andConCompereIn(List<String> values) {
            addCriterion("con_compere in", values, "conCompere");
            return (Criteria) this;
        }

        public Criteria andConCompereNotIn(List<String> values) {
            addCriterion("con_compere not in", values, "conCompere");
            return (Criteria) this;
        }

        public Criteria andConCompereBetween(String value1, String value2) {
            addCriterion("con_compere between", value1, value2, "conCompere");
            return (Criteria) this;
        }

        public Criteria andConCompereNotBetween(String value1, String value2) {
            addCriterion("con_compere not between", value1, value2, "conCompere");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartNameIsNull() {
            addCriterion("con_sponsor_dapart_name is null");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartNameIsNotNull() {
            addCriterion("con_sponsor_dapart_name is not null");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartNameEqualTo(String value) {
            addCriterion("con_sponsor_dapart_name =", value, "conSponsorDapartName");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartNameNotEqualTo(String value) {
            addCriterion("con_sponsor_dapart_name <>", value, "conSponsorDapartName");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartNameGreaterThan(String value) {
            addCriterion("con_sponsor_dapart_name >", value, "conSponsorDapartName");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartNameGreaterThanOrEqualTo(String value) {
            addCriterion("con_sponsor_dapart_name >=", value, "conSponsorDapartName");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartNameLessThan(String value) {
            addCriterion("con_sponsor_dapart_name <", value, "conSponsorDapartName");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartNameLessThanOrEqualTo(String value) {
            addCriterion("con_sponsor_dapart_name <=", value, "conSponsorDapartName");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartNameLike(String value) {
            addCriterion("con_sponsor_dapart_name like", value, "conSponsorDapartName");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartNameNotLike(String value) {
            addCriterion("con_sponsor_dapart_name not like", value, "conSponsorDapartName");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartNameIn(List<String> values) {
            addCriterion("con_sponsor_dapart_name in", values, "conSponsorDapartName");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartNameNotIn(List<String> values) {
            addCriterion("con_sponsor_dapart_name not in", values, "conSponsorDapartName");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartNameBetween(String value1, String value2) {
            addCriterion("con_sponsor_dapart_name between", value1, value2, "conSponsorDapartName");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartNameNotBetween(String value1, String value2) {
            addCriterion("con_sponsor_dapart_name not between", value1, value2, "conSponsorDapartName");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartIsNull() {
            addCriterion("con_sponsor_dapart is null");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartIsNotNull() {
            addCriterion("con_sponsor_dapart is not null");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartEqualTo(String value) {
            addCriterion("con_sponsor_dapart =", value, "conSponsorDapart");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartNotEqualTo(String value) {
            addCriterion("con_sponsor_dapart <>", value, "conSponsorDapart");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartGreaterThan(String value) {
            addCriterion("con_sponsor_dapart >", value, "conSponsorDapart");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartGreaterThanOrEqualTo(String value) {
            addCriterion("con_sponsor_dapart >=", value, "conSponsorDapart");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartLessThan(String value) {
            addCriterion("con_sponsor_dapart <", value, "conSponsorDapart");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartLessThanOrEqualTo(String value) {
            addCriterion("con_sponsor_dapart <=", value, "conSponsorDapart");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartLike(String value) {
            addCriterion("con_sponsor_dapart like", value, "conSponsorDapart");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartNotLike(String value) {
            addCriterion("con_sponsor_dapart not like", value, "conSponsorDapart");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartIn(List<String> values) {
            addCriterion("con_sponsor_dapart in", values, "conSponsorDapart");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartNotIn(List<String> values) {
            addCriterion("con_sponsor_dapart not in", values, "conSponsorDapart");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartBetween(String value1, String value2) {
            addCriterion("con_sponsor_dapart between", value1, value2, "conSponsorDapart");
            return (Criteria) this;
        }

        public Criteria andConSponsorDapartNotBetween(String value1, String value2) {
            addCriterion("con_sponsor_dapart not between", value1, value2, "conSponsorDapart");
            return (Criteria) this;
        }

        public Criteria andConLinkmanIsNull() {
            addCriterion("con_linkman is null");
            return (Criteria) this;
        }

        public Criteria andConLinkmanIsNotNull() {
            addCriterion("con_linkman is not null");
            return (Criteria) this;
        }

        public Criteria andConLinkmanEqualTo(String value) {
            addCriterion("con_linkman =", value, "conLinkman");
            return (Criteria) this;
        }

        public Criteria andConLinkmanNotEqualTo(String value) {
            addCriterion("con_linkman <>", value, "conLinkman");
            return (Criteria) this;
        }

        public Criteria andConLinkmanGreaterThan(String value) {
            addCriterion("con_linkman >", value, "conLinkman");
            return (Criteria) this;
        }

        public Criteria andConLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("con_linkman >=", value, "conLinkman");
            return (Criteria) this;
        }

        public Criteria andConLinkmanLessThan(String value) {
            addCriterion("con_linkman <", value, "conLinkman");
            return (Criteria) this;
        }

        public Criteria andConLinkmanLessThanOrEqualTo(String value) {
            addCriterion("con_linkman <=", value, "conLinkman");
            return (Criteria) this;
        }

        public Criteria andConLinkmanLike(String value) {
            addCriterion("con_linkman like", value, "conLinkman");
            return (Criteria) this;
        }

        public Criteria andConLinkmanNotLike(String value) {
            addCriterion("con_linkman not like", value, "conLinkman");
            return (Criteria) this;
        }

        public Criteria andConLinkmanIn(List<String> values) {
            addCriterion("con_linkman in", values, "conLinkman");
            return (Criteria) this;
        }

        public Criteria andConLinkmanNotIn(List<String> values) {
            addCriterion("con_linkman not in", values, "conLinkman");
            return (Criteria) this;
        }

        public Criteria andConLinkmanBetween(String value1, String value2) {
            addCriterion("con_linkman between", value1, value2, "conLinkman");
            return (Criteria) this;
        }

        public Criteria andConLinkmanNotBetween(String value1, String value2) {
            addCriterion("con_linkman not between", value1, value2, "conLinkman");
            return (Criteria) this;
        }

        public Criteria andConLinkmanNameIsNull() {
            addCriterion("con_linkman_name is null");
            return (Criteria) this;
        }

        public Criteria andConLinkmanNameIsNotNull() {
            addCriterion("con_linkman_name is not null");
            return (Criteria) this;
        }

        public Criteria andConLinkmanNameEqualTo(String value) {
            addCriterion("con_linkman_name =", value, "conLinkmanName");
            return (Criteria) this;
        }

        public Criteria andConLinkmanNameNotEqualTo(String value) {
            addCriterion("con_linkman_name <>", value, "conLinkmanName");
            return (Criteria) this;
        }

        public Criteria andConLinkmanNameGreaterThan(String value) {
            addCriterion("con_linkman_name >", value, "conLinkmanName");
            return (Criteria) this;
        }

        public Criteria andConLinkmanNameGreaterThanOrEqualTo(String value) {
            addCriterion("con_linkman_name >=", value, "conLinkmanName");
            return (Criteria) this;
        }

        public Criteria andConLinkmanNameLessThan(String value) {
            addCriterion("con_linkman_name <", value, "conLinkmanName");
            return (Criteria) this;
        }

        public Criteria andConLinkmanNameLessThanOrEqualTo(String value) {
            addCriterion("con_linkman_name <=", value, "conLinkmanName");
            return (Criteria) this;
        }

        public Criteria andConLinkmanNameLike(String value) {
            addCriterion("con_linkman_name like", value, "conLinkmanName");
            return (Criteria) this;
        }

        public Criteria andConLinkmanNameNotLike(String value) {
            addCriterion("con_linkman_name not like", value, "conLinkmanName");
            return (Criteria) this;
        }

        public Criteria andConLinkmanNameIn(List<String> values) {
            addCriterion("con_linkman_name in", values, "conLinkmanName");
            return (Criteria) this;
        }

        public Criteria andConLinkmanNameNotIn(List<String> values) {
            addCriterion("con_linkman_name not in", values, "conLinkmanName");
            return (Criteria) this;
        }

        public Criteria andConLinkmanNameBetween(String value1, String value2) {
            addCriterion("con_linkman_name between", value1, value2, "conLinkmanName");
            return (Criteria) this;
        }

        public Criteria andConLinkmanNameNotBetween(String value1, String value2) {
            addCriterion("con_linkman_name not between", value1, value2, "conLinkmanName");
            return (Criteria) this;
        }

        public Criteria andConLinkmanTelIsNull() {
            addCriterion("con_linkman_tel is null");
            return (Criteria) this;
        }

        public Criteria andConLinkmanTelIsNotNull() {
            addCriterion("con_linkman_tel is not null");
            return (Criteria) this;
        }

        public Criteria andConLinkmanTelEqualTo(String value) {
            addCriterion("con_linkman_tel =", value, "conLinkmanTel");
            return (Criteria) this;
        }

        public Criteria andConLinkmanTelNotEqualTo(String value) {
            addCriterion("con_linkman_tel <>", value, "conLinkmanTel");
            return (Criteria) this;
        }

        public Criteria andConLinkmanTelGreaterThan(String value) {
            addCriterion("con_linkman_tel >", value, "conLinkmanTel");
            return (Criteria) this;
        }

        public Criteria andConLinkmanTelGreaterThanOrEqualTo(String value) {
            addCriterion("con_linkman_tel >=", value, "conLinkmanTel");
            return (Criteria) this;
        }

        public Criteria andConLinkmanTelLessThan(String value) {
            addCriterion("con_linkman_tel <", value, "conLinkmanTel");
            return (Criteria) this;
        }

        public Criteria andConLinkmanTelLessThanOrEqualTo(String value) {
            addCriterion("con_linkman_tel <=", value, "conLinkmanTel");
            return (Criteria) this;
        }

        public Criteria andConLinkmanTelLike(String value) {
            addCriterion("con_linkman_tel like", value, "conLinkmanTel");
            return (Criteria) this;
        }

        public Criteria andConLinkmanTelNotLike(String value) {
            addCriterion("con_linkman_tel not like", value, "conLinkmanTel");
            return (Criteria) this;
        }

        public Criteria andConLinkmanTelIn(List<String> values) {
            addCriterion("con_linkman_tel in", values, "conLinkmanTel");
            return (Criteria) this;
        }

        public Criteria andConLinkmanTelNotIn(List<String> values) {
            addCriterion("con_linkman_tel not in", values, "conLinkmanTel");
            return (Criteria) this;
        }

        public Criteria andConLinkmanTelBetween(String value1, String value2) {
            addCriterion("con_linkman_tel between", value1, value2, "conLinkmanTel");
            return (Criteria) this;
        }

        public Criteria andConLinkmanTelNotBetween(String value1, String value2) {
            addCriterion("con_linkman_tel not between", value1, value2, "conLinkmanTel");
            return (Criteria) this;
        }

        public Criteria andConPlaceIdIsNull() {
            addCriterion("con_place_id is null");
            return (Criteria) this;
        }

        public Criteria andConPlaceIdIsNotNull() {
            addCriterion("con_place_id is not null");
            return (Criteria) this;
        }

        public Criteria andConPlaceIdEqualTo(Integer value) {
            addCriterion("con_place_id =", value, "conPlaceId");
            return (Criteria) this;
        }

        public Criteria andConPlaceIdNotEqualTo(Integer value) {
            addCriterion("con_place_id <>", value, "conPlaceId");
            return (Criteria) this;
        }

        public Criteria andConPlaceIdGreaterThan(Integer value) {
            addCriterion("con_place_id >", value, "conPlaceId");
            return (Criteria) this;
        }

        public Criteria andConPlaceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("con_place_id >=", value, "conPlaceId");
            return (Criteria) this;
        }

        public Criteria andConPlaceIdLessThan(Integer value) {
            addCriterion("con_place_id <", value, "conPlaceId");
            return (Criteria) this;
        }

        public Criteria andConPlaceIdLessThanOrEqualTo(Integer value) {
            addCriterion("con_place_id <=", value, "conPlaceId");
            return (Criteria) this;
        }

        public Criteria andConPlaceIdIn(List<Integer> values) {
            addCriterion("con_place_id in", values, "conPlaceId");
            return (Criteria) this;
        }

        public Criteria andConPlaceIdNotIn(List<Integer> values) {
            addCriterion("con_place_id not in", values, "conPlaceId");
            return (Criteria) this;
        }

        public Criteria andConPlaceIdBetween(Integer value1, Integer value2) {
            addCriterion("con_place_id between", value1, value2, "conPlaceId");
            return (Criteria) this;
        }

        public Criteria andConPlaceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("con_place_id not between", value1, value2, "conPlaceId");
            return (Criteria) this;
        }

        public Criteria andConPlaceNameIsNull() {
            addCriterion("con_place_name is null");
            return (Criteria) this;
        }

        public Criteria andConPlaceNameIsNotNull() {
            addCriterion("con_place_name is not null");
            return (Criteria) this;
        }

        public Criteria andConPlaceNameEqualTo(String value) {
            addCriterion("con_place_name =", value, "conPlaceName");
            return (Criteria) this;
        }

        public Criteria andConPlaceNameNotEqualTo(String value) {
            addCriterion("con_place_name <>", value, "conPlaceName");
            return (Criteria) this;
        }

        public Criteria andConPlaceNameGreaterThan(String value) {
            addCriterion("con_place_name >", value, "conPlaceName");
            return (Criteria) this;
        }

        public Criteria andConPlaceNameGreaterThanOrEqualTo(String value) {
            addCriterion("con_place_name >=", value, "conPlaceName");
            return (Criteria) this;
        }

        public Criteria andConPlaceNameLessThan(String value) {
            addCriterion("con_place_name <", value, "conPlaceName");
            return (Criteria) this;
        }

        public Criteria andConPlaceNameLessThanOrEqualTo(String value) {
            addCriterion("con_place_name <=", value, "conPlaceName");
            return (Criteria) this;
        }

        public Criteria andConPlaceNameLike(String value) {
            addCriterion("con_place_name like", value, "conPlaceName");
            return (Criteria) this;
        }

        public Criteria andConPlaceNameNotLike(String value) {
            addCriterion("con_place_name not like", value, "conPlaceName");
            return (Criteria) this;
        }

        public Criteria andConPlaceNameIn(List<String> values) {
            addCriterion("con_place_name in", values, "conPlaceName");
            return (Criteria) this;
        }

        public Criteria andConPlaceNameNotIn(List<String> values) {
            addCriterion("con_place_name not in", values, "conPlaceName");
            return (Criteria) this;
        }

        public Criteria andConPlaceNameBetween(String value1, String value2) {
            addCriterion("con_place_name between", value1, value2, "conPlaceName");
            return (Criteria) this;
        }

        public Criteria andConPlaceNameNotBetween(String value1, String value2) {
            addCriterion("con_place_name not between", value1, value2, "conPlaceName");
            return (Criteria) this;
        }

        public Criteria andConModelIsNull() {
            addCriterion("con_model is null");
            return (Criteria) this;
        }

        public Criteria andConModelIsNotNull() {
            addCriterion("con_model is not null");
            return (Criteria) this;
        }

        public Criteria andConModelEqualTo(Integer value) {
            addCriterion("con_model =", value, "conModel");
            return (Criteria) this;
        }

        public Criteria andConModelNotEqualTo(Integer value) {
            addCriterion("con_model <>", value, "conModel");
            return (Criteria) this;
        }

        public Criteria andConModelGreaterThan(Integer value) {
            addCriterion("con_model >", value, "conModel");
            return (Criteria) this;
        }

        public Criteria andConModelGreaterThanOrEqualTo(Integer value) {
            addCriterion("con_model >=", value, "conModel");
            return (Criteria) this;
        }

        public Criteria andConModelLessThan(Integer value) {
            addCriterion("con_model <", value, "conModel");
            return (Criteria) this;
        }

        public Criteria andConModelLessThanOrEqualTo(Integer value) {
            addCriterion("con_model <=", value, "conModel");
            return (Criteria) this;
        }

        public Criteria andConModelIn(List<Integer> values) {
            addCriterion("con_model in", values, "conModel");
            return (Criteria) this;
        }

        public Criteria andConModelNotIn(List<Integer> values) {
            addCriterion("con_model not in", values, "conModel");
            return (Criteria) this;
        }

        public Criteria andConModelBetween(Integer value1, Integer value2) {
            addCriterion("con_model between", value1, value2, "conModel");
            return (Criteria) this;
        }

        public Criteria andConModelNotBetween(Integer value1, Integer value2) {
            addCriterion("con_model not between", value1, value2, "conModel");
            return (Criteria) this;
        }

        public Criteria andConRecorderIsNull() {
            addCriterion("con_recorder is null");
            return (Criteria) this;
        }

        public Criteria andConRecorderIsNotNull() {
            addCriterion("con_recorder is not null");
            return (Criteria) this;
        }

        public Criteria andConRecorderEqualTo(String value) {
            addCriterion("con_recorder =", value, "conRecorder");
            return (Criteria) this;
        }

        public Criteria andConRecorderNotEqualTo(String value) {
            addCriterion("con_recorder <>", value, "conRecorder");
            return (Criteria) this;
        }

        public Criteria andConRecorderGreaterThan(String value) {
            addCriterion("con_recorder >", value, "conRecorder");
            return (Criteria) this;
        }

        public Criteria andConRecorderGreaterThanOrEqualTo(String value) {
            addCriterion("con_recorder >=", value, "conRecorder");
            return (Criteria) this;
        }

        public Criteria andConRecorderLessThan(String value) {
            addCriterion("con_recorder <", value, "conRecorder");
            return (Criteria) this;
        }

        public Criteria andConRecorderLessThanOrEqualTo(String value) {
            addCriterion("con_recorder <=", value, "conRecorder");
            return (Criteria) this;
        }

        public Criteria andConRecorderLike(String value) {
            addCriterion("con_recorder like", value, "conRecorder");
            return (Criteria) this;
        }

        public Criteria andConRecorderNotLike(String value) {
            addCriterion("con_recorder not like", value, "conRecorder");
            return (Criteria) this;
        }

        public Criteria andConRecorderIn(List<String> values) {
            addCriterion("con_recorder in", values, "conRecorder");
            return (Criteria) this;
        }

        public Criteria andConRecorderNotIn(List<String> values) {
            addCriterion("con_recorder not in", values, "conRecorder");
            return (Criteria) this;
        }

        public Criteria andConRecorderBetween(String value1, String value2) {
            addCriterion("con_recorder between", value1, value2, "conRecorder");
            return (Criteria) this;
        }

        public Criteria andConRecorderNotBetween(String value1, String value2) {
            addCriterion("con_recorder not between", value1, value2, "conRecorder");
            return (Criteria) this;
        }

        public Criteria andConRecorderNameIsNull() {
            addCriterion("con_recorder_name is null");
            return (Criteria) this;
        }

        public Criteria andConRecorderNameIsNotNull() {
            addCriterion("con_recorder_name is not null");
            return (Criteria) this;
        }

        public Criteria andConRecorderNameEqualTo(String value) {
            addCriterion("con_recorder_name =", value, "conRecorderName");
            return (Criteria) this;
        }

        public Criteria andConRecorderNameNotEqualTo(String value) {
            addCriterion("con_recorder_name <>", value, "conRecorderName");
            return (Criteria) this;
        }

        public Criteria andConRecorderNameGreaterThan(String value) {
            addCriterion("con_recorder_name >", value, "conRecorderName");
            return (Criteria) this;
        }

        public Criteria andConRecorderNameGreaterThanOrEqualTo(String value) {
            addCriterion("con_recorder_name >=", value, "conRecorderName");
            return (Criteria) this;
        }

        public Criteria andConRecorderNameLessThan(String value) {
            addCriterion("con_recorder_name <", value, "conRecorderName");
            return (Criteria) this;
        }

        public Criteria andConRecorderNameLessThanOrEqualTo(String value) {
            addCriterion("con_recorder_name <=", value, "conRecorderName");
            return (Criteria) this;
        }

        public Criteria andConRecorderNameLike(String value) {
            addCriterion("con_recorder_name like", value, "conRecorderName");
            return (Criteria) this;
        }

        public Criteria andConRecorderNameNotLike(String value) {
            addCriterion("con_recorder_name not like", value, "conRecorderName");
            return (Criteria) this;
        }

        public Criteria andConRecorderNameIn(List<String> values) {
            addCriterion("con_recorder_name in", values, "conRecorderName");
            return (Criteria) this;
        }

        public Criteria andConRecorderNameNotIn(List<String> values) {
            addCriterion("con_recorder_name not in", values, "conRecorderName");
            return (Criteria) this;
        }

        public Criteria andConRecorderNameBetween(String value1, String value2) {
            addCriterion("con_recorder_name between", value1, value2, "conRecorderName");
            return (Criteria) this;
        }

        public Criteria andConRecorderNameNotBetween(String value1, String value2) {
            addCriterion("con_recorder_name not between", value1, value2, "conRecorderName");
            return (Criteria) this;
        }

        public Criteria andConEndDateIsNull() {
            addCriterion("con_end_date is null");
            return (Criteria) this;
        }

        public Criteria andConEndDateIsNotNull() {
            addCriterion("con_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andConEndDateEqualTo(String value) {
            addCriterion("con_end_date =", value, "conEndDate");
            return (Criteria) this;
        }

        public Criteria andConEndDateNotEqualTo(String value) {
            addCriterion("con_end_date <>", value, "conEndDate");
            return (Criteria) this;
        }

        public Criteria andConEndDateGreaterThan(String value) {
            addCriterion("con_end_date >", value, "conEndDate");
            return (Criteria) this;
        }

        public Criteria andConEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("con_end_date >=", value, "conEndDate");
            return (Criteria) this;
        }

        public Criteria andConEndDateLessThan(String value) {
            addCriterion("con_end_date <", value, "conEndDate");
            return (Criteria) this;
        }

        public Criteria andConEndDateLessThanOrEqualTo(String value) {
            addCriterion("con_end_date <=", value, "conEndDate");
            return (Criteria) this;
        }

        public Criteria andConEndDateLike(String value) {
            addCriterion("con_end_date like", value, "conEndDate");
            return (Criteria) this;
        }

        public Criteria andConEndDateNotLike(String value) {
            addCriterion("con_end_date not like", value, "conEndDate");
            return (Criteria) this;
        }

        public Criteria andConEndDateIn(List<String> values) {
            addCriterion("con_end_date in", values, "conEndDate");
            return (Criteria) this;
        }

        public Criteria andConEndDateNotIn(List<String> values) {
            addCriterion("con_end_date not in", values, "conEndDate");
            return (Criteria) this;
        }

        public Criteria andConEndDateBetween(String value1, String value2) {
            addCriterion("con_end_date between", value1, value2, "conEndDate");
            return (Criteria) this;
        }

        public Criteria andConEndDateNotBetween(String value1, String value2) {
            addCriterion("con_end_date not between", value1, value2, "conEndDate");
            return (Criteria) this;
        }

        public Criteria andConStartDateIsNull() {
            addCriterion("con_start_date is null");
            return (Criteria) this;
        }

        public Criteria andConStartDateIsNotNull() {
            addCriterion("con_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andConStartDateEqualTo(String value) {
            addCriterion("con_start_date =", value, "conStartDate");
            return (Criteria) this;
        }

        public Criteria andConStartDateNotEqualTo(String value) {
            addCriterion("con_start_date <>", value, "conStartDate");
            return (Criteria) this;
        }

        public Criteria andConStartDateGreaterThan(String value) {
            addCriterion("con_start_date >", value, "conStartDate");
            return (Criteria) this;
        }

        public Criteria andConStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("con_start_date >=", value, "conStartDate");
            return (Criteria) this;
        }

        public Criteria andConStartDateLessThan(String value) {
            addCriterion("con_start_date <", value, "conStartDate");
            return (Criteria) this;
        }

        public Criteria andConStartDateLessThanOrEqualTo(String value) {
            addCriterion("con_start_date <=", value, "conStartDate");
            return (Criteria) this;
        }

        public Criteria andConStartDateLike(String value) {
            addCriterion("con_start_date like", value, "conStartDate");
            return (Criteria) this;
        }

        public Criteria andConStartDateNotLike(String value) {
            addCriterion("con_start_date not like", value, "conStartDate");
            return (Criteria) this;
        }

        public Criteria andConStartDateIn(List<String> values) {
            addCriterion("con_start_date in", values, "conStartDate");
            return (Criteria) this;
        }

        public Criteria andConStartDateNotIn(List<String> values) {
            addCriterion("con_start_date not in", values, "conStartDate");
            return (Criteria) this;
        }

        public Criteria andConStartDateBetween(String value1, String value2) {
            addCriterion("con_start_date between", value1, value2, "conStartDate");
            return (Criteria) this;
        }

        public Criteria andConStartDateNotBetween(String value1, String value2) {
            addCriterion("con_start_date not between", value1, value2, "conStartDate");
            return (Criteria) this;
        }

        public Criteria andConStatusIsNull() {
            addCriterion("con_status is null");
            return (Criteria) this;
        }

        public Criteria andConStatusIsNotNull() {
            addCriterion("con_status is not null");
            return (Criteria) this;
        }

        public Criteria andConStatusEqualTo(Integer value) {
            addCriterion("con_status =", value, "conStatus");
            return (Criteria) this;
        }

        public Criteria andConStatusNotEqualTo(Integer value) {
            addCriterion("con_status <>", value, "conStatus");
            return (Criteria) this;
        }

        public Criteria andConStatusGreaterThan(Integer value) {
            addCriterion("con_status >", value, "conStatus");
            return (Criteria) this;
        }

        public Criteria andConStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("con_status >=", value, "conStatus");
            return (Criteria) this;
        }

        public Criteria andConStatusLessThan(Integer value) {
            addCriterion("con_status <", value, "conStatus");
            return (Criteria) this;
        }

        public Criteria andConStatusLessThanOrEqualTo(Integer value) {
            addCriterion("con_status <=", value, "conStatus");
            return (Criteria) this;
        }

        public Criteria andConStatusIn(List<Integer> values) {
            addCriterion("con_status in", values, "conStatus");
            return (Criteria) this;
        }

        public Criteria andConStatusNotIn(List<Integer> values) {
            addCriterion("con_status not in", values, "conStatus");
            return (Criteria) this;
        }

        public Criteria andConStatusBetween(Integer value1, Integer value2) {
            addCriterion("con_status between", value1, value2, "conStatus");
            return (Criteria) this;
        }

        public Criteria andConStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("con_status not between", value1, value2, "conStatus");
            return (Criteria) this;
        }

        public Criteria andConOkTimeIsNull() {
            addCriterion("con_ok_time is null");
            return (Criteria) this;
        }

        public Criteria andConOkTimeIsNotNull() {
            addCriterion("con_ok_time is not null");
            return (Criteria) this;
        }

        public Criteria andConOkTimeEqualTo(String value) {
            addCriterion("con_ok_time =", value, "conOkTime");
            return (Criteria) this;
        }

        public Criteria andConOkTimeNotEqualTo(String value) {
            addCriterion("con_ok_time <>", value, "conOkTime");
            return (Criteria) this;
        }

        public Criteria andConOkTimeGreaterThan(String value) {
            addCriterion("con_ok_time >", value, "conOkTime");
            return (Criteria) this;
        }

        public Criteria andConOkTimeGreaterThanOrEqualTo(String value) {
            addCriterion("con_ok_time >=", value, "conOkTime");
            return (Criteria) this;
        }

        public Criteria andConOkTimeLessThan(String value) {
            addCriterion("con_ok_time <", value, "conOkTime");
            return (Criteria) this;
        }

        public Criteria andConOkTimeLessThanOrEqualTo(String value) {
            addCriterion("con_ok_time <=", value, "conOkTime");
            return (Criteria) this;
        }

        public Criteria andConOkTimeLike(String value) {
            addCriterion("con_ok_time like", value, "conOkTime");
            return (Criteria) this;
        }

        public Criteria andConOkTimeNotLike(String value) {
            addCriterion("con_ok_time not like", value, "conOkTime");
            return (Criteria) this;
        }

        public Criteria andConOkTimeIn(List<String> values) {
            addCriterion("con_ok_time in", values, "conOkTime");
            return (Criteria) this;
        }

        public Criteria andConOkTimeNotIn(List<String> values) {
            addCriterion("con_ok_time not in", values, "conOkTime");
            return (Criteria) this;
        }

        public Criteria andConOkTimeBetween(String value1, String value2) {
            addCriterion("con_ok_time between", value1, value2, "conOkTime");
            return (Criteria) this;
        }

        public Criteria andConOkTimeNotBetween(String value1, String value2) {
            addCriterion("con_ok_time not between", value1, value2, "conOkTime");
            return (Criteria) this;
        }

        public Criteria andConAppTimeIsNull() {
            addCriterion("con_app_time is null");
            return (Criteria) this;
        }

        public Criteria andConAppTimeIsNotNull() {
            addCriterion("con_app_time is not null");
            return (Criteria) this;
        }

        public Criteria andConAppTimeEqualTo(String value) {
            addCriterion("con_app_time =", value, "conAppTime");
            return (Criteria) this;
        }

        public Criteria andConAppTimeNotEqualTo(String value) {
            addCriterion("con_app_time <>", value, "conAppTime");
            return (Criteria) this;
        }

        public Criteria andConAppTimeGreaterThan(String value) {
            addCriterion("con_app_time >", value, "conAppTime");
            return (Criteria) this;
        }

        public Criteria andConAppTimeGreaterThanOrEqualTo(String value) {
            addCriterion("con_app_time >=", value, "conAppTime");
            return (Criteria) this;
        }

        public Criteria andConAppTimeLessThan(String value) {
            addCriterion("con_app_time <", value, "conAppTime");
            return (Criteria) this;
        }

        public Criteria andConAppTimeLessThanOrEqualTo(String value) {
            addCriterion("con_app_time <=", value, "conAppTime");
            return (Criteria) this;
        }

        public Criteria andConAppTimeLike(String value) {
            addCriterion("con_app_time like", value, "conAppTime");
            return (Criteria) this;
        }

        public Criteria andConAppTimeNotLike(String value) {
            addCriterion("con_app_time not like", value, "conAppTime");
            return (Criteria) this;
        }

        public Criteria andConAppTimeIn(List<String> values) {
            addCriterion("con_app_time in", values, "conAppTime");
            return (Criteria) this;
        }

        public Criteria andConAppTimeNotIn(List<String> values) {
            addCriterion("con_app_time not in", values, "conAppTime");
            return (Criteria) this;
        }

        public Criteria andConAppTimeBetween(String value1, String value2) {
            addCriterion("con_app_time between", value1, value2, "conAppTime");
            return (Criteria) this;
        }

        public Criteria andConAppTimeNotBetween(String value1, String value2) {
            addCriterion("con_app_time not between", value1, value2, "conAppTime");
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