package com.ethan.oasy.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(String value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(String value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(String value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(String value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(String value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLike(String value) {
            addCriterion("staff_id like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotLike(String value) {
            addCriterion("staff_id not like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<String> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<String> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(String value1, String value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(String value1, String value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNull() {
            addCriterion("staff_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("staff_name =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("staff_name <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("staff_name >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_name >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("staff_name <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("staff_name <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("staff_name like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("staff_name not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("staff_name in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("staff_name not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("staff_name between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("staff_name not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffAccNumIsNull() {
            addCriterion("staff_acc_num is null");
            return (Criteria) this;
        }

        public Criteria andStaffAccNumIsNotNull() {
            addCriterion("staff_acc_num is not null");
            return (Criteria) this;
        }

        public Criteria andStaffAccNumEqualTo(String value) {
            addCriterion("staff_acc_num =", value, "staffAccNum");
            return (Criteria) this;
        }

        public Criteria andStaffAccNumNotEqualTo(String value) {
            addCriterion("staff_acc_num <>", value, "staffAccNum");
            return (Criteria) this;
        }

        public Criteria andStaffAccNumGreaterThan(String value) {
            addCriterion("staff_acc_num >", value, "staffAccNum");
            return (Criteria) this;
        }

        public Criteria andStaffAccNumGreaterThanOrEqualTo(String value) {
            addCriterion("staff_acc_num >=", value, "staffAccNum");
            return (Criteria) this;
        }

        public Criteria andStaffAccNumLessThan(String value) {
            addCriterion("staff_acc_num <", value, "staffAccNum");
            return (Criteria) this;
        }

        public Criteria andStaffAccNumLessThanOrEqualTo(String value) {
            addCriterion("staff_acc_num <=", value, "staffAccNum");
            return (Criteria) this;
        }

        public Criteria andStaffAccNumLike(String value) {
            addCriterion("staff_acc_num like", value, "staffAccNum");
            return (Criteria) this;
        }

        public Criteria andStaffAccNumNotLike(String value) {
            addCriterion("staff_acc_num not like", value, "staffAccNum");
            return (Criteria) this;
        }

        public Criteria andStaffAccNumIn(List<String> values) {
            addCriterion("staff_acc_num in", values, "staffAccNum");
            return (Criteria) this;
        }

        public Criteria andStaffAccNumNotIn(List<String> values) {
            addCriterion("staff_acc_num not in", values, "staffAccNum");
            return (Criteria) this;
        }

        public Criteria andStaffAccNumBetween(String value1, String value2) {
            addCriterion("staff_acc_num between", value1, value2, "staffAccNum");
            return (Criteria) this;
        }

        public Criteria andStaffAccNumNotBetween(String value1, String value2) {
            addCriterion("staff_acc_num not between", value1, value2, "staffAccNum");
            return (Criteria) this;
        }

        public Criteria andStaffGenderIsNull() {
            addCriterion("staff_gender is null");
            return (Criteria) this;
        }

        public Criteria andStaffGenderIsNotNull() {
            addCriterion("staff_gender is not null");
            return (Criteria) this;
        }

        public Criteria andStaffGenderEqualTo(Integer value) {
            addCriterion("staff_gender =", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderNotEqualTo(Integer value) {
            addCriterion("staff_gender <>", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderGreaterThan(Integer value) {
            addCriterion("staff_gender >", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_gender >=", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderLessThan(Integer value) {
            addCriterion("staff_gender <", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderLessThanOrEqualTo(Integer value) {
            addCriterion("staff_gender <=", value, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderIn(List<Integer> values) {
            addCriterion("staff_gender in", values, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderNotIn(List<Integer> values) {
            addCriterion("staff_gender not in", values, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderBetween(Integer value1, Integer value2) {
            addCriterion("staff_gender between", value1, value2, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_gender not between", value1, value2, "staffGender");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayIsNull() {
            addCriterion("staff_birthday is null");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayIsNotNull() {
            addCriterion("staff_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayEqualTo(String value) {
            addCriterion("staff_birthday =", value, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayNotEqualTo(String value) {
            addCriterion("staff_birthday <>", value, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayGreaterThan(String value) {
            addCriterion("staff_birthday >", value, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("staff_birthday >=", value, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayLessThan(String value) {
            addCriterion("staff_birthday <", value, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayLessThanOrEqualTo(String value) {
            addCriterion("staff_birthday <=", value, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayLike(String value) {
            addCriterion("staff_birthday like", value, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayNotLike(String value) {
            addCriterion("staff_birthday not like", value, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayIn(List<String> values) {
            addCriterion("staff_birthday in", values, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayNotIn(List<String> values) {
            addCriterion("staff_birthday not in", values, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayBetween(String value1, String value2) {
            addCriterion("staff_birthday between", value1, value2, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffBirthdayNotBetween(String value1, String value2) {
            addCriterion("staff_birthday not between", value1, value2, "staffBirthday");
            return (Criteria) this;
        }

        public Criteria andStaffAddressIsNull() {
            addCriterion("staff_address is null");
            return (Criteria) this;
        }

        public Criteria andStaffAddressIsNotNull() {
            addCriterion("staff_address is not null");
            return (Criteria) this;
        }

        public Criteria andStaffAddressEqualTo(String value) {
            addCriterion("staff_address =", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressNotEqualTo(String value) {
            addCriterion("staff_address <>", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressGreaterThan(String value) {
            addCriterion("staff_address >", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressGreaterThanOrEqualTo(String value) {
            addCriterion("staff_address >=", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressLessThan(String value) {
            addCriterion("staff_address <", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressLessThanOrEqualTo(String value) {
            addCriterion("staff_address <=", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressLike(String value) {
            addCriterion("staff_address like", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressNotLike(String value) {
            addCriterion("staff_address not like", value, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressIn(List<String> values) {
            addCriterion("staff_address in", values, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressNotIn(List<String> values) {
            addCriterion("staff_address not in", values, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressBetween(String value1, String value2) {
            addCriterion("staff_address between", value1, value2, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAddressNotBetween(String value1, String value2) {
            addCriterion("staff_address not between", value1, value2, "staffAddress");
            return (Criteria) this;
        }

        public Criteria andStaffAgeIsNull() {
            addCriterion("staff_age is null");
            return (Criteria) this;
        }

        public Criteria andStaffAgeIsNotNull() {
            addCriterion("staff_age is not null");
            return (Criteria) this;
        }

        public Criteria andStaffAgeEqualTo(Integer value) {
            addCriterion("staff_age =", value, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeNotEqualTo(Integer value) {
            addCriterion("staff_age <>", value, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeGreaterThan(Integer value) {
            addCriterion("staff_age >", value, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_age >=", value, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeLessThan(Integer value) {
            addCriterion("staff_age <", value, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeLessThanOrEqualTo(Integer value) {
            addCriterion("staff_age <=", value, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeIn(List<Integer> values) {
            addCriterion("staff_age in", values, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeNotIn(List<Integer> values) {
            addCriterion("staff_age not in", values, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeBetween(Integer value1, Integer value2) {
            addCriterion("staff_age between", value1, value2, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_age not between", value1, value2, "staffAge");
            return (Criteria) this;
        }

        public Criteria andStaffDepartIsNull() {
            addCriterion("staff_depart is null");
            return (Criteria) this;
        }

        public Criteria andStaffDepartIsNotNull() {
            addCriterion("staff_depart is not null");
            return (Criteria) this;
        }

        public Criteria andStaffDepartEqualTo(String value) {
            addCriterion("staff_depart =", value, "staffDepart");
            return (Criteria) this;
        }

        public Criteria andStaffDepartNotEqualTo(String value) {
            addCriterion("staff_depart <>", value, "staffDepart");
            return (Criteria) this;
        }

        public Criteria andStaffDepartGreaterThan(String value) {
            addCriterion("staff_depart >", value, "staffDepart");
            return (Criteria) this;
        }

        public Criteria andStaffDepartGreaterThanOrEqualTo(String value) {
            addCriterion("staff_depart >=", value, "staffDepart");
            return (Criteria) this;
        }

        public Criteria andStaffDepartLessThan(String value) {
            addCriterion("staff_depart <", value, "staffDepart");
            return (Criteria) this;
        }

        public Criteria andStaffDepartLessThanOrEqualTo(String value) {
            addCriterion("staff_depart <=", value, "staffDepart");
            return (Criteria) this;
        }

        public Criteria andStaffDepartLike(String value) {
            addCriterion("staff_depart like", value, "staffDepart");
            return (Criteria) this;
        }

        public Criteria andStaffDepartNotLike(String value) {
            addCriterion("staff_depart not like", value, "staffDepart");
            return (Criteria) this;
        }

        public Criteria andStaffDepartIn(List<String> values) {
            addCriterion("staff_depart in", values, "staffDepart");
            return (Criteria) this;
        }

        public Criteria andStaffDepartNotIn(List<String> values) {
            addCriterion("staff_depart not in", values, "staffDepart");
            return (Criteria) this;
        }

        public Criteria andStaffDepartBetween(String value1, String value2) {
            addCriterion("staff_depart between", value1, value2, "staffDepart");
            return (Criteria) this;
        }

        public Criteria andStaffDepartNotBetween(String value1, String value2) {
            addCriterion("staff_depart not between", value1, value2, "staffDepart");
            return (Criteria) this;
        }

        public Criteria andStaffPosiIsNull() {
            addCriterion("staff_posi is null");
            return (Criteria) this;
        }

        public Criteria andStaffPosiIsNotNull() {
            addCriterion("staff_posi is not null");
            return (Criteria) this;
        }

        public Criteria andStaffPosiEqualTo(String value) {
            addCriterion("staff_posi =", value, "staffPosi");
            return (Criteria) this;
        }

        public Criteria andStaffPosiNotEqualTo(String value) {
            addCriterion("staff_posi <>", value, "staffPosi");
            return (Criteria) this;
        }

        public Criteria andStaffPosiGreaterThan(String value) {
            addCriterion("staff_posi >", value, "staffPosi");
            return (Criteria) this;
        }

        public Criteria andStaffPosiGreaterThanOrEqualTo(String value) {
            addCriterion("staff_posi >=", value, "staffPosi");
            return (Criteria) this;
        }

        public Criteria andStaffPosiLessThan(String value) {
            addCriterion("staff_posi <", value, "staffPosi");
            return (Criteria) this;
        }

        public Criteria andStaffPosiLessThanOrEqualTo(String value) {
            addCriterion("staff_posi <=", value, "staffPosi");
            return (Criteria) this;
        }

        public Criteria andStaffPosiLike(String value) {
            addCriterion("staff_posi like", value, "staffPosi");
            return (Criteria) this;
        }

        public Criteria andStaffPosiNotLike(String value) {
            addCriterion("staff_posi not like", value, "staffPosi");
            return (Criteria) this;
        }

        public Criteria andStaffPosiIn(List<String> values) {
            addCriterion("staff_posi in", values, "staffPosi");
            return (Criteria) this;
        }

        public Criteria andStaffPosiNotIn(List<String> values) {
            addCriterion("staff_posi not in", values, "staffPosi");
            return (Criteria) this;
        }

        public Criteria andStaffPosiBetween(String value1, String value2) {
            addCriterion("staff_posi between", value1, value2, "staffPosi");
            return (Criteria) this;
        }

        public Criteria andStaffPosiNotBetween(String value1, String value2) {
            addCriterion("staff_posi not between", value1, value2, "staffPosi");
            return (Criteria) this;
        }

        public Criteria andStaffSalIsNull() {
            addCriterion("staff_sal is null");
            return (Criteria) this;
        }

        public Criteria andStaffSalIsNotNull() {
            addCriterion("staff_sal is not null");
            return (Criteria) this;
        }

        public Criteria andStaffSalEqualTo(BigDecimal value) {
            addCriterion("staff_sal =", value, "staffSal");
            return (Criteria) this;
        }

        public Criteria andStaffSalNotEqualTo(BigDecimal value) {
            addCriterion("staff_sal <>", value, "staffSal");
            return (Criteria) this;
        }

        public Criteria andStaffSalGreaterThan(BigDecimal value) {
            addCriterion("staff_sal >", value, "staffSal");
            return (Criteria) this;
        }

        public Criteria andStaffSalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("staff_sal >=", value, "staffSal");
            return (Criteria) this;
        }

        public Criteria andStaffSalLessThan(BigDecimal value) {
            addCriterion("staff_sal <", value, "staffSal");
            return (Criteria) this;
        }

        public Criteria andStaffSalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("staff_sal <=", value, "staffSal");
            return (Criteria) this;
        }

        public Criteria andStaffSalIn(List<BigDecimal> values) {
            addCriterion("staff_sal in", values, "staffSal");
            return (Criteria) this;
        }

        public Criteria andStaffSalNotIn(List<BigDecimal> values) {
            addCriterion("staff_sal not in", values, "staffSal");
            return (Criteria) this;
        }

        public Criteria andStaffSalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("staff_sal between", value1, value2, "staffSal");
            return (Criteria) this;
        }

        public Criteria andStaffSalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("staff_sal not between", value1, value2, "staffSal");
            return (Criteria) this;
        }

        public Criteria andStaffStatusIsNull() {
            addCriterion("staff_status is null");
            return (Criteria) this;
        }

        public Criteria andStaffStatusIsNotNull() {
            addCriterion("staff_status is not null");
            return (Criteria) this;
        }

        public Criteria andStaffStatusEqualTo(Integer value) {
            addCriterion("staff_status =", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusNotEqualTo(Integer value) {
            addCriterion("staff_status <>", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusGreaterThan(Integer value) {
            addCriterion("staff_status >", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_status >=", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusLessThan(Integer value) {
            addCriterion("staff_status <", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusLessThanOrEqualTo(Integer value) {
            addCriterion("staff_status <=", value, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusIn(List<Integer> values) {
            addCriterion("staff_status in", values, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusNotIn(List<Integer> values) {
            addCriterion("staff_status not in", values, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusBetween(Integer value1, Integer value2) {
            addCriterion("staff_status between", value1, value2, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_status not between", value1, value2, "staffStatus");
            return (Criteria) this;
        }

        public Criteria andStaffHiredateIsNull() {
            addCriterion("staff_hiredate is null");
            return (Criteria) this;
        }

        public Criteria andStaffHiredateIsNotNull() {
            addCriterion("staff_hiredate is not null");
            return (Criteria) this;
        }

        public Criteria andStaffHiredateEqualTo(String value) {
            addCriterion("staff_hiredate =", value, "staffHiredate");
            return (Criteria) this;
        }

        public Criteria andStaffHiredateNotEqualTo(String value) {
            addCriterion("staff_hiredate <>", value, "staffHiredate");
            return (Criteria) this;
        }

        public Criteria andStaffHiredateGreaterThan(String value) {
            addCriterion("staff_hiredate >", value, "staffHiredate");
            return (Criteria) this;
        }

        public Criteria andStaffHiredateGreaterThanOrEqualTo(String value) {
            addCriterion("staff_hiredate >=", value, "staffHiredate");
            return (Criteria) this;
        }

        public Criteria andStaffHiredateLessThan(String value) {
            addCriterion("staff_hiredate <", value, "staffHiredate");
            return (Criteria) this;
        }

        public Criteria andStaffHiredateLessThanOrEqualTo(String value) {
            addCriterion("staff_hiredate <=", value, "staffHiredate");
            return (Criteria) this;
        }

        public Criteria andStaffHiredateLike(String value) {
            addCriterion("staff_hiredate like", value, "staffHiredate");
            return (Criteria) this;
        }

        public Criteria andStaffHiredateNotLike(String value) {
            addCriterion("staff_hiredate not like", value, "staffHiredate");
            return (Criteria) this;
        }

        public Criteria andStaffHiredateIn(List<String> values) {
            addCriterion("staff_hiredate in", values, "staffHiredate");
            return (Criteria) this;
        }

        public Criteria andStaffHiredateNotIn(List<String> values) {
            addCriterion("staff_hiredate not in", values, "staffHiredate");
            return (Criteria) this;
        }

        public Criteria andStaffHiredateBetween(String value1, String value2) {
            addCriterion("staff_hiredate between", value1, value2, "staffHiredate");
            return (Criteria) this;
        }

        public Criteria andStaffHiredateNotBetween(String value1, String value2) {
            addCriterion("staff_hiredate not between", value1, value2, "staffHiredate");
            return (Criteria) this;
        }

        public Criteria andStaffLeavedateIsNull() {
            addCriterion("staff_leavedate is null");
            return (Criteria) this;
        }

        public Criteria andStaffLeavedateIsNotNull() {
            addCriterion("staff_leavedate is not null");
            return (Criteria) this;
        }

        public Criteria andStaffLeavedateEqualTo(String value) {
            addCriterion("staff_leavedate =", value, "staffLeavedate");
            return (Criteria) this;
        }

        public Criteria andStaffLeavedateNotEqualTo(String value) {
            addCriterion("staff_leavedate <>", value, "staffLeavedate");
            return (Criteria) this;
        }

        public Criteria andStaffLeavedateGreaterThan(String value) {
            addCriterion("staff_leavedate >", value, "staffLeavedate");
            return (Criteria) this;
        }

        public Criteria andStaffLeavedateGreaterThanOrEqualTo(String value) {
            addCriterion("staff_leavedate >=", value, "staffLeavedate");
            return (Criteria) this;
        }

        public Criteria andStaffLeavedateLessThan(String value) {
            addCriterion("staff_leavedate <", value, "staffLeavedate");
            return (Criteria) this;
        }

        public Criteria andStaffLeavedateLessThanOrEqualTo(String value) {
            addCriterion("staff_leavedate <=", value, "staffLeavedate");
            return (Criteria) this;
        }

        public Criteria andStaffLeavedateLike(String value) {
            addCriterion("staff_leavedate like", value, "staffLeavedate");
            return (Criteria) this;
        }

        public Criteria andStaffLeavedateNotLike(String value) {
            addCriterion("staff_leavedate not like", value, "staffLeavedate");
            return (Criteria) this;
        }

        public Criteria andStaffLeavedateIn(List<String> values) {
            addCriterion("staff_leavedate in", values, "staffLeavedate");
            return (Criteria) this;
        }

        public Criteria andStaffLeavedateNotIn(List<String> values) {
            addCriterion("staff_leavedate not in", values, "staffLeavedate");
            return (Criteria) this;
        }

        public Criteria andStaffLeavedateBetween(String value1, String value2) {
            addCriterion("staff_leavedate between", value1, value2, "staffLeavedate");
            return (Criteria) this;
        }

        public Criteria andStaffLeavedateNotBetween(String value1, String value2) {
            addCriterion("staff_leavedate not between", value1, value2, "staffLeavedate");
            return (Criteria) this;
        }

        public Criteria andStaffTelIsNull() {
            addCriterion("staff_tel is null");
            return (Criteria) this;
        }

        public Criteria andStaffTelIsNotNull() {
            addCriterion("staff_tel is not null");
            return (Criteria) this;
        }

        public Criteria andStaffTelEqualTo(String value) {
            addCriterion("staff_tel =", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelNotEqualTo(String value) {
            addCriterion("staff_tel <>", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelGreaterThan(String value) {
            addCriterion("staff_tel >", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelGreaterThanOrEqualTo(String value) {
            addCriterion("staff_tel >=", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelLessThan(String value) {
            addCriterion("staff_tel <", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelLessThanOrEqualTo(String value) {
            addCriterion("staff_tel <=", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelLike(String value) {
            addCriterion("staff_tel like", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelNotLike(String value) {
            addCriterion("staff_tel not like", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelIn(List<String> values) {
            addCriterion("staff_tel in", values, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelNotIn(List<String> values) {
            addCriterion("staff_tel not in", values, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelBetween(String value1, String value2) {
            addCriterion("staff_tel between", value1, value2, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelNotBetween(String value1, String value2) {
            addCriterion("staff_tel not between", value1, value2, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStmailIsNull() {
            addCriterion("stMail is null");
            return (Criteria) this;
        }

        public Criteria andStmailIsNotNull() {
            addCriterion("stMail is not null");
            return (Criteria) this;
        }

        public Criteria andStmailEqualTo(String value) {
            addCriterion("stMail =", value, "stmail");
            return (Criteria) this;
        }

        public Criteria andStmailNotEqualTo(String value) {
            addCriterion("stMail <>", value, "stmail");
            return (Criteria) this;
        }

        public Criteria andStmailGreaterThan(String value) {
            addCriterion("stMail >", value, "stmail");
            return (Criteria) this;
        }

        public Criteria andStmailGreaterThanOrEqualTo(String value) {
            addCriterion("stMail >=", value, "stmail");
            return (Criteria) this;
        }

        public Criteria andStmailLessThan(String value) {
            addCriterion("stMail <", value, "stmail");
            return (Criteria) this;
        }

        public Criteria andStmailLessThanOrEqualTo(String value) {
            addCriterion("stMail <=", value, "stmail");
            return (Criteria) this;
        }

        public Criteria andStmailLike(String value) {
            addCriterion("stMail like", value, "stmail");
            return (Criteria) this;
        }

        public Criteria andStmailNotLike(String value) {
            addCriterion("stMail not like", value, "stmail");
            return (Criteria) this;
        }

        public Criteria andStmailIn(List<String> values) {
            addCriterion("stMail in", values, "stmail");
            return (Criteria) this;
        }

        public Criteria andStmailNotIn(List<String> values) {
            addCriterion("stMail not in", values, "stmail");
            return (Criteria) this;
        }

        public Criteria andStmailBetween(String value1, String value2) {
            addCriterion("stMail between", value1, value2, "stmail");
            return (Criteria) this;
        }

        public Criteria andStmailNotBetween(String value1, String value2) {
            addCriterion("stMail not between", value1, value2, "stmail");
            return (Criteria) this;
        }

        public Criteria andStaffGradeIsNull() {
            addCriterion("staff_grade is null");
            return (Criteria) this;
        }

        public Criteria andStaffGradeIsNotNull() {
            addCriterion("staff_grade is not null");
            return (Criteria) this;
        }

        public Criteria andStaffGradeEqualTo(Integer value) {
            addCriterion("staff_grade =", value, "staffGrade");
            return (Criteria) this;
        }

        public Criteria andStaffGradeNotEqualTo(Integer value) {
            addCriterion("staff_grade <>", value, "staffGrade");
            return (Criteria) this;
        }

        public Criteria andStaffGradeGreaterThan(Integer value) {
            addCriterion("staff_grade >", value, "staffGrade");
            return (Criteria) this;
        }

        public Criteria andStaffGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_grade >=", value, "staffGrade");
            return (Criteria) this;
        }

        public Criteria andStaffGradeLessThan(Integer value) {
            addCriterion("staff_grade <", value, "staffGrade");
            return (Criteria) this;
        }

        public Criteria andStaffGradeLessThanOrEqualTo(Integer value) {
            addCriterion("staff_grade <=", value, "staffGrade");
            return (Criteria) this;
        }

        public Criteria andStaffGradeIn(List<Integer> values) {
            addCriterion("staff_grade in", values, "staffGrade");
            return (Criteria) this;
        }

        public Criteria andStaffGradeNotIn(List<Integer> values) {
            addCriterion("staff_grade not in", values, "staffGrade");
            return (Criteria) this;
        }

        public Criteria andStaffGradeBetween(Integer value1, Integer value2) {
            addCriterion("staff_grade between", value1, value2, "staffGrade");
            return (Criteria) this;
        }

        public Criteria andStaffGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_grade not between", value1, value2, "staffGrade");
            return (Criteria) this;
        }

        public Criteria andStaffPassIsNull() {
            addCriterion("staff_pass is null");
            return (Criteria) this;
        }

        public Criteria andStaffPassIsNotNull() {
            addCriterion("staff_pass is not null");
            return (Criteria) this;
        }

        public Criteria andStaffPassEqualTo(String value) {
            addCriterion("staff_pass =", value, "staffPass");
            return (Criteria) this;
        }

        public Criteria andStaffPassNotEqualTo(String value) {
            addCriterion("staff_pass <>", value, "staffPass");
            return (Criteria) this;
        }

        public Criteria andStaffPassGreaterThan(String value) {
            addCriterion("staff_pass >", value, "staffPass");
            return (Criteria) this;
        }

        public Criteria andStaffPassGreaterThanOrEqualTo(String value) {
            addCriterion("staff_pass >=", value, "staffPass");
            return (Criteria) this;
        }

        public Criteria andStaffPassLessThan(String value) {
            addCriterion("staff_pass <", value, "staffPass");
            return (Criteria) this;
        }

        public Criteria andStaffPassLessThanOrEqualTo(String value) {
            addCriterion("staff_pass <=", value, "staffPass");
            return (Criteria) this;
        }

        public Criteria andStaffPassLike(String value) {
            addCriterion("staff_pass like", value, "staffPass");
            return (Criteria) this;
        }

        public Criteria andStaffPassNotLike(String value) {
            addCriterion("staff_pass not like", value, "staffPass");
            return (Criteria) this;
        }

        public Criteria andStaffPassIn(List<String> values) {
            addCriterion("staff_pass in", values, "staffPass");
            return (Criteria) this;
        }

        public Criteria andStaffPassNotIn(List<String> values) {
            addCriterion("staff_pass not in", values, "staffPass");
            return (Criteria) this;
        }

        public Criteria andStaffPassBetween(String value1, String value2) {
            addCriterion("staff_pass between", value1, value2, "staffPass");
            return (Criteria) this;
        }

        public Criteria andStaffPassNotBetween(String value1, String value2) {
            addCriterion("staff_pass not between", value1, value2, "staffPass");
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