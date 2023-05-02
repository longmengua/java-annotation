package com.example.annotation.interceptor;

import com.example.annotation.annotation.HeadersValidator;
import org.springframework.web.servlet.HandlerInterceptor;
import sun.security.validator.ValidatorException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HeadersInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
        HeadersValidator annotation = handler.getClass().getMethod(req.getMethod()).getAnnotation(HeadersValidator.class);

        if (annotation != null) {
            for (String header: annotation.headers()) {
                String value = req.getHeader(header);
                if (value == null) {
                    res.sendError(HttpServletResponse.SC_BAD_REQUEST, "Missing header : " + header);
                    return false;
                }
            }
        }
        return true;
    }
}
