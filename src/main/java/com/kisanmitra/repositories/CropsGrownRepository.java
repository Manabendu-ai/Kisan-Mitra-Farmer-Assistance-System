package com.kisanmitra.repositories;

import com.kisanmitra.models.CropsGrown;
import com.kisanmitra.models.CropsGrownId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CropsGrownRepository
        extends JpaRepository<CropsGrown, CropsGrownId> {
}

