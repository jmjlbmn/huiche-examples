package org.huiche.examples.sql.builder.entity.simple;


import org.huiche.annotation.sql.Column;
import org.huiche.annotation.sql.Table;

/**
 * @author Maning
 */
@Table(comment = "教师信息")
public class Teacher {
    @Column(isPrimaryKey = true, isAutoIncrement = false, comment = "主键ID")
    private String id;
    @Column(comment = "姓名", length = 6, notNull = true)
    private String name;
    @Column(comment = "年龄", notNull = true)
    private Integer age;
    @Column(comment = "简介", length = 200)
    private String bio;
}
