package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ErshouwupinhuishouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ErshouwupinhuishouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ErshouwupinhuishouView;


/**
 * 二手物品回收
 *
 * @author 
 * @email 
 * @date 2023-05-25 09:46:03
 */
public interface ErshouwupinhuishouService extends IService<ErshouwupinhuishouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ErshouwupinhuishouVO> selectListVO(Wrapper<ErshouwupinhuishouEntity> wrapper);
   	
   	ErshouwupinhuishouVO selectVO(@Param("ew") Wrapper<ErshouwupinhuishouEntity> wrapper);
   	
   	List<ErshouwupinhuishouView> selectListView(Wrapper<ErshouwupinhuishouEntity> wrapper);
   	
   	ErshouwupinhuishouView selectView(@Param("ew") Wrapper<ErshouwupinhuishouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ErshouwupinhuishouEntity> wrapper);
   	

}

