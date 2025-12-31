package com.kisanmitra.Controllers;

import com.kisanmitra.models.DriverProfile;
import com.kisanmitra.service.DriverProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drivers")
public class DriverProfileController {

    private final DriverProfileService service;

    public DriverProfileController(DriverProfileService service) {
        this.service = service;
    }

    @PostMapping
    public DriverProfile create(@RequestBody DriverProfile driver) {
        return service.save(driver);
    }

    @GetMapping
    public List<DriverProfile> getAll() {
        return service.getAll();
    }
}
