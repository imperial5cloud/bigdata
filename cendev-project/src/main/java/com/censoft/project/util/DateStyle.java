package com.censoft.project.util;

public enum DateStyle {

    YYYY_MM_DD("yyyy-MM-dd", false),
    YYYY_MM("yyyy-MM", false),
    YYYY_MM_DD_HH_MM_SS("yyyy-MM-dd HH:mm:ss", false),
    YYYY_MM_DD_HH_MM("yyyy-MM-dd HH:mm", false),


    YYYY_MM_DD_EN("yyyy/MM/dd", false),
    YYYY_MM_EN("yyyy/MM", false),
    YYYY_MM_DD_HH_MM_SS_EN("yyyy/MM/dd HH:mm:ss", false),
    YYYY_MM_DD_HH_MM_EN("yyyy/MM/dd HH:mm", false),


    YYYY_MM_DD_CN("yyyy年MM月dd日", false),
    YYYY_MM_CN("yyyy年MM月", false),
    YYYY_MM_DD_HH_MM_SS_CN("yyyy年MM月dd日 HH:mm:ss", false),
    YYYY_MM_DD_HH_MM_CN("yyyy年MM月dd日 HH:mm", false);




    private String value;

    private boolean isShowOnly;

    DateStyle(String value, boolean isShowOnly) {
        this.value = value;
        this.isShowOnly = isShowOnly;
    }

    public String getValue() {
        return value;
    }

    public boolean isShowOnly() {
        return isShowOnly;
    }
}
