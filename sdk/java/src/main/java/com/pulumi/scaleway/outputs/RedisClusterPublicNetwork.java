// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RedisClusterPublicNetwork {
    /**
     * @return The UUID of the private network resource.
     * 
     */
    private @Nullable String id;
    /**
     * @return Lis of IPv4 address of the endpoint (IP address).
     * 
     */
    private @Nullable List<String> ips;
    /**
     * @return TCP port of the endpoint.
     * 
     */
    private @Nullable Integer port;

    private RedisClusterPublicNetwork() {}
    /**
     * @return The UUID of the private network resource.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Lis of IPv4 address of the endpoint (IP address).
     * 
     */
    public List<String> ips() {
        return this.ips == null ? List.of() : this.ips;
    }
    /**
     * @return TCP port of the endpoint.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RedisClusterPublicNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private @Nullable List<String> ips;
        private @Nullable Integer port;
        public Builder() {}
        public Builder(RedisClusterPublicNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ips = defaults.ips;
    	      this.port = defaults.port;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ips(@Nullable List<String> ips) {
            this.ips = ips;
            return this;
        }
        public Builder ips(String... ips) {
            return ips(List.of(ips));
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public RedisClusterPublicNetwork build() {
            final var o = new RedisClusterPublicNetwork();
            o.id = id;
            o.ips = ips;
            o.port = port;
            return o;
        }
    }
}
