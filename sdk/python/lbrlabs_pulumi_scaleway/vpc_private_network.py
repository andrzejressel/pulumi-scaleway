# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['VpcPrivateNetworkArgs', 'VpcPrivateNetwork']

@pulumi.input_type
class VpcPrivateNetworkArgs:
    def __init__(__self__, *,
                 ipv4_subnet: Optional[pulumi.Input['VpcPrivateNetworkIpv4SubnetArgs']] = None,
                 ipv6_subnets: Optional[pulumi.Input[Sequence[pulumi.Input['VpcPrivateNetworkIpv6SubnetArgs']]]] = None,
                 is_regional: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a VpcPrivateNetwork resource.
        :param pulumi.Input['VpcPrivateNetworkIpv4SubnetArgs'] ipv4_subnet: The IPv4 subnet to associate with the private network.
        :param pulumi.Input[Sequence[pulumi.Input['VpcPrivateNetworkIpv6SubnetArgs']]] ipv6_subnets: The IPv6 subnets to associate with the private network.
        :param pulumi.Input[bool] is_regional: The private networks are necessarily regional now.
        :param pulumi.Input[str] name: The name of the private network. If not provided it will be randomly generated.
        :param pulumi.Input[str] project_id: `project_id`) The ID of the project the private network is associated with.
        :param pulumi.Input[str] region: `region`) The region of the private network.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: The tags associated with the private network.
        :param pulumi.Input[str] vpc_id: The VPC in which to create the private network.
        :param pulumi.Input[str] zone: please use `region` instead - (Defaults to provider `zone`) The zone in which the private network should be created.
        """
        if ipv4_subnet is not None:
            pulumi.set(__self__, "ipv4_subnet", ipv4_subnet)
        if ipv6_subnets is not None:
            pulumi.set(__self__, "ipv6_subnets", ipv6_subnets)
        if is_regional is not None:
            warnings.warn("""This field is deprecated and will be removed in the next major version""", DeprecationWarning)
            pulumi.log.warn("""is_regional is deprecated: This field is deprecated and will be removed in the next major version""")
        if is_regional is not None:
            pulumi.set(__self__, "is_regional", is_regional)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if vpc_id is not None:
            pulumi.set(__self__, "vpc_id", vpc_id)
        if zone is not None:
            warnings.warn("""This field is deprecated and will be removed in the next major version, please use `region` instead""", DeprecationWarning)
            pulumi.log.warn("""zone is deprecated: This field is deprecated and will be removed in the next major version, please use `region` instead""")
        if zone is not None:
            pulumi.set(__self__, "zone", zone)

    @property
    @pulumi.getter(name="ipv4Subnet")
    def ipv4_subnet(self) -> Optional[pulumi.Input['VpcPrivateNetworkIpv4SubnetArgs']]:
        """
        The IPv4 subnet to associate with the private network.
        """
        return pulumi.get(self, "ipv4_subnet")

    @ipv4_subnet.setter
    def ipv4_subnet(self, value: Optional[pulumi.Input['VpcPrivateNetworkIpv4SubnetArgs']]):
        pulumi.set(self, "ipv4_subnet", value)

    @property
    @pulumi.getter(name="ipv6Subnets")
    def ipv6_subnets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['VpcPrivateNetworkIpv6SubnetArgs']]]]:
        """
        The IPv6 subnets to associate with the private network.
        """
        return pulumi.get(self, "ipv6_subnets")

    @ipv6_subnets.setter
    def ipv6_subnets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['VpcPrivateNetworkIpv6SubnetArgs']]]]):
        pulumi.set(self, "ipv6_subnets", value)

    @property
    @pulumi.getter(name="isRegional")
    def is_regional(self) -> Optional[pulumi.Input[bool]]:
        """
        The private networks are necessarily regional now.
        """
        warnings.warn("""This field is deprecated and will be removed in the next major version""", DeprecationWarning)
        pulumi.log.warn("""is_regional is deprecated: This field is deprecated and will be removed in the next major version""")

        return pulumi.get(self, "is_regional")

    @is_regional.setter
    def is_regional(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_regional", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the private network. If not provided it will be randomly generated.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        `project_id`) The ID of the project the private network is associated with.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        `region`) The region of the private network.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The tags associated with the private network.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The VPC in which to create the private network.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)

    @property
    @pulumi.getter
    def zone(self) -> Optional[pulumi.Input[str]]:
        """
        please use `region` instead - (Defaults to provider `zone`) The zone in which the private network should be created.
        """
        warnings.warn("""This field is deprecated and will be removed in the next major version, please use `region` instead""", DeprecationWarning)
        pulumi.log.warn("""zone is deprecated: This field is deprecated and will be removed in the next major version, please use `region` instead""")

        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone", value)


@pulumi.input_type
class _VpcPrivateNetworkState:
    def __init__(__self__, *,
                 created_at: Optional[pulumi.Input[str]] = None,
                 ipv4_subnet: Optional[pulumi.Input['VpcPrivateNetworkIpv4SubnetArgs']] = None,
                 ipv6_subnets: Optional[pulumi.Input[Sequence[pulumi.Input['VpcPrivateNetworkIpv6SubnetArgs']]]] = None,
                 is_regional: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 organization_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 updated_at: Optional[pulumi.Input[str]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering VpcPrivateNetwork resources.
        :param pulumi.Input[str] created_at: The date and time of the creation of the subnet.
        :param pulumi.Input['VpcPrivateNetworkIpv4SubnetArgs'] ipv4_subnet: The IPv4 subnet to associate with the private network.
        :param pulumi.Input[Sequence[pulumi.Input['VpcPrivateNetworkIpv6SubnetArgs']]] ipv6_subnets: The IPv6 subnets to associate with the private network.
        :param pulumi.Input[bool] is_regional: The private networks are necessarily regional now.
        :param pulumi.Input[str] name: The name of the private network. If not provided it will be randomly generated.
        :param pulumi.Input[str] organization_id: The organization ID the private network is associated with.
        :param pulumi.Input[str] project_id: `project_id`) The ID of the project the private network is associated with.
        :param pulumi.Input[str] region: `region`) The region of the private network.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: The tags associated with the private network.
        :param pulumi.Input[str] updated_at: The date and time of the last update of the subnet.
        :param pulumi.Input[str] vpc_id: The VPC in which to create the private network.
        :param pulumi.Input[str] zone: please use `region` instead - (Defaults to provider `zone`) The zone in which the private network should be created.
        """
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if ipv4_subnet is not None:
            pulumi.set(__self__, "ipv4_subnet", ipv4_subnet)
        if ipv6_subnets is not None:
            pulumi.set(__self__, "ipv6_subnets", ipv6_subnets)
        if is_regional is not None:
            warnings.warn("""This field is deprecated and will be removed in the next major version""", DeprecationWarning)
            pulumi.log.warn("""is_regional is deprecated: This field is deprecated and will be removed in the next major version""")
        if is_regional is not None:
            pulumi.set(__self__, "is_regional", is_regional)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if organization_id is not None:
            pulumi.set(__self__, "organization_id", organization_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if updated_at is not None:
            pulumi.set(__self__, "updated_at", updated_at)
        if vpc_id is not None:
            pulumi.set(__self__, "vpc_id", vpc_id)
        if zone is not None:
            warnings.warn("""This field is deprecated and will be removed in the next major version, please use `region` instead""", DeprecationWarning)
            pulumi.log.warn("""zone is deprecated: This field is deprecated and will be removed in the next major version, please use `region` instead""")
        if zone is not None:
            pulumi.set(__self__, "zone", zone)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time of the creation of the subnet.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter(name="ipv4Subnet")
    def ipv4_subnet(self) -> Optional[pulumi.Input['VpcPrivateNetworkIpv4SubnetArgs']]:
        """
        The IPv4 subnet to associate with the private network.
        """
        return pulumi.get(self, "ipv4_subnet")

    @ipv4_subnet.setter
    def ipv4_subnet(self, value: Optional[pulumi.Input['VpcPrivateNetworkIpv4SubnetArgs']]):
        pulumi.set(self, "ipv4_subnet", value)

    @property
    @pulumi.getter(name="ipv6Subnets")
    def ipv6_subnets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['VpcPrivateNetworkIpv6SubnetArgs']]]]:
        """
        The IPv6 subnets to associate with the private network.
        """
        return pulumi.get(self, "ipv6_subnets")

    @ipv6_subnets.setter
    def ipv6_subnets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['VpcPrivateNetworkIpv6SubnetArgs']]]]):
        pulumi.set(self, "ipv6_subnets", value)

    @property
    @pulumi.getter(name="isRegional")
    def is_regional(self) -> Optional[pulumi.Input[bool]]:
        """
        The private networks are necessarily regional now.
        """
        warnings.warn("""This field is deprecated and will be removed in the next major version""", DeprecationWarning)
        pulumi.log.warn("""is_regional is deprecated: This field is deprecated and will be removed in the next major version""")

        return pulumi.get(self, "is_regional")

    @is_regional.setter
    def is_regional(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "is_regional", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the private network. If not provided it will be randomly generated.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> Optional[pulumi.Input[str]]:
        """
        The organization ID the private network is associated with.
        """
        return pulumi.get(self, "organization_id")

    @organization_id.setter
    def organization_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "organization_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        `project_id`) The ID of the project the private network is associated with.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        `region`) The region of the private network.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The tags associated with the private network.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time of the last update of the subnet.
        """
        return pulumi.get(self, "updated_at")

    @updated_at.setter
    def updated_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated_at", value)

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> Optional[pulumi.Input[str]]:
        """
        The VPC in which to create the private network.
        """
        return pulumi.get(self, "vpc_id")

    @vpc_id.setter
    def vpc_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "vpc_id", value)

    @property
    @pulumi.getter
    def zone(self) -> Optional[pulumi.Input[str]]:
        """
        please use `region` instead - (Defaults to provider `zone`) The zone in which the private network should be created.
        """
        warnings.warn("""This field is deprecated and will be removed in the next major version, please use `region` instead""", DeprecationWarning)
        pulumi.log.warn("""zone is deprecated: This field is deprecated and will be removed in the next major version, please use `region` instead""")

        return pulumi.get(self, "zone")

    @zone.setter
    def zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "zone", value)


class VpcPrivateNetwork(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ipv4_subnet: Optional[pulumi.Input[pulumi.InputType['VpcPrivateNetworkIpv4SubnetArgs']]] = None,
                 ipv6_subnets: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VpcPrivateNetworkIpv6SubnetArgs']]]]] = None,
                 is_regional: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates and manages Scaleway VPC Private Networks.
        For more information, see [the documentation](https://developers.scaleway.com/en/products/vpc/api/#private-networks-ac2df4).

        ## Example

        ### Basic

        ```python
        import pulumi
        import lbrlabs_pulumi_scaleway as scaleway

        pn_priv = scaleway.VpcPrivateNetwork("pnPriv", tags=[
            "demo",
            "terraform",
        ])
        ```

        ### With subnets

        ```python
        import pulumi
        import lbrlabs_pulumi_scaleway as scaleway

        pn_priv = scaleway.VpcPrivateNetwork("pnPriv",
            ipv4_subnet=scaleway.VpcPrivateNetworkIpv4SubnetArgs(
                subnet="192.168.0.0/24",
            ),
            ipv6_subnets=[
                scaleway.VpcPrivateNetworkIpv6SubnetArgs(
                    subnet="fd46:78ab:30b8:177c::/64",
                ),
                scaleway.VpcPrivateNetworkIpv6SubnetArgs(
                    subnet="fd46:78ab:30b8:c7df::/64",
                ),
            ],
            tags=[
                "demo",
                "terraform",
            ])
        ```

        ## Import

        Private networks can be imported using the `{region}/{id}`, e.g. bash

        ```sh
         $ pulumi import scaleway:index/vpcPrivateNetwork:VpcPrivateNetwork vpc_demo fr-par/11111111-1111-1111-1111-111111111111
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['VpcPrivateNetworkIpv4SubnetArgs']] ipv4_subnet: The IPv4 subnet to associate with the private network.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VpcPrivateNetworkIpv6SubnetArgs']]]] ipv6_subnets: The IPv6 subnets to associate with the private network.
        :param pulumi.Input[bool] is_regional: The private networks are necessarily regional now.
        :param pulumi.Input[str] name: The name of the private network. If not provided it will be randomly generated.
        :param pulumi.Input[str] project_id: `project_id`) The ID of the project the private network is associated with.
        :param pulumi.Input[str] region: `region`) The region of the private network.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: The tags associated with the private network.
        :param pulumi.Input[str] vpc_id: The VPC in which to create the private network.
        :param pulumi.Input[str] zone: please use `region` instead - (Defaults to provider `zone`) The zone in which the private network should be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[VpcPrivateNetworkArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates and manages Scaleway VPC Private Networks.
        For more information, see [the documentation](https://developers.scaleway.com/en/products/vpc/api/#private-networks-ac2df4).

        ## Example

        ### Basic

        ```python
        import pulumi
        import lbrlabs_pulumi_scaleway as scaleway

        pn_priv = scaleway.VpcPrivateNetwork("pnPriv", tags=[
            "demo",
            "terraform",
        ])
        ```

        ### With subnets

        ```python
        import pulumi
        import lbrlabs_pulumi_scaleway as scaleway

        pn_priv = scaleway.VpcPrivateNetwork("pnPriv",
            ipv4_subnet=scaleway.VpcPrivateNetworkIpv4SubnetArgs(
                subnet="192.168.0.0/24",
            ),
            ipv6_subnets=[
                scaleway.VpcPrivateNetworkIpv6SubnetArgs(
                    subnet="fd46:78ab:30b8:177c::/64",
                ),
                scaleway.VpcPrivateNetworkIpv6SubnetArgs(
                    subnet="fd46:78ab:30b8:c7df::/64",
                ),
            ],
            tags=[
                "demo",
                "terraform",
            ])
        ```

        ## Import

        Private networks can be imported using the `{region}/{id}`, e.g. bash

        ```sh
         $ pulumi import scaleway:index/vpcPrivateNetwork:VpcPrivateNetwork vpc_demo fr-par/11111111-1111-1111-1111-111111111111
        ```

        :param str resource_name: The name of the resource.
        :param VpcPrivateNetworkArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(VpcPrivateNetworkArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ipv4_subnet: Optional[pulumi.Input[pulumi.InputType['VpcPrivateNetworkIpv4SubnetArgs']]] = None,
                 ipv6_subnets: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VpcPrivateNetworkIpv6SubnetArgs']]]]] = None,
                 is_regional: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 vpc_id: Optional[pulumi.Input[str]] = None,
                 zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = VpcPrivateNetworkArgs.__new__(VpcPrivateNetworkArgs)

            __props__.__dict__["ipv4_subnet"] = ipv4_subnet
            __props__.__dict__["ipv6_subnets"] = ipv6_subnets
            __props__.__dict__["is_regional"] = is_regional
            __props__.__dict__["name"] = name
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["region"] = region
            __props__.__dict__["tags"] = tags
            __props__.__dict__["vpc_id"] = vpc_id
            __props__.__dict__["zone"] = zone
            __props__.__dict__["created_at"] = None
            __props__.__dict__["organization_id"] = None
            __props__.__dict__["updated_at"] = None
        super(VpcPrivateNetwork, __self__).__init__(
            'scaleway:index/vpcPrivateNetwork:VpcPrivateNetwork',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            ipv4_subnet: Optional[pulumi.Input[pulumi.InputType['VpcPrivateNetworkIpv4SubnetArgs']]] = None,
            ipv6_subnets: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VpcPrivateNetworkIpv6SubnetArgs']]]]] = None,
            is_regional: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            organization_id: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            updated_at: Optional[pulumi.Input[str]] = None,
            vpc_id: Optional[pulumi.Input[str]] = None,
            zone: Optional[pulumi.Input[str]] = None) -> 'VpcPrivateNetwork':
        """
        Get an existing VpcPrivateNetwork resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created_at: The date and time of the creation of the subnet.
        :param pulumi.Input[pulumi.InputType['VpcPrivateNetworkIpv4SubnetArgs']] ipv4_subnet: The IPv4 subnet to associate with the private network.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['VpcPrivateNetworkIpv6SubnetArgs']]]] ipv6_subnets: The IPv6 subnets to associate with the private network.
        :param pulumi.Input[bool] is_regional: The private networks are necessarily regional now.
        :param pulumi.Input[str] name: The name of the private network. If not provided it will be randomly generated.
        :param pulumi.Input[str] organization_id: The organization ID the private network is associated with.
        :param pulumi.Input[str] project_id: `project_id`) The ID of the project the private network is associated with.
        :param pulumi.Input[str] region: `region`) The region of the private network.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: The tags associated with the private network.
        :param pulumi.Input[str] updated_at: The date and time of the last update of the subnet.
        :param pulumi.Input[str] vpc_id: The VPC in which to create the private network.
        :param pulumi.Input[str] zone: please use `region` instead - (Defaults to provider `zone`) The zone in which the private network should be created.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _VpcPrivateNetworkState.__new__(_VpcPrivateNetworkState)

        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["ipv4_subnet"] = ipv4_subnet
        __props__.__dict__["ipv6_subnets"] = ipv6_subnets
        __props__.__dict__["is_regional"] = is_regional
        __props__.__dict__["name"] = name
        __props__.__dict__["organization_id"] = organization_id
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["region"] = region
        __props__.__dict__["tags"] = tags
        __props__.__dict__["updated_at"] = updated_at
        __props__.__dict__["vpc_id"] = vpc_id
        __props__.__dict__["zone"] = zone
        return VpcPrivateNetwork(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        The date and time of the creation of the subnet.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="ipv4Subnet")
    def ipv4_subnet(self) -> pulumi.Output['outputs.VpcPrivateNetworkIpv4Subnet']:
        """
        The IPv4 subnet to associate with the private network.
        """
        return pulumi.get(self, "ipv4_subnet")

    @property
    @pulumi.getter(name="ipv6Subnets")
    def ipv6_subnets(self) -> pulumi.Output[Sequence['outputs.VpcPrivateNetworkIpv6Subnet']]:
        """
        The IPv6 subnets to associate with the private network.
        """
        return pulumi.get(self, "ipv6_subnets")

    @property
    @pulumi.getter(name="isRegional")
    def is_regional(self) -> pulumi.Output[bool]:
        """
        The private networks are necessarily regional now.
        """
        warnings.warn("""This field is deprecated and will be removed in the next major version""", DeprecationWarning)
        pulumi.log.warn("""is_regional is deprecated: This field is deprecated and will be removed in the next major version""")

        return pulumi.get(self, "is_regional")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the private network. If not provided it will be randomly generated.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="organizationId")
    def organization_id(self) -> pulumi.Output[str]:
        """
        The organization ID the private network is associated with.
        """
        return pulumi.get(self, "organization_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        `project_id`) The ID of the project the private network is associated with.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        `region`) The region of the private network.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        The tags associated with the private network.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> pulumi.Output[str]:
        """
        The date and time of the last update of the subnet.
        """
        return pulumi.get(self, "updated_at")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> pulumi.Output[str]:
        """
        The VPC in which to create the private network.
        """
        return pulumi.get(self, "vpc_id")

    @property
    @pulumi.getter
    def zone(self) -> pulumi.Output[str]:
        """
        please use `region` instead - (Defaults to provider `zone`) The zone in which the private network should be created.
        """
        warnings.warn("""This field is deprecated and will be removed in the next major version, please use `region` instead""", DeprecationWarning)
        pulumi.log.warn("""zone is deprecated: This field is deprecated and will be removed in the next major version, please use `region` instead""")

        return pulumi.get(self, "zone")

