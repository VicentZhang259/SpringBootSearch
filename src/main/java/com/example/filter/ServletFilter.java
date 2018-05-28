package com.example.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

/**
 * Servlet Filter implementation class ServletFilter
 * 注解注册过滤器：实现 javax.servlet.Filter接口 
 * filterName 是过滤器的名字
 * urlPatterns 是需要过滤的请求 ，这里只过滤servlet/* 下面的所有请求
 */
@WebFilter(filterName="ServletFilter",urlPatterns="/servlet/*")
public class ServletFilter implements Filter {

    /**
     * Default constructor. 
     */
    public ServletFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("过滤器被销毁。");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response1, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
     HttpServletResponse response = (HttpServletResponse) response1;
        
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11");

        response.setHeader("Access-Control-Allow-Origin", "*");

        response.setHeader("Access-Control-Allow-Headers",
                "User-Agent,Origin,Cache-Control,Content-type,Date,Server,withCredentials,AccessToken");

        /*response.setHeader("Access-Control-Allow-Credentials", "true");*/

        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");

        /*response.setHeader("Access-Control-Max-Age", "1209600");

        response.setHeader("Access-Control-Expose-Headers", "accesstoken");

        response.setHeader("Access-Control-Request-Headers", "accesstoken");

        response.setHeader("Expires", "-1");

        response.setHeader("Cache-Control", "no-cache");

        response.setHeader("pragma", "no-cache");*/

        chain.doFilter(request, response);
		System.out.println("过滤器正在执行...");
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("初始化过滤器。");
	}

}
