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

    public sealed class MnqCredentialSqsSnsCredentialsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the key.
        /// </summary>
        [Input("accessKey")]
        public Input<string>? AccessKey { get; set; }

        /// <summary>
        /// List of permissions associated to this Credential. Only one of permissions may be set.
        /// </summary>
        [Input("permissions")]
        public Input<Inputs.MnqCredentialSqsSnsCredentialsPermissionsGetArgs>? Permissions { get; set; }

        [Input("secretKey")]
        private Input<string>? _secretKey;

        /// <summary>
        /// The Secret value of the key.
        /// </summary>
        public Input<string>? SecretKey
        {
            get => _secretKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public MnqCredentialSqsSnsCredentialsGetArgs()
        {
        }
        public static new MnqCredentialSqsSnsCredentialsGetArgs Empty => new MnqCredentialSqsSnsCredentialsGetArgs();
    }
}
