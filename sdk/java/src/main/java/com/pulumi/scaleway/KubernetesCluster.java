// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scaleway.KubernetesClusterArgs;
import com.pulumi.scaleway.Utilities;
import com.pulumi.scaleway.inputs.KubernetesClusterState;
import com.pulumi.scaleway.outputs.KubernetesClusterAutoUpgrade;
import com.pulumi.scaleway.outputs.KubernetesClusterAutoscalerConfig;
import com.pulumi.scaleway.outputs.KubernetesClusterKubeconfig;
import com.pulumi.scaleway.outputs.KubernetesClusterOpenIdConnectConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Kubernetes clusters can be imported using the `{region}/{id}`, e.g. bash
 * 
 * ```sh
 *  $ pulumi import scaleway:index/kubernetesCluster:KubernetesCluster mycluster fr-par/11111111-1111-1111-1111-111111111111
 * ```
 * 
 */
@ResourceType(type="scaleway:index/kubernetesCluster:KubernetesCluster")
public class KubernetesCluster extends com.pulumi.resources.CustomResource {
    /**
     * The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) to enable on the cluster.
     * 
     */
    @Export(name="admissionPlugins", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> admissionPlugins;

    /**
     * @return The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) to enable on the cluster.
     * 
     */
    public Output<Optional<List<String>>> admissionPlugins() {
        return Codegen.optional(this.admissionPlugins);
    }
    /**
     * Additional Subject Alternative Names for the Kubernetes API server certificate
     * 
     */
    @Export(name="apiserverCertSans", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> apiserverCertSans;

    /**
     * @return Additional Subject Alternative Names for the Kubernetes API server certificate
     * 
     */
    public Output<Optional<List<String>>> apiserverCertSans() {
        return Codegen.optional(this.apiserverCertSans);
    }
    /**
     * The URL of the Kubernetes API server.
     * 
     */
    @Export(name="apiserverUrl", type=String.class, parameters={})
    private Output<String> apiserverUrl;

    /**
     * @return The URL of the Kubernetes API server.
     * 
     */
    public Output<String> apiserverUrl() {
        return this.apiserverUrl;
    }
    /**
     * The auto upgrade configuration.
     * 
     */
    @Export(name="autoUpgrade", type=KubernetesClusterAutoUpgrade.class, parameters={})
    private Output<KubernetesClusterAutoUpgrade> autoUpgrade;

    /**
     * @return The auto upgrade configuration.
     * 
     */
    public Output<KubernetesClusterAutoUpgrade> autoUpgrade() {
        return this.autoUpgrade;
    }
    /**
     * The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
     * 
     */
    @Export(name="autoscalerConfig", type=KubernetesClusterAutoscalerConfig.class, parameters={})
    private Output<KubernetesClusterAutoscalerConfig> autoscalerConfig;

    /**
     * @return The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
     * 
     */
    public Output<KubernetesClusterAutoscalerConfig> autoscalerConfig() {
        return this.autoscalerConfig;
    }
    /**
     * The Container Network Interface (CNI) for the Kubernetes cluster.
     * &gt; **Important:** Updates to this field will recreate a new resource.
     * 
     */
    @Export(name="cni", type=String.class, parameters={})
    private Output<String> cni;

    /**
     * @return The Container Network Interface (CNI) for the Kubernetes cluster.
     * &gt; **Important:** Updates to this field will recreate a new resource.
     * 
     */
    public Output<String> cni() {
        return this.cni;
    }
    /**
     * The creation date of the cluster.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The creation date of the cluster.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Delete additional resources like block volumes, IPs and loadbalancers that were created in Kubernetes on cluster deletion.
     * &gt; **Important:** Setting this field to `true` means that you will lose all your cluster data and network configuration when you delete your cluster.
     * If you prefer keeping it, you should instead set it as `false`.
     * 
     */
    @Export(name="deleteAdditionalResources", type=Boolean.class, parameters={})
    private Output<Boolean> deleteAdditionalResources;

    /**
     * @return Delete additional resources like block volumes, IPs and loadbalancers that were created in Kubernetes on cluster deletion.
     * &gt; **Important:** Setting this field to `true` means that you will lose all your cluster data and network configuration when you delete your cluster.
     * If you prefer keeping it, you should instead set it as `false`.
     * 
     */
    public Output<Boolean> deleteAdditionalResources() {
        return this.deleteAdditionalResources;
    }
    /**
     * A description for the Kubernetes cluster.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for the Kubernetes cluster.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) to enable on the cluster.
     * 
     */
    @Export(name="featureGates", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> featureGates;

    /**
     * @return The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) to enable on the cluster.
     * 
     */
    public Output<Optional<List<String>>> featureGates() {
        return Codegen.optional(this.featureGates);
    }
    /**
     * The kubeconfig configuration file of the Kubernetes cluster
     * 
     */
    @Export(name="kubeconfigs", type=List.class, parameters={KubernetesClusterKubeconfig.class})
    private Output<List<KubernetesClusterKubeconfig>> kubeconfigs;

    /**
     * @return The kubeconfig configuration file of the Kubernetes cluster
     * 
     */
    public Output<List<KubernetesClusterKubeconfig>> kubeconfigs() {
        return this.kubeconfigs;
    }
    /**
     * The name for the Kubernetes cluster.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name for the Kubernetes cluster.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The OpenID Connect configuration of the cluster
     * 
     */
    @Export(name="openIdConnectConfig", type=KubernetesClusterOpenIdConnectConfig.class, parameters={})
    private Output<KubernetesClusterOpenIdConnectConfig> openIdConnectConfig;

    /**
     * @return The OpenID Connect configuration of the cluster
     * 
     */
    public Output<KubernetesClusterOpenIdConnectConfig> openIdConnectConfig() {
        return this.openIdConnectConfig;
    }
    /**
     * The organization ID the cluster is associated with.
     * 
     */
    @Export(name="organizationId", type=String.class, parameters={})
    private Output<String> organizationId;

    /**
     * @return The organization ID the cluster is associated with.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }
    /**
     * `project_id`) The ID of the project the cluster is associated with.
     * 
     */
    @Export(name="projectId", type=String.class, parameters={})
    private Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the cluster is associated with.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * `region`) The region in which the cluster should be created.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return `region`) The region in which the cluster should be created.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The status of the Kubernetes cluster.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the Kubernetes cluster.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The tags associated with the Kubernetes cluster.
     * 
     */
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return The tags associated with the Kubernetes cluster.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The type of Kubernetes cluster. Possible values are: `kapsule` or `multicloud`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of Kubernetes cluster. Possible values are: `kapsule` or `multicloud`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The last update date of the cluster.
     * 
     */
    @Export(name="updatedAt", type=String.class, parameters={})
    private Output<String> updatedAt;

    /**
     * @return The last update date of the cluster.
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }
    /**
     * Set to `true` if a newer Kubernetes version is available.
     * 
     */
    @Export(name="upgradeAvailable", type=Boolean.class, parameters={})
    private Output<Boolean> upgradeAvailable;

    /**
     * @return Set to `true` if a newer Kubernetes version is available.
     * 
     */
    public Output<Boolean> upgradeAvailable() {
        return this.upgradeAvailable;
    }
    /**
     * The version of the Kubernetes cluster.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return The version of the Kubernetes cluster.
     * 
     */
    public Output<String> version() {
        return this.version;
    }
    /**
     * The DNS wildcard that points to all ready nodes.
     * 
     */
    @Export(name="wildcardDns", type=String.class, parameters={})
    private Output<String> wildcardDns;

    /**
     * @return The DNS wildcard that points to all ready nodes.
     * 
     */
    public Output<String> wildcardDns() {
        return this.wildcardDns;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KubernetesCluster(String name) {
        this(name, KubernetesClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KubernetesCluster(String name, KubernetesClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KubernetesCluster(String name, KubernetesClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/kubernetesCluster:KubernetesCluster", name, args == null ? KubernetesClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private KubernetesCluster(String name, Output<String> id, @Nullable KubernetesClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/kubernetesCluster:KubernetesCluster", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static KubernetesCluster get(String name, Output<String> id, @Nullable KubernetesClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KubernetesCluster(name, id, state, options);
    }
}
