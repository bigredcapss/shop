package com.lg.mall.goods.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author BigRedCaps
 * @date 2021/4/18 16:46
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("brand")
public class Brand
{
    /**
     * ID（主键）
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 品牌名字
     */
    private String name;
    /**
     * 品牌图片
     */
    private String image;
    /**
     * 品牌首字母
     */
    private String initial;
    /**
     * 排序
     */
    private Integer sort;
}
