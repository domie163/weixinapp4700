package com.dao;

import com.entity.ErshouwupinhuishouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ErshouwupinhuishouVO;
import com.entity.view.ErshouwupinhuishouView;


/**
 * 二手物品回收
 * 
 * @author 
 * @email 
 * @date 2023-05-25 09:46:03
 */
public interface ErshouwupinhuishouDao extends BaseMapper<ErshouwupinhuishouEntity> {
	
	List<ErshouwupinhuishouVO> selectListVO(@Param("ew") Wrapper<ErshouwupinhuishouEntity> wrapper);
	
	ErshouwupinhuishouVO selectVO(@Param("ew") Wrapper<ErshouwupinhuishouEntity> wrapper);
	
	List<ErshouwupinhuishouView> selectListView(@Param("ew") Wrapper<ErshouwupinhuishouEntity> wrapper);

	List<ErshouwupinhuishouView> selectListView(Pagination page,@Param("ew") Wrapper<ErshouwupinhuishouEntity> wrapper);
	
	ErshouwupinhuishouView selectView(@Param("ew") Wrapper<ErshouwupinhuishouEntity> wrapper);
	

}
