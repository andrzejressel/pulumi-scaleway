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

    public sealed class ObjectBucketLifecycleRuleExpirationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the number of days after object creation when the specific rule action takes effect.
        /// 
        /// &gt; **Important:**  If versioning is enabled, this rule only deletes the current version of an object.
        /// </summary>
        [Input("days", required: true)]
        public Input<int> Days { get; set; } = null!;

        public ObjectBucketLifecycleRuleExpirationArgs()
        {
        }
        public static new ObjectBucketLifecycleRuleExpirationArgs Empty => new ObjectBucketLifecycleRuleExpirationArgs();
    }
}
