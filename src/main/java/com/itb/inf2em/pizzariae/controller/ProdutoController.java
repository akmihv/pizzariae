package com.itb.inf2em.pizzariae.controller;

import com.itb.inf2em.pizzariae.model.entity.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/produto")

public class ProdutoController {

    private List<Produto> produtos = new ArrayList<Produto>();

    @GetMapping

    public List<Produto> findAllProdutos(){

        Produto p1 = new Produto();
        p1.setNome("Pizza de Calabresa");
        p1.setDescricao("Calabresa com muita cebola");
        p1.setValorVenda(59.99);

        produtos.add(p1);

        Produto p2 = new Produto();
        p2.setNome("Pizza de chocolate");
        p2.setDescricao("Chocolate com morango");
        p2.setValorVenda(65.99);

        produtos.add(p2);

        return produtos;

    }
}
