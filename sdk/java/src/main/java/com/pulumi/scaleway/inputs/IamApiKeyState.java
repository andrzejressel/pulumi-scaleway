// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IamApiKeyState extends com.pulumi.resources.ResourceArgs {

    public static final IamApiKeyState Empty = new IamApiKeyState();

    /**
     * The access key of the iam api key.
     * - `secret_key`: The secret Key of the iam api key.
     * 
     */
    @Import(name="accessKey")
    private @Nullable Output<String> accessKey;

    /**
     * @return The access key of the iam api key.
     * - `secret_key`: The secret Key of the iam api key.
     * 
     */
    public Optional<Output<String>> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }

    /**
     * ID of the application attached to the api key
     * 
     */
    @Import(name="applicationId")
    private @Nullable Output<String> applicationId;

    /**
     * @return ID of the application attached to the api key
     * 
     */
    public Optional<Output<String>> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    /**
     * The date and time of the creation of the iam api key.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return The date and time of the creation of the iam api key.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * The IP Address of the device which created the API key.
     * 
     */
    @Import(name="creationIp")
    private @Nullable Output<String> creationIp;

    /**
     * @return The IP Address of the device which created the API key.
     * 
     */
    public Optional<Output<String>> creationIp() {
        return Optional.ofNullable(this.creationIp);
    }

    /**
     * The default project ID to use with object storage.
     * 
     */
    @Import(name="defaultProjectId")
    private @Nullable Output<String> defaultProjectId;

    /**
     * @return The default project ID to use with object storage.
     * 
     */
    public Optional<Output<String>> defaultProjectId() {
        return Optional.ofNullable(this.defaultProjectId);
    }

    /**
     * The description of the iam api key
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the iam api key
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether the iam api key is editable.
     * 
     */
    @Import(name="editable")
    private @Nullable Output<Boolean> editable;

    /**
     * @return Whether the iam api key is editable.
     * 
     */
    public Optional<Output<Boolean>> editable() {
        return Optional.ofNullable(this.editable);
    }

    /**
     * The date and time of the expiration of the iam api key. Please note that in case of change,
     * the resource will be recreated.
     * 
     */
    @Import(name="expiresAt")
    private @Nullable Output<String> expiresAt;

    /**
     * @return The date and time of the expiration of the iam api key. Please note that in case of change,
     * the resource will be recreated.
     * 
     */
    public Optional<Output<String>> expiresAt() {
        return Optional.ofNullable(this.expiresAt);
    }

    /**
     * The secret Key of the iam api key
     * 
     */
    @Import(name="secretKey")
    private @Nullable Output<String> secretKey;

    /**
     * @return The secret Key of the iam api key
     * 
     */
    public Optional<Output<String>> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }

    /**
     * The date and time of the last update of the iam api key.
     * 
     */
    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    /**
     * @return The date and time of the last update of the iam api key.
     * 
     */
    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    /**
     * ID of the user attached to the api key.
     * Only one of the `application_id` and `user_id` should be specified.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return ID of the user attached to the api key.
     * Only one of the `application_id` and `user_id` should be specified.
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    private IamApiKeyState() {}

    private IamApiKeyState(IamApiKeyState $) {
        this.accessKey = $.accessKey;
        this.applicationId = $.applicationId;
        this.createdAt = $.createdAt;
        this.creationIp = $.creationIp;
        this.defaultProjectId = $.defaultProjectId;
        this.description = $.description;
        this.editable = $.editable;
        this.expiresAt = $.expiresAt;
        this.secretKey = $.secretKey;
        this.updatedAt = $.updatedAt;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IamApiKeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IamApiKeyState $;

        public Builder() {
            $ = new IamApiKeyState();
        }

        public Builder(IamApiKeyState defaults) {
            $ = new IamApiKeyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKey The access key of the iam api key.
         * - `secret_key`: The secret Key of the iam api key.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(@Nullable Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey The access key of the iam api key.
         * - `secret_key`: The secret Key of the iam api key.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        /**
         * @param applicationId ID of the application attached to the api key
         * 
         * @return builder
         * 
         */
        public Builder applicationId(@Nullable Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId ID of the application attached to the api key
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        /**
         * @param createdAt The date and time of the creation of the iam api key.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The date and time of the creation of the iam api key.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param creationIp The IP Address of the device which created the API key.
         * 
         * @return builder
         * 
         */
        public Builder creationIp(@Nullable Output<String> creationIp) {
            $.creationIp = creationIp;
            return this;
        }

        /**
         * @param creationIp The IP Address of the device which created the API key.
         * 
         * @return builder
         * 
         */
        public Builder creationIp(String creationIp) {
            return creationIp(Output.of(creationIp));
        }

        /**
         * @param defaultProjectId The default project ID to use with object storage.
         * 
         * @return builder
         * 
         */
        public Builder defaultProjectId(@Nullable Output<String> defaultProjectId) {
            $.defaultProjectId = defaultProjectId;
            return this;
        }

        /**
         * @param defaultProjectId The default project ID to use with object storage.
         * 
         * @return builder
         * 
         */
        public Builder defaultProjectId(String defaultProjectId) {
            return defaultProjectId(Output.of(defaultProjectId));
        }

        /**
         * @param description The description of the iam api key
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the iam api key
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param editable Whether the iam api key is editable.
         * 
         * @return builder
         * 
         */
        public Builder editable(@Nullable Output<Boolean> editable) {
            $.editable = editable;
            return this;
        }

        /**
         * @param editable Whether the iam api key is editable.
         * 
         * @return builder
         * 
         */
        public Builder editable(Boolean editable) {
            return editable(Output.of(editable));
        }

        /**
         * @param expiresAt The date and time of the expiration of the iam api key. Please note that in case of change,
         * the resource will be recreated.
         * 
         * @return builder
         * 
         */
        public Builder expiresAt(@Nullable Output<String> expiresAt) {
            $.expiresAt = expiresAt;
            return this;
        }

        /**
         * @param expiresAt The date and time of the expiration of the iam api key. Please note that in case of change,
         * the resource will be recreated.
         * 
         * @return builder
         * 
         */
        public Builder expiresAt(String expiresAt) {
            return expiresAt(Output.of(expiresAt));
        }

        /**
         * @param secretKey The secret Key of the iam api key
         * 
         * @return builder
         * 
         */
        public Builder secretKey(@Nullable Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        /**
         * @param secretKey The secret Key of the iam api key
         * 
         * @return builder
         * 
         */
        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
        }

        /**
         * @param updatedAt The date and time of the last update of the iam api key.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        /**
         * @param updatedAt The date and time of the last update of the iam api key.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        /**
         * @param userId ID of the user attached to the api key.
         * Only one of the `application_id` and `user_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId ID of the user attached to the api key.
         * Only one of the `application_id` and `user_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public IamApiKeyState build() {
            return $;
        }
    }

}
