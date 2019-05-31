package com.ethan.oasy.pojo;

import java.util.ArrayList;
import java.util.List;

public class FileBorrowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FileBorrowExample() {
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

        public Criteria andFileBorrowIdIsNull() {
            addCriterion("file_borrow_id is null");
            return (Criteria) this;
        }

        public Criteria andFileBorrowIdIsNotNull() {
            addCriterion("file_borrow_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileBorrowIdEqualTo(String value) {
            addCriterion("file_borrow_id =", value, "fileBorrowId");
            return (Criteria) this;
        }

        public Criteria andFileBorrowIdNotEqualTo(String value) {
            addCriterion("file_borrow_id <>", value, "fileBorrowId");
            return (Criteria) this;
        }

        public Criteria andFileBorrowIdGreaterThan(String value) {
            addCriterion("file_borrow_id >", value, "fileBorrowId");
            return (Criteria) this;
        }

        public Criteria andFileBorrowIdGreaterThanOrEqualTo(String value) {
            addCriterion("file_borrow_id >=", value, "fileBorrowId");
            return (Criteria) this;
        }

        public Criteria andFileBorrowIdLessThan(String value) {
            addCriterion("file_borrow_id <", value, "fileBorrowId");
            return (Criteria) this;
        }

        public Criteria andFileBorrowIdLessThanOrEqualTo(String value) {
            addCriterion("file_borrow_id <=", value, "fileBorrowId");
            return (Criteria) this;
        }

        public Criteria andFileBorrowIdLike(String value) {
            addCriterion("file_borrow_id like", value, "fileBorrowId");
            return (Criteria) this;
        }

        public Criteria andFileBorrowIdNotLike(String value) {
            addCriterion("file_borrow_id not like", value, "fileBorrowId");
            return (Criteria) this;
        }

        public Criteria andFileBorrowIdIn(List<String> values) {
            addCriterion("file_borrow_id in", values, "fileBorrowId");
            return (Criteria) this;
        }

        public Criteria andFileBorrowIdNotIn(List<String> values) {
            addCriterion("file_borrow_id not in", values, "fileBorrowId");
            return (Criteria) this;
        }

        public Criteria andFileBorrowIdBetween(String value1, String value2) {
            addCriterion("file_borrow_id between", value1, value2, "fileBorrowId");
            return (Criteria) this;
        }

        public Criteria andFileBorrowIdNotBetween(String value1, String value2) {
            addCriterion("file_borrow_id not between", value1, value2, "fileBorrowId");
            return (Criteria) this;
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

        public Criteria andBorrowerNameIsNull() {
            addCriterion("borrower_name is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameIsNotNull() {
            addCriterion("borrower_name is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameEqualTo(String value) {
            addCriterion("borrower_name =", value, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameNotEqualTo(String value) {
            addCriterion("borrower_name <>", value, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameGreaterThan(String value) {
            addCriterion("borrower_name >", value, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameGreaterThanOrEqualTo(String value) {
            addCriterion("borrower_name >=", value, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameLessThan(String value) {
            addCriterion("borrower_name <", value, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameLessThanOrEqualTo(String value) {
            addCriterion("borrower_name <=", value, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameLike(String value) {
            addCriterion("borrower_name like", value, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameNotLike(String value) {
            addCriterion("borrower_name not like", value, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameIn(List<String> values) {
            addCriterion("borrower_name in", values, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameNotIn(List<String> values) {
            addCriterion("borrower_name not in", values, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameBetween(String value1, String value2) {
            addCriterion("borrower_name between", value1, value2, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNameNotBetween(String value1, String value2) {
            addCriterion("borrower_name not between", value1, value2, "borrowerName");
            return (Criteria) this;
        }

        public Criteria andBorrowerNumIsNull() {
            addCriterion("borrower_num is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerNumIsNotNull() {
            addCriterion("borrower_num is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerNumEqualTo(String value) {
            addCriterion("borrower_num =", value, "borrowerNum");
            return (Criteria) this;
        }

        public Criteria andBorrowerNumNotEqualTo(String value) {
            addCriterion("borrower_num <>", value, "borrowerNum");
            return (Criteria) this;
        }

        public Criteria andBorrowerNumGreaterThan(String value) {
            addCriterion("borrower_num >", value, "borrowerNum");
            return (Criteria) this;
        }

        public Criteria andBorrowerNumGreaterThanOrEqualTo(String value) {
            addCriterion("borrower_num >=", value, "borrowerNum");
            return (Criteria) this;
        }

        public Criteria andBorrowerNumLessThan(String value) {
            addCriterion("borrower_num <", value, "borrowerNum");
            return (Criteria) this;
        }

        public Criteria andBorrowerNumLessThanOrEqualTo(String value) {
            addCriterion("borrower_num <=", value, "borrowerNum");
            return (Criteria) this;
        }

        public Criteria andBorrowerNumLike(String value) {
            addCriterion("borrower_num like", value, "borrowerNum");
            return (Criteria) this;
        }

        public Criteria andBorrowerNumNotLike(String value) {
            addCriterion("borrower_num not like", value, "borrowerNum");
            return (Criteria) this;
        }

        public Criteria andBorrowerNumIn(List<String> values) {
            addCriterion("borrower_num in", values, "borrowerNum");
            return (Criteria) this;
        }

        public Criteria andBorrowerNumNotIn(List<String> values) {
            addCriterion("borrower_num not in", values, "borrowerNum");
            return (Criteria) this;
        }

        public Criteria andBorrowerNumBetween(String value1, String value2) {
            addCriterion("borrower_num between", value1, value2, "borrowerNum");
            return (Criteria) this;
        }

        public Criteria andBorrowerNumNotBetween(String value1, String value2) {
            addCriterion("borrower_num not between", value1, value2, "borrowerNum");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdIsNull() {
            addCriterion("borrower_id is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdIsNotNull() {
            addCriterion("borrower_id is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdEqualTo(String value) {
            addCriterion("borrower_id =", value, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdNotEqualTo(String value) {
            addCriterion("borrower_id <>", value, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdGreaterThan(String value) {
            addCriterion("borrower_id >", value, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdGreaterThanOrEqualTo(String value) {
            addCriterion("borrower_id >=", value, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdLessThan(String value) {
            addCriterion("borrower_id <", value, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdLessThanOrEqualTo(String value) {
            addCriterion("borrower_id <=", value, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdLike(String value) {
            addCriterion("borrower_id like", value, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdNotLike(String value) {
            addCriterion("borrower_id not like", value, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdIn(List<String> values) {
            addCriterion("borrower_id in", values, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdNotIn(List<String> values) {
            addCriterion("borrower_id not in", values, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdBetween(String value1, String value2) {
            addCriterion("borrower_id between", value1, value2, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andBorrowerIdNotBetween(String value1, String value2) {
            addCriterion("borrower_id not between", value1, value2, "borrowerId");
            return (Criteria) this;
        }

        public Criteria andFileBorrowDateIsNull() {
            addCriterion("file_borrow_date is null");
            return (Criteria) this;
        }

        public Criteria andFileBorrowDateIsNotNull() {
            addCriterion("file_borrow_date is not null");
            return (Criteria) this;
        }

        public Criteria andFileBorrowDateEqualTo(String value) {
            addCriterion("file_borrow_date =", value, "fileBorrowDate");
            return (Criteria) this;
        }

        public Criteria andFileBorrowDateNotEqualTo(String value) {
            addCriterion("file_borrow_date <>", value, "fileBorrowDate");
            return (Criteria) this;
        }

        public Criteria andFileBorrowDateGreaterThan(String value) {
            addCriterion("file_borrow_date >", value, "fileBorrowDate");
            return (Criteria) this;
        }

        public Criteria andFileBorrowDateGreaterThanOrEqualTo(String value) {
            addCriterion("file_borrow_date >=", value, "fileBorrowDate");
            return (Criteria) this;
        }

        public Criteria andFileBorrowDateLessThan(String value) {
            addCriterion("file_borrow_date <", value, "fileBorrowDate");
            return (Criteria) this;
        }

        public Criteria andFileBorrowDateLessThanOrEqualTo(String value) {
            addCriterion("file_borrow_date <=", value, "fileBorrowDate");
            return (Criteria) this;
        }

        public Criteria andFileBorrowDateLike(String value) {
            addCriterion("file_borrow_date like", value, "fileBorrowDate");
            return (Criteria) this;
        }

        public Criteria andFileBorrowDateNotLike(String value) {
            addCriterion("file_borrow_date not like", value, "fileBorrowDate");
            return (Criteria) this;
        }

        public Criteria andFileBorrowDateIn(List<String> values) {
            addCriterion("file_borrow_date in", values, "fileBorrowDate");
            return (Criteria) this;
        }

        public Criteria andFileBorrowDateNotIn(List<String> values) {
            addCriterion("file_borrow_date not in", values, "fileBorrowDate");
            return (Criteria) this;
        }

        public Criteria andFileBorrowDateBetween(String value1, String value2) {
            addCriterion("file_borrow_date between", value1, value2, "fileBorrowDate");
            return (Criteria) this;
        }

        public Criteria andFileBorrowDateNotBetween(String value1, String value2) {
            addCriterion("file_borrow_date not between", value1, value2, "fileBorrowDate");
            return (Criteria) this;
        }

        public Criteria andFileReturnDateIsNull() {
            addCriterion("file_return_date is null");
            return (Criteria) this;
        }

        public Criteria andFileReturnDateIsNotNull() {
            addCriterion("file_return_date is not null");
            return (Criteria) this;
        }

        public Criteria andFileReturnDateEqualTo(String value) {
            addCriterion("file_return_date =", value, "fileReturnDate");
            return (Criteria) this;
        }

        public Criteria andFileReturnDateNotEqualTo(String value) {
            addCriterion("file_return_date <>", value, "fileReturnDate");
            return (Criteria) this;
        }

        public Criteria andFileReturnDateGreaterThan(String value) {
            addCriterion("file_return_date >", value, "fileReturnDate");
            return (Criteria) this;
        }

        public Criteria andFileReturnDateGreaterThanOrEqualTo(String value) {
            addCriterion("file_return_date >=", value, "fileReturnDate");
            return (Criteria) this;
        }

        public Criteria andFileReturnDateLessThan(String value) {
            addCriterion("file_return_date <", value, "fileReturnDate");
            return (Criteria) this;
        }

        public Criteria andFileReturnDateLessThanOrEqualTo(String value) {
            addCriterion("file_return_date <=", value, "fileReturnDate");
            return (Criteria) this;
        }

        public Criteria andFileReturnDateLike(String value) {
            addCriterion("file_return_date like", value, "fileReturnDate");
            return (Criteria) this;
        }

        public Criteria andFileReturnDateNotLike(String value) {
            addCriterion("file_return_date not like", value, "fileReturnDate");
            return (Criteria) this;
        }

        public Criteria andFileReturnDateIn(List<String> values) {
            addCriterion("file_return_date in", values, "fileReturnDate");
            return (Criteria) this;
        }

        public Criteria andFileReturnDateNotIn(List<String> values) {
            addCriterion("file_return_date not in", values, "fileReturnDate");
            return (Criteria) this;
        }

        public Criteria andFileReturnDateBetween(String value1, String value2) {
            addCriterion("file_return_date between", value1, value2, "fileReturnDate");
            return (Criteria) this;
        }

        public Criteria andFileReturnDateNotBetween(String value1, String value2) {
            addCriterion("file_return_date not between", value1, value2, "fileReturnDate");
            return (Criteria) this;
        }

        public Criteria andFilePreReturnDateIsNull() {
            addCriterion("file_pre_return_date is null");
            return (Criteria) this;
        }

        public Criteria andFilePreReturnDateIsNotNull() {
            addCriterion("file_pre_return_date is not null");
            return (Criteria) this;
        }

        public Criteria andFilePreReturnDateEqualTo(String value) {
            addCriterion("file_pre_return_date =", value, "filePreReturnDate");
            return (Criteria) this;
        }

        public Criteria andFilePreReturnDateNotEqualTo(String value) {
            addCriterion("file_pre_return_date <>", value, "filePreReturnDate");
            return (Criteria) this;
        }

        public Criteria andFilePreReturnDateGreaterThan(String value) {
            addCriterion("file_pre_return_date >", value, "filePreReturnDate");
            return (Criteria) this;
        }

        public Criteria andFilePreReturnDateGreaterThanOrEqualTo(String value) {
            addCriterion("file_pre_return_date >=", value, "filePreReturnDate");
            return (Criteria) this;
        }

        public Criteria andFilePreReturnDateLessThan(String value) {
            addCriterion("file_pre_return_date <", value, "filePreReturnDate");
            return (Criteria) this;
        }

        public Criteria andFilePreReturnDateLessThanOrEqualTo(String value) {
            addCriterion("file_pre_return_date <=", value, "filePreReturnDate");
            return (Criteria) this;
        }

        public Criteria andFilePreReturnDateLike(String value) {
            addCriterion("file_pre_return_date like", value, "filePreReturnDate");
            return (Criteria) this;
        }

        public Criteria andFilePreReturnDateNotLike(String value) {
            addCriterion("file_pre_return_date not like", value, "filePreReturnDate");
            return (Criteria) this;
        }

        public Criteria andFilePreReturnDateIn(List<String> values) {
            addCriterion("file_pre_return_date in", values, "filePreReturnDate");
            return (Criteria) this;
        }

        public Criteria andFilePreReturnDateNotIn(List<String> values) {
            addCriterion("file_pre_return_date not in", values, "filePreReturnDate");
            return (Criteria) this;
        }

        public Criteria andFilePreReturnDateBetween(String value1, String value2) {
            addCriterion("file_pre_return_date between", value1, value2, "filePreReturnDate");
            return (Criteria) this;
        }

        public Criteria andFilePreReturnDateNotBetween(String value1, String value2) {
            addCriterion("file_pre_return_date not between", value1, value2, "filePreReturnDate");
            return (Criteria) this;
        }

        public Criteria andFileBorrowStatusIsNull() {
            addCriterion("file_borrow_status is null");
            return (Criteria) this;
        }

        public Criteria andFileBorrowStatusIsNotNull() {
            addCriterion("file_borrow_status is not null");
            return (Criteria) this;
        }

        public Criteria andFileBorrowStatusEqualTo(Integer value) {
            addCriterion("file_borrow_status =", value, "fileBorrowStatus");
            return (Criteria) this;
        }

        public Criteria andFileBorrowStatusNotEqualTo(Integer value) {
            addCriterion("file_borrow_status <>", value, "fileBorrowStatus");
            return (Criteria) this;
        }

        public Criteria andFileBorrowStatusGreaterThan(Integer value) {
            addCriterion("file_borrow_status >", value, "fileBorrowStatus");
            return (Criteria) this;
        }

        public Criteria andFileBorrowStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_borrow_status >=", value, "fileBorrowStatus");
            return (Criteria) this;
        }

        public Criteria andFileBorrowStatusLessThan(Integer value) {
            addCriterion("file_borrow_status <", value, "fileBorrowStatus");
            return (Criteria) this;
        }

        public Criteria andFileBorrowStatusLessThanOrEqualTo(Integer value) {
            addCriterion("file_borrow_status <=", value, "fileBorrowStatus");
            return (Criteria) this;
        }

        public Criteria andFileBorrowStatusIn(List<Integer> values) {
            addCriterion("file_borrow_status in", values, "fileBorrowStatus");
            return (Criteria) this;
        }

        public Criteria andFileBorrowStatusNotIn(List<Integer> values) {
            addCriterion("file_borrow_status not in", values, "fileBorrowStatus");
            return (Criteria) this;
        }

        public Criteria andFileBorrowStatusBetween(Integer value1, Integer value2) {
            addCriterion("file_borrow_status between", value1, value2, "fileBorrowStatus");
            return (Criteria) this;
        }

        public Criteria andFileBorrowStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("file_borrow_status not between", value1, value2, "fileBorrowStatus");
            return (Criteria) this;
        }

        public Criteria andDealBorrowIdIsNull() {
            addCriterion("deal_borrow_id is null");
            return (Criteria) this;
        }

        public Criteria andDealBorrowIdIsNotNull() {
            addCriterion("deal_borrow_id is not null");
            return (Criteria) this;
        }

        public Criteria andDealBorrowIdEqualTo(String value) {
            addCriterion("deal_borrow_id =", value, "dealBorrowId");
            return (Criteria) this;
        }

        public Criteria andDealBorrowIdNotEqualTo(String value) {
            addCriterion("deal_borrow_id <>", value, "dealBorrowId");
            return (Criteria) this;
        }

        public Criteria andDealBorrowIdGreaterThan(String value) {
            addCriterion("deal_borrow_id >", value, "dealBorrowId");
            return (Criteria) this;
        }

        public Criteria andDealBorrowIdGreaterThanOrEqualTo(String value) {
            addCriterion("deal_borrow_id >=", value, "dealBorrowId");
            return (Criteria) this;
        }

        public Criteria andDealBorrowIdLessThan(String value) {
            addCriterion("deal_borrow_id <", value, "dealBorrowId");
            return (Criteria) this;
        }

        public Criteria andDealBorrowIdLessThanOrEqualTo(String value) {
            addCriterion("deal_borrow_id <=", value, "dealBorrowId");
            return (Criteria) this;
        }

        public Criteria andDealBorrowIdLike(String value) {
            addCriterion("deal_borrow_id like", value, "dealBorrowId");
            return (Criteria) this;
        }

        public Criteria andDealBorrowIdNotLike(String value) {
            addCriterion("deal_borrow_id not like", value, "dealBorrowId");
            return (Criteria) this;
        }

        public Criteria andDealBorrowIdIn(List<String> values) {
            addCriterion("deal_borrow_id in", values, "dealBorrowId");
            return (Criteria) this;
        }

        public Criteria andDealBorrowIdNotIn(List<String> values) {
            addCriterion("deal_borrow_id not in", values, "dealBorrowId");
            return (Criteria) this;
        }

        public Criteria andDealBorrowIdBetween(String value1, String value2) {
            addCriterion("deal_borrow_id between", value1, value2, "dealBorrowId");
            return (Criteria) this;
        }

        public Criteria andDealBorrowIdNotBetween(String value1, String value2) {
            addCriterion("deal_borrow_id not between", value1, value2, "dealBorrowId");
            return (Criteria) this;
        }

        public Criteria andDealBorrowNameIsNull() {
            addCriterion("deal_borrow_name is null");
            return (Criteria) this;
        }

        public Criteria andDealBorrowNameIsNotNull() {
            addCriterion("deal_borrow_name is not null");
            return (Criteria) this;
        }

        public Criteria andDealBorrowNameEqualTo(String value) {
            addCriterion("deal_borrow_name =", value, "dealBorrowName");
            return (Criteria) this;
        }

        public Criteria andDealBorrowNameNotEqualTo(String value) {
            addCriterion("deal_borrow_name <>", value, "dealBorrowName");
            return (Criteria) this;
        }

        public Criteria andDealBorrowNameGreaterThan(String value) {
            addCriterion("deal_borrow_name >", value, "dealBorrowName");
            return (Criteria) this;
        }

        public Criteria andDealBorrowNameGreaterThanOrEqualTo(String value) {
            addCriterion("deal_borrow_name >=", value, "dealBorrowName");
            return (Criteria) this;
        }

        public Criteria andDealBorrowNameLessThan(String value) {
            addCriterion("deal_borrow_name <", value, "dealBorrowName");
            return (Criteria) this;
        }

        public Criteria andDealBorrowNameLessThanOrEqualTo(String value) {
            addCriterion("deal_borrow_name <=", value, "dealBorrowName");
            return (Criteria) this;
        }

        public Criteria andDealBorrowNameLike(String value) {
            addCriterion("deal_borrow_name like", value, "dealBorrowName");
            return (Criteria) this;
        }

        public Criteria andDealBorrowNameNotLike(String value) {
            addCriterion("deal_borrow_name not like", value, "dealBorrowName");
            return (Criteria) this;
        }

        public Criteria andDealBorrowNameIn(List<String> values) {
            addCriterion("deal_borrow_name in", values, "dealBorrowName");
            return (Criteria) this;
        }

        public Criteria andDealBorrowNameNotIn(List<String> values) {
            addCriterion("deal_borrow_name not in", values, "dealBorrowName");
            return (Criteria) this;
        }

        public Criteria andDealBorrowNameBetween(String value1, String value2) {
            addCriterion("deal_borrow_name between", value1, value2, "dealBorrowName");
            return (Criteria) this;
        }

        public Criteria andDealBorrowNameNotBetween(String value1, String value2) {
            addCriterion("deal_borrow_name not between", value1, value2, "dealBorrowName");
            return (Criteria) this;
        }

        public Criteria andDealReturnIdIsNull() {
            addCriterion("deal_return_id is null");
            return (Criteria) this;
        }

        public Criteria andDealReturnIdIsNotNull() {
            addCriterion("deal_return_id is not null");
            return (Criteria) this;
        }

        public Criteria andDealReturnIdEqualTo(String value) {
            addCriterion("deal_return_id =", value, "dealReturnId");
            return (Criteria) this;
        }

        public Criteria andDealReturnIdNotEqualTo(String value) {
            addCriterion("deal_return_id <>", value, "dealReturnId");
            return (Criteria) this;
        }

        public Criteria andDealReturnIdGreaterThan(String value) {
            addCriterion("deal_return_id >", value, "dealReturnId");
            return (Criteria) this;
        }

        public Criteria andDealReturnIdGreaterThanOrEqualTo(String value) {
            addCriterion("deal_return_id >=", value, "dealReturnId");
            return (Criteria) this;
        }

        public Criteria andDealReturnIdLessThan(String value) {
            addCriterion("deal_return_id <", value, "dealReturnId");
            return (Criteria) this;
        }

        public Criteria andDealReturnIdLessThanOrEqualTo(String value) {
            addCriterion("deal_return_id <=", value, "dealReturnId");
            return (Criteria) this;
        }

        public Criteria andDealReturnIdLike(String value) {
            addCriterion("deal_return_id like", value, "dealReturnId");
            return (Criteria) this;
        }

        public Criteria andDealReturnIdNotLike(String value) {
            addCriterion("deal_return_id not like", value, "dealReturnId");
            return (Criteria) this;
        }

        public Criteria andDealReturnIdIn(List<String> values) {
            addCriterion("deal_return_id in", values, "dealReturnId");
            return (Criteria) this;
        }

        public Criteria andDealReturnIdNotIn(List<String> values) {
            addCriterion("deal_return_id not in", values, "dealReturnId");
            return (Criteria) this;
        }

        public Criteria andDealReturnIdBetween(String value1, String value2) {
            addCriterion("deal_return_id between", value1, value2, "dealReturnId");
            return (Criteria) this;
        }

        public Criteria andDealReturnIdNotBetween(String value1, String value2) {
            addCriterion("deal_return_id not between", value1, value2, "dealReturnId");
            return (Criteria) this;
        }

        public Criteria andDealReturnNameIsNull() {
            addCriterion("deal_return_name is null");
            return (Criteria) this;
        }

        public Criteria andDealReturnNameIsNotNull() {
            addCriterion("deal_return_name is not null");
            return (Criteria) this;
        }

        public Criteria andDealReturnNameEqualTo(String value) {
            addCriterion("deal_return_name =", value, "dealReturnName");
            return (Criteria) this;
        }

        public Criteria andDealReturnNameNotEqualTo(String value) {
            addCriterion("deal_return_name <>", value, "dealReturnName");
            return (Criteria) this;
        }

        public Criteria andDealReturnNameGreaterThan(String value) {
            addCriterion("deal_return_name >", value, "dealReturnName");
            return (Criteria) this;
        }

        public Criteria andDealReturnNameGreaterThanOrEqualTo(String value) {
            addCriterion("deal_return_name >=", value, "dealReturnName");
            return (Criteria) this;
        }

        public Criteria andDealReturnNameLessThan(String value) {
            addCriterion("deal_return_name <", value, "dealReturnName");
            return (Criteria) this;
        }

        public Criteria andDealReturnNameLessThanOrEqualTo(String value) {
            addCriterion("deal_return_name <=", value, "dealReturnName");
            return (Criteria) this;
        }

        public Criteria andDealReturnNameLike(String value) {
            addCriterion("deal_return_name like", value, "dealReturnName");
            return (Criteria) this;
        }

        public Criteria andDealReturnNameNotLike(String value) {
            addCriterion("deal_return_name not like", value, "dealReturnName");
            return (Criteria) this;
        }

        public Criteria andDealReturnNameIn(List<String> values) {
            addCriterion("deal_return_name in", values, "dealReturnName");
            return (Criteria) this;
        }

        public Criteria andDealReturnNameNotIn(List<String> values) {
            addCriterion("deal_return_name not in", values, "dealReturnName");
            return (Criteria) this;
        }

        public Criteria andDealReturnNameBetween(String value1, String value2) {
            addCriterion("deal_return_name between", value1, value2, "dealReturnName");
            return (Criteria) this;
        }

        public Criteria andDealReturnNameNotBetween(String value1, String value2) {
            addCriterion("deal_return_name not between", value1, value2, "dealReturnName");
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