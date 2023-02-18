// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MnqNamespaceState extends com.pulumi.resources.ResourceArgs {

    public static final MnqNamespaceState Empty = new MnqNamespaceState();

    /**
     * The date and time the Namespace was created.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return The date and time the Namespace was created.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * The endpoint of the service matching the Namespace protocol.
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return The endpoint of the service matching the Namespace protocol.
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * The unique name of the namespace.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The unique name of the namespace.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * `project_id`) The ID of the project the
     * namespace is associated with.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the
     * namespace is associated with.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * The protocol to apply on your namespace. Please check our
     * supported [protocols](https://pkg.go.dev/github.com/scaleway/scaleway-sdk-go@master/api/mnq/v1alpha1#pkg-constants).
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return The protocol to apply on your namespace. Please check our
     * supported [protocols](https://pkg.go.dev/github.com/scaleway/scaleway-sdk-go@master/api/mnq/v1alpha1#pkg-constants).
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * `region`). The region
     * in which the namespace should be created.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return `region`). The region
     * in which the namespace should be created.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The date and time the Namespace was updated.
     * 
     */
    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    /**
     * @return The date and time the Namespace was updated.
     * 
     */
    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    private MnqNamespaceState() {}

    private MnqNamespaceState(MnqNamespaceState $) {
        this.createdAt = $.createdAt;
        this.endpoint = $.endpoint;
        this.name = $.name;
        this.projectId = $.projectId;
        this.protocol = $.protocol;
        this.region = $.region;
        this.updatedAt = $.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MnqNamespaceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MnqNamespaceState $;

        public Builder() {
            $ = new MnqNamespaceState();
        }

        public Builder(MnqNamespaceState defaults) {
            $ = new MnqNamespaceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdAt The date and time the Namespace was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The date and time the Namespace was created.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param endpoint The endpoint of the service matching the Namespace protocol.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint The endpoint of the service matching the Namespace protocol.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param name The unique name of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique name of the namespace.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param projectId `project_id`) The ID of the project the
         * namespace is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId `project_id`) The ID of the project the
         * namespace is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param protocol The protocol to apply on your namespace. Please check our
         * supported [protocols](https://pkg.go.dev/github.com/scaleway/scaleway-sdk-go@master/api/mnq/v1alpha1#pkg-constants).
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The protocol to apply on your namespace. Please check our
         * supported [protocols](https://pkg.go.dev/github.com/scaleway/scaleway-sdk-go@master/api/mnq/v1alpha1#pkg-constants).
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param region `region`). The region
         * in which the namespace should be created.
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
         * in which the namespace should be created.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param updatedAt The date and time the Namespace was updated.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        /**
         * @param updatedAt The date and time the Namespace was updated.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        public MnqNamespaceState build() {
            return $;
        }
    }

}
