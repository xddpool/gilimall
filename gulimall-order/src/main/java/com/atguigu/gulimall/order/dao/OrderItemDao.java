package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author xiongxiao
 * @email sunlightcs@gmail.com
 * @date 2022-02-22 23:05:53
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
