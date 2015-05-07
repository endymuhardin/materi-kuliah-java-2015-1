package com.muhardin.endy.belajar.web;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterConfig;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class HaloFilter implements Filter {
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) 
                                throws IOException, ServletException {
        System.out.println("Mencegat request");
        chain.doFilter(req,res);
        System.out.println("Mencegat response");
    } 
    
    // method wajib harus diimplement walaupun kosong
    public void init(FilterConfig filterConfig) throws ServletException {}
    public void destroy(){}
}
