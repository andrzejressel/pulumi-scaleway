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

__all__ = ['MnqSqsCredentialsArgs', 'MnqSqsCredentials']

@pulumi.input_type
class MnqSqsCredentialsArgs:
    def __init__(__self__, *,
                 name: Optional[pulumi.Input[str]] = None,
                 permissions: Optional[pulumi.Input['MnqSqsCredentialsPermissionsArgs']] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a MnqSqsCredentials resource.
        :param pulumi.Input[str] name: The unique name of the sqs credentials.
        :param pulumi.Input['MnqSqsCredentialsPermissionsArgs'] permissions: . List of permissions associated to these credentials. Only one of permissions may be set.
        :param pulumi.Input[str] project_id: `project_id`) The ID of the project the sqs is enabled for.
        :param pulumi.Input[str] region: `region`). The region in which sqs is enabled.
        """
        if name is not None:
            pulumi.set(__self__, "name", name)
        if permissions is not None:
            pulumi.set(__self__, "permissions", permissions)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if region is not None:
            pulumi.set(__self__, "region", region)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The unique name of the sqs credentials.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def permissions(self) -> Optional[pulumi.Input['MnqSqsCredentialsPermissionsArgs']]:
        """
        . List of permissions associated to these credentials. Only one of permissions may be set.
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: Optional[pulumi.Input['MnqSqsCredentialsPermissionsArgs']]):
        pulumi.set(self, "permissions", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        `project_id`) The ID of the project the sqs is enabled for.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        `region`). The region in which sqs is enabled.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)


@pulumi.input_type
class _MnqSqsCredentialsState:
    def __init__(__self__, *,
                 access_key: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 permissions: Optional[pulumi.Input['MnqSqsCredentialsPermissionsArgs']] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 secret_key: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering MnqSqsCredentials resources.
        :param pulumi.Input[str] access_key: The ID of the key.
        :param pulumi.Input[str] name: The unique name of the sqs credentials.
        :param pulumi.Input['MnqSqsCredentialsPermissionsArgs'] permissions: . List of permissions associated to these credentials. Only one of permissions may be set.
        :param pulumi.Input[str] project_id: `project_id`) The ID of the project the sqs is enabled for.
        :param pulumi.Input[str] region: `region`). The region in which sqs is enabled.
        :param pulumi.Input[str] secret_key: The secret value of the key.
        """
        if access_key is not None:
            pulumi.set(__self__, "access_key", access_key)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if permissions is not None:
            pulumi.set(__self__, "permissions", permissions)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if secret_key is not None:
            pulumi.set(__self__, "secret_key", secret_key)

    @property
    @pulumi.getter(name="accessKey")
    def access_key(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the key.
        """
        return pulumi.get(self, "access_key")

    @access_key.setter
    def access_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_key", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The unique name of the sqs credentials.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def permissions(self) -> Optional[pulumi.Input['MnqSqsCredentialsPermissionsArgs']]:
        """
        . List of permissions associated to these credentials. Only one of permissions may be set.
        """
        return pulumi.get(self, "permissions")

    @permissions.setter
    def permissions(self, value: Optional[pulumi.Input['MnqSqsCredentialsPermissionsArgs']]):
        pulumi.set(self, "permissions", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        `project_id`) The ID of the project the sqs is enabled for.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        `region`). The region in which sqs is enabled.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter(name="secretKey")
    def secret_key(self) -> Optional[pulumi.Input[str]]:
        """
        The secret value of the key.
        """
        return pulumi.get(self, "secret_key")

    @secret_key.setter
    def secret_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret_key", value)


class MnqSqsCredentials(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 permissions: Optional[pulumi.Input[pulumi.InputType['MnqSqsCredentialsPermissionsArgs']]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates and manages Scaleway Messaging and queuing SQS Credentials.
        For further information please check
        our [documentation](https://www.scaleway.com/en/docs/serverless/messaging/reference-content/sqs-overview/)

        ## Examples

        ### Basic

        ```python
        import pulumi
        import lbrlabs_pulumi_scaleway as scaleway

        main_mnq_sqs = scaleway.MnqSqs("mainMnqSqs")
        main_mnq_sqs_credentials = scaleway.MnqSqsCredentials("mainMnqSqsCredentials",
            project_id=main_mnq_sqs.project_id,
            permissions=scaleway.MnqSqsCredentialsPermissionsArgs(
                can_manage=False,
                can_receive=True,
                can_publish=False,
            ))
        ```

        ## Import

        SQS credentials can be imported using the `{region}/{id}`, e.g. bash

        ```sh
         $ pulumi import scaleway:index/mnqSqsCredentials:MnqSqsCredentials main fr-par/11111111111111111111111111111111
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The unique name of the sqs credentials.
        :param pulumi.Input[pulumi.InputType['MnqSqsCredentialsPermissionsArgs']] permissions: . List of permissions associated to these credentials. Only one of permissions may be set.
        :param pulumi.Input[str] project_id: `project_id`) The ID of the project the sqs is enabled for.
        :param pulumi.Input[str] region: `region`). The region in which sqs is enabled.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[MnqSqsCredentialsArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates and manages Scaleway Messaging and queuing SQS Credentials.
        For further information please check
        our [documentation](https://www.scaleway.com/en/docs/serverless/messaging/reference-content/sqs-overview/)

        ## Examples

        ### Basic

        ```python
        import pulumi
        import lbrlabs_pulumi_scaleway as scaleway

        main_mnq_sqs = scaleway.MnqSqs("mainMnqSqs")
        main_mnq_sqs_credentials = scaleway.MnqSqsCredentials("mainMnqSqsCredentials",
            project_id=main_mnq_sqs.project_id,
            permissions=scaleway.MnqSqsCredentialsPermissionsArgs(
                can_manage=False,
                can_receive=True,
                can_publish=False,
            ))
        ```

        ## Import

        SQS credentials can be imported using the `{region}/{id}`, e.g. bash

        ```sh
         $ pulumi import scaleway:index/mnqSqsCredentials:MnqSqsCredentials main fr-par/11111111111111111111111111111111
        ```

        :param str resource_name: The name of the resource.
        :param MnqSqsCredentialsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MnqSqsCredentialsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 permissions: Optional[pulumi.Input[pulumi.InputType['MnqSqsCredentialsPermissionsArgs']]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MnqSqsCredentialsArgs.__new__(MnqSqsCredentialsArgs)

            __props__.__dict__["name"] = name
            __props__.__dict__["permissions"] = permissions
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["region"] = region
            __props__.__dict__["access_key"] = None
            __props__.__dict__["secret_key"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["accessKey", "secretKey"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(MnqSqsCredentials, __self__).__init__(
            'scaleway:index/mnqSqsCredentials:MnqSqsCredentials',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_key: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            permissions: Optional[pulumi.Input[pulumi.InputType['MnqSqsCredentialsPermissionsArgs']]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None,
            secret_key: Optional[pulumi.Input[str]] = None) -> 'MnqSqsCredentials':
        """
        Get an existing MnqSqsCredentials resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_key: The ID of the key.
        :param pulumi.Input[str] name: The unique name of the sqs credentials.
        :param pulumi.Input[pulumi.InputType['MnqSqsCredentialsPermissionsArgs']] permissions: . List of permissions associated to these credentials. Only one of permissions may be set.
        :param pulumi.Input[str] project_id: `project_id`) The ID of the project the sqs is enabled for.
        :param pulumi.Input[str] region: `region`). The region in which sqs is enabled.
        :param pulumi.Input[str] secret_key: The secret value of the key.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MnqSqsCredentialsState.__new__(_MnqSqsCredentialsState)

        __props__.__dict__["access_key"] = access_key
        __props__.__dict__["name"] = name
        __props__.__dict__["permissions"] = permissions
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["region"] = region
        __props__.__dict__["secret_key"] = secret_key
        return MnqSqsCredentials(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessKey")
    def access_key(self) -> pulumi.Output[str]:
        """
        The ID of the key.
        """
        return pulumi.get(self, "access_key")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The unique name of the sqs credentials.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def permissions(self) -> pulumi.Output['outputs.MnqSqsCredentialsPermissions']:
        """
        . List of permissions associated to these credentials. Only one of permissions may be set.
        """
        return pulumi.get(self, "permissions")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        `project_id`) The ID of the project the sqs is enabled for.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        `region`). The region in which sqs is enabled.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="secretKey")
    def secret_key(self) -> pulumi.Output[str]:
        """
        The secret value of the key.
        """
        return pulumi.get(self, "secret_key")

