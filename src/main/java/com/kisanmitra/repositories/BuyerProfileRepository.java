package com.kisanmitra.repositories;

import com.kisanmitra.models.BuyerProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyerProfileRepository
        extends JpaRepository<BuyerProfile, Integer> {
}
