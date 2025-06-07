package com.dao;

import com.entity.ShenghuojiaofeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenghuojiaofeiVO;
import com.entity.view.ShenghuojiaofeiView;


/**
 * 生活缴费
 * 
 * @author 
 * @email 
 * @date 2023-05-25 09:46:02
 */
public interface ShenghuojiaofeiDao extends BaseMapper<ShenghuojiaofeiEntity> {
	
	List<ShenghuojiaofeiVO> selectListVO(@Param("ew") Wrapper<ShenghuojiaofeiEntity> wrapper);
	
	ShenghuojiaofeiVO selectVO(@Param("ew") Wrapper<ShenghuojiaofeiEntity> wrapper);
	
	List<ShenghuojiaofeiView> selectListView(@Param("ew") Wrapper<ShenghuojiaofeiEntity> wrapper);

	List<ShenghuojiaofeiView> selectListView(Pagination page,@Param("ew") Wrapper<ShenghuojiaofeiEntity> wrapper);
	
	ShenghuojiaofeiView selectView(@Param("ew") Wrapper<ShenghuojiaofeiEntity> wrapper);
	

}
