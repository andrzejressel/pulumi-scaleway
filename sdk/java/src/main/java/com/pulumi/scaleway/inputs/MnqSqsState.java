// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MnqSqsState extends com.pulumi.resources.ResourceArgs {

    public static final MnqSqsState Empty = new MnqSqsState();

    /**
     * The endpoint of the SQS service for this project.
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return The endpoint of the SQS service for this project.
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * `project_id`) The ID of the project the sqs will be enabled for.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the sqs will be enabled for.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * `region`). The region
     * in which sqs will be enabled.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return `region`). The region
     * in which sqs will be enabled.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private MnqSqsState() {}

    private MnqSqsState(MnqSqsState $) {
        this.endpoint = $.endpoint;
        this.projectId = $.projectId;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MnqSqsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MnqSqsState $;

        public Builder() {
            $ = new MnqSqsState();
        }

        public Builder(MnqSqsState defaults) {
            $ = new MnqSqsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpoint The endpoint of the SQS service for this project.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint The endpoint of the SQS service for this project.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param projectId `project_id`) The ID of the project the sqs will be enabled for.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId `project_id`) The ID of the project the sqs will be enabled for.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param region `region`). The region
         * in which sqs will be enabled.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region `region`). The region
         * in which sqs will be enabled.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public MnqSqsState build() {
            return $;
        }
    }

}
