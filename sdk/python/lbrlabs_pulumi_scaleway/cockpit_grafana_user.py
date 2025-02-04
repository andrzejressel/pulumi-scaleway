# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['CockpitGrafanaUserArgs', 'CockpitGrafanaUser']

@pulumi.input_type
class CockpitGrafanaUserArgs:
    def __init__(__self__, *,
                 login: pulumi.Input[str],
                 role: pulumi.Input[str],
                 project_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a CockpitGrafanaUser resource.
        :param pulumi.Input[str] login: The login of the grafana user.
        :param pulumi.Input[str] role: The role of the grafana user. Must be `editor` or `viewer`.
        :param pulumi.Input[str] project_id: `project_id`) The ID of the project the cockpit is associated with.
        """
        pulumi.set(__self__, "login", login)
        pulumi.set(__self__, "role", role)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)

    @property
    @pulumi.getter
    def login(self) -> pulumi.Input[str]:
        """
        The login of the grafana user.
        """
        return pulumi.get(self, "login")

    @login.setter
    def login(self, value: pulumi.Input[str]):
        pulumi.set(self, "login", value)

    @property
    @pulumi.getter
    def role(self) -> pulumi.Input[str]:
        """
        The role of the grafana user. Must be `editor` or `viewer`.
        """
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: pulumi.Input[str]):
        pulumi.set(self, "role", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        `project_id`) The ID of the project the cockpit is associated with.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)


@pulumi.input_type
class _CockpitGrafanaUserState:
    def __init__(__self__, *,
                 login: Optional[pulumi.Input[str]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 role: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering CockpitGrafanaUser resources.
        :param pulumi.Input[str] login: The login of the grafana user.
        :param pulumi.Input[str] password: The password of the grafana user
        :param pulumi.Input[str] project_id: `project_id`) The ID of the project the cockpit is associated with.
        :param pulumi.Input[str] role: The role of the grafana user. Must be `editor` or `viewer`.
        """
        if login is not None:
            pulumi.set(__self__, "login", login)
        if password is not None:
            pulumi.set(__self__, "password", password)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if role is not None:
            pulumi.set(__self__, "role", role)

    @property
    @pulumi.getter
    def login(self) -> Optional[pulumi.Input[str]]:
        """
        The login of the grafana user.
        """
        return pulumi.get(self, "login")

    @login.setter
    def login(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "login", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        """
        The password of the grafana user
        """
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        `project_id`) The ID of the project the cockpit is associated with.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def role(self) -> Optional[pulumi.Input[str]]:
        """
        The role of the grafana user. Must be `editor` or `viewer`.
        """
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role", value)


class CockpitGrafanaUser(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 login: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates and manages Scaleway Cockpit Grafana Users.

        For more information consult the [documentation](https://www.scaleway.com/en/docs/observability/cockpit/concepts/#grafana-users).

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_scaleway as scaleway
        import pulumi_scaleway as scaleway

        main_cockpit = scaleway.get_cockpit()
        # Create an editor grafana user for the cockpit
        main_cockpit_grafana_user = scaleway.CockpitGrafanaUser("mainCockpitGrafanaUser",
            project_id=main_cockpit.project_id,
            login="my-awesome-user",
            role="editor")
        ```

        ## Import

        Cockpits Grafana Users can be imported using the project ID and the grafana user ID formatted `{project_id}/{grafana_user_id}`, e.g. bash

        ```sh
         $ pulumi import scaleway:index/cockpitGrafanaUser:CockpitGrafanaUser main 11111111-1111-1111-1111-111111111111/2
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] login: The login of the grafana user.
        :param pulumi.Input[str] project_id: `project_id`) The ID of the project the cockpit is associated with.
        :param pulumi.Input[str] role: The role of the grafana user. Must be `editor` or `viewer`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CockpitGrafanaUserArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates and manages Scaleway Cockpit Grafana Users.

        For more information consult the [documentation](https://www.scaleway.com/en/docs/observability/cockpit/concepts/#grafana-users).

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_scaleway as scaleway
        import pulumi_scaleway as scaleway

        main_cockpit = scaleway.get_cockpit()
        # Create an editor grafana user for the cockpit
        main_cockpit_grafana_user = scaleway.CockpitGrafanaUser("mainCockpitGrafanaUser",
            project_id=main_cockpit.project_id,
            login="my-awesome-user",
            role="editor")
        ```

        ## Import

        Cockpits Grafana Users can be imported using the project ID and the grafana user ID formatted `{project_id}/{grafana_user_id}`, e.g. bash

        ```sh
         $ pulumi import scaleway:index/cockpitGrafanaUser:CockpitGrafanaUser main 11111111-1111-1111-1111-111111111111/2
        ```

        :param str resource_name: The name of the resource.
        :param CockpitGrafanaUserArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CockpitGrafanaUserArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 login: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = CockpitGrafanaUserArgs.__new__(CockpitGrafanaUserArgs)

            if login is None and not opts.urn:
                raise TypeError("Missing required property 'login'")
            __props__.__dict__["login"] = login
            __props__.__dict__["project_id"] = project_id
            if role is None and not opts.urn:
                raise TypeError("Missing required property 'role'")
            __props__.__dict__["role"] = role
            __props__.__dict__["password"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["password"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(CockpitGrafanaUser, __self__).__init__(
            'scaleway:index/cockpitGrafanaUser:CockpitGrafanaUser',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            login: Optional[pulumi.Input[str]] = None,
            password: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            role: Optional[pulumi.Input[str]] = None) -> 'CockpitGrafanaUser':
        """
        Get an existing CockpitGrafanaUser resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] login: The login of the grafana user.
        :param pulumi.Input[str] password: The password of the grafana user
        :param pulumi.Input[str] project_id: `project_id`) The ID of the project the cockpit is associated with.
        :param pulumi.Input[str] role: The role of the grafana user. Must be `editor` or `viewer`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _CockpitGrafanaUserState.__new__(_CockpitGrafanaUserState)

        __props__.__dict__["login"] = login
        __props__.__dict__["password"] = password
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["role"] = role
        return CockpitGrafanaUser(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def login(self) -> pulumi.Output[str]:
        """
        The login of the grafana user.
        """
        return pulumi.get(self, "login")

    @property
    @pulumi.getter
    def password(self) -> pulumi.Output[str]:
        """
        The password of the grafana user
        """
        return pulumi.get(self, "password")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        `project_id`) The ID of the project the cockpit is associated with.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def role(self) -> pulumi.Output[str]:
        """
        The role of the grafana user. Must be `editor` or `viewer`.
        """
        return pulumi.get(self, "role")

