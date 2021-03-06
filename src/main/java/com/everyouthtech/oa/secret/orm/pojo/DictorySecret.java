package com.everyouthtech.oa.secret.orm.pojo;

import java.io.Serializable;

/**
 * t_dictory_secret
 */
//保密系统字典子表
public class DictorySecret implements Serializable {
    /**
     * 字典编码
     */
    //@swagger//@ApiModelProperty(value = "字典编码;长度为19", required=true)
    private Long id;

    /**
     * 父类编码
     */
    //@swagger//@ApiModelProperty(value = "父类编码;长度为19", required=true)
    private Long pid;

    /**
     * 字典说明
     */
    //@swagger//@ApiModelProperty(value = "字典说明;长度为50", required=true)
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

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
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
        sb.append(", pid=").append(pid);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}