package com.main.spider.bean;

public class SpiderBean {

	private String targetUrl;   //目标URl
	private String targetPath;  //目标路径 html docment路径
	private String secondTargetPath;  //二级目标路径 html docment路径
	private String encodingType; //编码类型
	public String getTargetUrl() {
		return targetUrl;
	}
	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}
	public String getTargetPath() {
		return targetPath;
	}
	public void setTargetPath(String targetPath) {
		this.targetPath = targetPath;
	}
	public String getEncodingType() {
		return encodingType;
	}
	public void setEncodingType(String encodingType) {
		this.encodingType = encodingType;
	}
	public String getSecondTargetPath() {
		return secondTargetPath;
	}
	public void setSecondTargetPath(String secondTargetPath) {
		this.secondTargetPath = secondTargetPath;
	}
	
	
}
