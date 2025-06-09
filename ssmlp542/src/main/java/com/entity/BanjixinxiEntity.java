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
 * 班级信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-25 10:34:00
 */
@TableName("banjixinxi")
public class BanjixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BanjixinxiEntity() {
		
	}
	
	public BanjixinxiEntity(T t) {
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
	 * 班级名称
	 */
					
	private String banjimingcheng;
	
	/**
	 * 班主任
	 */
					
	private String banzhuren;
	
	/**
	 * 班长
	 */
					
	private String banzhang;
	
	/**
	 * 学生联络员
	 */
					
	private String xueshenglianluoyuan;
	
	/**
	 * 实践老师
	 */
					
	private String shijianlaoshi;
	
	
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
	 * 设置：班级名称
	 */
	public void setBanjimingcheng(String banjimingcheng) {
		this.banjimingcheng = banjimingcheng;
	}
	/**
	 * 获取：班级名称
	 */
	public String getBanjimingcheng() {
		return banjimingcheng;
	}
	/**
	 * 设置：班主任
	 */
	public void setBanzhuren(String banzhuren) {
		this.banzhuren = banzhuren;
	}
	/**
	 * 获取：班主任
	 */
	public String getBanzhuren() {
		return banzhuren;
	}
	/**
	 * 设置：班长
	 */
	public void setBanzhang(String banzhang) {
		this.banzhang = banzhang;
	}
	/**
	 * 获取：班长
	 */
	public String getBanzhang() {
		return banzhang;
	}
	/**
	 * 设置：学生联络员
	 */
	public void setXueshenglianluoyuan(String xueshenglianluoyuan) {
		this.xueshenglianluoyuan = xueshenglianluoyuan;
	}
	/**
	 * 获取：学生联络员
	 */
	public String getXueshenglianluoyuan() {
		return xueshenglianluoyuan;
	}
	/**
	 * 设置：实践老师
	 */
	public void setShijianlaoshi(String shijianlaoshi) {
		this.shijianlaoshi = shijianlaoshi;
	}
	/**
	 * 获取：实践老师
	 */
	public String getShijianlaoshi() {
		return shijianlaoshi;
	}

}
