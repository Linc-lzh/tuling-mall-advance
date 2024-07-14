package com.tuling.tulingmall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tuling.tulingmall.model.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UmsAdminPermissionRelationMapper extends BaseMapper<UmsAdminPermissionRelation> {

    /**
     * 获取用户所有角色权限
     */
    @Select("select p.*" +
            "        from ums_admin_role_relation ar left join ums_role r on ar.role_id = r.id" +
            "            left join ums_role_permission_relation rp on r.id = rp.role_id" +
            "            left join ums_permission p on rp.permission_id=p.id" +
            "            where ar.admin_id = #{adminId} and p.id is not null"
    )
    List<UmsPermission> getRolePermissionList(@Param("adminId") Long adminId);

    /**
     * 批量插入用户角色关系
     */
    @Insert("<script> " +
            "   INSERT INTO ums_admin_role_relation (admin_id, role_id) VALUES" +
            "        <foreach collection=\"list\" separator=\",\" item=\"item\" index=\"index\">" +
            "            (#{item.adminId,jdbcType=BIGINT}," +
            "            #{item.roleId,jdbcType=BIGINT})" +
            "        </foreach>" +
            "</script>")
    int insertAdminRole(@Param("list") List<UmsAdminRoleRelation> adminRoleRelationList);


    @Insert("<script>" +
            "   INSERT INTO ums_admin_permission_relation (admin_id, permission_id, type) VALUES\n" +
            "        <foreach collection=\"list\" separator=\",\" item=\"item\" index=\"index\">\n" +
            "            (#{item.adminId,jdbcType=BIGINT},\n" +
            "            #{item.permissionId,jdbcType=BIGINT},\n" +
            "            #{item.type,jdbcType=INTEGER})\n" +
            "        </foreach>" +
            "</script>")
    int insertAdminPermission(@Param("list") List<UmsAdminPermissionRelation> list);

    /**
     * 获取用户所有权限(包括+-权限)
     */
    @Select("SELECT" +
            "            p.*" +
            "        FROM" +
            "            ums_admin_role_relation ar" +
            "            LEFT JOIN ums_role r ON ar.role_id = r.id" +
            "            LEFT JOIN ums_role_permission_relation rp ON r.id = rp.role_id" +
            "            LEFT JOIN ums_permission p ON rp.permission_id = p.id" +
            "        WHERE" +
            "            ar.admin_id = #{adminId}" +
            "            AND p.id IS NOT NULL" +
            "            AND p.id NOT IN (" +
            "                SELECT" +
            "                    p.id" +
            "                FROM" +
            "                    ums_admin_permission_relation pr" +
            "                    LEFT JOIN ums_permission p ON pr.permission_id = p.id" +
            "                WHERE" +
            "                    pr.type = - 1" +
            "                    AND pr.admin_id = #{adminId}" +
            "            )" +
            "        UNION" +
            "        SELECT" +
            "            p.*" +
            "        FROM" +
            "            ums_admin_permission_relation pr" +
            "            LEFT JOIN ums_permission p ON pr.permission_id = p.id" +
            "        WHERE" +
            "            pr.type = 1" +
            "            AND pr.admin_id = #{adminId}")
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}