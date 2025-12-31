package com.kisanmitra.repositories;

import com.kisanmitra.models.FarmerProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmerProfileRepository
        extends JpaRepository<FarmerProfile, Integer> {
}

