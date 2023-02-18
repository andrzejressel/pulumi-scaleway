// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LoadbalancerRouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadbalancerRouteArgs Empty = new LoadbalancerRouteArgs();

    /**
     * The ID of the backend to which the route is associated.
     * 
     */
    @Import(name="backendId", required=true)
    private Output<String> backendId;

    /**
     * @return The ID of the backend to which the route is associated.
     * 
     */
    public Output<String> backendId() {
        return this.backendId;
    }

    /**
     * The ID of the frontend to which the route is associated.
     * 
     */
    @Import(name="frontendId", required=true)
    private Output<String> frontendId;

    /**
     * @return The ID of the frontend to which the route is associated.
     * 
     */
    public Output<String> frontendId() {
        return this.frontendId;
    }

    /**
     * The SNI to match.
     * 
     */
    @Import(name="matchSni")
    private @Nullable Output<String> matchSni;

    /**
     * @return The SNI to match.
     * 
     */
    public Optional<Output<String>> matchSni() {
        return Optional.ofNullable(this.matchSni);
    }

    private LoadbalancerRouteArgs() {}

    private LoadbalancerRouteArgs(LoadbalancerRouteArgs $) {
        this.backendId = $.backendId;
        this.frontendId = $.frontendId;
        this.matchSni = $.matchSni;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadbalancerRouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadbalancerRouteArgs $;

        public Builder() {
            $ = new LoadbalancerRouteArgs();
        }

        public Builder(LoadbalancerRouteArgs defaults) {
            $ = new LoadbalancerRouteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendId The ID of the backend to which the route is associated.
         * 
         * @return builder
         * 
         */
        public Builder backendId(Output<String> backendId) {
            $.backendId = backendId;
            return this;
        }

        /**
         * @param backendId The ID of the backend to which the route is associated.
         * 
         * @return builder
         * 
         */
        public Builder backendId(String backendId) {
            return backendId(Output.of(backendId));
        }

        /**
         * @param frontendId The ID of the frontend to which the route is associated.
         * 
         * @return builder
         * 
         */
        public Builder frontendId(Output<String> frontendId) {
            $.frontendId = frontendId;
            return this;
        }

        /**
         * @param frontendId The ID of the frontend to which the route is associated.
         * 
         * @return builder
         * 
         */
        public Builder frontendId(String frontendId) {
            return frontendId(Output.of(frontendId));
        }

        /**
         * @param matchSni The SNI to match.
         * 
         * @return builder
         * 
         */
        public Builder matchSni(@Nullable Output<String> matchSni) {
            $.matchSni = matchSni;
            return this;
        }

        /**
         * @param matchSni The SNI to match.
         * 
         * @return builder
         * 
         */
        public Builder matchSni(String matchSni) {
            return matchSni(Output.of(matchSni));
        }

        public LoadbalancerRouteArgs build() {
            $.backendId = Objects.requireNonNull($.backendId, "expected parameter 'backendId' to be non-null");
            $.frontendId = Objects.requireNonNull($.frontendId, "expected parameter 'frontendId' to be non-null");
            return $;
        }
    }

}
