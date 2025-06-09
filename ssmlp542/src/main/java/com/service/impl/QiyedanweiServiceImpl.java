package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.QiyedanweiDao;
import com.entity.QiyedanweiEntity;
import com.service.QiyedanweiService;
import com.entity.vo.QiyedanweiVO;
import com.entity.view.QiyedanweiView;

@Service("qiyedanweiService")
public class QiyedanweiServiceImpl extends ServiceImpl<QiyedanweiDao, QiyedanweiEntity> implements QiyedanweiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiyedanweiEntity> page = this.selectPage(
                new Query<QiyedanweiEntity>(params).getPage(),
                new EntityWrapper<QiyedanweiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiyedanweiEntity> wrapper) {
		  Page<QiyedanweiView> page =new Query<QiyedanweiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiyedanweiVO> selectListVO(Wrapper<QiyedanweiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiyedanweiVO selectVO(Wrapper<QiyedanweiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiyedanweiView> selectListView(Wrapper<QiyedanweiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiyedanweiView selectView(Wrapper<QiyedanweiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
