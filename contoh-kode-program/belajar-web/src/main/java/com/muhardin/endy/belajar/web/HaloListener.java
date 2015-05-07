package com.muhardin.endy.belajar.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class HaloListener implements ServletContextListener{

    public void contextInitialized(ServletContextEvent sce){
        System.out.println("Aplikasi dideploy");
    }
    
    public void contextDestroyed(ServletContextEvent sce){
        System.out.println("Aplikasi di-undeploy");
    }

} 
