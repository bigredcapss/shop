package com.lg.mall.goods.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lg.mall.goods.mapper.BrandMapper;
import com.lg.mall.goods.model.Brand;
import com.lg.mall.goods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author BigRedCaps
 * @date 2021/4/18 17:01
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper,Brand> implements BrandService
{
    @Autowired
    private BrandMapper brandMapper;

    /**
     * 条件查询
     * @param brand
     * @return
     */
    @Override
    public List<Brand> queryList(Brand brand) {
        //条件包装对象
        QueryWrapper<Brand> queryWrapper = new QueryWrapper<Brand>();
        //根据name查询品牌
        queryWrapper.like("name",brand.getName());

        //根据initial查询
        queryWrapper.eq("initial",brand.getInitial());
        return brandMapper.selectList(queryWrapper);
    }

    /**
     * 条件分页查询
     * @param brand
     * @param currentPage
     * @param size
     * @return
     */
    @Override
    public Page<Brand> queryPageList(Brand brand, Long currentPage, Long size) {
        //条件包装对象
        QueryWrapper<Brand> queryWrapper = new QueryWrapper<Brand>();
        //根据name查询品牌
        queryWrapper.like("name",brand.getName());
        return brandMapper.selectPage(new Page<Brand>(currentPage,size),queryWrapper);
    }
}
