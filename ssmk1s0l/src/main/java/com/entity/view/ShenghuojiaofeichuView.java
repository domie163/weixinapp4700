package com.entity.view;

import com.entity.ShenghuojiaofeichuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 生活缴费处
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-25 09:46:02
 */
@TableName("shenghuojiaofeichu")
public class ShenghuojiaofeichuView  extends ShenghuojiaofeichuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShenghuojiaofeichuView(){
	}
 
 	public ShenghuojiaofeichuView(ShenghuojiaofeichuEntity shenghuojiaofeichuEntity){
 	try {
			BeanUtils.copyProperties(this, shenghuojiaofeichuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
