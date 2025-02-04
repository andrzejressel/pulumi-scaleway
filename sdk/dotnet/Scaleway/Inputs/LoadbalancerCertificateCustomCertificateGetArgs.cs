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

    public sealed class LoadbalancerCertificateCustomCertificateGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Full PEM-formatted certificate chain.
        /// 
        /// &gt; **Important:** Updates to `custom_certificate` will recreate the load-balancer certificate.
        /// </summary>
        [Input("certificateChain", required: true)]
        public Input<string> CertificateChain { get; set; } = null!;

        public LoadbalancerCertificateCustomCertificateGetArgs()
        {
        }
        public static new LoadbalancerCertificateCustomCertificateGetArgs Empty => new LoadbalancerCertificateCustomCertificateGetArgs();
    }
}
