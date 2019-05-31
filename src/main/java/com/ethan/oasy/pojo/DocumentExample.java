package com.ethan.oasy.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DocumentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DocumentExample() {
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

        public Criteria andDocuIdIsNull() {
            addCriterion("docu_id is null");
            return (Criteria) this;
        }

        public Criteria andDocuIdIsNotNull() {
            addCriterion("docu_id is not null");
            return (Criteria) this;
        }

        public Criteria andDocuIdEqualTo(String value) {
            addCriterion("docu_id =", value, "docuId");
            return (Criteria) this;
        }

        public Criteria andDocuIdNotEqualTo(String value) {
            addCriterion("docu_id <>", value, "docuId");
            return (Criteria) this;
        }

        public Criteria andDocuIdGreaterThan(String value) {
            addCriterion("docu_id >", value, "docuId");
            return (Criteria) this;
        }

        public Criteria andDocuIdGreaterThanOrEqualTo(String value) {
            addCriterion("docu_id >=", value, "docuId");
            return (Criteria) this;
        }

        public Criteria andDocuIdLessThan(String value) {
            addCriterion("docu_id <", value, "docuId");
            return (Criteria) this;
        }

        public Criteria andDocuIdLessThanOrEqualTo(String value) {
            addCriterion("docu_id <=", value, "docuId");
            return (Criteria) this;
        }

        public Criteria andDocuIdLike(String value) {
            addCriterion("docu_id like", value, "docuId");
            return (Criteria) this;
        }

        public Criteria andDocuIdNotLike(String value) {
            addCriterion("docu_id not like", value, "docuId");
            return (Criteria) this;
        }

        public Criteria andDocuIdIn(List<String> values) {
            addCriterion("docu_id in", values, "docuId");
            return (Criteria) this;
        }

        public Criteria andDocuIdNotIn(List<String> values) {
            addCriterion("docu_id not in", values, "docuId");
            return (Criteria) this;
        }

        public Criteria andDocuIdBetween(String value1, String value2) {
            addCriterion("docu_id between", value1, value2, "docuId");
            return (Criteria) this;
        }

        public Criteria andDocuIdNotBetween(String value1, String value2) {
            addCriterion("docu_id not between", value1, value2, "docuId");
            return (Criteria) this;
        }

        public Criteria andDocuNameIsNull() {
            addCriterion("docu_name is null");
            return (Criteria) this;
        }

        public Criteria andDocuNameIsNotNull() {
            addCriterion("docu_name is not null");
            return (Criteria) this;
        }

        public Criteria andDocuNameEqualTo(String value) {
            addCriterion("docu_name =", value, "docuName");
            return (Criteria) this;
        }

        public Criteria andDocuNameNotEqualTo(String value) {
            addCriterion("docu_name <>", value, "docuName");
            return (Criteria) this;
        }

        public Criteria andDocuNameGreaterThan(String value) {
            addCriterion("docu_name >", value, "docuName");
            return (Criteria) this;
        }

        public Criteria andDocuNameGreaterThanOrEqualTo(String value) {
            addCriterion("docu_name >=", value, "docuName");
            return (Criteria) this;
        }

        public Criteria andDocuNameLessThan(String value) {
            addCriterion("docu_name <", value, "docuName");
            return (Criteria) this;
        }

        public Criteria andDocuNameLessThanOrEqualTo(String value) {
            addCriterion("docu_name <=", value, "docuName");
            return (Criteria) this;
        }

        public Criteria andDocuNameLike(String value) {
            addCriterion("docu_name like", value, "docuName");
            return (Criteria) this;
        }

        public Criteria andDocuNameNotLike(String value) {
            addCriterion("docu_name not like", value, "docuName");
            return (Criteria) this;
        }

        public Criteria andDocuNameIn(List<String> values) {
            addCriterion("docu_name in", values, "docuName");
            return (Criteria) this;
        }

        public Criteria andDocuNameNotIn(List<String> values) {
            addCriterion("docu_name not in", values, "docuName");
            return (Criteria) this;
        }

        public Criteria andDocuNameBetween(String value1, String value2) {
            addCriterion("docu_name between", value1, value2, "docuName");
            return (Criteria) this;
        }

        public Criteria andDocuNameNotBetween(String value1, String value2) {
            addCriterion("docu_name not between", value1, value2, "docuName");
            return (Criteria) this;
        }

        public Criteria andDocuSizeIsNull() {
            addCriterion("docu_size is null");
            return (Criteria) this;
        }

        public Criteria andDocuSizeIsNotNull() {
            addCriterion("docu_size is not null");
            return (Criteria) this;
        }

        public Criteria andDocuSizeEqualTo(BigDecimal value) {
            addCriterion("docu_size =", value, "docuSize");
            return (Criteria) this;
        }

        public Criteria andDocuSizeNotEqualTo(BigDecimal value) {
            addCriterion("docu_size <>", value, "docuSize");
            return (Criteria) this;
        }

        public Criteria andDocuSizeGreaterThan(BigDecimal value) {
            addCriterion("docu_size >", value, "docuSize");
            return (Criteria) this;
        }

        public Criteria andDocuSizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("docu_size >=", value, "docuSize");
            return (Criteria) this;
        }

        public Criteria andDocuSizeLessThan(BigDecimal value) {
            addCriterion("docu_size <", value, "docuSize");
            return (Criteria) this;
        }

        public Criteria andDocuSizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("docu_size <=", value, "docuSize");
            return (Criteria) this;
        }

        public Criteria andDocuSizeIn(List<BigDecimal> values) {
            addCriterion("docu_size in", values, "docuSize");
            return (Criteria) this;
        }

        public Criteria andDocuSizeNotIn(List<BigDecimal> values) {
            addCriterion("docu_size not in", values, "docuSize");
            return (Criteria) this;
        }

        public Criteria andDocuSizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("docu_size between", value1, value2, "docuSize");
            return (Criteria) this;
        }

        public Criteria andDocuSizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("docu_size not between", value1, value2, "docuSize");
            return (Criteria) this;
        }

        public Criteria andDocuDownloadNumIsNull() {
            addCriterion("docu_download_num is null");
            return (Criteria) this;
        }

        public Criteria andDocuDownloadNumIsNotNull() {
            addCriterion("docu_download_num is not null");
            return (Criteria) this;
        }

        public Criteria andDocuDownloadNumEqualTo(Integer value) {
            addCriterion("docu_download_num =", value, "docuDownloadNum");
            return (Criteria) this;
        }

        public Criteria andDocuDownloadNumNotEqualTo(Integer value) {
            addCriterion("docu_download_num <>", value, "docuDownloadNum");
            return (Criteria) this;
        }

        public Criteria andDocuDownloadNumGreaterThan(Integer value) {
            addCriterion("docu_download_num >", value, "docuDownloadNum");
            return (Criteria) this;
        }

        public Criteria andDocuDownloadNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("docu_download_num >=", value, "docuDownloadNum");
            return (Criteria) this;
        }

        public Criteria andDocuDownloadNumLessThan(Integer value) {
            addCriterion("docu_download_num <", value, "docuDownloadNum");
            return (Criteria) this;
        }

        public Criteria andDocuDownloadNumLessThanOrEqualTo(Integer value) {
            addCriterion("docu_download_num <=", value, "docuDownloadNum");
            return (Criteria) this;
        }

        public Criteria andDocuDownloadNumIn(List<Integer> values) {
            addCriterion("docu_download_num in", values, "docuDownloadNum");
            return (Criteria) this;
        }

        public Criteria andDocuDownloadNumNotIn(List<Integer> values) {
            addCriterion("docu_download_num not in", values, "docuDownloadNum");
            return (Criteria) this;
        }

        public Criteria andDocuDownloadNumBetween(Integer value1, Integer value2) {
            addCriterion("docu_download_num between", value1, value2, "docuDownloadNum");
            return (Criteria) this;
        }

        public Criteria andDocuDownloadNumNotBetween(Integer value1, Integer value2) {
            addCriterion("docu_download_num not between", value1, value2, "docuDownloadNum");
            return (Criteria) this;
        }

        public Criteria andUploaderNameIsNull() {
            addCriterion("uploader_name is null");
            return (Criteria) this;
        }

        public Criteria andUploaderNameIsNotNull() {
            addCriterion("uploader_name is not null");
            return (Criteria) this;
        }

        public Criteria andUploaderNameEqualTo(String value) {
            addCriterion("uploader_name =", value, "uploaderName");
            return (Criteria) this;
        }

        public Criteria andUploaderNameNotEqualTo(String value) {
            addCriterion("uploader_name <>", value, "uploaderName");
            return (Criteria) this;
        }

        public Criteria andUploaderNameGreaterThan(String value) {
            addCriterion("uploader_name >", value, "uploaderName");
            return (Criteria) this;
        }

        public Criteria andUploaderNameGreaterThanOrEqualTo(String value) {
            addCriterion("uploader_name >=", value, "uploaderName");
            return (Criteria) this;
        }

        public Criteria andUploaderNameLessThan(String value) {
            addCriterion("uploader_name <", value, "uploaderName");
            return (Criteria) this;
        }

        public Criteria andUploaderNameLessThanOrEqualTo(String value) {
            addCriterion("uploader_name <=", value, "uploaderName");
            return (Criteria) this;
        }

        public Criteria andUploaderNameLike(String value) {
            addCriterion("uploader_name like", value, "uploaderName");
            return (Criteria) this;
        }

        public Criteria andUploaderNameNotLike(String value) {
            addCriterion("uploader_name not like", value, "uploaderName");
            return (Criteria) this;
        }

        public Criteria andUploaderNameIn(List<String> values) {
            addCriterion("uploader_name in", values, "uploaderName");
            return (Criteria) this;
        }

        public Criteria andUploaderNameNotIn(List<String> values) {
            addCriterion("uploader_name not in", values, "uploaderName");
            return (Criteria) this;
        }

        public Criteria andUploaderNameBetween(String value1, String value2) {
            addCriterion("uploader_name between", value1, value2, "uploaderName");
            return (Criteria) this;
        }

        public Criteria andUploaderNameNotBetween(String value1, String value2) {
            addCriterion("uploader_name not between", value1, value2, "uploaderName");
            return (Criteria) this;
        }

        public Criteria andUploaderIsNull() {
            addCriterion("uploader is null");
            return (Criteria) this;
        }

        public Criteria andUploaderIsNotNull() {
            addCriterion("uploader is not null");
            return (Criteria) this;
        }

        public Criteria andUploaderEqualTo(String value) {
            addCriterion("uploader =", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderNotEqualTo(String value) {
            addCriterion("uploader <>", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderGreaterThan(String value) {
            addCriterion("uploader >", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderGreaterThanOrEqualTo(String value) {
            addCriterion("uploader >=", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderLessThan(String value) {
            addCriterion("uploader <", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderLessThanOrEqualTo(String value) {
            addCriterion("uploader <=", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderLike(String value) {
            addCriterion("uploader like", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderNotLike(String value) {
            addCriterion("uploader not like", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderIn(List<String> values) {
            addCriterion("uploader in", values, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderNotIn(List<String> values) {
            addCriterion("uploader not in", values, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderBetween(String value1, String value2) {
            addCriterion("uploader between", value1, value2, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderNotBetween(String value1, String value2) {
            addCriterion("uploader not between", value1, value2, "uploader");
            return (Criteria) this;
        }

        public Criteria andDocuRealNameIsNull() {
            addCriterion("docu_real_name is null");
            return (Criteria) this;
        }

        public Criteria andDocuRealNameIsNotNull() {
            addCriterion("docu_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andDocuRealNameEqualTo(String value) {
            addCriterion("docu_real_name =", value, "docuRealName");
            return (Criteria) this;
        }

        public Criteria andDocuRealNameNotEqualTo(String value) {
            addCriterion("docu_real_name <>", value, "docuRealName");
            return (Criteria) this;
        }

        public Criteria andDocuRealNameGreaterThan(String value) {
            addCriterion("docu_real_name >", value, "docuRealName");
            return (Criteria) this;
        }

        public Criteria andDocuRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("docu_real_name >=", value, "docuRealName");
            return (Criteria) this;
        }

        public Criteria andDocuRealNameLessThan(String value) {
            addCriterion("docu_real_name <", value, "docuRealName");
            return (Criteria) this;
        }

        public Criteria andDocuRealNameLessThanOrEqualTo(String value) {
            addCriterion("docu_real_name <=", value, "docuRealName");
            return (Criteria) this;
        }

        public Criteria andDocuRealNameLike(String value) {
            addCriterion("docu_real_name like", value, "docuRealName");
            return (Criteria) this;
        }

        public Criteria andDocuRealNameNotLike(String value) {
            addCriterion("docu_real_name not like", value, "docuRealName");
            return (Criteria) this;
        }

        public Criteria andDocuRealNameIn(List<String> values) {
            addCriterion("docu_real_name in", values, "docuRealName");
            return (Criteria) this;
        }

        public Criteria andDocuRealNameNotIn(List<String> values) {
            addCriterion("docu_real_name not in", values, "docuRealName");
            return (Criteria) this;
        }

        public Criteria andDocuRealNameBetween(String value1, String value2) {
            addCriterion("docu_real_name between", value1, value2, "docuRealName");
            return (Criteria) this;
        }

        public Criteria andDocuRealNameNotBetween(String value1, String value2) {
            addCriterion("docu_real_name not between", value1, value2, "docuRealName");
            return (Criteria) this;
        }

        public Criteria andDocuNumNameIsNull() {
            addCriterion("docu_num_name is null");
            return (Criteria) this;
        }

        public Criteria andDocuNumNameIsNotNull() {
            addCriterion("docu_num_name is not null");
            return (Criteria) this;
        }

        public Criteria andDocuNumNameEqualTo(String value) {
            addCriterion("docu_num_name =", value, "docuNumName");
            return (Criteria) this;
        }

        public Criteria andDocuNumNameNotEqualTo(String value) {
            addCriterion("docu_num_name <>", value, "docuNumName");
            return (Criteria) this;
        }

        public Criteria andDocuNumNameGreaterThan(String value) {
            addCriterion("docu_num_name >", value, "docuNumName");
            return (Criteria) this;
        }

        public Criteria andDocuNumNameGreaterThanOrEqualTo(String value) {
            addCriterion("docu_num_name >=", value, "docuNumName");
            return (Criteria) this;
        }

        public Criteria andDocuNumNameLessThan(String value) {
            addCriterion("docu_num_name <", value, "docuNumName");
            return (Criteria) this;
        }

        public Criteria andDocuNumNameLessThanOrEqualTo(String value) {
            addCriterion("docu_num_name <=", value, "docuNumName");
            return (Criteria) this;
        }

        public Criteria andDocuNumNameLike(String value) {
            addCriterion("docu_num_name like", value, "docuNumName");
            return (Criteria) this;
        }

        public Criteria andDocuNumNameNotLike(String value) {
            addCriterion("docu_num_name not like", value, "docuNumName");
            return (Criteria) this;
        }

        public Criteria andDocuNumNameIn(List<String> values) {
            addCriterion("docu_num_name in", values, "docuNumName");
            return (Criteria) this;
        }

        public Criteria andDocuNumNameNotIn(List<String> values) {
            addCriterion("docu_num_name not in", values, "docuNumName");
            return (Criteria) this;
        }

        public Criteria andDocuNumNameBetween(String value1, String value2) {
            addCriterion("docu_num_name between", value1, value2, "docuNumName");
            return (Criteria) this;
        }

        public Criteria andDocuNumNameNotBetween(String value1, String value2) {
            addCriterion("docu_num_name not between", value1, value2, "docuNumName");
            return (Criteria) this;
        }

        public Criteria andDocuTypeIsNull() {
            addCriterion("docu_type is null");
            return (Criteria) this;
        }

        public Criteria andDocuTypeIsNotNull() {
            addCriterion("docu_type is not null");
            return (Criteria) this;
        }

        public Criteria andDocuTypeEqualTo(String value) {
            addCriterion("docu_type =", value, "docuType");
            return (Criteria) this;
        }

        public Criteria andDocuTypeNotEqualTo(String value) {
            addCriterion("docu_type <>", value, "docuType");
            return (Criteria) this;
        }

        public Criteria andDocuTypeGreaterThan(String value) {
            addCriterion("docu_type >", value, "docuType");
            return (Criteria) this;
        }

        public Criteria andDocuTypeGreaterThanOrEqualTo(String value) {
            addCriterion("docu_type >=", value, "docuType");
            return (Criteria) this;
        }

        public Criteria andDocuTypeLessThan(String value) {
            addCriterion("docu_type <", value, "docuType");
            return (Criteria) this;
        }

        public Criteria andDocuTypeLessThanOrEqualTo(String value) {
            addCriterion("docu_type <=", value, "docuType");
            return (Criteria) this;
        }

        public Criteria andDocuTypeLike(String value) {
            addCriterion("docu_type like", value, "docuType");
            return (Criteria) this;
        }

        public Criteria andDocuTypeNotLike(String value) {
            addCriterion("docu_type not like", value, "docuType");
            return (Criteria) this;
        }

        public Criteria andDocuTypeIn(List<String> values) {
            addCriterion("docu_type in", values, "docuType");
            return (Criteria) this;
        }

        public Criteria andDocuTypeNotIn(List<String> values) {
            addCriterion("docu_type not in", values, "docuType");
            return (Criteria) this;
        }

        public Criteria andDocuTypeBetween(String value1, String value2) {
            addCriterion("docu_type between", value1, value2, "docuType");
            return (Criteria) this;
        }

        public Criteria andDocuTypeNotBetween(String value1, String value2) {
            addCriterion("docu_type not between", value1, value2, "docuType");
            return (Criteria) this;
        }

        public Criteria andDocuPathIsNull() {
            addCriterion("docu_path is null");
            return (Criteria) this;
        }

        public Criteria andDocuPathIsNotNull() {
            addCriterion("docu_path is not null");
            return (Criteria) this;
        }

        public Criteria andDocuPathEqualTo(String value) {
            addCriterion("docu_path =", value, "docuPath");
            return (Criteria) this;
        }

        public Criteria andDocuPathNotEqualTo(String value) {
            addCriterion("docu_path <>", value, "docuPath");
            return (Criteria) this;
        }

        public Criteria andDocuPathGreaterThan(String value) {
            addCriterion("docu_path >", value, "docuPath");
            return (Criteria) this;
        }

        public Criteria andDocuPathGreaterThanOrEqualTo(String value) {
            addCriterion("docu_path >=", value, "docuPath");
            return (Criteria) this;
        }

        public Criteria andDocuPathLessThan(String value) {
            addCriterion("docu_path <", value, "docuPath");
            return (Criteria) this;
        }

        public Criteria andDocuPathLessThanOrEqualTo(String value) {
            addCriterion("docu_path <=", value, "docuPath");
            return (Criteria) this;
        }

        public Criteria andDocuPathLike(String value) {
            addCriterion("docu_path like", value, "docuPath");
            return (Criteria) this;
        }

        public Criteria andDocuPathNotLike(String value) {
            addCriterion("docu_path not like", value, "docuPath");
            return (Criteria) this;
        }

        public Criteria andDocuPathIn(List<String> values) {
            addCriterion("docu_path in", values, "docuPath");
            return (Criteria) this;
        }

        public Criteria andDocuPathNotIn(List<String> values) {
            addCriterion("docu_path not in", values, "docuPath");
            return (Criteria) this;
        }

        public Criteria andDocuPathBetween(String value1, String value2) {
            addCriterion("docu_path between", value1, value2, "docuPath");
            return (Criteria) this;
        }

        public Criteria andDocuPathNotBetween(String value1, String value2) {
            addCriterion("docu_path not between", value1, value2, "docuPath");
            return (Criteria) this;
        }

        public Criteria andCatalogIsNull() {
            addCriterion("catalog is null");
            return (Criteria) this;
        }

        public Criteria andCatalogIsNotNull() {
            addCriterion("catalog is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogEqualTo(Integer value) {
            addCriterion("catalog =", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotEqualTo(Integer value) {
            addCriterion("catalog <>", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogGreaterThan(Integer value) {
            addCriterion("catalog >", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogGreaterThanOrEqualTo(Integer value) {
            addCriterion("catalog >=", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLessThan(Integer value) {
            addCriterion("catalog <", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLessThanOrEqualTo(Integer value) {
            addCriterion("catalog <=", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogIn(List<Integer> values) {
            addCriterion("catalog in", values, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotIn(List<Integer> values) {
            addCriterion("catalog not in", values, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogBetween(Integer value1, Integer value2) {
            addCriterion("catalog between", value1, value2, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotBetween(Integer value1, Integer value2) {
            addCriterion("catalog not between", value1, value2, "catalog");
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