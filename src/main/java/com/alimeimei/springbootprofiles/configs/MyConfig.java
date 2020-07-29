package com.alimeimei.springbootprofiles.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by PengWX on 2020/7/28.
 */
@Configuration
@PropertySource(value = {"classpath:/profiles/test/test.properties","classpath:/profiles/dev/dev.properties","classpath:/profiles/product/product.properties"})//这样写会使用最后一个配置文件的数据.
public class MyConfig {


}
