package com.atguigu.gulimall.product.feign;

import com.atguigu.common.to.SpuBoundsTo;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by 石其琛
 * Project_Name gulimall
 * Description
 * On 2022/5/13 22:22
 */

@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    void saveSpuBounds(SpuBoundsTo spuBoundsTo);
}
