package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengzhibiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengzhibiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengzhibiaoView;


/**
 * 课程指标
 *
 * @author 
 * @email 
 * @date 2021-04-25 10:34:00
 */
public interface KechengzhibiaoService extends IService<KechengzhibiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengzhibiaoVO> selectListVO(Wrapper<KechengzhibiaoEntity> wrapper);
   	
   	KechengzhibiaoVO selectVO(@Param("ew") Wrapper<KechengzhibiaoEntity> wrapper);
   	
   	List<KechengzhibiaoView> selectListView(Wrapper<KechengzhibiaoEntity> wrapper);
   	
   	KechengzhibiaoView selectView(@Param("ew") Wrapper<KechengzhibiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengzhibiaoEntity> wrapper);
   	
}

