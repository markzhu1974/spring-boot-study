package com.example.demo;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.example.demo.util.filter.CustomFilter;
import com.example.demo.util.listener.CustomListener;
import com.example.demo.util.servlet.CustomServlet;
/*
@SpringBootApplication
public class DemoJspApplication {

	@Bean
	public ServletRegistrationBean servletRegistrationBean() {
		return new ServletRegistrationBean(new CustomServlet(), "/servlet");
	}
	
	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		return new FilterRegistrationBean(new CustomFilter(), servletRegistrationBean());		
	}
	
	@Bean
	public ServletListenerRegistrationBean<CustomListener> servletListenerRegistration(){
		return new ServletListenerRegistrationBean<CustomListener>(new CustomListener());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoJspApplication.class, args);
	}
}
*/

/*
@SpringBootApplication
public class DemoJspApplication implements ServletContextInitializer {
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		servletContext.addServlet("customServlet", new CustomServlet()).addMapping("/roncoo");
		servletContext.addFilter("customFilter", new CustomFilter())
			.addMappingForServletNames(EnumSet.of(DispatcherType.REQUEST), true, "customServlet");
		servletContext.addListener(new CustomListener());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoJspApplication.class, args);
	}
}
*/

@SpringBootApplication
@ServletComponentScan
public class DemoJspApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoJspApplication.class, args);
	}
}
