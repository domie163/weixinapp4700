package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenghuojiaofeichuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenghuojiaofeichuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenghuojiaofeichuView;


/**
 * 生活缴费处
 *
 * @author 
 * @email 
 * @date 2023-05-25 09:46:02
 */
public interface ShenghuojiaofeichuService extends IService<ShenghuojiaofeichuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenghuojiaofeichuVO> selectListVO(Wrapper<ShenghuojiaofeichuEntity> wrapper);
   	
   	ShenghuojiaofeichuVO selectVO(@Param("ew") Wrapper<ShenghuojiaofeichuEntity> wrapper);
   	
   	List<ShenghuojiaofeichuView> selectListView(Wrapper<ShenghuojiaofeichuEntity> wrapper);
   	
   	ShenghuojiaofeichuView selectView(@Param("ew") Wrapper<ShenghuojiaofeichuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenghuojiaofeichuEntity> wrapper);
   	

}

