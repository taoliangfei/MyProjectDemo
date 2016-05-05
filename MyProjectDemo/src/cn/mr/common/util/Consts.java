package cn.mr.common.util;

/**
 * 常量类
 * @author Administrator
 */
public class Consts {

	/**
	 * 与quartz有关的常量
	 */
	public static final String STATUS_NORMAL = "NORMAL";  //任务状态：正常
    public static final String STATUS_PAUSED= "PAUSED";  //任务状态：暂停
    public static final String STATUS_DELETE= "DELETE";  //任务状态：删除
     
    public static final String CONCURRENT_IS = "1";  //任务有状态
    public static final String CONCURRENT_NOT = "0";  //任务无状态
}
