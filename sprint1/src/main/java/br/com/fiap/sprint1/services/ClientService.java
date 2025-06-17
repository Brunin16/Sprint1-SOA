package br.com.fiap.sprint1.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.fiap.sprint1.dto.ClientDTO;
import br.com.fiap.sprint1.model.Client;
import br.com.fiap.sprint1.repository.ClientRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClientService {
    
 private ClientRepository clientRepository;

    public Client create(ClientDTO dto) {
        Client client = Client.builder()
                .name(dto.getName())
                .profile(dto.getProfile())
                .liquidity(dto.getLiquidity())
                .investmentGoal(dto.getInvestmentGoal())
                .build();
        return clientRepository.save(client);
    }

    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    public Client getById(Long id) {
        return clientRepository.findById(id).orElseThrow();
    }

    public Client update(Long id, ClientDTO dto) {
        Client client = getById(id);
        client.setName(dto.getName());
        client.setProfile(dto.getProfile());
        client.setLiquidity(dto.getLiquidity());
        client.setInvestmentGoal(dto.getInvestmentGoal());
        return clientRepository.save(client);
    }

    public void delete(Long id) {
        clientRepository.deleteById(id);
    }
}
