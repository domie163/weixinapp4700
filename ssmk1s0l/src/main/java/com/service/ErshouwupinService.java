package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ErshouwupinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ErshouwupinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ErshouwupinView;


/**
 * 二手物品
 *
 * @author 
 * @email 
 * @date 2023-05-25 09:46:03
 */
public interface ErshouwupinService extends IService<ErshouwupinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ErshouwupinVO> selectListVO(Wrapper<ErshouwupinEntity> wrapper);
   	
   	ErshouwupinVO selectVO(@Param("ew") Wrapper<ErshouwupinEntity> wrapper);
   	
   	List<ErshouwupinView> selectListView(Wrapper<ErshouwupinEntity> wrapper);
   	
   	ErshouwupinView selectView(@Param("ew") Wrapper<ErshouwupinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ErshouwupinEntity> wrapper);
   	

}

