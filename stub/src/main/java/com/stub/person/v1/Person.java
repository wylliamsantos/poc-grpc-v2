// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Person.proto

package com.stub.person.v1;

public final class Person {
  private Person() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_stub_person_v1_PersonRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_stub_person_v1_PersonRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_stub_person_v1_PersonResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_stub_person_v1_PersonResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_stub_person_v1_PersonRequestCode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_stub_person_v1_PersonRequestCode_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Person.proto\022\022com.stub.person.v1\"/\n\rPe" +
      "rsonRequest\022\020\n\010document\030\001 \001(\t\022\014\n\004name\030\002 " +
      "\001(\t\"\036\n\016PersonResponse\022\014\n\004code\030\001 \001(\t\"!\n\021P" +
      "ersonRequestCode\022\014\n\004code\030\001 \001(\t2\263\001\n\rPerso" +
      "nService\022O\n\006Create\022!.com.stub.person.v1." +
      "PersonRequest\032\".com.stub.person.v1.Perso" +
      "nResponse\022Q\n\004find\022%.com.stub.person.v1.P" +
      "ersonRequestCode\032\".com.stub.person.v1.Pe" +
      "rsonResponseB\026\n\022com.stub.person.v1P\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_stub_person_v1_PersonRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_stub_person_v1_PersonRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_stub_person_v1_PersonRequest_descriptor,
        new java.lang.String[] { "Document", "Name", });
    internal_static_com_stub_person_v1_PersonResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_stub_person_v1_PersonResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_stub_person_v1_PersonResponse_descriptor,
        new java.lang.String[] { "Code", });
    internal_static_com_stub_person_v1_PersonRequestCode_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_stub_person_v1_PersonRequestCode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_stub_person_v1_PersonRequestCode_descriptor,
        new java.lang.String[] { "Code", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
