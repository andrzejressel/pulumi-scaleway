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

    public sealed class LoadbalancerFrontendAclArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Action to undertake when an ACL filter matches.
        /// </summary>
        [Input("action", required: true)]
        public Input<Inputs.LoadbalancerFrontendAclActionArgs> Action { get; set; } = null!;

        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The ACL match rule. At least `ip_subnet` or `http_filter` and `http_filter_value` are required.
        /// </summary>
        [Input("match", required: true)]
        public Input<Inputs.LoadbalancerFrontendAclMatchArgs> Match { get; set; } = null!;

        /// <summary>
        /// The ACL name. If not provided it will be randomly generated.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        public LoadbalancerFrontendAclArgs()
        {
        }
        public static new LoadbalancerFrontendAclArgs Empty => new LoadbalancerFrontendAclArgs();
    }
}
