package com.Haven.config;

//全面扩展springMVC

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//扩展 springMVC DispatcherServlett
//如果我们要扩展springMVC, 官方建议这样做!
@Configuration
//@EnableWebMvc //这个就是导入了一个类DelegatingWebMvcConfiguration:从容器中获取所有的WebMvcConfig:
public class MyMvcConfig implements WebMvcConfigurer {

    //视图跳转
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/main").setViewName("main");
        registry.addViewController("/main.html").setViewName("main");
        registry.addViewController("/register").setViewName("user/register");
    }

    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginHanderInterceptorConfig())
//                .addPathPatterns("/**")
//                .excludePathPatterns("/", "/index", "/index.html", "/user/login", "/css/**", "/js/**", "/img/**", "/register", "/registerUser");
//    }



    //    //实现了ViewResolver视图解析器接口的类,我们就可以把它看做视图解析器
//
//    @Bean
//    public ViewResolver myViewResolver() {
//        return new MyViewResolver();
//    }
//
//    //自定义了一个视图解析器
//    public static class MyViewResolver implements ViewResolver {
//        @Override
//        public View resolveViewName(String viewName, Locale locale) throws Exception {
//            return null;
//        }
//    }
}
