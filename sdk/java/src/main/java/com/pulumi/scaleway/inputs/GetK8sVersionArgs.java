// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetK8sVersionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetK8sVersionArgs Empty = new GetK8sVersionArgs();

    /**
     * The name of the Kubernetes version.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the Kubernetes version.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * `region`) The region in which the version exists.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return `region`) The region in which the version exists.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private GetK8sVersionArgs() {}

    private GetK8sVersionArgs(GetK8sVersionArgs $) {
        this.name = $.name;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetK8sVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetK8sVersionArgs $;

        public Builder() {
            $ = new GetK8sVersionArgs();
        }

        public Builder(GetK8sVersionArgs defaults) {
            $ = new GetK8sVersionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Kubernetes version.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Kubernetes version.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param region `region`) The region in which the version exists.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region `region`) The region in which the version exists.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public GetK8sVersionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
