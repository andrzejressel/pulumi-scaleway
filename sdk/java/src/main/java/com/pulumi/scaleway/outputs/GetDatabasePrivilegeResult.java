// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDatabasePrivilegeResult {
    private String databaseName;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String instanceId;
    /**
     * @return The permission for this user on the database. Possible values are `readonly`, `readwrite`, `all`
     * , `custom` and `none`.
     * 
     */
    private String permission;
    private @Nullable String region;
    private String userName;

    private GetDatabasePrivilegeResult() {}
    public String databaseName() {
        return this.databaseName;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The permission for this user on the database. Possible values are `readonly`, `readwrite`, `all`
     * , `custom` and `none`.
     * 
     */
    public String permission() {
        return this.permission;
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    public String userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabasePrivilegeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String databaseName;
        private String id;
        private String instanceId;
        private String permission;
        private @Nullable String region;
        private String userName;
        public Builder() {}
        public Builder(GetDatabasePrivilegeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.permission = defaults.permission;
    	      this.region = defaults.region;
    	      this.userName = defaults.userName;
        }

        @CustomType.Setter
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder permission(String permission) {
            this.permission = Objects.requireNonNull(permission);
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public GetDatabasePrivilegeResult build() {
            final var o = new GetDatabasePrivilegeResult();
            o.databaseName = databaseName;
            o.id = id;
            o.instanceId = instanceId;
            o.permission = permission;
            o.region = region;
            o.userName = userName;
            return o;
        }
    }
}
