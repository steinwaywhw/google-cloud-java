// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/webhook.proto

package com.google.cloud.dialogflow.v2beta1;

public interface WebhookResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.WebhookResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The text to be shown on the screen. This value is passed directly
   * to `QueryResult.fulfillment_text`.
   * </pre>
   *
   * <code>string fulfillment_text = 1;</code>
   */
  java.lang.String getFulfillmentText();
  /**
   *
   *
   * <pre>
   * Optional. The text to be shown on the screen. This value is passed directly
   * to `QueryResult.fulfillment_text`.
   * </pre>
   *
   * <code>string fulfillment_text = 1;</code>
   */
  com.google.protobuf.ByteString getFulfillmentTextBytes();

  /**
   *
   *
   * <pre>
   * Optional. The collection of rich messages to present to the user. This
   * value is passed directly to `QueryResult.fulfillment_messages`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message fulfillment_messages = 2;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.Intent.Message> getFulfillmentMessagesList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of rich messages to present to the user. This
   * value is passed directly to `QueryResult.fulfillment_messages`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message fulfillment_messages = 2;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Intent.Message getFulfillmentMessages(int index);
  /**
   *
   *
   * <pre>
   * Optional. The collection of rich messages to present to the user. This
   * value is passed directly to `QueryResult.fulfillment_messages`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message fulfillment_messages = 2;</code>
   */
  int getFulfillmentMessagesCount();
  /**
   *
   *
   * <pre>
   * Optional. The collection of rich messages to present to the user. This
   * value is passed directly to `QueryResult.fulfillment_messages`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message fulfillment_messages = 2;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.Intent.MessageOrBuilder>
      getFulfillmentMessagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of rich messages to present to the user. This
   * value is passed directly to `QueryResult.fulfillment_messages`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Intent.Message fulfillment_messages = 2;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Intent.MessageOrBuilder getFulfillmentMessagesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. This value is passed directly to `QueryResult.webhook_source`.
   * </pre>
   *
   * <code>string source = 3;</code>
   */
  java.lang.String getSource();
  /**
   *
   *
   * <pre>
   * Optional. This value is passed directly to `QueryResult.webhook_source`.
   * </pre>
   *
   * <code>string source = 3;</code>
   */
  com.google.protobuf.ByteString getSourceBytes();

  /**
   *
   *
   * <pre>
   * Optional. This value is passed directly to `QueryResult.webhook_payload`.
   * See the related `fulfillment_messages[i].payload field`, which may be used
   * as an alternative to this field.
   * This field can be used for Actions on Google responses.
   * It should have a structure similar to the JSON message shown here. For more
   * information, see
   * [Actions on Google Webhook
   * Format](https://developers.google.com/actions/dialogflow/webhook)
   * &lt;pre&gt;{
   *   "google": {
   *     "expectUserResponse": true,
   *     "richResponse": {
   *       "items": [
   *         {
   *           "simpleResponse": {
   *             "textToSpeech": "this is a simple response"
   *           }
   *         }
   *       ]
   *     }
   *   }
   * }&lt;/pre&gt;
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 4;</code>
   */
  boolean hasPayload();
  /**
   *
   *
   * <pre>
   * Optional. This value is passed directly to `QueryResult.webhook_payload`.
   * See the related `fulfillment_messages[i].payload field`, which may be used
   * as an alternative to this field.
   * This field can be used for Actions on Google responses.
   * It should have a structure similar to the JSON message shown here. For more
   * information, see
   * [Actions on Google Webhook
   * Format](https://developers.google.com/actions/dialogflow/webhook)
   * &lt;pre&gt;{
   *   "google": {
   *     "expectUserResponse": true,
   *     "richResponse": {
   *       "items": [
   *         {
   *           "simpleResponse": {
   *             "textToSpeech": "this is a simple response"
   *           }
   *         }
   *       ]
   *     }
   *   }
   * }&lt;/pre&gt;
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 4;</code>
   */
  com.google.protobuf.Struct getPayload();
  /**
   *
   *
   * <pre>
   * Optional. This value is passed directly to `QueryResult.webhook_payload`.
   * See the related `fulfillment_messages[i].payload field`, which may be used
   * as an alternative to this field.
   * This field can be used for Actions on Google responses.
   * It should have a structure similar to the JSON message shown here. For more
   * information, see
   * [Actions on Google Webhook
   * Format](https://developers.google.com/actions/dialogflow/webhook)
   * &lt;pre&gt;{
   *   "google": {
   *     "expectUserResponse": true,
   *     "richResponse": {
   *       "items": [
   *         {
   *           "simpleResponse": {
   *             "textToSpeech": "this is a simple response"
   *           }
   *         }
   *       ]
   *     }
   *   }
   * }&lt;/pre&gt;
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 4;</code>
   */
  com.google.protobuf.StructOrBuilder getPayloadOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The collection of output contexts. This value is passed directly
   * to `QueryResult.output_contexts`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context output_contexts = 5;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.Context> getOutputContextsList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of output contexts. This value is passed directly
   * to `QueryResult.output_contexts`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context output_contexts = 5;</code>
   */
  com.google.cloud.dialogflow.v2beta1.Context getOutputContexts(int index);
  /**
   *
   *
   * <pre>
   * Optional. The collection of output contexts. This value is passed directly
   * to `QueryResult.output_contexts`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context output_contexts = 5;</code>
   */
  int getOutputContextsCount();
  /**
   *
   *
   * <pre>
   * Optional. The collection of output contexts. This value is passed directly
   * to `QueryResult.output_contexts`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context output_contexts = 5;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.ContextOrBuilder>
      getOutputContextsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of output contexts. This value is passed directly
   * to `QueryResult.output_contexts`.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.Context output_contexts = 5;</code>
   */
  com.google.cloud.dialogflow.v2beta1.ContextOrBuilder getOutputContextsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Makes the platform immediately invoke another `DetectIntent` call
   * internally with the specified event as input.
   * When this field is set, Dialogflow ignores the `fulfillment_text`,
   * `fulfillment_messages`, and `payload` fields.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.EventInput followup_event_input = 6;</code>
   */
  boolean hasFollowupEventInput();
  /**
   *
   *
   * <pre>
   * Optional. Makes the platform immediately invoke another `DetectIntent` call
   * internally with the specified event as input.
   * When this field is set, Dialogflow ignores the `fulfillment_text`,
   * `fulfillment_messages`, and `payload` fields.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.EventInput followup_event_input = 6;</code>
   */
  com.google.cloud.dialogflow.v2beta1.EventInput getFollowupEventInput();
  /**
   *
   *
   * <pre>
   * Optional. Makes the platform immediately invoke another `DetectIntent` call
   * internally with the specified event as input.
   * When this field is set, Dialogflow ignores the `fulfillment_text`,
   * `fulfillment_messages`, and `payload` fields.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.EventInput followup_event_input = 6;</code>
   */
  com.google.cloud.dialogflow.v2beta1.EventInputOrBuilder getFollowupEventInputOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Indicates that this intent ends an interaction. Some integrations
   * (e.g., Actions on Google or Dialogflow phone gateway) use this information
   * to close interaction with an end user. Default is false.
   * </pre>
   *
   * <code>bool end_interaction = 8;</code>
   */
  boolean getEndInteraction();
}
