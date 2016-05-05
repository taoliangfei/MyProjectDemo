package cn.mr.common.base;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {

	@Override
	public List<T> findAll() {
		return null;
	}

	@Override
	public T findById(T id) {
		
		return null;
	}

	@Override
	public void save(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T t) {
		// TODO Auto-generated method stub
		
	}

}
