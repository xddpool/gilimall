package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * 一. 如何使用Nacos作为配置中心管理配置
 * 1. 引入依赖
 *         <dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *         </dependency>
 * 2. 创建一个bootstrap.properties加入以下配置
 *          spring.application.name=gulimail-coupon
 *          spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 * 3. 给配置中心添加一个数据集(Data Id) gulimall-coupon.properties 默认规则 应用名.properties
 * 4. 给 应用名.properties 添加任何配置
 * 5. 动态获取配置需要的注解
 *          @RefreshScope: 动态获取并且刷新配置
 *          @Value: (${配置项的名}): 获取到配置的内容
 *   - 如果配置中心和当前配置文件用了相同的配置,优先使用配置中心的配置
 *
 * 二. 细节
 * 1. 命名空间: 配置隔离;
 *      默认: public(保留空间): 默认新增的所有配置都在public空间
 *      1. 开发 测试 生产:
 * 2. 配置集
 * 3. 配置集id
 * 4. 配置分组
 *
 */

@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
