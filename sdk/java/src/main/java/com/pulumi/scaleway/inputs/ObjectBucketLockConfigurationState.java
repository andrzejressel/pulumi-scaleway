// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scaleway.inputs.ObjectBucketLockConfigurationRuleArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObjectBucketLockConfigurationState extends com.pulumi.resources.ResourceArgs {

    public static final ObjectBucketLockConfigurationState Empty = new ObjectBucketLockConfigurationState();

    /**
     * The bucket name.
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    /**
     * @return The bucket name.
     * 
     */
    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * Specifies the Object Lock rule for the specified object.
     * 
     */
    @Import(name="rule")
    private @Nullable Output<ObjectBucketLockConfigurationRuleArgs> rule;

    /**
     * @return Specifies the Object Lock rule for the specified object.
     * 
     */
    public Optional<Output<ObjectBucketLockConfigurationRuleArgs>> rule() {
        return Optional.ofNullable(this.rule);
    }

    private ObjectBucketLockConfigurationState() {}

    private ObjectBucketLockConfigurationState(ObjectBucketLockConfigurationState $) {
        this.bucket = $.bucket;
        this.rule = $.rule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectBucketLockConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectBucketLockConfigurationState $;

        public Builder() {
            $ = new ObjectBucketLockConfigurationState();
        }

        public Builder(ObjectBucketLockConfigurationState defaults) {
            $ = new ObjectBucketLockConfigurationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The bucket name.
         * 
         * @return builder
         * 
         */
        public Builder bucket(@Nullable Output<String> bucket) {
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
         * @param rule Specifies the Object Lock rule for the specified object.
         * 
         * @return builder
         * 
         */
        public Builder rule(@Nullable Output<ObjectBucketLockConfigurationRuleArgs> rule) {
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

        public ObjectBucketLockConfigurationState build() {
            return $;
        }
    }

}
