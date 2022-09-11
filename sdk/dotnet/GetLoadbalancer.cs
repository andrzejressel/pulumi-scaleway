// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs_Pulumi.Scaleway
{
    public static class GetLoadbalancer
    {
        /// <summary>
        /// Gets information about a Load Balancer.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Scaleway = Pulumi.Scaleway;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var byName = Scaleway.GetLoadbalancer.Invoke(new()
        ///     {
        ///         Name = "foobar",
        ///     });
        /// 
        ///     var byId = Scaleway.GetLoadbalancer.Invoke(new()
        ///     {
        ///         LbId = "11111111-1111-1111-1111-111111111111",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetLoadbalancerResult> InvokeAsync(GetLoadbalancerArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetLoadbalancerResult>("scaleway:index/getLoadbalancer:getLoadbalancer", args ?? new GetLoadbalancerArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about a Load Balancer.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Scaleway = Pulumi.Scaleway;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var byName = Scaleway.GetLoadbalancer.Invoke(new()
        ///     {
        ///         Name = "foobar",
        ///     });
        /// 
        ///     var byId = Scaleway.GetLoadbalancer.Invoke(new()
        ///     {
        ///         LbId = "11111111-1111-1111-1111-111111111111",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetLoadbalancerResult> Invoke(GetLoadbalancerInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetLoadbalancerResult>("scaleway:index/getLoadbalancer:getLoadbalancer", args ?? new GetLoadbalancerInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLoadbalancerArgs : global::Pulumi.InvokeArgs
    {
        [Input("lbId")]
        public string? LbId { get; set; }

        /// <summary>
        /// The IP address.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        [Input("releaseIp")]
        public bool? ReleaseIp { get; set; }

        /// <summary>
        /// (Defaults to provider `region`) The region in which the LB exists.
        /// </summary>
        [Input("zone")]
        public string? Zone { get; set; }

        public GetLoadbalancerArgs()
        {
        }
        public static new GetLoadbalancerArgs Empty => new GetLoadbalancerArgs();
    }

    public sealed class GetLoadbalancerInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("lbId")]
        public Input<string>? LbId { get; set; }

        /// <summary>
        /// The IP address.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("releaseIp")]
        public Input<bool>? ReleaseIp { get; set; }

        /// <summary>
        /// (Defaults to provider `region`) The region in which the LB exists.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public GetLoadbalancerInvokeArgs()
        {
        }
        public static new GetLoadbalancerInvokeArgs Empty => new GetLoadbalancerInvokeArgs();
    }


    [OutputType]
    public sealed class GetLoadbalancerResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The load-balancer public IP Address.
        /// </summary>
        public readonly string IpAddress;
        public readonly string IpId;
        public readonly string? LbId;
        public readonly string? Name;
        public readonly string OrganizationId;
        public readonly ImmutableArray<Outputs.GetLoadbalancerPrivateNetworkResult> PrivateNetworks;
        /// <summary>
        /// (Defaults to provider `project_id`) The ID of the project the LB is associated with.
        /// </summary>
        public readonly string ProjectId;
        public readonly string Region;
        public readonly bool? ReleaseIp;
        /// <summary>
        /// The tags associated with the load-balancers.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// The type of the load-balancer.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// (Defaults to provider `region`) The region in which the LB exists.
        /// </summary>
        public readonly string? Zone;

        [OutputConstructor]
        private GetLoadbalancerResult(
            string id,

            string ipAddress,

            string ipId,

            string? lbId,

            string? name,

            string organizationId,

            ImmutableArray<Outputs.GetLoadbalancerPrivateNetworkResult> privateNetworks,

            string projectId,

            string region,

            bool? releaseIp,

            ImmutableArray<string> tags,

            string type,

            string? zone)
        {
            Id = id;
            IpAddress = ipAddress;
            IpId = ipId;
            LbId = lbId;
            Name = name;
            OrganizationId = organizationId;
            PrivateNetworks = privateNetworks;
            ProjectId = projectId;
            Region = region;
            ReleaseIp = releaseIp;
            Tags = tags;
            Type = type;
            Zone = zone;
        }
    }
}
