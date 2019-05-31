package com.ethan.oasy.pojo;

import java.util.ArrayList;
import java.util.List;

public class AttenceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttenceExample() {
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

        public Criteria andAttIdIsNull() {
            addCriterion("att_id is null");
            return (Criteria) this;
        }

        public Criteria andAttIdIsNotNull() {
            addCriterion("att_id is not null");
            return (Criteria) this;
        }

        public Criteria andAttIdEqualTo(String value) {
            addCriterion("att_id =", value, "attId");
            return (Criteria) this;
        }

        public Criteria andAttIdNotEqualTo(String value) {
            addCriterion("att_id <>", value, "attId");
            return (Criteria) this;
        }

        public Criteria andAttIdGreaterThan(String value) {
            addCriterion("att_id >", value, "attId");
            return (Criteria) this;
        }

        public Criteria andAttIdGreaterThanOrEqualTo(String value) {
            addCriterion("att_id >=", value, "attId");
            return (Criteria) this;
        }

        public Criteria andAttIdLessThan(String value) {
            addCriterion("att_id <", value, "attId");
            return (Criteria) this;
        }

        public Criteria andAttIdLessThanOrEqualTo(String value) {
            addCriterion("att_id <=", value, "attId");
            return (Criteria) this;
        }

        public Criteria andAttIdLike(String value) {
            addCriterion("att_id like", value, "attId");
            return (Criteria) this;
        }

        public Criteria andAttIdNotLike(String value) {
            addCriterion("att_id not like", value, "attId");
            return (Criteria) this;
        }

        public Criteria andAttIdIn(List<String> values) {
            addCriterion("att_id in", values, "attId");
            return (Criteria) this;
        }

        public Criteria andAttIdNotIn(List<String> values) {
            addCriterion("att_id not in", values, "attId");
            return (Criteria) this;
        }

        public Criteria andAttIdBetween(String value1, String value2) {
            addCriterion("att_id between", value1, value2, "attId");
            return (Criteria) this;
        }

        public Criteria andAttIdNotBetween(String value1, String value2) {
            addCriterion("att_id not between", value1, value2, "attId");
            return (Criteria) this;
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

        public Criteria andStaffNumIsNull() {
            addCriterion("staff_num is null");
            return (Criteria) this;
        }

        public Criteria andStaffNumIsNotNull() {
            addCriterion("staff_num is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNumEqualTo(String value) {
            addCriterion("staff_num =", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumNotEqualTo(String value) {
            addCriterion("staff_num <>", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumGreaterThan(String value) {
            addCriterion("staff_num >", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumGreaterThanOrEqualTo(String value) {
            addCriterion("staff_num >=", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumLessThan(String value) {
            addCriterion("staff_num <", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumLessThanOrEqualTo(String value) {
            addCriterion("staff_num <=", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumLike(String value) {
            addCriterion("staff_num like", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumNotLike(String value) {
            addCriterion("staff_num not like", value, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumIn(List<String> values) {
            addCriterion("staff_num in", values, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumNotIn(List<String> values) {
            addCriterion("staff_num not in", values, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumBetween(String value1, String value2) {
            addCriterion("staff_num between", value1, value2, "staffNum");
            return (Criteria) this;
        }

        public Criteria andStaffNumNotBetween(String value1, String value2) {
            addCriterion("staff_num not between", value1, value2, "staffNum");
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

        public Criteria andStartWorkTimeIsNull() {
            addCriterion("start_work_time is null");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeIsNotNull() {
            addCriterion("start_work_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeEqualTo(String value) {
            addCriterion("start_work_time =", value, "startWorkTime");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeNotEqualTo(String value) {
            addCriterion("start_work_time <>", value, "startWorkTime");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeGreaterThan(String value) {
            addCriterion("start_work_time >", value, "startWorkTime");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_work_time >=", value, "startWorkTime");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeLessThan(String value) {
            addCriterion("start_work_time <", value, "startWorkTime");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeLessThanOrEqualTo(String value) {
            addCriterion("start_work_time <=", value, "startWorkTime");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeLike(String value) {
            addCriterion("start_work_time like", value, "startWorkTime");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeNotLike(String value) {
            addCriterion("start_work_time not like", value, "startWorkTime");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeIn(List<String> values) {
            addCriterion("start_work_time in", values, "startWorkTime");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeNotIn(List<String> values) {
            addCriterion("start_work_time not in", values, "startWorkTime");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeBetween(String value1, String value2) {
            addCriterion("start_work_time between", value1, value2, "startWorkTime");
            return (Criteria) this;
        }

        public Criteria andStartWorkTimeNotBetween(String value1, String value2) {
            addCriterion("start_work_time not between", value1, value2, "startWorkTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeIsNull() {
            addCriterion("check_in_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeIsNotNull() {
            addCriterion("check_in_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeEqualTo(String value) {
            addCriterion("check_in_time =", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeNotEqualTo(String value) {
            addCriterion("check_in_time <>", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeGreaterThan(String value) {
            addCriterion("check_in_time >", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeGreaterThanOrEqualTo(String value) {
            addCriterion("check_in_time >=", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeLessThan(String value) {
            addCriterion("check_in_time <", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeLessThanOrEqualTo(String value) {
            addCriterion("check_in_time <=", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeLike(String value) {
            addCriterion("check_in_time like", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeNotLike(String value) {
            addCriterion("check_in_time not like", value, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeIn(List<String> values) {
            addCriterion("check_in_time in", values, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeNotIn(List<String> values) {
            addCriterion("check_in_time not in", values, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeBetween(String value1, String value2) {
            addCriterion("check_in_time between", value1, value2, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andCheckInTimeNotBetween(String value1, String value2) {
            addCriterion("check_in_time not between", value1, value2, "checkInTime");
            return (Criteria) this;
        }

        public Criteria andEndWorkTimeIsNull() {
            addCriterion("end_work_time is null");
            return (Criteria) this;
        }

        public Criteria andEndWorkTimeIsNotNull() {
            addCriterion("end_work_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndWorkTimeEqualTo(String value) {
            addCriterion("end_work_time =", value, "endWorkTime");
            return (Criteria) this;
        }

        public Criteria andEndWorkTimeNotEqualTo(String value) {
            addCriterion("end_work_time <>", value, "endWorkTime");
            return (Criteria) this;
        }

        public Criteria andEndWorkTimeGreaterThan(String value) {
            addCriterion("end_work_time >", value, "endWorkTime");
            return (Criteria) this;
        }

        public Criteria andEndWorkTimeGreaterThanOrEqualTo(String value) {
            addCriterion("end_work_time >=", value, "endWorkTime");
            return (Criteria) this;
        }

        public Criteria andEndWorkTimeLessThan(String value) {
            addCriterion("end_work_time <", value, "endWorkTime");
            return (Criteria) this;
        }

        public Criteria andEndWorkTimeLessThanOrEqualTo(String value) {
            addCriterion("end_work_time <=", value, "endWorkTime");
            return (Criteria) this;
        }

        public Criteria andEndWorkTimeLike(String value) {
            addCriterion("end_work_time like", value, "endWorkTime");
            return (Criteria) this;
        }

        public Criteria andEndWorkTimeNotLike(String value) {
            addCriterion("end_work_time not like", value, "endWorkTime");
            return (Criteria) this;
        }

        public Criteria andEndWorkTimeIn(List<String> values) {
            addCriterion("end_work_time in", values, "endWorkTime");
            return (Criteria) this;
        }

        public Criteria andEndWorkTimeNotIn(List<String> values) {
            addCriterion("end_work_time not in", values, "endWorkTime");
            return (Criteria) this;
        }

        public Criteria andEndWorkTimeBetween(String value1, String value2) {
            addCriterion("end_work_time between", value1, value2, "endWorkTime");
            return (Criteria) this;
        }

        public Criteria andEndWorkTimeNotBetween(String value1, String value2) {
            addCriterion("end_work_time not between", value1, value2, "endWorkTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeIsNull() {
            addCriterion("signing_time is null");
            return (Criteria) this;
        }

        public Criteria andSigningTimeIsNotNull() {
            addCriterion("signing_time is not null");
            return (Criteria) this;
        }

        public Criteria andSigningTimeEqualTo(String value) {
            addCriterion("signing_time =", value, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeNotEqualTo(String value) {
            addCriterion("signing_time <>", value, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeGreaterThan(String value) {
            addCriterion("signing_time >", value, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeGreaterThanOrEqualTo(String value) {
            addCriterion("signing_time >=", value, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeLessThan(String value) {
            addCriterion("signing_time <", value, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeLessThanOrEqualTo(String value) {
            addCriterion("signing_time <=", value, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeLike(String value) {
            addCriterion("signing_time like", value, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeNotLike(String value) {
            addCriterion("signing_time not like", value, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeIn(List<String> values) {
            addCriterion("signing_time in", values, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeNotIn(List<String> values) {
            addCriterion("signing_time not in", values, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeBetween(String value1, String value2) {
            addCriterion("signing_time between", value1, value2, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeNotBetween(String value1, String value2) {
            addCriterion("signing_time not between", value1, value2, "signingTime");
            return (Criteria) this;
        }

        public Criteria andCheckInStatusIsNull() {
            addCriterion("check_in_status is null");
            return (Criteria) this;
        }

        public Criteria andCheckInStatusIsNotNull() {
            addCriterion("check_in_status is not null");
            return (Criteria) this;
        }

        public Criteria andCheckInStatusEqualTo(Integer value) {
            addCriterion("check_in_status =", value, "checkInStatus");
            return (Criteria) this;
        }

        public Criteria andCheckInStatusNotEqualTo(Integer value) {
            addCriterion("check_in_status <>", value, "checkInStatus");
            return (Criteria) this;
        }

        public Criteria andCheckInStatusGreaterThan(Integer value) {
            addCriterion("check_in_status >", value, "checkInStatus");
            return (Criteria) this;
        }

        public Criteria andCheckInStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_in_status >=", value, "checkInStatus");
            return (Criteria) this;
        }

        public Criteria andCheckInStatusLessThan(Integer value) {
            addCriterion("check_in_status <", value, "checkInStatus");
            return (Criteria) this;
        }

        public Criteria andCheckInStatusLessThanOrEqualTo(Integer value) {
            addCriterion("check_in_status <=", value, "checkInStatus");
            return (Criteria) this;
        }

        public Criteria andCheckInStatusIn(List<Integer> values) {
            addCriterion("check_in_status in", values, "checkInStatus");
            return (Criteria) this;
        }

        public Criteria andCheckInStatusNotIn(List<Integer> values) {
            addCriterion("check_in_status not in", values, "checkInStatus");
            return (Criteria) this;
        }

        public Criteria andCheckInStatusBetween(Integer value1, Integer value2) {
            addCriterion("check_in_status between", value1, value2, "checkInStatus");
            return (Criteria) this;
        }

        public Criteria andCheckInStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("check_in_status not between", value1, value2, "checkInStatus");
            return (Criteria) this;
        }

        public Criteria andSigningStatusIsNull() {
            addCriterion("signing_status is null");
            return (Criteria) this;
        }

        public Criteria andSigningStatusIsNotNull() {
            addCriterion("signing_status is not null");
            return (Criteria) this;
        }

        public Criteria andSigningStatusEqualTo(Integer value) {
            addCriterion("signing_status =", value, "signingStatus");
            return (Criteria) this;
        }

        public Criteria andSigningStatusNotEqualTo(Integer value) {
            addCriterion("signing_status <>", value, "signingStatus");
            return (Criteria) this;
        }

        public Criteria andSigningStatusGreaterThan(Integer value) {
            addCriterion("signing_status >", value, "signingStatus");
            return (Criteria) this;
        }

        public Criteria andSigningStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("signing_status >=", value, "signingStatus");
            return (Criteria) this;
        }

        public Criteria andSigningStatusLessThan(Integer value) {
            addCriterion("signing_status <", value, "signingStatus");
            return (Criteria) this;
        }

        public Criteria andSigningStatusLessThanOrEqualTo(Integer value) {
            addCriterion("signing_status <=", value, "signingStatus");
            return (Criteria) this;
        }

        public Criteria andSigningStatusIn(List<Integer> values) {
            addCriterion("signing_status in", values, "signingStatus");
            return (Criteria) this;
        }

        public Criteria andSigningStatusNotIn(List<Integer> values) {
            addCriterion("signing_status not in", values, "signingStatus");
            return (Criteria) this;
        }

        public Criteria andSigningStatusBetween(Integer value1, Integer value2) {
            addCriterion("signing_status between", value1, value2, "signingStatus");
            return (Criteria) this;
        }

        public Criteria andSigningStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("signing_status not between", value1, value2, "signingStatus");
            return (Criteria) this;
        }

        public Criteria andHolidayIsNull() {
            addCriterion("holiday is null");
            return (Criteria) this;
        }

        public Criteria andHolidayIsNotNull() {
            addCriterion("holiday is not null");
            return (Criteria) this;
        }

        public Criteria andHolidayEqualTo(Integer value) {
            addCriterion("holiday =", value, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayNotEqualTo(Integer value) {
            addCriterion("holiday <>", value, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayGreaterThan(Integer value) {
            addCriterion("holiday >", value, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayGreaterThanOrEqualTo(Integer value) {
            addCriterion("holiday >=", value, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayLessThan(Integer value) {
            addCriterion("holiday <", value, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayLessThanOrEqualTo(Integer value) {
            addCriterion("holiday <=", value, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayIn(List<Integer> values) {
            addCriterion("holiday in", values, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayNotIn(List<Integer> values) {
            addCriterion("holiday not in", values, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayBetween(Integer value1, Integer value2) {
            addCriterion("holiday between", value1, value2, "holiday");
            return (Criteria) this;
        }

        public Criteria andHolidayNotBetween(Integer value1, Integer value2) {
            addCriterion("holiday not between", value1, value2, "holiday");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
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