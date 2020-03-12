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
@Table(name="tb_cupom")

public class Cupom {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_cupom")
        private Long idCupom;

        @Column(name = "id_cliente")
        private Long id_cliente;

        @Column(name = "dt_vendas")
        private String dt_vendas;

        @Column(name = "vl_venda")
        private BigDecimal vl_venda;

//        @OneToMany(cascade = CascadeType.ALL)
//        @JoinColumn(name = "cod_pedido")
//        private List<ItemPedido> itensPedido;
    }
