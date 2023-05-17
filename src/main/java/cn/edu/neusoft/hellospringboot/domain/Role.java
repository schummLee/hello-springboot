package cn.edu.neusoft.hellospringboot.domain;

import java.io.Serializable;

/**
 * t_role
 * @author 
 */
public class Role implements Serializable {
    /**
     * ID
     */
    private Long roleId;

    /**
     * 角色名
     */
    private String roleName;

    /**
     * 角色描述信息
     */
    private String roleMemo;

    private static final long serialVersionUID = 1L;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleMemo() {
        return roleMemo;
    }

    public void setRoleMemo(String roleMemo) {
        this.roleMemo = roleMemo;
    }
}