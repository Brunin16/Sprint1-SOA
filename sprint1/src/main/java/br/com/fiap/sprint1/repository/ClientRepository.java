package br.com.fiap.sprint1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.sprint1.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {


}
