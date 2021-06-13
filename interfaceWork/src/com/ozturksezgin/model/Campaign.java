package com.ozturksezgin.model;

import java.util.Date;

public class Campaign {
    private Long campaignId;
    private String campaignName;
    private String campaignCode;
    private Double campaignDiscount;
    private Date campaignStartDate;
    private Date campaignEndDate;

    public Campaign(Long campaignId, String campaignName, String campaignCode, Double campaignDiscount, Date campaignStartDate, Date campaignEndDate) {
        this.campaignId = campaignId;
        this.campaignName = campaignName;
        this.campaignCode = campaignCode;
        this.campaignDiscount = campaignDiscount;
        this.campaignStartDate = campaignStartDate;
        this.campaignEndDate = campaignEndDate;
    }

    public Long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getCampaignCode() {
        return campaignCode;
    }

    public void setCampaignCode(String campaignCode) {
        this.campaignCode = campaignCode;
    }

    public Double getCampaignDiscount() {
        return campaignDiscount;
    }

    public void setCampaignDiscount(Double campaignDiscount) {
        this.campaignDiscount = campaignDiscount;
    }

    public Date getCampaignStartDate() {
        return campaignStartDate;
    }

    public void setCampaignStartDate(Date campaignStartDate) {
        this.campaignStartDate = campaignStartDate;
    }

    public Date getCampaignEndDate() {
        return campaignEndDate;
    }

    public void setCampaignEndDate(Date campaignEndDate) {
        this.campaignEndDate = campaignEndDate;
    }
}
