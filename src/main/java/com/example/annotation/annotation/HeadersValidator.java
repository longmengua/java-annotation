package com.example.annotation.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface HeadersValidator {
    String[] headers() default {};
}
