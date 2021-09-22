package com.projeto.projeto.controllers;

import com.projeto.projeto.repository.FreteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class FreteController {

    @Autowired
    private FreteRepository repository;

    @GetMapping("/index")
    public String getPostNew() {
        return "index";
    }
    @GetMapping("/frete")
    public ModelAndView frete(){

        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("frete");

        return modelAndView;
    }

    @GetMapping("/resultado")
    public ModelAndView resultado(){

        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("resultado");

        return modelAndView;
    }

    @Bean
    private ViewResolver viewResolver()
    {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("classpath:templates/");
        viewResolver.setSuffix(".html");
        return viewResolver;
    }
}
