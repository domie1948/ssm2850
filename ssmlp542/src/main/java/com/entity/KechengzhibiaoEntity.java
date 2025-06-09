package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 课程指标
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-25 10:34:00
 */
@TableName("kechengzhibiao")
public class KechengzhibiaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KechengzhibiaoEntity() {
		
	}
	
	public KechengzhibiaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 项目
	 */
					
	private String xiangmu;
	
	/**
	 * 评审内容
	 */
					
	private String pingshenneirong;
	
	/**
	 * 评审标准
	 */
					
	private String pingshenbiaozhun;
	
	/**
	 * 分数
	 */
					
	private Integer fenshu;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：项目
	 */
	public void setXiangmu(String xiangmu) {
		this.xiangmu = xiangmu;
	}
	/**
	 * 获取：项目
	 */
	public String getXiangmu() {
		return xiangmu;
	}
	/**
	 * 设置：评审内容
	 */
	public void setPingshenneirong(String pingshenneirong) {
		this.pingshenneirong = pingshenneirong;
	}
	/**
	 * 获取：评审内容
	 */
	public String getPingshenneirong() {
		return pingshenneirong;
	}
	/**
	 * 设置：评审标准
	 */
	public void setPingshenbiaozhun(String pingshenbiaozhun) {
		this.pingshenbiaozhun = pingshenbiaozhun;
	}
	/**
	 * 获取：评审标准
	 */
	public String getPingshenbiaozhun() {
		return pingshenbiaozhun;
	}
	/**
	 * 设置：分数
	 */
	public void setFenshu(Integer fenshu) {
		this.fenshu = fenshu;
	}
	/**
	 * 获取：分数
	 */
	public Integer getFenshu() {
		return fenshu;
	}

}
