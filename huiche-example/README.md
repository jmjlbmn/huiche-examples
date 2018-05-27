# simple-web-server
开始之前,您应该熟悉maven和spring-boot
1. 配置pom文件parent为org.huiche:huiche(推荐,也可以使用dependencyManagement来import)
    ```xml
        <parent>
            <groupId>org.huiche</groupId>
            <artifactId>huiche</artifactId>
            <version>1.0.1</version>
        </parent>
    ```
2. 增加依赖org.huiche:huiche-spring-boot-starter
    ```xml
        <dependencies>
            <dependency>
                <groupId>org.huiche</groupId>
                <artifactId>huiche-spring-boot-starter</artifactId>
            </dependency>
            <!--其他依赖-->
        </dependencies>
    ```
3. 增加数据库依赖,如mysql:mysql-connector-java
    ```xml
        <dependencies>
            <!--其他依赖-->
            <!--数据库依赖-->
            <dependency>
                <groupId>mysql</groupId>
                <artifactId>mysql-connector-java</artifactId>
                <scope>runtime</scope>
            </dependency>
        </dependencies>
    ```
4. 在resource文件夹增加一个application.yml文件,然后配置数据库
    ```yaml
        spring:
          datasource:
            url: jdbc:mysql://localhost:3306/DB_Name?useSSL=true&createDatabaseIfNotExist=true
            username: 用户名
            password: 密码
    ```
5. 在java文件夹增加App.java文件(名称随意,包名看自己)
    ```java
        @SpringBootApplication
        public class App {
            public static void main(String[] args) {
                SpringApplication.run(App.class, args);
            }
        }
    ```
6. 执行main方法即可
