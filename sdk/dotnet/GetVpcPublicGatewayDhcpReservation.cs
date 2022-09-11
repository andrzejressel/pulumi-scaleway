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
    public static class GetVpcPublicGatewayDhcpReservation
    {
        /// <summary>
        /// Gets information about a dhcp entries. For further information please check the
        /// API [documentation](https://developers.scaleway.com/en/products/vpc-gw/api/v1/#dhcp-entries-e40fb6)
        /// </summary>
        public static Task<GetVpcPublicGatewayDhcpReservationResult> InvokeAsync(GetVpcPublicGatewayDhcpReservationArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetVpcPublicGatewayDhcpReservationResult>("scaleway:index/getVpcPublicGatewayDhcpReservation:getVpcPublicGatewayDhcpReservation", args ?? new GetVpcPublicGatewayDhcpReservationArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about a dhcp entries. For further information please check the
        /// API [documentation](https://developers.scaleway.com/en/products/vpc-gw/api/v1/#dhcp-entries-e40fb6)
        /// </summary>
        public static Output<GetVpcPublicGatewayDhcpReservationResult> Invoke(GetVpcPublicGatewayDhcpReservationInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetVpcPublicGatewayDhcpReservationResult>("scaleway:index/getVpcPublicGatewayDhcpReservation:getVpcPublicGatewayDhcpReservation", args ?? new GetVpcPublicGatewayDhcpReservationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVpcPublicGatewayDhcpReservationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The MAC address of the reservation to retrieve
        /// </summary>
        [Input("macAddress")]
        public string? MacAddress { get; set; }

        /// <summary>
        /// The ID of the Reservation to retrieve
        /// </summary>
        [Input("reservationId")]
        public string? ReservationId { get; set; }

        /// <summary>
        /// `zone`) The zone in which
        /// the image exists.
        /// </summary>
        [Input("zone")]
        public string? Zone { get; set; }

        public GetVpcPublicGatewayDhcpReservationArgs()
        {
        }
        public static new GetVpcPublicGatewayDhcpReservationArgs Empty => new GetVpcPublicGatewayDhcpReservationArgs();
    }

    public sealed class GetVpcPublicGatewayDhcpReservationInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The MAC address of the reservation to retrieve
        /// </summary>
        [Input("macAddress")]
        public Input<string>? MacAddress { get; set; }

        /// <summary>
        /// The ID of the Reservation to retrieve
        /// </summary>
        [Input("reservationId")]
        public Input<string>? ReservationId { get; set; }

        /// <summary>
        /// `zone`) The zone in which
        /// the image exists.
        /// </summary>
        [Input("zone")]
        public Input<string>? Zone { get; set; }

        public GetVpcPublicGatewayDhcpReservationInvokeArgs()
        {
        }
        public static new GetVpcPublicGatewayDhcpReservationInvokeArgs Empty => new GetVpcPublicGatewayDhcpReservationInvokeArgs();
    }


    [OutputType]
    public sealed class GetVpcPublicGatewayDhcpReservationResult
    {
        /// <summary>
        /// The date and time of the creation of the public gateway DHCP config.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// The ID of the owning GatewayNetwork.
        /// </summary>
        public readonly string GatewayNetworkId;
        /// <summary>
        /// The Hostname of the client machine.
        /// </summary>
        public readonly string Hostname;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The IP address to give to the machine (IP address).
        /// </summary>
        public readonly string IpAddress;
        public readonly string? MacAddress;
        public readonly string? ReservationId;
        /// <summary>
        /// The reservation type, either static (DHCP reservation) or dynamic (DHCP lease). Possible values are reservation and lease.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// The date and time of the last update of the public gateway DHCP config.
        /// </summary>
        public readonly string UpdatedAt;
        public readonly string? Zone;

        [OutputConstructor]
        private GetVpcPublicGatewayDhcpReservationResult(
            string createdAt,

            string gatewayNetworkId,

            string hostname,

            string id,

            string ipAddress,

            string? macAddress,

            string? reservationId,

            string type,

            string updatedAt,

            string? zone)
        {
            CreatedAt = createdAt;
            GatewayNetworkId = gatewayNetworkId;
            Hostname = hostname;
            Id = id;
            IpAddress = ipAddress;
            MacAddress = macAddress;
            ReservationId = reservationId;
            Type = type;
            UpdatedAt = updatedAt;
            Zone = zone;
        }
    }
}
