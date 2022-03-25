package com.grpc.server.dto;

import lombok.Data;

@Data
public class PersonRequestDTO {

    private String document;
    private String name;
}
