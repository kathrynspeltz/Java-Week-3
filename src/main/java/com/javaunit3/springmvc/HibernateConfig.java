package com.javaunit3.springmvc;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HibernateConfig {
    SessionFactory factory = new org.hibernate.cfg.Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    public SessionFactory getFactory() {
        return factory;
    }
}
