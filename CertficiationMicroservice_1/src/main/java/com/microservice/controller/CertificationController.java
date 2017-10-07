package com.microservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.dto.Certification;
import com.microservice.service.CertificationService;

@RestController
public class CertificationController {

	@Autowired
	private CertificationService certServ;
	
	@RequestMapping("/getCertifications")
	public List<Certification> getCertifications() {
		Certification aws_cloud_ass = new Certification("1001", "AWS Cloud Associate", "Aws Cloud Essentials");
		Certification aws_cloud_devops_ass = new Certification("1003", "Aws cloud Devops associate", "Aws CLoud Essentials");
		Certification aws_cloud_arch = new Certification("1002", "Aws Cloud Archtitect", "Aws Cloud Associate + Devops");
		
		List<Certification> certs = new ArrayList<Certification>();
		certs.add(aws_cloud_ass);
		certs.add(aws_cloud_devops_ass);
		certs.add(aws_cloud_arch);
		
		return certs;
	}
	
	
	/*
	 * Call CertificationService to load data from Course micro-service
	 * Demo for Circuit Breaker Pattern
	 */
	@RequestMapping(value="/getCoursesFromCertMS", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getCourseList() {
		return certServ.getCourseList();
	}
	
	@RequestMapping("/info")
	public String getInfo() {
		return "Volla ! This is certification microservice-1 saying hello ! "
				+ "<br> <a href='./getCertifications'>Check Endpoint response</a>"
				+ "<br> <a href='./getCoursesFromCertMS'> Access Course Data from Certficiation Using Hystrix Circuit Breaker</a>";
	}
}
