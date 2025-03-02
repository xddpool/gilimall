package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author xiongxiao
 * @email sunlightcs@gmail.com
 * @date 2022-02-22 23:33:55
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
