package com.lg.mall.goods.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lg.mall.goods.model.Brand;

import java.util.List;

/**
 * @author BigRedCaps
 * @date 2021/4/18 16:57
 */
public interface BrandService extends IService<Brand>
{
    /**
     * 条件查询
     * @param brand
     * @return
     */
    List<Brand> queryList(Brand brand);

    /**
     * 条件分页查询
     * @param brand
     * @param currentPage
     * @param size
     * @return
     */
    Page<Brand> queryPageList(Brand brand, Long currentPage, Long size);

}
