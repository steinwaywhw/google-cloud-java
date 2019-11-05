// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1alpha/game_server_deployments.proto

package com.google.cloud.gaming.v1alpha;

/**
 *
 *
 * <pre>
 * Request message for GameServerDeploymentsService.StartRollout.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gaming.v1alpha.StartRolloutRequest}
 */
public final class StartRolloutRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gaming.v1alpha.StartRolloutRequest)
    StartRolloutRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StartRolloutRequest.newBuilder() to construct.
  private StartRolloutRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StartRolloutRequest() {
    name_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private StartRolloutRequest(
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

              name_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.gaming.v1alpha.GameServerTemplate.Builder subBuilder = null;
              if (newGameServerTemplate_ != null) {
                subBuilder = newGameServerTemplate_.toBuilder();
              }
              newGameServerTemplate_ =
                  input.readMessage(
                      com.google.cloud.gaming.v1alpha.GameServerTemplate.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(newGameServerTemplate_);
                newGameServerTemplate_ = subBuilder.buildPartial();
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
    return com.google.cloud.gaming.v1alpha.GameServerDeployments
        .internal_static_google_cloud_gaming_v1alpha_StartRolloutRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gaming.v1alpha.GameServerDeployments
        .internal_static_google_cloud_gaming_v1alpha_StartRolloutRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gaming.v1alpha.StartRolloutRequest.class,
            com.google.cloud.gaming.v1alpha.StartRolloutRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. The name of the game server deployment, using the
   * form:
   * `projects/{project_id}/locations/{location}/gameServerDeployments/{deployment_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the game server deployment, using the
   * form:
   * `projects/{project_id}/locations/{location}/gameServerDeployments/{deployment_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEW_GAME_SERVER_TEMPLATE_FIELD_NUMBER = 2;
  private com.google.cloud.gaming.v1alpha.GameServerTemplate newGameServerTemplate_;
  /**
   *
   *
   * <pre>
   * Required. The game server template for the new rollout.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.GameServerTemplate new_game_server_template = 2;</code>
   */
  public boolean hasNewGameServerTemplate() {
    return newGameServerTemplate_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The game server template for the new rollout.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.GameServerTemplate new_game_server_template = 2;</code>
   */
  public com.google.cloud.gaming.v1alpha.GameServerTemplate getNewGameServerTemplate() {
    return newGameServerTemplate_ == null
        ? com.google.cloud.gaming.v1alpha.GameServerTemplate.getDefaultInstance()
        : newGameServerTemplate_;
  }
  /**
   *
   *
   * <pre>
   * Required. The game server template for the new rollout.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.GameServerTemplate new_game_server_template = 2;</code>
   */
  public com.google.cloud.gaming.v1alpha.GameServerTemplateOrBuilder
      getNewGameServerTemplateOrBuilder() {
    return getNewGameServerTemplate();
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (newGameServerTemplate_ != null) {
      output.writeMessage(2, getNewGameServerTemplate());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (newGameServerTemplate_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(2, getNewGameServerTemplate());
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
    if (!(obj instanceof com.google.cloud.gaming.v1alpha.StartRolloutRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.gaming.v1alpha.StartRolloutRequest other =
        (com.google.cloud.gaming.v1alpha.StartRolloutRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasNewGameServerTemplate() != other.hasNewGameServerTemplate()) return false;
    if (hasNewGameServerTemplate()) {
      if (!getNewGameServerTemplate().equals(other.getNewGameServerTemplate())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasNewGameServerTemplate()) {
      hash = (37 * hash) + NEW_GAME_SERVER_TEMPLATE_FIELD_NUMBER;
      hash = (53 * hash) + getNewGameServerTemplate().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gaming.v1alpha.StartRolloutRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1alpha.StartRolloutRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1alpha.StartRolloutRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1alpha.StartRolloutRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1alpha.StartRolloutRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1alpha.StartRolloutRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1alpha.StartRolloutRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1alpha.StartRolloutRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1alpha.StartRolloutRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1alpha.StartRolloutRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1alpha.StartRolloutRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1alpha.StartRolloutRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.gaming.v1alpha.StartRolloutRequest prototype) {
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
   * Request message for GameServerDeploymentsService.StartRollout.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gaming.v1alpha.StartRolloutRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gaming.v1alpha.StartRolloutRequest)
      com.google.cloud.gaming.v1alpha.StartRolloutRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gaming.v1alpha.GameServerDeployments
          .internal_static_google_cloud_gaming_v1alpha_StartRolloutRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gaming.v1alpha.GameServerDeployments
          .internal_static_google_cloud_gaming_v1alpha_StartRolloutRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gaming.v1alpha.StartRolloutRequest.class,
              com.google.cloud.gaming.v1alpha.StartRolloutRequest.Builder.class);
    }

    // Construct using com.google.cloud.gaming.v1alpha.StartRolloutRequest.newBuilder()
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
      name_ = "";

      if (newGameServerTemplateBuilder_ == null) {
        newGameServerTemplate_ = null;
      } else {
        newGameServerTemplate_ = null;
        newGameServerTemplateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gaming.v1alpha.GameServerDeployments
          .internal_static_google_cloud_gaming_v1alpha_StartRolloutRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1alpha.StartRolloutRequest getDefaultInstanceForType() {
      return com.google.cloud.gaming.v1alpha.StartRolloutRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1alpha.StartRolloutRequest build() {
      com.google.cloud.gaming.v1alpha.StartRolloutRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1alpha.StartRolloutRequest buildPartial() {
      com.google.cloud.gaming.v1alpha.StartRolloutRequest result =
          new com.google.cloud.gaming.v1alpha.StartRolloutRequest(this);
      result.name_ = name_;
      if (newGameServerTemplateBuilder_ == null) {
        result.newGameServerTemplate_ = newGameServerTemplate_;
      } else {
        result.newGameServerTemplate_ = newGameServerTemplateBuilder_.build();
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
      if (other instanceof com.google.cloud.gaming.v1alpha.StartRolloutRequest) {
        return mergeFrom((com.google.cloud.gaming.v1alpha.StartRolloutRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gaming.v1alpha.StartRolloutRequest other) {
      if (other == com.google.cloud.gaming.v1alpha.StartRolloutRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasNewGameServerTemplate()) {
        mergeNewGameServerTemplate(other.getNewGameServerTemplate());
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
      com.google.cloud.gaming.v1alpha.StartRolloutRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.gaming.v1alpha.StartRolloutRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the game server deployment, using the
     * form:
     * `projects/{project_id}/locations/{location}/gameServerDeployments/{deployment_id}`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the game server deployment, using the
     * form:
     * `projects/{project_id}/locations/{location}/gameServerDeployments/{deployment_id}`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the game server deployment, using the
     * form:
     * `projects/{project_id}/locations/{location}/gameServerDeployments/{deployment_id}`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the game server deployment, using the
     * form:
     * `projects/{project_id}/locations/{location}/gameServerDeployments/{deployment_id}`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the game server deployment, using the
     * form:
     * `projects/{project_id}/locations/{location}/gameServerDeployments/{deployment_id}`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.gaming.v1alpha.GameServerTemplate newGameServerTemplate_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gaming.v1alpha.GameServerTemplate,
            com.google.cloud.gaming.v1alpha.GameServerTemplate.Builder,
            com.google.cloud.gaming.v1alpha.GameServerTemplateOrBuilder>
        newGameServerTemplateBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The game server template for the new rollout.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.GameServerTemplate new_game_server_template = 2;</code>
     */
    public boolean hasNewGameServerTemplate() {
      return newGameServerTemplateBuilder_ != null || newGameServerTemplate_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The game server template for the new rollout.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.GameServerTemplate new_game_server_template = 2;</code>
     */
    public com.google.cloud.gaming.v1alpha.GameServerTemplate getNewGameServerTemplate() {
      if (newGameServerTemplateBuilder_ == null) {
        return newGameServerTemplate_ == null
            ? com.google.cloud.gaming.v1alpha.GameServerTemplate.getDefaultInstance()
            : newGameServerTemplate_;
      } else {
        return newGameServerTemplateBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The game server template for the new rollout.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.GameServerTemplate new_game_server_template = 2;</code>
     */
    public Builder setNewGameServerTemplate(
        com.google.cloud.gaming.v1alpha.GameServerTemplate value) {
      if (newGameServerTemplateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        newGameServerTemplate_ = value;
        onChanged();
      } else {
        newGameServerTemplateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The game server template for the new rollout.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.GameServerTemplate new_game_server_template = 2;</code>
     */
    public Builder setNewGameServerTemplate(
        com.google.cloud.gaming.v1alpha.GameServerTemplate.Builder builderForValue) {
      if (newGameServerTemplateBuilder_ == null) {
        newGameServerTemplate_ = builderForValue.build();
        onChanged();
      } else {
        newGameServerTemplateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The game server template for the new rollout.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.GameServerTemplate new_game_server_template = 2;</code>
     */
    public Builder mergeNewGameServerTemplate(
        com.google.cloud.gaming.v1alpha.GameServerTemplate value) {
      if (newGameServerTemplateBuilder_ == null) {
        if (newGameServerTemplate_ != null) {
          newGameServerTemplate_ =
              com.google.cloud.gaming.v1alpha.GameServerTemplate.newBuilder(newGameServerTemplate_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          newGameServerTemplate_ = value;
        }
        onChanged();
      } else {
        newGameServerTemplateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The game server template for the new rollout.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.GameServerTemplate new_game_server_template = 2;</code>
     */
    public Builder clearNewGameServerTemplate() {
      if (newGameServerTemplateBuilder_ == null) {
        newGameServerTemplate_ = null;
        onChanged();
      } else {
        newGameServerTemplate_ = null;
        newGameServerTemplateBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The game server template for the new rollout.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.GameServerTemplate new_game_server_template = 2;</code>
     */
    public com.google.cloud.gaming.v1alpha.GameServerTemplate.Builder
        getNewGameServerTemplateBuilder() {

      onChanged();
      return getNewGameServerTemplateFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The game server template for the new rollout.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.GameServerTemplate new_game_server_template = 2;</code>
     */
    public com.google.cloud.gaming.v1alpha.GameServerTemplateOrBuilder
        getNewGameServerTemplateOrBuilder() {
      if (newGameServerTemplateBuilder_ != null) {
        return newGameServerTemplateBuilder_.getMessageOrBuilder();
      } else {
        return newGameServerTemplate_ == null
            ? com.google.cloud.gaming.v1alpha.GameServerTemplate.getDefaultInstance()
            : newGameServerTemplate_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The game server template for the new rollout.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.GameServerTemplate new_game_server_template = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gaming.v1alpha.GameServerTemplate,
            com.google.cloud.gaming.v1alpha.GameServerTemplate.Builder,
            com.google.cloud.gaming.v1alpha.GameServerTemplateOrBuilder>
        getNewGameServerTemplateFieldBuilder() {
      if (newGameServerTemplateBuilder_ == null) {
        newGameServerTemplateBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gaming.v1alpha.GameServerTemplate,
                com.google.cloud.gaming.v1alpha.GameServerTemplate.Builder,
                com.google.cloud.gaming.v1alpha.GameServerTemplateOrBuilder>(
                getNewGameServerTemplate(), getParentForChildren(), isClean());
        newGameServerTemplate_ = null;
      }
      return newGameServerTemplateBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gaming.v1alpha.StartRolloutRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gaming.v1alpha.StartRolloutRequest)
  private static final com.google.cloud.gaming.v1alpha.StartRolloutRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gaming.v1alpha.StartRolloutRequest();
  }

  public static com.google.cloud.gaming.v1alpha.StartRolloutRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StartRolloutRequest> PARSER =
      new com.google.protobuf.AbstractParser<StartRolloutRequest>() {
        @java.lang.Override
        public StartRolloutRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new StartRolloutRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<StartRolloutRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StartRolloutRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gaming.v1alpha.StartRolloutRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
