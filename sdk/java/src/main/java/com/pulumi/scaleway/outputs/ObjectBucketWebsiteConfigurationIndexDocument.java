// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ObjectBucketWebsiteConfigurationIndexDocument {
    private String suffix;

    private ObjectBucketWebsiteConfigurationIndexDocument() {}
    public String suffix() {
        return this.suffix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectBucketWebsiteConfigurationIndexDocument defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String suffix;
        public Builder() {}
        public Builder(ObjectBucketWebsiteConfigurationIndexDocument defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.suffix = defaults.suffix;
        }

        @CustomType.Setter
        public Builder suffix(String suffix) {
            this.suffix = Objects.requireNonNull(suffix);
            return this;
        }
        public ObjectBucketWebsiteConfigurationIndexDocument build() {
            final var o = new ObjectBucketWebsiteConfigurationIndexDocument();
            o.suffix = suffix;
            return o;
        }
    }
}
