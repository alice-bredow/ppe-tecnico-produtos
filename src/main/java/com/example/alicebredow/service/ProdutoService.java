package com.example.alicebredow.service;

import java.util.List;

import com.example.alicebredow.model.Produto;
import com.example.alicebredow.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
  @Autowired
  ProdutoRepository produtoRepository;

  public void save(Produto produto) {
    produtoRepository.save(produto);
  }

  public List<Produto> findAll () { return produtoRepository.findAll(); }
}
