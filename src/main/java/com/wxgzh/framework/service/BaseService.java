package com.wxgzh.framework.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.wxgzh.framework.dao.BaseDao;
import com.wxgzh.framework.entity.BaseEntity;
import com.wxgzh.framework.utils.ReflectUtil;
import com.wxgzh.framework.vo.BaseVo;

/**
 * 所有业务类的基类，提供了基础的CRUD方法。
 * @author cyg
 */
public abstract class BaseService<M extends BaseEntity,V extends BaseVo> implements IBaseService<M>{
	
	protected Logger log=LoggerFactory.getLogger(this.getClass());
	
	private static final String FIND_QUERY_HQL= "from %s x where 1=1 ";
	private static final String COUNT_QUERY_HQL	= "select count(x) from %s x where 1=1 ";
	protected final Class<M> entityClass;
	protected final Class<V> VoClass;
	protected String entityName;
	protected String VoName;
	protected String findAllHQL;
	protected String countAllHQL;
	
	@Autowired
	private BaseDao<M> baseDao; 
	
	public BaseService(){
		 this.entityClass = ReflectUtil.findParameterizedType(getClass(), 0);
		 this.VoClass = ReflectUtil.findParameterizedType(getClass(), 1);
		 this.entityName = entityClass.getName();
		 this.VoName = VoClass.getName();
		 this.findAllHQL = String.format(FIND_QUERY_HQL, entityName);
		 this.countAllHQL = String.format(COUNT_QUERY_HQL, entityName);
	}
	
	public BaseDao<M> getBaseDao(){
		return this.baseDao;
	}
	
	//保存
	@Override
	public M save(M m) {
		return baseDao.save(m);
	}
	
	@Override
	//查询单个数据
	public M findOne(String id) {
		return baseDao.findOne(id);
	}
	
}
