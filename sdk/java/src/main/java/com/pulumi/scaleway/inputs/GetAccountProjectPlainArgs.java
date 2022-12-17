// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAccountProjectPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountProjectPlainArgs Empty = new GetAccountProjectPlainArgs();

    /**
     * The name of the Project.
     * Only one of the `name` and `project_id` should be specified.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the Project.
     * Only one of the `name` and `project_id` should be specified.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The organization ID the Project is associated with.
     * If no default organization_id is set, one must be set explicitly in this datasource
     * 
     */
    @Import(name="organizationId")
    private @Nullable String organizationId;

    /**
     * @return The organization ID the Project is associated with.
     * If no default organization_id is set, one must be set explicitly in this datasource
     * 
     */
    public Optional<String> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    /**
     * The ID of the Project.
     * Only one of the `name` and `project_id` should be specified.
     * 
     */
    @Import(name="projectId")
    private @Nullable String projectId;

    /**
     * @return The ID of the Project.
     * Only one of the `name` and `project_id` should be specified.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private GetAccountProjectPlainArgs() {}

    private GetAccountProjectPlainArgs(GetAccountProjectPlainArgs $) {
        this.name = $.name;
        this.organizationId = $.organizationId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountProjectPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountProjectPlainArgs $;

        public Builder() {
            $ = new GetAccountProjectPlainArgs();
        }

        public Builder(GetAccountProjectPlainArgs defaults) {
            $ = new GetAccountProjectPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Project.
         * Only one of the `name` and `project_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param organizationId The organization ID the Project is associated with.
         * If no default organization_id is set, one must be set explicitly in this datasource
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param projectId The ID of the Project.
         * Only one of the `name` and `project_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetAccountProjectPlainArgs build() {
            return $;
        }
    }

}
