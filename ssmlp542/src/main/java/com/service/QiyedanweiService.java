package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiyedanweiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiyedanweiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiyedanweiView;


/**
 * 企业单位
 *
 * @author 
 * @email 
 * @date 2021-04-25 10:34:00
 */
public interface QiyedanweiService extends IService<QiyedanweiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiyedanweiVO> selectListVO(Wrapper<QiyedanweiEntity> wrapper);
   	
   	QiyedanweiVO selectVO(@Param("ew") Wrapper<QiyedanweiEntity> wrapper);
   	
   	List<QiyedanweiView> selectListView(Wrapper<QiyedanweiEntity> wrapper);
   	
   	QiyedanweiView selectView(@Param("ew") Wrapper<QiyedanweiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiyedanweiEntity> wrapper);
   	
}

