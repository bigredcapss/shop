package com.lg.mall.goods.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lg.mall.goods.model.Brand;
import com.lg.mall.goods.service.BrandService;
import com.lg.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author BigRedCaps
 * @date 2021/4/18 16:56
 */
@RestController
@RequestMapping(value = "/brand")
public class BrandController
{

    @Autowired
    private BrandService brandService;

    /****
     * 增加方法
     */
    @PostMapping
    public ResponseResult add (@RequestBody Brand brand)
    {
        brandService.save(brand);
        return ResponseResult.ok();
    }

    /****
     * 修改方法
     */
    @PutMapping
    public ResponseResult update (@RequestBody Brand brand)
    {
        brandService.updateById(brand);
        return ResponseResult.ok();
    }

    /****
     * 删除方法
     */
    @DeleteMapping("/{id}")
    public ResponseResult delete (@PathVariable(value = "id") String id)
    {
        brandService.removeById(id);
        return ResponseResult.ok();
    }

    /****
     * 条件查询
     */
    @PostMapping(value = "/search")
    public ResponseResult<List<Brand>> queryList (@RequestBody Brand brand)
    {
        List<Brand> brands = brandService.queryList(brand);
        return ResponseResult.ok(brands);
    }

    /****
     * 条件查询
     */
    @PostMapping(value = "/search/{page}/{size}")
    public ResponseResult<Page<Brand>> queryPageList (@PathVariable(value = "page") Long page,
                                                      @PathVariable(value = "size") Long size,
                                                      @RequestBody Brand brand)
    {
        Page<Brand> pageInfo = brandService.queryPageList(brand, page, size);
        return ResponseResult.ok(pageInfo);
    }
}
