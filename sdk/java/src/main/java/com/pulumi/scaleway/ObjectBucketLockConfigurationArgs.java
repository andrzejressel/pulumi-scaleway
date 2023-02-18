// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scaleway.inputs.ObjectBucketLockConfigurationRuleArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObjectBucketLockConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectBucketLockConfigurationArgs Empty = new ObjectBucketLockConfigurationArgs();

    /**
     * The bucket name.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return The bucket name.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * The project_id you want to attach the resource to
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return The project_id you want to attach the resource to
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * The region you want to attach the resource to
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region you want to attach the resource to
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Specifies the Object Lock rule for the specified object.
     * 
     */
    @Import(name="rule", required=true)
    private Output<ObjectBucketLockConfigurationRuleArgs> rule;

    /**
     * @return Specifies the Object Lock rule for the specified object.
     * 
     */
    public Output<ObjectBucketLockConfigurationRuleArgs> rule() {
        return this.rule;
    }

    private ObjectBucketLockConfigurationArgs() {}

    private ObjectBucketLockConfigurationArgs(ObjectBucketLockConfigurationArgs $) {
        this.bucket = $.bucket;
        this.projectId = $.projectId;
        this.region = $.region;
        this.rule = $.rule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectBucketLockConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectBucketLockConfigurationArgs $;

        public Builder() {
            $ = new ObjectBucketLockConfigurationArgs();
        }

        public Builder(ObjectBucketLockConfigurationArgs defaults) {
            $ = new ObjectBucketLockConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The bucket name.
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The bucket name.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param projectId The project_id you want to attach the resource to
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The project_id you want to attach the resource to
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param region The region you want to attach the resource to
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region you want to attach the resource to
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param rule Specifies the Object Lock rule for the specified object.
         * 
         * @return builder
         * 
         */
        public Builder rule(Output<ObjectBucketLockConfigurationRuleArgs> rule) {
            $.rule = rule;
            return this;
        }

        /**
         * @param rule Specifies the Object Lock rule for the specified object.
         * 
         * @return builder
         * 
         */
        public Builder rule(ObjectBucketLockConfigurationRuleArgs rule) {
            return rule(Output.of(rule));
        }

        public ObjectBucketLockConfigurationArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.rule = Objects.requireNonNull($.rule, "expected parameter 'rule' to be non-null");
            return $;
        }
    }

}
