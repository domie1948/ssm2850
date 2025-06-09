package com.entity.model;

import com.entity.KechengzhibiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 课程指标
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-25 10:34:00
 */
public class KechengzhibiaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
