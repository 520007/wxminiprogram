package com.taixin.wxminiprogram.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 支付单价信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Pay {
    private Integer id;
    private String name;//商品名
    private Double unitPrice;//单价
}
