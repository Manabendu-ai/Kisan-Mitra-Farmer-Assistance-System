package com.kisanmitra.service;

import com.kisanmitra.models.BuyerProfile;

import java.util.List;

public interface BuyerProfileService {
    BuyerProfile save(BuyerProfile buyer);
    List<BuyerProfile> getAll();
}
