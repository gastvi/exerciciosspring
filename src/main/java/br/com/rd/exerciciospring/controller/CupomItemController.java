package br.com.rd.exerciciospring.controller;

import br.com.rd.exerciciospring.model.Cupom;
import br.com.rd.exerciciospring.model.CupomItem;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class CupomItemController {

    @Autowired
    private CupomItemController cupomItemController;


}
