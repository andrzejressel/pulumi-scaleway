# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['Server']


class Server(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 boot_type: Optional[pulumi.Input[str]] = None,
                 bootscript: Optional[pulumi.Input[str]] = None,
                 cloudinit: Optional[pulumi.Input[str]] = None,
                 dynamic_ip_required: Optional[pulumi.Input[bool]] = None,
                 enable_ipv6: Optional[pulumi.Input[bool]] = None,
                 image: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 public_ip: Optional[pulumi.Input[str]] = None,
                 security_group: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 volumes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServerVolumeArgs']]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        **DEPRECATED**: This resource is deprecated and will be removed in `v2.0+`.
        Please use `InstanceServer` instead.

        Provides servers. This allows servers to be created, updated and deleted.
        For additional details please refer to [API documentation](https://developer.scaleway.com/#servers).

        ## Example Usage

        ```python
        import pulumi
        import pulumi_scaleway as scaleway

        test = scaleway.Server("test",
            image="5faef9cd-ea9b-4a63-9171-9e26bec03dbc",
            type="VC1M",
            volumes=[{
                "size_in_gb": 20,
                "type": "l_ssd",
            }])
        ```
        ## Volume

        You can attach additional volumes to your instance, which will share the lifetime
        of your `Server` resource.

        > **Warning:** Using the `volume` attribute does not modify the System Volume provided default with every `Server` instance. Instead it adds additional volumes to the server instance.

        > **Warning:** Some instance types require an additional volume to work. This includes for example *START-1M* and *VC1M*. If you run into this issue add an additional volume of the specified size.

        The `volume` mapping supports the following:

        * `type` - (Required) The type of volume. Can be `"l_ssd"`
        * `size_in_gb` - (Required) The size of the volume in gigabytes.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] boot_type: the boot mechanism for this server. Possible values include `local` and `bootscript`
        :param pulumi.Input[str] bootscript: server bootscript
        :param pulumi.Input[str] cloudinit: allows you to define cloudinit script for this server
        :param pulumi.Input[bool] dynamic_ip_required: make server publicly available
        :param pulumi.Input[bool] enable_ipv6: enable ipv6
        :param pulumi.Input[str] image: base image of server
        :param pulumi.Input[str] name: name of server
        :param pulumi.Input[str] public_ip: set a public ip previously created (a real ip is expected here, not its resource id)
        :param pulumi.Input[str] security_group: assign security group to server
        :param pulumi.Input[str] state: allows you to define the desired state of your server. Valid values include (`stopped`, `running`)
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: list of tags for server
        :param pulumi.Input[str] type: type of server
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServerVolumeArgs']]]] volumes: attach additional volumes to your instance (see below)
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['boot_type'] = boot_type
            __props__['bootscript'] = bootscript
            __props__['cloudinit'] = cloudinit
            __props__['dynamic_ip_required'] = dynamic_ip_required
            __props__['enable_ipv6'] = enable_ipv6
            if image is None:
                raise TypeError("Missing required property 'image'")
            __props__['image'] = image
            __props__['name'] = name
            __props__['public_ip'] = public_ip
            __props__['security_group'] = security_group
            __props__['state'] = state
            __props__['tags'] = tags
            if type is None:
                raise TypeError("Missing required property 'type'")
            __props__['type'] = type
            __props__['volumes'] = volumes
            __props__['private_ip'] = None
            __props__['public_ipv6'] = None
            __props__['state_detail'] = None
        super(Server, __self__).__init__(
            'scaleway:index/server:Server',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            boot_type: Optional[pulumi.Input[str]] = None,
            bootscript: Optional[pulumi.Input[str]] = None,
            cloudinit: Optional[pulumi.Input[str]] = None,
            dynamic_ip_required: Optional[pulumi.Input[bool]] = None,
            enable_ipv6: Optional[pulumi.Input[bool]] = None,
            image: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            private_ip: Optional[pulumi.Input[str]] = None,
            public_ip: Optional[pulumi.Input[str]] = None,
            public_ipv6: Optional[pulumi.Input[str]] = None,
            security_group: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None,
            state_detail: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            type: Optional[pulumi.Input[str]] = None,
            volumes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServerVolumeArgs']]]]] = None) -> 'Server':
        """
        Get an existing Server resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] boot_type: the boot mechanism for this server. Possible values include `local` and `bootscript`
        :param pulumi.Input[str] bootscript: server bootscript
        :param pulumi.Input[str] cloudinit: allows you to define cloudinit script for this server
        :param pulumi.Input[bool] dynamic_ip_required: make server publicly available
        :param pulumi.Input[bool] enable_ipv6: enable ipv6
        :param pulumi.Input[str] image: base image of server
        :param pulumi.Input[str] name: name of server
        :param pulumi.Input[str] private_ip: private ip of the new resource
        :param pulumi.Input[str] public_ip: set a public ip previously created (a real ip is expected here, not its resource id)
        :param pulumi.Input[str] public_ipv6: if `enable_ipv6` is set this contains the ipv6 address of your instance
        :param pulumi.Input[str] security_group: assign security group to server
        :param pulumi.Input[str] state: allows you to define the desired state of your server. Valid values include (`stopped`, `running`)
        :param pulumi.Input[str] state_detail: contains details from the scaleway API the state of your instance
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: list of tags for server
        :param pulumi.Input[str] type: type of server
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ServerVolumeArgs']]]] volumes: attach additional volumes to your instance (see below)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["boot_type"] = boot_type
        __props__["bootscript"] = bootscript
        __props__["cloudinit"] = cloudinit
        __props__["dynamic_ip_required"] = dynamic_ip_required
        __props__["enable_ipv6"] = enable_ipv6
        __props__["image"] = image
        __props__["name"] = name
        __props__["private_ip"] = private_ip
        __props__["public_ip"] = public_ip
        __props__["public_ipv6"] = public_ipv6
        __props__["security_group"] = security_group
        __props__["state"] = state
        __props__["state_detail"] = state_detail
        __props__["tags"] = tags
        __props__["type"] = type
        __props__["volumes"] = volumes
        return Server(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="bootType")
    def boot_type(self) -> pulumi.Output[str]:
        """
        the boot mechanism for this server. Possible values include `local` and `bootscript`
        """
        return pulumi.get(self, "boot_type")

    @property
    @pulumi.getter
    def bootscript(self) -> pulumi.Output[Optional[str]]:
        """
        server bootscript
        """
        return pulumi.get(self, "bootscript")

    @property
    @pulumi.getter
    def cloudinit(self) -> pulumi.Output[str]:
        """
        allows you to define cloudinit script for this server
        """
        return pulumi.get(self, "cloudinit")

    @property
    @pulumi.getter(name="dynamicIpRequired")
    def dynamic_ip_required(self) -> pulumi.Output[Optional[bool]]:
        """
        make server publicly available
        """
        return pulumi.get(self, "dynamic_ip_required")

    @property
    @pulumi.getter(name="enableIpv6")
    def enable_ipv6(self) -> pulumi.Output[Optional[bool]]:
        """
        enable ipv6
        """
        return pulumi.get(self, "enable_ipv6")

    @property
    @pulumi.getter
    def image(self) -> pulumi.Output[str]:
        """
        base image of server
        """
        return pulumi.get(self, "image")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        name of server
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="privateIp")
    def private_ip(self) -> pulumi.Output[str]:
        """
        private ip of the new resource
        """
        return pulumi.get(self, "private_ip")

    @property
    @pulumi.getter(name="publicIp")
    def public_ip(self) -> pulumi.Output[str]:
        """
        set a public ip previously created (a real ip is expected here, not its resource id)
        """
        return pulumi.get(self, "public_ip")

    @property
    @pulumi.getter(name="publicIpv6")
    def public_ipv6(self) -> pulumi.Output[str]:
        """
        if `enable_ipv6` is set this contains the ipv6 address of your instance
        """
        return pulumi.get(self, "public_ipv6")

    @property
    @pulumi.getter(name="securityGroup")
    def security_group(self) -> pulumi.Output[Optional[str]]:
        """
        assign security group to server
        """
        return pulumi.get(self, "security_group")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        allows you to define the desired state of your server. Valid values include (`stopped`, `running`)
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter(name="stateDetail")
    def state_detail(self) -> pulumi.Output[str]:
        """
        contains details from the scaleway API the state of your instance
        """
        return pulumi.get(self, "state_detail")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        list of tags for server
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        type of server
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def volumes(self) -> pulumi.Output[Optional[Sequence['outputs.ServerVolume']]]:
        """
        attach additional volumes to your instance (see below)
        """
        return pulumi.get(self, "volumes")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

