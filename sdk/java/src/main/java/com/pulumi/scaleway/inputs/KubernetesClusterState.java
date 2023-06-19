// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scaleway.inputs.KubernetesClusterAutoUpgradeArgs;
import com.pulumi.scaleway.inputs.KubernetesClusterAutoscalerConfigArgs;
import com.pulumi.scaleway.inputs.KubernetesClusterKubeconfigArgs;
import com.pulumi.scaleway.inputs.KubernetesClusterOpenIdConnectConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KubernetesClusterState extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesClusterState Empty = new KubernetesClusterState();

    /**
     * The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) to enable on the cluster.
     * 
     */
    @Import(name="admissionPlugins")
    private @Nullable Output<List<String>> admissionPlugins;

    /**
     * @return The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) to enable on the cluster.
     * 
     */
    public Optional<Output<List<String>>> admissionPlugins() {
        return Optional.ofNullable(this.admissionPlugins);
    }

    /**
     * Additional Subject Alternative Names for the Kubernetes API server certificate
     * 
     */
    @Import(name="apiserverCertSans")
    private @Nullable Output<List<String>> apiserverCertSans;

    /**
     * @return Additional Subject Alternative Names for the Kubernetes API server certificate
     * 
     */
    public Optional<Output<List<String>>> apiserverCertSans() {
        return Optional.ofNullable(this.apiserverCertSans);
    }

    /**
     * The URL of the Kubernetes API server.
     * 
     */
    @Import(name="apiserverUrl")
    private @Nullable Output<String> apiserverUrl;

    /**
     * @return The URL of the Kubernetes API server.
     * 
     */
    public Optional<Output<String>> apiserverUrl() {
        return Optional.ofNullable(this.apiserverUrl);
    }

    /**
     * The auto upgrade configuration.
     * 
     */
    @Import(name="autoUpgrade")
    private @Nullable Output<KubernetesClusterAutoUpgradeArgs> autoUpgrade;

    /**
     * @return The auto upgrade configuration.
     * 
     */
    public Optional<Output<KubernetesClusterAutoUpgradeArgs>> autoUpgrade() {
        return Optional.ofNullable(this.autoUpgrade);
    }

    /**
     * The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
     * 
     */
    @Import(name="autoscalerConfig")
    private @Nullable Output<KubernetesClusterAutoscalerConfigArgs> autoscalerConfig;

    /**
     * @return The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
     * 
     */
    public Optional<Output<KubernetesClusterAutoscalerConfigArgs>> autoscalerConfig() {
        return Optional.ofNullable(this.autoscalerConfig);
    }

    /**
     * The Container Network Interface (CNI) for the Kubernetes cluster.
     * &gt; **Important:** Updates to this field will recreate a new resource.
     * 
     */
    @Import(name="cni")
    private @Nullable Output<String> cni;

    /**
     * @return The Container Network Interface (CNI) for the Kubernetes cluster.
     * &gt; **Important:** Updates to this field will recreate a new resource.
     * 
     */
    public Optional<Output<String>> cni() {
        return Optional.ofNullable(this.cni);
    }

    /**
     * The creation date of the cluster.
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return The creation date of the cluster.
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * Delete additional resources like block volumes, loadbalancers and the cluster private network (if empty) that were created in Kubernetes on cluster deletion.
     * &gt; **Important:** Setting this field to `true` means that you will lose all your cluster data and network configuration when you delete your cluster.
     * If you prefer keeping it, you should instead set it as `false`.
     * 
     */
    @Import(name="deleteAdditionalResources")
    private @Nullable Output<Boolean> deleteAdditionalResources;

    /**
     * @return Delete additional resources like block volumes, loadbalancers and the cluster private network (if empty) that were created in Kubernetes on cluster deletion.
     * &gt; **Important:** Setting this field to `true` means that you will lose all your cluster data and network configuration when you delete your cluster.
     * If you prefer keeping it, you should instead set it as `false`.
     * 
     */
    public Optional<Output<Boolean>> deleteAdditionalResources() {
        return Optional.ofNullable(this.deleteAdditionalResources);
    }

    /**
     * A description for the Kubernetes cluster.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description for the Kubernetes cluster.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) to enable on the cluster.
     * 
     */
    @Import(name="featureGates")
    private @Nullable Output<List<String>> featureGates;

    /**
     * @return The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) to enable on the cluster.
     * 
     */
    public Optional<Output<List<String>>> featureGates() {
        return Optional.ofNullable(this.featureGates);
    }

    /**
     * The kubeconfig configuration file of the Kubernetes cluster
     * 
     */
    @Import(name="kubeconfigs")
    private @Nullable Output<List<KubernetesClusterKubeconfigArgs>> kubeconfigs;

    /**
     * @return The kubeconfig configuration file of the Kubernetes cluster
     * 
     */
    public Optional<Output<List<KubernetesClusterKubeconfigArgs>>> kubeconfigs() {
        return Optional.ofNullable(this.kubeconfigs);
    }

    /**
     * The name for the Kubernetes cluster.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name for the Kubernetes cluster.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The OpenID Connect configuration of the cluster
     * 
     */
    @Import(name="openIdConnectConfig")
    private @Nullable Output<KubernetesClusterOpenIdConnectConfigArgs> openIdConnectConfig;

    /**
     * @return The OpenID Connect configuration of the cluster
     * 
     */
    public Optional<Output<KubernetesClusterOpenIdConnectConfigArgs>> openIdConnectConfig() {
        return Optional.ofNullable(this.openIdConnectConfig);
    }

    /**
     * The organization ID the cluster is associated with.
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return The organization ID the cluster is associated with.
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    /**
     * The ID of the private network of the cluster.
     * 
     * &gt; **Important:** This field can only be set at cluster creation and cannot be updated later.
     * Changes to this field will cause the cluster to be destroyed then recreated.
     * 
     */
    @Import(name="privateNetworkId")
    private @Nullable Output<String> privateNetworkId;

    /**
     * @return The ID of the private network of the cluster.
     * 
     * &gt; **Important:** This field can only be set at cluster creation and cannot be updated later.
     * Changes to this field will cause the cluster to be destroyed then recreated.
     * 
     */
    public Optional<Output<String>> privateNetworkId() {
        return Optional.ofNullable(this.privateNetworkId);
    }

    /**
     * `project_id`) The ID of the project the cluster is associated with.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the cluster is associated with.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * `region`) The region in which the cluster should be created.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return `region`) The region in which the cluster should be created.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The status of the Kubernetes cluster.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the Kubernetes cluster.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The tags associated with the Kubernetes cluster.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return The tags associated with the Kubernetes cluster.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The type of Kubernetes cluster. Possible values are: `kapsule` or `multicloud`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of Kubernetes cluster. Possible values are: `kapsule` or `multicloud`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * The last update date of the cluster.
     * 
     */
    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    /**
     * @return The last update date of the cluster.
     * 
     */
    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    /**
     * Set to `true` if a newer Kubernetes version is available.
     * 
     */
    @Import(name="upgradeAvailable")
    private @Nullable Output<Boolean> upgradeAvailable;

    /**
     * @return Set to `true` if a newer Kubernetes version is available.
     * 
     */
    public Optional<Output<Boolean>> upgradeAvailable() {
        return Optional.ofNullable(this.upgradeAvailable);
    }

    /**
     * The version of the Kubernetes cluster.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The version of the Kubernetes cluster.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    /**
     * The DNS wildcard that points to all ready nodes.
     * 
     */
    @Import(name="wildcardDns")
    private @Nullable Output<String> wildcardDns;

    /**
     * @return The DNS wildcard that points to all ready nodes.
     * 
     */
    public Optional<Output<String>> wildcardDns() {
        return Optional.ofNullable(this.wildcardDns);
    }

    private KubernetesClusterState() {}

    private KubernetesClusterState(KubernetesClusterState $) {
        this.admissionPlugins = $.admissionPlugins;
        this.apiserverCertSans = $.apiserverCertSans;
        this.apiserverUrl = $.apiserverUrl;
        this.autoUpgrade = $.autoUpgrade;
        this.autoscalerConfig = $.autoscalerConfig;
        this.cni = $.cni;
        this.createdAt = $.createdAt;
        this.deleteAdditionalResources = $.deleteAdditionalResources;
        this.description = $.description;
        this.featureGates = $.featureGates;
        this.kubeconfigs = $.kubeconfigs;
        this.name = $.name;
        this.openIdConnectConfig = $.openIdConnectConfig;
        this.organizationId = $.organizationId;
        this.privateNetworkId = $.privateNetworkId;
        this.projectId = $.projectId;
        this.region = $.region;
        this.status = $.status;
        this.tags = $.tags;
        this.type = $.type;
        this.updatedAt = $.updatedAt;
        this.upgradeAvailable = $.upgradeAvailable;
        this.version = $.version;
        this.wildcardDns = $.wildcardDns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesClusterState $;

        public Builder() {
            $ = new KubernetesClusterState();
        }

        public Builder(KubernetesClusterState defaults) {
            $ = new KubernetesClusterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param admissionPlugins The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) to enable on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder admissionPlugins(@Nullable Output<List<String>> admissionPlugins) {
            $.admissionPlugins = admissionPlugins;
            return this;
        }

        /**
         * @param admissionPlugins The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) to enable on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder admissionPlugins(List<String> admissionPlugins) {
            return admissionPlugins(Output.of(admissionPlugins));
        }

        /**
         * @param admissionPlugins The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) to enable on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder admissionPlugins(String... admissionPlugins) {
            return admissionPlugins(List.of(admissionPlugins));
        }

        /**
         * @param apiserverCertSans Additional Subject Alternative Names for the Kubernetes API server certificate
         * 
         * @return builder
         * 
         */
        public Builder apiserverCertSans(@Nullable Output<List<String>> apiserverCertSans) {
            $.apiserverCertSans = apiserverCertSans;
            return this;
        }

        /**
         * @param apiserverCertSans Additional Subject Alternative Names for the Kubernetes API server certificate
         * 
         * @return builder
         * 
         */
        public Builder apiserverCertSans(List<String> apiserverCertSans) {
            return apiserverCertSans(Output.of(apiserverCertSans));
        }

        /**
         * @param apiserverCertSans Additional Subject Alternative Names for the Kubernetes API server certificate
         * 
         * @return builder
         * 
         */
        public Builder apiserverCertSans(String... apiserverCertSans) {
            return apiserverCertSans(List.of(apiserverCertSans));
        }

        /**
         * @param apiserverUrl The URL of the Kubernetes API server.
         * 
         * @return builder
         * 
         */
        public Builder apiserverUrl(@Nullable Output<String> apiserverUrl) {
            $.apiserverUrl = apiserverUrl;
            return this;
        }

        /**
         * @param apiserverUrl The URL of the Kubernetes API server.
         * 
         * @return builder
         * 
         */
        public Builder apiserverUrl(String apiserverUrl) {
            return apiserverUrl(Output.of(apiserverUrl));
        }

        /**
         * @param autoUpgrade The auto upgrade configuration.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgrade(@Nullable Output<KubernetesClusterAutoUpgradeArgs> autoUpgrade) {
            $.autoUpgrade = autoUpgrade;
            return this;
        }

        /**
         * @param autoUpgrade The auto upgrade configuration.
         * 
         * @return builder
         * 
         */
        public Builder autoUpgrade(KubernetesClusterAutoUpgradeArgs autoUpgrade) {
            return autoUpgrade(Output.of(autoUpgrade));
        }

        /**
         * @param autoscalerConfig The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
         * 
         * @return builder
         * 
         */
        public Builder autoscalerConfig(@Nullable Output<KubernetesClusterAutoscalerConfigArgs> autoscalerConfig) {
            $.autoscalerConfig = autoscalerConfig;
            return this;
        }

        /**
         * @param autoscalerConfig The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
         * 
         * @return builder
         * 
         */
        public Builder autoscalerConfig(KubernetesClusterAutoscalerConfigArgs autoscalerConfig) {
            return autoscalerConfig(Output.of(autoscalerConfig));
        }

        /**
         * @param cni The Container Network Interface (CNI) for the Kubernetes cluster.
         * &gt; **Important:** Updates to this field will recreate a new resource.
         * 
         * @return builder
         * 
         */
        public Builder cni(@Nullable Output<String> cni) {
            $.cni = cni;
            return this;
        }

        /**
         * @param cni The Container Network Interface (CNI) for the Kubernetes cluster.
         * &gt; **Important:** Updates to this field will recreate a new resource.
         * 
         * @return builder
         * 
         */
        public Builder cni(String cni) {
            return cni(Output.of(cni));
        }

        /**
         * @param createdAt The creation date of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The creation date of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param deleteAdditionalResources Delete additional resources like block volumes, loadbalancers and the cluster private network (if empty) that were created in Kubernetes on cluster deletion.
         * &gt; **Important:** Setting this field to `true` means that you will lose all your cluster data and network configuration when you delete your cluster.
         * If you prefer keeping it, you should instead set it as `false`.
         * 
         * @return builder
         * 
         */
        public Builder deleteAdditionalResources(@Nullable Output<Boolean> deleteAdditionalResources) {
            $.deleteAdditionalResources = deleteAdditionalResources;
            return this;
        }

        /**
         * @param deleteAdditionalResources Delete additional resources like block volumes, loadbalancers and the cluster private network (if empty) that were created in Kubernetes on cluster deletion.
         * &gt; **Important:** Setting this field to `true` means that you will lose all your cluster data and network configuration when you delete your cluster.
         * If you prefer keeping it, you should instead set it as `false`.
         * 
         * @return builder
         * 
         */
        public Builder deleteAdditionalResources(Boolean deleteAdditionalResources) {
            return deleteAdditionalResources(Output.of(deleteAdditionalResources));
        }

        /**
         * @param description A description for the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description for the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param featureGates The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) to enable on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder featureGates(@Nullable Output<List<String>> featureGates) {
            $.featureGates = featureGates;
            return this;
        }

        /**
         * @param featureGates The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) to enable on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder featureGates(List<String> featureGates) {
            return featureGates(Output.of(featureGates));
        }

        /**
         * @param featureGates The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) to enable on the cluster.
         * 
         * @return builder
         * 
         */
        public Builder featureGates(String... featureGates) {
            return featureGates(List.of(featureGates));
        }

        /**
         * @param kubeconfigs The kubeconfig configuration file of the Kubernetes cluster
         * 
         * @return builder
         * 
         */
        public Builder kubeconfigs(@Nullable Output<List<KubernetesClusterKubeconfigArgs>> kubeconfigs) {
            $.kubeconfigs = kubeconfigs;
            return this;
        }

        /**
         * @param kubeconfigs The kubeconfig configuration file of the Kubernetes cluster
         * 
         * @return builder
         * 
         */
        public Builder kubeconfigs(List<KubernetesClusterKubeconfigArgs> kubeconfigs) {
            return kubeconfigs(Output.of(kubeconfigs));
        }

        /**
         * @param kubeconfigs The kubeconfig configuration file of the Kubernetes cluster
         * 
         * @return builder
         * 
         */
        public Builder kubeconfigs(KubernetesClusterKubeconfigArgs... kubeconfigs) {
            return kubeconfigs(List.of(kubeconfigs));
        }

        /**
         * @param name The name for the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param openIdConnectConfig The OpenID Connect configuration of the cluster
         * 
         * @return builder
         * 
         */
        public Builder openIdConnectConfig(@Nullable Output<KubernetesClusterOpenIdConnectConfigArgs> openIdConnectConfig) {
            $.openIdConnectConfig = openIdConnectConfig;
            return this;
        }

        /**
         * @param openIdConnectConfig The OpenID Connect configuration of the cluster
         * 
         * @return builder
         * 
         */
        public Builder openIdConnectConfig(KubernetesClusterOpenIdConnectConfigArgs openIdConnectConfig) {
            return openIdConnectConfig(Output.of(openIdConnectConfig));
        }

        /**
         * @param organizationId The organization ID the cluster is associated with.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId The organization ID the cluster is associated with.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param privateNetworkId The ID of the private network of the cluster.
         * 
         * &gt; **Important:** This field can only be set at cluster creation and cannot be updated later.
         * Changes to this field will cause the cluster to be destroyed then recreated.
         * 
         * @return builder
         * 
         */
        public Builder privateNetworkId(@Nullable Output<String> privateNetworkId) {
            $.privateNetworkId = privateNetworkId;
            return this;
        }

        /**
         * @param privateNetworkId The ID of the private network of the cluster.
         * 
         * &gt; **Important:** This field can only be set at cluster creation and cannot be updated later.
         * Changes to this field will cause the cluster to be destroyed then recreated.
         * 
         * @return builder
         * 
         */
        public Builder privateNetworkId(String privateNetworkId) {
            return privateNetworkId(Output.of(privateNetworkId));
        }

        /**
         * @param projectId `project_id`) The ID of the project the cluster is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId `project_id`) The ID of the project the cluster is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param region `region`) The region in which the cluster should be created.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region `region`) The region in which the cluster should be created.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param status The status of the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags The tags associated with the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags associated with the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The tags associated with the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param type The type of Kubernetes cluster. Possible values are: `kapsule` or `multicloud`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of Kubernetes cluster. Possible values are: `kapsule` or `multicloud`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param updatedAt The last update date of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        /**
         * @param updatedAt The last update date of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        /**
         * @param upgradeAvailable Set to `true` if a newer Kubernetes version is available.
         * 
         * @return builder
         * 
         */
        public Builder upgradeAvailable(@Nullable Output<Boolean> upgradeAvailable) {
            $.upgradeAvailable = upgradeAvailable;
            return this;
        }

        /**
         * @param upgradeAvailable Set to `true` if a newer Kubernetes version is available.
         * 
         * @return builder
         * 
         */
        public Builder upgradeAvailable(Boolean upgradeAvailable) {
            return upgradeAvailable(Output.of(upgradeAvailable));
        }

        /**
         * @param version The version of the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version of the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        /**
         * @param wildcardDns The DNS wildcard that points to all ready nodes.
         * 
         * @return builder
         * 
         */
        public Builder wildcardDns(@Nullable Output<String> wildcardDns) {
            $.wildcardDns = wildcardDns;
            return this;
        }

        /**
         * @param wildcardDns The DNS wildcard that points to all ready nodes.
         * 
         * @return builder
         * 
         */
        public Builder wildcardDns(String wildcardDns) {
            return wildcardDns(Output.of(wildcardDns));
        }

        public KubernetesClusterState build() {
            return $;
        }
    }

}
