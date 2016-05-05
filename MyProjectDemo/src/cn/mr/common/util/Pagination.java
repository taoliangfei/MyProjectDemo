package cn.mr.common.util;

import java.io.Serializable;
import java.util.Map;

/**
 * 分页工具类
 * @author Administrator
 *
 */
public class Pagination implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1419808287116634283L;

	//默认每页30条记录
	private static final int DEFAULT_PAGE_SIZE = 30;
	
	//默认从0页开始
	private static final int DEFAULT_PAGE_NO = 0;
	
	//默认排序字段
	private static final String DEFAULT_SORT_FIELD = "id";
	
	//默认表格升序
	private static boolean SORT_ASC = true;
	
	//是否需要分页
	private boolean needPaginate;
	
	//每页大小
	private int pageSize;
	
	//当前页数
	private int pageNo;
	
	//是否需要排序
    private boolean needSort;
	
    //排序字段
	private String sortProperty;
	
	//排序字段map集合
	private Map<String, Boolean> sortPropMap;
		
	//是否正向排序
	private boolean asc;

	public Pagination() {
		this(false, false);
	}

	public Pagination(boolean needPaginate, boolean needSort) {
		this(needPaginate, Pagination.DEFAULT_PAGE_SIZE, Pagination.DEFAULT_PAGE_NO, needSort,
				Pagination.DEFAULT_SORT_FIELD, Pagination.SORT_ASC);
	}
	
	public Pagination(int pageSize, int pageNo, String sortProperty, boolean asc) {
		this(true, pageSize, pageNo, true, sortProperty, asc);
	}
	
	public Pagination(int pageSize, int pageNo) {
		this(true, pageSize, pageNo, false, Pagination.DEFAULT_SORT_FIELD, Pagination.SORT_ASC);
	}
	
	/**
	 * 既分页也排序
	 * @param needPaginate 是否分页
	 * @param pageSize 每页大小
	 * @param pageNo 当前页数
	 * @param needSort 是否需要排序
	 * @param sortProperty 排序字段名
	 * @param asc 是否升序
	 */
	public Pagination(boolean needPaginate, int pageSize, int pageNo,
			boolean needSort, String sortProperty, boolean asc) {
		this.needPaginate = needPaginate;
		this.pageSize = pageSize;
		this.pageNo = pageNo;
		this.needSort = needSort;
		this.sortProperty = sortProperty;
		this.asc = asc;
	}

	/**
	 * 既分页也排序，并且排序字段不止一个
	 * @param needPaginate 是否分页
	 * @param pageSize 每页大小
	 * @param pageNo 当前页数
	 * @param needSort 是否需要排序
	 * @param sortPropMap 排序字段map
	 */
	public Pagination(boolean needPaginate, int pageSize, int pageNo,
			boolean needSort, Map<String, Boolean> sortPropMap) {
		this.needPaginate = needPaginate;
		this.pageSize = pageSize;
		this.pageNo = pageNo;
		this.needSort = needSort;
		this.sortPropMap = sortPropMap;
	}
	
	public boolean isNeedPaginate() {
		return needPaginate;
	}

	public void setNeedPaginate(boolean needPaginate) {
		this.needPaginate = needPaginate;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public boolean isNeedSort() {
		return needSort;
	}

	public void setNeedSort(boolean needSort) {
		this.needSort = needSort;
	}

	public String getSortProperty() {
		return sortProperty;
	}

	public void setSortProperty(String sortProperty) {
		this.sortProperty = sortProperty;
	}

	public Map<String, Boolean> getSortPropMap() {
		return sortPropMap;
	}

	public void setSortPropMap(Map<String, Boolean> sortPropMap) {
		this.sortPropMap = sortPropMap;
	}

	public boolean isAsc() {
		return asc;
	}

	public void setAsc(boolean asc) {
		this.asc = asc;
	}
}
