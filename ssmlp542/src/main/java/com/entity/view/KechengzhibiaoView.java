package com.entity.view;

import com.entity.KechengzhibiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课程指标
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-25 10:34:00
 */
@TableName("kechengzhibiao")
public class KechengzhibiaoView  extends KechengzhibiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KechengzhibiaoView(){
	}
 
 	public KechengzhibiaoView(KechengzhibiaoEntity kechengzhibiaoEntity){
 	try {
			BeanUtils.copyProperties(this, kechengzhibiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
