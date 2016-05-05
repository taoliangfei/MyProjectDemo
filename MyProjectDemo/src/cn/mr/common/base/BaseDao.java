package cn.mr.common.base;

import java.util.List;

public interface BaseDao<T> {

	public List<T> findAll();
	
	public T findById(T id);
	
	public void save(T t);
	
	public void update(T t);
	
	public void delete(T t);
}
