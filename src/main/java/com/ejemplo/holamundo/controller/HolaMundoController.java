package com.ejemplo.holamundo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HolaMundoController {

    @GetMapping("/hola")
    public String holaMundo() {
        return "Hola mundo";
    }

    @GetMapping("/saludo/{x}")
    public String saludo(@PathVariable String x) {
        return "Hola "+x;
    }

    @GetMapping("/saludo-query")
    public String saludoQuery(@RequestParam String nombre, @RequestParam String apellido) {
        return "Hola "+nombre +" "+apellido;
    }

    @GetMapping("/suma/{valor_uno}/{valor_dos}")
    public int suma(@PathVariable int valor_uno, @PathVariable int valor_dos) {
        return valor_uno + valor_dos;
    }

    @GetMapping("/resta/{valor_uno}/{valor_dos}")
    public int resta(@PathVariable int valor_uno, @PathVariable int valor_dos) {
        return valor_uno - valor_dos;
    }

    @GetMapping("/multiplicacion/{valor_uno}/{valor_dos}")
    public int multiplicacion(@PathVariable int valor_uno, @PathVariable int valor_dos) {
        return valor_uno * valor_dos;
    }

    @GetMapping("/division/{valor_uno}/{valor_dos}")
    public String division(@PathVariable int valor_uno, @PathVariable int valor_dos) {
        try {
            return String.valueOf(valor_uno / valor_dos);
        }catch (ArithmeticException e) {
            return "Error: "+e.getMessage();
        }
    }

}
