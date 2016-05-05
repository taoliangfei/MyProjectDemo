package cn.mr.common.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "T_SchedulerJob")
@SequenceGenerator(name="S_SchedulerJob", sequenceName="S_SchedulerJob", allocationSize = 1)
public class SchedulerJob implements Serializable { 
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 263782483109578041L;

	/** 
	 * 任务id 
	 */
	@Id
	@GeneratedValue(generator = "S_SchedulerJob", strategy = GenerationType.SEQUENCE)
    private Long id;
  
    /** 
     * 任务名称 
     */
	@Column(nullable = false, length = 256)
    private String jobName;
  
    /** 
     * 任务分组
     */
	@Column(nullable = false, length = 256)
    private String jobGroup;
  
    /** 
     * 任务状态 0禁用 1启用 2删除
     */
	@Column(nullable = false, length = 256)
    private String jobStatus;
  
    /** 
     * 任务运行时间表达式 
     */
	@Column(nullable = false, length = 256)
    private String cronExpression;
  
    /**
     * 任务描述
     */
	@Column(nullable = false, length = 256)
    private String description;
     
    /**
     * 创建时间
     */
	@Column(nullable = false)
    private Date createTime;  
     
    /**
     * 修改时间
     */
	@Column(nullable = false)
    private Date updateTime;  
     
    /** 
     * 任务执行时调用哪个类的方法 包名+类名 
     */ 
	@Column(nullable = false, length = 256)
    private String beanClass;  
    
    /** 
     * 任务是否有状态 
     */ 
	@Column(nullable = false, length = 256)
    private String isConcurrent; 
    
    /** 
     * spring bean 
     */ 
	@Column(nullable = false, length = 256)
    private String springId;
    
    /** 
     * 任务调用的方法名 
     */ 
	@Column(nullable = false, length = 256)
    private String methodName;  
     
    public SchedulerJob() {
    }
     
    public SchedulerJob(String jobName, String jobGroup, String jobStatus, String cronExpression, String description, 
    		Date createTime, Date updateTime, String beanClass, String isConcurrent, String springId, String methodName) {
        this.jobName = jobName;
        this.jobGroup = jobGroup;
        this.jobStatus = jobStatus;
        this.cronExpression = cronExpression;
        this.description = description;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.beanClass = beanClass;
        this.isConcurrent = isConcurrent;
        this.springId = springId;
        this.methodName = methodName;
    }
 
    public String getJobName() {
        return jobName;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
 
    public String getJobGroup() {
        return jobGroup;
    }
 
    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }
 
    public String getJobStatus() {
        return jobStatus;
    }
 
    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }
 
    public String getCronExpression() {
        return cronExpression;
    }
 
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }
 
    public String getDescription() {
        return description;
    }
 
    public void setDescription(String description) {
        this.description = description;
    }
 
    public Date getCreateTime() {
        return createTime;
    }
 
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
 
    public Date getUpdateTime() {
        return updateTime;
    }
 
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
 
    public String getBeanClass() {
        return beanClass;
    }
 
    public void setBeanClass(String beanClass) {
        this.beanClass = beanClass;
    }
 
    public String getIsConcurrent() {
        return isConcurrent;
    }
 
    public void setIsConcurrent(String isConcurrent) {
        this.isConcurrent = isConcurrent;
    }
 
    public String getSpringId() {
        return springId;
    }
 
    public void setSpringId(String springId) {
        this.springId = springId;
    }
 
    public String getMethodName() {
        return methodName;
    }
 
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
 
    @Override
    public String toString() {
        return "ScheduleJob [id=" + id + ", jobName=" + jobName + ", jobGroup=" + jobGroup + ", jobStatus=" + jobStatus + ", cronExpression=" + cronExpression + ", description=" + description + ", createTime=" + createTime + ", updateTime=" + updateTime + ", beanClass=" + beanClass + ", isConcurrent=" + isConcurrent + ", springId=" + springId + ", methodName=" + methodName + "]";
    }
 }
