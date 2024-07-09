package org.sistem.entity;

import org.sistem.Enums.ScoreCondition;

import java.util.Date;

public class Score {

    private Date createdDate;
    private Date lastUpdate;
    private Long poit;
    private ScoreCondition scoreCondition;

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

    public Long getPoit() {
        return poit;
    }

    public void setPoit(Long poit) {
        this.poit = poit;
    }

    public ScoreCondition getPointCondition() {
        return scoreCondition;
    }

    public void setPointCondition(ScoreCondition scoreCondition) {
        this.scoreCondition = scoreCondition;
    }
}
