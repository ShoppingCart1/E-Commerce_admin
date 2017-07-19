package com.mivim.data.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ItemExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table item
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table item
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table item
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
    public ItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table item
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table item
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("itemName is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("itemName is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("itemName =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("itemName <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("itemName >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("itemName >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("itemName <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("itemName <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("itemName like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("itemName not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("itemName in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("itemName not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("itemName between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("itemName not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unitPrice is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unitPrice is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(String value) {
            addCriterion("unitPrice =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(String value) {
            addCriterion("unitPrice <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(String value) {
            addCriterion("unitPrice >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(String value) {
            addCriterion("unitPrice >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(String value) {
            addCriterion("unitPrice <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(String value) {
            addCriterion("unitPrice <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLike(String value) {
            addCriterion("unitPrice like", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotLike(String value) {
            addCriterion("unitPrice not like", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<String> values) {
            addCriterion("unitPrice in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<String> values) {
            addCriterion("unitPrice not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(String value1, String value2) {
            addCriterion("unitPrice between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(String value1, String value2) {
            addCriterion("unitPrice not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andInventaryIsNull() {
            addCriterion("inventary is null");
            return (Criteria) this;
        }

        public Criteria andInventaryIsNotNull() {
            addCriterion("inventary is not null");
            return (Criteria) this;
        }

        public Criteria andInventaryEqualTo(String value) {
            addCriterion("inventary =", value, "inventary");
            return (Criteria) this;
        }

        public Criteria andInventaryNotEqualTo(String value) {
            addCriterion("inventary <>", value, "inventary");
            return (Criteria) this;
        }

        public Criteria andInventaryGreaterThan(String value) {
            addCriterion("inventary >", value, "inventary");
            return (Criteria) this;
        }

        public Criteria andInventaryGreaterThanOrEqualTo(String value) {
            addCriterion("inventary >=", value, "inventary");
            return (Criteria) this;
        }

        public Criteria andInventaryLessThan(String value) {
            addCriterion("inventary <", value, "inventary");
            return (Criteria) this;
        }

        public Criteria andInventaryLessThanOrEqualTo(String value) {
            addCriterion("inventary <=", value, "inventary");
            return (Criteria) this;
        }

        public Criteria andInventaryLike(String value) {
            addCriterion("inventary like", value, "inventary");
            return (Criteria) this;
        }

        public Criteria andInventaryNotLike(String value) {
            addCriterion("inventary not like", value, "inventary");
            return (Criteria) this;
        }

        public Criteria andInventaryIn(List<String> values) {
            addCriterion("inventary in", values, "inventary");
            return (Criteria) this;
        }

        public Criteria andInventaryNotIn(List<String> values) {
            addCriterion("inventary not in", values, "inventary");
            return (Criteria) this;
        }

        public Criteria andInventaryBetween(String value1, String value2) {
            addCriterion("inventary between", value1, value2, "inventary");
            return (Criteria) this;
        }

        public Criteria andInventaryNotBetween(String value1, String value2) {
            addCriterion("inventary not between", value1, value2, "inventary");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionIsNull() {
            addCriterion("itemDescription is null");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionIsNotNull() {
            addCriterion("itemDescription is not null");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionEqualTo(String value) {
            addCriterion("itemDescription =", value, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionNotEqualTo(String value) {
            addCriterion("itemDescription <>", value, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionGreaterThan(String value) {
            addCriterion("itemDescription >", value, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("itemDescription >=", value, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionLessThan(String value) {
            addCriterion("itemDescription <", value, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionLessThanOrEqualTo(String value) {
            addCriterion("itemDescription <=", value, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionLike(String value) {
            addCriterion("itemDescription like", value, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionNotLike(String value) {
            addCriterion("itemDescription not like", value, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionIn(List<String> values) {
            addCriterion("itemDescription in", values, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionNotIn(List<String> values) {
            addCriterion("itemDescription not in", values, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionBetween(String value1, String value2) {
            addCriterion("itemDescription between", value1, value2, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andItemDescriptionNotBetween(String value1, String value2) {
            addCriterion("itemDescription not between", value1, value2, "itemDescription");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIsNull() {
            addCriterion("updatedDate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIsNotNull() {
            addCriterion("updatedDate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateEqualTo(Date value) {
            addCriterionForJDBCDate("updatedDate =", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("updatedDate <>", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateGreaterThan(Date value) {
            addCriterionForJDBCDate("updatedDate >", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updatedDate >=", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateLessThan(Date value) {
            addCriterionForJDBCDate("updatedDate <", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updatedDate <=", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIn(List<Date> values) {
            addCriterionForJDBCDate("updatedDate in", values, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("updatedDate not in", values, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updatedDate between", value1, value2, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updatedDate not between", value1, value2, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table item
     *
     * @mbg.generated do_not_delete_during_merge Tue Jul 18 16:00:44 IST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table item
     *
     * @mbg.generated Tue Jul 18 16:00:44 IST 2017
     */
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