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

    public sealed class DomainRecordGeoIpGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("matches", required: true)]
        private InputList<Inputs.DomainRecordGeoIpMatchGetArgs>? _matches;

        /// <summary>
        /// The list of matches. *(Can be more than 1)*
        /// </summary>
        public InputList<Inputs.DomainRecordGeoIpMatchGetArgs> Matches
        {
            get => _matches ?? (_matches = new InputList<Inputs.DomainRecordGeoIpMatchGetArgs>());
            set => _matches = value;
        }

        public DomainRecordGeoIpGetArgs()
        {
        }
        public static new DomainRecordGeoIpGetArgs Empty => new DomainRecordGeoIpGetArgs();
    }
}
