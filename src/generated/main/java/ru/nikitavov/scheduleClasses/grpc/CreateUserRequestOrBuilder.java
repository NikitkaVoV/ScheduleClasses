// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package ru.nikitavov.scheduleClasses.grpc;

public interface CreateUserRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:user.CreateUserRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 roleId = 1;</code>
   */
  long getRoleId();

  /**
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string login = 3;</code>
   */
  java.lang.String getLogin();
  /**
   * <code>string login = 3;</code>
   */
  com.google.protobuf.ByteString
      getLoginBytes();

  /**
   * <code>string password = 4;</code>
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 4;</code>
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <code>string mail = 5;</code>
   */
  java.lang.String getMail();
  /**
   * <code>string mail = 5;</code>
   */
  com.google.protobuf.ByteString
      getMailBytes();
}