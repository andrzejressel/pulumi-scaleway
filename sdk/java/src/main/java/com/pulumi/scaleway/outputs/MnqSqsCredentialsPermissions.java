// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MnqSqsCredentialsPermissions {
    /**
     * @return . Defines if user can manage the associated resource(s).
     * 
     */
    private @Nullable Boolean canManage;
    /**
     * @return . Defines if user can publish messages to the service.
     * 
     */
    private @Nullable Boolean canPublish;
    /**
     * @return . Defines if user can receive messages from the service.
     * 
     */
    private @Nullable Boolean canReceive;

    private MnqSqsCredentialsPermissions() {}
    /**
     * @return . Defines if user can manage the associated resource(s).
     * 
     */
    public Optional<Boolean> canManage() {
        return Optional.ofNullable(this.canManage);
    }
    /**
     * @return . Defines if user can publish messages to the service.
     * 
     */
    public Optional<Boolean> canPublish() {
        return Optional.ofNullable(this.canPublish);
    }
    /**
     * @return . Defines if user can receive messages from the service.
     * 
     */
    public Optional<Boolean> canReceive() {
        return Optional.ofNullable(this.canReceive);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MnqSqsCredentialsPermissions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean canManage;
        private @Nullable Boolean canPublish;
        private @Nullable Boolean canReceive;
        public Builder() {}
        public Builder(MnqSqsCredentialsPermissions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canManage = defaults.canManage;
    	      this.canPublish = defaults.canPublish;
    	      this.canReceive = defaults.canReceive;
        }

        @CustomType.Setter
        public Builder canManage(@Nullable Boolean canManage) {
            this.canManage = canManage;
            return this;
        }
        @CustomType.Setter
        public Builder canPublish(@Nullable Boolean canPublish) {
            this.canPublish = canPublish;
            return this;
        }
        @CustomType.Setter
        public Builder canReceive(@Nullable Boolean canReceive) {
            this.canReceive = canReceive;
            return this;
        }
        public MnqSqsCredentialsPermissions build() {
            final var o = new MnqSqsCredentialsPermissions();
            o.canManage = canManage;
            o.canPublish = canPublish;
            o.canReceive = canReceive;
            return o;
        }
    }
}
