package com.git.test;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class Generator {
	public static void main(String[] args) {
		
		AutoGenerator generator = new AutoGenerator();
		generator.setTemplateEngine(new FreemarkerTemplateEngine());
		
		//全局配置
		GlobalConfig config = new GlobalConfig();
		config.setAuthor(" ");
		config.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
		//是否覆盖同名文件
		config.setFileOverride(false);
		//是否需要ActiveRecord特性
		config.setActiveRecord(true);
		//xml 二级缓存
		config.setEnableCache(false);
		//xml ResultMap
		config.setBaseResultMap(true);
		//xml columList
		config.setBaseColumnList(false);
		generator.setGlobalConfig(config);
		
		//数据源
		DataSourceConfig dataSource = new DataSourceConfig();
		dataSource.setUrl("jdbc:mysql://localhost:3306/info?useSSL=false&serverTimezone=UTC&characterEncoding=utf8&allowPublicKeyRetrieval=true&useSSL=false");
		dataSource.setDriverName("com.mysql.cj.jdbc.Driver");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");
		generator.setDataSource(dataSource);
		
		//策略配置
		StrategyConfig strategy = new StrategyConfig();
		//表名生成策略
		strategy.setNaming(NamingStrategy.underline_to_camel);
		//需要生成的表
		strategy.setInclude(new String[] {"user"});
		strategy.setEntityBuilderModel(true);
		generator.setStrategy(strategy);
		
		//包配置
		PackageConfig page = new PackageConfig();
		page.setParent("com.git.test");
		/*page.setModuleName("");
		page.setEntity("");
		page.setMapper("");
		page.setXml("");
		page.setService("");
		page.setServiceImpl("");*/
		generator.setPackageInfo(page);
		
		generator.execute();
	}

}
