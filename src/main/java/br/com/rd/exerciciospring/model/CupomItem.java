package br.com.rd.exerciciospring.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tb_cupo_item")
public class CupomItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cupom_item")
    private Long idCupomItem;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_cupom")
    private Long idCupom;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_produto")
    private Long idProduto;

    @Column(name = "qt_produto")
    private Long qt_produto;

    @Column(name = "vl_produto")
    private BigDecimal vl_produto;



}
