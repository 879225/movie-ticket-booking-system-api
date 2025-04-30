package com.example.mtb.service;

import com.example.mtb.dto.TheaterRegisterationRequest;
import com.example.mtb.dto.TheaterResponse;
import jakarta.validation.Valid;

public interface TheaterService {

    TheaterResponse addTheater(String email, @Valid TheaterRegisterationRequest theaterRegisterationRequest);

}