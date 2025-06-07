package com.entity.view;

import com.entity.ShenghuojiaofeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 生活缴费
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-25 09:46:02
 */
@TableName("shenghuojiaofei")
public class ShenghuojiaofeiView  extends ShenghuojiaofeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShenghuojiaofeiView(){
	}
 
 	public ShenghuojiaofeiView(ShenghuojiaofeiEntity shenghuojiaofeiEntity){
 	try {
			BeanUtils.copyProperties(this, shenghuojiaofeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
