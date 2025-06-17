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

import br.com.fiap.sprint1.dto.AssetDTO;
import br.com.fiap.sprint1.model.Asset;
import br.com.fiap.sprint1.services.AssetService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/assets")
public class AssetController {
    
    private AssetService assetService;

    @PostMapping
    public Asset create(@RequestBody AssetDTO dto) {
        return assetService.create(dto);
    }

    @GetMapping
    public List<Asset> getAll() {
        return assetService.getAll();
    }

    @GetMapping("/{id}")
    public Asset getById(@PathVariable Long id) {
        return assetService.getById(id);
    }

    @PutMapping("/{id}")
    public Asset update(@PathVariable Long id, @RequestBody AssetDTO dto) {
        return assetService.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        assetService.delete(id);
    }
}
