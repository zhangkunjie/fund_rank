package com.fundrank.model;

import java.io.Serializable;

public class FundRank extends  BaseModel {
    private Long id;

    private String fundId;

    private String fundName;

    private String fundNameAbbr;

    private String calDate;

    private Float netAssetValue;

    private Float accumulative;

    private Float oneday;

    private Float oneweek;

    private Float onemonth;

    private Float threemonth;

    private Float sixmonth;

    private Float oneyear;

    private Float twoyear;

    private Float threeyear;

    private Float thisyear;

    private Float setup;

    private String category;

    private Float score;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFundId() {
        return fundId;
    }

    public void setFundId(String fundId) {
        this.fundId = fundId;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getFundNameAbbr() {
        return fundNameAbbr;
    }

    public void setFundNameAbbr(String fundNameAbbr) {
        this.fundNameAbbr = fundNameAbbr;
    }

    public String getCalDate() {
        return calDate;
    }

    public void setCalDate(String calDate) {
        this.calDate = calDate;
    }

    public Float getNetAssetValue() {
        return netAssetValue;
    }

    public void setNetAssetValue(Float netAssetValue) {
        this.netAssetValue = netAssetValue;
    }

    public Float getAccumulative() {
        return accumulative;
    }

    public void setAccumulative(Float accumulative) {
        this.accumulative = accumulative;
    }

    public Float getOneday() {
        return oneday;
    }

    public void setOneday(Float oneday) {
        this.oneday = oneday;
    }

    public Float getOneweek() {
        return oneweek;
    }

    public void setOneweek(Float oneweek) {
        this.oneweek = oneweek;
    }

    public Float getOnemonth() {
        return onemonth;
    }

    public void setOnemonth(Float onemonth) {
        this.onemonth = onemonth;
    }

    public Float getThreemonth() {
        return threemonth;
    }

    public void setThreemonth(Float threemonth) {
        this.threemonth = threemonth;
    }

    public Float getSixmonth() {
        return sixmonth;
    }

    public void setSixmonth(Float sixmonth) {
        this.sixmonth = sixmonth;
    }

    public Float getOneyear() {
        return oneyear;
    }

    public void setOneyear(Float oneyear) {
        this.oneyear = oneyear;
    }

    public Float getTwoyear() {
        return twoyear;
    }

    public void setTwoyear(Float twoyear) {
        this.twoyear = twoyear;
    }

    public Float getThreeyear() {
        return threeyear;
    }

    public void setThreeyear(Float threeyear) {
        this.threeyear = threeyear;
    }

    public Float getThisyear() {
        return thisyear;
    }

    public void setThisyear(Float thisyear) {
        this.thisyear = thisyear;
    }

    public Float getSetup() {
        return setup;
    }

    public void setSetup(Float setup) {
        this.setup = setup;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", fundId=").append(fundId);
        sb.append(", fundName=").append(fundName);
        sb.append(", fundNameAbbr=").append(fundNameAbbr);
        sb.append(", calDate=").append(calDate);
        sb.append(", netAssetValue=").append(netAssetValue);
        sb.append(", accumulative=").append(accumulative);
        sb.append(", oneday=").append(oneday);
        sb.append(", oneweek=").append(oneweek);
        sb.append(", onemonth=").append(onemonth);
        sb.append(", threemonth=").append(threemonth);
        sb.append(", sixmonth=").append(sixmonth);
        sb.append(", oneyear=").append(oneyear);
        sb.append(", twoyear=").append(twoyear);
        sb.append(", threeyear=").append(threeyear);
        sb.append(", thisyear=").append(thisyear);
        sb.append(", setup=").append(setup);
        sb.append(", category=").append(category);
        sb.append(", score=").append(score);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}