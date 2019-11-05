// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1alpha/allocation_policies.proto

package com.google.cloud.gaming.v1alpha;

public interface ListAllocationPoliciesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1alpha.ListAllocationPoliciesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of allocation policies.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1alpha.AllocationPolicy allocation_policies = 1;</code>
   */
  java.util.List<com.google.cloud.gaming.v1alpha.AllocationPolicy> getAllocationPoliciesList();
  /**
   *
   *
   * <pre>
   * The list of allocation policies.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1alpha.AllocationPolicy allocation_policies = 1;</code>
   */
  com.google.cloud.gaming.v1alpha.AllocationPolicy getAllocationPolicies(int index);
  /**
   *
   *
   * <pre>
   * The list of allocation policies.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1alpha.AllocationPolicy allocation_policies = 1;</code>
   */
  int getAllocationPoliciesCount();
  /**
   *
   *
   * <pre>
   * The list of allocation policies.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1alpha.AllocationPolicy allocation_policies = 1;</code>
   */
  java.util.List<? extends com.google.cloud.gaming.v1alpha.AllocationPolicyOrBuilder>
      getAllocationPoliciesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of allocation policies.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1alpha.AllocationPolicy allocation_policies = 1;</code>
   */
  com.google.cloud.gaming.v1alpha.AllocationPolicyOrBuilder getAllocationPoliciesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
