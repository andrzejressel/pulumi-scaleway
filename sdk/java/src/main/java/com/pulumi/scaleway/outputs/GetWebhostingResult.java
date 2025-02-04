// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.scaleway.outputs.GetWebhostingCpanelUrl;
import com.pulumi.scaleway.outputs.GetWebhostingOption;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWebhostingResult {
    private List<GetWebhostingCpanelUrl> cpanelUrls;
    private String createdAt;
    private String dnsStatus;
    private @Nullable String domain;
    private String email;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String offerId;
    private String offerName;
    private List<String> optionIds;
    private List<GetWebhostingOption> options;
    private String organizationId;
    private String platformHostname;
    private Integer platformNumber;
    private @Nullable String projectId;
    private String region;
    private String status;
    private List<String> tags;
    private String updatedAt;
    private String username;
    private @Nullable String webhostingId;

    private GetWebhostingResult() {}
    public List<GetWebhostingCpanelUrl> cpanelUrls() {
        return this.cpanelUrls;
    }
    public String createdAt() {
        return this.createdAt;
    }
    public String dnsStatus() {
        return this.dnsStatus;
    }
    public Optional<String> domain() {
        return Optional.ofNullable(this.domain);
    }
    public String email() {
        return this.email;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String offerId() {
        return this.offerId;
    }
    public String offerName() {
        return this.offerName;
    }
    public List<String> optionIds() {
        return this.optionIds;
    }
    public List<GetWebhostingOption> options() {
        return this.options;
    }
    public String organizationId() {
        return this.organizationId;
    }
    public String platformHostname() {
        return this.platformHostname;
    }
    public Integer platformNumber() {
        return this.platformNumber;
    }
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    public String region() {
        return this.region;
    }
    public String status() {
        return this.status;
    }
    public List<String> tags() {
        return this.tags;
    }
    public String updatedAt() {
        return this.updatedAt;
    }
    public String username() {
        return this.username;
    }
    public Optional<String> webhostingId() {
        return Optional.ofNullable(this.webhostingId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebhostingResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetWebhostingCpanelUrl> cpanelUrls;
        private String createdAt;
        private String dnsStatus;
        private @Nullable String domain;
        private String email;
        private String id;
        private String offerId;
        private String offerName;
        private List<String> optionIds;
        private List<GetWebhostingOption> options;
        private String organizationId;
        private String platformHostname;
        private Integer platformNumber;
        private @Nullable String projectId;
        private String region;
        private String status;
        private List<String> tags;
        private String updatedAt;
        private String username;
        private @Nullable String webhostingId;
        public Builder() {}
        public Builder(GetWebhostingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpanelUrls = defaults.cpanelUrls;
    	      this.createdAt = defaults.createdAt;
    	      this.dnsStatus = defaults.dnsStatus;
    	      this.domain = defaults.domain;
    	      this.email = defaults.email;
    	      this.id = defaults.id;
    	      this.offerId = defaults.offerId;
    	      this.offerName = defaults.offerName;
    	      this.optionIds = defaults.optionIds;
    	      this.options = defaults.options;
    	      this.organizationId = defaults.organizationId;
    	      this.platformHostname = defaults.platformHostname;
    	      this.platformNumber = defaults.platformNumber;
    	      this.projectId = defaults.projectId;
    	      this.region = defaults.region;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.updatedAt = defaults.updatedAt;
    	      this.username = defaults.username;
    	      this.webhostingId = defaults.webhostingId;
        }

        @CustomType.Setter
        public Builder cpanelUrls(List<GetWebhostingCpanelUrl> cpanelUrls) {
            this.cpanelUrls = Objects.requireNonNull(cpanelUrls);
            return this;
        }
        public Builder cpanelUrls(GetWebhostingCpanelUrl... cpanelUrls) {
            return cpanelUrls(List.of(cpanelUrls));
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        @CustomType.Setter
        public Builder dnsStatus(String dnsStatus) {
            this.dnsStatus = Objects.requireNonNull(dnsStatus);
            return this;
        }
        @CustomType.Setter
        public Builder domain(@Nullable String domain) {
            this.domain = domain;
            return this;
        }
        @CustomType.Setter
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder offerId(String offerId) {
            this.offerId = Objects.requireNonNull(offerId);
            return this;
        }
        @CustomType.Setter
        public Builder offerName(String offerName) {
            this.offerName = Objects.requireNonNull(offerName);
            return this;
        }
        @CustomType.Setter
        public Builder optionIds(List<String> optionIds) {
            this.optionIds = Objects.requireNonNull(optionIds);
            return this;
        }
        public Builder optionIds(String... optionIds) {
            return optionIds(List.of(optionIds));
        }
        @CustomType.Setter
        public Builder options(List<GetWebhostingOption> options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }
        public Builder options(GetWebhostingOption... options) {
            return options(List.of(options));
        }
        @CustomType.Setter
        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        @CustomType.Setter
        public Builder platformHostname(String platformHostname) {
            this.platformHostname = Objects.requireNonNull(platformHostname);
            return this;
        }
        @CustomType.Setter
        public Builder platformNumber(Integer platformNumber) {
            this.platformNumber = Objects.requireNonNull(platformNumber);
            return this;
        }
        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        @CustomType.Setter
        public Builder webhostingId(@Nullable String webhostingId) {
            this.webhostingId = webhostingId;
            return this;
        }
        public GetWebhostingResult build() {
            final var o = new GetWebhostingResult();
            o.cpanelUrls = cpanelUrls;
            o.createdAt = createdAt;
            o.dnsStatus = dnsStatus;
            o.domain = domain;
            o.email = email;
            o.id = id;
            o.offerId = offerId;
            o.offerName = offerName;
            o.optionIds = optionIds;
            o.options = options;
            o.organizationId = organizationId;
            o.platformHostname = platformHostname;
            o.platformNumber = platformNumber;
            o.projectId = projectId;
            o.region = region;
            o.status = status;
            o.tags = tags;
            o.updatedAt = updatedAt;
            o.username = username;
            o.webhostingId = webhostingId;
            return o;
        }
    }
}
