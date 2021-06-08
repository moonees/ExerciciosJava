package br.com.desenvolvimento.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "veiculos")
public class VeiculoModel {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "veiculo")
    private String veiculo;

    @Column(name = "marca")
    private String marca;

    @Column(name = "ano")
    private Integer ano;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "status")
    private boolean statusVenda;

    @Column(name = "criada")
    private Date created;

    @Column(name = "atualizacao")
    private Date updated;
}
