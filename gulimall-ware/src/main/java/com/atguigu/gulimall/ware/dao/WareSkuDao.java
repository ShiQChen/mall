package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author shiqchen
 * @email shiqchen@gmail.com
 * @date 2022-04-25 11:56:13
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
