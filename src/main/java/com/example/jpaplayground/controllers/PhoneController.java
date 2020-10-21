package com.example.jpaplayground.controllers;

import com.example.jpaplayground.models.models.Phone;
import com.example.jpaplayground.repositories.PhoneRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhoneController {

    private final PhoneRepository phoneRepository;

    public PhoneController(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    @PostMapping
    public void create(@RequestBody Phone phone) {
        this.phoneRepository.saveAndFlush(phone);
    }
}
