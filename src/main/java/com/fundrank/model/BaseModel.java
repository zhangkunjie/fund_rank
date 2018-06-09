package com.fundrank.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author kunjie.zhang
 * @description:
 * @date 2018/6/8 下午10:46
 */
public class BaseModel implements Serializable {
    private String orderColumn;
    private String orderBy;

    public String getOrderColumn() {
        return orderColumn;
    }

    public void setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    @Override
    public String toString() {
        return "BaseModel{" +
                "orderColumn='" + orderColumn + '\'' +
                ", orderBy='" + orderBy + '\'' +
                '}';
    }
}
