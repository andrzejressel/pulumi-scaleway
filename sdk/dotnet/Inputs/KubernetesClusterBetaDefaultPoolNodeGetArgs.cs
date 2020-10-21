// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scaleway.Inputs
{

    public sealed class KubernetesClusterBetaDefaultPoolNodeGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name for the Kubernetes cluster.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("publicIp")]
        public Input<string>? PublicIp { get; set; }

        [Input("publicIpV6")]
        public Input<string>? PublicIpV6 { get; set; }

        /// <summary>
        /// The status of the Kubernetes cluster.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public KubernetesClusterBetaDefaultPoolNodeGetArgs()
        {
        }
    }
}
