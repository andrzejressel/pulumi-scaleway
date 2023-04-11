// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Scaleway.Inputs
{

    public sealed class RedisClusterPublicNetworkGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The UUID of the private network resource.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        [Input("ips")]
        private InputList<string>? _ips;

        /// <summary>
        /// Lis of IPv4 address of the endpoint (IP address).
        /// </summary>
        public InputList<string> Ips
        {
            get => _ips ?? (_ips = new InputList<string>());
            set => _ips = value;
        }

        /// <summary>
        /// TCP port of the endpoint.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        public RedisClusterPublicNetworkGetArgs()
        {
        }
        public static new RedisClusterPublicNetworkGetArgs Empty => new RedisClusterPublicNetworkGetArgs();
    }
}
