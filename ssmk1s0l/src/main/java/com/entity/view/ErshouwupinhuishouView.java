package com.entity.view;

import com.entity.ErshouwupinhuishouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 二手物品回收
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-25 09:46:03
 */
@TableName("ershouwupinhuishou")
public class ErshouwupinhuishouView  extends ErshouwupinhuishouEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ErshouwupinhuishouView(){
	}
 
 	public ErshouwupinhuishouView(ErshouwupinhuishouEntity ershouwupinhuishouEntity){
 	try {
			BeanUtils.copyProperties(this, ershouwupinhuishouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
