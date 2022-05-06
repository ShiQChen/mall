package com.atguigu.common.constant;

/**
 * Created by 石其琛
 * Project_Name gulimall
 * Description
 * On 2022/5/5 16:38
 */
public class ProductConstant {
    public enum AttrEnum {
        ATTR_TYPE_BASE(1, "基本属性"), ATTR_TYPE_SALE(0, "销售属性");

        private int code;
        private String msg;

        AttrEnum(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public int getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }
    }
}
