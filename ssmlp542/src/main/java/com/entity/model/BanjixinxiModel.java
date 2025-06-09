package com.entity.model;

import com.entity.BanjixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 班级信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-25 10:34:00
 */
public class BanjixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
