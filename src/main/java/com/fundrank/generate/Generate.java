package com.fundrank.generate;

import org.mybatis.generator.api.ShellRunner;

/**
 * Created by kunjie.zhang on 2018/6/2.
 */
public class Generate {
    public static void main(String[] args) {
        args = new String[]{"-configfile", "src//main//resources//mybatis-generator-config.xml", "-overwrite"};
        ShellRunner.main(args);
    }
}
