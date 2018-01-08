package com.szk.watch.entity;

import java.util.List;

public class page {
	// �����
	private List<watch> List;
	
	// ��ѯ��¼����
    private int totalRecords;

    // ÿҳ��������¼
    private int pageSize;

    // �ڼ�ҳ
    private int pageNo;
    
    //��ȡ��ҳ��
    public int getTotalPages(){
        return (totalRecords+pageSize-1)/pageSize;
    }
    
    /**
     * ���㵱ǰҳ֮ǰ��¼����
     * @param pageSize ÿҳ��¼��
     * @param currentPage ��ǰ�ڼ�ҳ
     * @return ��ǰҳ��ʼ��¼��
     */
    public int countOffset(int currentPage,int pageSize){
        int offset = pageSize*(currentPage-1);
        return offset;
    }
    
    //������ҳ
    public int getTopPageNo(){
        return 1;
    }
    
    //����βҳ
    public int getBottomPageNo(){
        return getTotalPages();
    }
    
    //������һҳ
    public int getPreviousPageNo(){
        if(pageNo<=1){
            return 1;
        }
        return pageNo-1;
    }
    
    //������һҳ
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
