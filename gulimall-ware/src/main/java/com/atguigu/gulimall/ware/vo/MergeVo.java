package com.atguigu.gulimall.ware.vo;

import lombok.Data;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

/**
 * Created by 石其琛
 * Project_Name gulimall
 * Description
 * On 2022/5/15 22:42
 */

@Data
public class MergeVo {
    private Long purchaseId; // 整单 id
    private List<Long> items; // 合并项集合
}
