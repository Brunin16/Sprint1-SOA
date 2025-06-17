package br.com.fiap.sprint1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PortfolioRecommendationDTO {
    private Long clientId;
    private String recommendedPortfolio;
    private String explanation;
}
