package org.huiche.examples.sql.builder;

import org.huiche.examples.sql.builder.entity.complex.Student;
import org.huiche.extra.sql.builder.SqlBuilder;

/**
 * 开发工具类,建议将模块放置到单独的不会被打包的独立模块中,只需要开发的时候根据情况执行
 *
 * @author Maning
 */
public class CreateTable {
    /**
     * 自行修改
     */
    private interface Config {
        String URL = "jdbc:mysql://127.0.0.1:3306/huiche_sql_builder?useSSL=true&createDatabaseIfNotExist=true";
        String USER = "root";
        String PASSWORD = "root";
    }

    public static void main(String[] args) {
        // 不指定Package或class时,默认扫描classPath已经加载的添加有@Table注解的所有实体类
        runWithUpdate();
    }

    /**
     * 创建数据库,添加新的字段,但不会对已有字段修改和删除,会在控制台输出要修改和删除字段的SQL,可自行执行
     */
    private static void run() {
        SqlBuilder builder = SqlBuilder.init(Config.URL, Config.USER, Config.PASSWORD);
        builder.run();
    }

    /**
     * 创建并更新数据库,同时执行修改字段和删除字段
     */
    private static void runWithUpdate() {
        SqlBuilder builder = SqlBuilder.init(Config.URL, Config.USER, Config.PASSWORD);
        builder.run(true);
    }

    /**
     * 仅生成部分package下的实体类
     */
    private static void runSomePackage() {
        SqlBuilder builder = SqlBuilder.init(Config.URL, Config.USER, Config.PASSWORD);
        // 通过类获取包名
        builder.run(Student.class.getPackage().getName());
        // 直接写包名
        builder.run("org.huiche.examples.sql.builder.entity.complex");
        // 同样可以指定update
        builder.run(true, Student.class.getPackage().getName());
    }

    /**
     * 仅生成部分实体类
     */
    private static void runSomeEntity() {
        SqlBuilder builder = SqlBuilder.init(Config.URL, Config.USER, Config.PASSWORD);
        // 通过类获取包名
        builder.run(Student.class);
        // 同样可以指定update
        builder.run(true, Student.class);
    }

    /**
     * 改变init方法
     */
    private static void runByOtherInit() {
        SqlBuilder builder = SqlBuilder.init(Config.URL, Config.USER, Config.PASSWORD, "自定义扫描根路径");
        builder.run(true);
    }
}
