package com.engenheironet.projetoweb.controller;

import	org.springframework.web.bind.annotation.*;
@RestController
public class PaginaInicial	{
    @RequestMapping("/")
    String	home() {
        return "Olá	Spring	Boot!!";
    }
}

