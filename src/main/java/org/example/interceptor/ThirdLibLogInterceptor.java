package org.example.interceptor;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * https://stackoverflow.com/questions/59216572/create-standalone-library-for-spring-aop
 * 这里的目标是想写一个切面库给Spring项目，应该怎么写？
 * 由于使用SpringAOP，所以肯定需要加入SpringAOP的依赖库。
 * pom.xml一样得加入springAOP的相关依赖
 *
 * 还有一种方法是：建立另外一个spring boot项目，将里面的某个module打包，不过这个应该不是标准的方法。
 */
@Aspect
@Component
public class ThirdLibLogInterceptor {

    @After("within(@org.springframework.web.bind.annotation.RestController *)")
    public void logControllerMethods() {
        System.out.println("ThirdParty Interceptor for RestController");
    }
}
