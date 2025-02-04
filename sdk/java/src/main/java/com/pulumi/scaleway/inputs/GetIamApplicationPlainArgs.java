// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIamApplicationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIamApplicationPlainArgs Empty = new GetIamApplicationPlainArgs();

    /**
     * The ID of the IAM application.
     * Only one of the `name` and `application_id` should be specified.
     * 
     */
    @Import(name="applicationId")
    private @Nullable String applicationId;

    /**
     * @return The ID of the IAM application.
     * Only one of the `name` and `application_id` should be specified.
     * 
     */
    public Optional<String> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    /**
     * The name of the IAM application.
     * Only one of the `name` and `application_id` should be specified.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the IAM application.
     * Only one of the `name` and `application_id` should be specified.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * `organization_id`) The ID of the
     * organization the application is associated with.
     * 
     */
    @Import(name="organizationId")
    private @Nullable String organizationId;

    /**
     * @return `organization_id`) The ID of the
     * organization the application is associated with.
     * 
     */
    public Optional<String> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    private GetIamApplicationPlainArgs() {}

    private GetIamApplicationPlainArgs(GetIamApplicationPlainArgs $) {
        this.applicationId = $.applicationId;
        this.name = $.name;
        this.organizationId = $.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIamApplicationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIamApplicationPlainArgs $;

        public Builder() {
            $ = new GetIamApplicationPlainArgs();
        }

        public Builder(GetIamApplicationPlainArgs defaults) {
            $ = new GetIamApplicationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationId The ID of the IAM application.
         * Only one of the `name` and `application_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(@Nullable String applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param name The name of the IAM application.
         * Only one of the `name` and `application_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param organizationId `organization_id`) The ID of the
         * organization the application is associated with.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public GetIamApplicationPlainArgs build() {
            return $;
        }
    }

}
