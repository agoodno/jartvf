/*
 * JarEntry.java
 */
package com.jartvf.db;

import java.util.Date;
import java.util.List;

public class JarEntry {

	private Long id;
	private List<Jar> memberOfJars;
	private String name;
	private String platformName; 
	private String filePath;
	private String fileName;
	private Integer size;
	private Date stamp;

	
	public List<Jar> getMemberOfJars() {
		return memberOfJars;
	}
	public void setMemberOfJars(List<Jar> jars) {
		this.memberOfJars = jars;
	}
	public void addMemberOfJar(Jar memberOfJar) {
		this.memberOfJars.add(memberOfJar);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
}
