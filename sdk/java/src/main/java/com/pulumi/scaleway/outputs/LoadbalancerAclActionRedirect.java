// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoadbalancerAclActionRedirect {
    /**
     * @return The HTTP redirect code to use. Valid values are `301`, `302`, `303`, `307` and `308`.
     * 
     */
    private @Nullable Integer code;
    /**
     * @return An URL can be used in case of a location redirect (e.g. `https://scaleway.com` will redirect to this same URL). A scheme name (e.g. `https`, `http`, `ftp`, `git`) will replace the request&#39;s original scheme.
     * 
     */
    private @Nullable String target;
    /**
     * @return The redirect type. Possible values are: `location` or `scheme`.
     * 
     */
    private @Nullable String type;

    private LoadbalancerAclActionRedirect() {}
    /**
     * @return The HTTP redirect code to use. Valid values are `301`, `302`, `303`, `307` and `308`.
     * 
     */
    public Optional<Integer> code() {
        return Optional.ofNullable(this.code);
    }
    /**
     * @return An URL can be used in case of a location redirect (e.g. `https://scaleway.com` will redirect to this same URL). A scheme name (e.g. `https`, `http`, `ftp`, `git`) will replace the request&#39;s original scheme.
     * 
     */
    public Optional<String> target() {
        return Optional.ofNullable(this.target);
    }
    /**
     * @return The redirect type. Possible values are: `location` or `scheme`.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadbalancerAclActionRedirect defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer code;
        private @Nullable String target;
        private @Nullable String type;
        public Builder() {}
        public Builder(LoadbalancerAclActionRedirect defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.target = defaults.target;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder code(@Nullable Integer code) {
            this.code = code;
            return this;
        }
        @CustomType.Setter
        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public LoadbalancerAclActionRedirect build() {
            final var o = new LoadbalancerAclActionRedirect();
            o.code = code;
            o.target = target;
            o.type = type;
            return o;
        }
    }
}
