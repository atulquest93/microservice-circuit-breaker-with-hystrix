package com.zuul.filter;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class SimpleFilter extends ZuulFilter{
	
	/*
	 * Zuul Provides 4 filters : Pre, Route, Post, Error
	 * Implemeting Pre filter for this POC. 
	 */
	
	@Override
	public Object run() {
		RequestContext ctx = new RequestContext().getCurrentContext();
		HttpServletRequest hsr = ctx.getRequest();
		
		System.out.println("Invoking Filter to perform modifications !");
		System.out.println(hsr.getMethod()+" : "+hsr.getRequestURL().toString());
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public String filterType() {
		return "pre";
	}
}