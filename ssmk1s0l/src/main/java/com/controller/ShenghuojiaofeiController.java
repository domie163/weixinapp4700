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

import com.entity.ShenghuojiaofeiEntity;
import com.entity.view.ShenghuojiaofeiView;

import com.service.ShenghuojiaofeiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 生活缴费
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-25 09:46:02
 */
@RestController
@RequestMapping("/shenghuojiaofei")
public class ShenghuojiaofeiController {
    @Autowired
    private ShenghuojiaofeiService shenghuojiaofeiService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShenghuojiaofeiEntity shenghuojiaofei, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("kehu")) {
			shenghuojiaofei.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShenghuojiaofeiEntity> ew = new EntityWrapper<ShenghuojiaofeiEntity>();


		PageUtils page = shenghuojiaofeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shenghuojiaofei), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShenghuojiaofeiEntity shenghuojiaofei, 
		HttpServletRequest request){
        EntityWrapper<ShenghuojiaofeiEntity> ew = new EntityWrapper<ShenghuojiaofeiEntity>();

		PageUtils page = shenghuojiaofeiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shenghuojiaofei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShenghuojiaofeiEntity shenghuojiaofei){
       	EntityWrapper<ShenghuojiaofeiEntity> ew = new EntityWrapper<ShenghuojiaofeiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shenghuojiaofei, "shenghuojiaofei")); 
        return R.ok().put("data", shenghuojiaofeiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShenghuojiaofeiEntity shenghuojiaofei){
        EntityWrapper< ShenghuojiaofeiEntity> ew = new EntityWrapper< ShenghuojiaofeiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shenghuojiaofei, "shenghuojiaofei")); 
		ShenghuojiaofeiView shenghuojiaofeiView =  shenghuojiaofeiService.selectView(ew);
		return R.ok("查询生活缴费成功").put("data", shenghuojiaofeiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShenghuojiaofeiEntity shenghuojiaofei = shenghuojiaofeiService.selectById(id);
        return R.ok().put("data", shenghuojiaofei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShenghuojiaofeiEntity shenghuojiaofei = shenghuojiaofeiService.selectById(id);
        return R.ok().put("data", shenghuojiaofei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShenghuojiaofeiEntity shenghuojiaofei, HttpServletRequest request){
    	shenghuojiaofei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shenghuojiaofei);

        shenghuojiaofeiService.insert(shenghuojiaofei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShenghuojiaofeiEntity shenghuojiaofei, HttpServletRequest request){
    	shenghuojiaofei.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shenghuojiaofei);

        shenghuojiaofeiService.insert(shenghuojiaofei);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShenghuojiaofeiEntity shenghuojiaofei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shenghuojiaofei);
        shenghuojiaofeiService.updateById(shenghuojiaofei);//全部更新
        return R.ok();
    }

    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shenghuojiaofeiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
