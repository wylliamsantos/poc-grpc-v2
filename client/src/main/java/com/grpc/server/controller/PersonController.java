package com.grpc.server.controller;

import com.grpc.server.dto.PersonRequestDTO;
import com.grpc.server.dto.PersonResponseDTO;
import com.grpc.server.service.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private PersonResponseDTO create(@RequestBody final PersonRequestDTO dto) {
        return personService.create(dto);
    }

    @GetMapping("/{code}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    private PersonResponseDTO find(@PathVariable("code") final String code) {
        return personService.find(code);
    }
}
