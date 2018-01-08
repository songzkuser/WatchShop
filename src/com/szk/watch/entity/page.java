package com.szk.watch.entity;

import java.util.List;

public class page {
	// 结果集
	private List<watch> List;
	
	// 查询记录总数
    private int totalRecords;

    // 每页多少条记录
    private int pageSize;

    // 第几页
    private int pageNo;
    
    //获取总页数
    public int getTotalPages(){
        return (totalRecords+pageSize-1)/pageSize;
    }
    
    /**
     * 计算当前页之前记录总数
     * @param pageSize 每页记录数
     * @param currentPage 当前第几页
     * @return 当前页开始记录号
     */
    public int countOffset(int currentPage,int pageSize){
        int offset = pageSize*(currentPage-1);
        return offset;
    }
    
    //返回首页
    public int getTopPageNo(){
        return 1;
    }
    
    //返回尾页
    public int getBottomPageNo(){
        return getTotalPages();
    }
    
    //返回上一页
    public int getPreviousPageNo(){
        if(pageNo<=1){
            return 1;
        }
        return pageNo-1;
    }
    
    //进入下一页
    public int getNextPageNo(){
        if(pageNo>=getBottomPageNo()){
            return getBottomPageNo();
        }
        return pageNo+1;
    }
    
    
    

	public List<watch> getList() {
		return List;
	}

	public void setList(List<watch> list) {
		List = list;
	}

	public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    
    
    
}
