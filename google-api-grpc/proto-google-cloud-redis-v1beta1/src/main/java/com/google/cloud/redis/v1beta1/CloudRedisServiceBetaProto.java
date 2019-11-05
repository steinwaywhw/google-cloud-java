// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/redis/v1beta1/cloud_redis.proto

package com.google.cloud.redis.v1beta1;

public final class CloudRedisServiceBetaProto {
  private CloudRedisServiceBetaProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1beta1_Instance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1beta1_Instance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1beta1_Instance_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1beta1_Instance_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1beta1_Instance_RedisConfigsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1beta1_Instance_RedisConfigsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1beta1_ListInstancesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1beta1_ListInstancesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1beta1_ListInstancesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1beta1_ListInstancesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1beta1_GetInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1beta1_GetInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1beta1_CreateInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1beta1_CreateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1beta1_UpdateInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1beta1_UpdateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1beta1_DeleteInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1beta1_DeleteInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1beta1_GcsSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1beta1_GcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1beta1_InputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1beta1_InputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1beta1_ImportInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1beta1_ImportInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1beta1_GcsDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1beta1_GcsDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1beta1_OutputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1beta1_OutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1beta1_ExportInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1beta1_ExportInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1beta1_FailoverInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1beta1_FailoverInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1beta1_LocationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1beta1_LocationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1beta1_LocationMetadata_AvailableZonesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1beta1_LocationMetadata_AvailableZonesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_redis_v1beta1_ZoneMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_redis_v1beta1_ZoneMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/redis/v1beta1/cloud_redis"
          + ".proto\022\032google.cloud.redis.v1beta1\032\034goog"
          + "le/api/annotations.proto\032\027google/api/cli"
          + "ent.proto\032\037google/api/field_behavior.pro"
          + "to\032\031google/api/resource.proto\032#google/lo"
          + "ngrunning/operations.proto\032 google/proto"
          + "buf/field_mask.proto\032\037google/protobuf/ti"
          + "mestamp.proto\"\332\010\n\010Instance\022\021\n\004name\030\001 \001(\t"
          + "B\003\340A\002\022\024\n\014display_name\030\002 \001(\t\022@\n\006labels\030\003 "
          + "\003(\01320.google.cloud.redis.v1beta1.Instanc"
          + "e.LabelsEntry\022\030\n\013location_id\030\004 \001(\tB\003\340A\001\022"
          + "$\n\027alternative_location_id\030\005 \001(\tB\003\340A\001\022\032\n"
          + "\rredis_version\030\007 \001(\tB\003\340A\001\022\036\n\021reserved_ip"
          + "_range\030\t \001(\tB\003\340A\001\022\021\n\004host\030\n \001(\tB\003\340A\003\022\021\n\004"
          + "port\030\013 \001(\005B\003\340A\003\022 \n\023current_location_id\030\014"
          + " \001(\tB\003\340A\003\0224\n\013create_time\030\r \001(\0132\032.google."
          + "protobuf.TimestampB\003\340A\003\022>\n\005state\030\016 \001(\0162*"
          + ".google.cloud.redis.v1beta1.Instance.Sta"
          + "teB\003\340A\003\022\033\n\016status_message\030\017 \001(\tB\003\340A\003\022R\n\r"
          + "redis_configs\030\020 \003(\01326.google.cloud.redis"
          + ".v1beta1.Instance.RedisConfigsEntryB\003\340A\001"
          + "\022<\n\004tier\030\021 \001(\0162).google.cloud.redis.v1be"
          + "ta1.Instance.TierB\003\340A\002\022\033\n\016memory_size_gb"
          + "\030\022 \001(\005B\003\340A\002\022\037\n\022authorized_network\030\024 \001(\tB"
          + "\003\340A\001\022%\n\030persistence_iam_identity\030\025 \001(\tB\003"
          + "\340A\003\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value"
          + "\030\002 \001(\t:\0028\001\0323\n\021RedisConfigsEntry\022\013\n\003key\030\001"
          + " \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\224\001\n\005State\022\025\n\021STA"
          + "TE_UNSPECIFIED\020\000\022\014\n\010CREATING\020\001\022\t\n\005READY\020"
          + "\002\022\014\n\010UPDATING\020\003\022\014\n\010DELETING\020\004\022\r\n\tREPAIRI"
          + "NG\020\005\022\017\n\013MAINTENANCE\020\006\022\r\n\tIMPORTING\020\010\022\020\n\014"
          + "FAILING_OVER\020\n\"8\n\004Tier\022\024\n\020TIER_UNSPECIFI"
          + "ED\020\000\022\t\n\005BASIC\020\001\022\017\n\013STANDARD_HA\020\003:`\352A]\n\035r"
          + "edis.googleapis.com/Instance\022<projects/{"
          + "project}/locations/{location}/instances/"
          + "{instance}\"x\n\024ListInstancesRequest\0229\n\006pa"
          + "rent\030\001 \001(\tB)\340A\002\372A#\n!locations.googleapis"
          + ".com/Location\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage"
          + "_token\030\003 \001(\t\"~\n\025ListInstancesResponse\0227\n"
          + "\tinstances\030\001 \003(\0132$.google.cloud.redis.v1"
          + "beta1.Instance\022\027\n\017next_page_token\030\002 \001(\t\022"
          + "\023\n\013unreachable\030\003 \003(\t\"I\n\022GetInstanceReque"
          + "st\0223\n\004name\030\001 \001(\tB%\340A\002\372A\037\n\035redis.googleap"
          + "is.com/Instance\"\251\001\n\025CreateInstanceReques"
          + "t\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locations.goo"
          + "gleapis.com/Location\022\030\n\013instance_id\030\002 \001("
          + "\tB\003\340A\002\022;\n\010instance\030\003 \001(\0132$.google.cloud."
          + "redis.v1beta1.InstanceB\003\340A\002\"\212\001\n\025UpdateIn"
          + "stanceRequest\0224\n\013update_mask\030\001 \001(\0132\032.goo"
          + "gle.protobuf.FieldMaskB\003\340A\002\022;\n\010instance\030"
          + "\002 \001(\0132$.google.cloud.redis.v1beta1.Insta"
          + "nceB\003\340A\002\"L\n\025DeleteInstanceRequest\0223\n\004nam"
          + "e\030\001 \001(\tB%\340A\002\372A\037\n\035redis.googleapis.com/In"
          + "stance\"\035\n\tGcsSource\022\020\n\003uri\030\001 \001(\tB\003\340A\002\"T\n"
          + "\013InputConfig\022;\n\ngcs_source\030\001 \001(\0132%.googl"
          + "e.cloud.redis.v1beta1.GcsSourceH\000B\010\n\006sou"
          + "rce\"n\n\025ImportInstanceRequest\022\021\n\004name\030\001 \001"
          + "(\tB\003\340A\002\022B\n\014input_config\030\003 \001(\0132\'.google.c"
          + "loud.redis.v1beta1.InputConfigB\003\340A\002\"\"\n\016G"
          + "csDestination\022\020\n\003uri\030\001 \001(\tB\003\340A\002\"d\n\014Outpu"
          + "tConfig\022E\n\017gcs_destination\030\001 \001(\0132*.googl"
          + "e.cloud.redis.v1beta1.GcsDestinationH\000B\r"
          + "\n\013destination\"p\n\025ExportInstanceRequest\022\021"
          + "\n\004name\030\001 \001(\tB\003\340A\002\022D\n\routput_config\030\003 \001(\013"
          + "2(.google.cloud.redis.v1beta1.OutputConf"
          + "igB\003\340A\002\"\241\002\n\027FailoverInstanceRequest\0223\n\004n"
          + "ame\030\001 \001(\tB%\340A\002\372A\037\n\035redis.googleapis.com/"
          + "Instance\022i\n\024data_protection_mode\030\002 \001(\0162F"
          + ".google.cloud.redis.v1beta1.FailoverInst"
          + "anceRequest.DataProtectionModeB\003\340A\001\"f\n\022D"
          + "ataProtectionMode\022$\n DATA_PROTECTION_MOD"
          + "E_UNSPECIFIED\020\000\022\025\n\021LIMITED_DATA_LOSS\020\001\022\023"
          + "\n\017FORCE_DATA_LOSS\020\002\"\323\001\n\020LocationMetadata"
          + "\022^\n\017available_zones\030\001 \003(\0132@.google.cloud"
          + ".redis.v1beta1.LocationMetadata.Availabl"
          + "eZonesEntryB\003\340A\003\032_\n\023AvailableZonesEntry\022"
          + "\013\n\003key\030\001 \001(\t\0227\n\005value\030\002 \001(\0132(.google.clo"
          + "ud.redis.v1beta1.ZoneMetadata:\0028\001\"\016\n\014Zon"
          + "eMetadata2\250\017\n\nCloudRedis\022\271\001\n\rListInstanc"
          + "es\0220.google.cloud.redis.v1beta1.ListInst"
          + "ancesRequest\0321.google.cloud.redis.v1beta"
          + "1.ListInstancesResponse\"C\202\323\344\223\0024\0222/v1beta"
          + "1/{parent=projects/*/locations/*}/instan"
          + "ces\332A\006parent\022\246\001\n\013GetInstance\022..google.cl"
          + "oud.redis.v1beta1.GetInstanceRequest\032$.g"
          + "oogle.cloud.redis.v1beta1.Instance\"A\202\323\344\223"
          + "\0024\0222/v1beta1/{name=projects/*/locations/"
          + "*/instances/*}\332A\004name\022\204\002\n\016CreateInstance"
          + "\0221.google.cloud.redis.v1beta1.CreateInst"
          + "anceRequest\032\035.google.longrunning.Operati"
          + "on\"\237\001\202\323\344\223\002>\"2/v1beta1/{parent=projects/*"
          + "/locations/*}/instances:\010instance\332A\033pare"
          + "nt,instance_id,instance\312A:\n#google.cloud"
          + ".redis.v1beta1.Instance\022\023google.protobuf"
          + ".Any\022\206\002\n\016UpdateInstance\0221.google.cloud.r"
          + "edis.v1beta1.UpdateInstanceRequest\032\035.goo"
          + "gle.longrunning.Operation\"\241\001\202\323\344\223\002G2;/v1b"
          + "eta1/{instance.name=projects/*/locations"
          + "/*/instances/*}:\010instance\332A\024update_mask,"
          + "instance\312A:\n#google.cloud.redis.v1beta1."
          + "Instance\022\023google.protobuf.Any\022\372\001\n\016Import"
          + "Instance\0221.google.cloud.redis.v1beta1.Im"
          + "portInstanceRequest\032\035.google.longrunning"
          + ".Operation\"\225\001\202\323\344\223\002>\"9/v1beta1/{name=proj"
          + "ects/*/locations/*/instances/*}:import:\001"
          + "*\332A\021name,input_config\312A:\n#google.cloud.r"
          + "edis.v1beta1.Instance\022\023google.protobuf.A"
          + "ny\022\373\001\n\016ExportInstance\0221.google.cloud.red"
          + "is.v1beta1.ExportInstanceRequest\032\035.googl"
          + "e.longrunning.Operation\"\226\001\202\323\344\223\002>\"9/v1bet"
          + "a1/{name=projects/*/locations/*/instance"
          + "s/*}:export:\001*\332A\022name,output_config\312A:\n#"
          + "google.cloud.redis.v1beta1.Instance\022\023goo"
          + "gle.protobuf.Any\022\210\002\n\020FailoverInstance\0223."
          + "google.cloud.redis.v1beta1.FailoverInsta"
          + "nceRequest\032\035.google.longrunning.Operatio"
          + "n\"\237\001\202\323\344\223\002@\";/v1beta1/{name=projects/*/lo"
          + "cations/*/instances/*}:failover:\001*\332A\031nam"
          + "e,data_protection_mode\312A:\n#google.cloud."
          + "redis.v1beta1.Instance\022\023google.protobuf."
          + "Any\022\324\001\n\016DeleteInstance\0221.google.cloud.re"
          + "dis.v1beta1.DeleteInstanceRequest\032\035.goog"
          + "le.longrunning.Operation\"p\202\323\344\223\0024*2/v1bet"
          + "a1/{name=projects/*/locations/*/instance"
          + "s/*}\332A\004name\312A,\n\025google.protobuf.Empty\022\023g"
          + "oogle.protobuf.Any\032H\312A\024redis.googleapis."
          + "com\322A.https://www.googleapis.com/auth/cl"
          + "oud-platformB\177\n\036com.google.cloud.redis.v"
          + "1beta1B\032CloudRedisServiceBetaProtoP\001Z?go"
          + "ogle.golang.org/genproto/googleapis/clou"
          + "d/redis/v1beta1;redisb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_redis_v1beta1_Instance_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_redis_v1beta1_Instance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1beta1_Instance_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Labels",
              "LocationId",
              "AlternativeLocationId",
              "RedisVersion",
              "ReservedIpRange",
              "Host",
              "Port",
              "CurrentLocationId",
              "CreateTime",
              "State",
              "StatusMessage",
              "RedisConfigs",
              "Tier",
              "MemorySizeGb",
              "AuthorizedNetwork",
              "PersistenceIamIdentity",
            });
    internal_static_google_cloud_redis_v1beta1_Instance_LabelsEntry_descriptor =
        internal_static_google_cloud_redis_v1beta1_Instance_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_redis_v1beta1_Instance_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1beta1_Instance_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_redis_v1beta1_Instance_RedisConfigsEntry_descriptor =
        internal_static_google_cloud_redis_v1beta1_Instance_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_redis_v1beta1_Instance_RedisConfigsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1beta1_Instance_RedisConfigsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_redis_v1beta1_ListInstancesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_redis_v1beta1_ListInstancesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1beta1_ListInstancesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_redis_v1beta1_ListInstancesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_redis_v1beta1_ListInstancesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1beta1_ListInstancesResponse_descriptor,
            new java.lang.String[] {
              "Instances", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_redis_v1beta1_GetInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_redis_v1beta1_GetInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1beta1_GetInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_redis_v1beta1_CreateInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_redis_v1beta1_CreateInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1beta1_CreateInstanceRequest_descriptor,
            new java.lang.String[] {
              "Parent", "InstanceId", "Instance",
            });
    internal_static_google_cloud_redis_v1beta1_UpdateInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_redis_v1beta1_UpdateInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1beta1_UpdateInstanceRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "Instance",
            });
    internal_static_google_cloud_redis_v1beta1_DeleteInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_redis_v1beta1_DeleteInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1beta1_DeleteInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_redis_v1beta1_GcsSource_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_redis_v1beta1_GcsSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1beta1_GcsSource_descriptor,
            new java.lang.String[] {
              "Uri",
            });
    internal_static_google_cloud_redis_v1beta1_InputConfig_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_redis_v1beta1_InputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1beta1_InputConfig_descriptor,
            new java.lang.String[] {
              "GcsSource", "Source",
            });
    internal_static_google_cloud_redis_v1beta1_ImportInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_redis_v1beta1_ImportInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1beta1_ImportInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name", "InputConfig",
            });
    internal_static_google_cloud_redis_v1beta1_GcsDestination_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_redis_v1beta1_GcsDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1beta1_GcsDestination_descriptor,
            new java.lang.String[] {
              "Uri",
            });
    internal_static_google_cloud_redis_v1beta1_OutputConfig_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_redis_v1beta1_OutputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1beta1_OutputConfig_descriptor,
            new java.lang.String[] {
              "GcsDestination", "Destination",
            });
    internal_static_google_cloud_redis_v1beta1_ExportInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_redis_v1beta1_ExportInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1beta1_ExportInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name", "OutputConfig",
            });
    internal_static_google_cloud_redis_v1beta1_FailoverInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_redis_v1beta1_FailoverInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1beta1_FailoverInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name", "DataProtectionMode",
            });
    internal_static_google_cloud_redis_v1beta1_LocationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_redis_v1beta1_LocationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1beta1_LocationMetadata_descriptor,
            new java.lang.String[] {
              "AvailableZones",
            });
    internal_static_google_cloud_redis_v1beta1_LocationMetadata_AvailableZonesEntry_descriptor =
        internal_static_google_cloud_redis_v1beta1_LocationMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_redis_v1beta1_LocationMetadata_AvailableZonesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1beta1_LocationMetadata_AvailableZonesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_redis_v1beta1_ZoneMetadata_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_redis_v1beta1_ZoneMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_redis_v1beta1_ZoneMetadata_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
