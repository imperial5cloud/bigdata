/**
 * Copyright (C), 2018-2018, 中关村科技软件股份有限公司
 * FileName: ShiroFilterMap
 * Author:   DDXG
 * Date:     2018/7/25 13:13
 * Description: shiro路径过滤读取bean
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.censoft.framework.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈shiro路径过滤读取bean〉
 *
 * @author DDXG
 * @create 2018/7/25
 * @since 1.0.0
 */
@Component
@ConfigurationProperties(prefix="shiro") //接收application.yml中的shiro.Filter下面的属性
public class ShiroFilterMap {
    // 对静态资源设置匿名访问
    private LinkedHashMap<String, String> filterChainAnonMap = new LinkedHashMap<>();
    // 退出 logout地址，shiro去清除session
    private LinkedHashMap<String, String> filterChainLogoutMap = new LinkedHashMap<>();
    // 不需要拦截的访问
    private LinkedHashMap<String, String> filterChainValidateMap = new LinkedHashMap<>();
    // 所有请求需要认证
    private LinkedHashMap<String, String> filterChainUserMap = new LinkedHashMap<>();
    // 系统请求记录当前会话
    private LinkedHashMap<String, String> filterChainonlineSessionMap = new LinkedHashMap<>();


    public void setfilterChainAnonMap(List<String> filterChainAnonMap) {
        for(int i =0;i<filterChainAnonMap.size();i++)
        {
            this.filterChainAnonMap.put(filterChainAnonMap.get(i),"anon");
        }
    }
    public void setfilterChainLogoutMap(List<String> filterChainLogoutMap) {
        for(int i =0;i<filterChainLogoutMap.size();i++)
        {
            this.filterChainLogoutMap.put(filterChainLogoutMap.get(i),"logout");
        }
    }
    public void setfilterChainValidateMap(List<String> filterChainValidateMap) {
        for(int i =0;i<filterChainValidateMap.size();i++)
        {
            this.filterChainValidateMap.put(filterChainValidateMap.get(i),"anon,captchaValidate");
        }
    }
    public void setfilterChainUserMap(List<String> filterChainUserMap) {
        for(int i =0;i<filterChainUserMap.size();i++)
        {
            this.filterChainUserMap.put(filterChainUserMap.get(i),"user");
        }
    }
    public void setfilterChainonlineSessionMap(List<String> filterChainonlineSessionMap) {
        for(int i =0;i<filterChainonlineSessionMap.size();i++)
        {
            this.filterChainonlineSessionMap.put(filterChainonlineSessionMap.get(i),"onlineSession,syncOnlineSession");
        }
    }

    public LinkedHashMap<String, String> getFilterChainAnonMap() {
        return filterChainAnonMap;
    }

    public LinkedHashMap<String, String> getFilterChainLogoutMap() {
        return filterChainLogoutMap;
    }

    public LinkedHashMap<String, String> getFilterChainValidateMap() {
        return filterChainValidateMap;
    }

    public LinkedHashMap<String, String> getFilterChainUserMap() {
        return filterChainUserMap;
    }

    public LinkedHashMap<String, String> getFilterChainonlineSessionMap() {
        return filterChainonlineSessionMap;
    }
}