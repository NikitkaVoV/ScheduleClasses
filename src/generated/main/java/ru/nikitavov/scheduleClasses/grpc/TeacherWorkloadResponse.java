// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: report.proto

package ru.nikitavov.scheduleClasses.grpc;

/**
 * Protobuf type {@code report.TeacherWorkloadResponse}
 */
public  final class TeacherWorkloadResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:report.TeacherWorkloadResponse)
    TeacherWorkloadResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TeacherWorkloadResponse.newBuilder() to construct.
  private TeacherWorkloadResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TeacherWorkloadResponse() {
    code_ = 0;
    teachers_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TeacherWorkloadResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            code_ = rawValue;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              teachers_ = new java.util.ArrayList<ru.nikitavov.scheduleClasses.grpc.TeacherInfo>();
              mutable_bitField0_ |= 0x00000002;
            }
            teachers_.add(
                input.readMessage(ru.nikitavov.scheduleClasses.grpc.TeacherInfo.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        teachers_ = java.util.Collections.unmodifiableList(teachers_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ru.nikitavov.scheduleClasses.grpc.ReportProto.internal_static_report_TeacherWorkloadResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ru.nikitavov.scheduleClasses.grpc.ReportProto.internal_static_report_TeacherWorkloadResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse.class, ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse.Builder.class);
  }

  private int bitField0_;
  public static final int CODE_FIELD_NUMBER = 1;
  private int code_;
  /**
   * <code>.MessageCode code = 1;</code>
   */
  public int getCodeValue() {
    return code_;
  }
  /**
   * <code>.MessageCode code = 1;</code>
   */
  public ru.nikitavov.scheduleClasses.grpc.MessageCode getCode() {
    ru.nikitavov.scheduleClasses.grpc.MessageCode result = ru.nikitavov.scheduleClasses.grpc.MessageCode.valueOf(code_);
    return result == null ? ru.nikitavov.scheduleClasses.grpc.MessageCode.UNRECOGNIZED : result;
  }

  public static final int TEACHERS_FIELD_NUMBER = 2;
  private java.util.List<ru.nikitavov.scheduleClasses.grpc.TeacherInfo> teachers_;
  /**
   * <code>repeated .report.TeacherInfo teachers = 2;</code>
   */
  public java.util.List<ru.nikitavov.scheduleClasses.grpc.TeacherInfo> getTeachersList() {
    return teachers_;
  }
  /**
   * <code>repeated .report.TeacherInfo teachers = 2;</code>
   */
  public java.util.List<? extends ru.nikitavov.scheduleClasses.grpc.TeacherInfoOrBuilder> 
      getTeachersOrBuilderList() {
    return teachers_;
  }
  /**
   * <code>repeated .report.TeacherInfo teachers = 2;</code>
   */
  public int getTeachersCount() {
    return teachers_.size();
  }
  /**
   * <code>repeated .report.TeacherInfo teachers = 2;</code>
   */
  public ru.nikitavov.scheduleClasses.grpc.TeacherInfo getTeachers(int index) {
    return teachers_.get(index);
  }
  /**
   * <code>repeated .report.TeacherInfo teachers = 2;</code>
   */
  public ru.nikitavov.scheduleClasses.grpc.TeacherInfoOrBuilder getTeachersOrBuilder(
      int index) {
    return teachers_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (code_ != ru.nikitavov.scheduleClasses.grpc.MessageCode.EMPTY.getNumber()) {
      output.writeEnum(1, code_);
    }
    for (int i = 0; i < teachers_.size(); i++) {
      output.writeMessage(2, teachers_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code_ != ru.nikitavov.scheduleClasses.grpc.MessageCode.EMPTY.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, code_);
    }
    for (int i = 0; i < teachers_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, teachers_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse)) {
      return super.equals(obj);
    }
    ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse other = (ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse) obj;

    boolean result = true;
    result = result && code_ == other.code_;
    result = result && getTeachersList()
        .equals(other.getTeachersList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + code_;
    if (getTeachersCount() > 0) {
      hash = (37 * hash) + TEACHERS_FIELD_NUMBER;
      hash = (53 * hash) + getTeachersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code report.TeacherWorkloadResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:report.TeacherWorkloadResponse)
      ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ru.nikitavov.scheduleClasses.grpc.ReportProto.internal_static_report_TeacherWorkloadResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ru.nikitavov.scheduleClasses.grpc.ReportProto.internal_static_report_TeacherWorkloadResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse.class, ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse.Builder.class);
    }

    // Construct using ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getTeachersFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      code_ = 0;

      if (teachersBuilder_ == null) {
        teachers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        teachersBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ru.nikitavov.scheduleClasses.grpc.ReportProto.internal_static_report_TeacherWorkloadResponse_descriptor;
    }

    public ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse getDefaultInstanceForType() {
      return ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse.getDefaultInstance();
    }

    public ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse build() {
      ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse buildPartial() {
      ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse result = new ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.code_ = code_;
      if (teachersBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          teachers_ = java.util.Collections.unmodifiableList(teachers_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.teachers_ = teachers_;
      } else {
        result.teachers_ = teachersBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse) {
        return mergeFrom((ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse other) {
      if (other == ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse.getDefaultInstance()) return this;
      if (other.code_ != 0) {
        setCodeValue(other.getCodeValue());
      }
      if (teachersBuilder_ == null) {
        if (!other.teachers_.isEmpty()) {
          if (teachers_.isEmpty()) {
            teachers_ = other.teachers_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureTeachersIsMutable();
            teachers_.addAll(other.teachers_);
          }
          onChanged();
        }
      } else {
        if (!other.teachers_.isEmpty()) {
          if (teachersBuilder_.isEmpty()) {
            teachersBuilder_.dispose();
            teachersBuilder_ = null;
            teachers_ = other.teachers_;
            bitField0_ = (bitField0_ & ~0x00000002);
            teachersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTeachersFieldBuilder() : null;
          } else {
            teachersBuilder_.addAllMessages(other.teachers_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int code_ = 0;
    /**
     * <code>.MessageCode code = 1;</code>
     */
    public int getCodeValue() {
      return code_;
    }
    /**
     * <code>.MessageCode code = 1;</code>
     */
    public Builder setCodeValue(int value) {
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.MessageCode code = 1;</code>
     */
    public ru.nikitavov.scheduleClasses.grpc.MessageCode getCode() {
      ru.nikitavov.scheduleClasses.grpc.MessageCode result = ru.nikitavov.scheduleClasses.grpc.MessageCode.valueOf(code_);
      return result == null ? ru.nikitavov.scheduleClasses.grpc.MessageCode.UNRECOGNIZED : result;
    }
    /**
     * <code>.MessageCode code = 1;</code>
     */
    public Builder setCode(ru.nikitavov.scheduleClasses.grpc.MessageCode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      code_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.MessageCode code = 1;</code>
     */
    public Builder clearCode() {
      
      code_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<ru.nikitavov.scheduleClasses.grpc.TeacherInfo> teachers_ =
      java.util.Collections.emptyList();
    private void ensureTeachersIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        teachers_ = new java.util.ArrayList<ru.nikitavov.scheduleClasses.grpc.TeacherInfo>(teachers_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ru.nikitavov.scheduleClasses.grpc.TeacherInfo, ru.nikitavov.scheduleClasses.grpc.TeacherInfo.Builder, ru.nikitavov.scheduleClasses.grpc.TeacherInfoOrBuilder> teachersBuilder_;

    /**
     * <code>repeated .report.TeacherInfo teachers = 2;</code>
     */
    public java.util.List<ru.nikitavov.scheduleClasses.grpc.TeacherInfo> getTeachersList() {
      if (teachersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(teachers_);
      } else {
        return teachersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .report.TeacherInfo teachers = 2;</code>
     */
    public int getTeachersCount() {
      if (teachersBuilder_ == null) {
        return teachers_.size();
      } else {
        return teachersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .report.TeacherInfo teachers = 2;</code>
     */
    public ru.nikitavov.scheduleClasses.grpc.TeacherInfo getTeachers(int index) {
      if (teachersBuilder_ == null) {
        return teachers_.get(index);
      } else {
        return teachersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .report.TeacherInfo teachers = 2;</code>
     */
    public Builder setTeachers(
        int index, ru.nikitavov.scheduleClasses.grpc.TeacherInfo value) {
      if (teachersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTeachersIsMutable();
        teachers_.set(index, value);
        onChanged();
      } else {
        teachersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .report.TeacherInfo teachers = 2;</code>
     */
    public Builder setTeachers(
        int index, ru.nikitavov.scheduleClasses.grpc.TeacherInfo.Builder builderForValue) {
      if (teachersBuilder_ == null) {
        ensureTeachersIsMutable();
        teachers_.set(index, builderForValue.build());
        onChanged();
      } else {
        teachersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .report.TeacherInfo teachers = 2;</code>
     */
    public Builder addTeachers(ru.nikitavov.scheduleClasses.grpc.TeacherInfo value) {
      if (teachersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTeachersIsMutable();
        teachers_.add(value);
        onChanged();
      } else {
        teachersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .report.TeacherInfo teachers = 2;</code>
     */
    public Builder addTeachers(
        int index, ru.nikitavov.scheduleClasses.grpc.TeacherInfo value) {
      if (teachersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTeachersIsMutable();
        teachers_.add(index, value);
        onChanged();
      } else {
        teachersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .report.TeacherInfo teachers = 2;</code>
     */
    public Builder addTeachers(
        ru.nikitavov.scheduleClasses.grpc.TeacherInfo.Builder builderForValue) {
      if (teachersBuilder_ == null) {
        ensureTeachersIsMutable();
        teachers_.add(builderForValue.build());
        onChanged();
      } else {
        teachersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .report.TeacherInfo teachers = 2;</code>
     */
    public Builder addTeachers(
        int index, ru.nikitavov.scheduleClasses.grpc.TeacherInfo.Builder builderForValue) {
      if (teachersBuilder_ == null) {
        ensureTeachersIsMutable();
        teachers_.add(index, builderForValue.build());
        onChanged();
      } else {
        teachersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .report.TeacherInfo teachers = 2;</code>
     */
    public Builder addAllTeachers(
        java.lang.Iterable<? extends ru.nikitavov.scheduleClasses.grpc.TeacherInfo> values) {
      if (teachersBuilder_ == null) {
        ensureTeachersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, teachers_);
        onChanged();
      } else {
        teachersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .report.TeacherInfo teachers = 2;</code>
     */
    public Builder clearTeachers() {
      if (teachersBuilder_ == null) {
        teachers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        teachersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .report.TeacherInfo teachers = 2;</code>
     */
    public Builder removeTeachers(int index) {
      if (teachersBuilder_ == null) {
        ensureTeachersIsMutable();
        teachers_.remove(index);
        onChanged();
      } else {
        teachersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .report.TeacherInfo teachers = 2;</code>
     */
    public ru.nikitavov.scheduleClasses.grpc.TeacherInfo.Builder getTeachersBuilder(
        int index) {
      return getTeachersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .report.TeacherInfo teachers = 2;</code>
     */
    public ru.nikitavov.scheduleClasses.grpc.TeacherInfoOrBuilder getTeachersOrBuilder(
        int index) {
      if (teachersBuilder_ == null) {
        return teachers_.get(index);  } else {
        return teachersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .report.TeacherInfo teachers = 2;</code>
     */
    public java.util.List<? extends ru.nikitavov.scheduleClasses.grpc.TeacherInfoOrBuilder> 
         getTeachersOrBuilderList() {
      if (teachersBuilder_ != null) {
        return teachersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(teachers_);
      }
    }
    /**
     * <code>repeated .report.TeacherInfo teachers = 2;</code>
     */
    public ru.nikitavov.scheduleClasses.grpc.TeacherInfo.Builder addTeachersBuilder() {
      return getTeachersFieldBuilder().addBuilder(
          ru.nikitavov.scheduleClasses.grpc.TeacherInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .report.TeacherInfo teachers = 2;</code>
     */
    public ru.nikitavov.scheduleClasses.grpc.TeacherInfo.Builder addTeachersBuilder(
        int index) {
      return getTeachersFieldBuilder().addBuilder(
          index, ru.nikitavov.scheduleClasses.grpc.TeacherInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .report.TeacherInfo teachers = 2;</code>
     */
    public java.util.List<ru.nikitavov.scheduleClasses.grpc.TeacherInfo.Builder> 
         getTeachersBuilderList() {
      return getTeachersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ru.nikitavov.scheduleClasses.grpc.TeacherInfo, ru.nikitavov.scheduleClasses.grpc.TeacherInfo.Builder, ru.nikitavov.scheduleClasses.grpc.TeacherInfoOrBuilder> 
        getTeachersFieldBuilder() {
      if (teachersBuilder_ == null) {
        teachersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ru.nikitavov.scheduleClasses.grpc.TeacherInfo, ru.nikitavov.scheduleClasses.grpc.TeacherInfo.Builder, ru.nikitavov.scheduleClasses.grpc.TeacherInfoOrBuilder>(
                teachers_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        teachers_ = null;
      }
      return teachersBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:report.TeacherWorkloadResponse)
  }

  // @@protoc_insertion_point(class_scope:report.TeacherWorkloadResponse)
  private static final ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse();
  }

  public static ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TeacherWorkloadResponse>
      PARSER = new com.google.protobuf.AbstractParser<TeacherWorkloadResponse>() {
    public TeacherWorkloadResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TeacherWorkloadResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TeacherWorkloadResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TeacherWorkloadResponse> getParserForType() {
    return PARSER;
  }

  public ru.nikitavov.scheduleClasses.grpc.TeacherWorkloadResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
