package com.projeto.projeto.controllers;

import com.projeto.projeto.model.Frete;
import com.projeto.projeto.repository.FreteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.text.NumberFormat;
import java.util.Scanner;

@Controller
public class FreteController {

    @Autowired
    private FreteRepository repository;


    @GetMapping("/frete")
    public String mostrarform(@ModelAttribute Frete frete ) {
        return "frete";
        }

        @PostMapping("/calcularFrete")
        public String salvarFrete(Frete frete){
        repository.save(frete);
        return "redirect:resultados";
    }

    @GetMapping("/index")
    public String getPostNew() {
        return "index";
    }

  @RequestMapping("/resultados")
  public ModelAndView listaFrete() {

          ModelAndView mv = new ModelAndView("resultado");
          Iterable<Frete> resultados = repository.findAll();
          mv.addObject("resultados", resultados);

          return mv;
      }

    @Bean
    private ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("classpath:templates/");
        viewResolver.setSuffix(".html");
        return viewResolver;
    }
}
