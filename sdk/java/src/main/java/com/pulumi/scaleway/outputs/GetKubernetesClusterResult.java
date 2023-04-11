// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.scaleway.outputs.GetKubernetesClusterAutoUpgrade;
import com.pulumi.scaleway.outputs.GetKubernetesClusterAutoscalerConfig;
import com.pulumi.scaleway.outputs.GetKubernetesClusterKubeconfig;
import com.pulumi.scaleway.outputs.GetKubernetesClusterOpenIdConnectConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetKubernetesClusterResult {
    /**
     * @return The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) enabled on the cluster.
     * 
     */
    private List<String> admissionPlugins;
    private List<String> apiserverCertSans;
    /**
     * @return The URL of the Kubernetes API server.
     * 
     */
    private String apiserverUrl;
    /**
     * @return The auto upgrade configuration.
     * 
     */
    private List<GetKubernetesClusterAutoUpgrade> autoUpgrades;
    /**
     * @return The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
     * 
     */
    private List<GetKubernetesClusterAutoscalerConfig> autoscalerConfigs;
    private @Nullable String clusterId;
    /**
     * @return The Container Network Interface (CNI) for the Kubernetes cluster.
     * 
     */
    private String cni;
    /**
     * @return The creation date of the cluster.
     * 
     */
    private String createdAt;
    /**
     * @return A description for the Kubernetes cluster.
     * 
     */
    private String description;
    /**
     * @return The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) enabled on the cluster.
     * 
     */
    private List<String> featureGates;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<GetKubernetesClusterKubeconfig> kubeconfigs;
    private @Nullable String name;
    private List<GetKubernetesClusterOpenIdConnectConfig> openIdConnectConfigs;
    /**
     * @return The ID of the organization the cluster is associated with.
     * 
     */
    private String organizationId;
    /**
     * @return The ID of the private network of the cluster.
     * 
     */
    private String privateNetworkId;
    /**
     * @return The ID of the project the cluster is associated with.
     * 
     */
    private String projectId;
    /**
     * @return The region in which the cluster is.
     * 
     */
    private @Nullable String region;
    /**
     * @return The status of the Kubernetes cluster.
     * 
     */
    private String status;
    /**
     * @return The tags associated with the Kubernetes cluster.
     * 
     */
    private List<String> tags;
    /**
     * @return The type of the Kubernetes cluster.
     * 
     */
    private String type;
    /**
     * @return The last update date of the cluster.
     * 
     */
    private String updatedAt;
    /**
     * @return True if a newer Kubernetes version is available.
     * 
     */
    private Boolean upgradeAvailable;
    /**
     * @return The version of the Kubernetes cluster.
     * 
     */
    private String version;
    /**
     * @return The DNS wildcard that points to all ready nodes.
     * 
     */
    private String wildcardDns;

    private GetKubernetesClusterResult() {}
    /**
     * @return The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) enabled on the cluster.
     * 
     */
    public List<String> admissionPlugins() {
        return this.admissionPlugins;
    }
    public List<String> apiserverCertSans() {
        return this.apiserverCertSans;
    }
    /**
     * @return The URL of the Kubernetes API server.
     * 
     */
    public String apiserverUrl() {
        return this.apiserverUrl;
    }
    /**
     * @return The auto upgrade configuration.
     * 
     */
    public List<GetKubernetesClusterAutoUpgrade> autoUpgrades() {
        return this.autoUpgrades;
    }
    /**
     * @return The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
     * 
     */
    public List<GetKubernetesClusterAutoscalerConfig> autoscalerConfigs() {
        return this.autoscalerConfigs;
    }
    public Optional<String> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }
    /**
     * @return The Container Network Interface (CNI) for the Kubernetes cluster.
     * 
     */
    public String cni() {
        return this.cni;
    }
    /**
     * @return The creation date of the cluster.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return A description for the Kubernetes cluster.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) enabled on the cluster.
     * 
     */
    public List<String> featureGates() {
        return this.featureGates;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetKubernetesClusterKubeconfig> kubeconfigs() {
        return this.kubeconfigs;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public List<GetKubernetesClusterOpenIdConnectConfig> openIdConnectConfigs() {
        return this.openIdConnectConfigs;
    }
    /**
     * @return The ID of the organization the cluster is associated with.
     * 
     */
    public String organizationId() {
        return this.organizationId;
    }
    /**
     * @return The ID of the private network of the cluster.
     * 
     */
    public String privateNetworkId() {
        return this.privateNetworkId;
    }
    /**
     * @return The ID of the project the cluster is associated with.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return The region in which the cluster is.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return The status of the Kubernetes cluster.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The tags associated with the Kubernetes cluster.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return The type of the Kubernetes cluster.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The last update date of the cluster.
     * 
     */
    public String updatedAt() {
        return this.updatedAt;
    }
    /**
     * @return True if a newer Kubernetes version is available.
     * 
     */
    public Boolean upgradeAvailable() {
        return this.upgradeAvailable;
    }
    /**
     * @return The version of the Kubernetes cluster.
     * 
     */
    public String version() {
        return this.version;
    }
    /**
     * @return The DNS wildcard that points to all ready nodes.
     * 
     */
    public String wildcardDns() {
        return this.wildcardDns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesClusterResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> admissionPlugins;
        private List<String> apiserverCertSans;
        private String apiserverUrl;
        private List<GetKubernetesClusterAutoUpgrade> autoUpgrades;
        private List<GetKubernetesClusterAutoscalerConfig> autoscalerConfigs;
        private @Nullable String clusterId;
        private String cni;
        private String createdAt;
        private String description;
        private List<String> featureGates;
        private String id;
        private List<GetKubernetesClusterKubeconfig> kubeconfigs;
        private @Nullable String name;
        private List<GetKubernetesClusterOpenIdConnectConfig> openIdConnectConfigs;
        private String organizationId;
        private String privateNetworkId;
        private String projectId;
        private @Nullable String region;
        private String status;
        private List<String> tags;
        private String type;
        private String updatedAt;
        private Boolean upgradeAvailable;
        private String version;
        private String wildcardDns;
        public Builder() {}
        public Builder(GetKubernetesClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.admissionPlugins = defaults.admissionPlugins;
    	      this.apiserverCertSans = defaults.apiserverCertSans;
    	      this.apiserverUrl = defaults.apiserverUrl;
    	      this.autoUpgrades = defaults.autoUpgrades;
    	      this.autoscalerConfigs = defaults.autoscalerConfigs;
    	      this.clusterId = defaults.clusterId;
    	      this.cni = defaults.cni;
    	      this.createdAt = defaults.createdAt;
    	      this.description = defaults.description;
    	      this.featureGates = defaults.featureGates;
    	      this.id = defaults.id;
    	      this.kubeconfigs = defaults.kubeconfigs;
    	      this.name = defaults.name;
    	      this.openIdConnectConfigs = defaults.openIdConnectConfigs;
    	      this.organizationId = defaults.organizationId;
    	      this.privateNetworkId = defaults.privateNetworkId;
    	      this.projectId = defaults.projectId;
    	      this.region = defaults.region;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.updatedAt = defaults.updatedAt;
    	      this.upgradeAvailable = defaults.upgradeAvailable;
    	      this.version = defaults.version;
    	      this.wildcardDns = defaults.wildcardDns;
        }

        @CustomType.Setter
        public Builder admissionPlugins(List<String> admissionPlugins) {
            this.admissionPlugins = Objects.requireNonNull(admissionPlugins);
            return this;
        }
        public Builder admissionPlugins(String... admissionPlugins) {
            return admissionPlugins(List.of(admissionPlugins));
        }
        @CustomType.Setter
        public Builder apiserverCertSans(List<String> apiserverCertSans) {
            this.apiserverCertSans = Objects.requireNonNull(apiserverCertSans);
            return this;
        }
        public Builder apiserverCertSans(String... apiserverCertSans) {
            return apiserverCertSans(List.of(apiserverCertSans));
        }
        @CustomType.Setter
        public Builder apiserverUrl(String apiserverUrl) {
            this.apiserverUrl = Objects.requireNonNull(apiserverUrl);
            return this;
        }
        @CustomType.Setter
        public Builder autoUpgrades(List<GetKubernetesClusterAutoUpgrade> autoUpgrades) {
            this.autoUpgrades = Objects.requireNonNull(autoUpgrades);
            return this;
        }
        public Builder autoUpgrades(GetKubernetesClusterAutoUpgrade... autoUpgrades) {
            return autoUpgrades(List.of(autoUpgrades));
        }
        @CustomType.Setter
        public Builder autoscalerConfigs(List<GetKubernetesClusterAutoscalerConfig> autoscalerConfigs) {
            this.autoscalerConfigs = Objects.requireNonNull(autoscalerConfigs);
            return this;
        }
        public Builder autoscalerConfigs(GetKubernetesClusterAutoscalerConfig... autoscalerConfigs) {
            return autoscalerConfigs(List.of(autoscalerConfigs));
        }
        @CustomType.Setter
        public Builder clusterId(@Nullable String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        @CustomType.Setter
        public Builder cni(String cni) {
            this.cni = Objects.requireNonNull(cni);
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder featureGates(List<String> featureGates) {
            this.featureGates = Objects.requireNonNull(featureGates);
            return this;
        }
        public Builder featureGates(String... featureGates) {
            return featureGates(List.of(featureGates));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder kubeconfigs(List<GetKubernetesClusterKubeconfig> kubeconfigs) {
            this.kubeconfigs = Objects.requireNonNull(kubeconfigs);
            return this;
        }
        public Builder kubeconfigs(GetKubernetesClusterKubeconfig... kubeconfigs) {
            return kubeconfigs(List.of(kubeconfigs));
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder openIdConnectConfigs(List<GetKubernetesClusterOpenIdConnectConfig> openIdConnectConfigs) {
            this.openIdConnectConfigs = Objects.requireNonNull(openIdConnectConfigs);
            return this;
        }
        public Builder openIdConnectConfigs(GetKubernetesClusterOpenIdConnectConfig... openIdConnectConfigs) {
            return openIdConnectConfigs(List.of(openIdConnectConfigs));
        }
        @CustomType.Setter
        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        @CustomType.Setter
        public Builder privateNetworkId(String privateNetworkId) {
            this.privateNetworkId = Objects.requireNonNull(privateNetworkId);
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {
            this.region = region;
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
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }
        @CustomType.Setter
        public Builder upgradeAvailable(Boolean upgradeAvailable) {
            this.upgradeAvailable = Objects.requireNonNull(upgradeAvailable);
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        @CustomType.Setter
        public Builder wildcardDns(String wildcardDns) {
            this.wildcardDns = Objects.requireNonNull(wildcardDns);
            return this;
        }
        public GetKubernetesClusterResult build() {
            final var o = new GetKubernetesClusterResult();
            o.admissionPlugins = admissionPlugins;
            o.apiserverCertSans = apiserverCertSans;
            o.apiserverUrl = apiserverUrl;
            o.autoUpgrades = autoUpgrades;
            o.autoscalerConfigs = autoscalerConfigs;
            o.clusterId = clusterId;
            o.cni = cni;
            o.createdAt = createdAt;
            o.description = description;
            o.featureGates = featureGates;
            o.id = id;
            o.kubeconfigs = kubeconfigs;
            o.name = name;
            o.openIdConnectConfigs = openIdConnectConfigs;
            o.organizationId = organizationId;
            o.privateNetworkId = privateNetworkId;
            o.projectId = projectId;
            o.region = region;
            o.status = status;
            o.tags = tags;
            o.type = type;
            o.updatedAt = updatedAt;
            o.upgradeAvailable = upgradeAvailable;
            o.version = version;
            o.wildcardDns = wildcardDns;
            return o;
        }
    }
}
