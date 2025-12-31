package com.kisanmitra.Controllers;

import com.kisanmitra.models.CropsGrown;
import com.kisanmitra.service.CropsGrownService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/crops")
public class CropsGrownController {

    private final CropsGrownService service;

    public CropsGrownController(CropsGrownService service) {
        this.service = service;
    }

    @PostMapping
    public CropsGrown create(@RequestBody CropsGrown crop) {
        return service.save(crop);
    }

    @GetMapping
    public List<CropsGrown> getAll() {
        return service.getAll();
    }
}
