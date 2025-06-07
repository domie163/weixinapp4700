package com.entity.model;

import com.entity.ErshouwupinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 二手物品
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-05-25 09:46:03
 */
public class ErshouwupinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 物品名称
	 */
	
	private String wupinmingcheng;
		
	/**
	 * 物品分类
	 */
	
	private String wupinfenlei;
		
	/**
	 * 物品封面
	 */
	
	private String wupinfengmian;
		
	/**
	 * 物品简介
	 */
	
	private String wupinjianjie;
		
	/**
	 * 物品数量
	 */
	
	private Integer wupinshuliang;
		
	/**
	 * 物品价格
	 */
	
	private Double wupinjiage;
				
	
	/**
	 * 设置：物品名称
	 */
	 
	public void setWupinmingcheng(String wupinmingcheng) {
		this.wupinmingcheng = wupinmingcheng;
	}
	
	/**
	 * 获取：物品名称
	 */
	public String getWupinmingcheng() {
		return wupinmingcheng;
	}
				
	
	/**
	 * 设置：物品分类
	 */
	 
	public void setWupinfenlei(String wupinfenlei) {
		this.wupinfenlei = wupinfenlei;
	}
	
	/**
	 * 获取：物品分类
	 */
	public String getWupinfenlei() {
		return wupinfenlei;
	}
				
	
	/**
	 * 设置：物品封面
	 */
	 
	public void setWupinfengmian(String wupinfengmian) {
		this.wupinfengmian = wupinfengmian;
	}
	
	/**
	 * 获取：物品封面
	 */
	public String getWupinfengmian() {
		return wupinfengmian;
	}
				
	
	/**
	 * 设置：物品简介
	 */
	 
	public void setWupinjianjie(String wupinjianjie) {
		this.wupinjianjie = wupinjianjie;
	}
	
	/**
	 * 获取：物品简介
	 */
	public String getWupinjianjie() {
		return wupinjianjie;
	}
				
	
	/**
	 * 设置：物品数量
	 */
	 
	public void setWupinshuliang(Integer wupinshuliang) {
		this.wupinshuliang = wupinshuliang;
	}
	
	/**
	 * 获取：物品数量
	 */
	public Integer getWupinshuliang() {
		return wupinshuliang;
	}
				
	
	/**
	 * 设置：物品价格
	 */
	 
	public void setWupinjiage(Double wupinjiage) {
		this.wupinjiage = wupinjiage;
	}
	
	/**
	 * 获取：物品价格
	 */
	public Double getWupinjiage() {
		return wupinjiage;
	}
			
}
