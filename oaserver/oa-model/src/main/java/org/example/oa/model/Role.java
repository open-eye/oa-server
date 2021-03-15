package org.example.oa.model;

import lombok.Data;

@Data
public class Role {
    private Integer id;

    private String name;

    private String nameZh;

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}
