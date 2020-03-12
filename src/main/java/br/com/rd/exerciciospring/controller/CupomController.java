package br.com.rd.exerciciospring.controller;


import br.com.rd.exerciciospring.model.Cupom;
import br.com.rd.exerciciospring.service.CupomService;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class CupomController {

    @Autowired
    private CupomService cupomService;


    @PostMapping("/cupom")
    public ResponseEntity salvar (@RequestBody Cupom cupom) {
        return cupomService.salvar(cupom);
    }

    @GetMapping("/cupom/{cliente}/{venda}")
    public ResponseEntity buscarPorVendasEClientes(@PathVariable("id_cliente") Cupom cliente,
                                                   @PathVariable("dt_vendas") Cupom vendas) {
        return cupomService.Buscar(cliente);
    }
    }






