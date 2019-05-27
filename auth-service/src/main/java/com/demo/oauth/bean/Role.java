package com.demo.oauth.bean;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

/**
 * @author zhanglei_yq
 * @date 2019/5/22 10:16
 * @description
 **/
@Entity
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Override
    public String getAuthority() {
        return name;
    }

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
        this.name = name;
    }
}
