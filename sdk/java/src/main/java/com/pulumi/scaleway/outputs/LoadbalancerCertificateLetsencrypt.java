// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class LoadbalancerCertificateLetsencrypt {
    /**
     * @return Main domain of the certificate. A new certificate will be created if this field is changed.
     * 
     */
    private String commonName;
    /**
     * @return Array of alternative domain names.  A new certificate will be created if this field is changed.
     * 
     * &gt; **Important:** Updates to `letsencrypt` will recreate the load-balancer certificate.
     * 
     */
    private @Nullable List<String> subjectAlternativeNames;

    private LoadbalancerCertificateLetsencrypt() {}
    /**
     * @return Main domain of the certificate. A new certificate will be created if this field is changed.
     * 
     */
    public String commonName() {
        return this.commonName;
    }
    /**
     * @return Array of alternative domain names.  A new certificate will be created if this field is changed.
     * 
     * &gt; **Important:** Updates to `letsencrypt` will recreate the load-balancer certificate.
     * 
     */
    public List<String> subjectAlternativeNames() {
        return this.subjectAlternativeNames == null ? List.of() : this.subjectAlternativeNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadbalancerCertificateLetsencrypt defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String commonName;
        private @Nullable List<String> subjectAlternativeNames;
        public Builder() {}
        public Builder(LoadbalancerCertificateLetsencrypt defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonName = defaults.commonName;
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
        }

        @CustomType.Setter
        public Builder commonName(String commonName) {
            this.commonName = Objects.requireNonNull(commonName);
            return this;
        }
        @CustomType.Setter
        public Builder subjectAlternativeNames(@Nullable List<String> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }
        public Builder subjectAlternativeNames(String... subjectAlternativeNames) {
            return subjectAlternativeNames(List.of(subjectAlternativeNames));
        }
        public LoadbalancerCertificateLetsencrypt build() {
            final var o = new LoadbalancerCertificateLetsencrypt();
            o.commonName = commonName;
            o.subjectAlternativeNames = subjectAlternativeNames;
            return o;
        }
    }
}
