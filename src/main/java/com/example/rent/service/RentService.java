package com.example.rent.service;

import com.example.rent.dao.RentDAOImpl;
import com.example.rent.entity.Rent;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RentService {
    private final RentDAOImpl rentDAO;

    public void insert(Rent rent) {
        rentDAO.insert(rent);
    }

    public Rent findById(Long id) {
        return rentDAO.findById(id);
    }

    public void delete(Long id) {
        rentDAO.delete(id);
    }

    public void update(Rent rent) {
        rentDAO.update(rent);
    }

    public List<Rent> findAll() {
        return rentDAO.findAll();
    }

}
