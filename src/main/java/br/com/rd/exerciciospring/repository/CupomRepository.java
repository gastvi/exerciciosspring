package br.com.rd.exerciciospring.repository;


import br.com.rd.exerciciospring.model.Produto;
import br.com.rd.exerciciospring.model.Cupom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface CupomRepository extends JpaRepository<Cupom, Long> {

}
