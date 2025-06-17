package br.com.fiap.sprint1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientDTO {
    private String name;
    private String profile;
    private double liquidity;
    private String investmentGoal;
}
