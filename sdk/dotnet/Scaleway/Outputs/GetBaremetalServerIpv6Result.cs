// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Scaleway.Outputs
{

    [OutputType]
    public sealed class GetBaremetalServerIpv6Result
    {
        public readonly string Address;
        /// <summary>
        /// The ID of the server.
        /// </summary>
        public readonly string Id;
        public readonly string Reverse;
        public readonly string Version;

        [OutputConstructor]
        private GetBaremetalServerIpv6Result(
            string address,

            string id,

            string reverse,

            string version)
        {
            Address = address;
            Id = id;
            Reverse = reverse;
            Version = version;
        }
    }
}
