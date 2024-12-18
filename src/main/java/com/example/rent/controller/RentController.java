package com.example.rent.controller;

import com.example.rent.entity.Rent;
import com.example.rent.service.RentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@AllArgsConstructor
public class RentController {
    private final RentService rentService;

    @PostMapping
    public String insert(@RequestBody Rent rent) {
        rentService.insert(rent);
        return "Rent Insert +++++++++++++++";
    }

    @GetMapping("/{id}")
    public Rent findById(@PathVariable Long id) {
        return rentService.findById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        rentService.delete(id);
        return "Rent deleted successfully! delete -------";
    }

    @PutMapping
    public String update(@RequestBody Rent rent) {
        rentService.update(rent);
        return "Rent updated successfully!update update upupupupup";
    }

    @GetMapping
    public List<Rent> findAll() {
        return rentService.findAll();
    }
}
