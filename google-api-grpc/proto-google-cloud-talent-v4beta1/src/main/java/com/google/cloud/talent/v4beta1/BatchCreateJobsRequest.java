// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/job_service.proto

package com.google.cloud.talent.v4beta1;

/**
 *
 *
 * <pre>
 * Request to create a batch of jobs.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4beta1.BatchCreateJobsRequest}
 */
public final class BatchCreateJobsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4beta1.BatchCreateJobsRequest)
    BatchCreateJobsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchCreateJobsRequest.newBuilder() to construct.
  private BatchCreateJobsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchCreateJobsRequest() {
    parent_ = "";
    jobs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BatchCreateJobsRequest(
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
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                jobs_ = new java.util.ArrayList<com.google.cloud.talent.v4beta1.Job>();
                mutable_bitField0_ |= 0x00000002;
              }
              jobs_.add(
                  input.readMessage(
                      com.google.cloud.talent.v4beta1.Job.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        jobs_ = java.util.Collections.unmodifiableList(jobs_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.talent.v4beta1.JobServiceProto
        .internal_static_google_cloud_talent_v4beta1_BatchCreateJobsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4beta1.JobServiceProto
        .internal_static_google_cloud_talent_v4beta1_BatchCreateJobsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4beta1.BatchCreateJobsRequest.class,
            com.google.cloud.talent.v4beta1.BatchCreateJobsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The resource name of the tenant under which the job is created.
   * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
   * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
   * is created. For example, "projects/foo".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the tenant under which the job is created.
   * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
   * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
   * is created. For example, "projects/foo".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JOBS_FIELD_NUMBER = 2;
  private java.util.List<com.google.cloud.talent.v4beta1.Job> jobs_;
  /**
   *
   *
   * <pre>
   * Required. The jobs to be created.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public java.util.List<com.google.cloud.talent.v4beta1.Job> getJobsList() {
    return jobs_;
  }
  /**
   *
   *
   * <pre>
   * Required. The jobs to be created.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public java.util.List<? extends com.google.cloud.talent.v4beta1.JobOrBuilder>
      getJobsOrBuilderList() {
    return jobs_;
  }
  /**
   *
   *
   * <pre>
   * Required. The jobs to be created.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public int getJobsCount() {
    return jobs_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. The jobs to be created.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public com.google.cloud.talent.v4beta1.Job getJobs(int index) {
    return jobs_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. The jobs to be created.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  public com.google.cloud.talent.v4beta1.JobOrBuilder getJobsOrBuilder(int index) {
    return jobs_.get(index);
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    for (int i = 0; i < jobs_.size(); i++) {
      output.writeMessage(2, jobs_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    for (int i = 0; i < jobs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, jobs_.get(i));
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
    if (!(obj instanceof com.google.cloud.talent.v4beta1.BatchCreateJobsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4beta1.BatchCreateJobsRequest other =
        (com.google.cloud.talent.v4beta1.BatchCreateJobsRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getJobsList().equals(other.getJobsList())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (getJobsCount() > 0) {
      hash = (37 * hash) + JOBS_FIELD_NUMBER;
      hash = (53 * hash) + getJobsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4beta1.BatchCreateJobsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.BatchCreateJobsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.BatchCreateJobsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.BatchCreateJobsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.BatchCreateJobsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.BatchCreateJobsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.BatchCreateJobsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.BatchCreateJobsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.BatchCreateJobsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.BatchCreateJobsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.BatchCreateJobsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.BatchCreateJobsRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.talent.v4beta1.BatchCreateJobsRequest prototype) {
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
   * Request to create a batch of jobs.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4beta1.BatchCreateJobsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4beta1.BatchCreateJobsRequest)
      com.google.cloud.talent.v4beta1.BatchCreateJobsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.talent.v4beta1.JobServiceProto
          .internal_static_google_cloud_talent_v4beta1_BatchCreateJobsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4beta1.JobServiceProto
          .internal_static_google_cloud_talent_v4beta1_BatchCreateJobsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4beta1.BatchCreateJobsRequest.class,
              com.google.cloud.talent.v4beta1.BatchCreateJobsRequest.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4beta1.BatchCreateJobsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getJobsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (jobsBuilder_ == null) {
        jobs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        jobsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.talent.v4beta1.JobServiceProto
          .internal_static_google_cloud_talent_v4beta1_BatchCreateJobsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.BatchCreateJobsRequest getDefaultInstanceForType() {
      return com.google.cloud.talent.v4beta1.BatchCreateJobsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.BatchCreateJobsRequest build() {
      com.google.cloud.talent.v4beta1.BatchCreateJobsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.BatchCreateJobsRequest buildPartial() {
      com.google.cloud.talent.v4beta1.BatchCreateJobsRequest result =
          new com.google.cloud.talent.v4beta1.BatchCreateJobsRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.parent_ = parent_;
      if (jobsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          jobs_ = java.util.Collections.unmodifiableList(jobs_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.jobs_ = jobs_;
      } else {
        result.jobs_ = jobsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.cloud.talent.v4beta1.BatchCreateJobsRequest) {
        return mergeFrom((com.google.cloud.talent.v4beta1.BatchCreateJobsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4beta1.BatchCreateJobsRequest other) {
      if (other == com.google.cloud.talent.v4beta1.BatchCreateJobsRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (jobsBuilder_ == null) {
        if (!other.jobs_.isEmpty()) {
          if (jobs_.isEmpty()) {
            jobs_ = other.jobs_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureJobsIsMutable();
            jobs_.addAll(other.jobs_);
          }
          onChanged();
        }
      } else {
        if (!other.jobs_.isEmpty()) {
          if (jobsBuilder_.isEmpty()) {
            jobsBuilder_.dispose();
            jobsBuilder_ = null;
            jobs_ = other.jobs_;
            bitField0_ = (bitField0_ & ~0x00000002);
            jobsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getJobsFieldBuilder()
                    : null;
          } else {
            jobsBuilder_.addAllMessages(other.jobs_);
          }
        }
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
      com.google.cloud.talent.v4beta1.BatchCreateJobsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.talent.v4beta1.BatchCreateJobsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the tenant under which the job is created.
     * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
     * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
     * is created. For example, "projects/foo".
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the tenant under which the job is created.
     * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
     * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
     * is created. For example, "projects/foo".
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the tenant under which the job is created.
     * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
     * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
     * is created. For example, "projects/foo".
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the tenant under which the job is created.
     * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
     * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
     * is created. For example, "projects/foo".
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the tenant under which the job is created.
     * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
     * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
     * is created. For example, "projects/foo".
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.talent.v4beta1.Job> jobs_ =
        java.util.Collections.emptyList();

    private void ensureJobsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        jobs_ = new java.util.ArrayList<com.google.cloud.talent.v4beta1.Job>(jobs_);
        bitField0_ |= 0x00000002;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.talent.v4beta1.Job,
            com.google.cloud.talent.v4beta1.Job.Builder,
            com.google.cloud.talent.v4beta1.JobOrBuilder>
        jobsBuilder_;

    /**
     *
     *
     * <pre>
     * Required. The jobs to be created.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<com.google.cloud.talent.v4beta1.Job> getJobsList() {
      if (jobsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(jobs_);
      } else {
        return jobsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The jobs to be created.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public int getJobsCount() {
      if (jobsBuilder_ == null) {
        return jobs_.size();
      } else {
        return jobsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The jobs to be created.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.talent.v4beta1.Job getJobs(int index) {
      if (jobsBuilder_ == null) {
        return jobs_.get(index);
      } else {
        return jobsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The jobs to be created.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setJobs(int index, com.google.cloud.talent.v4beta1.Job value) {
      if (jobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobsIsMutable();
        jobs_.set(index, value);
        onChanged();
      } else {
        jobsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The jobs to be created.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setJobs(int index, com.google.cloud.talent.v4beta1.Job.Builder builderForValue) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        jobs_.set(index, builderForValue.build());
        onChanged();
      } else {
        jobsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The jobs to be created.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addJobs(com.google.cloud.talent.v4beta1.Job value) {
      if (jobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobsIsMutable();
        jobs_.add(value);
        onChanged();
      } else {
        jobsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The jobs to be created.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addJobs(int index, com.google.cloud.talent.v4beta1.Job value) {
      if (jobsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJobsIsMutable();
        jobs_.add(index, value);
        onChanged();
      } else {
        jobsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The jobs to be created.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addJobs(com.google.cloud.talent.v4beta1.Job.Builder builderForValue) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        jobs_.add(builderForValue.build());
        onChanged();
      } else {
        jobsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The jobs to be created.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addJobs(int index, com.google.cloud.talent.v4beta1.Job.Builder builderForValue) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        jobs_.add(index, builderForValue.build());
        onChanged();
      } else {
        jobsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The jobs to be created.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addAllJobs(
        java.lang.Iterable<? extends com.google.cloud.talent.v4beta1.Job> values) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, jobs_);
        onChanged();
      } else {
        jobsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The jobs to be created.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearJobs() {
      if (jobsBuilder_ == null) {
        jobs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        jobsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The jobs to be created.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder removeJobs(int index) {
      if (jobsBuilder_ == null) {
        ensureJobsIsMutable();
        jobs_.remove(index);
        onChanged();
      } else {
        jobsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The jobs to be created.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.talent.v4beta1.Job.Builder getJobsBuilder(int index) {
      return getJobsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Required. The jobs to be created.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.talent.v4beta1.JobOrBuilder getJobsOrBuilder(int index) {
      if (jobsBuilder_ == null) {
        return jobs_.get(index);
      } else {
        return jobsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The jobs to be created.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<? extends com.google.cloud.talent.v4beta1.JobOrBuilder>
        getJobsOrBuilderList() {
      if (jobsBuilder_ != null) {
        return jobsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(jobs_);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The jobs to be created.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.talent.v4beta1.Job.Builder addJobsBuilder() {
      return getJobsFieldBuilder()
          .addBuilder(com.google.cloud.talent.v4beta1.Job.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Required. The jobs to be created.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.talent.v4beta1.Job.Builder addJobsBuilder(int index) {
      return getJobsFieldBuilder()
          .addBuilder(index, com.google.cloud.talent.v4beta1.Job.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Required. The jobs to be created.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.talent.v4beta1.Job jobs = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<com.google.cloud.talent.v4beta1.Job.Builder> getJobsBuilderList() {
      return getJobsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.talent.v4beta1.Job,
            com.google.cloud.talent.v4beta1.Job.Builder,
            com.google.cloud.talent.v4beta1.JobOrBuilder>
        getJobsFieldBuilder() {
      if (jobsBuilder_ == null) {
        jobsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.talent.v4beta1.Job,
                com.google.cloud.talent.v4beta1.Job.Builder,
                com.google.cloud.talent.v4beta1.JobOrBuilder>(
                jobs_, ((bitField0_ & 0x00000002) != 0), getParentForChildren(), isClean());
        jobs_ = null;
      }
      return jobsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4beta1.BatchCreateJobsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4beta1.BatchCreateJobsRequest)
  private static final com.google.cloud.talent.v4beta1.BatchCreateJobsRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4beta1.BatchCreateJobsRequest();
  }

  public static com.google.cloud.talent.v4beta1.BatchCreateJobsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchCreateJobsRequest> PARSER =
      new com.google.protobuf.AbstractParser<BatchCreateJobsRequest>() {
        @java.lang.Override
        public BatchCreateJobsRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BatchCreateJobsRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BatchCreateJobsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchCreateJobsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4beta1.BatchCreateJobsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
