// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: schedule.proto

package ru.nikitavov.scheduleClasses.grpc;

public interface ReadAllScheduleResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:schedule.ReadAllScheduleResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .schedule.ReadScheduleResponse responses = 1;</code>
   */
  java.util.List<ru.nikitavov.scheduleClasses.grpc.ReadScheduleResponse> 
      getResponsesList();
  /**
   * <code>repeated .schedule.ReadScheduleResponse responses = 1;</code>
   */
  ru.nikitavov.scheduleClasses.grpc.ReadScheduleResponse getResponses(int index);
  /**
   * <code>repeated .schedule.ReadScheduleResponse responses = 1;</code>
   */
  int getResponsesCount();
  /**
   * <code>repeated .schedule.ReadScheduleResponse responses = 1;</code>
   */
  java.util.List<? extends ru.nikitavov.scheduleClasses.grpc.ReadScheduleResponseOrBuilder> 
      getResponsesOrBuilderList();
  /**
   * <code>repeated .schedule.ReadScheduleResponse responses = 1;</code>
   */
  ru.nikitavov.scheduleClasses.grpc.ReadScheduleResponseOrBuilder getResponsesOrBuilder(
      int index);
}