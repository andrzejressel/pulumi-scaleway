// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scaleway
{
    [ScalewayResourceType("scaleway:index/vpcPublicGatewayPatRule:VpcPublicGatewayPatRule")]
    public partial class VpcPublicGatewayPatRule : Pulumi.CustomResource
    {
        /// <summary>
        /// The date and time of the creation of the PAT rule
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// The ID of the gateway this PAT rule is applied to
        /// </summary>
        [Output("gatewayId")]
        public Output<string> GatewayId { get; private set; } = null!;

        /// <summary>
        /// The organization_id you want to attach the resource to
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;

        /// <summary>
        /// The private IP used in the PAT rule
        /// </summary>
        [Output("privateIp")]
        public Output<string> PrivateIp { get; private set; } = null!;

        /// <summary>
        /// The private port used in the PAT rule
        /// </summary>
        [Output("privatePort")]
        public Output<int> PrivatePort { get; private set; } = null!;

        /// <summary>
        /// The protocol used in the PAT rule
        /// </summary>
        [Output("protocol")]
        public Output<string?> Protocol { get; private set; } = null!;

        /// <summary>
        /// The public port used in the PAT rule
        /// </summary>
        [Output("publicPort")]
        public Output<int> PublicPort { get; private set; } = null!;

        /// <summary>
        /// The date and time of the last update of the PAT rule
        /// </summary>
        [Output("updatedAt")]
        public Output<string> UpdatedAt { get; private set; } = null!;

        /// <summary>
        /// The zone you want to attach the resource to
        /// </summary>
        [Output("zone")]
        public Output<string> Zone { get; private set; } = null!;


        /// <summary>
        /// Create a VpcPublicGatewayPatRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VpcPublicGatewayPatRule(string name, VpcPublicGatewayPatRuleArgs args, CustomResourceOptions? options = null)
            : base("scaleway:index/vpcPublicGatewayPatRule:VpcPublicGatewayPatRule", name, args ?? new VpcPublicGatewayPatRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VpcPublicGatewayPatRule(string name, Input<string> id, VpcPublicGatewayPatRuleState? state = null, CustomResourceOptions? options = null)
            : base("scaleway:index/vpcPublicGatewayPatRule:VpcPublicGatewayPatRule", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "https://github.com/pulumiverse/pulumi-scaleway/releases/download/${VERSION}",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing VpcPublicGatewayPatRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VpcPublicGatewayPatRule Get(string name, Input<string> id, VpcPublicGatewayPatRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new VpcPublicGatewayPatRule(name, id, state, options);
        }
    }

    public sealed class VpcPublicGatewayPatRuleArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the gateway this PAT rule is applied to
        /// </summary>
        [Input("gatewayId", required: true)]
        public Input<string> GatewayId { get; set; } = null!;

        /// <summary>
        /// The private IP used in the PAT rule
        /// </summary>
        [Input("privateIp", required: true)]
        public Input<string> PrivateIp { get; set; } = null!;

        /// <summary>
        /// The private port used in the PAT rule
        /// </summary>
        [Input("privatePort", required: true)]
        public Input<int> PrivatePort { get; set; } = null!;

        /// <summary>
        /// The protocol used in the PAT rule
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// The public port used in the PAT rule
        /// </summary>
        [Input("publicPort", required: true)]
        public Input<int> PublicPort { get; set; } = null!;

        /// <summary>
        /// The zone you want to attach the resource to
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public VpcPublicGatewayPatRuleArgs()
        {
        }
    }

    public sealed class VpcPublicGatewayPatRuleState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The date and time of the creation of the PAT rule
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// The ID of the gateway this PAT rule is applied to
        /// </summary>
        [Input("gatewayId")]
        public Input<string>? GatewayId { get; set; }

        /// <summary>
        /// The organization_id you want to attach the resource to
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// The private IP used in the PAT rule
        /// </summary>
        [Input("privateIp")]
        public Input<string>? PrivateIp { get; set; }

        /// <summary>
        /// The private port used in the PAT rule
        /// </summary>
        [Input("privatePort")]
        public Input<int>? PrivatePort { get; set; }

        /// <summary>
        /// The protocol used in the PAT rule
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// The public port used in the PAT rule
        /// </summary>
        [Input("publicPort")]
        public Input<int>? PublicPort { get; set; }

        /// <summary>
        /// The date and time of the last update of the PAT rule
        /// </summary>
        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        /// <summary>
        /// The zone you want to attach the resource to
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public VpcPublicGatewayPatRuleState()
        {
        }
    }
}
