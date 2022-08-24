package com.example.shiro_mysql_integrate.model;

import javax.persistence.*;

/**
 * @author Siyuan He
 * @create 2022-05-26 9:47 PM
 */

@Entity
public class RolePermission {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @ManyToOne
    @JoinColumn(name = "permission_id")
    private Permission permission;

    public RolePermission() {
    }

    public RolePermission(Long id, Role role, Permission permission) {
        this.id = id;
        this.role = role;
        this.permission = permission;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }
}
