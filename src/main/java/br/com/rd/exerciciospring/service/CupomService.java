package br.com.rd.exerciciospring.service;

import br.com.rd.exerciciospring.model.Cupom;
import br.com.rd.exerciciospring.repository.CupomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("CupomService")
public class CupomService {

    @Autowired
    CupomRepository repository;


    public ResponseEntity salvar (Cupom cupom){
        //TODO INCLUIR VALIDADAÇÕES

        if(cupom.getVl_venda() == null)
            return ResponseEntity.badRequest().body(new Exception("valor da venda não informada"));

        if(cupom.getDt_vendas() == null)
            return ResponseEntity.badRequest().body(new Exception("data de venda não informada"));

        if(cupom.getId_cliente() == null)
        return ResponseEntity.badRequest().body(new Exception("clinete não informado"));

        Cupom cupomEntity = new Cupom();
        cupomEntity.setVl_venda(cupom.getVl_venda());
        cupomEntity.setDt_vendas(cupom.getDt_vendas());
        cupomEntity.setId_cliente(cupom.getId_cliente());



        Cupom retornoEntity = repository.save(cupomEntity);
        cupom.setIdCupom(retornoEntity.getIdCupom());

        return ResponseEntity.ok().body(cupom);
}

    public ResponseEntity Buscar (Cupom cupom){
        //TODO INCLUIR VALIDADAÇÕES

        if(cupom.getId_cliente() == null)
            return ResponseEntity.badRequest().body(new Exception("id de cliente não informado"));

        if(cupom.getDt_vendas() == null)
            return ResponseEntity.badRequest().body(new Exception("data não informada"));

        Cupom cupomEntity = new Cupom();
        cupomEntity.setVl_venda(cupom.getVl_venda());
        cupomEntity.setDt_vendas(cupom.getDt_vendas());
        cupomEntity.setId_cliente(cupom.getId_cliente());



        Cupom retornoEntity = repository.save(cupomEntity);
        cupom.setIdCupom(retornoEntity.getIdCupom());

        return ResponseEntity.ok().body(cupom);
    }

}
