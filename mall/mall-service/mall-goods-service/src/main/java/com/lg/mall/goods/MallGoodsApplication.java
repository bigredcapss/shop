package com.lg.mall.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author BigRedCaps
 * @date 2021/4/18 16:57
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.lg.mall.goods.mapper"})
public class MallGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallGoodsApplication.class,args);
    }
}