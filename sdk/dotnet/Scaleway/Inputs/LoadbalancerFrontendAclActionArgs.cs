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

    public sealed class LoadbalancerFrontendAclActionArgs : global::Pulumi.ResourceArgs
    {
        [Input("redirects")]
        private InputList<Inputs.LoadbalancerFrontendAclActionRedirectArgs>? _redirects;

        /// <summary>
        /// Redirect parameters when using an ACL with `redirect` action.
        /// </summary>
        public InputList<Inputs.LoadbalancerFrontendAclActionRedirectArgs> Redirects
        {
            get => _redirects ?? (_redirects = new InputList<Inputs.LoadbalancerFrontendAclActionRedirectArgs>());
            set => _redirects = value;
        }

        /// <summary>
        /// The redirect type. Possible values are: `location` or `scheme`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public LoadbalancerFrontendAclActionArgs()
        {
        }
        public static new LoadbalancerFrontendAclActionArgs Empty => new LoadbalancerFrontendAclActionArgs();
    }
}
