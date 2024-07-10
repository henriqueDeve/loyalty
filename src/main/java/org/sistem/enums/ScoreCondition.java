package org.sistem.enums;

public enum ScoreCondition {

    EXPIRED("Expirado"),
    USED("Usado"),
    VALID("Valido");

    private String rule;

    ScoreCondition(String rule) {
        this.rule = rule;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }
}
