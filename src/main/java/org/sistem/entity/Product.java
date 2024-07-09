package org.sistem.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Product {

    private String name;
    private String code;
    private Date createdDate;
    private Date lastUppdate;
    private int count;
    private BigDecimal value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastUppdate() {
        return lastUppdate;
    }

    public void setLastUppdate(Date lastUppdate) {
        this.lastUppdate = lastUppdate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
