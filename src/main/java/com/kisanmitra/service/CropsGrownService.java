package com.kisanmitra.service;

import com.kisanmitra.models.CropsGrown;

import java.util.List;

public interface CropsGrownService {
    CropsGrown save(CropsGrown crop);
    List<CropsGrown> getAll();
}
