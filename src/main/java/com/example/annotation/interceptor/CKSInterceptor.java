package com.example.annotation.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CKSInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
        String cks = req.getHeader("cks");

        // todo: cks verification
        if (cks == null) {
            res.getWriter().write("CKS verification failed");
            res.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return false;
        }
        return true;
    }
}
