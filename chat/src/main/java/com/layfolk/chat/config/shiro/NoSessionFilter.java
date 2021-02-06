package com.layfolk.chat.config.shiro;

import com.layfolk.chat.utils.TokenSubjectUtil;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.BasicHttpAuthenticationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 拦截器
 */
public class NoSessionFilter extends BasicHttpAuthenticationFilter {

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        System.out.println("isAccessAllowed");
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        System.out.println(httpServletRequest.getServletPath());
        String token = httpServletRequest.getParameter("token");
        Subject subject = TokenSubjectUtil.getSubject(token);

        if(subject == null) {
            return false;
        }

        return true;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws IOException {
        response.getWriter().write("you are not login, please login");
        return false;
    }
}
