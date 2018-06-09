package com.fundrank.model.vo;

import com.fundrank.model.BaseModel;

public class FundRankVO extends BaseModel {

    private Float minOneday;
    private Float maxOneday;

    private Float minOneweek;
    private Float maxOneweek;

    private Float minOnemonth;
    private Float maxOnemonth;

    private Float minThreemonth;
    private Float maxThreemonth;

    private Float minSixmonth;
    private Float maxSixmonth;

    private Float minOneyear;
    private Float maxOneyear;

    private Float minTwoyear;
    private Float maxTwoyear;

    private Float minThreeyear;
    private Float maxThreeyear;

    private Float minThisyear;
    private Float maxThisyear;

    private Float minSetup;
    private Float maxSetup;

    private String category;

    private Float minScore;
    private Float maxScore;

    private static final long serialVersionUID = 1L;

    public Float getMinOneday() {
        return minOneday;
    }

    public void setMinOneday(Float minOneday) {
        this.minOneday = minOneday;
    }

    public Float getMaxOneday() {
        return maxOneday;
    }

    public void setMaxOneday(Float maxOneday) {
        this.maxOneday = maxOneday;
    }

    public Float getMinOneweek() {
        return minOneweek;
    }

    public void setMinOneweek(Float minOneweek) {
        this.minOneweek = minOneweek;
    }

    public Float getMaxOneweek() {
        return maxOneweek;
    }

    public void setMaxOneweek(Float maxOneweek) {
        this.maxOneweek = maxOneweek;
    }

    public Float getMinOnemonth() {
        return minOnemonth;
    }

    public void setMinOnemonth(Float minOnemonth) {
        this.minOnemonth = minOnemonth;
    }

    public Float getMaxOnemonth() {
        return maxOnemonth;
    }

    public void setMaxOnemonth(Float maxOnemonth) {
        this.maxOnemonth = maxOnemonth;
    }

    public Float getMinThreemonth() {
        return minThreemonth;
    }

    public void setMinThreemonth(Float minThreemonth) {
        this.minThreemonth = minThreemonth;
    }

    public Float getMaxThreemonth() {
        return maxThreemonth;
    }

    public void setMaxThreemonth(Float maxThreemonth) {
        this.maxThreemonth = maxThreemonth;
    }

    public Float getMinSixmonth() {
        return minSixmonth;
    }

    public void setMinSixmonth(Float minSixmonth) {
        this.minSixmonth = minSixmonth;
    }

    public Float getMaxSixmonth() {
        return maxSixmonth;
    }

    public void setMaxSixmonth(Float maxSixmonth) {
        this.maxSixmonth = maxSixmonth;
    }

    public Float getMinOneyear() {
        return minOneyear;
    }

    public void setMinOneyear(Float minOneyear) {
        this.minOneyear = minOneyear;
    }

    public Float getMaxOneyear() {
        return maxOneyear;
    }

    public void setMaxOneyear(Float maxOneyear) {
        this.maxOneyear = maxOneyear;
    }

    public Float getMinTwoyear() {
        return minTwoyear;
    }

    public void setMinTwoyear(Float minTwoyear) {
        this.minTwoyear = minTwoyear;
    }

    public Float getMaxTwoyear() {
        return maxTwoyear;
    }

    public void setMaxTwoyear(Float maxTwoyear) {
        this.maxTwoyear = maxTwoyear;
    }

    public Float getMinThreeyear() {
        return minThreeyear;
    }

    public void setMinThreeyear(Float minThreeyear) {
        this.minThreeyear = minThreeyear;
    }

    public Float getMaxThreeyear() {
        return maxThreeyear;
    }

    public void setMaxThreeyear(Float maxThreeyear) {
        this.maxThreeyear = maxThreeyear;
    }

    public Float getMinThisyear() {
        return minThisyear;
    }

    public void setMinThisyear(Float minThisyear) {
        this.minThisyear = minThisyear;
    }

    public Float getMaxThisyear() {
        return maxThisyear;
    }

    public void setMaxThisyear(Float maxThisyear) {
        this.maxThisyear = maxThisyear;
    }

    public Float getMinSetup() {
        return minSetup;
    }

    public void setMinSetup(Float minSetup) {
        this.minSetup = minSetup;
    }

    public Float getMaxSetup() {
        return maxSetup;
    }

    public void setMaxSetup(Float maxSetup) {
        this.maxSetup = maxSetup;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Float getMinScore() {
        return minScore;
    }

    public void setMinScore(Float minScore) {
        this.minScore = minScore;
    }

    public Float getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(Float maxScore) {
        this.maxScore = maxScore;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "FundRankVO{" +
                "minOneday=" + minOneday +
                ", maxOneday=" + maxOneday +
                ", minOneweek=" + minOneweek +
                ", maxOneweek=" + maxOneweek +
                ", minOnemonth=" + minOnemonth +
                ", maxOnemonth=" + maxOnemonth +
                ", minThreemonth=" + minThreemonth +
                ", maxThreemonth=" + maxThreemonth +
                ", minSixmonth=" + minSixmonth +
                ", maxSixmonth=" + maxSixmonth +
                ", minOneyear=" + minOneyear +
                ", maxOneyear=" + maxOneyear +
                ", minTwoyear=" + minTwoyear +
                ", maxTwoyear=" + maxTwoyear +
                ", minThreeyear=" + minThreeyear +
                ", maxThreeyear=" + maxThreeyear +
                ", minThisyear=" + minThisyear +
                ", maxThisyear=" + maxThisyear +
                ", minSetup=" + minSetup +
                ", maxSetup=" + maxSetup +
                ", category='" + category + '\'' +
                ", minScore=" + minScore +
                ", maxScore=" + maxScore +
                '}';
    }
}