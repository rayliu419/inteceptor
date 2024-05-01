package org.example.export;

import org.example.config.ExportFromAnnotationConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
// 外部需要此jar中的Bean时，在@SpringBootApplication下面@ExportFromAnnotationConfig
// 外部程序在倒入此注解时，会load ExportFromAnnotationConfig.clas
@Import(ExportFromAnnotationConfig.class)
public @interface EnableFromAnnotation {
}
