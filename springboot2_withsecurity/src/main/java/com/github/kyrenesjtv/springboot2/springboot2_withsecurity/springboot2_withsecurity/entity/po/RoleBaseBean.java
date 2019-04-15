package com.github.kyrenesjtv.springboot2.springboot2_withsecurity.springboot2_withsecurity.entity.po;

/**
 * @ProjectName: dingDang_blackBox
 * @Author: AlbertW
 * @CreateDate: 2019/3/23 23:17
 */
public class RoleBaseBean {
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
