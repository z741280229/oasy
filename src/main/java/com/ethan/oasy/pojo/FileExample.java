package com.ethan.oasy.pojo;

import java.util.ArrayList;
import java.util.List;

public class FileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FileExample() {
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

        public Criteria andFileIdIsNull() {
            addCriterion("file_id is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("file_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(String value) {
            addCriterion("file_id =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(String value) {
            addCriterion("file_id <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(String value) {
            addCriterion("file_id >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("file_id >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(String value) {
            addCriterion("file_id <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(String value) {
            addCriterion("file_id <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLike(String value) {
            addCriterion("file_id like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotLike(String value) {
            addCriterion("file_id not like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<String> values) {
            addCriterion("file_id in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<String> values) {
            addCriterion("file_id not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(String value1, String value2) {
            addCriterion("file_id between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(String value1, String value2) {
            addCriterion("file_id not between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileNumIsNull() {
            addCriterion("file_num is null");
            return (Criteria) this;
        }

        public Criteria andFileNumIsNotNull() {
            addCriterion("file_num is not null");
            return (Criteria) this;
        }

        public Criteria andFileNumEqualTo(String value) {
            addCriterion("file_num =", value, "fileNum");
            return (Criteria) this;
        }

        public Criteria andFileNumNotEqualTo(String value) {
            addCriterion("file_num <>", value, "fileNum");
            return (Criteria) this;
        }

        public Criteria andFileNumGreaterThan(String value) {
            addCriterion("file_num >", value, "fileNum");
            return (Criteria) this;
        }

        public Criteria andFileNumGreaterThanOrEqualTo(String value) {
            addCriterion("file_num >=", value, "fileNum");
            return (Criteria) this;
        }

        public Criteria andFileNumLessThan(String value) {
            addCriterion("file_num <", value, "fileNum");
            return (Criteria) this;
        }

        public Criteria andFileNumLessThanOrEqualTo(String value) {
            addCriterion("file_num <=", value, "fileNum");
            return (Criteria) this;
        }

        public Criteria andFileNumLike(String value) {
            addCriterion("file_num like", value, "fileNum");
            return (Criteria) this;
        }

        public Criteria andFileNumNotLike(String value) {
            addCriterion("file_num not like", value, "fileNum");
            return (Criteria) this;
        }

        public Criteria andFileNumIn(List<String> values) {
            addCriterion("file_num in", values, "fileNum");
            return (Criteria) this;
        }

        public Criteria andFileNumNotIn(List<String> values) {
            addCriterion("file_num not in", values, "fileNum");
            return (Criteria) this;
        }

        public Criteria andFileNumBetween(String value1, String value2) {
            addCriterion("file_num between", value1, value2, "fileNum");
            return (Criteria) this;
        }

        public Criteria andFileNumNotBetween(String value1, String value2) {
            addCriterion("file_num not between", value1, value2, "fileNum");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileParentIsNull() {
            addCriterion("file_parent is null");
            return (Criteria) this;
        }

        public Criteria andFileParentIsNotNull() {
            addCriterion("file_parent is not null");
            return (Criteria) this;
        }

        public Criteria andFileParentEqualTo(Integer value) {
            addCriterion("file_parent =", value, "fileParent");
            return (Criteria) this;
        }

        public Criteria andFileParentNotEqualTo(Integer value) {
            addCriterion("file_parent <>", value, "fileParent");
            return (Criteria) this;
        }

        public Criteria andFileParentGreaterThan(Integer value) {
            addCriterion("file_parent >", value, "fileParent");
            return (Criteria) this;
        }

        public Criteria andFileParentGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_parent >=", value, "fileParent");
            return (Criteria) this;
        }

        public Criteria andFileParentLessThan(Integer value) {
            addCriterion("file_parent <", value, "fileParent");
            return (Criteria) this;
        }

        public Criteria andFileParentLessThanOrEqualTo(Integer value) {
            addCriterion("file_parent <=", value, "fileParent");
            return (Criteria) this;
        }

        public Criteria andFileParentIn(List<Integer> values) {
            addCriterion("file_parent in", values, "fileParent");
            return (Criteria) this;
        }

        public Criteria andFileParentNotIn(List<Integer> values) {
            addCriterion("file_parent not in", values, "fileParent");
            return (Criteria) this;
        }

        public Criteria andFileParentBetween(Integer value1, Integer value2) {
            addCriterion("file_parent between", value1, value2, "fileParent");
            return (Criteria) this;
        }

        public Criteria andFileParentNotBetween(Integer value1, Integer value2) {
            addCriterion("file_parent not between", value1, value2, "fileParent");
            return (Criteria) this;
        }

        public Criteria andFileGradeIsNull() {
            addCriterion("file_grade is null");
            return (Criteria) this;
        }

        public Criteria andFileGradeIsNotNull() {
            addCriterion("file_grade is not null");
            return (Criteria) this;
        }

        public Criteria andFileGradeEqualTo(Integer value) {
            addCriterion("file_grade =", value, "fileGrade");
            return (Criteria) this;
        }

        public Criteria andFileGradeNotEqualTo(Integer value) {
            addCriterion("file_grade <>", value, "fileGrade");
            return (Criteria) this;
        }

        public Criteria andFileGradeGreaterThan(Integer value) {
            addCriterion("file_grade >", value, "fileGrade");
            return (Criteria) this;
        }

        public Criteria andFileGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_grade >=", value, "fileGrade");
            return (Criteria) this;
        }

        public Criteria andFileGradeLessThan(Integer value) {
            addCriterion("file_grade <", value, "fileGrade");
            return (Criteria) this;
        }

        public Criteria andFileGradeLessThanOrEqualTo(Integer value) {
            addCriterion("file_grade <=", value, "fileGrade");
            return (Criteria) this;
        }

        public Criteria andFileGradeIn(List<Integer> values) {
            addCriterion("file_grade in", values, "fileGrade");
            return (Criteria) this;
        }

        public Criteria andFileGradeNotIn(List<Integer> values) {
            addCriterion("file_grade not in", values, "fileGrade");
            return (Criteria) this;
        }

        public Criteria andFileGradeBetween(Integer value1, Integer value2) {
            addCriterion("file_grade between", value1, value2, "fileGrade");
            return (Criteria) this;
        }

        public Criteria andFileGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("file_grade not between", value1, value2, "fileGrade");
            return (Criteria) this;
        }

        public Criteria andFileDeadlineIsNull() {
            addCriterion("file_deadline is null");
            return (Criteria) this;
        }

        public Criteria andFileDeadlineIsNotNull() {
            addCriterion("file_deadline is not null");
            return (Criteria) this;
        }

        public Criteria andFileDeadlineEqualTo(Integer value) {
            addCriterion("file_deadline =", value, "fileDeadline");
            return (Criteria) this;
        }

        public Criteria andFileDeadlineNotEqualTo(Integer value) {
            addCriterion("file_deadline <>", value, "fileDeadline");
            return (Criteria) this;
        }

        public Criteria andFileDeadlineGreaterThan(Integer value) {
            addCriterion("file_deadline >", value, "fileDeadline");
            return (Criteria) this;
        }

        public Criteria andFileDeadlineGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_deadline >=", value, "fileDeadline");
            return (Criteria) this;
        }

        public Criteria andFileDeadlineLessThan(Integer value) {
            addCriterion("file_deadline <", value, "fileDeadline");
            return (Criteria) this;
        }

        public Criteria andFileDeadlineLessThanOrEqualTo(Integer value) {
            addCriterion("file_deadline <=", value, "fileDeadline");
            return (Criteria) this;
        }

        public Criteria andFileDeadlineIn(List<Integer> values) {
            addCriterion("file_deadline in", values, "fileDeadline");
            return (Criteria) this;
        }

        public Criteria andFileDeadlineNotIn(List<Integer> values) {
            addCriterion("file_deadline not in", values, "fileDeadline");
            return (Criteria) this;
        }

        public Criteria andFileDeadlineBetween(Integer value1, Integer value2) {
            addCriterion("file_deadline between", value1, value2, "fileDeadline");
            return (Criteria) this;
        }

        public Criteria andFileDeadlineNotBetween(Integer value1, Integer value2) {
            addCriterion("file_deadline not between", value1, value2, "fileDeadline");
            return (Criteria) this;
        }

        public Criteria andFileSaveWayIsNull() {
            addCriterion("file_save_way is null");
            return (Criteria) this;
        }

        public Criteria andFileSaveWayIsNotNull() {
            addCriterion("file_save_way is not null");
            return (Criteria) this;
        }

        public Criteria andFileSaveWayEqualTo(Integer value) {
            addCriterion("file_save_way =", value, "fileSaveWay");
            return (Criteria) this;
        }

        public Criteria andFileSaveWayNotEqualTo(Integer value) {
            addCriterion("file_save_way <>", value, "fileSaveWay");
            return (Criteria) this;
        }

        public Criteria andFileSaveWayGreaterThan(Integer value) {
            addCriterion("file_save_way >", value, "fileSaveWay");
            return (Criteria) this;
        }

        public Criteria andFileSaveWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_save_way >=", value, "fileSaveWay");
            return (Criteria) this;
        }

        public Criteria andFileSaveWayLessThan(Integer value) {
            addCriterion("file_save_way <", value, "fileSaveWay");
            return (Criteria) this;
        }

        public Criteria andFileSaveWayLessThanOrEqualTo(Integer value) {
            addCriterion("file_save_way <=", value, "fileSaveWay");
            return (Criteria) this;
        }

        public Criteria andFileSaveWayIn(List<Integer> values) {
            addCriterion("file_save_way in", values, "fileSaveWay");
            return (Criteria) this;
        }

        public Criteria andFileSaveWayNotIn(List<Integer> values) {
            addCriterion("file_save_way not in", values, "fileSaveWay");
            return (Criteria) this;
        }

        public Criteria andFileSaveWayBetween(Integer value1, Integer value2) {
            addCriterion("file_save_way between", value1, value2, "fileSaveWay");
            return (Criteria) this;
        }

        public Criteria andFileSaveWayNotBetween(Integer value1, Integer value2) {
            addCriterion("file_save_way not between", value1, value2, "fileSaveWay");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonNameIsNull() {
            addCriterion("file_save_person_name is null");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonNameIsNotNull() {
            addCriterion("file_save_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonNameEqualTo(String value) {
            addCriterion("file_save_person_name =", value, "fileSavePersonName");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonNameNotEqualTo(String value) {
            addCriterion("file_save_person_name <>", value, "fileSavePersonName");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonNameGreaterThan(String value) {
            addCriterion("file_save_person_name >", value, "fileSavePersonName");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_save_person_name >=", value, "fileSavePersonName");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonNameLessThan(String value) {
            addCriterion("file_save_person_name <", value, "fileSavePersonName");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonNameLessThanOrEqualTo(String value) {
            addCriterion("file_save_person_name <=", value, "fileSavePersonName");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonNameLike(String value) {
            addCriterion("file_save_person_name like", value, "fileSavePersonName");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonNameNotLike(String value) {
            addCriterion("file_save_person_name not like", value, "fileSavePersonName");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonNameIn(List<String> values) {
            addCriterion("file_save_person_name in", values, "fileSavePersonName");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonNameNotIn(List<String> values) {
            addCriterion("file_save_person_name not in", values, "fileSavePersonName");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonNameBetween(String value1, String value2) {
            addCriterion("file_save_person_name between", value1, value2, "fileSavePersonName");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonNameNotBetween(String value1, String value2) {
            addCriterion("file_save_person_name not between", value1, value2, "fileSavePersonName");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonIsNull() {
            addCriterion("file_save_person is null");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonIsNotNull() {
            addCriterion("file_save_person is not null");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonEqualTo(String value) {
            addCriterion("file_save_person =", value, "fileSavePerson");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonNotEqualTo(String value) {
            addCriterion("file_save_person <>", value, "fileSavePerson");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonGreaterThan(String value) {
            addCriterion("file_save_person >", value, "fileSavePerson");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonGreaterThanOrEqualTo(String value) {
            addCriterion("file_save_person >=", value, "fileSavePerson");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonLessThan(String value) {
            addCriterion("file_save_person <", value, "fileSavePerson");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonLessThanOrEqualTo(String value) {
            addCriterion("file_save_person <=", value, "fileSavePerson");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonLike(String value) {
            addCriterion("file_save_person like", value, "fileSavePerson");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonNotLike(String value) {
            addCriterion("file_save_person not like", value, "fileSavePerson");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonIn(List<String> values) {
            addCriterion("file_save_person in", values, "fileSavePerson");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonNotIn(List<String> values) {
            addCriterion("file_save_person not in", values, "fileSavePerson");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonBetween(String value1, String value2) {
            addCriterion("file_save_person between", value1, value2, "fileSavePerson");
            return (Criteria) this;
        }

        public Criteria andFileSavePersonNotBetween(String value1, String value2) {
            addCriterion("file_save_person not between", value1, value2, "fileSavePerson");
            return (Criteria) this;
        }

        public Criteria andFileSaveDateIsNull() {
            addCriterion("file_save_date is null");
            return (Criteria) this;
        }

        public Criteria andFileSaveDateIsNotNull() {
            addCriterion("file_save_date is not null");
            return (Criteria) this;
        }

        public Criteria andFileSaveDateEqualTo(String value) {
            addCriterion("file_save_date =", value, "fileSaveDate");
            return (Criteria) this;
        }

        public Criteria andFileSaveDateNotEqualTo(String value) {
            addCriterion("file_save_date <>", value, "fileSaveDate");
            return (Criteria) this;
        }

        public Criteria andFileSaveDateGreaterThan(String value) {
            addCriterion("file_save_date >", value, "fileSaveDate");
            return (Criteria) this;
        }

        public Criteria andFileSaveDateGreaterThanOrEqualTo(String value) {
            addCriterion("file_save_date >=", value, "fileSaveDate");
            return (Criteria) this;
        }

        public Criteria andFileSaveDateLessThan(String value) {
            addCriterion("file_save_date <", value, "fileSaveDate");
            return (Criteria) this;
        }

        public Criteria andFileSaveDateLessThanOrEqualTo(String value) {
            addCriterion("file_save_date <=", value, "fileSaveDate");
            return (Criteria) this;
        }

        public Criteria andFileSaveDateLike(String value) {
            addCriterion("file_save_date like", value, "fileSaveDate");
            return (Criteria) this;
        }

        public Criteria andFileSaveDateNotLike(String value) {
            addCriterion("file_save_date not like", value, "fileSaveDate");
            return (Criteria) this;
        }

        public Criteria andFileSaveDateIn(List<String> values) {
            addCriterion("file_save_date in", values, "fileSaveDate");
            return (Criteria) this;
        }

        public Criteria andFileSaveDateNotIn(List<String> values) {
            addCriterion("file_save_date not in", values, "fileSaveDate");
            return (Criteria) this;
        }

        public Criteria andFileSaveDateBetween(String value1, String value2) {
            addCriterion("file_save_date between", value1, value2, "fileSaveDate");
            return (Criteria) this;
        }

        public Criteria andFileSaveDateNotBetween(String value1, String value2) {
            addCriterion("file_save_date not between", value1, value2, "fileSaveDate");
            return (Criteria) this;
        }

        public Criteria andFileStatusIsNull() {
            addCriterion("file_status is null");
            return (Criteria) this;
        }

        public Criteria andFileStatusIsNotNull() {
            addCriterion("file_status is not null");
            return (Criteria) this;
        }

        public Criteria andFileStatusEqualTo(Integer value) {
            addCriterion("file_status =", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusNotEqualTo(Integer value) {
            addCriterion("file_status <>", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusGreaterThan(Integer value) {
            addCriterion("file_status >", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_status >=", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusLessThan(Integer value) {
            addCriterion("file_status <", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusLessThanOrEqualTo(Integer value) {
            addCriterion("file_status <=", value, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusIn(List<Integer> values) {
            addCriterion("file_status in", values, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusNotIn(List<Integer> values) {
            addCriterion("file_status not in", values, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusBetween(Integer value1, Integer value2) {
            addCriterion("file_status between", value1, value2, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("file_status not between", value1, value2, "fileStatus");
            return (Criteria) this;
        }

        public Criteria andFileBelongNameIsNull() {
            addCriterion("file_belong_name is null");
            return (Criteria) this;
        }

        public Criteria andFileBelongNameIsNotNull() {
            addCriterion("file_belong_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileBelongNameEqualTo(String value) {
            addCriterion("file_belong_name =", value, "fileBelongName");
            return (Criteria) this;
        }

        public Criteria andFileBelongNameNotEqualTo(String value) {
            addCriterion("file_belong_name <>", value, "fileBelongName");
            return (Criteria) this;
        }

        public Criteria andFileBelongNameGreaterThan(String value) {
            addCriterion("file_belong_name >", value, "fileBelongName");
            return (Criteria) this;
        }

        public Criteria andFileBelongNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_belong_name >=", value, "fileBelongName");
            return (Criteria) this;
        }

        public Criteria andFileBelongNameLessThan(String value) {
            addCriterion("file_belong_name <", value, "fileBelongName");
            return (Criteria) this;
        }

        public Criteria andFileBelongNameLessThanOrEqualTo(String value) {
            addCriterion("file_belong_name <=", value, "fileBelongName");
            return (Criteria) this;
        }

        public Criteria andFileBelongNameLike(String value) {
            addCriterion("file_belong_name like", value, "fileBelongName");
            return (Criteria) this;
        }

        public Criteria andFileBelongNameNotLike(String value) {
            addCriterion("file_belong_name not like", value, "fileBelongName");
            return (Criteria) this;
        }

        public Criteria andFileBelongNameIn(List<String> values) {
            addCriterion("file_belong_name in", values, "fileBelongName");
            return (Criteria) this;
        }

        public Criteria andFileBelongNameNotIn(List<String> values) {
            addCriterion("file_belong_name not in", values, "fileBelongName");
            return (Criteria) this;
        }

        public Criteria andFileBelongNameBetween(String value1, String value2) {
            addCriterion("file_belong_name between", value1, value2, "fileBelongName");
            return (Criteria) this;
        }

        public Criteria andFileBelongNameNotBetween(String value1, String value2) {
            addCriterion("file_belong_name not between", value1, value2, "fileBelongName");
            return (Criteria) this;
        }

        public Criteria andFileBelongIsNull() {
            addCriterion("file_belong is null");
            return (Criteria) this;
        }

        public Criteria andFileBelongIsNotNull() {
            addCriterion("file_belong is not null");
            return (Criteria) this;
        }

        public Criteria andFileBelongEqualTo(Integer value) {
            addCriterion("file_belong =", value, "fileBelong");
            return (Criteria) this;
        }

        public Criteria andFileBelongNotEqualTo(Integer value) {
            addCriterion("file_belong <>", value, "fileBelong");
            return (Criteria) this;
        }

        public Criteria andFileBelongGreaterThan(Integer value) {
            addCriterion("file_belong >", value, "fileBelong");
            return (Criteria) this;
        }

        public Criteria andFileBelongGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_belong >=", value, "fileBelong");
            return (Criteria) this;
        }

        public Criteria andFileBelongLessThan(Integer value) {
            addCriterion("file_belong <", value, "fileBelong");
            return (Criteria) this;
        }

        public Criteria andFileBelongLessThanOrEqualTo(Integer value) {
            addCriterion("file_belong <=", value, "fileBelong");
            return (Criteria) this;
        }

        public Criteria andFileBelongIn(List<Integer> values) {
            addCriterion("file_belong in", values, "fileBelong");
            return (Criteria) this;
        }

        public Criteria andFileBelongNotIn(List<Integer> values) {
            addCriterion("file_belong not in", values, "fileBelong");
            return (Criteria) this;
        }

        public Criteria andFileBelongBetween(Integer value1, Integer value2) {
            addCriterion("file_belong between", value1, value2, "fileBelong");
            return (Criteria) this;
        }

        public Criteria andFileBelongNotBetween(Integer value1, Integer value2) {
            addCriterion("file_belong not between", value1, value2, "fileBelong");
            return (Criteria) this;
        }

        public Criteria andFileSavePlaceIsNull() {
            addCriterion("file_save_place is null");
            return (Criteria) this;
        }

        public Criteria andFileSavePlaceIsNotNull() {
            addCriterion("file_save_place is not null");
            return (Criteria) this;
        }

        public Criteria andFileSavePlaceEqualTo(String value) {
            addCriterion("file_save_place =", value, "fileSavePlace");
            return (Criteria) this;
        }

        public Criteria andFileSavePlaceNotEqualTo(String value) {
            addCriterion("file_save_place <>", value, "fileSavePlace");
            return (Criteria) this;
        }

        public Criteria andFileSavePlaceGreaterThan(String value) {
            addCriterion("file_save_place >", value, "fileSavePlace");
            return (Criteria) this;
        }

        public Criteria andFileSavePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("file_save_place >=", value, "fileSavePlace");
            return (Criteria) this;
        }

        public Criteria andFileSavePlaceLessThan(String value) {
            addCriterion("file_save_place <", value, "fileSavePlace");
            return (Criteria) this;
        }

        public Criteria andFileSavePlaceLessThanOrEqualTo(String value) {
            addCriterion("file_save_place <=", value, "fileSavePlace");
            return (Criteria) this;
        }

        public Criteria andFileSavePlaceLike(String value) {
            addCriterion("file_save_place like", value, "fileSavePlace");
            return (Criteria) this;
        }

        public Criteria andFileSavePlaceNotLike(String value) {
            addCriterion("file_save_place not like", value, "fileSavePlace");
            return (Criteria) this;
        }

        public Criteria andFileSavePlaceIn(List<String> values) {
            addCriterion("file_save_place in", values, "fileSavePlace");
            return (Criteria) this;
        }

        public Criteria andFileSavePlaceNotIn(List<String> values) {
            addCriterion("file_save_place not in", values, "fileSavePlace");
            return (Criteria) this;
        }

        public Criteria andFileSavePlaceBetween(String value1, String value2) {
            addCriterion("file_save_place between", value1, value2, "fileSavePlace");
            return (Criteria) this;
        }

        public Criteria andFileSavePlaceNotBetween(String value1, String value2) {
            addCriterion("file_save_place not between", value1, value2, "fileSavePlace");
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