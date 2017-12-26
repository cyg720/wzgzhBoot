package com.wxgzh.framework.models;

import java.io.Serializable;

/**
 * @author cyg
 * 分页请求参数
 */
public class ParamPage implements Serializable {
    private static final long serialVersionUID = 1L;

    private String order;
    private String sort;
    private Integer limit;//显示几条
    private Integer offset;//第几条 

	public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

}
