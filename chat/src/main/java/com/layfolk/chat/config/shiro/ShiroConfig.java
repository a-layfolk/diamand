package com.layfolk.chat.config.shiro;

import org.apache.shiro.mgt.DefaultSessionStorageEvaluator;
import org.apache.shiro.mgt.DefaultSubjectDAO;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {

    @Bean
    // 3. ShiroFilterFactoryBean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager defaultWebSecurityManager) {
        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        // 设置安全管理器
        bean.setSecurityManager(defaultWebSecurityManager);


         // 添加 shiro 的内置过滤器
         /*
            anon: 无需认证就可以访问
            authc: 必须认证才能访问
            user: 必须拥有 记住我 功能才能用
            perms: 拥有对某资源的权限才能访问
            role: 拥有某个角色权限访问
         */

        // 自定义过滤器
        Map<String, Filter> filterMap = new LinkedHashMap<>();
        filterMap.put("jwt", new NoSessionFilter());

        // 设置过滤链
        bean.setFilters(filterMap);

        Map<String, String> map = new LinkedHashMap<>();

        map.put("/user/add", "jwt");
        map.put("/user/update", "jwt");

        bean.setFilterChainDefinitionMap(map);

        // 设置等率请求, 不满足认证条件全部跳转到 login 页面
        bean.setLoginUrl("/toLogin");
        return bean;
    }

    // 2. DefaultWebSecurityManager
    @Bean(name="securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm) {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        // 关联  realm
        securityManager.setRealm(userRealm);


        // 关闭 session
        DefaultSubjectDAO dao = new DefaultSubjectDAO();
        DefaultSessionStorageEvaluator evaluator = new DefaultSessionStorageEvaluator();
        evaluator.setSessionStorageEnabled(false);
        dao.setSessionStorageEvaluator(evaluator);

        securityManager.setSubjectDAO(dao);
        securityManager.setSubjectFactory(subjectFactory());    // 将关闭 session 的对象注入

        return securityManager;
    }


    // 1. realm 对象, 需要自定义
    @Bean(name="userRealm")
    public UserRealm getUserRealm() {
        return new UserRealm();
    }


    @Bean(name="subjectFactory")
    public StatelessDefaultSubjectFactory subjectFactory() {
        StatelessDefaultSubjectFactory factory = new StatelessDefaultSubjectFactory();
        return factory;
    }
}
