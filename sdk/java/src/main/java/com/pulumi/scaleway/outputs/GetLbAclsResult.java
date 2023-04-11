// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.scaleway.outputs.GetLbAclsAcl;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLbAclsResult {
    /**
     * @return List of found ACLs
     * 
     */
    private List<GetLbAclsAcl> acls;
    private String frontendId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String name;
    private String organizationId;
    private String projectId;
    private String zone;

    private GetLbAclsResult() {}
    /**
     * @return List of found ACLs
     * 
     */
    public List<GetLbAclsAcl> acls() {
        return this.acls;
    }
    public String frontendId() {
        return this.frontendId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public String organizationId() {
        return this.organizationId;
    }
    public String projectId() {
        return this.projectId;
    }
    public String zone() {
        return this.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLbAclsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetLbAclsAcl> acls;
        private String frontendId;
        private String id;
        private @Nullable String name;
        private String organizationId;
        private String projectId;
        private String zone;
        public Builder() {}
        public Builder(GetLbAclsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acls = defaults.acls;
    	      this.frontendId = defaults.frontendId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
    	      this.projectId = defaults.projectId;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder acls(List<GetLbAclsAcl> acls) {
            this.acls = Objects.requireNonNull(acls);
            return this;
        }
        public Builder acls(GetLbAclsAcl... acls) {
            return acls(List.of(acls));
        }
        @CustomType.Setter
        public Builder frontendId(String frontendId) {
            this.frontendId = Objects.requireNonNull(frontendId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public GetLbAclsResult build() {
            final var o = new GetLbAclsResult();
            o.acls = acls;
            o.frontendId = frontendId;
            o.id = id;
            o.name = name;
            o.organizationId = organizationId;
            o.projectId = projectId;
            o.zone = zone;
            return o;
        }
    }
}
