package com.itb.inf2em.pizzariae.controller;

import com.itb.inf2em.pizzariae.model.entity.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/categoria")

public class CategoriaController {

    private List<Categoria> categorias = new ArrayList<Categoria>();

    @GetMapping

    public List<Categoria> findAllCategoria() {

        Categoria p1 = new Categoria();
        p1.setNome("Salgadas");
        p1.setDescricao("Pizzas Salgadas");

        categorias.add(p1);

        Categoria p2 = new Categoria();
        p2.setNome("Doces");
        p2.setDescricao("Pizzas Doces");

        categorias.add(p2);

        return categorias;
    }
}
