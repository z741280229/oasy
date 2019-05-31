package com.ethan.oasy.pojo;

import java.util.ArrayList;
import java.util.List;

public class JobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobExample() {
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

        public Criteria andJobIdIsNull() {
            addCriterion("job_id is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("job_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(String value) {
            addCriterion("job_id =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(String value) {
            addCriterion("job_id <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(String value) {
            addCriterion("job_id >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(String value) {
            addCriterion("job_id >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(String value) {
            addCriterion("job_id <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(String value) {
            addCriterion("job_id <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLike(String value) {
            addCriterion("job_id like", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotLike(String value) {
            addCriterion("job_id not like", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<String> values) {
            addCriterion("job_id in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<String> values) {
            addCriterion("job_id not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(String value1, String value2) {
            addCriterion("job_id between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(String value1, String value2) {
            addCriterion("job_id not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobLeaderIsNull() {
            addCriterion("job_leader is null");
            return (Criteria) this;
        }

        public Criteria andJobLeaderIsNotNull() {
            addCriterion("job_leader is not null");
            return (Criteria) this;
        }

        public Criteria andJobLeaderEqualTo(String value) {
            addCriterion("job_leader =", value, "jobLeader");
            return (Criteria) this;
        }

        public Criteria andJobLeaderNotEqualTo(String value) {
            addCriterion("job_leader <>", value, "jobLeader");
            return (Criteria) this;
        }

        public Criteria andJobLeaderGreaterThan(String value) {
            addCriterion("job_leader >", value, "jobLeader");
            return (Criteria) this;
        }

        public Criteria andJobLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("job_leader >=", value, "jobLeader");
            return (Criteria) this;
        }

        public Criteria andJobLeaderLessThan(String value) {
            addCriterion("job_leader <", value, "jobLeader");
            return (Criteria) this;
        }

        public Criteria andJobLeaderLessThanOrEqualTo(String value) {
            addCriterion("job_leader <=", value, "jobLeader");
            return (Criteria) this;
        }

        public Criteria andJobLeaderLike(String value) {
            addCriterion("job_leader like", value, "jobLeader");
            return (Criteria) this;
        }

        public Criteria andJobLeaderNotLike(String value) {
            addCriterion("job_leader not like", value, "jobLeader");
            return (Criteria) this;
        }

        public Criteria andJobLeaderIn(List<String> values) {
            addCriterion("job_leader in", values, "jobLeader");
            return (Criteria) this;
        }

        public Criteria andJobLeaderNotIn(List<String> values) {
            addCriterion("job_leader not in", values, "jobLeader");
            return (Criteria) this;
        }

        public Criteria andJobLeaderBetween(String value1, String value2) {
            addCriterion("job_leader between", value1, value2, "jobLeader");
            return (Criteria) this;
        }

        public Criteria andJobLeaderNotBetween(String value1, String value2) {
            addCriterion("job_leader not between", value1, value2, "jobLeader");
            return (Criteria) this;
        }

        public Criteria andJobTitleIsNull() {
            addCriterion("job_title is null");
            return (Criteria) this;
        }

        public Criteria andJobTitleIsNotNull() {
            addCriterion("job_title is not null");
            return (Criteria) this;
        }

        public Criteria andJobTitleEqualTo(String value) {
            addCriterion("job_title =", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotEqualTo(String value) {
            addCriterion("job_title <>", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleGreaterThan(String value) {
            addCriterion("job_title >", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleGreaterThanOrEqualTo(String value) {
            addCriterion("job_title >=", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleLessThan(String value) {
            addCriterion("job_title <", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleLessThanOrEqualTo(String value) {
            addCriterion("job_title <=", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleLike(String value) {
            addCriterion("job_title like", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotLike(String value) {
            addCriterion("job_title not like", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleIn(List<String> values) {
            addCriterion("job_title in", values, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotIn(List<String> values) {
            addCriterion("job_title not in", values, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleBetween(String value1, String value2) {
            addCriterion("job_title between", value1, value2, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotBetween(String value1, String value2) {
            addCriterion("job_title not between", value1, value2, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobGradeIsNull() {
            addCriterion("job_grade is null");
            return (Criteria) this;
        }

        public Criteria andJobGradeIsNotNull() {
            addCriterion("job_grade is not null");
            return (Criteria) this;
        }

        public Criteria andJobGradeEqualTo(Integer value) {
            addCriterion("job_grade =", value, "jobGrade");
            return (Criteria) this;
        }

        public Criteria andJobGradeNotEqualTo(Integer value) {
            addCriterion("job_grade <>", value, "jobGrade");
            return (Criteria) this;
        }

        public Criteria andJobGradeGreaterThan(Integer value) {
            addCriterion("job_grade >", value, "jobGrade");
            return (Criteria) this;
        }

        public Criteria andJobGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_grade >=", value, "jobGrade");
            return (Criteria) this;
        }

        public Criteria andJobGradeLessThan(Integer value) {
            addCriterion("job_grade <", value, "jobGrade");
            return (Criteria) this;
        }

        public Criteria andJobGradeLessThanOrEqualTo(Integer value) {
            addCriterion("job_grade <=", value, "jobGrade");
            return (Criteria) this;
        }

        public Criteria andJobGradeIn(List<Integer> values) {
            addCriterion("job_grade in", values, "jobGrade");
            return (Criteria) this;
        }

        public Criteria andJobGradeNotIn(List<Integer> values) {
            addCriterion("job_grade not in", values, "jobGrade");
            return (Criteria) this;
        }

        public Criteria andJobGradeBetween(Integer value1, Integer value2) {
            addCriterion("job_grade between", value1, value2, "jobGrade");
            return (Criteria) this;
        }

        public Criteria andJobGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("job_grade not between", value1, value2, "jobGrade");
            return (Criteria) this;
        }

        public Criteria andJobTypeIsNull() {
            addCriterion("job_type is null");
            return (Criteria) this;
        }

        public Criteria andJobTypeIsNotNull() {
            addCriterion("job_type is not null");
            return (Criteria) this;
        }

        public Criteria andJobTypeEqualTo(Integer value) {
            addCriterion("job_type =", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotEqualTo(Integer value) {
            addCriterion("job_type <>", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeGreaterThan(Integer value) {
            addCriterion("job_type >", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_type >=", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeLessThan(Integer value) {
            addCriterion("job_type <", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeLessThanOrEqualTo(Integer value) {
            addCriterion("job_type <=", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeIn(List<Integer> values) {
            addCriterion("job_type in", values, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotIn(List<Integer> values) {
            addCriterion("job_type not in", values, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeBetween(Integer value1, Integer value2) {
            addCriterion("job_type between", value1, value2, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("job_type not between", value1, value2, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobKeyWordIsNull() {
            addCriterion("job_key_word is null");
            return (Criteria) this;
        }

        public Criteria andJobKeyWordIsNotNull() {
            addCriterion("job_key_word is not null");
            return (Criteria) this;
        }

        public Criteria andJobKeyWordEqualTo(String value) {
            addCriterion("job_key_word =", value, "jobKeyWord");
            return (Criteria) this;
        }

        public Criteria andJobKeyWordNotEqualTo(String value) {
            addCriterion("job_key_word <>", value, "jobKeyWord");
            return (Criteria) this;
        }

        public Criteria andJobKeyWordGreaterThan(String value) {
            addCriterion("job_key_word >", value, "jobKeyWord");
            return (Criteria) this;
        }

        public Criteria andJobKeyWordGreaterThanOrEqualTo(String value) {
            addCriterion("job_key_word >=", value, "jobKeyWord");
            return (Criteria) this;
        }

        public Criteria andJobKeyWordLessThan(String value) {
            addCriterion("job_key_word <", value, "jobKeyWord");
            return (Criteria) this;
        }

        public Criteria andJobKeyWordLessThanOrEqualTo(String value) {
            addCriterion("job_key_word <=", value, "jobKeyWord");
            return (Criteria) this;
        }

        public Criteria andJobKeyWordLike(String value) {
            addCriterion("job_key_word like", value, "jobKeyWord");
            return (Criteria) this;
        }

        public Criteria andJobKeyWordNotLike(String value) {
            addCriterion("job_key_word not like", value, "jobKeyWord");
            return (Criteria) this;
        }

        public Criteria andJobKeyWordIn(List<String> values) {
            addCriterion("job_key_word in", values, "jobKeyWord");
            return (Criteria) this;
        }

        public Criteria andJobKeyWordNotIn(List<String> values) {
            addCriterion("job_key_word not in", values, "jobKeyWord");
            return (Criteria) this;
        }

        public Criteria andJobKeyWordBetween(String value1, String value2) {
            addCriterion("job_key_word between", value1, value2, "jobKeyWord");
            return (Criteria) this;
        }

        public Criteria andJobKeyWordNotBetween(String value1, String value2) {
            addCriterion("job_key_word not between", value1, value2, "jobKeyWord");
            return (Criteria) this;
        }

        public Criteria andScheduleIsNull() {
            addCriterion("schedule is null");
            return (Criteria) this;
        }

        public Criteria andScheduleIsNotNull() {
            addCriterion("schedule is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleEqualTo(Integer value) {
            addCriterion("schedule =", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotEqualTo(Integer value) {
            addCriterion("schedule <>", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleGreaterThan(Integer value) {
            addCriterion("schedule >", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleGreaterThanOrEqualTo(Integer value) {
            addCriterion("schedule >=", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleLessThan(Integer value) {
            addCriterion("schedule <", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleLessThanOrEqualTo(Integer value) {
            addCriterion("schedule <=", value, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleIn(List<Integer> values) {
            addCriterion("schedule in", values, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotIn(List<Integer> values) {
            addCriterion("schedule not in", values, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleBetween(Integer value1, Integer value2) {
            addCriterion("schedule between", value1, value2, "schedule");
            return (Criteria) this;
        }

        public Criteria andScheduleNotBetween(Integer value1, Integer value2) {
            addCriterion("schedule not between", value1, value2, "schedule");
            return (Criteria) this;
        }

        public Criteria andJobAroundTimeIsNull() {
            addCriterion("job_around_time is null");
            return (Criteria) this;
        }

        public Criteria andJobAroundTimeIsNotNull() {
            addCriterion("job_around_time is not null");
            return (Criteria) this;
        }

        public Criteria andJobAroundTimeEqualTo(Integer value) {
            addCriterion("job_around_time =", value, "jobAroundTime");
            return (Criteria) this;
        }

        public Criteria andJobAroundTimeNotEqualTo(Integer value) {
            addCriterion("job_around_time <>", value, "jobAroundTime");
            return (Criteria) this;
        }

        public Criteria andJobAroundTimeGreaterThan(Integer value) {
            addCriterion("job_around_time >", value, "jobAroundTime");
            return (Criteria) this;
        }

        public Criteria andJobAroundTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_around_time >=", value, "jobAroundTime");
            return (Criteria) this;
        }

        public Criteria andJobAroundTimeLessThan(Integer value) {
            addCriterion("job_around_time <", value, "jobAroundTime");
            return (Criteria) this;
        }

        public Criteria andJobAroundTimeLessThanOrEqualTo(Integer value) {
            addCriterion("job_around_time <=", value, "jobAroundTime");
            return (Criteria) this;
        }

        public Criteria andJobAroundTimeIn(List<Integer> values) {
            addCriterion("job_around_time in", values, "jobAroundTime");
            return (Criteria) this;
        }

        public Criteria andJobAroundTimeNotIn(List<Integer> values) {
            addCriterion("job_around_time not in", values, "jobAroundTime");
            return (Criteria) this;
        }

        public Criteria andJobAroundTimeBetween(Integer value1, Integer value2) {
            addCriterion("job_around_time between", value1, value2, "jobAroundTime");
            return (Criteria) this;
        }

        public Criteria andJobAroundTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("job_around_time not between", value1, value2, "jobAroundTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeIsNull() {
            addCriterion("job_start_time is null");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeIsNotNull() {
            addCriterion("job_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeEqualTo(String value) {
            addCriterion("job_start_time =", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeNotEqualTo(String value) {
            addCriterion("job_start_time <>", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeGreaterThan(String value) {
            addCriterion("job_start_time >", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("job_start_time >=", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeLessThan(String value) {
            addCriterion("job_start_time <", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeLessThanOrEqualTo(String value) {
            addCriterion("job_start_time <=", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeLike(String value) {
            addCriterion("job_start_time like", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeNotLike(String value) {
            addCriterion("job_start_time not like", value, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeIn(List<String> values) {
            addCriterion("job_start_time in", values, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeNotIn(List<String> values) {
            addCriterion("job_start_time not in", values, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeBetween(String value1, String value2) {
            addCriterion("job_start_time between", value1, value2, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobStartTimeNotBetween(String value1, String value2) {
            addCriterion("job_start_time not between", value1, value2, "jobStartTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeIsNull() {
            addCriterion("job_end_time is null");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeIsNotNull() {
            addCriterion("job_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeEqualTo(String value) {
            addCriterion("job_end_time =", value, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeNotEqualTo(String value) {
            addCriterion("job_end_time <>", value, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeGreaterThan(String value) {
            addCriterion("job_end_time >", value, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("job_end_time >=", value, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeLessThan(String value) {
            addCriterion("job_end_time <", value, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeLessThanOrEqualTo(String value) {
            addCriterion("job_end_time <=", value, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeLike(String value) {
            addCriterion("job_end_time like", value, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeNotLike(String value) {
            addCriterion("job_end_time not like", value, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeIn(List<String> values) {
            addCriterion("job_end_time in", values, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeNotIn(List<String> values) {
            addCriterion("job_end_time not in", values, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeBetween(String value1, String value2) {
            addCriterion("job_end_time between", value1, value2, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobEndTimeNotBetween(String value1, String value2) {
            addCriterion("job_end_time not between", value1, value2, "jobEndTime");
            return (Criteria) this;
        }

        public Criteria andJobFileNumberNameIsNull() {
            addCriterion("job_file_number_name is null");
            return (Criteria) this;
        }

        public Criteria andJobFileNumberNameIsNotNull() {
            addCriterion("job_file_number_name is not null");
            return (Criteria) this;
        }

        public Criteria andJobFileNumberNameEqualTo(String value) {
            addCriterion("job_file_number_name =", value, "jobFileNumberName");
            return (Criteria) this;
        }

        public Criteria andJobFileNumberNameNotEqualTo(String value) {
            addCriterion("job_file_number_name <>", value, "jobFileNumberName");
            return (Criteria) this;
        }

        public Criteria andJobFileNumberNameGreaterThan(String value) {
            addCriterion("job_file_number_name >", value, "jobFileNumberName");
            return (Criteria) this;
        }

        public Criteria andJobFileNumberNameGreaterThanOrEqualTo(String value) {
            addCriterion("job_file_number_name >=", value, "jobFileNumberName");
            return (Criteria) this;
        }

        public Criteria andJobFileNumberNameLessThan(String value) {
            addCriterion("job_file_number_name <", value, "jobFileNumberName");
            return (Criteria) this;
        }

        public Criteria andJobFileNumberNameLessThanOrEqualTo(String value) {
            addCriterion("job_file_number_name <=", value, "jobFileNumberName");
            return (Criteria) this;
        }

        public Criteria andJobFileNumberNameLike(String value) {
            addCriterion("job_file_number_name like", value, "jobFileNumberName");
            return (Criteria) this;
        }

        public Criteria andJobFileNumberNameNotLike(String value) {
            addCriterion("job_file_number_name not like", value, "jobFileNumberName");
            return (Criteria) this;
        }

        public Criteria andJobFileNumberNameIn(List<String> values) {
            addCriterion("job_file_number_name in", values, "jobFileNumberName");
            return (Criteria) this;
        }

        public Criteria andJobFileNumberNameNotIn(List<String> values) {
            addCriterion("job_file_number_name not in", values, "jobFileNumberName");
            return (Criteria) this;
        }

        public Criteria andJobFileNumberNameBetween(String value1, String value2) {
            addCriterion("job_file_number_name between", value1, value2, "jobFileNumberName");
            return (Criteria) this;
        }

        public Criteria andJobFileNumberNameNotBetween(String value1, String value2) {
            addCriterion("job_file_number_name not between", value1, value2, "jobFileNumberName");
            return (Criteria) this;
        }

        public Criteria andJobFileRealNameIsNull() {
            addCriterion("job_file_real_name is null");
            return (Criteria) this;
        }

        public Criteria andJobFileRealNameIsNotNull() {
            addCriterion("job_file_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andJobFileRealNameEqualTo(String value) {
            addCriterion("job_file_real_name =", value, "jobFileRealName");
            return (Criteria) this;
        }

        public Criteria andJobFileRealNameNotEqualTo(String value) {
            addCriterion("job_file_real_name <>", value, "jobFileRealName");
            return (Criteria) this;
        }

        public Criteria andJobFileRealNameGreaterThan(String value) {
            addCriterion("job_file_real_name >", value, "jobFileRealName");
            return (Criteria) this;
        }

        public Criteria andJobFileRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("job_file_real_name >=", value, "jobFileRealName");
            return (Criteria) this;
        }

        public Criteria andJobFileRealNameLessThan(String value) {
            addCriterion("job_file_real_name <", value, "jobFileRealName");
            return (Criteria) this;
        }

        public Criteria andJobFileRealNameLessThanOrEqualTo(String value) {
            addCriterion("job_file_real_name <=", value, "jobFileRealName");
            return (Criteria) this;
        }

        public Criteria andJobFileRealNameLike(String value) {
            addCriterion("job_file_real_name like", value, "jobFileRealName");
            return (Criteria) this;
        }

        public Criteria andJobFileRealNameNotLike(String value) {
            addCriterion("job_file_real_name not like", value, "jobFileRealName");
            return (Criteria) this;
        }

        public Criteria andJobFileRealNameIn(List<String> values) {
            addCriterion("job_file_real_name in", values, "jobFileRealName");
            return (Criteria) this;
        }

        public Criteria andJobFileRealNameNotIn(List<String> values) {
            addCriterion("job_file_real_name not in", values, "jobFileRealName");
            return (Criteria) this;
        }

        public Criteria andJobFileRealNameBetween(String value1, String value2) {
            addCriterion("job_file_real_name between", value1, value2, "jobFileRealName");
            return (Criteria) this;
        }

        public Criteria andJobFileRealNameNotBetween(String value1, String value2) {
            addCriterion("job_file_real_name not between", value1, value2, "jobFileRealName");
            return (Criteria) this;
        }

        public Criteria andJobFileTypeIsNull() {
            addCriterion("job_file_type is null");
            return (Criteria) this;
        }

        public Criteria andJobFileTypeIsNotNull() {
            addCriterion("job_file_type is not null");
            return (Criteria) this;
        }

        public Criteria andJobFileTypeEqualTo(String value) {
            addCriterion("job_file_type =", value, "jobFileType");
            return (Criteria) this;
        }

        public Criteria andJobFileTypeNotEqualTo(String value) {
            addCriterion("job_file_type <>", value, "jobFileType");
            return (Criteria) this;
        }

        public Criteria andJobFileTypeGreaterThan(String value) {
            addCriterion("job_file_type >", value, "jobFileType");
            return (Criteria) this;
        }

        public Criteria andJobFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("job_file_type >=", value, "jobFileType");
            return (Criteria) this;
        }

        public Criteria andJobFileTypeLessThan(String value) {
            addCriterion("job_file_type <", value, "jobFileType");
            return (Criteria) this;
        }

        public Criteria andJobFileTypeLessThanOrEqualTo(String value) {
            addCriterion("job_file_type <=", value, "jobFileType");
            return (Criteria) this;
        }

        public Criteria andJobFileTypeLike(String value) {
            addCriterion("job_file_type like", value, "jobFileType");
            return (Criteria) this;
        }

        public Criteria andJobFileTypeNotLike(String value) {
            addCriterion("job_file_type not like", value, "jobFileType");
            return (Criteria) this;
        }

        public Criteria andJobFileTypeIn(List<String> values) {
            addCriterion("job_file_type in", values, "jobFileType");
            return (Criteria) this;
        }

        public Criteria andJobFileTypeNotIn(List<String> values) {
            addCriterion("job_file_type not in", values, "jobFileType");
            return (Criteria) this;
        }

        public Criteria andJobFileTypeBetween(String value1, String value2) {
            addCriterion("job_file_type between", value1, value2, "jobFileType");
            return (Criteria) this;
        }

        public Criteria andJobFileTypeNotBetween(String value1, String value2) {
            addCriterion("job_file_type not between", value1, value2, "jobFileType");
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