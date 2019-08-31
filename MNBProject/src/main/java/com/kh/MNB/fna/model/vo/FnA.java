package com.kh.MNB.fna.model.vo;

public class FnA {

	private int fNo; // 질문번호
	private String fTitle; // 제목
	private int fType;// 질문분류
	private String fContent; // 내용
	
	public FnA() {
		super();
	}

	public FnA(int fNo, String fTitle, int fType, String fContent) {
		super();
		this.fNo = fNo;
		this.fTitle = fTitle;
		this.fType = fType;
		this.fContent = fContent;
	}

	public int getfNo() {
		return fNo;
	}

	public void setfNo(int fNo) {
		this.fNo = fNo;
	}

	public String getfTitle() {
		return fTitle;
	}

	public void setfTitle(String fTitle) {
		this.fTitle = fTitle;
	}

	public int getfType() {
		return fType;
	}

	public void setfType(int fType) {
		this.fType = fType;
	}

	public String getfContent() {
		return fContent;
	}

	public void setfContent(String fContent) {
		this.fContent = fContent;
	}

	@Override
	public String toString() {
		return "FnA [fNo=" + fNo + ", fTitle=" + fTitle + ", fType=" + fType + ", fContent=" + fContent + "]";
	}
	
	
	
}
