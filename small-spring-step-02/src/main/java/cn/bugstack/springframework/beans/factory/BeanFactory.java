package cn.bugstack.springframework.beans.factory;

import cn.bugstack.springframework.beans.BeansException;

/**
 * 1、BeanFactory工厂，提供Bean的获取方法
 * 2、由抽象类 AbstractBeanFactory 实现
 */
public interface BeanFactory {

    // AbstractBeanFactory 实现
    Object getBean(String name) throws BeansException;

}
