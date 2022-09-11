# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['VpcGatewayNetworkArgs', 'VpcGatewayNetwork']

@pulumi.input_type
class VpcGatewayNetworkArgs:
    def __init__(__self__, *,
                 gateway_id: pulumi.Input[str],
                 private_network_id: pulumi.Input[str],
                 cleanup_dhcp: Optional[pulumi.Input[bool]] = None,
                 dhcp_id: Optional[pulumi.Input[str]] = None,
                 enable_dhcp: Optional[pulumi.Input[bool]] = None,
                 enable_masquerade: Optional[pulumi.Input[bool]] = None,
                 static_address: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a VpcGatewayNetwork resource.
        :param pulumi.Input[str] gateway_id: The ID of the public gateway.
        :param pulumi.Input[str] private_network_id: The ID of the private network.
        :param pulumi.Input[bool] cleanup_dhcp: Remove DHCP config on this network on destroy. It requires DHCP id.
        :param pulumi.Input[str] dhcp_id: The ID of the public gateway DHCP config.
        :param pulumi.Input[bool] enable_dhcp: Enable DHCP config on this network. It requires DHCP id.
        :param pulumi.Input[bool] enable_masquerade: Enable masquerade on this network
        :param pulumi.Input[str] static_address: Enable DHCP config on this network
        :param pulumi.Input[str] zone: `zone`) The zone in which the gateway network should be created.
        """
        pulumi.set(__self__, "gateway_id", gateway_id)
        pulumi.set(__self__, "private_network_id", private_network_id)
        if cleanup_dhcp is not None:
            pulumi.set(__self__, "cleanup_dhcp", cleanup_dhcp)
        if dhcp_id is not None:
            pulumi.set(__self__, "dhcp_id", dhcp_id)
        if enable_dhcp is not None:
            pulumi.set(__self__, "enable_dhcp", enable_dhcp)
        if enable_masquerade is not None:
            pulumi.set(__self__, "enable_masquerade", enable_masquerade)
        if static_address is not None:
            pulumi.set(__self__, "static_address", static_address)
        if zone is not None:
            pulumi.set(__self__, "zone", zone)

    @property
    @pulumi.getter(name="gatewayId")
    def gateway_id(self) -> pulumi.Input[str]:
        """
        The ID of the public gateway.
        """
        return pulumi.get(self, "gateway_id")

    @gateway_id.setter
    def gateway_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "gateway_id", value)

    @property
    @pulumi.getter(name="privateNetworkId")
    def private_network_id(self) -> pulumi.Input[str]:
        """
        The ID of the private network.
        """
        return pulumi.get(self, "private_network_id")

    @private_network_id.setter
    def private_network_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "private_network_id", value)

    @property
    @pulumi.getter(name="cleanupDhcp")
    def cleanup_dhcp(self) -> Optional[pulumi.Input[bool]]:
        """
        Remove DHCP config on this network on destroy. It requires DHCP id.
        """
        return pulumi.get(self, "cleanup_dhcp")

    @cleanup_dhcp.setter
    def cleanup_dhcp(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "cleanup_dhcp", value)

    @property
    @pulumi.getter(name="dhcpId")
    def dhcp_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the public gateway DHCP config.
        """
        return pulumi.get(self, "dhcp_id")

    @dhcp_id.setter
    def dhcp_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dhcp_id", value)

    @property
    @pulumi.getter(name="enableDhcp")
    def enable_dhcp(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable DHCP config on this network. It requires DHCP id.
        """
        return pulumi.get(self, "enable_dhcp")

    @enable_dhcp.setter
    def enable_dhcp(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_dhcp", value)

    @property
    @pulumi.getter(name="enableMasquerade")
    def enable_masquerade(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable masquerade on this network
        """
        return pulumi.get(self, "enable_masquerade")

    @enable_masquerade.setter
    def enable_masquerade(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_masquerade", value)

    @property
    @pulumi.getter(name="staticAddress")
    def static_address(self) -> Optional[pulumi.Input[str]]:
        """
        Enable DHCP config on this network
        """
        return pulumi.get(self, "static_address")

    @static_address.setter
    def static_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "static_address", value)

    @property
    @pulumi.getter
    def zone(self) -> Optional[pulumi.Input[str]]:
        """
        `zone`) The zone in which the gateway network should be created.
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone", value)


@pulumi.input_type
class _VpcGatewayNetworkState:
    def __init__(__self__, *,
                 cleanup_dhcp: Optional[pulumi.Input[bool]] = None,
                 created_at: Optional[pulumi.Input[str]] = None,
                 dhcp_id: Optional[pulumi.Input[str]] = None,
                 enable_dhcp: Optional[pulumi.Input[bool]] = None,
                 enable_masquerade: Optional[pulumi.Input[bool]] = None,
                 gateway_id: Optional[pulumi.Input[str]] = None,
                 mac_address: Optional[pulumi.Input[str]] = None,
                 private_network_id: Optional[pulumi.Input[str]] = None,
                 static_address: Optional[pulumi.Input[str]] = None,
                 updated_at: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering VpcGatewayNetwork resources.
        :param pulumi.Input[bool] cleanup_dhcp: Remove DHCP config on this network on destroy. It requires DHCP id.
        :param pulumi.Input[str] created_at: The date and time of the creation of the gateway network.
        :param pulumi.Input[str] dhcp_id: The ID of the public gateway DHCP config.
        :param pulumi.Input[bool] enable_dhcp: Enable DHCP config on this network. It requires DHCP id.
        :param pulumi.Input[bool] enable_masquerade: Enable masquerade on this network
        :param pulumi.Input[str] gateway_id: The ID of the public gateway.
        :param pulumi.Input[str] mac_address: The mac address of the creation of the gateway network.
        :param pulumi.Input[str] private_network_id: The ID of the private network.
        :param pulumi.Input[str] static_address: Enable DHCP config on this network
        :param pulumi.Input[str] updated_at: The date and time of the last update of the gateway network.
        :param pulumi.Input[str] zone: `zone`) The zone in which the gateway network should be created.
        """
        if cleanup_dhcp is not None:
            pulumi.set(__self__, "cleanup_dhcp", cleanup_dhcp)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if dhcp_id is not None:
            pulumi.set(__self__, "dhcp_id", dhcp_id)
        if enable_dhcp is not None:
            pulumi.set(__self__, "enable_dhcp", enable_dhcp)
        if enable_masquerade is not None:
            pulumi.set(__self__, "enable_masquerade", enable_masquerade)
        if gateway_id is not None:
            pulumi.set(__self__, "gateway_id", gateway_id)
        if mac_address is not None:
            pulumi.set(__self__, "mac_address", mac_address)
        if private_network_id is not None:
            pulumi.set(__self__, "private_network_id", private_network_id)
        if static_address is not None:
            pulumi.set(__self__, "static_address", static_address)
        if updated_at is not None:
            pulumi.set(__self__, "updated_at", updated_at)
        if zone is not None:
            pulumi.set(__self__, "zone", zone)

    @property
    @pulumi.getter(name="cleanupDhcp")
    def cleanup_dhcp(self) -> Optional[pulumi.Input[bool]]:
        """
        Remove DHCP config on this network on destroy. It requires DHCP id.
        """
        return pulumi.get(self, "cleanup_dhcp")

    @cleanup_dhcp.setter
    def cleanup_dhcp(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "cleanup_dhcp", value)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time of the creation of the gateway network.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter(name="dhcpId")
    def dhcp_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the public gateway DHCP config.
        """
        return pulumi.get(self, "dhcp_id")

    @dhcp_id.setter
    def dhcp_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dhcp_id", value)

    @property
    @pulumi.getter(name="enableDhcp")
    def enable_dhcp(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable DHCP config on this network. It requires DHCP id.
        """
        return pulumi.get(self, "enable_dhcp")

    @enable_dhcp.setter
    def enable_dhcp(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_dhcp", value)

    @property
    @pulumi.getter(name="enableMasquerade")
    def enable_masquerade(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable masquerade on this network
        """
        return pulumi.get(self, "enable_masquerade")

    @enable_masquerade.setter
    def enable_masquerade(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enable_masquerade", value)

    @property
    @pulumi.getter(name="gatewayId")
    def gateway_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the public gateway.
        """
        return pulumi.get(self, "gateway_id")

    @gateway_id.setter
    def gateway_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gateway_id", value)

    @property
    @pulumi.getter(name="macAddress")
    def mac_address(self) -> Optional[pulumi.Input[str]]:
        """
        The mac address of the creation of the gateway network.
        """
        return pulumi.get(self, "mac_address")

    @mac_address.setter
    def mac_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mac_address", value)

    @property
    @pulumi.getter(name="privateNetworkId")
    def private_network_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the private network.
        """
        return pulumi.get(self, "private_network_id")

    @private_network_id.setter
    def private_network_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "private_network_id", value)

    @property
    @pulumi.getter(name="staticAddress")
    def static_address(self) -> Optional[pulumi.Input[str]]:
        """
        Enable DHCP config on this network
        """
        return pulumi.get(self, "static_address")

    @static_address.setter
    def static_address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "static_address", value)

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time of the last update of the gateway network.
        """
        return pulumi.get(self, "updated_at")

    @updated_at.setter
    def updated_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated_at", value)

    @property
    @pulumi.getter
    def zone(self) -> Optional[pulumi.Input[str]]:
        """
        `zone`) The zone in which the gateway network should be created.
        """
        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone", value)


class VpcGatewayNetwork(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cleanup_dhcp: Optional[pulumi.Input[bool]] = None,
                 dhcp_id: Optional[pulumi.Input[str]] = None,
                 enable_dhcp: Optional[pulumi.Input[bool]] = None,
                 enable_masquerade: Optional[pulumi.Input[bool]] = None,
                 gateway_id: Optional[pulumi.Input[str]] = None,
                 private_network_id: Optional[pulumi.Input[str]] = None,
                 static_address: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates and manages Scaleway VPC Public Gateway Network.
        It allows attaching Private Networks to the VPC Public Gateway and your DHCP config
        For more information, see [the documentation](https://developers.scaleway.com/en/products/vpc-gw/api/v1/#step-3-attach-private-networks-to-the-vpc-public-gateway).

        ## Example

        ```python
        import pulumi
        import lbrlabs_pulumi_scaleway as scaleway

        pn01 = scaleway.VpcPrivateNetwork("pn01")
        gw01 = scaleway.VpcPublicGatewayIp("gw01")
        dhcp01 = scaleway.VpcPublicGatewayDhcp("dhcp01",
            subnet="192.168.1.0/24",
            push_default_route=True)
        pg01 = scaleway.VpcPublicGateway("pg01",
            type="VPC-GW-S",
            ip_id=gw01.id)
        main = scaleway.VpcGatewayNetwork("main",
            gateway_id=pg01.id,
            private_network_id=pn01.id,
            dhcp_id=dhcp01.id,
            cleanup_dhcp=True,
            enable_masquerade=True)
        ```

        ## Import

        Gateway network can be imported using the `{zone}/{id}`, e.g. bash

        ```sh
         $ pulumi import scaleway:index/vpcGatewayNetwork:VpcGatewayNetwork main fr-par-1/11111111-1111-1111-1111-111111111111
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] cleanup_dhcp: Remove DHCP config on this network on destroy. It requires DHCP id.
        :param pulumi.Input[str] dhcp_id: The ID of the public gateway DHCP config.
        :param pulumi.Input[bool] enable_dhcp: Enable DHCP config on this network. It requires DHCP id.
        :param pulumi.Input[bool] enable_masquerade: Enable masquerade on this network
        :param pulumi.Input[str] gateway_id: The ID of the public gateway.
        :param pulumi.Input[str] private_network_id: The ID of the private network.
        :param pulumi.Input[str] static_address: Enable DHCP config on this network
        :param pulumi.Input[str] zone: `zone`) The zone in which the gateway network should be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: VpcGatewayNetworkArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates and manages Scaleway VPC Public Gateway Network.
        It allows attaching Private Networks to the VPC Public Gateway and your DHCP config
        For more information, see [the documentation](https://developers.scaleway.com/en/products/vpc-gw/api/v1/#step-3-attach-private-networks-to-the-vpc-public-gateway).

        ## Example

        ```python
        import pulumi
        import lbrlabs_pulumi_scaleway as scaleway

        pn01 = scaleway.VpcPrivateNetwork("pn01")
        gw01 = scaleway.VpcPublicGatewayIp("gw01")
        dhcp01 = scaleway.VpcPublicGatewayDhcp("dhcp01",
            subnet="192.168.1.0/24",
            push_default_route=True)
        pg01 = scaleway.VpcPublicGateway("pg01",
            type="VPC-GW-S",
            ip_id=gw01.id)
        main = scaleway.VpcGatewayNetwork("main",
            gateway_id=pg01.id,
            private_network_id=pn01.id,
            dhcp_id=dhcp01.id,
            cleanup_dhcp=True,
            enable_masquerade=True)
        ```

        ## Import

        Gateway network can be imported using the `{zone}/{id}`, e.g. bash

        ```sh
         $ pulumi import scaleway:index/vpcGatewayNetwork:VpcGatewayNetwork main fr-par-1/11111111-1111-1111-1111-111111111111
        ```

        :param str resource_name: The name of the resource.
        :param VpcGatewayNetworkArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VpcGatewayNetworkArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cleanup_dhcp: Optional[pulumi.Input[bool]] = None,
                 dhcp_id: Optional[pulumi.Input[str]] = None,
                 enable_dhcp: Optional[pulumi.Input[bool]] = None,
                 enable_masquerade: Optional[pulumi.Input[bool]] = None,
                 gateway_id: Optional[pulumi.Input[str]] = None,
                 private_network_id: Optional[pulumi.Input[str]] = None,
                 static_address: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VpcGatewayNetworkArgs.__new__(VpcGatewayNetworkArgs)

            __props__.__dict__["cleanup_dhcp"] = cleanup_dhcp
            __props__.__dict__["dhcp_id"] = dhcp_id
            __props__.__dict__["enable_dhcp"] = enable_dhcp
            __props__.__dict__["enable_masquerade"] = enable_masquerade
            if gateway_id is None and not opts.urn:
                raise TypeError("Missing required property 'gateway_id'")
            __props__.__dict__["gateway_id"] = gateway_id
            if private_network_id is None and not opts.urn:
                raise TypeError("Missing required property 'private_network_id'")
            __props__.__dict__["private_network_id"] = private_network_id
            __props__.__dict__["static_address"] = static_address
            __props__.__dict__["zone"] = zone
            __props__.__dict__["created_at"] = None
            __props__.__dict__["mac_address"] = None
            __props__.__dict__["updated_at"] = None
        super(VpcGatewayNetwork, __self__).__init__(
            'scaleway:index/vpcGatewayNetwork:VpcGatewayNetwork',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cleanup_dhcp: Optional[pulumi.Input[bool]] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            dhcp_id: Optional[pulumi.Input[str]] = None,
            enable_dhcp: Optional[pulumi.Input[bool]] = None,
            enable_masquerade: Optional[pulumi.Input[bool]] = None,
            gateway_id: Optional[pulumi.Input[str]] = None,
            mac_address: Optional[pulumi.Input[str]] = None,
            private_network_id: Optional[pulumi.Input[str]] = None,
            static_address: Optional[pulumi.Input[str]] = None,
            updated_at: Optional[pulumi.Input[str]] = None,
            zone: Optional[pulumi.Input[str]] = None) -> 'VpcGatewayNetwork':
        """
        Get an existing VpcGatewayNetwork resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] cleanup_dhcp: Remove DHCP config on this network on destroy. It requires DHCP id.
        :param pulumi.Input[str] created_at: The date and time of the creation of the gateway network.
        :param pulumi.Input[str] dhcp_id: The ID of the public gateway DHCP config.
        :param pulumi.Input[bool] enable_dhcp: Enable DHCP config on this network. It requires DHCP id.
        :param pulumi.Input[bool] enable_masquerade: Enable masquerade on this network
        :param pulumi.Input[str] gateway_id: The ID of the public gateway.
        :param pulumi.Input[str] mac_address: The mac address of the creation of the gateway network.
        :param pulumi.Input[str] private_network_id: The ID of the private network.
        :param pulumi.Input[str] static_address: Enable DHCP config on this network
        :param pulumi.Input[str] updated_at: The date and time of the last update of the gateway network.
        :param pulumi.Input[str] zone: `zone`) The zone in which the gateway network should be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VpcGatewayNetworkState.__new__(_VpcGatewayNetworkState)

        __props__.__dict__["cleanup_dhcp"] = cleanup_dhcp
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["dhcp_id"] = dhcp_id
        __props__.__dict__["enable_dhcp"] = enable_dhcp
        __props__.__dict__["enable_masquerade"] = enable_masquerade
        __props__.__dict__["gateway_id"] = gateway_id
        __props__.__dict__["mac_address"] = mac_address
        __props__.__dict__["private_network_id"] = private_network_id
        __props__.__dict__["static_address"] = static_address
        __props__.__dict__["updated_at"] = updated_at
        __props__.__dict__["zone"] = zone
        return VpcGatewayNetwork(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="cleanupDhcp")
    def cleanup_dhcp(self) -> pulumi.Output[Optional[bool]]:
        """
        Remove DHCP config on this network on destroy. It requires DHCP id.
        """
        return pulumi.get(self, "cleanup_dhcp")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        The date and time of the creation of the gateway network.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="dhcpId")
    def dhcp_id(self) -> pulumi.Output[Optional[str]]:
        """
        The ID of the public gateway DHCP config.
        """
        return pulumi.get(self, "dhcp_id")

    @property
    @pulumi.getter(name="enableDhcp")
    def enable_dhcp(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable DHCP config on this network. It requires DHCP id.
        """
        return pulumi.get(self, "enable_dhcp")

    @property
    @pulumi.getter(name="enableMasquerade")
    def enable_masquerade(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable masquerade on this network
        """
        return pulumi.get(self, "enable_masquerade")

    @property
    @pulumi.getter(name="gatewayId")
    def gateway_id(self) -> pulumi.Output[str]:
        """
        The ID of the public gateway.
        """
        return pulumi.get(self, "gateway_id")

    @property
    @pulumi.getter(name="macAddress")
    def mac_address(self) -> pulumi.Output[str]:
        """
        The mac address of the creation of the gateway network.
        """
        return pulumi.get(self, "mac_address")

    @property
    @pulumi.getter(name="privateNetworkId")
    def private_network_id(self) -> pulumi.Output[str]:
        """
        The ID of the private network.
        """
        return pulumi.get(self, "private_network_id")

    @property
    @pulumi.getter(name="staticAddress")
    def static_address(self) -> pulumi.Output[Optional[str]]:
        """
        Enable DHCP config on this network
        """
        return pulumi.get(self, "static_address")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> pulumi.Output[str]:
        """
        The date and time of the last update of the gateway network.
        """
        return pulumi.get(self, "updated_at")

    @property
    @pulumi.getter
    def zone(self) -> pulumi.Output[str]:
        """
        `zone`) The zone in which the gateway network should be created.
        """
        return pulumi.get(self, "zone")

