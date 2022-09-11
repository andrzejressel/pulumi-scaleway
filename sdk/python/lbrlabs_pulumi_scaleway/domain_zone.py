# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['DomainZoneArgs', 'DomainZone']

@pulumi.input_type
class DomainZoneArgs:
    def __init__(__self__, *,
                 domain: pulumi.Input[str],
                 subdomain: pulumi.Input[str],
                 project_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a DomainZone resource.
        :param pulumi.Input[str] domain: The domain where the DNS zone will be created.
        :param pulumi.Input[str] subdomain: The subdomain(zone name) to create in the domain.
        :param pulumi.Input[str] project_id: `project_id`) The ID of the project the domain is associated with.
        """
        pulumi.set(__self__, "domain", domain)
        pulumi.set(__self__, "subdomain", subdomain)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Input[str]:
        """
        The domain where the DNS zone will be created.
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: pulumi.Input[str]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter
    def subdomain(self) -> pulumi.Input[str]:
        """
        The subdomain(zone name) to create in the domain.
        """
        return pulumi.get(self, "subdomain")

    @subdomain.setter
    def subdomain(self, value: pulumi.Input[str]):
        pulumi.set(self, "subdomain", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        `project_id`) The ID of the project the domain is associated with.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)


@pulumi.input_type
class _DomainZoneState:
    def __init__(__self__, *,
                 domain: Optional[pulumi.Input[str]] = None,
                 message: Optional[pulumi.Input[str]] = None,
                 ns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 ns_defaults: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 ns_masters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 subdomain: Optional[pulumi.Input[str]] = None,
                 updated_at: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DomainZone resources.
        :param pulumi.Input[str] domain: The domain where the DNS zone will be created.
        :param pulumi.Input[str] message: Message
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ns: NameServer list for zone.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ns_defaults: NameServer default list for zone.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ns_masters: NameServer master list for zone.
        :param pulumi.Input[str] project_id: `project_id`) The ID of the project the domain is associated with.
        :param pulumi.Input[str] status: The domain zone status.
        :param pulumi.Input[str] subdomain: The subdomain(zone name) to create in the domain.
        :param pulumi.Input[str] updated_at: The date and time of the last update of the DNS zone.
        """
        if domain is not None:
            pulumi.set(__self__, "domain", domain)
        if message is not None:
            pulumi.set(__self__, "message", message)
        if ns is not None:
            pulumi.set(__self__, "ns", ns)
        if ns_defaults is not None:
            pulumi.set(__self__, "ns_defaults", ns_defaults)
        if ns_masters is not None:
            pulumi.set(__self__, "ns_masters", ns_masters)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if subdomain is not None:
            pulumi.set(__self__, "subdomain", subdomain)
        if updated_at is not None:
            pulumi.set(__self__, "updated_at", updated_at)

    @property
    @pulumi.getter
    def domain(self) -> Optional[pulumi.Input[str]]:
        """
        The domain where the DNS zone will be created.
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter
    def message(self) -> Optional[pulumi.Input[str]]:
        """
        Message
        """
        return pulumi.get(self, "message")

    @message.setter
    def message(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "message", value)

    @property
    @pulumi.getter
    def ns(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        NameServer list for zone.
        """
        return pulumi.get(self, "ns")

    @ns.setter
    def ns(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "ns", value)

    @property
    @pulumi.getter(name="nsDefaults")
    def ns_defaults(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        NameServer default list for zone.
        """
        return pulumi.get(self, "ns_defaults")

    @ns_defaults.setter
    def ns_defaults(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "ns_defaults", value)

    @property
    @pulumi.getter(name="nsMasters")
    def ns_masters(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        NameServer master list for zone.
        """
        return pulumi.get(self, "ns_masters")

    @ns_masters.setter
    def ns_masters(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "ns_masters", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        `project_id`) The ID of the project the domain is associated with.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The domain zone status.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def subdomain(self) -> Optional[pulumi.Input[str]]:
        """
        The subdomain(zone name) to create in the domain.
        """
        return pulumi.get(self, "subdomain")

    @subdomain.setter
    def subdomain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subdomain", value)

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time of the last update of the DNS zone.
        """
        return pulumi.get(self, "updated_at")

    @updated_at.setter
    def updated_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated_at", value)


class DomainZone(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 subdomain: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates and manages Scaleway Domain zone.\\
        For more information, see [the documentation](https://www.scaleway.com/en/docs/scaleway-dns/).

        ## Examples

        ```python
        import pulumi
        import lbrlabs_pulumi_scaleway as scaleway

        test = scaleway.DomainZone("test",
            domain="scaleway-terraform.com",
            subdomain="test")
        ```

        ## Import

        Zone can be imported using the `{subdomain}.{domain}`, e.g. bash

        ```sh
         $ pulumi import scaleway:index/domainZone:DomainZone test test.scaleway-terraform.com
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain: The domain where the DNS zone will be created.
        :param pulumi.Input[str] project_id: `project_id`) The ID of the project the domain is associated with.
        :param pulumi.Input[str] subdomain: The subdomain(zone name) to create in the domain.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DomainZoneArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates and manages Scaleway Domain zone.\\
        For more information, see [the documentation](https://www.scaleway.com/en/docs/scaleway-dns/).

        ## Examples

        ```python
        import pulumi
        import lbrlabs_pulumi_scaleway as scaleway

        test = scaleway.DomainZone("test",
            domain="scaleway-terraform.com",
            subdomain="test")
        ```

        ## Import

        Zone can be imported using the `{subdomain}.{domain}`, e.g. bash

        ```sh
         $ pulumi import scaleway:index/domainZone:DomainZone test test.scaleway-terraform.com
        ```

        :param str resource_name: The name of the resource.
        :param DomainZoneArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DomainZoneArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 subdomain: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DomainZoneArgs.__new__(DomainZoneArgs)

            if domain is None and not opts.urn:
                raise TypeError("Missing required property 'domain'")
            __props__.__dict__["domain"] = domain
            __props__.__dict__["project_id"] = project_id
            if subdomain is None and not opts.urn:
                raise TypeError("Missing required property 'subdomain'")
            __props__.__dict__["subdomain"] = subdomain
            __props__.__dict__["message"] = None
            __props__.__dict__["ns"] = None
            __props__.__dict__["ns_defaults"] = None
            __props__.__dict__["ns_masters"] = None
            __props__.__dict__["status"] = None
            __props__.__dict__["updated_at"] = None
        super(DomainZone, __self__).__init__(
            'scaleway:index/domainZone:DomainZone',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            domain: Optional[pulumi.Input[str]] = None,
            message: Optional[pulumi.Input[str]] = None,
            ns: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            ns_defaults: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            ns_masters: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None,
            subdomain: Optional[pulumi.Input[str]] = None,
            updated_at: Optional[pulumi.Input[str]] = None) -> 'DomainZone':
        """
        Get an existing DomainZone resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] domain: The domain where the DNS zone will be created.
        :param pulumi.Input[str] message: Message
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ns: NameServer list for zone.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ns_defaults: NameServer default list for zone.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ns_masters: NameServer master list for zone.
        :param pulumi.Input[str] project_id: `project_id`) The ID of the project the domain is associated with.
        :param pulumi.Input[str] status: The domain zone status.
        :param pulumi.Input[str] subdomain: The subdomain(zone name) to create in the domain.
        :param pulumi.Input[str] updated_at: The date and time of the last update of the DNS zone.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DomainZoneState.__new__(_DomainZoneState)

        __props__.__dict__["domain"] = domain
        __props__.__dict__["message"] = message
        __props__.__dict__["ns"] = ns
        __props__.__dict__["ns_defaults"] = ns_defaults
        __props__.__dict__["ns_masters"] = ns_masters
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["status"] = status
        __props__.__dict__["subdomain"] = subdomain
        __props__.__dict__["updated_at"] = updated_at
        return DomainZone(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Output[str]:
        """
        The domain where the DNS zone will be created.
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter
    def message(self) -> pulumi.Output[str]:
        """
        Message
        """
        return pulumi.get(self, "message")

    @property
    @pulumi.getter
    def ns(self) -> pulumi.Output[Sequence[str]]:
        """
        NameServer list for zone.
        """
        return pulumi.get(self, "ns")

    @property
    @pulumi.getter(name="nsDefaults")
    def ns_defaults(self) -> pulumi.Output[Sequence[str]]:
        """
        NameServer default list for zone.
        """
        return pulumi.get(self, "ns_defaults")

    @property
    @pulumi.getter(name="nsMasters")
    def ns_masters(self) -> pulumi.Output[Sequence[str]]:
        """
        NameServer master list for zone.
        """
        return pulumi.get(self, "ns_masters")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        `project_id`) The ID of the project the domain is associated with.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The domain zone status.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def subdomain(self) -> pulumi.Output[str]:
        """
        The subdomain(zone name) to create in the domain.
        """
        return pulumi.get(self, "subdomain")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> pulumi.Output[str]:
        """
        The date and time of the last update of the DNS zone.
        """
        return pulumi.get(self, "updated_at")

