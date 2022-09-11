// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs_Pulumi.Scaleway.Inputs
{

    public sealed class DomainRecordGeoIpArgs : global::Pulumi.ResourceArgs
    {
        [Input("matches", required: true)]
        private InputList<Inputs.DomainRecordGeoIpMatchArgs>? _matches;

        /// <summary>
        /// The list of matches. *(Can be more than 1)*
        /// </summary>
        public InputList<Inputs.DomainRecordGeoIpMatchArgs> Matches
        {
            get => _matches ?? (_matches = new InputList<Inputs.DomainRecordGeoIpMatchArgs>());
            set => _matches = value;
        }

        public DomainRecordGeoIpArgs()
        {
        }
        public static new DomainRecordGeoIpArgs Empty => new DomainRecordGeoIpArgs();
    }
}
