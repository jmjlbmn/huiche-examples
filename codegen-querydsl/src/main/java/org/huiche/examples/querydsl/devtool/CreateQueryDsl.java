package org.huiche.examples.querydsl.devtool;

import org.huiche.extra.codegen.querydsl.CodeGenQueryDsl;

/**
 * 开发工具类,建议将模块放置到单独的不会被打包的独立模块中,只需要开发的时候根据情况执行
 *
 * @author Maning
 */
public class CreateQueryDsl {
    /**
     * 自行修改
     */
    private interface Config {
        /**
         * 请选择已经有表的数据库或配合sql_builder生成表后执行
         */
        String URL = "jdbc:mysql://127.0.0.1:3306/huiche_sql_builder?useSSL=true&createDatabaseIfNotExist=true";
        String USER = "root";
        String PASSWORD = "root";
        /**
         * 可自行指定路径,生成后手动复制到项目路径即可,也可以直接指定到项目路径进行覆盖(不推荐)
         */
        String CODE_GEN_PATH = "D:\\HuiCheCodeGen";

    }

    public static void main(String[] args) {
        CodeGenQueryDsl codeGen = CodeGenQueryDsl.init(Config.URL, Config.USER, Config.PASSWORD, Config.CODE_GEN_PATH);
        // 生成表
        codeGen.exportTable();
        // 生成视图
        codeGen.exportView();
        System.out.println("生成成功,路径 " + Config.CODE_GEN_PATH);
    }

}
