// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: movie.proto

package com.proto.movie;

/**
 * <pre>
 *A recommendation response will return a list of recommended
 *movies that are similar to the recommendation request
 * </pre>
 *
 * Protobuf type {@code RecommendationResponse}
 */
public final class RecommendationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RecommendationResponse)
    RecommendationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RecommendationResponse.newBuilder() to construct.
  private RecommendationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecommendationResponse() {
    recommendations_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RecommendationResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RecommendationResponse(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              recommendations_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            recommendations_.add(s);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        recommendations_ = recommendations_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.proto.movie.MovieOuterClass.internal_static_RecommendationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.movie.MovieOuterClass.internal_static_RecommendationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.movie.RecommendationResponse.class, com.proto.movie.RecommendationResponse.Builder.class);
  }

  public static final int RECOMMENDATIONS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList recommendations_;
  /**
   * <code>repeated string recommendations = 1;</code>
   * @return A list containing the recommendations.
   */
  public com.google.protobuf.ProtocolStringList
      getRecommendationsList() {
    return recommendations_;
  }
  /**
   * <code>repeated string recommendations = 1;</code>
   * @return The count of recommendations.
   */
  public int getRecommendationsCount() {
    return recommendations_.size();
  }
  /**
   * <code>repeated string recommendations = 1;</code>
   * @param index The index of the element to return.
   * @return The recommendations at the given index.
   */
  public java.lang.String getRecommendations(int index) {
    return recommendations_.get(index);
  }
  /**
   * <code>repeated string recommendations = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the recommendations at the given index.
   */
  public com.google.protobuf.ByteString
      getRecommendationsBytes(int index) {
    return recommendations_.getByteString(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < recommendations_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, recommendations_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < recommendations_.size(); i++) {
        dataSize += computeStringSizeNoTag(recommendations_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getRecommendationsList().size();
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
    if (!(obj instanceof com.proto.movie.RecommendationResponse)) {
      return super.equals(obj);
    }
    com.proto.movie.RecommendationResponse other = (com.proto.movie.RecommendationResponse) obj;

    if (!getRecommendationsList()
        .equals(other.getRecommendationsList())) return false;
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
    if (getRecommendationsCount() > 0) {
      hash = (37 * hash) + RECOMMENDATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getRecommendationsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.movie.RecommendationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.movie.RecommendationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.movie.RecommendationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.movie.RecommendationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.movie.RecommendationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.movie.RecommendationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.movie.RecommendationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.movie.RecommendationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.movie.RecommendationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.movie.RecommendationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.movie.RecommendationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.movie.RecommendationResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.proto.movie.RecommendationResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * <pre>
   *A recommendation response will return a list of recommended
   *movies that are similar to the recommendation request
   * </pre>
   *
   * Protobuf type {@code RecommendationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RecommendationResponse)
      com.proto.movie.RecommendationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.movie.MovieOuterClass.internal_static_RecommendationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.movie.MovieOuterClass.internal_static_RecommendationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.movie.RecommendationResponse.class, com.proto.movie.RecommendationResponse.Builder.class);
    }

    // Construct using com.proto.movie.RecommendationResponse.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      recommendations_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.movie.MovieOuterClass.internal_static_RecommendationResponse_descriptor;
    }

    @java.lang.Override
    public com.proto.movie.RecommendationResponse getDefaultInstanceForType() {
      return com.proto.movie.RecommendationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.movie.RecommendationResponse build() {
      com.proto.movie.RecommendationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.movie.RecommendationResponse buildPartial() {
      com.proto.movie.RecommendationResponse result = new com.proto.movie.RecommendationResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        recommendations_ = recommendations_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.recommendations_ = recommendations_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.proto.movie.RecommendationResponse) {
        return mergeFrom((com.proto.movie.RecommendationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.movie.RecommendationResponse other) {
      if (other == com.proto.movie.RecommendationResponse.getDefaultInstance()) return this;
      if (!other.recommendations_.isEmpty()) {
        if (recommendations_.isEmpty()) {
          recommendations_ = other.recommendations_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureRecommendationsIsMutable();
          recommendations_.addAll(other.recommendations_);
        }
        onChanged();
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
      com.proto.movie.RecommendationResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.movie.RecommendationResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList recommendations_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureRecommendationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        recommendations_ = new com.google.protobuf.LazyStringArrayList(recommendations_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string recommendations = 1;</code>
     * @return A list containing the recommendations.
     */
    public com.google.protobuf.ProtocolStringList
        getRecommendationsList() {
      return recommendations_.getUnmodifiableView();
    }
    /**
     * <code>repeated string recommendations = 1;</code>
     * @return The count of recommendations.
     */
    public int getRecommendationsCount() {
      return recommendations_.size();
    }
    /**
     * <code>repeated string recommendations = 1;</code>
     * @param index The index of the element to return.
     * @return The recommendations at the given index.
     */
    public java.lang.String getRecommendations(int index) {
      return recommendations_.get(index);
    }
    /**
     * <code>repeated string recommendations = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the recommendations at the given index.
     */
    public com.google.protobuf.ByteString
        getRecommendationsBytes(int index) {
      return recommendations_.getByteString(index);
    }
    /**
     * <code>repeated string recommendations = 1;</code>
     * @param index The index to set the value at.
     * @param value The recommendations to set.
     * @return This builder for chaining.
     */
    public Builder setRecommendations(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureRecommendationsIsMutable();
      recommendations_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string recommendations = 1;</code>
     * @param value The recommendations to add.
     * @return This builder for chaining.
     */
    public Builder addRecommendations(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureRecommendationsIsMutable();
      recommendations_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string recommendations = 1;</code>
     * @param values The recommendations to add.
     * @return This builder for chaining.
     */
    public Builder addAllRecommendations(
        java.lang.Iterable<java.lang.String> values) {
      ensureRecommendationsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, recommendations_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string recommendations = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRecommendations() {
      recommendations_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string recommendations = 1;</code>
     * @param value The bytes of the recommendations to add.
     * @return This builder for chaining.
     */
    public Builder addRecommendationsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureRecommendationsIsMutable();
      recommendations_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:RecommendationResponse)
  }

  // @@protoc_insertion_point(class_scope:RecommendationResponse)
  private static final com.proto.movie.RecommendationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.movie.RecommendationResponse();
  }

  public static com.proto.movie.RecommendationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecommendationResponse>
      PARSER = new com.google.protobuf.AbstractParser<RecommendationResponse>() {
    @java.lang.Override
    public RecommendationResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RecommendationResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RecommendationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecommendationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.movie.RecommendationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

