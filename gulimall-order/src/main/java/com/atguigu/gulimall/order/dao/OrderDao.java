package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author shiqchen
 * @email shiqchen@gmail.com
 * @date 2022-04-25 11:55:13
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

}
