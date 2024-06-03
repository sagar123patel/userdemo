package com.userdemo.config;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

public class UserResquestResopnse implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;

		String requestURI = req.getRequestURI();

		if (requestURI.contains("api")) {
			filterChain.doFilter(request, response);
			return;
		}

		if (requestURI.startsWith("/notfound")) {
			req.getRequestDispatcher("/").forward(request, response);
			return;
		}

		filterChain.doFilter(request, response);
	}

}
