package com.example.alicebredow.controller;

import java.util.List;

import com.example.alicebredow.model.Produto;
import com.example.alicebredow.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProdutoController {
  @Autowired
  ProdutoService produtoService;

  @GetMapping("/produto/list")
  public ModelAndView list() {
    ModelAndView my = new ModelAndView("produto/list");
    List<Produto> produtos = produtoService.findAll();
    my.addObject("produtos", produtos);
    return my;
  }

  @GetMapping("/produto")
  public String form() {
    return "produto/add";
  }

  @PostMapping("/produto")
  public void add(@ModelAttribute("aluno") Produto produto) {
    produtoService.save(produto);
  }

}
