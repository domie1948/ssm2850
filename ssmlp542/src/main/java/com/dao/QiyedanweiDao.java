package com.dao;

import com.entity.QiyedanweiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiyedanweiVO;
import com.entity.view.QiyedanweiView;


/**
 * 企业单位
 * 
 * @author 
 * @email 
 * @date 2021-04-25 10:34:00
 */
public interface QiyedanweiDao extends BaseMapper<QiyedanweiEntity> {
	
	List<QiyedanweiVO> selectListVO(@Param("ew") Wrapper<QiyedanweiEntity> wrapper);
	
	QiyedanweiVO selectVO(@Param("ew") Wrapper<QiyedanweiEntity> wrapper);
	
	List<QiyedanweiView> selectListView(@Param("ew") Wrapper<QiyedanweiEntity> wrapper);

	List<QiyedanweiView> selectListView(Pagination page,@Param("ew") Wrapper<QiyedanweiEntity> wrapper);
	
	QiyedanweiView selectView(@Param("ew") Wrapper<QiyedanweiEntity> wrapper);
	
}
