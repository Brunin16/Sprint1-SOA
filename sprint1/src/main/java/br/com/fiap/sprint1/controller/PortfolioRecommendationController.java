package br.com.fiap.sprint1.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.sprint1.dto.PortfolioRecommendationDTO;
import br.com.fiap.sprint1.model.PortfolioRecommendation;
import br.com.fiap.sprint1.services.PortfolioRecommendationService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/recommendations")
public class PortfolioRecommendationController {
    
    private PortfolioRecommendationService recommendationService;

    @PostMapping
    public PortfolioRecommendation create(@RequestBody PortfolioRecommendationDTO dto) {
        return recommendationService.create(dto);
    }

    @GetMapping
    public List<PortfolioRecommendation> getAll() {
        return recommendationService.getAll();
    }

    @GetMapping("/{id}")
    public PortfolioRecommendation getById(@PathVariable Long id) {
        return recommendationService.getById(id);
    }

    @PutMapping("/{id}")
    public PortfolioRecommendation update(@PathVariable Long id, @RequestBody PortfolioRecommendationDTO dto) {
        return recommendationService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        recommendationService.delete(id);
    }
}
