package com.ggs.docker;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Collections;

public class DockerPracticeDemoApplicationTests {

    @Test
    void contextLoads() {
        File absoluteFile = new File("").getAbsoluteFile();
        FastAutoGenerator.create("jdbc:mysql://192.168.1.104:3306/docker_demo", "root", "123456")
                .globalConfig(builder -> {
                    builder.author("starbug") // 设置作者
                            .fileOverride() // 覆盖已生成文件
                            .outputDir(absoluteFile + "/src/main/java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.ggs") // 设置父包名
                            .moduleName("docker") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, absoluteFile + "/src/main/resources/mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("member"); // 设置需要生成的表名
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }

}
