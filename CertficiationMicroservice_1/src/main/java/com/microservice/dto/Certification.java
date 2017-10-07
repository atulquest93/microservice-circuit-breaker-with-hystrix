package com.microservice.dto;

public class Certification {

	private String cert_id;
	private String cert_name;
	private String cert_courses;
	public String getCert_id() {
		return cert_id;
	}
	public void setCert_id(String cert_id) {
		this.cert_id = cert_id;
	}
	public String getCert_name() {
		return cert_name;
	}
	public void setCert_name(String cert_name) {
		this.cert_name = cert_name;
	}
	public String getCert_courses() {
		return cert_courses;
	}
	public void setCert_courses(String cert_courses) {
		this.cert_courses = cert_courses;
	}
	
	public Certification(String cert_id, String cert_name, String cert_courses) {
		super();
		this.cert_id = cert_id;
		this.cert_name = cert_name;
		this.cert_courses = cert_courses;
	}
	
	
	
}
