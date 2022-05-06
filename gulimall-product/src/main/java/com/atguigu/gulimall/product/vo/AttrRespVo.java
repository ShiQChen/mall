package com.atguigu.gulimall.product.vo;

import lombok.Data;

/**
 * Created by 石其琛
 * Project_Name gulimall
 * Description
 * On 2022/5/5 15:23
 */

@Data
public class AttrRespVo extends AttrVo{
    /**
     * 所属分类名字
     * 所属分组名字
     */
    private String catelogName;
    private String groupName;
    private Long[] catelogPath;
}
