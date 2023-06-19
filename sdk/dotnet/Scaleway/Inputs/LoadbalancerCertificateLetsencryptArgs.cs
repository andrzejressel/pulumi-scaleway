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

    public sealed class LoadbalancerCertificateLetsencryptArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Main domain of the certificate. A new certificate will be created if this field is changed.
        /// </summary>
        [Input("commonName", required: true)]
        public Input<string> CommonName { get; set; } = null!;

        [Input("subjectAlternativeNames")]
        private InputList<string>? _subjectAlternativeNames;

        /// <summary>
        /// Array of alternative domain names.  A new certificate will be created if this field is changed.
        /// 
        /// &gt; **Important:** Updates to `letsencrypt` will recreate the load-balancer certificate.
        /// </summary>
        public InputList<string> SubjectAlternativeNames
        {
            get => _subjectAlternativeNames ?? (_subjectAlternativeNames = new InputList<string>());
            set => _subjectAlternativeNames = value;
        }

        public LoadbalancerCertificateLetsencryptArgs()
        {
        }
        public static new LoadbalancerCertificateLetsencryptArgs Empty => new LoadbalancerCertificateLetsencryptArgs();
    }
}
