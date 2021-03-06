package com.everyouthtech.oa.secret.orm.pojo;

import java.io.Serializable;

/**
 * t_parents_dictory_secret
 */
//保密系统父类字典表
public class ParentsDictorySecret implements Serializable {
    /**
     * 保密系统父类字典表，代表字典编码
     */
    //@swagger//@ApiModelProperty(value = "保密系统父类字典表，代表字典编码;长度为19", required=true)
    private Long id;

    /**
     * 保密系统父类字典编码说明
     */
    //@swagger//@ApiModelProperty(value = "保密系统父类字典编码说明;长度为32", required=true)
    private String name;

    /**
    
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}