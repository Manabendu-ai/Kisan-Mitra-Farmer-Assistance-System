package com.kisanmitra.service;

import com.kisanmitra.models.BuyerType;

import java.util.List;

public interface BuyerTypeService {
    BuyerType save(BuyerType type);
    List<BuyerType> getAll();
}
