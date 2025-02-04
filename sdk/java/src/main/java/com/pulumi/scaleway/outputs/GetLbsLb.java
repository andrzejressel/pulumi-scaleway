// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.scaleway.outputs.GetLbsLbInstance;
import com.pulumi.scaleway.outputs.GetLbsLbIp;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetLbsLb {
    /**
     * @return Number of backends the Load balancer has.
     * 
     */
    private Integer backendCount;
    /**
     * @return Date at which the Load balancer was created.
     * 
     */
    private String createdAt;
    /**
     * @return The description of the load-balancer.
     * 
     */
    private String description;
    /**
     * @return Number of frontends the Load balancer has.
     * 
     */
    private Integer frontendCount;
    /**
     * @return The ID of the load-balancer.
     * 
     */
    private String id;
    /**
     * @return List of underlying instances.
     * 
     */
    private List<GetLbsLbInstance> instances;
    /**
     * @return List of IPs attached to the Load balancer.
     * 
     */
    private List<GetLbsLbIp> ips;
    /**
     * @return The load balancer name used as a filter. LBs with a name like it are listed.
     * 
     */
    private String name;
    /**
     * @return The organization ID the load-balancer is associated with.
     * 
     */
    private String organizationId;
    /**
     * @return Number of private networks attached to the Load balancer.
     * 
     */
    private Integer privateNetworkCount;
    /**
     * @return The ID of the project the load-balancer is associated with.
     * 
     */
    private String projectId;
    /**
     * @return Number of routes the Load balancer has.
     * 
     */
    private Integer routeCount;
    /**
     * @return Determines the minimal SSL version which needs to be supported on client side.
     * 
     */
    private String sslCompatibilityLevel;
    /**
     * @return The state of the LB&#39;s instance. Possible values are: `unknown`, `ready`, `pending`, `stopped`, `error`, `locked` and `migrating`.
     * 
     */
    private String status;
    /**
     * @return The subscriber information.
     * 
     */
    private String subscriber;
    /**
     * @return The tags associated with the load-balancer.
     * 
     */
    private List<String> tags;
    /**
     * @return The offer type of the load-balancer.
     * 
     */
    private String type;
    /**
     * @return Date at which the Load balancer was updated.
     * 
     */
    private String updatedAt;
    /**
     * @return `zone`) The zone in which LBs exist.
     * 
     */
    private String zone;

    private GetLbsLb() {}
    /**
     * @return Number of backends the Load balancer has.
     * 
     */
    public Integer backendCount() {
        return this.backendCount;
    }
    /**
     * @return Date at which the Load balancer was created.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return The description of the load-balancer.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Number of frontends the Load balancer has.
     * 
     */
    public Integer frontendCount() {
        return this.frontendCount;
    }
    /**
     * @return The ID of the load-balancer.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return List of underlying instances.
     * 
     */
    public List<GetLbsLbInstance> instances() {
        return this.instances;
    }
    /**
     * @return List of IPs attached to the Load balancer.
     * 
     */
    public List<GetLbsLbIp> ips() {
        return this.ips;
    }
    /**
     * @return The load balancer name used as a filter. LBs with a name like it are listed.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The organization ID the load-balancer is associated with.
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }
    /**
     * @return Number of private networks attached to the Load balancer.
     * 
     */
    public Integer privateNetworkCount() {
        return this.privateNetworkCount;
    }
    /**
     * @return The ID of the project the load-balancer is associated with.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return Number of routes the Load balancer has.
     * 
     */
    public Integer routeCount() {
        return this.routeCount;
    }
    /**
     * @return Determines the minimal SSL version which needs to be supported on client side.
     * 
     */
    public String sslCompatibilityLevel() {
        return this.sslCompatibilityLevel;
    }
    /**
     * @return The state of the LB&#39;s instance. Possible values are: `unknown`, `ready`, `pending`, `stopped`, `error`, `locked` and `migrating`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The subscriber information.
     * 
     */
    public String subscriber() {
        return this.subscriber;
    }
    /**
     * @return The tags associated with the load-balancer.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return The offer type of the load-balancer.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Date at which the Load balancer was updated.
     * 
     */
    public String updatedAt() {
        return this.updatedAt;
    }
    /**
     * @return `zone`) The zone in which LBs exist.
     * 
     */
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLbsLb defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer backendCount;
        private String createdAt;
        private String description;
        private Integer frontendCount;
        private String id;
        private List<GetLbsLbInstance> instances;
        private List<GetLbsLbIp> ips;
        private String name;
        private String organizationId;
        private Integer privateNetworkCount;
        private String projectId;
        private Integer routeCount;
        private String sslCompatibilityLevel;
        private String status;
        private String subscriber;
        private List<String> tags;
        private String type;
        private String updatedAt;
        private String zone;
        public Builder() {}
        public Builder(GetLbsLb defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendCount = defaults.backendCount;
    	      this.createdAt = defaults.createdAt;
    	      this.description = defaults.description;
    	      this.frontendCount = defaults.frontendCount;
    	      this.id = defaults.id;
    	      this.instances = defaults.instances;
    	      this.ips = defaults.ips;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
    	      this.privateNetworkCount = defaults.privateNetworkCount;
    	      this.projectId = defaults.projectId;
    	      this.routeCount = defaults.routeCount;
    	      this.sslCompatibilityLevel = defaults.sslCompatibilityLevel;
    	      this.status = defaults.status;
    	      this.subscriber = defaults.subscriber;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.updatedAt = defaults.updatedAt;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder backendCount(Integer backendCount) {
            this.backendCount = Objects.requireNonNull(backendCount);
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder frontendCount(Integer frontendCount) {
            this.frontendCount = Objects.requireNonNull(frontendCount);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instances(List<GetLbsLbInstance> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }
        public Builder instances(GetLbsLbInstance... instances) {
            return instances(List.of(instances));
        }
        @CustomType.Setter
        public Builder ips(List<GetLbsLbIp> ips) {
            this.ips = Objects.requireNonNull(ips);
            return this;
        }
        public Builder ips(GetLbsLbIp... ips) {
            return ips(List.of(ips));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        @CustomType.Setter
        public Builder privateNetworkCount(Integer privateNetworkCount) {
            this.privateNetworkCount = Objects.requireNonNull(privateNetworkCount);
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder routeCount(Integer routeCount) {
            this.routeCount = Objects.requireNonNull(routeCount);
            return this;
        }
        @CustomType.Setter
        public Builder sslCompatibilityLevel(String sslCompatibilityLevel) {
            this.sslCompatibilityLevel = Objects.requireNonNull(sslCompatibilityLevel);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder subscriber(String subscriber) {
            this.subscriber = Objects.requireNonNull(subscriber);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }
        @CustomType.Setter
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public GetLbsLb build() {
            final var o = new GetLbsLb();
            o.backendCount = backendCount;
            o.createdAt = createdAt;
            o.description = description;
            o.frontendCount = frontendCount;
            o.id = id;
            o.instances = instances;
            o.ips = ips;
            o.name = name;
            o.organizationId = organizationId;
            o.privateNetworkCount = privateNetworkCount;
            o.projectId = projectId;
            o.routeCount = routeCount;
            o.sslCompatibilityLevel = sslCompatibilityLevel;
            o.status = status;
            o.subscriber = subscriber;
            o.tags = tags;
            o.type = type;
            o.updatedAt = updatedAt;
            o.zone = zone;
            return o;
        }
    }
}
