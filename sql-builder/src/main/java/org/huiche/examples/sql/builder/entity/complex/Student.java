package org.huiche.examples.sql.builder.entity.complex;


import org.huiche.annotation.sql.Column;
import org.huiche.annotation.sql.Table;

/**
 * @author Maning
 */
@Table(comment = "学生信息")
public class Student extends BaseEntity<Long> {
    @Column(comment = "姓名", length = 6, notNull = true)
    private String name;
    @Column(comment = "年龄", notNull = true)
    private Integer age;
    @Column(comment = "简介", length = 200)
    private String bio;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bio='" + bio + '\'' +
                "}," + super.toString();
    }
}
