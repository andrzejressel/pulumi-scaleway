# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['TemDomainArgs', 'TemDomain']

@pulumi.input_type
class TemDomainArgs:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a TemDomain resource.
        :param pulumi.Input[str] name: The domain name, must not be used in another Transactional Email Domain.
               > **Important** Updates to `name` will recreate the domain.
        :param pulumi.Input[str] project_id: `project_id`) The ID of the project the domain is associated with.
        :param pulumi.Input[str] region: `region`). The region in which the domain should be created.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if region is not None:
            pulumi.set(__self__, "region", region)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The domain name, must not be used in another Transactional Email Domain.
        > **Important** Updates to `name` will recreate the domain.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

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
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        `region`). The region in which the domain should be created.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)


@pulumi.input_type
class _TemDomainState:
    def __init__(__self__, *,
                 created_at: Optional[pulumi.Input[str]] = None,
                 dkim_config: Optional[pulumi.Input[str]] = None,
                 last_error: Optional[pulumi.Input[str]] = None,
                 last_valid_at: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 next_check_at: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 revoked_at: Optional[pulumi.Input[str]] = None,
                 spf_config: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering TemDomain resources.
        :param pulumi.Input[str] created_at: The date and time of the Transaction Email Domain's creation (RFC 3339 format).
        :param pulumi.Input[str] dkim_config: The DKIM public key, as should be recorded in the DNS zone.
        :param pulumi.Input[str] last_error: The error message if the last check failed.
        :param pulumi.Input[str] last_valid_at: The date and time the domain was last found to be valid (RFC 3339 format).
        :param pulumi.Input[str] name: The domain name, must not be used in another Transactional Email Domain.
               > **Important** Updates to `name` will recreate the domain.
        :param pulumi.Input[str] next_check_at: The date and time of the next scheduled check (RFC 3339 format).
        :param pulumi.Input[str] project_id: `project_id`) The ID of the project the domain is associated with.
        :param pulumi.Input[str] region: `region`). The region in which the domain should be created.
        :param pulumi.Input[str] revoked_at: The date and time of the revocation of the domain (RFC 3339 format).
        :param pulumi.Input[str] spf_config: The snippet of the SPF record that should be registered in the DNS zone.
        :param pulumi.Input[str] status: The status of the Transaction Email Domain.
        """
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if dkim_config is not None:
            pulumi.set(__self__, "dkim_config", dkim_config)
        if last_error is not None:
            pulumi.set(__self__, "last_error", last_error)
        if last_valid_at is not None:
            pulumi.set(__self__, "last_valid_at", last_valid_at)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if next_check_at is not None:
            pulumi.set(__self__, "next_check_at", next_check_at)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if revoked_at is not None:
            pulumi.set(__self__, "revoked_at", revoked_at)
        if spf_config is not None:
            pulumi.set(__self__, "spf_config", spf_config)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time of the Transaction Email Domain's creation (RFC 3339 format).
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter(name="dkimConfig")
    def dkim_config(self) -> Optional[pulumi.Input[str]]:
        """
        The DKIM public key, as should be recorded in the DNS zone.
        """
        return pulumi.get(self, "dkim_config")

    @dkim_config.setter
    def dkim_config(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dkim_config", value)

    @property
    @pulumi.getter(name="lastError")
    def last_error(self) -> Optional[pulumi.Input[str]]:
        """
        The error message if the last check failed.
        """
        return pulumi.get(self, "last_error")

    @last_error.setter
    def last_error(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_error", value)

    @property
    @pulumi.getter(name="lastValidAt")
    def last_valid_at(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time the domain was last found to be valid (RFC 3339 format).
        """
        return pulumi.get(self, "last_valid_at")

    @last_valid_at.setter
    def last_valid_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_valid_at", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The domain name, must not be used in another Transactional Email Domain.
        > **Important** Updates to `name` will recreate the domain.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="nextCheckAt")
    def next_check_at(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time of the next scheduled check (RFC 3339 format).
        """
        return pulumi.get(self, "next_check_at")

    @next_check_at.setter
    def next_check_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "next_check_at", value)

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
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        `region`). The region in which the domain should be created.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="revokedAt")
    def revoked_at(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time of the revocation of the domain (RFC 3339 format).
        """
        return pulumi.get(self, "revoked_at")

    @revoked_at.setter
    def revoked_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "revoked_at", value)

    @property
    @pulumi.getter(name="spfConfig")
    def spf_config(self) -> Optional[pulumi.Input[str]]:
        """
        The snippet of the SPF record that should be registered in the DNS zone.
        """
        return pulumi.get(self, "spf_config")

    @spf_config.setter
    def spf_config(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "spf_config", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the Transaction Email Domain.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class TemDomain(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates and manages Scaleway Transactional Email Domains.
        For more information see [the documentation](https://developers.scaleway.com/en/products/registry/api/).

        ## Examples

        ### Basic

        ```python
        import pulumi
        import lbrlabs_pulumi_scaleway as scaleway

        main = scaleway.TemDomain("main")
        ```

        ## Import

        Domains can be imported using the `{region}/{id}`, e.g. bash

        ```sh
         $ pulumi import scaleway:index/temDomain:TemDomain main fr-par/11111111-1111-1111-1111-111111111111
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The domain name, must not be used in another Transactional Email Domain.
               > **Important** Updates to `name` will recreate the domain.
        :param pulumi.Input[str] project_id: `project_id`) The ID of the project the domain is associated with.
        :param pulumi.Input[str] region: `region`). The region in which the domain should be created.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[TemDomainArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates and manages Scaleway Transactional Email Domains.
        For more information see [the documentation](https://developers.scaleway.com/en/products/registry/api/).

        ## Examples

        ### Basic

        ```python
        import pulumi
        import lbrlabs_pulumi_scaleway as scaleway

        main = scaleway.TemDomain("main")
        ```

        ## Import

        Domains can be imported using the `{region}/{id}`, e.g. bash

        ```sh
         $ pulumi import scaleway:index/temDomain:TemDomain main fr-par/11111111-1111-1111-1111-111111111111
        ```

        :param str resource_name: The name of the resource.
        :param TemDomainArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TemDomainArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TemDomainArgs.__new__(TemDomainArgs)

            __props__.__dict__["name"] = name
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["region"] = region
            __props__.__dict__["created_at"] = None
            __props__.__dict__["dkim_config"] = None
            __props__.__dict__["last_error"] = None
            __props__.__dict__["last_valid_at"] = None
            __props__.__dict__["next_check_at"] = None
            __props__.__dict__["revoked_at"] = None
            __props__.__dict__["spf_config"] = None
            __props__.__dict__["status"] = None
        super(TemDomain, __self__).__init__(
            'scaleway:index/temDomain:TemDomain',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            dkim_config: Optional[pulumi.Input[str]] = None,
            last_error: Optional[pulumi.Input[str]] = None,
            last_valid_at: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            next_check_at: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None,
            revoked_at: Optional[pulumi.Input[str]] = None,
            spf_config: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'TemDomain':
        """
        Get an existing TemDomain resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created_at: The date and time of the Transaction Email Domain's creation (RFC 3339 format).
        :param pulumi.Input[str] dkim_config: The DKIM public key, as should be recorded in the DNS zone.
        :param pulumi.Input[str] last_error: The error message if the last check failed.
        :param pulumi.Input[str] last_valid_at: The date and time the domain was last found to be valid (RFC 3339 format).
        :param pulumi.Input[str] name: The domain name, must not be used in another Transactional Email Domain.
               > **Important** Updates to `name` will recreate the domain.
        :param pulumi.Input[str] next_check_at: The date and time of the next scheduled check (RFC 3339 format).
        :param pulumi.Input[str] project_id: `project_id`) The ID of the project the domain is associated with.
        :param pulumi.Input[str] region: `region`). The region in which the domain should be created.
        :param pulumi.Input[str] revoked_at: The date and time of the revocation of the domain (RFC 3339 format).
        :param pulumi.Input[str] spf_config: The snippet of the SPF record that should be registered in the DNS zone.
        :param pulumi.Input[str] status: The status of the Transaction Email Domain.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TemDomainState.__new__(_TemDomainState)

        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["dkim_config"] = dkim_config
        __props__.__dict__["last_error"] = last_error
        __props__.__dict__["last_valid_at"] = last_valid_at
        __props__.__dict__["name"] = name
        __props__.__dict__["next_check_at"] = next_check_at
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["region"] = region
        __props__.__dict__["revoked_at"] = revoked_at
        __props__.__dict__["spf_config"] = spf_config
        __props__.__dict__["status"] = status
        return TemDomain(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        The date and time of the Transaction Email Domain's creation (RFC 3339 format).
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="dkimConfig")
    def dkim_config(self) -> pulumi.Output[str]:
        """
        The DKIM public key, as should be recorded in the DNS zone.
        """
        return pulumi.get(self, "dkim_config")

    @property
    @pulumi.getter(name="lastError")
    def last_error(self) -> pulumi.Output[str]:
        """
        The error message if the last check failed.
        """
        return pulumi.get(self, "last_error")

    @property
    @pulumi.getter(name="lastValidAt")
    def last_valid_at(self) -> pulumi.Output[str]:
        """
        The date and time the domain was last found to be valid (RFC 3339 format).
        """
        return pulumi.get(self, "last_valid_at")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The domain name, must not be used in another Transactional Email Domain.
        > **Important** Updates to `name` will recreate the domain.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nextCheckAt")
    def next_check_at(self) -> pulumi.Output[str]:
        """
        The date and time of the next scheduled check (RFC 3339 format).
        """
        return pulumi.get(self, "next_check_at")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        `project_id`) The ID of the project the domain is associated with.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        `region`). The region in which the domain should be created.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="revokedAt")
    def revoked_at(self) -> pulumi.Output[str]:
        """
        The date and time of the revocation of the domain (RFC 3339 format).
        """
        return pulumi.get(self, "revoked_at")

    @property
    @pulumi.getter(name="spfConfig")
    def spf_config(self) -> pulumi.Output[str]:
        """
        The snippet of the SPF record that should be registered in the DNS zone.
        """
        return pulumi.get(self, "spf_config")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the Transaction Email Domain.
        """
        return pulumi.get(self, "status")

