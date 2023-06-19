// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Scaleway
{
    /// <summary>
    /// Creates and manages Scaleway VPC Private Networks.
    /// For more information, see [the documentation](https://developers.scaleway.com/en/products/vpc/api/#private-networks-ac2df4).
    /// 
    /// ## Example
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Scaleway = Lbrlabs.PulumiPackage.Scaleway;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var pnPriv = new Scaleway.VpcPrivateNetwork("pnPriv", new()
    ///     {
    ///         Tags = new[]
    ///         {
    ///             "demo",
    ///             "terraform",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// &gt; **Note:** Regional Private Network is now in Public Beta. You can create a regional private network directly using this resource by setting `is_regional` to `true`.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Scaleway = Lbrlabs.PulumiPackage.Scaleway;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var vpc01 = new Scaleway.Vpc("vpc01", new()
    ///     {
    ///         Tags = new[]
    ///         {
    ///             "terraform",
    ///             "vpc",
    ///         },
    ///     });
    /// 
    ///     var regionalPn = new Scaleway.VpcPrivateNetwork("regionalPn", new()
    ///     {
    ///         Tags = new[]
    ///         {
    ///             "terraform",
    ///             "pn",
    ///             "regional",
    ///         },
    ///         IsRegional = true,
    ///         VpcId = vpc01.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Private networks can be imported using the `{zone}/{id}` or `{region}/{id}` using beta, e.g. bash
    /// 
    /// ```sh
    ///  $ pulumi import scaleway:index/vpcPrivateNetwork:VpcPrivateNetwork vpc_demo fr-par-1/11111111-1111-1111-1111-111111111111
    /// ```
    /// 
    ///  bash
    /// 
    /// ```sh
    ///  $ pulumi import scaleway:index/vpcPrivateNetwork:VpcPrivateNetwork vpc_demo fr-par/11111111-1111-1111-1111-111111111111
    /// ```
    /// </summary>
    [ScalewayResourceType("scaleway:index/vpcPrivateNetwork:VpcPrivateNetwork")]
    public partial class VpcPrivateNetwork : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The date and time of the creation of the private network
        /// </summary>
        [Output("createdAt")]
        public Output<string> CreatedAt { get; private set; } = null!;

        /// <summary>
        /// The IPv4 subnet associated with the private network.
        /// </summary>
        [Output("ipv4Subnet")]
        public Output<Outputs.VpcPrivateNetworkIpv4Subnet> Ipv4Subnet { get; private set; } = null!;

        /// <summary>
        /// The IPv6 subnets associated with the private network.
        /// 
        /// &gt; **Note:** If using Regional Private Network:
        /// </summary>
        [Output("ipv6Subnets")]
        public Output<ImmutableArray<Outputs.VpcPrivateNetworkIpv6Subnet>> Ipv6Subnets { get; private set; } = null!;

        /// <summary>
        /// Defines whether the private network is Regional. By default, it will be Zonal.
        /// </summary>
        [Output("isRegional")]
        public Output<bool> IsRegional { get; private set; } = null!;

        /// <summary>
        /// The name of the private network. If not provided it will be randomly generated.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The organization ID the private network is associated with.
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;

        /// <summary>
        /// `project_id`) The ID of the project the private network is associated with.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// `region`) The region of the private network.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// The tags associated with the private network.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// The date and time of the last update of the private network
        /// </summary>
        [Output("updatedAt")]
        public Output<string> UpdatedAt { get; private set; } = null!;

        /// <summary>
        /// The VPC in which to create the private network.
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;

        /// <summary>
        /// `zone`) The zone in which the private network should be created.
        /// </summary>
        [Output("zone")]
        public Output<string> Zone { get; private set; } = null!;


        /// <summary>
        /// Create a VpcPrivateNetwork resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VpcPrivateNetwork(string name, VpcPrivateNetworkArgs? args = null, CustomResourceOptions? options = null)
            : base("scaleway:index/vpcPrivateNetwork:VpcPrivateNetwork", name, args ?? new VpcPrivateNetworkArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VpcPrivateNetwork(string name, Input<string> id, VpcPrivateNetworkState? state = null, CustomResourceOptions? options = null)
            : base("scaleway:index/vpcPrivateNetwork:VpcPrivateNetwork", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing VpcPrivateNetwork resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VpcPrivateNetwork Get(string name, Input<string> id, VpcPrivateNetworkState? state = null, CustomResourceOptions? options = null)
        {
            return new VpcPrivateNetwork(name, id, state, options);
        }
    }

    public sealed class VpcPrivateNetworkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IPv4 subnet associated with the private network.
        /// </summary>
        [Input("ipv4Subnet")]
        public Input<Inputs.VpcPrivateNetworkIpv4SubnetArgs>? Ipv4Subnet { get; set; }

        [Input("ipv6Subnets")]
        private InputList<Inputs.VpcPrivateNetworkIpv6SubnetArgs>? _ipv6Subnets;

        /// <summary>
        /// The IPv6 subnets associated with the private network.
        /// 
        /// &gt; **Note:** If using Regional Private Network:
        /// </summary>
        public InputList<Inputs.VpcPrivateNetworkIpv6SubnetArgs> Ipv6Subnets
        {
            get => _ipv6Subnets ?? (_ipv6Subnets = new InputList<Inputs.VpcPrivateNetworkIpv6SubnetArgs>());
            set => _ipv6Subnets = value;
        }

        /// <summary>
        /// Defines whether the private network is Regional. By default, it will be Zonal.
        /// </summary>
        [Input("isRegional")]
        public Input<bool>? IsRegional { get; set; }

        /// <summary>
        /// The name of the private network. If not provided it will be randomly generated.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// `project_id`) The ID of the project the private network is associated with.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// `region`) The region of the private network.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The tags associated with the private network.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The VPC in which to create the private network.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// `zone`) The zone in which the private network should be created.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public VpcPrivateNetworkArgs()
        {
        }
        public static new VpcPrivateNetworkArgs Empty => new VpcPrivateNetworkArgs();
    }

    public sealed class VpcPrivateNetworkState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The date and time of the creation of the private network
        /// </summary>
        [Input("createdAt")]
        public Input<string>? CreatedAt { get; set; }

        /// <summary>
        /// The IPv4 subnet associated with the private network.
        /// </summary>
        [Input("ipv4Subnet")]
        public Input<Inputs.VpcPrivateNetworkIpv4SubnetGetArgs>? Ipv4Subnet { get; set; }

        [Input("ipv6Subnets")]
        private InputList<Inputs.VpcPrivateNetworkIpv6SubnetGetArgs>? _ipv6Subnets;

        /// <summary>
        /// The IPv6 subnets associated with the private network.
        /// 
        /// &gt; **Note:** If using Regional Private Network:
        /// </summary>
        public InputList<Inputs.VpcPrivateNetworkIpv6SubnetGetArgs> Ipv6Subnets
        {
            get => _ipv6Subnets ?? (_ipv6Subnets = new InputList<Inputs.VpcPrivateNetworkIpv6SubnetGetArgs>());
            set => _ipv6Subnets = value;
        }

        /// <summary>
        /// Defines whether the private network is Regional. By default, it will be Zonal.
        /// </summary>
        [Input("isRegional")]
        public Input<bool>? IsRegional { get; set; }

        /// <summary>
        /// The name of the private network. If not provided it will be randomly generated.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The organization ID the private network is associated with.
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// `project_id`) The ID of the project the private network is associated with.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// `region`) The region of the private network.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The tags associated with the private network.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The date and time of the last update of the private network
        /// </summary>
        [Input("updatedAt")]
        public Input<string>? UpdatedAt { get; set; }

        /// <summary>
        /// The VPC in which to create the private network.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// `zone`) The zone in which the private network should be created.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public VpcPrivateNetworkState()
        {
        }
        public static new VpcPrivateNetworkState Empty => new VpcPrivateNetworkState();
    }
}
