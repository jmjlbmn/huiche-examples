package org.huiche.examples.sql.builder.entity.complex;



import org.huiche.annotation.sql.Column;

import java.io.Serializable;

/**
 * 基础实体类
 *
 * @author Maning
 * @version 2017/6/27
 */
@SuppressWarnings("unchecked")
public class BaseEntity<PK> implements Serializable {
    @Column(isPrimaryKey = true, comment = "主键ID")
    private PK id;
    @Column(length = 19, notNull = true, comment = "创建时间,yyyy-MM-dd HH:mm:ss")
    private String createTime;
    @Column(length = 19, notNull = true, comment = "修改时间,yyyy-MM-dd HH:mm:ss")
    private String modifyTime;

    public PK getId() {
        return id;
    }

    public void setId(PK id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                ", createTime='" + createTime + '\'' +
                ", modifyTime='" + modifyTime + '\'' +
                '}';
    }
}