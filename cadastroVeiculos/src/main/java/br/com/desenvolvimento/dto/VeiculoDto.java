package br.com.desenvolvimento.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VeiculoDto {
    private String veiculo;
    private String marca;
    private Integer ano;
    private boolean statusVenda;

    public VeiculoDto(){

    }

}
