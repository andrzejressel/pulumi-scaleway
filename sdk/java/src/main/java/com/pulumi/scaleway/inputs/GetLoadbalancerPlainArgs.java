// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLoadbalancerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLoadbalancerPlainArgs Empty = new GetLoadbalancerPlainArgs();

    @Import(name="lbId")
    private @Nullable String lbId;

    public Optional<String> lbId() {
        return Optional.ofNullable(this.lbId);
    }

    /**
     * The load balancer name.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The load balancer name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="releaseIp")
    private @Nullable Boolean releaseIp;

    public Optional<Boolean> releaseIp() {
        return Optional.ofNullable(this.releaseIp);
    }

    /**
     * (Defaults to provider `zone`) The zone in which the LB exists.
     * 
     */
    @Import(name="zone")
    private @Nullable String zone;

    /**
     * @return (Defaults to provider `zone`) The zone in which the LB exists.
     * 
     */
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    private GetLoadbalancerPlainArgs() {}

    private GetLoadbalancerPlainArgs(GetLoadbalancerPlainArgs $) {
        this.lbId = $.lbId;
        this.name = $.name;
        this.releaseIp = $.releaseIp;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLoadbalancerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLoadbalancerPlainArgs $;

        public Builder() {
            $ = new GetLoadbalancerPlainArgs();
        }

        public Builder(GetLoadbalancerPlainArgs defaults) {
            $ = new GetLoadbalancerPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder lbId(@Nullable String lbId) {
            $.lbId = lbId;
            return this;
        }

        /**
         * @param name The load balancer name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder releaseIp(@Nullable Boolean releaseIp) {
            $.releaseIp = releaseIp;
            return this;
        }

        /**
         * @param zone (Defaults to provider `zone`) The zone in which the LB exists.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable String zone) {
            $.zone = zone;
            return this;
        }

        public GetLoadbalancerPlainArgs build() {
            return $;
        }
    }

}
