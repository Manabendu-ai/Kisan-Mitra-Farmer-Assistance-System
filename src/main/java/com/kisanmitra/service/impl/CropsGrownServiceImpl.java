package com.kisanmitra.service.impl;

import com.kisanmitra.models.CropsGrown;
import com.kisanmitra.repositories.CropsGrownRepository;
import com.kisanmitra.service.CropsGrownService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CropsGrownServiceImpl implements CropsGrownService {

    private final CropsGrownRepository repo;

    public CropsGrownServiceImpl(CropsGrownRepository repo) {
        this.repo = repo;
    }

    public CropsGrown save(CropsGrown crop) {
        return repo.save(crop);
    }

    public List<CropsGrown> getAll() {
        return repo.findAll();
    }
}

