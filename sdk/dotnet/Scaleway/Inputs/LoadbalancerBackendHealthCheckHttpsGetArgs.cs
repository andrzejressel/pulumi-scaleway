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

    public sealed class LoadbalancerBackendHealthCheckHttpsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The expected HTTP status code.
        /// </summary>
        [Input("code")]
        public Input<int>? Code { get; set; }

        /// <summary>
        /// The HTTP method to use for HC requests.
        /// </summary>
        [Input("method")]
        public Input<string>? Method { get; set; }

        /// <summary>
        /// The HTTP endpoint URL to call for HC requests.
        /// </summary>
        [Input("uri", required: true)]
        public Input<string> Uri { get; set; } = null!;

        public LoadbalancerBackendHealthCheckHttpsGetArgs()
        {
        }
        public static new LoadbalancerBackendHealthCheckHttpsGetArgs Empty => new LoadbalancerBackendHealthCheckHttpsGetArgs();
    }
}
