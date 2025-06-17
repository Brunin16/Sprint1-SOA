package br.com.fiap.sprint1.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.fiap.sprint1.dto.AssetDTO;
import br.com.fiap.sprint1.model.Asset;
import br.com.fiap.sprint1.repository.AssetRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AssetService {
 private AssetRepository assetRepository;

    public Asset create(AssetDTO dto) {
        Asset asset = Asset.builder()
                .name(dto.getName())
                .category(dto.getCategory())
                .details(dto.getDetails())
                .build();
        return assetRepository.save(asset);
    }

    public List<Asset> getAll() {
        return assetRepository.findAll();
    }

    public Asset getById(Long id) {
        return assetRepository.findById(id).orElseThrow();
    }

    public Asset update(Long id, AssetDTO dto) {
        Asset asset = getById(id);
        asset.setName(dto.getName());
        asset.setCategory(dto.getCategory());
        asset.setDetails(dto.getDetails());
        return assetRepository.save(asset);
    }

    public void delete(Long id) {
        assetRepository.deleteById(id);
    }
}
