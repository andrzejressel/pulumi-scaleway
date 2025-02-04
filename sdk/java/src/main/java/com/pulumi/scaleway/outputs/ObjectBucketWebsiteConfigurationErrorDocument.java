// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ObjectBucketWebsiteConfigurationErrorDocument {
    private String key;

    private ObjectBucketWebsiteConfigurationErrorDocument() {}
    public String key() {
        return this.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectBucketWebsiteConfigurationErrorDocument defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        public Builder() {}
        public Builder(ObjectBucketWebsiteConfigurationErrorDocument defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
        }

        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public ObjectBucketWebsiteConfigurationErrorDocument build() {
            final var o = new ObjectBucketWebsiteConfigurationErrorDocument();
            o.key = key;
            return o;
        }
    }
}
