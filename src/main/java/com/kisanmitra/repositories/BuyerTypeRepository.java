package com.kisanmitra.repositories;

import com.kisanmitra.models.BuyerType;
import com.kisanmitra.models.BuyerTypeId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyerTypeRepository
        extends JpaRepository<BuyerType, BuyerTypeId> {
}
