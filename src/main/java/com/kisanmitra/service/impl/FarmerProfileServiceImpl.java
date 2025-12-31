package com.kisanmitra.service.impl;

import com.kisanmitra.models.FarmerProfile;
import com.kisanmitra.repositories.FarmerProfileRepository;
import com.kisanmitra.service.FarmerProfileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmerProfileServiceImpl implements FarmerProfileService {

    private final FarmerProfileRepository repo;

    public FarmerProfileServiceImpl(FarmerProfileRepository repo) {
        this.repo = repo;
    }

    public FarmerProfile save(FarmerProfile farmer) {
        return repo.save(farmer);
    }

    public List<FarmerProfile> getAll() {
        return repo.findAll();
    }
}
