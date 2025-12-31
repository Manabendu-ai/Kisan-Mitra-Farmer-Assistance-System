package com.kisanmitra.repositories;

import com.kisanmitra.models.DriverProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverProfileRepository
        extends JpaRepository<DriverProfile, Integer> {
}

