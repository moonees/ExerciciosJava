package br.com.desenvolvimento.service;

import br.com.desenvolvimento.dto.VeiculoDto;
import br.com.desenvolvimento.model.VeiculoModel;
import br.com.desenvolvimento.repository.VeiculoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VeiculoService {
    @Autowired
    ModelMapper modelMapper;

    @Autowired
    VeiculoRepository veiculoRepository;


    public void cadastrar(VeiculoModel veiculoModel) {
        veiculoRepository.save(veiculoModel);
    }

    public List<VeiculoDto> listarVeiculos() {
        List<VeiculoDto> result = veiculoRepository.findAll()
                .stream()
                .map(this::toVeiculoDto)
                .collect(Collectors
                        .toList());
        return result;
    }

    public List<VeiculoModel> listarVeiculosMarca(String marca) {
        List<VeiculoModel> result = veiculoRepository.findByMarca(marca);
        return result;
    }

    public void excluirVeiculo(Long id) {
        veiculoRepository.deleteById(id);
    }

   public List<Integer> listarVeiculosAno(Integer ano) {
        List<Integer> result = veiculoRepository.findByAno(ano);
        return result;
    }

    public void atualizarVeiculo(VeiculoModel veiculoModel) {
        veiculoRepository.save(veiculoModel);
    }

    private VeiculoDto toVeiculoDto(VeiculoModel veiculoModel){
        return modelMapper.map(veiculoModel, VeiculoDto.class);
    }

    public Optional<VeiculoModel> listarVeiculosId(Long id) {
        Optional<VeiculoModel> result = veiculoRepository.findById(id);
        return result;
    }
}
