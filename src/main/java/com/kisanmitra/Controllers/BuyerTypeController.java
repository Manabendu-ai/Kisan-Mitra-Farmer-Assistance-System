package com.kisanmitra.Controllers;

import com.kisanmitra.models.BuyerType;
import com.kisanmitra.service.BuyerTypeService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/buyer-types")
public class BuyerTypeController {

    private final BuyerTypeService service;

    public BuyerTypeController(BuyerTypeService service) {
        this.service = service;
    }

    @PostMapping
    public BuyerType create(@RequestBody BuyerType type) {
        return service.save(type);
    }

    @GetMapping
    public List<BuyerType> getAll() {
        return service.getAll();
    }
}
