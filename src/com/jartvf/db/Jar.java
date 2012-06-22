/*
 * Jar.java
 */
package com.jartvf.db;

import java.util.Date;
import java.util.List;

public class Jar {

	private Long id;
	private List<JarEntry> contents;
	private String description;
	private String platformName; 
	private String downloadUrl; 
	private Boolean directUrl;
	private String fileName;
	private String version;
	private String build; 
	private Integer size;
	private Date stamp;
	
	
	public List<JarEntry> getContents() {
		return contents;
	}
	public void setContents(List<JarEntry> contents) {
		this.contents = contents;
	}
	public void addContent(JarEntry content) {
		this.contents.add(content);
	}
	public String getBuild() {
		return build;
	}
	public void setBuild(String build) {
		this.build = build;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean isDirectUrl() {
		return directUrl;
	}
	public void setDirectUrl(Boolean directUrl) {
		this.directUrl = directUrl;
	}
	public String getDownloadUrl() {
		return downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPlatformName() {
		return platformName;
	}
	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Date getStamp() {
		return stamp;
	}
	public void setStamp(Date stamp) {
		this.stamp = stamp;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
}
