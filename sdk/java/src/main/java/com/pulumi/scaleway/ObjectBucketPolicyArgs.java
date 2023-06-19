// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ObjectBucketPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectBucketPolicyArgs Empty = new ObjectBucketPolicyArgs();

    /**
     * The name of the bucket.
     * 
     */
    @Import(name="bucket", required=true)
    private Output<String> bucket;

    /**
     * @return The name of the bucket.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * The text of the policy.
     * 
     */
    @Import(name="policy", required=true)
    private Output<String> policy;

    /**
     * @return The text of the policy.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }

    /**
     * `project_id`) The ID of the project the bucket is associated with.
     * 
     * &gt; **Important:** The aws_iam_policy_document data source may be used, so long as it specifies a principal.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the bucket is associated with.
     * 
     * &gt; **Important:** The aws_iam_policy_document data source may be used, so long as it specifies a principal.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * The Scaleway region this bucket resides in.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The Scaleway region this bucket resides in.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private ObjectBucketPolicyArgs() {}

    private ObjectBucketPolicyArgs(ObjectBucketPolicyArgs $) {
        this.bucket = $.bucket;
        this.policy = $.policy;
        this.projectId = $.projectId;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectBucketPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectBucketPolicyArgs $;

        public Builder() {
            $ = new ObjectBucketPolicyArgs();
        }

        public Builder(ObjectBucketPolicyArgs defaults) {
            $ = new ObjectBucketPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucket(Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param policy The text of the policy.
         * 
         * @return builder
         * 
         */
        public Builder policy(Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy The text of the policy.
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param projectId `project_id`) The ID of the project the bucket is associated with.
         * 
         * &gt; **Important:** The aws_iam_policy_document data source may be used, so long as it specifies a principal.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId `project_id`) The ID of the project the bucket is associated with.
         * 
         * &gt; **Important:** The aws_iam_policy_document data source may be used, so long as it specifies a principal.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param region The Scaleway region this bucket resides in.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The Scaleway region this bucket resides in.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public ObjectBucketPolicyArgs build() {
            $.bucket = Objects.requireNonNull($.bucket, "expected parameter 'bucket' to be non-null");
            $.policy = Objects.requireNonNull($.policy, "expected parameter 'policy' to be non-null");
            return $;
        }
    }

}
