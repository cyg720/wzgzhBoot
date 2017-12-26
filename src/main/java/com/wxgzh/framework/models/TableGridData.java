package com.wxgzh.framework.models;

import java.io.Serializable;
import java.util.List;

import com.wxgzh.framework.entity.BaseEntity;

/**
 * 分页数据承载对象
 * @author cyg
 */
public class TableGridData<M extends BaseEntity> implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private Long total;
    public List<M> rows;

	public TableGridData() {
		
	}

	public TableGridData(List<M> rows) {
		this.rows = rows;
	}

	public TableGridData(Long total, List<M> rows) {
		this.total = total;
		this.rows = rows;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	
    public void setRows(List<M> rows) {
		this.rows = rows;
	}
}
