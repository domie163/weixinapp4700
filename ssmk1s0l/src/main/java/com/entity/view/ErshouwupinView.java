package com.entity.view;

import com.entity.ErshouwupinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 二手物品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-25 09:46:03
 */
@TableName("ershouwupin")
public class ErshouwupinView  extends ErshouwupinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ErshouwupinView(){
	}
 
 	public ErshouwupinView(ErshouwupinEntity ershouwupinEntity){
 	try {
			BeanUtils.copyProperties(this, ershouwupinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
