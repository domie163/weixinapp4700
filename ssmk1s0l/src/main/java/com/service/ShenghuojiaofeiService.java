package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenghuojiaofeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenghuojiaofeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenghuojiaofeiView;


/**
 * 生活缴费
 *
 * @author 
 * @email 
 * @date 2023-05-25 09:46:02
 */
public interface ShenghuojiaofeiService extends IService<ShenghuojiaofeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenghuojiaofeiVO> selectListVO(Wrapper<ShenghuojiaofeiEntity> wrapper);
   	
   	ShenghuojiaofeiVO selectVO(@Param("ew") Wrapper<ShenghuojiaofeiEntity> wrapper);
   	
   	List<ShenghuojiaofeiView> selectListView(Wrapper<ShenghuojiaofeiEntity> wrapper);
   	
   	ShenghuojiaofeiView selectView(@Param("ew") Wrapper<ShenghuojiaofeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenghuojiaofeiEntity> wrapper);
   	

}

