// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test.proto

package com.grpc.getAccountsClasses;

public final class Test {
  private Test() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_getAccountsClasses_BalanceGRpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_getAccountsClasses_BalanceGRpc_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_getAccountsClasses_AccountGRpc_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_getAccountsClasses_AccountGRpc_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_grpc_getAccountsClasses_getAccountRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_grpc_getAccountsClasses_getAccountRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ntest.proto\022\033com.grpc.getAccountsClasse" +
      "s\"A\n\013BalanceGRpc\022\r\n\005value\030\001 \001(\t\022\021\n\tpreci" +
      "sion\030\002 \001(\t\022\020\n\010currency\030\003 \001(\t\"\246\001\n\013Account" +
      "GRpc\022\n\n\002id\030\001 \001(\t\022\017\n\007created\030\002 \001(\t\022\016\n\006upd" +
      "ate\030\003 \001(\t\022\014\n\004iban\030\004 \001(\t\0229\n\007balance\030\005 \001(\013" +
      "2(.com.grpc.getAccountsClasses.BalanceGR" +
      "pc\022\021\n\tpublished\030\006 \001(\t\022\016\n\006hidden\030\007 \001(\t\"\023\n" +
      "\021getAccountRequest2v\n\013GRPCaccount\022g\n\013get" +
      "Accounts\022..com.grpc.getAccountsClasses.g" +
      "etAccountRequest\032(.com.grpc.getAccountsC" +
      "lasses.AccountGRpcB\002P\001b\006proto3"
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
        }, assigner);
    internal_static_com_grpc_getAccountsClasses_BalanceGRpc_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_grpc_getAccountsClasses_BalanceGRpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_getAccountsClasses_BalanceGRpc_descriptor,
        new java.lang.String[] { "Value", "Precision", "Currency", });
    internal_static_com_grpc_getAccountsClasses_AccountGRpc_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_grpc_getAccountsClasses_AccountGRpc_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_getAccountsClasses_AccountGRpc_descriptor,
        new java.lang.String[] { "Id", "Created", "Update", "Iban", "Balance", "Published", "Hidden", });
    internal_static_com_grpc_getAccountsClasses_getAccountRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_grpc_getAccountsClasses_getAccountRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_grpc_getAccountsClasses_getAccountRequest_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}