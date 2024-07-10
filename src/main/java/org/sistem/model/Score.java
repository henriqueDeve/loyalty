package org.sistem.model;

import org.sistem.enums.ScoreCondition;

import java.util.Date;

public class Score {

    private Long id;
    private Long customerId;
    private Long corporateId;
    private String key;
    private Date createdDate;
    private Date lastUpdate;
    private Long point;
    private ScoreCondition scoreCondition;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Long getCorporateId() {
        return corporateId;
    }

    public void setCorporateId(Long corporateId) {
        this.corporateId = corporateId;
    }

    public ScoreCondition getScoreCondition() {
        return scoreCondition;
    }

    public void setScoreCondition(ScoreCondition scoreCondition) {
        this.scoreCondition = scoreCondition;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Long getPoint() {
        return point;
    }

    public void setPoint(Long point) {
        this.point = point;
    }

    public ScoreCondition getPointCondition() {
        return scoreCondition;
    }

    public void setPointCondition(ScoreCondition scoreCondition) {
        this.scoreCondition = scoreCondition;
    }
}
