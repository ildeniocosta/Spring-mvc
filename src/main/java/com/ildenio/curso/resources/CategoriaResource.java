package com.ildenio.curso.resources;

import com.ildenio.curso.domain.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
    @RequestMapping(method= RequestMethod.GET)
    public List<Categoria> listar(){
        Categoria cat1 = new Categoria(1,"Informática");
        Categoria cat2 = new Categoria(2,"Escritório");
        Categoria cat3 = new Categoria(3,"Outros");
        Categoria cat4 = new Categoria(4,"Limpeza");
        List<Categoria> lista = new ArrayList<>();
        lista.add(cat1);
        lista.add(cat2);
        lista.add(cat3);
        lista.add(cat4);
        return lista;
    }


}
