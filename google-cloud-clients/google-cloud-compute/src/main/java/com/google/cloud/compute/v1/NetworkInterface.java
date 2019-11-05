/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
/** A network interface resource attached to an instance. */
public final class NetworkInterface implements ApiMessage {
  private final List<AccessConfig> accessConfigs;
  private final List<AliasIpRange> aliasIpRanges;
  private final String fingerprint;
  private final String kind;
  private final String name;
  private final String network;
  private final String networkIP;
  private final String subnetwork;

  private NetworkInterface() {
    this.accessConfigs = null;
    this.aliasIpRanges = null;
    this.fingerprint = null;
    this.kind = null;
    this.name = null;
    this.network = null;
    this.networkIP = null;
    this.subnetwork = null;
  }

  private NetworkInterface(
      List<AccessConfig> accessConfigs,
      List<AliasIpRange> aliasIpRanges,
      String fingerprint,
      String kind,
      String name,
      String network,
      String networkIP,
      String subnetwork) {
    this.accessConfigs = accessConfigs;
    this.aliasIpRanges = aliasIpRanges;
    this.fingerprint = fingerprint;
    this.kind = kind;
    this.name = name;
    this.network = network;
    this.networkIP = networkIP;
    this.subnetwork = subnetwork;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("accessConfigs".equals(fieldName)) {
      return accessConfigs;
    }
    if ("aliasIpRanges".equals(fieldName)) {
      return aliasIpRanges;
    }
    if ("fingerprint".equals(fieldName)) {
      return fingerprint;
    }
    if ("kind".equals(fieldName)) {
      return kind;
    }
    if ("name".equals(fieldName)) {
      return name;
    }
    if ("network".equals(fieldName)) {
      return network;
    }
    if ("networkIP".equals(fieldName)) {
      return networkIP;
    }
    if ("subnetwork".equals(fieldName)) {
      return subnetwork;
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  @Nullable
  @Override
  /**
   * The fields that should be serialized (even if they have empty values). If the containing
   * message object has a non-null fieldmask, then all the fields in the field mask (and only those
   * fields in the field mask) will be serialized. If the containing object does not have a
   * fieldmask, then only non-empty fields will be serialized.
   */
  public List<String> getFieldMask() {
    return null;
  }

  /**
   * An array of configurations for this interface. Currently, only one access config,
   * ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance will
   * have no external internet access.
   */
  public List<AccessConfig> getAccessConfigsList() {
    return accessConfigs;
  }

  /**
   * An array of alias IP ranges for this network interface. You can only specify this field for
   * network interfaces in VPC networks.
   */
  public List<AliasIpRange> getAliasIpRangesList() {
    return aliasIpRanges;
  }

  /**
   * Fingerprint hash of contents stored in this network interface. This field will be ignored when
   * inserting an Instance or adding a NetworkInterface. An up-to-date fingerprint must be provided
   * in order to update the NetworkInterface, otherwise the request will fail with error 412
   * conditionNotMet.
   */
  public String getFingerprint() {
    return fingerprint;
  }

  /** [Output Only] Type of the resource. Always compute#networkInterface for network interfaces. */
  public String getKind() {
    return kind;
  }

  /**
   * [Output Only] The name of the network interface, which is generated by the server. For network
   * devices, these are eth0, eth1, etc.
   */
  public String getName() {
    return name;
  }

  /**
   * URL of the network resource for this instance. When creating an instance, if neither the
   * network nor the subnetwork is specified, the default network global/networks/default is used;
   * if the network is not specified but the subnetwork is specified, the network is inferred.
   *
   * <p>If you specify this property, you can specify the network as a full or partial URL. For
   * example, the following are all valid URLs: -
   * https://www.googleapis.com/compute/v1/projects/project/global/networks/network -
   * projects/project/global/networks/network - global/networks/default
   */
  public String getNetwork() {
    return network;
  }

  /**
   * An IPv4 internal IP address to assign to the instance for this network interface. If not
   * specified by the user, an unused internal IP is assigned by the system.
   */
  public String getNetworkIP() {
    return networkIP;
  }

  /**
   * The URL of the Subnetwork resource for this instance. If the network resource is in legacy
   * mode, do not specify this field. If the network is in auto subnet mode, specifying the
   * subnetwork is optional. If the network is in custom subnet mode, specifying the subnetwork is
   * required. If you specify this field, you can specify the subnetwork as a full or partial URL.
   * For example, the following are all valid URLs: -
   * https://www.googleapis.com/compute/v1/projects/project/regions/region/subnetworks/subnetwork -
   * regions/region/subnetworks/subnetwork
   */
  public String getSubnetwork() {
    return subnetwork;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(NetworkInterface prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static NetworkInterface getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final NetworkInterface DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new NetworkInterface();
  }

  public static class Builder {
    private List<AccessConfig> accessConfigs;
    private List<AliasIpRange> aliasIpRanges;
    private String fingerprint;
    private String kind;
    private String name;
    private String network;
    private String networkIP;
    private String subnetwork;

    Builder() {}

    public Builder mergeFrom(NetworkInterface other) {
      if (other == NetworkInterface.getDefaultInstance()) return this;
      if (other.getAccessConfigsList() != null) {
        this.accessConfigs = other.accessConfigs;
      }
      if (other.getAliasIpRangesList() != null) {
        this.aliasIpRanges = other.aliasIpRanges;
      }
      if (other.getFingerprint() != null) {
        this.fingerprint = other.fingerprint;
      }
      if (other.getKind() != null) {
        this.kind = other.kind;
      }
      if (other.getName() != null) {
        this.name = other.name;
      }
      if (other.getNetwork() != null) {
        this.network = other.network;
      }
      if (other.getNetworkIP() != null) {
        this.networkIP = other.networkIP;
      }
      if (other.getSubnetwork() != null) {
        this.subnetwork = other.subnetwork;
      }
      return this;
    }

    Builder(NetworkInterface source) {
      this.accessConfigs = source.accessConfigs;
      this.aliasIpRanges = source.aliasIpRanges;
      this.fingerprint = source.fingerprint;
      this.kind = source.kind;
      this.name = source.name;
      this.network = source.network;
      this.networkIP = source.networkIP;
      this.subnetwork = source.subnetwork;
    }

    /**
     * An array of configurations for this interface. Currently, only one access config,
     * ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance
     * will have no external internet access.
     */
    public List<AccessConfig> getAccessConfigsList() {
      return accessConfigs;
    }

    /**
     * An array of configurations for this interface. Currently, only one access config,
     * ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance
     * will have no external internet access.
     */
    public Builder addAllAccessConfigs(List<AccessConfig> accessConfigs) {
      if (this.accessConfigs == null) {
        this.accessConfigs = new LinkedList<>();
      }
      this.accessConfigs.addAll(accessConfigs);
      return this;
    }

    /**
     * An array of configurations for this interface. Currently, only one access config,
     * ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance
     * will have no external internet access.
     */
    public Builder addAccessConfigs(AccessConfig accessConfigs) {
      if (this.accessConfigs == null) {
        this.accessConfigs = new LinkedList<>();
      }
      this.accessConfigs.add(accessConfigs);
      return this;
    }

    /**
     * An array of alias IP ranges for this network interface. You can only specify this field for
     * network interfaces in VPC networks.
     */
    public List<AliasIpRange> getAliasIpRangesList() {
      return aliasIpRanges;
    }

    /**
     * An array of alias IP ranges for this network interface. You can only specify this field for
     * network interfaces in VPC networks.
     */
    public Builder addAllAliasIpRanges(List<AliasIpRange> aliasIpRanges) {
      if (this.aliasIpRanges == null) {
        this.aliasIpRanges = new LinkedList<>();
      }
      this.aliasIpRanges.addAll(aliasIpRanges);
      return this;
    }

    /**
     * An array of alias IP ranges for this network interface. You can only specify this field for
     * network interfaces in VPC networks.
     */
    public Builder addAliasIpRanges(AliasIpRange aliasIpRanges) {
      if (this.aliasIpRanges == null) {
        this.aliasIpRanges = new LinkedList<>();
      }
      this.aliasIpRanges.add(aliasIpRanges);
      return this;
    }

    /**
     * Fingerprint hash of contents stored in this network interface. This field will be ignored
     * when inserting an Instance or adding a NetworkInterface. An up-to-date fingerprint must be
     * provided in order to update the NetworkInterface, otherwise the request will fail with error
     * 412 conditionNotMet.
     */
    public String getFingerprint() {
      return fingerprint;
    }

    /**
     * Fingerprint hash of contents stored in this network interface. This field will be ignored
     * when inserting an Instance or adding a NetworkInterface. An up-to-date fingerprint must be
     * provided in order to update the NetworkInterface, otherwise the request will fail with error
     * 412 conditionNotMet.
     */
    public Builder setFingerprint(String fingerprint) {
      this.fingerprint = fingerprint;
      return this;
    }

    /**
     * [Output Only] Type of the resource. Always compute#networkInterface for network interfaces.
     */
    public String getKind() {
      return kind;
    }

    /**
     * [Output Only] Type of the resource. Always compute#networkInterface for network interfaces.
     */
    public Builder setKind(String kind) {
      this.kind = kind;
      return this;
    }

    /**
     * [Output Only] The name of the network interface, which is generated by the server. For
     * network devices, these are eth0, eth1, etc.
     */
    public String getName() {
      return name;
    }

    /**
     * [Output Only] The name of the network interface, which is generated by the server. For
     * network devices, these are eth0, eth1, etc.
     */
    public Builder setName(String name) {
      this.name = name;
      return this;
    }

    /**
     * URL of the network resource for this instance. When creating an instance, if neither the
     * network nor the subnetwork is specified, the default network global/networks/default is used;
     * if the network is not specified but the subnetwork is specified, the network is inferred.
     *
     * <p>If you specify this property, you can specify the network as a full or partial URL. For
     * example, the following are all valid URLs: -
     * https://www.googleapis.com/compute/v1/projects/project/global/networks/network -
     * projects/project/global/networks/network - global/networks/default
     */
    public String getNetwork() {
      return network;
    }

    /**
     * URL of the network resource for this instance. When creating an instance, if neither the
     * network nor the subnetwork is specified, the default network global/networks/default is used;
     * if the network is not specified but the subnetwork is specified, the network is inferred.
     *
     * <p>If you specify this property, you can specify the network as a full or partial URL. For
     * example, the following are all valid URLs: -
     * https://www.googleapis.com/compute/v1/projects/project/global/networks/network -
     * projects/project/global/networks/network - global/networks/default
     */
    public Builder setNetwork(String network) {
      this.network = network;
      return this;
    }

    /**
     * An IPv4 internal IP address to assign to the instance for this network interface. If not
     * specified by the user, an unused internal IP is assigned by the system.
     */
    public String getNetworkIP() {
      return networkIP;
    }

    /**
     * An IPv4 internal IP address to assign to the instance for this network interface. If not
     * specified by the user, an unused internal IP is assigned by the system.
     */
    public Builder setNetworkIP(String networkIP) {
      this.networkIP = networkIP;
      return this;
    }

    /**
     * The URL of the Subnetwork resource for this instance. If the network resource is in legacy
     * mode, do not specify this field. If the network is in auto subnet mode, specifying the
     * subnetwork is optional. If the network is in custom subnet mode, specifying the subnetwork is
     * required. If you specify this field, you can specify the subnetwork as a full or partial URL.
     * For example, the following are all valid URLs: -
     * https://www.googleapis.com/compute/v1/projects/project/regions/region/subnetworks/subnetwork
     * - regions/region/subnetworks/subnetwork
     */
    public String getSubnetwork() {
      return subnetwork;
    }

    /**
     * The URL of the Subnetwork resource for this instance. If the network resource is in legacy
     * mode, do not specify this field. If the network is in auto subnet mode, specifying the
     * subnetwork is optional. If the network is in custom subnet mode, specifying the subnetwork is
     * required. If you specify this field, you can specify the subnetwork as a full or partial URL.
     * For example, the following are all valid URLs: -
     * https://www.googleapis.com/compute/v1/projects/project/regions/region/subnetworks/subnetwork
     * - regions/region/subnetworks/subnetwork
     */
    public Builder setSubnetwork(String subnetwork) {
      this.subnetwork = subnetwork;
      return this;
    }

    public NetworkInterface build() {

      return new NetworkInterface(
          accessConfigs, aliasIpRanges, fingerprint, kind, name, network, networkIP, subnetwork);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.addAllAccessConfigs(this.accessConfigs);
      newBuilder.addAllAliasIpRanges(this.aliasIpRanges);
      newBuilder.setFingerprint(this.fingerprint);
      newBuilder.setKind(this.kind);
      newBuilder.setName(this.name);
      newBuilder.setNetwork(this.network);
      newBuilder.setNetworkIP(this.networkIP);
      newBuilder.setSubnetwork(this.subnetwork);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "NetworkInterface{"
        + "accessConfigs="
        + accessConfigs
        + ", "
        + "aliasIpRanges="
        + aliasIpRanges
        + ", "
        + "fingerprint="
        + fingerprint
        + ", "
        + "kind="
        + kind
        + ", "
        + "name="
        + name
        + ", "
        + "network="
        + network
        + ", "
        + "networkIP="
        + networkIP
        + ", "
        + "subnetwork="
        + subnetwork
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof NetworkInterface) {
      NetworkInterface that = (NetworkInterface) o;
      return Objects.equals(this.accessConfigs, that.getAccessConfigsList())
          && Objects.equals(this.aliasIpRanges, that.getAliasIpRangesList())
          && Objects.equals(this.fingerprint, that.getFingerprint())
          && Objects.equals(this.kind, that.getKind())
          && Objects.equals(this.name, that.getName())
          && Objects.equals(this.network, that.getNetwork())
          && Objects.equals(this.networkIP, that.getNetworkIP())
          && Objects.equals(this.subnetwork, that.getSubnetwork());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accessConfigs, aliasIpRanges, fingerprint, kind, name, network, networkIP, subnetwork);
  }
}
