// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs_Pulumi.Scaleway
{
    /// <summary>
    /// ## Import
    /// 
    /// Kubernetes clusters can be imported using the `{region}/{id}`, e.g. bash
    /// 
    /// ```sh
    ///  $ pulumi import scaleway:index/kubernetesCluster:KubernetesCluster mycluster fr-par/11111111-1111-1111-1111-111111111111
    /// ```
    /// </summary>
    [ScalewayResourceType("scaleway:index/kubernetesCluster:KubernetesCluster")]
    public partial class KubernetesCluster : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) to enable on the cluster.
        /// </summary>
        [Output("admissionPlugins")]
        public Output<ImmutableArray<string>> AdmissionPlugins { get; private set; } = null!;

        /// <summary>
        /// Additional Subject Alternative Names for the Kubernetes API server certificate
        /// </summary>
        [Output("apiserverCertSans")]
        public Output<ImmutableArray<string>> ApiserverCertSans { get; private set; } = null!;

        /// <summary>
        /// The URL of the Kubernetes API server.
        /// </summary>
        [Output("apiserverUrl")]
        public Output<string> ApiserverUrl { get; private set; } = null!;

        /// <summary>
        /// The auto upgrade configuration.
        /// </summary>
        [Output("autoUpgrade")]
        public Output<Outputs.KubernetesClusterAutoUpgrade> AutoUpgrade { get; private set; } = null!;

        /// <summary>
        /// The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
        /// </summary>
        [Output("autoscalerConfig")]
        public Output<Outputs.KubernetesClusterAutoscalerConfig> AutoscalerConfig { get; private set; } = null!;

        /// <summary>
        /// The Container Network Interface (CNI) for the Kubernetes cluster.
        /// &gt; **Important:** Updates to this field will recreate a new resource.
        /// </summary>
        [Output("cni")]
        public Output<string> Cni { get; private set; } = null!;

        /// <summary>
        /// The creation date of the cluster.
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// Delete additional resources like block volumes and loadbalancers that were created in Kubernetes on cluster deletion.
        /// </summary>
        [Output("deleteAdditionalResources")]
        public Output<bool?> DeleteAdditionalResources { get; private set; } = null!;

        /// <summary>
        /// A description for the Kubernetes cluster.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) to enable on the cluster.
        /// </summary>
        [Output("featureGates")]
        public Output<ImmutableArray<string>> FeatureGates { get; private set; } = null!;

        /// <summary>
        /// The kubeconfig configuration file of the Kubernetes cluster
        /// </summary>
        [Output("kubeconfigs")]
        public Output<ImmutableArray<Outputs.KubernetesClusterKubeconfig>> Kubeconfigs { get; private set; } = null!;

        /// <summary>
        /// The name for the Kubernetes cluster.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The OpenID Connect configuration of the cluster
        /// </summary>
        [Output("openIdConnectConfig")]
        public Output<Outputs.KubernetesClusterOpenIdConnectConfig> OpenIdConnectConfig { get; private set; } = null!;

        /// <summary>
        /// The organization ID the cluster is associated with.
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;

        /// <summary>
        /// `project_id`) The ID of the project the cluster is associated with.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// `region`) The region in which the cluster should be created.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// The status of the Kubernetes cluster.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The tags associated with the Kubernetes cluster.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// The type of Kubernetes cluster. Possible values are: `kapsule` or `multicloud`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// The last update date of the cluster.
        /// </summary>
        [Output("updatedAt")]
        public Output<string> UpdatedAt { get; private set; } = null!;

        /// <summary>
        /// Set to `true` if a newer Kubernetes version is available.
        /// </summary>
        [Output("upgradeAvailable")]
        public Output<bool> UpgradeAvailable { get; private set; } = null!;

        /// <summary>
        /// The version of the Kubernetes cluster.
        /// </summary>
        [Output("version")]
        public Output<string> Version { get; private set; } = null!;

        /// <summary>
        /// The DNS wildcard that points to all ready nodes.
        /// - `kubeconfig`
        /// </summary>
        [Output("wildcardDns")]
        public Output<string> WildcardDns { get; private set; } = null!;


        /// <summary>
        /// Create a KubernetesCluster resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public KubernetesCluster(string name, KubernetesClusterArgs args, CustomResourceOptions? options = null)
            : base("scaleway:index/kubernetesCluster:KubernetesCluster", name, args ?? new KubernetesClusterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private KubernetesCluster(string name, Input<string> id, KubernetesClusterState? state = null, CustomResourceOptions? options = null)
            : base("scaleway:index/kubernetesCluster:KubernetesCluster", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing KubernetesCluster resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static KubernetesCluster Get(string name, Input<string> id, KubernetesClusterState? state = null, CustomResourceOptions? options = null)
        {
            return new KubernetesCluster(name, id, state, options);
        }
    }

    public sealed class KubernetesClusterArgs : global::Pulumi.ResourceArgs
    {
        [Input("admissionPlugins")]
        private InputList<string>? _admissionPlugins;

        /// <summary>
        /// The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) to enable on the cluster.
        /// </summary>
        public InputList<string> AdmissionPlugins
        {
            get => _admissionPlugins ?? (_admissionPlugins = new InputList<string>());
            set => _admissionPlugins = value;
        }

        [Input("apiserverCertSans")]
        private InputList<string>? _apiserverCertSans;

        /// <summary>
        /// Additional Subject Alternative Names for the Kubernetes API server certificate
        /// </summary>
        public InputList<string> ApiserverCertSans
        {
            get => _apiserverCertSans ?? (_apiserverCertSans = new InputList<string>());
            set => _apiserverCertSans = value;
        }

        /// <summary>
        /// The auto upgrade configuration.
        /// </summary>
        [Input("autoUpgrade")]
        public Input<Inputs.KubernetesClusterAutoUpgradeArgs>? AutoUpgrade { get; set; }

        /// <summary>
        /// The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
        /// </summary>
        [Input("autoscalerConfig")]
        public Input<Inputs.KubernetesClusterAutoscalerConfigArgs>? AutoscalerConfig { get; set; }

        /// <summary>
        /// The Container Network Interface (CNI) for the Kubernetes cluster.
        /// &gt; **Important:** Updates to this field will recreate a new resource.
        /// </summary>
        [Input("cni", required: true)]
        public Input<string> Cni { get; set; } = null!;

        /// <summary>
        /// Delete additional resources like block volumes and loadbalancers that were created in Kubernetes on cluster deletion.
        /// </summary>
        [Input("deleteAdditionalResources")]
        public Input<bool>? DeleteAdditionalResources { get; set; }

        /// <summary>
        /// A description for the Kubernetes cluster.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("featureGates")]
        private InputList<string>? _featureGates;

        /// <summary>
        /// The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) to enable on the cluster.
        /// </summary>
        public InputList<string> FeatureGates
        {
            get => _featureGates ?? (_featureGates = new InputList<string>());
            set => _featureGates = value;
        }

        /// <summary>
        /// The name for the Kubernetes cluster.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The OpenID Connect configuration of the cluster
        /// </summary>
        [Input("openIdConnectConfig")]
        public Input<Inputs.KubernetesClusterOpenIdConnectConfigArgs>? OpenIdConnectConfig { get; set; }

        /// <summary>
        /// `project_id`) The ID of the project the cluster is associated with.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// `region`) The region in which the cluster should be created.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The tags associated with the Kubernetes cluster.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The type of Kubernetes cluster. Possible values are: `kapsule` or `multicloud`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The version of the Kubernetes cluster.
        /// </summary>
        [Input("version", required: true)]
        public Input<string> Version { get; set; } = null!;

        public KubernetesClusterArgs()
        {
        }
        public static new KubernetesClusterArgs Empty => new KubernetesClusterArgs();
    }

    public sealed class KubernetesClusterState : global::Pulumi.ResourceArgs
    {
        [Input("admissionPlugins")]
        private InputList<string>? _admissionPlugins;

        /// <summary>
        /// The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) to enable on the cluster.
        /// </summary>
        public InputList<string> AdmissionPlugins
        {
            get => _admissionPlugins ?? (_admissionPlugins = new InputList<string>());
            set => _admissionPlugins = value;
        }

        [Input("apiserverCertSans")]
        private InputList<string>? _apiserverCertSans;

        /// <summary>
        /// Additional Subject Alternative Names for the Kubernetes API server certificate
        /// </summary>
        public InputList<string> ApiserverCertSans
        {
            get => _apiserverCertSans ?? (_apiserverCertSans = new InputList<string>());
            set => _apiserverCertSans = value;
        }

        /// <summary>
        /// The URL of the Kubernetes API server.
        /// </summary>
        [Input("apiserverUrl")]
        public Input<string>? ApiserverUrl { get; set; }

        /// <summary>
        /// The auto upgrade configuration.
        /// </summary>
        [Input("autoUpgrade")]
        public Input<Inputs.KubernetesClusterAutoUpgradeGetArgs>? AutoUpgrade { get; set; }

        /// <summary>
        /// The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
        /// </summary>
        [Input("autoscalerConfig")]
        public Input<Inputs.KubernetesClusterAutoscalerConfigGetArgs>? AutoscalerConfig { get; set; }

        /// <summary>
        /// The Container Network Interface (CNI) for the Kubernetes cluster.
        /// &gt; **Important:** Updates to this field will recreate a new resource.
        /// </summary>
        [Input("cni")]
        public Input<string>? Cni { get; set; }

        /// <summary>
        /// The creation date of the cluster.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// Delete additional resources like block volumes and loadbalancers that were created in Kubernetes on cluster deletion.
        /// </summary>
        [Input("deleteAdditionalResources")]
        public Input<bool>? DeleteAdditionalResources { get; set; }

        /// <summary>
        /// A description for the Kubernetes cluster.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("featureGates")]
        private InputList<string>? _featureGates;

        /// <summary>
        /// The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) to enable on the cluster.
        /// </summary>
        public InputList<string> FeatureGates
        {
            get => _featureGates ?? (_featureGates = new InputList<string>());
            set => _featureGates = value;
        }

        [Input("kubeconfigs")]
        private InputList<Inputs.KubernetesClusterKubeconfigGetArgs>? _kubeconfigs;

        /// <summary>
        /// The kubeconfig configuration file of the Kubernetes cluster
        /// </summary>
        public InputList<Inputs.KubernetesClusterKubeconfigGetArgs> Kubeconfigs
        {
            get => _kubeconfigs ?? (_kubeconfigs = new InputList<Inputs.KubernetesClusterKubeconfigGetArgs>());
            set => _kubeconfigs = value;
        }

        /// <summary>
        /// The name for the Kubernetes cluster.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The OpenID Connect configuration of the cluster
        /// </summary>
        [Input("openIdConnectConfig")]
        public Input<Inputs.KubernetesClusterOpenIdConnectConfigGetArgs>? OpenIdConnectConfig { get; set; }

        /// <summary>
        /// The organization ID the cluster is associated with.
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// `project_id`) The ID of the project the cluster is associated with.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// `region`) The region in which the cluster should be created.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The status of the Kubernetes cluster.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The tags associated with the Kubernetes cluster.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The type of Kubernetes cluster. Possible values are: `kapsule` or `multicloud`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The last update date of the cluster.
        /// </summary>
        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        /// <summary>
        /// Set to `true` if a newer Kubernetes version is available.
        /// </summary>
        [Input("upgradeAvailable")]
        public Input<bool>? UpgradeAvailable { get; set; }

        /// <summary>
        /// The version of the Kubernetes cluster.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        /// <summary>
        /// The DNS wildcard that points to all ready nodes.
        /// - `kubeconfig`
        /// </summary>
        [Input("wildcardDns")]
        public Input<string>? WildcardDns { get; set; }

        public KubernetesClusterState()
        {
        }
        public static new KubernetesClusterState Empty => new KubernetesClusterState();
    }
}
