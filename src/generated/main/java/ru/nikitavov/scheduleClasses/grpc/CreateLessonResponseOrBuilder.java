// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lesson.proto

package ru.nikitavov.scheduleClasses.grpc;

public interface CreateLessonResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lesson.CreateLessonResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.MessageCode code = 1;</code>
   */
  int getCodeValue();
  /**
   * <code>.MessageCode code = 1;</code>
   */
  ru.nikitavov.scheduleClasses.grpc.MessageCode getCode();

  /**
   * <code>string field = 2;</code>
   */
  java.lang.String getField();
  /**
   * <code>string field = 2;</code>
   */
  com.google.protobuf.ByteString
      getFieldBytes();

  /**
   * <code>int64 id = 3;</code>
   */
  long getId();
}
