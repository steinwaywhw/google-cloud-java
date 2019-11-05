// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/common.proto

package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * A closed time interval. It extends from the start time to the end time, and includes both: `[startTime, endTime]`. Valid time intervals depend on the [`MetricKind`](/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors#MetricKind) of the metric value. In no case can the end time be earlier than the start time.
 * * For a `GAUGE` metric, the `startTime` value is technically optional; if
 *   no value is specified, the start time defaults to the value of the
 *   end time, and the interval represents a single point in time. If both
 *   start and end times are specified, they must be identical. Such an
 *   interval is valid only for `GAUGE` metrics, which are point-in-time
 *   measurements.
 * * For `DELTA` and `CUMULATIVE` metrics, the start time must be earlier
 *   than the end time.
 * * In all cases, the start time of the next interval must be
 *   at least a microsecond after the end time of the previous interval.
 *   Because the interval is closed, if the start time of a new interval
 *   is the same as the end time of the previous interval, data written
 *   at the new start time could overwrite data written at the previous
 *   end time.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.TimeInterval}
 */
public final class TimeInterval extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.TimeInterval)
    TimeIntervalOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TimeInterval.newBuilder() to construct.
  private TimeInterval(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TimeInterval() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private TimeInterval(
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
          case 10:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (startTime_ != null) {
                subBuilder = startTime_.toBuilder();
              }
              startTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(startTime_);
                startTime_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (endTime_ != null) {
                subBuilder = endTime_.toBuilder();
              }
              endTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(endTime_);
                endTime_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.CommonProto
        .internal_static_google_monitoring_v3_TimeInterval_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.CommonProto
        .internal_static_google_monitoring_v3_TimeInterval_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.TimeInterval.class,
            com.google.monitoring.v3.TimeInterval.Builder.class);
  }

  public static final int END_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp endTime_;
  /**
   *
   *
   * <pre>
   * Required. The end of the time interval.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   */
  public boolean hasEndTime() {
    return endTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The end of the time interval.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   */
  public com.google.protobuf.Timestamp getEndTime() {
    return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
  }
  /**
   *
   *
   * <pre>
   * Required. The end of the time interval.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder() {
    return getEndTime();
  }

  public static final int START_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp startTime_;
  /**
   *
   *
   * <pre>
   * Optional. The beginning of the time interval.  The default value
   * for the start time is the end time. The start time must not be
   * later than the end time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   */
  public boolean hasStartTime() {
    return startTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Optional. The beginning of the time interval.  The default value
   * for the start time is the end time. The start time must not be
   * later than the end time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   */
  public com.google.protobuf.Timestamp getStartTime() {
    return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The beginning of the time interval.  The default value
   * for the start time is the end time. The start time must not be
   * later than the end time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 1;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
    return getStartTime();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (startTime_ != null) {
      output.writeMessage(1, getStartTime());
    }
    if (endTime_ != null) {
      output.writeMessage(2, getEndTime());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getStartTime());
    }
    if (endTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getEndTime());
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
    if (!(obj instanceof com.google.monitoring.v3.TimeInterval)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.TimeInterval other = (com.google.monitoring.v3.TimeInterval) obj;

    if (hasEndTime() != other.hasEndTime()) return false;
    if (hasEndTime()) {
      if (!getEndTime().equals(other.getEndTime())) return false;
    }
    if (hasStartTime() != other.hasStartTime()) return false;
    if (hasStartTime()) {
      if (!getStartTime().equals(other.getStartTime())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasEndTime()) {
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime().hashCode();
    }
    if (hasStartTime()) {
      hash = (37 * hash) + START_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getStartTime().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.TimeInterval parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.TimeInterval parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.TimeInterval parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.TimeInterval parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.TimeInterval parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.TimeInterval parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.TimeInterval parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.TimeInterval parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.TimeInterval parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.TimeInterval parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.TimeInterval parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.TimeInterval parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.monitoring.v3.TimeInterval prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A closed time interval. It extends from the start time to the end time, and includes both: `[startTime, endTime]`. Valid time intervals depend on the [`MetricKind`](/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors#MetricKind) of the metric value. In no case can the end time be earlier than the start time.
   * * For a `GAUGE` metric, the `startTime` value is technically optional; if
   *   no value is specified, the start time defaults to the value of the
   *   end time, and the interval represents a single point in time. If both
   *   start and end times are specified, they must be identical. Such an
   *   interval is valid only for `GAUGE` metrics, which are point-in-time
   *   measurements.
   * * For `DELTA` and `CUMULATIVE` metrics, the start time must be earlier
   *   than the end time.
   * * In all cases, the start time of the next interval must be
   *   at least a microsecond after the end time of the previous interval.
   *   Because the interval is closed, if the start time of a new interval
   *   is the same as the end time of the previous interval, data written
   *   at the new start time could overwrite data written at the previous
   *   end time.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.TimeInterval}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.TimeInterval)
      com.google.monitoring.v3.TimeIntervalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.CommonProto
          .internal_static_google_monitoring_v3_TimeInterval_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.CommonProto
          .internal_static_google_monitoring_v3_TimeInterval_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.TimeInterval.class,
              com.google.monitoring.v3.TimeInterval.Builder.class);
    }

    // Construct using com.google.monitoring.v3.TimeInterval.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (endTimeBuilder_ == null) {
        endTime_ = null;
      } else {
        endTime_ = null;
        endTimeBuilder_ = null;
      }
      if (startTimeBuilder_ == null) {
        startTime_ = null;
      } else {
        startTime_ = null;
        startTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.CommonProto
          .internal_static_google_monitoring_v3_TimeInterval_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.TimeInterval getDefaultInstanceForType() {
      return com.google.monitoring.v3.TimeInterval.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.TimeInterval build() {
      com.google.monitoring.v3.TimeInterval result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.TimeInterval buildPartial() {
      com.google.monitoring.v3.TimeInterval result =
          new com.google.monitoring.v3.TimeInterval(this);
      if (endTimeBuilder_ == null) {
        result.endTime_ = endTime_;
      } else {
        result.endTime_ = endTimeBuilder_.build();
      }
      if (startTimeBuilder_ == null) {
        result.startTime_ = startTime_;
      } else {
        result.startTime_ = startTimeBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.monitoring.v3.TimeInterval) {
        return mergeFrom((com.google.monitoring.v3.TimeInterval) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.TimeInterval other) {
      if (other == com.google.monitoring.v3.TimeInterval.getDefaultInstance()) return this;
      if (other.hasEndTime()) {
        mergeEndTime(other.getEndTime());
      }
      if (other.hasStartTime()) {
        mergeStartTime(other.getStartTime());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.monitoring.v3.TimeInterval parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.monitoring.v3.TimeInterval) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Timestamp endTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        endTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The end of the time interval.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    public boolean hasEndTime() {
      return endTimeBuilder_ != null || endTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The end of the time interval.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    public com.google.protobuf.Timestamp getEndTime() {
      if (endTimeBuilder_ == null) {
        return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
      } else {
        return endTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The end of the time interval.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    public Builder setEndTime(com.google.protobuf.Timestamp value) {
      if (endTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endTime_ = value;
        onChanged();
      } else {
        endTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The end of the time interval.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    public Builder setEndTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (endTimeBuilder_ == null) {
        endTime_ = builderForValue.build();
        onChanged();
      } else {
        endTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The end of the time interval.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    public Builder mergeEndTime(com.google.protobuf.Timestamp value) {
      if (endTimeBuilder_ == null) {
        if (endTime_ != null) {
          endTime_ =
              com.google.protobuf.Timestamp.newBuilder(endTime_).mergeFrom(value).buildPartial();
        } else {
          endTime_ = value;
        }
        onChanged();
      } else {
        endTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The end of the time interval.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    public Builder clearEndTime() {
      if (endTimeBuilder_ == null) {
        endTime_ = null;
        onChanged();
      } else {
        endTime_ = null;
        endTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The end of the time interval.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getEndTimeBuilder() {

      onChanged();
      return getEndTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The end of the time interval.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder() {
      if (endTimeBuilder_ != null) {
        return endTimeBuilder_.getMessageOrBuilder();
      } else {
        return endTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : endTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The end of the time interval.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp end_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getEndTimeFieldBuilder() {
      if (endTimeBuilder_ == null) {
        endTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getEndTime(), getParentForChildren(), isClean());
        endTime_ = null;
      }
      return endTimeBuilder_;
    }

    private com.google.protobuf.Timestamp startTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        startTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. The beginning of the time interval.  The default value
     * for the start time is the end time. The start time must not be
     * later than the end time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    public boolean hasStartTime() {
      return startTimeBuilder_ != null || startTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * Optional. The beginning of the time interval.  The default value
     * for the start time is the end time. The start time must not be
     * later than the end time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    public com.google.protobuf.Timestamp getStartTime() {
      if (startTimeBuilder_ == null) {
        return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      } else {
        return startTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The beginning of the time interval.  The default value
     * for the start time is the end time. The start time must not be
     * later than the end time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    public Builder setStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startTime_ = value;
        onChanged();
      } else {
        startTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The beginning of the time interval.  The default value
     * for the start time is the end time. The start time must not be
     * later than the end time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    public Builder setStartTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (startTimeBuilder_ == null) {
        startTime_ = builderForValue.build();
        onChanged();
      } else {
        startTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The beginning of the time interval.  The default value
     * for the start time is the end time. The start time must not be
     * later than the end time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    public Builder mergeStartTime(com.google.protobuf.Timestamp value) {
      if (startTimeBuilder_ == null) {
        if (startTime_ != null) {
          startTime_ =
              com.google.protobuf.Timestamp.newBuilder(startTime_).mergeFrom(value).buildPartial();
        } else {
          startTime_ = value;
        }
        onChanged();
      } else {
        startTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The beginning of the time interval.  The default value
     * for the start time is the end time. The start time must not be
     * later than the end time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    public Builder clearStartTime() {
      if (startTimeBuilder_ == null) {
        startTime_ = null;
        onChanged();
      } else {
        startTime_ = null;
        startTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The beginning of the time interval.  The default value
     * for the start time is the end time. The start time must not be
     * later than the end time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getStartTimeBuilder() {

      onChanged();
      return getStartTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. The beginning of the time interval.  The default value
     * for the start time is the end time. The start time must not be
     * later than the end time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder() {
      if (startTimeBuilder_ != null) {
        return startTimeBuilder_.getMessageOrBuilder();
      } else {
        return startTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The beginning of the time interval.  The default value
     * for the start time is the end time. The start time must not be
     * later than the end time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getStartTimeFieldBuilder() {
      if (startTimeBuilder_ == null) {
        startTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getStartTime(), getParentForChildren(), isClean());
        startTime_ = null;
      }
      return startTimeBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.TimeInterval)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.TimeInterval)
  private static final com.google.monitoring.v3.TimeInterval DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.TimeInterval();
  }

  public static com.google.monitoring.v3.TimeInterval getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TimeInterval> PARSER =
      new com.google.protobuf.AbstractParser<TimeInterval>() {
        @java.lang.Override
        public TimeInterval parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new TimeInterval(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<TimeInterval> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TimeInterval> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.TimeInterval getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
