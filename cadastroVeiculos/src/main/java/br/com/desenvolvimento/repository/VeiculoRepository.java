package br.com.desenvolvimento.repository;

import br.com.desenvolvimento.model.VeiculoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VeiculoRepository extends JpaRepository<VeiculoModel,String> {

    List<VeiculoModel> findByMarca(String marca);

    void deleteById(Long id);

    List<Integer> findByAno(Integer ano);

    Optional<VeiculoModel> findById(Long id);
}
