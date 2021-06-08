package br.com.desenvolvimento.controller;

import br.com.desenvolvimento.dto.VeiculoDto;
import br.com.desenvolvimento.model.VeiculoModel;
import br.com.desenvolvimento.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("/consulta")
public class VeiculoController {

    @Autowired
    VeiculoService veiculoService;

    @PostMapping
    public ResponseEntity<Void> cadastra (@RequestBody VeiculoModel veiculoModel){
        veiculoService.cadastrar(veiculoModel);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List> listaVeiculos(){
        List<VeiculoDto> result = veiculoService.listarVeiculos();
        return new ResponseEntity<>(result ,HttpStatus.FOUND);
    }

    @GetMapping("/{marca}")
    public ResponseEntity<List> listaVeiculosMarca(@PathVariable String marca){
        List<VeiculoModel> result = veiculoService.listarVeiculosMarca(marca);
        return new ResponseEntity<>(result, HttpStatus.FOUND);
    }

    @GetMapping("/{ano}")
    public ResponseEntity<List<VeiculoModel>> listaVeiculosAno(@PathVariable Integer ano){
        List<Integer> result = veiculoService.listarVeiculosAno(ano);
        return new ResponseEntity(result,HttpStatus.FOUND);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Optional<VeiculoModel>> listaVeiculosId(@PathVariable Long id){
        Optional<VeiculoModel> result = veiculoService.listarVeiculosId(id);
        return new ResponseEntity(result,HttpStatus.FOUND);
    }

    @Transactional
    @DeleteMapping("/exclui/{id}")
    public ResponseEntity<Void> excluiVeiculo(@PathVariable Long id){
        veiculoService.excluirVeiculo(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Void> atualizaVeiculo(@RequestBody VeiculoModel veiculoModel){
        Date date = new Date();
        veiculoModel.setUpdated(date);
        veiculoService.atualizarVeiculo(veiculoModel);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
