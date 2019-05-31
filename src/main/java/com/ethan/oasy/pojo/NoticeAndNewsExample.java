package com.ethan.oasy.pojo;

import java.util.ArrayList;
import java.util.List;

public class NoticeAndNewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticeAndNewsExample() {
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

        public Criteria andNIdIsNull() {
            addCriterion("n_id is null");
            return (Criteria) this;
        }

        public Criteria andNIdIsNotNull() {
            addCriterion("n_id is not null");
            return (Criteria) this;
        }

        public Criteria andNIdEqualTo(String value) {
            addCriterion("n_id =", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotEqualTo(String value) {
            addCriterion("n_id <>", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThan(String value) {
            addCriterion("n_id >", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdGreaterThanOrEqualTo(String value) {
            addCriterion("n_id >=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThan(String value) {
            addCriterion("n_id <", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLessThanOrEqualTo(String value) {
            addCriterion("n_id <=", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdLike(String value) {
            addCriterion("n_id like", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotLike(String value) {
            addCriterion("n_id not like", value, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdIn(List<String> values) {
            addCriterion("n_id in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotIn(List<String> values) {
            addCriterion("n_id not in", values, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdBetween(String value1, String value2) {
            addCriterion("n_id between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andNIdNotBetween(String value1, String value2) {
            addCriterion("n_id not between", value1, value2, "nId");
            return (Criteria) this;
        }

        public Criteria andNTitleIsNull() {
            addCriterion("n_title is null");
            return (Criteria) this;
        }

        public Criteria andNTitleIsNotNull() {
            addCriterion("n_title is not null");
            return (Criteria) this;
        }

        public Criteria andNTitleEqualTo(String value) {
            addCriterion("n_title =", value, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleNotEqualTo(String value) {
            addCriterion("n_title <>", value, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleGreaterThan(String value) {
            addCriterion("n_title >", value, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleGreaterThanOrEqualTo(String value) {
            addCriterion("n_title >=", value, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleLessThan(String value) {
            addCriterion("n_title <", value, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleLessThanOrEqualTo(String value) {
            addCriterion("n_title <=", value, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleLike(String value) {
            addCriterion("n_title like", value, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleNotLike(String value) {
            addCriterion("n_title not like", value, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleIn(List<String> values) {
            addCriterion("n_title in", values, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleNotIn(List<String> values) {
            addCriterion("n_title not in", values, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleBetween(String value1, String value2) {
            addCriterion("n_title between", value1, value2, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTitleNotBetween(String value1, String value2) {
            addCriterion("n_title not between", value1, value2, "nTitle");
            return (Criteria) this;
        }

        public Criteria andNTypeIsNull() {
            addCriterion("n_type is null");
            return (Criteria) this;
        }

        public Criteria andNTypeIsNotNull() {
            addCriterion("n_type is not null");
            return (Criteria) this;
        }

        public Criteria andNTypeEqualTo(Integer value) {
            addCriterion("n_type =", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeNotEqualTo(Integer value) {
            addCriterion("n_type <>", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeGreaterThan(Integer value) {
            addCriterion("n_type >", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_type >=", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeLessThan(Integer value) {
            addCriterion("n_type <", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeLessThanOrEqualTo(Integer value) {
            addCriterion("n_type <=", value, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeIn(List<Integer> values) {
            addCriterion("n_type in", values, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeNotIn(List<Integer> values) {
            addCriterion("n_type not in", values, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeBetween(Integer value1, Integer value2) {
            addCriterion("n_type between", value1, value2, "nType");
            return (Criteria) this;
        }

        public Criteria andNTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("n_type not between", value1, value2, "nType");
            return (Criteria) this;
        }

        public Criteria andNSenderIsNull() {
            addCriterion("n_sender is null");
            return (Criteria) this;
        }

        public Criteria andNSenderIsNotNull() {
            addCriterion("n_sender is not null");
            return (Criteria) this;
        }

        public Criteria andNSenderEqualTo(String value) {
            addCriterion("n_sender =", value, "nSender");
            return (Criteria) this;
        }

        public Criteria andNSenderNotEqualTo(String value) {
            addCriterion("n_sender <>", value, "nSender");
            return (Criteria) this;
        }

        public Criteria andNSenderGreaterThan(String value) {
            addCriterion("n_sender >", value, "nSender");
            return (Criteria) this;
        }

        public Criteria andNSenderGreaterThanOrEqualTo(String value) {
            addCriterion("n_sender >=", value, "nSender");
            return (Criteria) this;
        }

        public Criteria andNSenderLessThan(String value) {
            addCriterion("n_sender <", value, "nSender");
            return (Criteria) this;
        }

        public Criteria andNSenderLessThanOrEqualTo(String value) {
            addCriterion("n_sender <=", value, "nSender");
            return (Criteria) this;
        }

        public Criteria andNSenderLike(String value) {
            addCriterion("n_sender like", value, "nSender");
            return (Criteria) this;
        }

        public Criteria andNSenderNotLike(String value) {
            addCriterion("n_sender not like", value, "nSender");
            return (Criteria) this;
        }

        public Criteria andNSenderIn(List<String> values) {
            addCriterion("n_sender in", values, "nSender");
            return (Criteria) this;
        }

        public Criteria andNSenderNotIn(List<String> values) {
            addCriterion("n_sender not in", values, "nSender");
            return (Criteria) this;
        }

        public Criteria andNSenderBetween(String value1, String value2) {
            addCriterion("n_sender between", value1, value2, "nSender");
            return (Criteria) this;
        }

        public Criteria andNSenderNotBetween(String value1, String value2) {
            addCriterion("n_sender not between", value1, value2, "nSender");
            return (Criteria) this;
        }

        public Criteria andNSenderNameIsNull() {
            addCriterion("n_sender_name is null");
            return (Criteria) this;
        }

        public Criteria andNSenderNameIsNotNull() {
            addCriterion("n_sender_name is not null");
            return (Criteria) this;
        }

        public Criteria andNSenderNameEqualTo(String value) {
            addCriterion("n_sender_name =", value, "nSenderName");
            return (Criteria) this;
        }

        public Criteria andNSenderNameNotEqualTo(String value) {
            addCriterion("n_sender_name <>", value, "nSenderName");
            return (Criteria) this;
        }

        public Criteria andNSenderNameGreaterThan(String value) {
            addCriterion("n_sender_name >", value, "nSenderName");
            return (Criteria) this;
        }

        public Criteria andNSenderNameGreaterThanOrEqualTo(String value) {
            addCriterion("n_sender_name >=", value, "nSenderName");
            return (Criteria) this;
        }

        public Criteria andNSenderNameLessThan(String value) {
            addCriterion("n_sender_name <", value, "nSenderName");
            return (Criteria) this;
        }

        public Criteria andNSenderNameLessThanOrEqualTo(String value) {
            addCriterion("n_sender_name <=", value, "nSenderName");
            return (Criteria) this;
        }

        public Criteria andNSenderNameLike(String value) {
            addCriterion("n_sender_name like", value, "nSenderName");
            return (Criteria) this;
        }

        public Criteria andNSenderNameNotLike(String value) {
            addCriterion("n_sender_name not like", value, "nSenderName");
            return (Criteria) this;
        }

        public Criteria andNSenderNameIn(List<String> values) {
            addCriterion("n_sender_name in", values, "nSenderName");
            return (Criteria) this;
        }

        public Criteria andNSenderNameNotIn(List<String> values) {
            addCriterion("n_sender_name not in", values, "nSenderName");
            return (Criteria) this;
        }

        public Criteria andNSenderNameBetween(String value1, String value2) {
            addCriterion("n_sender_name between", value1, value2, "nSenderName");
            return (Criteria) this;
        }

        public Criteria andNSenderNameNotBetween(String value1, String value2) {
            addCriterion("n_sender_name not between", value1, value2, "nSenderName");
            return (Criteria) this;
        }

        public Criteria andNSendTimeIsNull() {
            addCriterion("n_send_time is null");
            return (Criteria) this;
        }

        public Criteria andNSendTimeIsNotNull() {
            addCriterion("n_send_time is not null");
            return (Criteria) this;
        }

        public Criteria andNSendTimeEqualTo(String value) {
            addCriterion("n_send_time =", value, "nSendTime");
            return (Criteria) this;
        }

        public Criteria andNSendTimeNotEqualTo(String value) {
            addCriterion("n_send_time <>", value, "nSendTime");
            return (Criteria) this;
        }

        public Criteria andNSendTimeGreaterThan(String value) {
            addCriterion("n_send_time >", value, "nSendTime");
            return (Criteria) this;
        }

        public Criteria andNSendTimeGreaterThanOrEqualTo(String value) {
            addCriterion("n_send_time >=", value, "nSendTime");
            return (Criteria) this;
        }

        public Criteria andNSendTimeLessThan(String value) {
            addCriterion("n_send_time <", value, "nSendTime");
            return (Criteria) this;
        }

        public Criteria andNSendTimeLessThanOrEqualTo(String value) {
            addCriterion("n_send_time <=", value, "nSendTime");
            return (Criteria) this;
        }

        public Criteria andNSendTimeLike(String value) {
            addCriterion("n_send_time like", value, "nSendTime");
            return (Criteria) this;
        }

        public Criteria andNSendTimeNotLike(String value) {
            addCriterion("n_send_time not like", value, "nSendTime");
            return (Criteria) this;
        }

        public Criteria andNSendTimeIn(List<String> values) {
            addCriterion("n_send_time in", values, "nSendTime");
            return (Criteria) this;
        }

        public Criteria andNSendTimeNotIn(List<String> values) {
            addCriterion("n_send_time not in", values, "nSendTime");
            return (Criteria) this;
        }

        public Criteria andNSendTimeBetween(String value1, String value2) {
            addCriterion("n_send_time between", value1, value2, "nSendTime");
            return (Criteria) this;
        }

        public Criteria andNSendTimeNotBetween(String value1, String value2) {
            addCriterion("n_send_time not between", value1, value2, "nSendTime");
            return (Criteria) this;
        }

        public Criteria andNFilePathIsNull() {
            addCriterion("n_file_path is null");
            return (Criteria) this;
        }

        public Criteria andNFilePathIsNotNull() {
            addCriterion("n_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andNFilePathEqualTo(String value) {
            addCriterion("n_file_path =", value, "nFilePath");
            return (Criteria) this;
        }

        public Criteria andNFilePathNotEqualTo(String value) {
            addCriterion("n_file_path <>", value, "nFilePath");
            return (Criteria) this;
        }

        public Criteria andNFilePathGreaterThan(String value) {
            addCriterion("n_file_path >", value, "nFilePath");
            return (Criteria) this;
        }

        public Criteria andNFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("n_file_path >=", value, "nFilePath");
            return (Criteria) this;
        }

        public Criteria andNFilePathLessThan(String value) {
            addCriterion("n_file_path <", value, "nFilePath");
            return (Criteria) this;
        }

        public Criteria andNFilePathLessThanOrEqualTo(String value) {
            addCriterion("n_file_path <=", value, "nFilePath");
            return (Criteria) this;
        }

        public Criteria andNFilePathLike(String value) {
            addCriterion("n_file_path like", value, "nFilePath");
            return (Criteria) this;
        }

        public Criteria andNFilePathNotLike(String value) {
            addCriterion("n_file_path not like", value, "nFilePath");
            return (Criteria) this;
        }

        public Criteria andNFilePathIn(List<String> values) {
            addCriterion("n_file_path in", values, "nFilePath");
            return (Criteria) this;
        }

        public Criteria andNFilePathNotIn(List<String> values) {
            addCriterion("n_file_path not in", values, "nFilePath");
            return (Criteria) this;
        }

        public Criteria andNFilePathBetween(String value1, String value2) {
            addCriterion("n_file_path between", value1, value2, "nFilePath");
            return (Criteria) this;
        }

        public Criteria andNFilePathNotBetween(String value1, String value2) {
            addCriterion("n_file_path not between", value1, value2, "nFilePath");
            return (Criteria) this;
        }

        public Criteria andNFileTypeIsNull() {
            addCriterion("n_file_type is null");
            return (Criteria) this;
        }

        public Criteria andNFileTypeIsNotNull() {
            addCriterion("n_file_type is not null");
            return (Criteria) this;
        }

        public Criteria andNFileTypeEqualTo(String value) {
            addCriterion("n_file_type =", value, "nFileType");
            return (Criteria) this;
        }

        public Criteria andNFileTypeNotEqualTo(String value) {
            addCriterion("n_file_type <>", value, "nFileType");
            return (Criteria) this;
        }

        public Criteria andNFileTypeGreaterThan(String value) {
            addCriterion("n_file_type >", value, "nFileType");
            return (Criteria) this;
        }

        public Criteria andNFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("n_file_type >=", value, "nFileType");
            return (Criteria) this;
        }

        public Criteria andNFileTypeLessThan(String value) {
            addCriterion("n_file_type <", value, "nFileType");
            return (Criteria) this;
        }

        public Criteria andNFileTypeLessThanOrEqualTo(String value) {
            addCriterion("n_file_type <=", value, "nFileType");
            return (Criteria) this;
        }

        public Criteria andNFileTypeLike(String value) {
            addCriterion("n_file_type like", value, "nFileType");
            return (Criteria) this;
        }

        public Criteria andNFileTypeNotLike(String value) {
            addCriterion("n_file_type not like", value, "nFileType");
            return (Criteria) this;
        }

        public Criteria andNFileTypeIn(List<String> values) {
            addCriterion("n_file_type in", values, "nFileType");
            return (Criteria) this;
        }

        public Criteria andNFileTypeNotIn(List<String> values) {
            addCriterion("n_file_type not in", values, "nFileType");
            return (Criteria) this;
        }

        public Criteria andNFileTypeBetween(String value1, String value2) {
            addCriterion("n_file_type between", value1, value2, "nFileType");
            return (Criteria) this;
        }

        public Criteria andNFileTypeNotBetween(String value1, String value2) {
            addCriterion("n_file_type not between", value1, value2, "nFileType");
            return (Criteria) this;
        }

        public Criteria andNFileNumNameIsNull() {
            addCriterion("n_file_num_name is null");
            return (Criteria) this;
        }

        public Criteria andNFileNumNameIsNotNull() {
            addCriterion("n_file_num_name is not null");
            return (Criteria) this;
        }

        public Criteria andNFileNumNameEqualTo(String value) {
            addCriterion("n_file_num_name =", value, "nFileNumName");
            return (Criteria) this;
        }

        public Criteria andNFileNumNameNotEqualTo(String value) {
            addCriterion("n_file_num_name <>", value, "nFileNumName");
            return (Criteria) this;
        }

        public Criteria andNFileNumNameGreaterThan(String value) {
            addCriterion("n_file_num_name >", value, "nFileNumName");
            return (Criteria) this;
        }

        public Criteria andNFileNumNameGreaterThanOrEqualTo(String value) {
            addCriterion("n_file_num_name >=", value, "nFileNumName");
            return (Criteria) this;
        }

        public Criteria andNFileNumNameLessThan(String value) {
            addCriterion("n_file_num_name <", value, "nFileNumName");
            return (Criteria) this;
        }

        public Criteria andNFileNumNameLessThanOrEqualTo(String value) {
            addCriterion("n_file_num_name <=", value, "nFileNumName");
            return (Criteria) this;
        }

        public Criteria andNFileNumNameLike(String value) {
            addCriterion("n_file_num_name like", value, "nFileNumName");
            return (Criteria) this;
        }

        public Criteria andNFileNumNameNotLike(String value) {
            addCriterion("n_file_num_name not like", value, "nFileNumName");
            return (Criteria) this;
        }

        public Criteria andNFileNumNameIn(List<String> values) {
            addCriterion("n_file_num_name in", values, "nFileNumName");
            return (Criteria) this;
        }

        public Criteria andNFileNumNameNotIn(List<String> values) {
            addCriterion("n_file_num_name not in", values, "nFileNumName");
            return (Criteria) this;
        }

        public Criteria andNFileNumNameBetween(String value1, String value2) {
            addCriterion("n_file_num_name between", value1, value2, "nFileNumName");
            return (Criteria) this;
        }

        public Criteria andNFileNumNameNotBetween(String value1, String value2) {
            addCriterion("n_file_num_name not between", value1, value2, "nFileNumName");
            return (Criteria) this;
        }

        public Criteria andNFileRealNameIsNull() {
            addCriterion("n_file_real_name is null");
            return (Criteria) this;
        }

        public Criteria andNFileRealNameIsNotNull() {
            addCriterion("n_file_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andNFileRealNameEqualTo(String value) {
            addCriterion("n_file_real_name =", value, "nFileRealName");
            return (Criteria) this;
        }

        public Criteria andNFileRealNameNotEqualTo(String value) {
            addCriterion("n_file_real_name <>", value, "nFileRealName");
            return (Criteria) this;
        }

        public Criteria andNFileRealNameGreaterThan(String value) {
            addCriterion("n_file_real_name >", value, "nFileRealName");
            return (Criteria) this;
        }

        public Criteria andNFileRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("n_file_real_name >=", value, "nFileRealName");
            return (Criteria) this;
        }

        public Criteria andNFileRealNameLessThan(String value) {
            addCriterion("n_file_real_name <", value, "nFileRealName");
            return (Criteria) this;
        }

        public Criteria andNFileRealNameLessThanOrEqualTo(String value) {
            addCriterion("n_file_real_name <=", value, "nFileRealName");
            return (Criteria) this;
        }

        public Criteria andNFileRealNameLike(String value) {
            addCriterion("n_file_real_name like", value, "nFileRealName");
            return (Criteria) this;
        }

        public Criteria andNFileRealNameNotLike(String value) {
            addCriterion("n_file_real_name not like", value, "nFileRealName");
            return (Criteria) this;
        }

        public Criteria andNFileRealNameIn(List<String> values) {
            addCriterion("n_file_real_name in", values, "nFileRealName");
            return (Criteria) this;
        }

        public Criteria andNFileRealNameNotIn(List<String> values) {
            addCriterion("n_file_real_name not in", values, "nFileRealName");
            return (Criteria) this;
        }

        public Criteria andNFileRealNameBetween(String value1, String value2) {
            addCriterion("n_file_real_name between", value1, value2, "nFileRealName");
            return (Criteria) this;
        }

        public Criteria andNFileRealNameNotBetween(String value1, String value2) {
            addCriterion("n_file_real_name not between", value1, value2, "nFileRealName");
            return (Criteria) this;
        }

        public Criteria andNGradeIsNull() {
            addCriterion("n_grade is null");
            return (Criteria) this;
        }

        public Criteria andNGradeIsNotNull() {
            addCriterion("n_grade is not null");
            return (Criteria) this;
        }

        public Criteria andNGradeEqualTo(Byte value) {
            addCriterion("n_grade =", value, "nGrade");
            return (Criteria) this;
        }

        public Criteria andNGradeNotEqualTo(Byte value) {
            addCriterion("n_grade <>", value, "nGrade");
            return (Criteria) this;
        }

        public Criteria andNGradeGreaterThan(Byte value) {
            addCriterion("n_grade >", value, "nGrade");
            return (Criteria) this;
        }

        public Criteria andNGradeGreaterThanOrEqualTo(Byte value) {
            addCriterion("n_grade >=", value, "nGrade");
            return (Criteria) this;
        }

        public Criteria andNGradeLessThan(Byte value) {
            addCriterion("n_grade <", value, "nGrade");
            return (Criteria) this;
        }

        public Criteria andNGradeLessThanOrEqualTo(Byte value) {
            addCriterion("n_grade <=", value, "nGrade");
            return (Criteria) this;
        }

        public Criteria andNGradeIn(List<Byte> values) {
            addCriterion("n_grade in", values, "nGrade");
            return (Criteria) this;
        }

        public Criteria andNGradeNotIn(List<Byte> values) {
            addCriterion("n_grade not in", values, "nGrade");
            return (Criteria) this;
        }

        public Criteria andNGradeBetween(Byte value1, Byte value2) {
            addCriterion("n_grade between", value1, value2, "nGrade");
            return (Criteria) this;
        }

        public Criteria andNGradeNotBetween(Byte value1, Byte value2) {
            addCriterion("n_grade not between", value1, value2, "nGrade");
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

        public Criteria andNDistinguishIsNull() {
            addCriterion("n_distinguish is null");
            return (Criteria) this;
        }

        public Criteria andNDistinguishIsNotNull() {
            addCriterion("n_distinguish is not null");
            return (Criteria) this;
        }

        public Criteria andNDistinguishEqualTo(Byte value) {
            addCriterion("n_distinguish =", value, "nDistinguish");
            return (Criteria) this;
        }

        public Criteria andNDistinguishNotEqualTo(Byte value) {
            addCriterion("n_distinguish <>", value, "nDistinguish");
            return (Criteria) this;
        }

        public Criteria andNDistinguishGreaterThan(Byte value) {
            addCriterion("n_distinguish >", value, "nDistinguish");
            return (Criteria) this;
        }

        public Criteria andNDistinguishGreaterThanOrEqualTo(Byte value) {
            addCriterion("n_distinguish >=", value, "nDistinguish");
            return (Criteria) this;
        }

        public Criteria andNDistinguishLessThan(Byte value) {
            addCriterion("n_distinguish <", value, "nDistinguish");
            return (Criteria) this;
        }

        public Criteria andNDistinguishLessThanOrEqualTo(Byte value) {
            addCriterion("n_distinguish <=", value, "nDistinguish");
            return (Criteria) this;
        }

        public Criteria andNDistinguishIn(List<Byte> values) {
            addCriterion("n_distinguish in", values, "nDistinguish");
            return (Criteria) this;
        }

        public Criteria andNDistinguishNotIn(List<Byte> values) {
            addCriterion("n_distinguish not in", values, "nDistinguish");
            return (Criteria) this;
        }

        public Criteria andNDistinguishBetween(Byte value1, Byte value2) {
            addCriterion("n_distinguish between", value1, value2, "nDistinguish");
            return (Criteria) this;
        }

        public Criteria andNDistinguishNotBetween(Byte value1, Byte value2) {
            addCriterion("n_distinguish not between", value1, value2, "nDistinguish");
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