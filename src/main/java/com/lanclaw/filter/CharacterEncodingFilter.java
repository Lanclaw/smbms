package com.lanclaw.filter;

import javax.servlet.*;
import java.io.IOException;


public class CharacterEncodingFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=UTF-8");

        //让我们的请求继续走，如果不写，程序到这里就被拦截停止！
        filterChain.doFilter(servletRequest,servletResponse);
    }

    public void destroy() {

    }
}
