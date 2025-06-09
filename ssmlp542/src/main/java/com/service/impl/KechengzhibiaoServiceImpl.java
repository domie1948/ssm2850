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


import com.dao.KechengzhibiaoDao;
import com.entity.KechengzhibiaoEntity;
import com.service.KechengzhibiaoService;
import com.entity.vo.KechengzhibiaoVO;
import com.entity.view.KechengzhibiaoView;

@Service("kechengzhibiaoService")
public class KechengzhibiaoServiceImpl extends ServiceImpl<KechengzhibiaoDao, KechengzhibiaoEntity> implements KechengzhibiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengzhibiaoEntity> page = this.selectPage(
                new Query<KechengzhibiaoEntity>(params).getPage(),
                new EntityWrapper<KechengzhibiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengzhibiaoEntity> wrapper) {
		  Page<KechengzhibiaoView> page =new Query<KechengzhibiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengzhibiaoVO> selectListVO(Wrapper<KechengzhibiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengzhibiaoVO selectVO(Wrapper<KechengzhibiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengzhibiaoView> selectListView(Wrapper<KechengzhibiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengzhibiaoView selectView(Wrapper<KechengzhibiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
