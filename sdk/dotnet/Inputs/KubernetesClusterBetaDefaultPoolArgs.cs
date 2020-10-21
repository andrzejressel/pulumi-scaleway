// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scaleway.Inputs
{

    public sealed class KubernetesClusterBetaDefaultPoolArgs : Pulumi.ResourceArgs
    {
        [Input("autohealing")]
        public Input<bool>? Autohealing { get; set; }

        [Input("autoscaling")]
        public Input<bool>? Autoscaling { get; set; }

        [Input("containerRuntime")]
        public Input<string>? ContainerRuntime { get; set; }

        /// <summary>
        /// The creation date of the cluster.
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        [Input("maxSize")]
        public Input<int>? MaxSize { get; set; }

        [Input("minSize")]
        public Input<int>? MinSize { get; set; }

        [Input("nodeType", required: true)]
        public Input<string> NodeType { get; set; } = null!;

        [Input("nodes")]
        private InputList<Inputs.KubernetesClusterBetaDefaultPoolNodeArgs>? _nodes;
        public InputList<Inputs.KubernetesClusterBetaDefaultPoolNodeArgs> Nodes
        {
            get => _nodes ?? (_nodes = new InputList<Inputs.KubernetesClusterBetaDefaultPoolNodeArgs>());
            set => _nodes = value;
        }

        [Input("placementGroupId")]
        public Input<string>? PlacementGroupId { get; set; }

        [Input("poolId")]
        public Input<string>? PoolId { get; set; }

        [Input("size", required: true)]
        public Input<int> Size { get; set; } = null!;

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
        [Obsolete(@"This fields is deprecated and will be removed in the next major version, please use scaleway_k8s_pool_beta instead.")]
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

        [Input("waitForPoolReady")]
        public Input<bool>? WaitForPoolReady { get; set; }

        public KubernetesClusterBetaDefaultPoolArgs()
        {
        }
    }
}
