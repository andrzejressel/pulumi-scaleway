// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIpamIpResource {
    /**
     * @return The ID of the resource that the IP is bound to.
     * 
     */
    private @Nullable String id;
    /**
     * @return The type of the resource to get the IP from. [Documentation](https://pkg.go.dev/github.com/scaleway/scaleway-sdk-go@master/api/ipam/v1alpha1#pkg-constants) with type list.
     * 
     */
    private @Nullable String type;

    private GetIpamIpResource() {}
    /**
     * @return The ID of the resource that the IP is bound to.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The type of the resource to get the IP from. [Documentation](https://pkg.go.dev/github.com/scaleway/scaleway-sdk-go@master/api/ipam/v1alpha1#pkg-constants) with type list.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIpamIpResource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private @Nullable String type;
        public Builder() {}
        public Builder(GetIpamIpResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public GetIpamIpResource build() {
            final var o = new GetIpamIpResource();
            o.id = id;
            o.type = type;
            return o;
        }
    }
}
