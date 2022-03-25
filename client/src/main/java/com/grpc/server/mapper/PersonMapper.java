package com.grpc.server.mapper;

import com.grpc.server.dto.PersonRequestDTO;
import com.grpc.server.dto.PersonResponseDTO;
import com.stub.person.v1.PersonRequest;
import com.stub.person.v1.PersonRequestCode;
import com.stub.person.v1.PersonResponse;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PersonMapper {

    public static PersonRequest toRequest(final PersonRequestDTO dto) {
        return PersonRequest
                .newBuilder()
                .setDocument(dto.getDocument())
                .setName(dto.getName())
                .build();
    }

    public static PersonResponseDTO toResponse(final PersonResponse response) {
        return PersonResponseDTO.builder()
                .code(response.getCode())
                .build();
    }

    public static PersonRequestCode toRequest(final String code) {
        return PersonRequestCode
                .newBuilder()
                .setCode(code)
                .build();
    }
}
