package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 *
 * @author shiqchen
 * @email shiqchen@gmail.com
 * @date 2022-04-25 11:55:13
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {

}
