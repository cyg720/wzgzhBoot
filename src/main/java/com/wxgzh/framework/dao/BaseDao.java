package com.wxgzh.framework.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.wxgzh.framework.entity.BaseEntity;


/**
 * 数据抽象接口  /
 * @author cyg
 */
public interface BaseDao<M extends BaseEntity> extends JpaRepository<M,Serializable>,
					JpaSpecificationExecutor<M>{

}
