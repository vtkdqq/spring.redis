package com.my.biz.sm.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysOperLogsExample
{
    protected String orderByClause;

    protected String createTimeStart;

    protected String createTimeEnd;

    public String getCreateTimeStart()
    {
        return createTimeStart;
    }

    public void setCreateTimeStart(String createTimeStart)
    {
        this.createTimeStart = createTimeStart;
    }

    public String getCreateTimeEnd()
    {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(String createTimeEnd)
    {
        this.createTimeEnd = createTimeEnd;
    }

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysOperLogsExample()
    {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause)
    {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause()
    {
        return orderByClause;
    }

    public void setDistinct(boolean distinct)
    {
        this.distinct = distinct;
    }

    public boolean isDistinct()
    {
        return distinct;
    }

    public List<Criteria> getOredCriteria()
    {
        return oredCriteria;
    }

    public void or(Criteria criteria)
    {
        oredCriteria.add(criteria);
    }

    public Criteria or()
    {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria()
    {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0)
        {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal()
    {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear()
    {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria
    {
        protected List<Criterion> criteria;

        protected GeneratedCriteria()
        {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid()
        {
            return criteria.size() > 0;
        }

        public List<Criterion> getCriteria()
        {
            return criteria;
        }

        protected void addCriterion(String condition)
        {
            if (condition == null)
            {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property)
        {
            if (value == null)
            {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property)
        {
            if (value1 == null || value2 == null)
            {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property)
        {
            if (value == null)
            {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property)
        {
            if (values == null || values.size() == 0)
            {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext())
            {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property)
        {
            if (value1 == null || value2 == null)
            {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull()
        {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull()
        {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value)
        {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value)
        {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value)
        {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value)
        {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value)
        {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values)
        {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values)
        {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2)
        {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2)
        {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull()
        {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull()
        {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value)
        {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value)
        {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value)
        {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value)
        {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value)
        {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value)
        {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values)
        {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values)
        {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2)
        {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2)
        {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull()
        {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull()
        {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value)
        {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value)
        {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value)
        {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value)
        {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value)
        {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value)
        {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value)
        {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value)
        {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values)
        {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values)
        {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2)
        {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2)
        {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andOperaTypeIsNull()
        {
            addCriterion("opera_type is null");
            return (Criteria) this;
        }

        public Criteria andOperaTypeIsNotNull()
        {
            addCriterion("opera_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperaTypeEqualTo(String value)
        {
            addCriterion("opera_type =", value, "operaType");
            return (Criteria) this;
        }

        public Criteria andOperaTypeNotEqualTo(String value)
        {
            addCriterion("opera_type <>", value, "operaType");
            return (Criteria) this;
        }

        public Criteria andOperaTypeGreaterThan(String value)
        {
            addCriterion("opera_type >", value, "operaType");
            return (Criteria) this;
        }

        public Criteria andOperaTypeGreaterThanOrEqualTo(String value)
        {
            addCriterion("opera_type >=", value, "operaType");
            return (Criteria) this;
        }

        public Criteria andOperaTypeLessThan(String value)
        {
            addCriterion("opera_type <", value, "operaType");
            return (Criteria) this;
        }

        public Criteria andOperaTypeLessThanOrEqualTo(String value)
        {
            addCriterion("opera_type <=", value, "operaType");
            return (Criteria) this;
        }

        public Criteria andOperaTypeLike(String value)
        {
            addCriterion("opera_type like", value, "operaType");
            return (Criteria) this;
        }

        public Criteria andOperaTypeNotLike(String value)
        {
            addCriterion("opera_type not like", value, "operaType");
            return (Criteria) this;
        }

        public Criteria andOperaTypeIn(List<String> values)
        {
            addCriterion("opera_type in", values, "operaType");
            return (Criteria) this;
        }

        public Criteria andOperaTypeNotIn(List<String> values)
        {
            addCriterion("opera_type not in", values, "operaType");
            return (Criteria) this;
        }

        public Criteria andOperaTypeBetween(String value1, String value2)
        {
            addCriterion("opera_type between", value1, value2, "operaType");
            return (Criteria) this;
        }

        public Criteria andOperaTypeNotBetween(String value1, String value2)
        {
            addCriterion("opera_type not between", value1, value2, "operaType");
            return (Criteria) this;
        }

        public Criteria andOperaDesIsNull()
        {
            addCriterion("opera_des is null");
            return (Criteria) this;
        }

        public Criteria andOperaDesIsNotNull()
        {
            addCriterion("opera_des is not null");
            return (Criteria) this;
        }

        public Criteria andOperaDesEqualTo(String value)
        {
            addCriterion("opera_des =", value, "operaDes");
            return (Criteria) this;
        }

        public Criteria andOperaDesNotEqualTo(String value)
        {
            addCriterion("opera_des <>", value, "operaDes");
            return (Criteria) this;
        }

        public Criteria andOperaDesGreaterThan(String value)
        {
            addCriterion("opera_des >", value, "operaDes");
            return (Criteria) this;
        }

        public Criteria andOperaDesGreaterThanOrEqualTo(String value)
        {
            addCriterion("opera_des >=", value, "operaDes");
            return (Criteria) this;
        }

        public Criteria andOperaDesLessThan(String value)
        {
            addCriterion("opera_des <", value, "operaDes");
            return (Criteria) this;
        }

        public Criteria andOperaDesLessThanOrEqualTo(String value)
        {
            addCriterion("opera_des <=", value, "operaDes");
            return (Criteria) this;
        }

        public Criteria andOperaDesLike(String value)
        {
            addCriterion("opera_des like", value, "operaDes");
            return (Criteria) this;
        }

        public Criteria andOperaDesNotLike(String value)
        {
            addCriterion("opera_des not like", value, "operaDes");
            return (Criteria) this;
        }

        public Criteria andOperaDesIn(List<String> values)
        {
            addCriterion("opera_des in", values, "operaDes");
            return (Criteria) this;
        }

        public Criteria andOperaDesNotIn(List<String> values)
        {
            addCriterion("opera_des not in", values, "operaDes");
            return (Criteria) this;
        }

        public Criteria andOperaDesBetween(String value1, String value2)
        {
            addCriterion("opera_des between", value1, value2, "operaDes");
            return (Criteria) this;
        }

        public Criteria andOperaDesNotBetween(String value1, String value2)
        {
            addCriterion("opera_des not between", value1, value2, "operaDes");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull()
        {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull()
        {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value)
        {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value)
        {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value)
        {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value)
        {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value)
        {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value)
        {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value)
        {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value)
        {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values)
        {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values)
        {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2)
        {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2)
        {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andOldvalueIsNull()
        {
            addCriterion("oldvalue is null");
            return (Criteria) this;
        }

        public Criteria andOldvalueIsNotNull()
        {
            addCriterion("oldvalue is not null");
            return (Criteria) this;
        }

        public Criteria andOldvalueEqualTo(String value)
        {
            addCriterion("oldvalue =", value, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueNotEqualTo(String value)
        {
            addCriterion("oldvalue <>", value, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueGreaterThan(String value)
        {
            addCriterion("oldvalue >", value, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueGreaterThanOrEqualTo(String value)
        {
            addCriterion("oldvalue >=", value, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueLessThan(String value)
        {
            addCriterion("oldvalue <", value, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueLessThanOrEqualTo(String value)
        {
            addCriterion("oldvalue <=", value, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueLike(String value)
        {
            addCriterion("oldvalue like", value, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueNotLike(String value)
        {
            addCriterion("oldvalue not like", value, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueIn(List<String> values)
        {
            addCriterion("oldvalue in", values, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueNotIn(List<String> values)
        {
            addCriterion("oldvalue not in", values, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueBetween(String value1, String value2)
        {
            addCriterion("oldvalue between", value1, value2, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andOldvalueNotBetween(String value1, String value2)
        {
            addCriterion("oldvalue not between", value1, value2, "oldvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueIsNull()
        {
            addCriterion("newvalue is null");
            return (Criteria) this;
        }

        public Criteria andNewvalueIsNotNull()
        {
            addCriterion("newvalue is not null");
            return (Criteria) this;
        }

        public Criteria andNewvalueEqualTo(String value)
        {
            addCriterion("newvalue =", value, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueNotEqualTo(String value)
        {
            addCriterion("newvalue <>", value, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueGreaterThan(String value)
        {
            addCriterion("newvalue >", value, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueGreaterThanOrEqualTo(String value)
        {
            addCriterion("newvalue >=", value, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueLessThan(String value)
        {
            addCriterion("newvalue <", value, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueLessThanOrEqualTo(String value)
        {
            addCriterion("newvalue <=", value, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueLike(String value)
        {
            addCriterion("newvalue like", value, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueNotLike(String value)
        {
            addCriterion("newvalue not like", value, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueIn(List<String> values)
        {
            addCriterion("newvalue in", values, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueNotIn(List<String> values)
        {
            addCriterion("newvalue not in", values, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueBetween(String value1, String value2)
        {
            addCriterion("newvalue between", value1, value2, "newvalue");
            return (Criteria) this;
        }

        public Criteria andNewvalueNotBetween(String value1, String value2)
        {
            addCriterion("newvalue not between", value1, value2, "newvalue");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull()
        {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull()
        {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value)
        {
            addCriterionForJDBCDate("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value)
        {
            addCriterionForJDBCDate("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value)
        {
            addCriterionForJDBCDate("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value)
        {
            addCriterionForJDBCDate("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value)
        {
            addCriterionForJDBCDate("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value)
        {
            addCriterionForJDBCDate("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values)
        {
            addCriterionForJDBCDate("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values)
        {
            addCriterionForJDBCDate("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2)
        {
            addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2)
        {
            addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria
    {

        protected Criteria()
        {
            super();
        }
    }

    public static class Criterion
    {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        public String getCondition()
        {
            return condition;
        }

        public Object getValue()
        {
            return value;
        }

        public Object getSecondValue()
        {
            return secondValue;
        }

        public boolean isNoValue()
        {
            return noValue;
        }

        public boolean isSingleValue()
        {
            return singleValue;
        }

        public boolean isBetweenValue()
        {
            return betweenValue;
        }

        public boolean isListValue()
        {
            return listValue;
        }

        protected Criterion(String condition)
        {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value)
        {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>)
            {
                this.listValue = true;
            }
            else
            {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value, Object secondValue)
        {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }
}
