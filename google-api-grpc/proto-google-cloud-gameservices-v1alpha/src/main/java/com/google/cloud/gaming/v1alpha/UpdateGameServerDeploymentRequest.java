// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1alpha/game_server_deployments.proto

package com.google.cloud.gaming.v1alpha;

/**
 *
 *
 * <pre>
 * Request message for GameServerDeploymentsService.UpdateGameServerDeployment.
 * Only allows updates for labels.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest}
 */
public final class UpdateGameServerDeploymentRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest)
    UpdateGameServerDeploymentRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateGameServerDeploymentRequest.newBuilder() to construct.
  private UpdateGameServerDeploymentRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateGameServerDeploymentRequest() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateGameServerDeploymentRequest(
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
              com.google.cloud.gaming.v1alpha.GameServerDeployment.Builder subBuilder = null;
              if (gameServerDeployment_ != null) {
                subBuilder = gameServerDeployment_.toBuilder();
              }
              gameServerDeployment_ =
                  input.readMessage(
                      com.google.cloud.gaming.v1alpha.GameServerDeployment.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(gameServerDeployment_);
                gameServerDeployment_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (updateMask_ != null) {
                subBuilder = updateMask_.toBuilder();
              }
              updateMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateMask_);
                updateMask_ = subBuilder.buildPartial();
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
        .internal_static_google_cloud_gaming_v1alpha_UpdateGameServerDeploymentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gaming.v1alpha.GameServerDeployments
        .internal_static_google_cloud_gaming_v1alpha_UpdateGameServerDeploymentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest.class,
            com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest.Builder.class);
  }

  public static final int GAME_SERVER_DEPLOYMENT_FIELD_NUMBER = 1;
  private com.google.cloud.gaming.v1alpha.GameServerDeployment gameServerDeployment_;
  /**
   *
   *
   * <pre>
   * Required. The game server deployment to be updated.
   * Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.GameServerDeployment game_server_deployment = 1;</code>
   */
  public boolean hasGameServerDeployment() {
    return gameServerDeployment_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The game server deployment to be updated.
   * Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.GameServerDeployment game_server_deployment = 1;</code>
   */
  public com.google.cloud.gaming.v1alpha.GameServerDeployment getGameServerDeployment() {
    return gameServerDeployment_ == null
        ? com.google.cloud.gaming.v1alpha.GameServerDeployment.getDefaultInstance()
        : gameServerDeployment_;
  }
  /**
   *
   *
   * <pre>
   * Required. The game server deployment to be updated.
   * Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.GameServerDeployment game_server_deployment = 1;</code>
   */
  public com.google.cloud.gaming.v1alpha.GameServerDeploymentOrBuilder
      getGameServerDeploymentOrBuilder() {
    return getGameServerDeployment();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in
   * this field. For the `FieldMask` definition, see
   * https:
   * //developers.google.com/protocol-buffers
   * // /docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in
   * this field. For the `FieldMask` definition, see
   * https:
   * //developers.google.com/protocol-buffers
   * // /docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in
   * this field. For the `FieldMask` definition, see
   * https:
   * //developers.google.com/protocol-buffers
   * // /docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (gameServerDeployment_ != null) {
      output.writeMessage(1, getGameServerDeployment());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gameServerDeployment_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, getGameServerDeployment());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest other =
        (com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest) obj;

    if (hasGameServerDeployment() != other.hasGameServerDeployment()) return false;
    if (hasGameServerDeployment()) {
      if (!getGameServerDeployment().equals(other.getGameServerDeployment())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasGameServerDeployment()) {
      hash = (37 * hash) + GAME_SERVER_DEPLOYMENT_FIELD_NUMBER;
      hash = (53 * hash) + getGameServerDeployment().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest parseFrom(
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
      com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest prototype) {
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
   * Request message for GameServerDeploymentsService.UpdateGameServerDeployment.
   * Only allows updates for labels.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest)
      com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gaming.v1alpha.GameServerDeployments
          .internal_static_google_cloud_gaming_v1alpha_UpdateGameServerDeploymentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gaming.v1alpha.GameServerDeployments
          .internal_static_google_cloud_gaming_v1alpha_UpdateGameServerDeploymentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest.class,
              com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest.newBuilder()
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
      if (gameServerDeploymentBuilder_ == null) {
        gameServerDeployment_ = null;
      } else {
        gameServerDeployment_ = null;
        gameServerDeploymentBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gaming.v1alpha.GameServerDeployments
          .internal_static_google_cloud_gaming_v1alpha_UpdateGameServerDeploymentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest
        getDefaultInstanceForType() {
      return com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest build() {
      com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest buildPartial() {
      com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest result =
          new com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest(this);
      if (gameServerDeploymentBuilder_ == null) {
        result.gameServerDeployment_ = gameServerDeployment_;
      } else {
        result.gameServerDeployment_ = gameServerDeploymentBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest) {
        return mergeFrom((com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest other) {
      if (other
          == com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest.getDefaultInstance())
        return this;
      if (other.hasGameServerDeployment()) {
        mergeGameServerDeployment(other.getGameServerDeployment());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.gaming.v1alpha.GameServerDeployment gameServerDeployment_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gaming.v1alpha.GameServerDeployment,
            com.google.cloud.gaming.v1alpha.GameServerDeployment.Builder,
            com.google.cloud.gaming.v1alpha.GameServerDeploymentOrBuilder>
        gameServerDeploymentBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The game server deployment to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.GameServerDeployment game_server_deployment = 1;</code>
     */
    public boolean hasGameServerDeployment() {
      return gameServerDeploymentBuilder_ != null || gameServerDeployment_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The game server deployment to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.GameServerDeployment game_server_deployment = 1;</code>
     */
    public com.google.cloud.gaming.v1alpha.GameServerDeployment getGameServerDeployment() {
      if (gameServerDeploymentBuilder_ == null) {
        return gameServerDeployment_ == null
            ? com.google.cloud.gaming.v1alpha.GameServerDeployment.getDefaultInstance()
            : gameServerDeployment_;
      } else {
        return gameServerDeploymentBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The game server deployment to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.GameServerDeployment game_server_deployment = 1;</code>
     */
    public Builder setGameServerDeployment(
        com.google.cloud.gaming.v1alpha.GameServerDeployment value) {
      if (gameServerDeploymentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gameServerDeployment_ = value;
        onChanged();
      } else {
        gameServerDeploymentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The game server deployment to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.GameServerDeployment game_server_deployment = 1;</code>
     */
    public Builder setGameServerDeployment(
        com.google.cloud.gaming.v1alpha.GameServerDeployment.Builder builderForValue) {
      if (gameServerDeploymentBuilder_ == null) {
        gameServerDeployment_ = builderForValue.build();
        onChanged();
      } else {
        gameServerDeploymentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The game server deployment to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.GameServerDeployment game_server_deployment = 1;</code>
     */
    public Builder mergeGameServerDeployment(
        com.google.cloud.gaming.v1alpha.GameServerDeployment value) {
      if (gameServerDeploymentBuilder_ == null) {
        if (gameServerDeployment_ != null) {
          gameServerDeployment_ =
              com.google.cloud.gaming.v1alpha.GameServerDeployment.newBuilder(gameServerDeployment_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          gameServerDeployment_ = value;
        }
        onChanged();
      } else {
        gameServerDeploymentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The game server deployment to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.GameServerDeployment game_server_deployment = 1;</code>
     */
    public Builder clearGameServerDeployment() {
      if (gameServerDeploymentBuilder_ == null) {
        gameServerDeployment_ = null;
        onChanged();
      } else {
        gameServerDeployment_ = null;
        gameServerDeploymentBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The game server deployment to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.GameServerDeployment game_server_deployment = 1;</code>
     */
    public com.google.cloud.gaming.v1alpha.GameServerDeployment.Builder
        getGameServerDeploymentBuilder() {

      onChanged();
      return getGameServerDeploymentFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The game server deployment to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.GameServerDeployment game_server_deployment = 1;</code>
     */
    public com.google.cloud.gaming.v1alpha.GameServerDeploymentOrBuilder
        getGameServerDeploymentOrBuilder() {
      if (gameServerDeploymentBuilder_ != null) {
        return gameServerDeploymentBuilder_.getMessageOrBuilder();
      } else {
        return gameServerDeployment_ == null
            ? com.google.cloud.gaming.v1alpha.GameServerDeployment.getDefaultInstance()
            : gameServerDeployment_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The game server deployment to be updated.
     * Only fields specified in update_mask are updated.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.GameServerDeployment game_server_deployment = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gaming.v1alpha.GameServerDeployment,
            com.google.cloud.gaming.v1alpha.GameServerDeployment.Builder,
            com.google.cloud.gaming.v1alpha.GameServerDeploymentOrBuilder>
        getGameServerDeploymentFieldBuilder() {
      if (gameServerDeploymentBuilder_ == null) {
        gameServerDeploymentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gaming.v1alpha.GameServerDeployment,
                com.google.cloud.gaming.v1alpha.GameServerDeployment.Builder,
                com.google.cloud.gaming.v1alpha.GameServerDeploymentOrBuilder>(
                getGameServerDeployment(), getParentForChildren(), isClean());
        gameServerDeployment_ = null;
      }
      return gameServerDeploymentBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. For the `FieldMask` definition, see
     * https:
     * //developers.google.com/protocol-buffers
     * // /docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. For the `FieldMask` definition, see
     * https:
     * //developers.google.com/protocol-buffers
     * // /docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. For the `FieldMask` definition, see
     * https:
     * //developers.google.com/protocol-buffers
     * // /docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. For the `FieldMask` definition, see
     * https:
     * //developers.google.com/protocol-buffers
     * // /docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. For the `FieldMask` definition, see
     * https:
     * //developers.google.com/protocol-buffers
     * // /docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. For the `FieldMask` definition, see
     * https:
     * //developers.google.com/protocol-buffers
     * // /docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. For the `FieldMask` definition, see
     * https:
     * //developers.google.com/protocol-buffers
     * // /docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. For the `FieldMask` definition, see
     * https:
     * //developers.google.com/protocol-buffers
     * // /docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Mask of fields to update. At least one path must be supplied in
     * this field. For the `FieldMask` definition, see
     * https:
     * //developers.google.com/protocol-buffers
     * // /docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest)
  private static final com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest();
  }

  public static com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateGameServerDeploymentRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateGameServerDeploymentRequest>() {
        @java.lang.Override
        public UpdateGameServerDeploymentRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateGameServerDeploymentRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateGameServerDeploymentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateGameServerDeploymentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gaming.v1alpha.UpdateGameServerDeploymentRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
