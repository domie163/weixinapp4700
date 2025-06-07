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


import com.dao.ShenghuojiaofeichuDao;
import com.entity.ShenghuojiaofeichuEntity;
import com.service.ShenghuojiaofeichuService;
import com.entity.vo.ShenghuojiaofeichuVO;
import com.entity.view.ShenghuojiaofeichuView;

@Service("shenghuojiaofeichuService")
public class ShenghuojiaofeichuServiceImpl extends ServiceImpl<ShenghuojiaofeichuDao, ShenghuojiaofeichuEntity> implements ShenghuojiaofeichuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenghuojiaofeichuEntity> page = this.selectPage(
                new Query<ShenghuojiaofeichuEntity>(params).getPage(),
                new EntityWrapper<ShenghuojiaofeichuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenghuojiaofeichuEntity> wrapper) {
		  Page<ShenghuojiaofeichuView> page =new Query<ShenghuojiaofeichuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenghuojiaofeichuVO> selectListVO(Wrapper<ShenghuojiaofeichuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenghuojiaofeichuVO selectVO(Wrapper<ShenghuojiaofeichuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenghuojiaofeichuView> selectListView(Wrapper<ShenghuojiaofeichuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenghuojiaofeichuView selectView(Wrapper<ShenghuojiaofeichuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
