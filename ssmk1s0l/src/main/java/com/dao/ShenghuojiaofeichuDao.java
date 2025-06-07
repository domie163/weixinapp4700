package com.dao;

import com.entity.ShenghuojiaofeichuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenghuojiaofeichuVO;
import com.entity.view.ShenghuojiaofeichuView;


/**
 * 生活缴费处
 * 
 * @author 
 * @email 
 * @date 2023-05-25 09:46:02
 */
public interface ShenghuojiaofeichuDao extends BaseMapper<ShenghuojiaofeichuEntity> {
	
	List<ShenghuojiaofeichuVO> selectListVO(@Param("ew") Wrapper<ShenghuojiaofeichuEntity> wrapper);
	
	ShenghuojiaofeichuVO selectVO(@Param("ew") Wrapper<ShenghuojiaofeichuEntity> wrapper);
	
	List<ShenghuojiaofeichuView> selectListView(@Param("ew") Wrapper<ShenghuojiaofeichuEntity> wrapper);

	List<ShenghuojiaofeichuView> selectListView(Pagination page,@Param("ew") Wrapper<ShenghuojiaofeichuEntity> wrapper);
	
	ShenghuojiaofeichuView selectView(@Param("ew") Wrapper<ShenghuojiaofeichuEntity> wrapper);
	

}
