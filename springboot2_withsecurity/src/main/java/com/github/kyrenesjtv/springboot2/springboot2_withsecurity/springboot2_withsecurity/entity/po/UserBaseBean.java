package com.github.kyrenesjtv.springboot2.springboot2_withsecurity.springboot2_withsecurity.entity.po;

/**
 * @ProjectName: dingDang_blackBox
 * @Author: wanglin
 * @CreateDate: 2019/3/24 16:33
 */
public class UserBaseBean {
    /**
     * 页码
     */
    private Integer pageNum;

    /**
     * 一页最大数
     */
    private Integer pageSize;

    /**
     * 排序规则 ascending 升序  descending 降序
     */
    private String sortable;

    /**
     * 当前所选择的部门
     */
    private String currentDepartId;

    /**
     * 所属部门名字
     */
    private  String departName;

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getCurrentDepartId() {
        return currentDepartId;
    }

    public void setCurrentDepartId(String currentDepartId) {
        this.currentDepartId = currentDepartId;
    }

    public String getSortable() {
        return sortable;
    }

    public void setSortable(String sortable) {
        this.sortable = sortable;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
