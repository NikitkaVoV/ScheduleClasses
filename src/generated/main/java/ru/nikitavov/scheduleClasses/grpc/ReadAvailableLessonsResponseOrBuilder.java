// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lesson.proto

package ru.nikitavov.scheduleClasses.grpc;

public interface ReadAvailableLessonsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lesson.ReadAvailableLessonsResponse)
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
   * <code>int64 teacherId = 2;</code>
   */
  long getTeacherId();

  /**
   * <code>repeated .lesson.ReadAvailableLessonResponse responses = 3;</code>
   */
  java.util.List<ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonResponse> 
      getResponsesList();
  /**
   * <code>repeated .lesson.ReadAvailableLessonResponse responses = 3;</code>
   */
  ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonResponse getResponses(int index);
  /**
   * <code>repeated .lesson.ReadAvailableLessonResponse responses = 3;</code>
   */
  int getResponsesCount();
  /**
   * <code>repeated .lesson.ReadAvailableLessonResponse responses = 3;</code>
   */
  java.util.List<? extends ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonResponseOrBuilder> 
      getResponsesOrBuilderList();
  /**
   * <code>repeated .lesson.ReadAvailableLessonResponse responses = 3;</code>
   */
  ru.nikitavov.scheduleClasses.grpc.ReadAvailableLessonResponseOrBuilder getResponsesOrBuilder(
      int index);
}
