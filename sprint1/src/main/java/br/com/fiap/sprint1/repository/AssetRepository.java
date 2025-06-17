package br.com.fiap.sprint1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.sprint1.model.Asset;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Long>{

}
