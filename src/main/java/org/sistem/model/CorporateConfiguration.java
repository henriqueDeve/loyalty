package org.sistem.model;

import org.sistem.enums.CorporateModel;
import org.sistem.enums.Integration;
import org.sistem.enums.SocialNetwork;
import org.sistem.enums.TypeScore;

import java.util.List;

public class CorporateConfiguration {

    private Long id;
    private Long corporateId;
    private List<TypeScore> typeScores;
    private int monthlyExpirationDate;
    private List<SocialNetwork> socialNetworks;

    /*
        Essas sao configuracoes para determinar se a empresa tera minimo e maximo de pontos que pode usar
     */
    private boolean minimum;
    private boolean maximum;
    private int valueMin;
    private int valueMax;

    /*
       modelos de notificacao
     */
    private boolean sendEmail;
    private boolean sendWhatsapp;

    /*
       Este valor esta em porcentagem
     */
    private int discountMax;


    private List<CorporateModel> corporateModel;
    private List<Integration> integrations;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCorporateId() {
        return corporateId;
    }

    public void setCorporateId(Long corporateId) {
        this.corporateId = corporateId;
    }

    public List<TypeScore> getTypeScores() {
        return typeScores;
    }

    public void setTypeScores(List<TypeScore> typeScores) {
        this.typeScores = typeScores;
    }

    public int getMonthlyExpirationDate() {
        return monthlyExpirationDate;
    }

    public void setMonthlyExpirationDate(int monthlyExpirationDate) {
        this.monthlyExpirationDate = monthlyExpirationDate;
    }

    public List<SocialNetwork> getSocialNetworks() {
        return socialNetworks;
    }

    public void setSocialNetworks(List<SocialNetwork> socialNetworks) {
        this.socialNetworks = socialNetworks;
    }

    public boolean isMinimum() {
        return minimum;
    }

    public void setMinimum(boolean minimum) {
        this.minimum = minimum;
    }

    public boolean isMaximum() {
        return maximum;
    }

    public void setMaximum(boolean maximum) {
        this.maximum = maximum;
    }

    public int getValueMin() {
        return valueMin;
    }

    public void setValueMin(int valueMin) {
        this.valueMin = valueMin;
    }

    public int getValueMax() {
        return valueMax;
    }

    public void setValueMax(int valueMax) {
        this.valueMax = valueMax;
    }

    public boolean isSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    public boolean isSendWhatsapp() {
        return sendWhatsapp;
    }

    public void setSendWhatsapp(boolean sendWhatsapp) {
        this.sendWhatsapp = sendWhatsapp;
    }

    public int getDiscountMax() {
        return discountMax;
    }

    public void setDiscountMax(int discountMax) {
        this.discountMax = discountMax;
    }

    public List<CorporateModel> getCorporateModel() {
        return corporateModel;
    }

    public void setCorporateModel(List<CorporateModel> corporateModel) {
        this.corporateModel = corporateModel;
    }

    public List<Integration> getIntegrations() {
        return integrations;
    }

    public void setIntegrations(List<Integration> integrations) {
        this.integrations = integrations;
    }
}
