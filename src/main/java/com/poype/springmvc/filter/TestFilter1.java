package com.poype.springmvc.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.*;
import java.io.IOException;

@Service("testFilter1")
public class TestFilter1 implements Filter {

    @Autowired
    private TestService testService;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("TestFilter1 init ~~~~");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        testService.sayHallo();

        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("TestFilter1 destroy ~~~~");
    }
}
