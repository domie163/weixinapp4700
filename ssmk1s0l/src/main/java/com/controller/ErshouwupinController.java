package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ErshouwupinEntity;
import com.entity.view.ErshouwupinView;

import com.service.ErshouwupinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 二手物品
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-25 09:46:03
 */
@RestController
@RequestMapping("/ershouwupin")
public class ErshouwupinController {
    @Autowired
    private ErshouwupinService ershouwupinService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ErshouwupinEntity ershouwupin, 
		HttpServletRequest request){

        EntityWrapper<ErshouwupinEntity> ew = new EntityWrapper<ErshouwupinEntity>();


		PageUtils page = ershouwupinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ershouwupin), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ErshouwupinEntity ershouwupin, 
		HttpServletRequest request){
        EntityWrapper<ErshouwupinEntity> ew = new EntityWrapper<ErshouwupinEntity>();

		PageUtils page = ershouwupinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ershouwupin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ErshouwupinEntity ershouwupin){
       	EntityWrapper<ErshouwupinEntity> ew = new EntityWrapper<ErshouwupinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( ershouwupin, "ershouwupin")); 
        return R.ok().put("data", ershouwupinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ErshouwupinEntity ershouwupin){
        EntityWrapper< ErshouwupinEntity> ew = new EntityWrapper< ErshouwupinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( ershouwupin, "ershouwupin")); 
		ErshouwupinView ershouwupinView =  ershouwupinService.selectView(ew);
		return R.ok("查询二手物品成功").put("data", ershouwupinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ErshouwupinEntity ershouwupin = ershouwupinService.selectById(id);
        return R.ok().put("data", ershouwupin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ErshouwupinEntity ershouwupin = ershouwupinService.selectById(id);
        return R.ok().put("data", ershouwupin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ErshouwupinEntity ershouwupin, HttpServletRequest request){
    	ershouwupin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ershouwupin);

        ershouwupinService.insert(ershouwupin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ErshouwupinEntity ershouwupin, HttpServletRequest request){
    	ershouwupin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ershouwupin);

        ershouwupinService.insert(ershouwupin);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ErshouwupinEntity ershouwupin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(ershouwupin);
        ershouwupinService.updateById(ershouwupin);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        ershouwupinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
