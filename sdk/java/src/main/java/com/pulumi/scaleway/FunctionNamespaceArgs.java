// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionNamespaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionNamespaceArgs Empty = new FunctionNamespaceArgs();

    /**
     * The description of the namespace.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the namespace.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The environment variables of the namespace.
     * 
     */
    @Import(name="environmentVariables")
    private @Nullable Output<Map<String,String>> environmentVariables;

    /**
     * @return The environment variables of the namespace.
     * 
     */
    public Optional<Output<Map<String,String>>> environmentVariables() {
        return Optional.ofNullable(this.environmentVariables);
    }

    /**
     * The unique name of the function namespace.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The unique name of the function namespace.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * `project_id`) The ID of the project the namespace is associated with.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the namespace is associated with.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * `region`). The region in which the namespace should be created.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return `region`). The region in which the namespace should be created.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The [secret environment](https://www.scaleway.com/en/docs/compute/containers/concepts/#secrets) variables of the namespace.
     * 
     */
    @Import(name="secretEnvironmentVariables")
    private @Nullable Output<Map<String,String>> secretEnvironmentVariables;

    /**
     * @return The [secret environment](https://www.scaleway.com/en/docs/compute/containers/concepts/#secrets) variables of the namespace.
     * 
     */
    public Optional<Output<Map<String,String>>> secretEnvironmentVariables() {
        return Optional.ofNullable(this.secretEnvironmentVariables);
    }

    private FunctionNamespaceArgs() {}

    private FunctionNamespaceArgs(FunctionNamespaceArgs $) {
        this.description = $.description;
        this.environmentVariables = $.environmentVariables;
        this.name = $.name;
        this.projectId = $.projectId;
        this.region = $.region;
        this.secretEnvironmentVariables = $.secretEnvironmentVariables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionNamespaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionNamespaceArgs $;

        public Builder() {
            $ = new FunctionNamespaceArgs();
        }

        public Builder(FunctionNamespaceArgs defaults) {
            $ = new FunctionNamespaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param environmentVariables The environment variables of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(@Nullable Output<Map<String,String>> environmentVariables) {
            $.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * @param environmentVariables The environment variables of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(Map<String,String> environmentVariables) {
            return environmentVariables(Output.of(environmentVariables));
        }

        /**
         * @param name The unique name of the function namespace.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique name of the function namespace.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param projectId `project_id`) The ID of the project the namespace is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId `project_id`) The ID of the project the namespace is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param region `region`). The region in which the namespace should be created.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region `region`). The region in which the namespace should be created.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param secretEnvironmentVariables The [secret environment](https://www.scaleway.com/en/docs/compute/containers/concepts/#secrets) variables of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder secretEnvironmentVariables(@Nullable Output<Map<String,String>> secretEnvironmentVariables) {
            $.secretEnvironmentVariables = secretEnvironmentVariables;
            return this;
        }

        /**
         * @param secretEnvironmentVariables The [secret environment](https://www.scaleway.com/en/docs/compute/containers/concepts/#secrets) variables of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder secretEnvironmentVariables(Map<String,String> secretEnvironmentVariables) {
            return secretEnvironmentVariables(Output.of(secretEnvironmentVariables));
        }

        public FunctionNamespaceArgs build() {
            return $;
        }
    }

}
