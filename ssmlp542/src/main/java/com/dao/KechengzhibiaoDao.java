package com.dao;

import com.entity.KechengzhibiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengzhibiaoVO;
import com.entity.view.KechengzhibiaoView;


/**
 * 课程指标
 * 
 * @author 
 * @email 
 * @date 2021-04-25 10:34:00
 */
public interface KechengzhibiaoDao extends BaseMapper<KechengzhibiaoEntity> {
	
	List<KechengzhibiaoVO> selectListVO(@Param("ew") Wrapper<KechengzhibiaoEntity> wrapper);
	
	KechengzhibiaoVO selectVO(@Param("ew") Wrapper<KechengzhibiaoEntity> wrapper);
	
	List<KechengzhibiaoView> selectListView(@Param("ew") Wrapper<KechengzhibiaoEntity> wrapper);

	List<KechengzhibiaoView> selectListView(Pagination page,@Param("ew") Wrapper<KechengzhibiaoEntity> wrapper);
	
	KechengzhibiaoView selectView(@Param("ew") Wrapper<KechengzhibiaoEntity> wrapper);
	
}
