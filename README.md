# poc-grpc-v2

Demonstration project of gRPC with spring boot.

## Installing

### stub module
- ./gradlew build
- ./gradlew publishToMavenLocal

### server-resource
- ./gradlew build

### client
- ./gradlew build

### Stub Generation

After install e publish stub module you can use your stubs including the right dependency:

implementation 'com.grpc.person.stub:stub:0.0.1

## Running the app

- Run the server by class GrpcApplication.java
- Then the client by class ClientApplication.java
- Call http://localhost:8080/persons/{code}