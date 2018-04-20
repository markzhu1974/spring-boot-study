package com.example.demo.util.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns="/*")
public class CustomFilter implements Filter {
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException{
		System.out.println("Init Filter");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
		throws ServletException, IOException {
		System.out.println("doFilter");
		chain.doFilter(request, response);
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy filter");
	}
	
}
