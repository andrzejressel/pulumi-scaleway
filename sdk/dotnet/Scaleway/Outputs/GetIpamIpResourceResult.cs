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
    public sealed class GetIpamIpResourceResult
    {
        /// <summary>
        /// The ID of the resource that the IP is bound to.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// The type of the resource to get the IP from. [Documentation](https://pkg.go.dev/github.com/scaleway/scaleway-sdk-go@master/api/ipam/v1alpha1#pkg-constants) with type list.
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private GetIpamIpResourceResult(
            string? id,

            string? type)
        {
            Id = id;
            Type = type;
        }
    }
}
