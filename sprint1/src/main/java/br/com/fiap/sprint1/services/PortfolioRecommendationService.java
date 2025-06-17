package br.com.fiap.sprint1.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.fiap.sprint1.dto.PortfolioRecommendationDTO;
import br.com.fiap.sprint1.model.Client;
import br.com.fiap.sprint1.model.PortfolioRecommendation;
import br.com.fiap.sprint1.repository.ClientRepository;
import br.com.fiap.sprint1.repository.PortfolioRecommendationRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PortfolioRecommendationService {

    private PortfolioRecommendationRepository recommendationRepository;
    private ClientRepository clientRepository;
    public PortfolioRecommendation create(PortfolioRecommendationDTO dto) {
        Client client = clientRepository.findById(dto.getClientId()).orElseThrow();

        PortfolioRecommendation recommendation = PortfolioRecommendation.builder()
                .client(client)
                .recommendedPortfolio(dto.getRecommendedPortfolio())
                .explanation(dto.getExplanation())
                .build();

        return recommendationRepository.save(recommendation);
    }

    public List<PortfolioRecommendation> getAll() {
        return recommendationRepository.findAll();
    }

    public PortfolioRecommendation getById(Long id) {
        return recommendationRepository.findById(id).orElseThrow();
    }

    public PortfolioRecommendation update(Long id, PortfolioRecommendationDTO dto) {
        PortfolioRecommendation recommendation = getById(id);
        Client client = clientRepository.findById(dto.getClientId()).orElseThrow();

        recommendation.setClient(client);
        recommendation.setRecommendedPortfolio(dto.getRecommendedPortfolio());
        recommendation.setExplanation(dto.getExplanation());

        return recommendationRepository.save(recommendation);
    }

    public void delete(Long id) {
        recommendationRepository.deleteById(id);
    }
}
