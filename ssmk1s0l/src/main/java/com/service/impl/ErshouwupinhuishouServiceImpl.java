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


import com.dao.ErshouwupinhuishouDao;
import com.entity.ErshouwupinhuishouEntity;
import com.service.ErshouwupinhuishouService;
import com.entity.vo.ErshouwupinhuishouVO;
import com.entity.view.ErshouwupinhuishouView;

@Service("ershouwupinhuishouService")
public class ErshouwupinhuishouServiceImpl extends ServiceImpl<ErshouwupinhuishouDao, ErshouwupinhuishouEntity> implements ErshouwupinhuishouService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ErshouwupinhuishouEntity> page = this.selectPage(
                new Query<ErshouwupinhuishouEntity>(params).getPage(),
                new EntityWrapper<ErshouwupinhuishouEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ErshouwupinhuishouEntity> wrapper) {
		  Page<ErshouwupinhuishouView> page =new Query<ErshouwupinhuishouView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ErshouwupinhuishouVO> selectListVO(Wrapper<ErshouwupinhuishouEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ErshouwupinhuishouVO selectVO(Wrapper<ErshouwupinhuishouEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ErshouwupinhuishouView> selectListView(Wrapper<ErshouwupinhuishouEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ErshouwupinhuishouView selectView(Wrapper<ErshouwupinhuishouEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
