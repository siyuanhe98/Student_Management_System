package com.example.shiro_mysql_integrate.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Set;

/**
 * @author Siyuan He
 * @create 2022-05-26 10:33 PM
 */
@Mapper
public interface RoleMapper {

    @Select("SELECT p.name FROM permission p INNER JOIN role_permission rp ON rp.permission_id = p.id WHERE rp.role_id = #{role_id}")
    Set<String> getPermissionByRoleId(@Param("role_id") Long roleId);
}
