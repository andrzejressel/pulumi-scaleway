// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scaleway.inputs.LoadbalancerPrivateNetworkArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadbalancerState extends com.pulumi.resources.ResourceArgs {

    public static final LoadbalancerState Empty = new LoadbalancerState();

    /**
     * Defines whether to automatically assign a flexible public IP to the load-balancer.
     * 
     */
    @Import(name="assignFlexibleIp")
    private @Nullable Output<Boolean> assignFlexibleIp;

    /**
     * @return Defines whether to automatically assign a flexible public IP to the load-balancer.
     * 
     */
    public Optional<Output<Boolean>> assignFlexibleIp() {
        return Optional.ofNullable(this.assignFlexibleIp);
    }

    /**
     * The description of the load-balancer.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the load-balancer.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The load-balance public IP Address
     * 
     */
    @Import(name="ipAddress")
    private @Nullable Output<String> ipAddress;

    /**
     * @return The load-balance public IP Address
     * 
     */
    public Optional<Output<String>> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * The ID of the associated LB IP. See below.
     * 
     * &gt; **Important:** Updates to `ip_id` will recreate the load-balancer.
     * 
     */
    @Import(name="ipId")
    private @Nullable Output<String> ipId;

    /**
     * @return The ID of the associated LB IP. See below.
     * 
     * &gt; **Important:** Updates to `ip_id` will recreate the load-balancer.
     * 
     */
    public Optional<Output<String>> ipId() {
        return Optional.ofNullable(this.ipId);
    }

    /**
     * The name of the load-balancer.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the load-balancer.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The organization ID the load-balancer is associated with.
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return The organization ID the load-balancer is associated with.
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    /**
     * List of private network to connect with your load balancer
     * 
     */
    @Import(name="privateNetworks")
    private @Nullable Output<List<LoadbalancerPrivateNetworkArgs>> privateNetworks;

    /**
     * @return List of private network to connect with your load balancer
     * 
     */
    public Optional<Output<List<LoadbalancerPrivateNetworkArgs>>> privateNetworks() {
        return Optional.ofNullable(this.privateNetworks);
    }

    /**
     * `project_id`) The ID of the project the load-balancer is associated with.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the load-balancer is associated with.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * The region of the resource
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region of the resource
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The release_ip allow release the ip address associated with the load-balancers.
     * 
     * @deprecated
     * The resource ip will be destroyed by it&#39;s own resource. Please set this to `false`
     * 
     */
    @Deprecated /* The resource ip will be destroyed by it's own resource. Please set this to `false` */
    @Import(name="releaseIp")
    private @Nullable Output<Boolean> releaseIp;

    /**
     * @return The release_ip allow release the ip address associated with the load-balancers.
     * 
     * @deprecated
     * The resource ip will be destroyed by it&#39;s own resource. Please set this to `false`
     * 
     */
    @Deprecated /* The resource ip will be destroyed by it's own resource. Please set this to `false` */
    public Optional<Output<Boolean>> releaseIp() {
        return Optional.ofNullable(this.releaseIp);
    }

    /**
     * Enforces minimal SSL version (in SSL/TLS offloading context). Please check [possible values](https://www.scaleway.com/en/developers/api/load-balancer/zoned-api/#path-load-balancer-create-a-load-balancer).
     * 
     */
    @Import(name="sslCompatibilityLevel")
    private @Nullable Output<String> sslCompatibilityLevel;

    /**
     * @return Enforces minimal SSL version (in SSL/TLS offloading context). Please check [possible values](https://www.scaleway.com/en/developers/api/load-balancer/zoned-api/#path-load-balancer-create-a-load-balancer).
     * 
     */
    public Optional<Output<String>> sslCompatibilityLevel() {
        return Optional.ofNullable(this.sslCompatibilityLevel);
    }

    /**
     * The tags associated with the load-balancers.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return The tags associated with the load-balancers.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The type of the load-balancer. Please check the migration section to upgrade the type.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of the load-balancer. Please check the migration section to upgrade the type.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * `zone`) The zone of the load-balancer.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return `zone`) The zone of the load-balancer.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private LoadbalancerState() {}

    private LoadbalancerState(LoadbalancerState $) {
        this.assignFlexibleIp = $.assignFlexibleIp;
        this.description = $.description;
        this.ipAddress = $.ipAddress;
        this.ipId = $.ipId;
        this.name = $.name;
        this.organizationId = $.organizationId;
        this.privateNetworks = $.privateNetworks;
        this.projectId = $.projectId;
        this.region = $.region;
        this.releaseIp = $.releaseIp;
        this.sslCompatibilityLevel = $.sslCompatibilityLevel;
        this.tags = $.tags;
        this.type = $.type;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadbalancerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadbalancerState $;

        public Builder() {
            $ = new LoadbalancerState();
        }

        public Builder(LoadbalancerState defaults) {
            $ = new LoadbalancerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param assignFlexibleIp Defines whether to automatically assign a flexible public IP to the load-balancer.
         * 
         * @return builder
         * 
         */
        public Builder assignFlexibleIp(@Nullable Output<Boolean> assignFlexibleIp) {
            $.assignFlexibleIp = assignFlexibleIp;
            return this;
        }

        /**
         * @param assignFlexibleIp Defines whether to automatically assign a flexible public IP to the load-balancer.
         * 
         * @return builder
         * 
         */
        public Builder assignFlexibleIp(Boolean assignFlexibleIp) {
            return assignFlexibleIp(Output.of(assignFlexibleIp));
        }

        /**
         * @param description The description of the load-balancer.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the load-balancer.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param ipAddress The load-balance public IP Address
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress The load-balance public IP Address
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        /**
         * @param ipId The ID of the associated LB IP. See below.
         * 
         * &gt; **Important:** Updates to `ip_id` will recreate the load-balancer.
         * 
         * @return builder
         * 
         */
        public Builder ipId(@Nullable Output<String> ipId) {
            $.ipId = ipId;
            return this;
        }

        /**
         * @param ipId The ID of the associated LB IP. See below.
         * 
         * &gt; **Important:** Updates to `ip_id` will recreate the load-balancer.
         * 
         * @return builder
         * 
         */
        public Builder ipId(String ipId) {
            return ipId(Output.of(ipId));
        }

        /**
         * @param name The name of the load-balancer.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the load-balancer.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param organizationId The organization ID the load-balancer is associated with.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId The organization ID the load-balancer is associated with.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param privateNetworks List of private network to connect with your load balancer
         * 
         * @return builder
         * 
         */
        public Builder privateNetworks(@Nullable Output<List<LoadbalancerPrivateNetworkArgs>> privateNetworks) {
            $.privateNetworks = privateNetworks;
            return this;
        }

        /**
         * @param privateNetworks List of private network to connect with your load balancer
         * 
         * @return builder
         * 
         */
        public Builder privateNetworks(List<LoadbalancerPrivateNetworkArgs> privateNetworks) {
            return privateNetworks(Output.of(privateNetworks));
        }

        /**
         * @param privateNetworks List of private network to connect with your load balancer
         * 
         * @return builder
         * 
         */
        public Builder privateNetworks(LoadbalancerPrivateNetworkArgs... privateNetworks) {
            return privateNetworks(List.of(privateNetworks));
        }

        /**
         * @param projectId `project_id`) The ID of the project the load-balancer is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId `project_id`) The ID of the project the load-balancer is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param region The region of the resource
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region of the resource
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param releaseIp The release_ip allow release the ip address associated with the load-balancers.
         * 
         * @return builder
         * 
         * @deprecated
         * The resource ip will be destroyed by it&#39;s own resource. Please set this to `false`
         * 
         */
        @Deprecated /* The resource ip will be destroyed by it's own resource. Please set this to `false` */
        public Builder releaseIp(@Nullable Output<Boolean> releaseIp) {
            $.releaseIp = releaseIp;
            return this;
        }

        /**
         * @param releaseIp The release_ip allow release the ip address associated with the load-balancers.
         * 
         * @return builder
         * 
         * @deprecated
         * The resource ip will be destroyed by it&#39;s own resource. Please set this to `false`
         * 
         */
        @Deprecated /* The resource ip will be destroyed by it's own resource. Please set this to `false` */
        public Builder releaseIp(Boolean releaseIp) {
            return releaseIp(Output.of(releaseIp));
        }

        /**
         * @param sslCompatibilityLevel Enforces minimal SSL version (in SSL/TLS offloading context). Please check [possible values](https://www.scaleway.com/en/developers/api/load-balancer/zoned-api/#path-load-balancer-create-a-load-balancer).
         * 
         * @return builder
         * 
         */
        public Builder sslCompatibilityLevel(@Nullable Output<String> sslCompatibilityLevel) {
            $.sslCompatibilityLevel = sslCompatibilityLevel;
            return this;
        }

        /**
         * @param sslCompatibilityLevel Enforces minimal SSL version (in SSL/TLS offloading context). Please check [possible values](https://www.scaleway.com/en/developers/api/load-balancer/zoned-api/#path-load-balancer-create-a-load-balancer).
         * 
         * @return builder
         * 
         */
        public Builder sslCompatibilityLevel(String sslCompatibilityLevel) {
            return sslCompatibilityLevel(Output.of(sslCompatibilityLevel));
        }

        /**
         * @param tags The tags associated with the load-balancers.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags associated with the load-balancers.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The tags associated with the load-balancers.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param type The type of the load-balancer. Please check the migration section to upgrade the type.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the load-balancer. Please check the migration section to upgrade the type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param zone `zone`) The zone of the load-balancer.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone `zone`) The zone of the load-balancer.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public LoadbalancerState build() {
            return $;
        }
    }

}
