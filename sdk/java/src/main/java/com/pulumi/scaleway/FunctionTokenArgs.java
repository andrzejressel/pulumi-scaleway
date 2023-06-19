// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionTokenArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionTokenArgs Empty = new FunctionTokenArgs();

    /**
     * The description of the token.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the token.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The expiration date of the token.
     * 
     */
    @Import(name="expiresAt")
    private @Nullable Output<String> expiresAt;

    /**
     * @return The expiration date of the token.
     * 
     */
    public Optional<Output<String>> expiresAt() {
        return Optional.ofNullable(this.expiresAt);
    }

    /**
     * The ID of the function.
     * 
     * &gt; Only one of `namespace_id` or `function_id` must be set.
     * 
     */
    @Import(name="functionId")
    private @Nullable Output<String> functionId;

    /**
     * @return The ID of the function.
     * 
     * &gt; Only one of `namespace_id` or `function_id` must be set.
     * 
     */
    public Optional<Output<String>> functionId() {
        return Optional.ofNullable(this.functionId);
    }

    /**
     * The ID of the function namespace.
     * 
     */
    @Import(name="namespaceId")
    private @Nullable Output<String> namespaceId;

    /**
     * @return The ID of the function namespace.
     * 
     */
    public Optional<Output<String>> namespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }

    /**
     * `region`). The region in which the namespace should be created.
     * 
     * &gt; **Important** Updates to any fields will recreate the token.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return `region`). The region in which the namespace should be created.
     * 
     * &gt; **Important** Updates to any fields will recreate the token.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private FunctionTokenArgs() {}

    private FunctionTokenArgs(FunctionTokenArgs $) {
        this.description = $.description;
        this.expiresAt = $.expiresAt;
        this.functionId = $.functionId;
        this.namespaceId = $.namespaceId;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionTokenArgs $;

        public Builder() {
            $ = new FunctionTokenArgs();
        }

        public Builder(FunctionTokenArgs defaults) {
            $ = new FunctionTokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the token.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the token.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param expiresAt The expiration date of the token.
         * 
         * @return builder
         * 
         */
        public Builder expiresAt(@Nullable Output<String> expiresAt) {
            $.expiresAt = expiresAt;
            return this;
        }

        /**
         * @param expiresAt The expiration date of the token.
         * 
         * @return builder
         * 
         */
        public Builder expiresAt(String expiresAt) {
            return expiresAt(Output.of(expiresAt));
        }

        /**
         * @param functionId The ID of the function.
         * 
         * &gt; Only one of `namespace_id` or `function_id` must be set.
         * 
         * @return builder
         * 
         */
        public Builder functionId(@Nullable Output<String> functionId) {
            $.functionId = functionId;
            return this;
        }

        /**
         * @param functionId The ID of the function.
         * 
         * &gt; Only one of `namespace_id` or `function_id` must be set.
         * 
         * @return builder
         * 
         */
        public Builder functionId(String functionId) {
            return functionId(Output.of(functionId));
        }

        /**
         * @param namespaceId The ID of the function namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(@Nullable Output<String> namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        /**
         * @param namespaceId The ID of the function namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(String namespaceId) {
            return namespaceId(Output.of(namespaceId));
        }

        /**
         * @param region `region`). The region in which the namespace should be created.
         * 
         * &gt; **Important** Updates to any fields will recreate the token.
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
         * &gt; **Important** Updates to any fields will recreate the token.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public FunctionTokenArgs build() {
            return $;
        }
    }

}
