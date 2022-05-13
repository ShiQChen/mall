package com.atguigu.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by 石其琛
 * Project_Name gulimall
 * Description
 * On 2022/5/13 22:27
 */

@Data
public class SpuBoundsTo {
    private Long spuId;
    private BigDecimal buyBounds;
    private BigDecimal growBounds;
}
