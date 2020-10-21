// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scaleway
{
    public partial class KubernetesClusterBeta : Pulumi.CustomResource
    {
        /// <summary>
        /// The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) to enable on the cluster.
        /// </summary>
        [Output("admissionPlugins")]
        public Output<ImmutableArray<string>> AdmissionPlugins { get; private set; } = null!;

        /// <summary>
        /// The URL of the Kubernetes API server.
        /// </summary>
        [Output("apiserverUrl")]
        public Output<string> ApiserverUrl { get; private set; } = null!;

        /// <summary>
        /// The auto upgrade configuration.
        /// </summary>
        [Output("autoUpgrade")]
        public Output<Outputs.KubernetesClusterBetaAutoUpgrade> AutoUpgrade { get; private set; } = null!;

        /// <summary>
        /// The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
        /// </summary>
        [Output("autoscalerConfig")]
        public Output<Outputs.KubernetesClusterBetaAutoscalerConfig> AutoscalerConfig { get; private set; } = null!;

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
        /// See below.
        /// </summary>
        [Output("defaultPool")]
        public Output<Outputs.KubernetesClusterBetaDefaultPool?> DefaultPool { get; private set; } = null!;

        /// <summary>
        /// A description for the Kubernetes cluster.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Enables the [Kubernetes dashboard](https://github.com/kubernetes/dashboard) for the Kubernetes cluster.
        /// </summary>
        [Output("enableDashboard")]
        public Output<bool?> EnableDashboard { get; private set; } = null!;

        /// <summary>
        /// The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) to enable on the cluster.
        /// </summary>
        [Output("featureGates")]
        public Output<ImmutableArray<string>> FeatureGates { get; private set; } = null!;

        /// <summary>
        /// The [ingress controller](https://kubernetes.io/docs/concepts/services-networking/ingress-controllers/) to be deployed on the Kubernetes cluster.
        /// </summary>
        [Output("ingress")]
        public Output<string?> Ingress { get; private set; } = null!;

        /// <summary>
        /// The kubeconfig configuration file of the Kubernetes cluster
        /// </summary>
        [Output("kubeconfig")]
        public Output<Outputs.KubernetesClusterBetaKubeconfig> Kubeconfig { get; private set; } = null!;

        /// <summary>
        /// The name for the Kubernetes cluster.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// `organization_id`) The ID of the organization the cluster is associated with.
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;

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
        /// Create a KubernetesClusterBeta resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public KubernetesClusterBeta(string name, KubernetesClusterBetaArgs args, CustomResourceOptions? options = null)
            : base("scaleway:index/kubernetesClusterBeta:KubernetesClusterBeta", name, args ?? new KubernetesClusterBetaArgs(), MakeResourceOptions(options, ""))
        {
        }

        private KubernetesClusterBeta(string name, Input<string> id, KubernetesClusterBetaState? state = null, CustomResourceOptions? options = null)
            : base("scaleway:index/kubernetesClusterBeta:KubernetesClusterBeta", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing KubernetesClusterBeta resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static KubernetesClusterBeta Get(string name, Input<string> id, KubernetesClusterBetaState? state = null, CustomResourceOptions? options = null)
        {
            return new KubernetesClusterBeta(name, id, state, options);
        }
    }

    public sealed class KubernetesClusterBetaArgs : Pulumi.ResourceArgs
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

        /// <summary>
        /// The auto upgrade configuration.
        /// </summary>
        [Input("autoUpgrade")]
        public Input<Inputs.KubernetesClusterBetaAutoUpgradeArgs>? AutoUpgrade { get; set; }

        /// <summary>
        /// The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
        /// </summary>
        [Input("autoscalerConfig")]
        public Input<Inputs.KubernetesClusterBetaAutoscalerConfigArgs>? AutoscalerConfig { get; set; }

        /// <summary>
        /// The Container Network Interface (CNI) for the Kubernetes cluster.
        /// &gt; **Important:** Updates to this field will recreate a new resource.
        /// </summary>
        [Input("cni", required: true)]
        public Input<string> Cni { get; set; } = null!;

        /// <summary>
        /// See below.
        /// </summary>
        [Input("defaultPool")]
        public Input<Inputs.KubernetesClusterBetaDefaultPoolArgs>? DefaultPool { get; set; }

        /// <summary>
        /// A description for the Kubernetes cluster.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Enables the [Kubernetes dashboard](https://github.com/kubernetes/dashboard) for the Kubernetes cluster.
        /// </summary>
        [Input("enableDashboard")]
        public Input<bool>? EnableDashboard { get; set; }

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
        /// The [ingress controller](https://kubernetes.io/docs/concepts/services-networking/ingress-controllers/) to be deployed on the Kubernetes cluster.
        /// </summary>
        [Input("ingress")]
        public Input<string>? Ingress { get; set; }

        /// <summary>
        /// The name for the Kubernetes cluster.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// `organization_id`) The ID of the organization the cluster is associated with.
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

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
        /// The version of the Kubernetes cluster.
        /// </summary>
        [Input("version", required: true)]
        public Input<string> Version { get; set; } = null!;

        public KubernetesClusterBetaArgs()
        {
        }
    }

    public sealed class KubernetesClusterBetaState : Pulumi.ResourceArgs
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

        /// <summary>
        /// The URL of the Kubernetes API server.
        /// </summary>
        [Input("apiserverUrl")]
        public Input<string>? ApiserverUrl { get; set; }

        /// <summary>
        /// The auto upgrade configuration.
        /// </summary>
        [Input("autoUpgrade")]
        public Input<Inputs.KubernetesClusterBetaAutoUpgradeGetArgs>? AutoUpgrade { get; set; }

        /// <summary>
        /// The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
        /// </summary>
        [Input("autoscalerConfig")]
        public Input<Inputs.KubernetesClusterBetaAutoscalerConfigGetArgs>? AutoscalerConfig { get; set; }

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
        /// See below.
        /// </summary>
        [Input("defaultPool")]
        public Input<Inputs.KubernetesClusterBetaDefaultPoolGetArgs>? DefaultPool { get; set; }

        /// <summary>
        /// A description for the Kubernetes cluster.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Enables the [Kubernetes dashboard](https://github.com/kubernetes/dashboard) for the Kubernetes cluster.
        /// </summary>
        [Input("enableDashboard")]
        public Input<bool>? EnableDashboard { get; set; }

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
        /// The [ingress controller](https://kubernetes.io/docs/concepts/services-networking/ingress-controllers/) to be deployed on the Kubernetes cluster.
        /// </summary>
        [Input("ingress")]
        public Input<string>? Ingress { get; set; }

        /// <summary>
        /// The kubeconfig configuration file of the Kubernetes cluster
        /// </summary>
        [Input("kubeconfig")]
        public Input<Inputs.KubernetesClusterBetaKubeconfigGetArgs>? Kubeconfig { get; set; }

        /// <summary>
        /// The name for the Kubernetes cluster.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// `organization_id`) The ID of the organization the cluster is associated with.
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

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

        public KubernetesClusterBetaState()
        {
        }
    }
}
