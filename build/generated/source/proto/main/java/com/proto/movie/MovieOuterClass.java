// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: movie.proto

package com.proto.movie;

public final class MovieOuterClass {
  private MovieOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Movie_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Movie_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RecommendationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RecommendationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RecommendationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RecommendationResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013movie.proto\"\"\n\005Movie\022\n\n\002id\030\001 \001(\005\022\r\n\005ti" +
      "tle\030\002 \001(\t\"4\n\025RecommendationRequest\022\033\n\013mo" +
      "vie_query\030\001 \001(\0132\006.Movie\"1\n\026Recommendatio" +
      "nResponse\022\027\n\017recommendations\030\001 \003(\t2\\\n\025Re" +
      "commendationService\022C\n\016Recommendation\022\026." +
      "RecommendationRequest\032\027.RecommendationRe" +
      "sponse\"\000B\023\n\017com.proto.movieP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Movie_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Movie_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Movie_descriptor,
        new java.lang.String[] { "Id", "Title", });
    internal_static_RecommendationRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_RecommendationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RecommendationRequest_descriptor,
        new java.lang.String[] { "MovieQuery", });
    internal_static_RecommendationResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_RecommendationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RecommendationResponse_descriptor,
        new java.lang.String[] { "Recommendations", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
