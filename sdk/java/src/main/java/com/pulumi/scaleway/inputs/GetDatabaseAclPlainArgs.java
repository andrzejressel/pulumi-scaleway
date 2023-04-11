// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatabaseAclPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabaseAclPlainArgs Empty = new GetDatabaseAclPlainArgs();

    /**
     * The RDB instance ID.
     * 
     */
    @Import(name="instanceId", required=true)
    private String instanceId;

    /**
     * @return The RDB instance ID.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }

    /**
     * `region`) The region in which the Database Instance should be created.
     * 
     */
    @Import(name="region")
    private @Nullable String region;

    /**
     * @return `region`) The region in which the Database Instance should be created.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    private GetDatabaseAclPlainArgs() {}

    private GetDatabaseAclPlainArgs(GetDatabaseAclPlainArgs $) {
        this.instanceId = $.instanceId;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabaseAclPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabaseAclPlainArgs $;

        public Builder() {
            $ = new GetDatabaseAclPlainArgs();
        }

        public Builder(GetDatabaseAclPlainArgs defaults) {
            $ = new GetDatabaseAclPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceId The RDB instance ID.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param region `region`) The region in which the Database Instance should be created.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        public GetDatabaseAclPlainArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            return $;
        }
    }

}
