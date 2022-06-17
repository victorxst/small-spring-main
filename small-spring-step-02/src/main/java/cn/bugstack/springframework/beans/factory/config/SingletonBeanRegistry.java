package cn.bugstack.springframework.beans.factory.config;

/**
 * 1、单例注册
 */
public interface SingletonBeanRegistry {
    /**
     * 获取单例对象
     */
    Object getSingleton(String beanName);

}
