// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging_config.proto

package com.google.logging.v2;

public interface ListSinksRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.ListSinksRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource whose sinks are to be listed:
   *     "projects/[PROJECT_ID]"
   *     "organizations/[ORGANIZATION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]"
   *     "folders/[FOLDER_ID]"
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent resource whose sinks are to be listed:
   *     "projects/[PROJECT_ID]"
   *     "organizations/[ORGANIZATION_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]"
   *     "folders/[FOLDER_ID]"
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. If present, then retrieve the next batch of results from the
   * preceding call to this method. `pageToken` must be the value of
   * `nextPageToken` from the previous response. The values of other method
   * parameters should be identical to those in the previous call.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. If present, then retrieve the next batch of results from the
   * preceding call to this method. `pageToken` must be the value of
   * `nextPageToken` from the previous response. The values of other method
   * parameters should be identical to those in the previous call.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. The maximum number of results to return from this request.
   * Non-positive values are ignored. The presence of `nextPageToken` in the
   * response indicates that more results might be available.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   */
  int getPageSize();
}
