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


import com.dao.ShenghuojiaofeiDao;
import com.entity.ShenghuojiaofeiEntity;
import com.service.ShenghuojiaofeiService;
import com.entity.vo.ShenghuojiaofeiVO;
import com.entity.view.ShenghuojiaofeiView;

@Service("shenghuojiaofeiService")
public class ShenghuojiaofeiServiceImpl extends ServiceImpl<ShenghuojiaofeiDao, ShenghuojiaofeiEntity> implements ShenghuojiaofeiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenghuojiaofeiEntity> page = this.selectPage(
                new Query<ShenghuojiaofeiEntity>(params).getPage(),
                new EntityWrapper<ShenghuojiaofeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenghuojiaofeiEntity> wrapper) {
		  Page<ShenghuojiaofeiView> page =new Query<ShenghuojiaofeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenghuojiaofeiVO> selectListVO(Wrapper<ShenghuojiaofeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenghuojiaofeiVO selectVO(Wrapper<ShenghuojiaofeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenghuojiaofeiView> selectListView(Wrapper<ShenghuojiaofeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenghuojiaofeiView selectView(Wrapper<ShenghuojiaofeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
