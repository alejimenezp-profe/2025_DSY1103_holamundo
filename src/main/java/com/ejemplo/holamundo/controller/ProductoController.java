package com.ejemplo.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v2/producto")
public class ProductoController {

    @GetMapping
    public String index() {
        return "bienvenido al lista de productos";
    }

    @GetMapping("/hola")
    public String holamundo() {
        return "holamundo desde la lista de productos";
    }

    @GetMapping("/{idProducto}")
    public String prducto(@PathVariable String idProducto) {

        List productos = new ArrayList();
        productos.add("a");
        productos.add("b");
        productos.add("c");

        if (productos.contains(idProducto)) {
            return "producto encontrado";
        }else {
            return "error 404";
        }

    }
}
