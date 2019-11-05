// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/scheduler/v1/cloudscheduler.proto

package com.google.cloud.scheduler.v1;

public final class SchedulerProto {
  private SchedulerProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_ListJobsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_ListJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_ListJobsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_ListJobsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_GetJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_GetJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_CreateJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_CreateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_UpdateJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_UpdateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_DeleteJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_DeleteJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_PauseJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_PauseJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_ResumeJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_ResumeJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_scheduler_v1_RunJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_scheduler_v1_RunJobRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/scheduler/v1/cloudschedul"
          + "er.proto\022\031google.cloud.scheduler.v1\032\034goo"
          + "gle/api/annotations.proto\032\027google/api/cl"
          + "ient.proto\032\037google/api/field_behavior.pr"
          + "oto\032\031google/api/resource.proto\032#google/c"
          + "loud/scheduler/v1/job.proto\032\033google/prot"
          + "obuf/empty.proto\032 google/protobuf/field_"
          + "mask.proto\"s\n\017ListJobsRequest\0229\n\006parent\030"
          + "\001 \001(\tB)\340A\002\372A#\022!cloudscheduler.googleapis"
          + ".com/Job\022\021\n\tpage_size\030\005 \001(\005\022\022\n\npage_toke"
          + "n\030\006 \001(\t\"Y\n\020ListJobsResponse\022,\n\004jobs\030\001 \003("
          + "\0132\036.google.cloud.scheduler.v1.Job\022\027\n\017nex"
          + "t_page_token\030\002 \001(\t\"H\n\rGetJobRequest\0227\n\004n"
          + "ame\030\001 \001(\tB)\340A\002\372A#\n!cloudscheduler.google"
          + "apis.com/Job\"\177\n\020CreateJobRequest\0229\n\006pare"
          + "nt\030\001 \001(\tB)\340A\002\372A#\022!cloudscheduler.googlea"
          + "pis.com/Job\0220\n\003job\030\002 \001(\0132\036.google.cloud."
          + "scheduler.v1.JobB\003\340A\002\"z\n\020UpdateJobReques"
          + "t\0220\n\003job\030\001 \001(\0132\036.google.cloud.scheduler."
          + "v1.JobB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032.googl"
          + "e.protobuf.FieldMaskB\003\340A\002\"K\n\020DeleteJobRe"
          + "quest\0227\n\004name\030\001 \001(\tB)\340A\002\372A#\n!cloudschedu"
          + "ler.googleapis.com/Job\"J\n\017PauseJobReques"
          + "t\0227\n\004name\030\001 \001(\tB)\340A\002\372A#\n!cloudscheduler."
          + "googleapis.com/Job\"K\n\020ResumeJobRequest\0227"
          + "\n\004name\030\001 \001(\tB)\340A\002\372A#\n!cloudscheduler.goo"
          + "gleapis.com/Job\"H\n\rRunJobRequest\0227\n\004name"
          + "\030\001 \001(\tB)\340A\002\372A#\n!cloudscheduler.googleapi"
          + "s.com/Job2\263\n\n\016CloudScheduler\022\236\001\n\010ListJob"
          + "s\022*.google.cloud.scheduler.v1.ListJobsRe"
          + "quest\032+.google.cloud.scheduler.v1.ListJo"
          + "bsResponse\"9\202\323\344\223\002*\022(/v1/{parent=projects"
          + "/*/locations/*}/jobs\332A\006parent\022\213\001\n\006GetJob"
          + "\022(.google.cloud.scheduler.v1.GetJobReque"
          + "st\032\036.google.cloud.scheduler.v1.Job\"7\202\323\344\223"
          + "\002*\022(/v1/{name=projects/*/locations/*/job"
          + "s/*}\332A\004name\022\234\001\n\tCreateJob\022+.google.cloud"
          + ".scheduler.v1.CreateJobRequest\032\036.google."
          + "cloud.scheduler.v1.Job\"B\202\323\344\223\002/\"(/v1/{par"
          + "ent=projects/*/locations/*}/jobs:\003job\332A\n"
          + "parent,job\022\245\001\n\tUpdateJob\022+.google.cloud."
          + "scheduler.v1.UpdateJobRequest\032\036.google.c"
          + "loud.scheduler.v1.Job\"K\202\323\344\223\00232,/v1/{job."
          + "name=projects/*/locations/*/jobs/*}:\003job"
          + "\332A\017job,update_mask\022\211\001\n\tDeleteJob\022+.googl"
          + "e.cloud.scheduler.v1.DeleteJobRequest\032\026."
          + "google.protobuf.Empty\"7\202\323\344\223\002**(/v1/{name"
          + "=projects/*/locations/*/jobs/*}\332A\004name\022\230"
          + "\001\n\010PauseJob\022*.google.cloud.scheduler.v1."
          + "PauseJobRequest\032\036.google.cloud.scheduler"
          + ".v1.Job\"@\202\323\344\223\0023\"./v1/{name=projects/*/lo"
          + "cations/*/jobs/*}:pause:\001*\332A\004name\022\233\001\n\tRe"
          + "sumeJob\022+.google.cloud.scheduler.v1.Resu"
          + "meJobRequest\032\036.google.cloud.scheduler.v1"
          + ".Job\"A\202\323\344\223\0024\"//v1/{name=projects/*/locat"
          + "ions/*/jobs/*}:resume:\001*\332A\004name\022\222\001\n\006RunJ"
          + "ob\022(.google.cloud.scheduler.v1.RunJobReq"
          + "uest\032\036.google.cloud.scheduler.v1.Job\">\202\323"
          + "\344\223\0021\",/v1/{name=projects/*/locations/*/j"
          + "obs/*}:run:\001*\332A\004name\032Q\312A\035cloudscheduler."
          + "googleapis.com\322A.https://www.googleapis."
          + "com/auth/cloud-platformB\201\001\n\035com.google.c"
          + "loud.scheduler.v1B\016SchedulerProtoP\001ZBgoo"
          + "gle.golang.org/genproto/googleapis/cloud"
          + "/scheduler/v1;scheduler\242\002\tSCHEDULERb\006pro"
          + "to3"
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
          com.google.cloud.scheduler.v1.JobProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_scheduler_v1_ListJobsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_scheduler_v1_ListJobsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_ListJobsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_scheduler_v1_ListJobsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_scheduler_v1_ListJobsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_ListJobsResponse_descriptor,
            new java.lang.String[] {
              "Jobs", "NextPageToken",
            });
    internal_static_google_cloud_scheduler_v1_GetJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_scheduler_v1_GetJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_GetJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_scheduler_v1_CreateJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_scheduler_v1_CreateJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_CreateJobRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Job",
            });
    internal_static_google_cloud_scheduler_v1_UpdateJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_scheduler_v1_UpdateJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_UpdateJobRequest_descriptor,
            new java.lang.String[] {
              "Job", "UpdateMask",
            });
    internal_static_google_cloud_scheduler_v1_DeleteJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_scheduler_v1_DeleteJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_DeleteJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_scheduler_v1_PauseJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_scheduler_v1_PauseJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_PauseJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_scheduler_v1_ResumeJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_scheduler_v1_ResumeJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_ResumeJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_scheduler_v1_RunJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_scheduler_v1_RunJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_scheduler_v1_RunJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.scheduler.v1.JobProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
