package com.kisanmitra.service;

import com.kisanmitra.models.FarmerProfile;

import java.util.List;

public interface FarmerProfileService {
    FarmerProfile save(FarmerProfile farmer);
    List<FarmerProfile> getAll();
}
