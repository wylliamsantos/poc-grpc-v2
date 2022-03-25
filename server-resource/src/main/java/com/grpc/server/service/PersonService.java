package com.grpc.server.service;

import com.stub.person.v1.PersonRequest;
import com.stub.person.v1.PersonRequestCode;
import com.stub.person.v1.PersonResponse;
import com.stub.person.v1.PersonServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PersonService extends PersonServiceGrpc.PersonServiceImplBase {

    @Override
    public void create(PersonRequest request, StreamObserver<PersonResponse> responseObserver) {
        var resp = PersonResponse.newBuilder()
                .setCode(UUID.randomUUID().toString())
                .build();

        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }

    @Override
    public void find(PersonRequestCode request, StreamObserver<PersonResponse> responseObserver) {
        var resp = PersonResponse.newBuilder()
                .setCode(UUID.randomUUID().toString())
                .build();

        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }
}
