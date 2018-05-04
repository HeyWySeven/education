package com.oracle.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbStudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbStudentExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andStuidIsNull() {
            addCriterion("STUID is null");
            return (Criteria) this;
        }

        public Criteria andStuidIsNotNull() {
            addCriterion("STUID is not null");
            return (Criteria) this;
        }

        public Criteria andStuidEqualTo(Integer value) {
            addCriterion("STUID =", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotEqualTo(Integer value) {
            addCriterion("STUID <>", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThan(Integer value) {
            addCriterion("STUID >", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("STUID >=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThan(Integer value) {
            addCriterion("STUID <", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidLessThanOrEqualTo(Integer value) {
            addCriterion("STUID <=", value, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidIn(List<Integer> values) {
            addCriterion("STUID in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotIn(List<Integer> values) {
            addCriterion("STUID not in", values, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidBetween(Integer value1, Integer value2) {
            addCriterion("STUID between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andStuidNotBetween(Integer value1, Integer value2) {
            addCriterion("STUID not between", value1, value2, "stuid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andClassidIsNull() {
            addCriterion("CLASSID is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("CLASSID is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(Integer value) {
            addCriterion("CLASSID =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(Integer value) {
            addCriterion("CLASSID <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(Integer value) {
            addCriterion("CLASSID >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLASSID >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(Integer value) {
            addCriterion("CLASSID <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(Integer value) {
            addCriterion("CLASSID <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<Integer> values) {
            addCriterion("CLASSID in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<Integer> values) {
            addCriterion("CLASSID not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(Integer value1, Integer value2) {
            addCriterion("CLASSID between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(Integer value1, Integer value2) {
            addCriterion("CLASSID not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andDegreeidIsNull() {
            addCriterion("degreeid is null");
            return (Criteria) this;
        }

        public Criteria andDegreeidIsNotNull() {
            addCriterion("degreeid is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeidEqualTo(Integer value) {
            addCriterion("degreeid =", value, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidNotEqualTo(Integer value) {
            addCriterion("degreeid <>", value, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidGreaterThan(Integer value) {
            addCriterion("degreeid >", value, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("degreeid >=", value, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidLessThan(Integer value) {
            addCriterion("degreeid <", value, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidLessThanOrEqualTo(Integer value) {
            addCriterion("degreeid <=", value, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidIn(List<Integer> values) {
            addCriterion("degreeid in", values, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidNotIn(List<Integer> values) {
            addCriterion("degreeid not in", values, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidBetween(Integer value1, Integer value2) {
            addCriterion("degreeid between", value1, value2, "degreeid");
            return (Criteria) this;
        }

        public Criteria andDegreeidNotBetween(Integer value1, Integer value2) {
            addCriterion("degreeid not between", value1, value2, "degreeid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNull() {
            addCriterion("teacherId is null");
            return (Criteria) this;
        }

        public Criteria andTeacheridIsNotNull() {
            addCriterion("teacherId is not null");
            return (Criteria) this;
        }

        public Criteria andTeacheridEqualTo(Integer value) {
            addCriterion("teacherId =", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotEqualTo(Integer value) {
            addCriterion("teacherId <>", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThan(Integer value) {
            addCriterion("teacherId >", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacherId >=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThan(Integer value) {
            addCriterion("teacherId <", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridLessThanOrEqualTo(Integer value) {
            addCriterion("teacherId <=", value, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridIn(List<Integer> values) {
            addCriterion("teacherId in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotIn(List<Integer> values) {
            addCriterion("teacherId not in", values, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridBetween(Integer value1, Integer value2) {
            addCriterion("teacherId between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andTeacheridNotBetween(Integer value1, Integer value2) {
            addCriterion("teacherId not between", value1, value2, "teacherid");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("IDCARD is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("IDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("IDCARD =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("IDCARD <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("IDCARD >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("IDCARD >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("IDCARD <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("IDCARD <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("IDCARD like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("IDCARD not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("IDCARD in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("IDCARD not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("IDCARD between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("IDCARD not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("TEL is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("TEL =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("TEL <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("TEL >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("TEL >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("TEL <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("TEL <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("TEL like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("TEL not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("TEL in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("TEL not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("TEL between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("TEL not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andFtelIsNull() {
            addCriterion("FTEL is null");
            return (Criteria) this;
        }

        public Criteria andFtelIsNotNull() {
            addCriterion("FTEL is not null");
            return (Criteria) this;
        }

        public Criteria andFtelEqualTo(String value) {
            addCriterion("FTEL =", value, "ftel");
            return (Criteria) this;
        }

        public Criteria andFtelNotEqualTo(String value) {
            addCriterion("FTEL <>", value, "ftel");
            return (Criteria) this;
        }

        public Criteria andFtelGreaterThan(String value) {
            addCriterion("FTEL >", value, "ftel");
            return (Criteria) this;
        }

        public Criteria andFtelGreaterThanOrEqualTo(String value) {
            addCriterion("FTEL >=", value, "ftel");
            return (Criteria) this;
        }

        public Criteria andFtelLessThan(String value) {
            addCriterion("FTEL <", value, "ftel");
            return (Criteria) this;
        }

        public Criteria andFtelLessThanOrEqualTo(String value) {
            addCriterion("FTEL <=", value, "ftel");
            return (Criteria) this;
        }

        public Criteria andFtelLike(String value) {
            addCriterion("FTEL like", value, "ftel");
            return (Criteria) this;
        }

        public Criteria andFtelNotLike(String value) {
            addCriterion("FTEL not like", value, "ftel");
            return (Criteria) this;
        }

        public Criteria andFtelIn(List<String> values) {
            addCriterion("FTEL in", values, "ftel");
            return (Criteria) this;
        }

        public Criteria andFtelNotIn(List<String> values) {
            addCriterion("FTEL not in", values, "ftel");
            return (Criteria) this;
        }

        public Criteria andFtelBetween(String value1, String value2) {
            addCriterion("FTEL between", value1, value2, "ftel");
            return (Criteria) this;
        }

        public Criteria andFtelNotBetween(String value1, String value2) {
            addCriterion("FTEL not between", value1, value2, "ftel");
            return (Criteria) this;
        }

        public Criteria andMtelIsNull() {
            addCriterion("MTEL is null");
            return (Criteria) this;
        }

        public Criteria andMtelIsNotNull() {
            addCriterion("MTEL is not null");
            return (Criteria) this;
        }

        public Criteria andMtelEqualTo(String value) {
            addCriterion("MTEL =", value, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelNotEqualTo(String value) {
            addCriterion("MTEL <>", value, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelGreaterThan(String value) {
            addCriterion("MTEL >", value, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelGreaterThanOrEqualTo(String value) {
            addCriterion("MTEL >=", value, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelLessThan(String value) {
            addCriterion("MTEL <", value, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelLessThanOrEqualTo(String value) {
            addCriterion("MTEL <=", value, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelLike(String value) {
            addCriterion("MTEL like", value, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelNotLike(String value) {
            addCriterion("MTEL not like", value, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelIn(List<String> values) {
            addCriterion("MTEL in", values, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelNotIn(List<String> values) {
            addCriterion("MTEL not in", values, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelBetween(String value1, String value2) {
            addCriterion("MTEL between", value1, value2, "mtel");
            return (Criteria) this;
        }

        public Criteria andMtelNotBetween(String value1, String value2) {
            addCriterion("MTEL not between", value1, value2, "mtel");
            return (Criteria) this;
        }

        public Criteria andSchoolidIsNull() {
            addCriterion("SCHOOLID is null");
            return (Criteria) this;
        }

        public Criteria andSchoolidIsNotNull() {
            addCriterion("SCHOOLID is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolidEqualTo(Integer value) {
            addCriterion("SCHOOLID =", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidNotEqualTo(Integer value) {
            addCriterion("SCHOOLID <>", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidGreaterThan(Integer value) {
            addCriterion("SCHOOLID >", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SCHOOLID >=", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidLessThan(Integer value) {
            addCriterion("SCHOOLID <", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidLessThanOrEqualTo(Integer value) {
            addCriterion("SCHOOLID <=", value, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidIn(List<Integer> values) {
            addCriterion("SCHOOLID in", values, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidNotIn(List<Integer> values) {
            addCriterion("SCHOOLID not in", values, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidBetween(Integer value1, Integer value2) {
            addCriterion("SCHOOLID between", value1, value2, "schoolid");
            return (Criteria) this;
        }

        public Criteria andSchoolidNotBetween(Integer value1, Integer value2) {
            addCriterion("SCHOOLID not between", value1, value2, "schoolid");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("MAJOR is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("MAJOR is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("MAJOR =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("MAJOR <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("MAJOR >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("MAJOR >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("MAJOR <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("MAJOR <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("MAJOR like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("MAJOR not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("MAJOR in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("MAJOR not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("MAJOR between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("MAJOR not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("GRADE is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("GRADE =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("GRADE <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("GRADE >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("GRADE >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("GRADE <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("GRADE <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("GRADE like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("GRADE not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("GRADE in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("GRADE not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("GRADE between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("GRADE not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andClassguideidIsNull() {
            addCriterion("CLASSGUIDEID is null");
            return (Criteria) this;
        }

        public Criteria andClassguideidIsNotNull() {
            addCriterion("CLASSGUIDEID is not null");
            return (Criteria) this;
        }

        public Criteria andClassguideidEqualTo(Integer value) {
            addCriterion("CLASSGUIDEID =", value, "classguideid");
            return (Criteria) this;
        }

        public Criteria andClassguideidNotEqualTo(Integer value) {
            addCriterion("CLASSGUIDEID <>", value, "classguideid");
            return (Criteria) this;
        }

        public Criteria andClassguideidGreaterThan(Integer value) {
            addCriterion("CLASSGUIDEID >", value, "classguideid");
            return (Criteria) this;
        }

        public Criteria andClassguideidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLASSGUIDEID >=", value, "classguideid");
            return (Criteria) this;
        }

        public Criteria andClassguideidLessThan(Integer value) {
            addCriterion("CLASSGUIDEID <", value, "classguideid");
            return (Criteria) this;
        }

        public Criteria andClassguideidLessThanOrEqualTo(Integer value) {
            addCriterion("CLASSGUIDEID <=", value, "classguideid");
            return (Criteria) this;
        }

        public Criteria andClassguideidIn(List<Integer> values) {
            addCriterion("CLASSGUIDEID in", values, "classguideid");
            return (Criteria) this;
        }

        public Criteria andClassguideidNotIn(List<Integer> values) {
            addCriterion("CLASSGUIDEID not in", values, "classguideid");
            return (Criteria) this;
        }

        public Criteria andClassguideidBetween(Integer value1, Integer value2) {
            addCriterion("CLASSGUIDEID between", value1, value2, "classguideid");
            return (Criteria) this;
        }

        public Criteria andClassguideidNotBetween(Integer value1, Integer value2) {
            addCriterion("CLASSGUIDEID not between", value1, value2, "classguideid");
            return (Criteria) this;
        }

        public Criteria andJobguideidIsNull() {
            addCriterion("JOBGUIDEID is null");
            return (Criteria) this;
        }

        public Criteria andJobguideidIsNotNull() {
            addCriterion("JOBGUIDEID is not null");
            return (Criteria) this;
        }

        public Criteria andJobguideidEqualTo(Integer value) {
            addCriterion("JOBGUIDEID =", value, "jobguideid");
            return (Criteria) this;
        }

        public Criteria andJobguideidNotEqualTo(Integer value) {
            addCriterion("JOBGUIDEID <>", value, "jobguideid");
            return (Criteria) this;
        }

        public Criteria andJobguideidGreaterThan(Integer value) {
            addCriterion("JOBGUIDEID >", value, "jobguideid");
            return (Criteria) this;
        }

        public Criteria andJobguideidGreaterThanOrEqualTo(Integer value) {
            addCriterion("JOBGUIDEID >=", value, "jobguideid");
            return (Criteria) this;
        }

        public Criteria andJobguideidLessThan(Integer value) {
            addCriterion("JOBGUIDEID <", value, "jobguideid");
            return (Criteria) this;
        }

        public Criteria andJobguideidLessThanOrEqualTo(Integer value) {
            addCriterion("JOBGUIDEID <=", value, "jobguideid");
            return (Criteria) this;
        }

        public Criteria andJobguideidIn(List<Integer> values) {
            addCriterion("JOBGUIDEID in", values, "jobguideid");
            return (Criteria) this;
        }

        public Criteria andJobguideidNotIn(List<Integer> values) {
            addCriterion("JOBGUIDEID not in", values, "jobguideid");
            return (Criteria) this;
        }

        public Criteria andJobguideidBetween(Integer value1, Integer value2) {
            addCriterion("JOBGUIDEID between", value1, value2, "jobguideid");
            return (Criteria) this;
        }

        public Criteria andJobguideidNotBetween(Integer value1, Integer value2) {
            addCriterion("JOBGUIDEID not between", value1, value2, "jobguideid");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andIntendcityIsNull() {
            addCriterion("INTENDCITY is null");
            return (Criteria) this;
        }

        public Criteria andIntendcityIsNotNull() {
            addCriterion("INTENDCITY is not null");
            return (Criteria) this;
        }

        public Criteria andIntendcityEqualTo(String value) {
            addCriterion("INTENDCITY =", value, "intendcity");
            return (Criteria) this;
        }

        public Criteria andIntendcityNotEqualTo(String value) {
            addCriterion("INTENDCITY <>", value, "intendcity");
            return (Criteria) this;
        }

        public Criteria andIntendcityGreaterThan(String value) {
            addCriterion("INTENDCITY >", value, "intendcity");
            return (Criteria) this;
        }

        public Criteria andIntendcityGreaterThanOrEqualTo(String value) {
            addCriterion("INTENDCITY >=", value, "intendcity");
            return (Criteria) this;
        }

        public Criteria andIntendcityLessThan(String value) {
            addCriterion("INTENDCITY <", value, "intendcity");
            return (Criteria) this;
        }

        public Criteria andIntendcityLessThanOrEqualTo(String value) {
            addCriterion("INTENDCITY <=", value, "intendcity");
            return (Criteria) this;
        }

        public Criteria andIntendcityLike(String value) {
            addCriterion("INTENDCITY like", value, "intendcity");
            return (Criteria) this;
        }

        public Criteria andIntendcityNotLike(String value) {
            addCriterion("INTENDCITY not like", value, "intendcity");
            return (Criteria) this;
        }

        public Criteria andIntendcityIn(List<String> values) {
            addCriterion("INTENDCITY in", values, "intendcity");
            return (Criteria) this;
        }

        public Criteria andIntendcityNotIn(List<String> values) {
            addCriterion("INTENDCITY not in", values, "intendcity");
            return (Criteria) this;
        }

        public Criteria andIntendcityBetween(String value1, String value2) {
            addCriterion("INTENDCITY between", value1, value2, "intendcity");
            return (Criteria) this;
        }

        public Criteria andIntendcityNotBetween(String value1, String value2) {
            addCriterion("INTENDCITY not between", value1, value2, "intendcity");
            return (Criteria) this;
        }

        public Criteria andWorkcityIsNull() {
            addCriterion("WORKCITY is null");
            return (Criteria) this;
        }

        public Criteria andWorkcityIsNotNull() {
            addCriterion("WORKCITY is not null");
            return (Criteria) this;
        }

        public Criteria andWorkcityEqualTo(String value) {
            addCriterion("WORKCITY =", value, "workcity");
            return (Criteria) this;
        }

        public Criteria andWorkcityNotEqualTo(String value) {
            addCriterion("WORKCITY <>", value, "workcity");
            return (Criteria) this;
        }

        public Criteria andWorkcityGreaterThan(String value) {
            addCriterion("WORKCITY >", value, "workcity");
            return (Criteria) this;
        }

        public Criteria andWorkcityGreaterThanOrEqualTo(String value) {
            addCriterion("WORKCITY >=", value, "workcity");
            return (Criteria) this;
        }

        public Criteria andWorkcityLessThan(String value) {
            addCriterion("WORKCITY <", value, "workcity");
            return (Criteria) this;
        }

        public Criteria andWorkcityLessThanOrEqualTo(String value) {
            addCriterion("WORKCITY <=", value, "workcity");
            return (Criteria) this;
        }

        public Criteria andWorkcityLike(String value) {
            addCriterion("WORKCITY like", value, "workcity");
            return (Criteria) this;
        }

        public Criteria andWorkcityNotLike(String value) {
            addCriterion("WORKCITY not like", value, "workcity");
            return (Criteria) this;
        }

        public Criteria andWorkcityIn(List<String> values) {
            addCriterion("WORKCITY in", values, "workcity");
            return (Criteria) this;
        }

        public Criteria andWorkcityNotIn(List<String> values) {
            addCriterion("WORKCITY not in", values, "workcity");
            return (Criteria) this;
        }

        public Criteria andWorkcityBetween(String value1, String value2) {
            addCriterion("WORKCITY between", value1, value2, "workcity");
            return (Criteria) this;
        }

        public Criteria andWorkcityNotBetween(String value1, String value2) {
            addCriterion("WORKCITY not between", value1, value2, "workcity");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("Company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("Company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("Company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("Company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("Company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("Company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("Company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("Company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("Company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("Company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("Company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("Company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("Company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("Company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("JOB is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("JOB is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("JOB =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("JOB <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("JOB >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("JOB >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("JOB <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("JOB <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("JOB like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("JOB not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("JOB in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("JOB not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("JOB between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("JOB not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andEndclasstimeIsNull() {
            addCriterion("endClassTime is null");
            return (Criteria) this;
        }

        public Criteria andEndclasstimeIsNotNull() {
            addCriterion("endClassTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndclasstimeEqualTo(Date value) {
            addCriterionForJDBCDate("endClassTime =", value, "endclasstime");
            return (Criteria) this;
        }

        public Criteria andEndclasstimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("endClassTime <>", value, "endclasstime");
            return (Criteria) this;
        }

        public Criteria andEndclasstimeGreaterThan(Date value) {
            addCriterionForJDBCDate("endClassTime >", value, "endclasstime");
            return (Criteria) this;
        }

        public Criteria andEndclasstimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endClassTime >=", value, "endclasstime");
            return (Criteria) this;
        }

        public Criteria andEndclasstimeLessThan(Date value) {
            addCriterionForJDBCDate("endClassTime <", value, "endclasstime");
            return (Criteria) this;
        }

        public Criteria andEndclasstimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endClassTime <=", value, "endclasstime");
            return (Criteria) this;
        }

        public Criteria andEndclasstimeIn(List<Date> values) {
            addCriterionForJDBCDate("endClassTime in", values, "endclasstime");
            return (Criteria) this;
        }

        public Criteria andEndclasstimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("endClassTime not in", values, "endclasstime");
            return (Criteria) this;
        }

        public Criteria andEndclasstimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endClassTime between", value1, value2, "endclasstime");
            return (Criteria) this;
        }

        public Criteria andEndclasstimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endClassTime not between", value1, value2, "endclasstime");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNull() {
            addCriterion("WORKTIME is null");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNotNull() {
            addCriterion("WORKTIME is not null");
            return (Criteria) this;
        }

        public Criteria andWorktimeEqualTo(Date value) {
            addCriterionForJDBCDate("WORKTIME =", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("WORKTIME <>", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThan(Date value) {
            addCriterionForJDBCDate("WORKTIME >", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("WORKTIME >=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThan(Date value) {
            addCriterionForJDBCDate("WORKTIME <", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("WORKTIME <=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeIn(List<Date> values) {
            addCriterionForJDBCDate("WORKTIME in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("WORKTIME not in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("WORKTIME between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("WORKTIME not between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("SALARY is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("SALARY is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(String value) {
            addCriterion("SALARY =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(String value) {
            addCriterion("SALARY <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(String value) {
            addCriterion("SALARY >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("SALARY >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(String value) {
            addCriterion("SALARY <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(String value) {
            addCriterion("SALARY <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLike(String value) {
            addCriterion("SALARY like", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotLike(String value) {
            addCriterion("SALARY not like", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<String> values) {
            addCriterion("SALARY in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<String> values) {
            addCriterion("SALARY not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(String value1, String value2) {
            addCriterion("SALARY between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(String value1, String value2) {
            addCriterion("SALARY not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryofyearIsNull() {
            addCriterion("SALARYOFYEAR is null");
            return (Criteria) this;
        }

        public Criteria andSalaryofyearIsNotNull() {
            addCriterion("SALARYOFYEAR is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryofyearEqualTo(Integer value) {
            addCriterion("SALARYOFYEAR =", value, "salaryofyear");
            return (Criteria) this;
        }

        public Criteria andSalaryofyearNotEqualTo(Integer value) {
            addCriterion("SALARYOFYEAR <>", value, "salaryofyear");
            return (Criteria) this;
        }

        public Criteria andSalaryofyearGreaterThan(Integer value) {
            addCriterion("SALARYOFYEAR >", value, "salaryofyear");
            return (Criteria) this;
        }

        public Criteria andSalaryofyearGreaterThanOrEqualTo(Integer value) {
            addCriterion("SALARYOFYEAR >=", value, "salaryofyear");
            return (Criteria) this;
        }

        public Criteria andSalaryofyearLessThan(Integer value) {
            addCriterion("SALARYOFYEAR <", value, "salaryofyear");
            return (Criteria) this;
        }

        public Criteria andSalaryofyearLessThanOrEqualTo(Integer value) {
            addCriterion("SALARYOFYEAR <=", value, "salaryofyear");
            return (Criteria) this;
        }

        public Criteria andSalaryofyearIn(List<Integer> values) {
            addCriterion("SALARYOFYEAR in", values, "salaryofyear");
            return (Criteria) this;
        }

        public Criteria andSalaryofyearNotIn(List<Integer> values) {
            addCriterion("SALARYOFYEAR not in", values, "salaryofyear");
            return (Criteria) this;
        }

        public Criteria andSalaryofyearBetween(Integer value1, Integer value2) {
            addCriterion("SALARYOFYEAR between", value1, value2, "salaryofyear");
            return (Criteria) this;
        }

        public Criteria andSalaryofyearNotBetween(Integer value1, Integer value2) {
            addCriterion("SALARYOFYEAR not between", value1, value2, "salaryofyear");
            return (Criteria) this;
        }

        public Criteria andRecommendtypeidIsNull() {
            addCriterion("recommendTypeId is null");
            return (Criteria) this;
        }

        public Criteria andRecommendtypeidIsNotNull() {
            addCriterion("recommendTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendtypeidEqualTo(Integer value) {
            addCriterion("recommendTypeId =", value, "recommendtypeid");
            return (Criteria) this;
        }

        public Criteria andRecommendtypeidNotEqualTo(Integer value) {
            addCriterion("recommendTypeId <>", value, "recommendtypeid");
            return (Criteria) this;
        }

        public Criteria andRecommendtypeidGreaterThan(Integer value) {
            addCriterion("recommendTypeId >", value, "recommendtypeid");
            return (Criteria) this;
        }

        public Criteria andRecommendtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommendTypeId >=", value, "recommendtypeid");
            return (Criteria) this;
        }

        public Criteria andRecommendtypeidLessThan(Integer value) {
            addCriterion("recommendTypeId <", value, "recommendtypeid");
            return (Criteria) this;
        }

        public Criteria andRecommendtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("recommendTypeId <=", value, "recommendtypeid");
            return (Criteria) this;
        }

        public Criteria andRecommendtypeidIn(List<Integer> values) {
            addCriterion("recommendTypeId in", values, "recommendtypeid");
            return (Criteria) this;
        }

        public Criteria andRecommendtypeidNotIn(List<Integer> values) {
            addCriterion("recommendTypeId not in", values, "recommendtypeid");
            return (Criteria) this;
        }

        public Criteria andRecommendtypeidBetween(Integer value1, Integer value2) {
            addCriterion("recommendTypeId between", value1, value2, "recommendtypeid");
            return (Criteria) this;
        }

        public Criteria andRecommendtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("recommendTypeId not between", value1, value2, "recommendtypeid");
            return (Criteria) this;
        }

        public Criteria andStateidIsNull() {
            addCriterion("STATEID is null");
            return (Criteria) this;
        }

        public Criteria andStateidIsNotNull() {
            addCriterion("STATEID is not null");
            return (Criteria) this;
        }

        public Criteria andStateidEqualTo(Integer value) {
            addCriterion("STATEID =", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotEqualTo(Integer value) {
            addCriterion("STATEID <>", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidGreaterThan(Integer value) {
            addCriterion("STATEID >", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATEID >=", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidLessThan(Integer value) {
            addCriterion("STATEID <", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidLessThanOrEqualTo(Integer value) {
            addCriterion("STATEID <=", value, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidIn(List<Integer> values) {
            addCriterion("STATEID in", values, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotIn(List<Integer> values) {
            addCriterion("STATEID not in", values, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidBetween(Integer value1, Integer value2) {
            addCriterion("STATEID between", value1, value2, "stateid");
            return (Criteria) this;
        }

        public Criteria andStateidNotBetween(Integer value1, Integer value2) {
            addCriterion("STATEID not between", value1, value2, "stateid");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("COMMENT =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("COMMENT <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("COMMENT >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENT >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("COMMENT <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("COMMENT <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("COMMENT like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("COMMENT not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("COMMENT in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("COMMENT not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("COMMENT between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("COMMENT not between", value1, value2, "comment");
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