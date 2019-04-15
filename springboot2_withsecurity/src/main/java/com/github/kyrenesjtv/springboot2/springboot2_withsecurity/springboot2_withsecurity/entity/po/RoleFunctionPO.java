package com.github.kyrenesjtv.springboot2.springboot2_withsecurity.springboot2_withsecurity.entity.po;


public class RoleFunctionPO extends RoleFunctionBaseBean {
    private String id ;

    private String roleId ;

    private String functionId ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getFunctionId() {
        return functionId;
    }

    public void setFunctionId(String functionId) {
        this.functionId = functionId;
    }

    @Override
    public String toString() {
        return "RoleFunctionPO{" + "id='" + id + '\'' + ", roleId='" + roleId + '\'' + ", functionId='" + functionId + '\'' + '}';
    }
}
