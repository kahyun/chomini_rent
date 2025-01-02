package com.example.rent.service;

import com.example.rent.dto.RentResponseDTO;
import com.example.rent.entity.Rent;

import java.util.ArrayList;
import java.util.List;

public interface RentService {

    void updateStatus(Long rentId, String status);
    List<RentResponseDTO> findAll() ;
}
