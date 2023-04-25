// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadbalancerFrontendAclActionRedirectArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadbalancerFrontendAclActionRedirectArgs Empty = new LoadbalancerFrontendAclActionRedirectArgs();

    /**
     * The HTTP redirect code to use. Valid values are `301`, `302`, `303`, `307` and `308`.
     * 
     */
    @Import(name="code")
    private @Nullable Output<Integer> code;

    /**
     * @return The HTTP redirect code to use. Valid values are `301`, `302`, `303`, `307` and `308`.
     * 
     */
    public Optional<Output<Integer>> code() {
        return Optional.ofNullable(this.code);
    }

    /**
     * An URL can be used in case of a location redirect (e.g. `https://scaleway.com` will redirect to this same URL). A scheme name (e.g. `https`, `http`, `ftp`, `git`) will replace the request&#39;s original scheme.
     * 
     */
    @Import(name="target")
    private @Nullable Output<String> target;

    /**
     * @return An URL can be used in case of a location redirect (e.g. `https://scaleway.com` will redirect to this same URL). A scheme name (e.g. `https`, `http`, `ftp`, `git`) will replace the request&#39;s original scheme.
     * 
     */
    public Optional<Output<String>> target() {
        return Optional.ofNullable(this.target);
    }

    /**
     * The redirect type. Possible values are: `location` or `scheme`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The redirect type. Possible values are: `location` or `scheme`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private LoadbalancerFrontendAclActionRedirectArgs() {}

    private LoadbalancerFrontendAclActionRedirectArgs(LoadbalancerFrontendAclActionRedirectArgs $) {
        this.code = $.code;
        this.target = $.target;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadbalancerFrontendAclActionRedirectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadbalancerFrontendAclActionRedirectArgs $;

        public Builder() {
            $ = new LoadbalancerFrontendAclActionRedirectArgs();
        }

        public Builder(LoadbalancerFrontendAclActionRedirectArgs defaults) {
            $ = new LoadbalancerFrontendAclActionRedirectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param code The HTTP redirect code to use. Valid values are `301`, `302`, `303`, `307` and `308`.
         * 
         * @return builder
         * 
         */
        public Builder code(@Nullable Output<Integer> code) {
            $.code = code;
            return this;
        }

        /**
         * @param code The HTTP redirect code to use. Valid values are `301`, `302`, `303`, `307` and `308`.
         * 
         * @return builder
         * 
         */
        public Builder code(Integer code) {
            return code(Output.of(code));
        }

        /**
         * @param target An URL can be used in case of a location redirect (e.g. `https://scaleway.com` will redirect to this same URL). A scheme name (e.g. `https`, `http`, `ftp`, `git`) will replace the request&#39;s original scheme.
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target An URL can be used in case of a location redirect (e.g. `https://scaleway.com` will redirect to this same URL). A scheme name (e.g. `https`, `http`, `ftp`, `git`) will replace the request&#39;s original scheme.
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        /**
         * @param type The redirect type. Possible values are: `location` or `scheme`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The redirect type. Possible values are: `location` or `scheme`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public LoadbalancerFrontendAclActionRedirectArgs build() {
            return $;
        }
    }

}
