// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: specialization.proto

package ru.nikitavov.scheduleClasses.grpc;

public final class SpecializationProto {
  private SpecializationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_specialization_CreateSpecializationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_specialization_CreateSpecializationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_specialization_CreateSpecializationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_specialization_CreateSpecializationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_specialization_ReadSpecializationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_specialization_ReadSpecializationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_specialization_ReadSpecializationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_specialization_ReadSpecializationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_specialization_EditSpecializationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_specialization_EditSpecializationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_specialization_EditSpecializationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_specialization_EditSpecializationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_specialization_DeleteSpecializationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_specialization_DeleteSpecializationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_specialization_DeleteSpecializationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_specialization_DeleteSpecializationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_specialization_ReadAllSpecializationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_specialization_ReadAllSpecializationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_specialization_ReadAllSpecializationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_specialization_ReadAllSpecializationResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024specialization.proto\022\016specialization\032\021" +
      "messageCode.proto\"+\n\033CreateSpecializatio" +
      "nRequest\022\014\n\004name\030\001 \001(\t\"F\n\034CreateSpeciali" +
      "zationResponse\022\032\n\004code\030\001 \001(\0162\014.MessageCo" +
      "de\022\n\n\002id\030\002 \001(\003\"\'\n\031ReadSpecializationRequ" +
      "est\022\n\n\002id\030\001 \001(\003\"R\n\032ReadSpecializationRes" +
      "ponse\022\032\n\004code\030\001 \001(\0162\014.MessageCode\022\n\n\002id\030" +
      "\002 \001(\003\022\014\n\004name\030\003 \001(\t\"5\n\031EditSpecializatio" +
      "nRequest\022\n\n\002id\030\001 \001(\003\022\014\n\004name\030\002 \001(\t\"G\n\032Ed" +
      "itSpecializationResponse\022\032\n\004code\030\001 \001(\0162\014" +
      ".MessageCode\022\r\n\005field\030\002 \001(\t\")\n\033DeleteSpe" +
      "cializationRequest\022\n\n\002id\030\001 \001(\003\":\n\034Delete" +
      "SpecializationResponse\022\032\n\004code\030\001 \001(\0162\014.M" +
      "essageCode\"\036\n\034ReadAllSpecializationReque" +
      "st\"^\n\035ReadAllSpecializationResponse\022=\n\tr" +
      "esponses\030\001 \003(\0132*.specialization.ReadSpec" +
      "ializationResponse2\212\004\n\016Specialization\022e\n" +
      "\006Create\022+.specialization.CreateSpecializ" +
      "ationRequest\032,.specialization.CreateSpec" +
      "ializationResponse\"\000\022_\n\004Read\022).specializ" +
      "ation.ReadSpecializationRequest\032*.specia" +
      "lization.ReadSpecializationResponse\"\000\022_\n" +
      "\004Edit\022).specialization.EditSpecializatio" +
      "nRequest\032*.specialization.EditSpecializa" +
      "tionResponse\"\000\022e\n\006Delete\022+.specializatio" +
      "n.DeleteSpecializationRequest\032,.speciali" +
      "zation.DeleteSpecializationResponse\"\000\022h\n" +
      "\007ReadAll\022,.specialization.ReadAllSpecial" +
      "izationRequest\032-.specialization.ReadAllS" +
      "pecializationResponse\"\000B:\n!ru.nikitavov." +
      "scheduleClasses.grpcB\023SpecializationProt" +
      "oP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ru.nikitavov.scheduleClasses.grpc.MessageCodeOuterClass.getDescriptor(),
        }, assigner);
    internal_static_specialization_CreateSpecializationRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_specialization_CreateSpecializationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_specialization_CreateSpecializationRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_specialization_CreateSpecializationResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_specialization_CreateSpecializationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_specialization_CreateSpecializationResponse_descriptor,
        new java.lang.String[] { "Code", "Id", });
    internal_static_specialization_ReadSpecializationRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_specialization_ReadSpecializationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_specialization_ReadSpecializationRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_specialization_ReadSpecializationResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_specialization_ReadSpecializationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_specialization_ReadSpecializationResponse_descriptor,
        new java.lang.String[] { "Code", "Id", "Name", });
    internal_static_specialization_EditSpecializationRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_specialization_EditSpecializationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_specialization_EditSpecializationRequest_descriptor,
        new java.lang.String[] { "Id", "Name", });
    internal_static_specialization_EditSpecializationResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_specialization_EditSpecializationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_specialization_EditSpecializationResponse_descriptor,
        new java.lang.String[] { "Code", "Field", });
    internal_static_specialization_DeleteSpecializationRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_specialization_DeleteSpecializationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_specialization_DeleteSpecializationRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_specialization_DeleteSpecializationResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_specialization_DeleteSpecializationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_specialization_DeleteSpecializationResponse_descriptor,
        new java.lang.String[] { "Code", });
    internal_static_specialization_ReadAllSpecializationRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_specialization_ReadAllSpecializationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_specialization_ReadAllSpecializationRequest_descriptor,
        new java.lang.String[] { });
    internal_static_specialization_ReadAllSpecializationResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_specialization_ReadAllSpecializationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_specialization_ReadAllSpecializationResponse_descriptor,
        new java.lang.String[] { "Responses", });
    ru.nikitavov.scheduleClasses.grpc.MessageCodeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}