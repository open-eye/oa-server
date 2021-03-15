package org.example.oa.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Yu
 * 政治身份 实体类
 */
@Data
public class Politicsstatus implements Serializable {
    private Integer id;

    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o){ return true;}
        if (o == null || getClass() != o.getClass()){ return false;}
        Politicsstatus that = (Politicsstatus) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}
