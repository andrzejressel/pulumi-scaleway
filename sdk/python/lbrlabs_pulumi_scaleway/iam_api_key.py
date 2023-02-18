# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['IamApiKeyArgs', 'IamApiKey']

@pulumi.input_type
class IamApiKeyArgs:
    def __init__(__self__, *,
                 application_id: Optional[pulumi.Input[str]] = None,
                 default_project_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 expires_at: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a IamApiKey resource.
        :param pulumi.Input[str] application_id: ID of the application attached to the api key.
               Only one of the `application_id` and `user_id` should be specified.
        :param pulumi.Input[str] default_project_id: The default project ID to use with object storage.
        :param pulumi.Input[str] description: The description of the iam api key.
        :param pulumi.Input[str] expires_at: The date and time of the expiration of the iam api key. Please note that in case of change,
               the resource will be recreated.
        :param pulumi.Input[str] user_id: ID of the user attached to the api key.
               Only one of the `application_id` and `user_id` should be specified.
        """
        if application_id is not None:
            pulumi.set(__self__, "application_id", application_id)
        if default_project_id is not None:
            pulumi.set(__self__, "default_project_id", default_project_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if expires_at is not None:
            pulumi.set(__self__, "expires_at", expires_at)
        if user_id is not None:
            pulumi.set(__self__, "user_id", user_id)

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the application attached to the api key.
        Only one of the `application_id` and `user_id` should be specified.
        """
        return pulumi.get(self, "application_id")

    @application_id.setter
    def application_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "application_id", value)

    @property
    @pulumi.getter(name="defaultProjectId")
    def default_project_id(self) -> Optional[pulumi.Input[str]]:
        """
        The default project ID to use with object storage.
        """
        return pulumi.get(self, "default_project_id")

    @default_project_id.setter
    def default_project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_project_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the iam api key.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="expiresAt")
    def expires_at(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time of the expiration of the iam api key. Please note that in case of change,
        the resource will be recreated.
        """
        return pulumi.get(self, "expires_at")

    @expires_at.setter
    def expires_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expires_at", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the user attached to the api key.
        Only one of the `application_id` and `user_id` should be specified.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)


@pulumi.input_type
class _IamApiKeyState:
    def __init__(__self__, *,
                 access_key: Optional[pulumi.Input[str]] = None,
                 application_id: Optional[pulumi.Input[str]] = None,
                 created_at: Optional[pulumi.Input[str]] = None,
                 creation_ip: Optional[pulumi.Input[str]] = None,
                 default_project_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 editable: Optional[pulumi.Input[bool]] = None,
                 expires_at: Optional[pulumi.Input[str]] = None,
                 secret_key: Optional[pulumi.Input[str]] = None,
                 updated_at: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering IamApiKey resources.
        :param pulumi.Input[str] access_key: The access key of the iam api key.
        :param pulumi.Input[str] application_id: ID of the application attached to the api key.
               Only one of the `application_id` and `user_id` should be specified.
        :param pulumi.Input[str] created_at: The date and time of the creation of the iam api key.
        :param pulumi.Input[str] creation_ip: The IP Address of the device which created the API key.
        :param pulumi.Input[str] default_project_id: The default project ID to use with object storage.
        :param pulumi.Input[str] description: The description of the iam api key.
        :param pulumi.Input[bool] editable: Whether the iam api key is editable.
        :param pulumi.Input[str] expires_at: The date and time of the expiration of the iam api key. Please note that in case of change,
               the resource will be recreated.
        :param pulumi.Input[str] secret_key: The secret Key of the iam api key.
        :param pulumi.Input[str] updated_at: The date and time of the last update of the iam api key.
        :param pulumi.Input[str] user_id: ID of the user attached to the api key.
               Only one of the `application_id` and `user_id` should be specified.
        """
        if access_key is not None:
            pulumi.set(__self__, "access_key", access_key)
        if application_id is not None:
            pulumi.set(__self__, "application_id", application_id)
        if created_at is not None:
            pulumi.set(__self__, "created_at", created_at)
        if creation_ip is not None:
            pulumi.set(__self__, "creation_ip", creation_ip)
        if default_project_id is not None:
            pulumi.set(__self__, "default_project_id", default_project_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if editable is not None:
            pulumi.set(__self__, "editable", editable)
        if expires_at is not None:
            pulumi.set(__self__, "expires_at", expires_at)
        if secret_key is not None:
            pulumi.set(__self__, "secret_key", secret_key)
        if updated_at is not None:
            pulumi.set(__self__, "updated_at", updated_at)
        if user_id is not None:
            pulumi.set(__self__, "user_id", user_id)

    @property
    @pulumi.getter(name="accessKey")
    def access_key(self) -> Optional[pulumi.Input[str]]:
        """
        The access key of the iam api key.
        """
        return pulumi.get(self, "access_key")

    @access_key.setter
    def access_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_key", value)

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the application attached to the api key.
        Only one of the `application_id` and `user_id` should be specified.
        """
        return pulumi.get(self, "application_id")

    @application_id.setter
    def application_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "application_id", value)

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time of the creation of the iam api key.
        """
        return pulumi.get(self, "created_at")

    @created_at.setter
    def created_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_at", value)

    @property
    @pulumi.getter(name="creationIp")
    def creation_ip(self) -> Optional[pulumi.Input[str]]:
        """
        The IP Address of the device which created the API key.
        """
        return pulumi.get(self, "creation_ip")

    @creation_ip.setter
    def creation_ip(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "creation_ip", value)

    @property
    @pulumi.getter(name="defaultProjectId")
    def default_project_id(self) -> Optional[pulumi.Input[str]]:
        """
        The default project ID to use with object storage.
        """
        return pulumi.get(self, "default_project_id")

    @default_project_id.setter
    def default_project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_project_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the iam api key.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def editable(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the iam api key is editable.
        """
        return pulumi.get(self, "editable")

    @editable.setter
    def editable(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "editable", value)

    @property
    @pulumi.getter(name="expiresAt")
    def expires_at(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time of the expiration of the iam api key. Please note that in case of change,
        the resource will be recreated.
        """
        return pulumi.get(self, "expires_at")

    @expires_at.setter
    def expires_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "expires_at", value)

    @property
    @pulumi.getter(name="secretKey")
    def secret_key(self) -> Optional[pulumi.Input[str]]:
        """
        The secret Key of the iam api key.
        """
        return pulumi.get(self, "secret_key")

    @secret_key.setter
    def secret_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret_key", value)

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time of the last update of the iam api key.
        """
        return pulumi.get(self, "updated_at")

    @updated_at.setter
    def updated_at(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "updated_at", value)

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the user attached to the api key.
        Only one of the `application_id` and `user_id` should be specified.
        """
        return pulumi.get(self, "user_id")

    @user_id.setter
    def user_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "user_id", value)


class IamApiKey(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 application_id: Optional[pulumi.Input[str]] = None,
                 default_project_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 expires_at: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates and manages Scaleway IAM API Keys. For more information, please
        check [the documentation](https://developers.scaleway.com/en/products/iam/api/v1alpha1/#api-keys-3665ae)

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_scaleway as scaleway

        ci_cd = scaleway.IamApplication("ciCd")
        main = scaleway.IamApiKey("main",
            application_id=scaleway_iam_application["main"]["id"],
            description="a description")
        ```

        ## Import

        Api keys can be imported using the `{id}`, e.g. bash

        ```sh
         $ pulumi import scaleway:index/iamApiKey:IamApiKey main 11111111111111111111
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] application_id: ID of the application attached to the api key.
               Only one of the `application_id` and `user_id` should be specified.
        :param pulumi.Input[str] default_project_id: The default project ID to use with object storage.
        :param pulumi.Input[str] description: The description of the iam api key.
        :param pulumi.Input[str] expires_at: The date and time of the expiration of the iam api key. Please note that in case of change,
               the resource will be recreated.
        :param pulumi.Input[str] user_id: ID of the user attached to the api key.
               Only one of the `application_id` and `user_id` should be specified.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[IamApiKeyArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates and manages Scaleway IAM API Keys. For more information, please
        check [the documentation](https://developers.scaleway.com/en/products/iam/api/v1alpha1/#api-keys-3665ae)

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_scaleway as scaleway

        ci_cd = scaleway.IamApplication("ciCd")
        main = scaleway.IamApiKey("main",
            application_id=scaleway_iam_application["main"]["id"],
            description="a description")
        ```

        ## Import

        Api keys can be imported using the `{id}`, e.g. bash

        ```sh
         $ pulumi import scaleway:index/iamApiKey:IamApiKey main 11111111111111111111
        ```

        :param str resource_name: The name of the resource.
        :param IamApiKeyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IamApiKeyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 application_id: Optional[pulumi.Input[str]] = None,
                 default_project_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 expires_at: Optional[pulumi.Input[str]] = None,
                 user_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IamApiKeyArgs.__new__(IamApiKeyArgs)

            __props__.__dict__["application_id"] = application_id
            __props__.__dict__["default_project_id"] = default_project_id
            __props__.__dict__["description"] = description
            __props__.__dict__["expires_at"] = expires_at
            __props__.__dict__["user_id"] = user_id
            __props__.__dict__["access_key"] = None
            __props__.__dict__["created_at"] = None
            __props__.__dict__["creation_ip"] = None
            __props__.__dict__["editable"] = None
            __props__.__dict__["secret_key"] = None
            __props__.__dict__["updated_at"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["secretKey"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(IamApiKey, __self__).__init__(
            'scaleway:index/iamApiKey:IamApiKey',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_key: Optional[pulumi.Input[str]] = None,
            application_id: Optional[pulumi.Input[str]] = None,
            created_at: Optional[pulumi.Input[str]] = None,
            creation_ip: Optional[pulumi.Input[str]] = None,
            default_project_id: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            editable: Optional[pulumi.Input[bool]] = None,
            expires_at: Optional[pulumi.Input[str]] = None,
            secret_key: Optional[pulumi.Input[str]] = None,
            updated_at: Optional[pulumi.Input[str]] = None,
            user_id: Optional[pulumi.Input[str]] = None) -> 'IamApiKey':
        """
        Get an existing IamApiKey resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_key: The access key of the iam api key.
        :param pulumi.Input[str] application_id: ID of the application attached to the api key.
               Only one of the `application_id` and `user_id` should be specified.
        :param pulumi.Input[str] created_at: The date and time of the creation of the iam api key.
        :param pulumi.Input[str] creation_ip: The IP Address of the device which created the API key.
        :param pulumi.Input[str] default_project_id: The default project ID to use with object storage.
        :param pulumi.Input[str] description: The description of the iam api key.
        :param pulumi.Input[bool] editable: Whether the iam api key is editable.
        :param pulumi.Input[str] expires_at: The date and time of the expiration of the iam api key. Please note that in case of change,
               the resource will be recreated.
        :param pulumi.Input[str] secret_key: The secret Key of the iam api key.
        :param pulumi.Input[str] updated_at: The date and time of the last update of the iam api key.
        :param pulumi.Input[str] user_id: ID of the user attached to the api key.
               Only one of the `application_id` and `user_id` should be specified.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IamApiKeyState.__new__(_IamApiKeyState)

        __props__.__dict__["access_key"] = access_key
        __props__.__dict__["application_id"] = application_id
        __props__.__dict__["created_at"] = created_at
        __props__.__dict__["creation_ip"] = creation_ip
        __props__.__dict__["default_project_id"] = default_project_id
        __props__.__dict__["description"] = description
        __props__.__dict__["editable"] = editable
        __props__.__dict__["expires_at"] = expires_at
        __props__.__dict__["secret_key"] = secret_key
        __props__.__dict__["updated_at"] = updated_at
        __props__.__dict__["user_id"] = user_id
        return IamApiKey(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessKey")
    def access_key(self) -> pulumi.Output[str]:
        """
        The access key of the iam api key.
        """
        return pulumi.get(self, "access_key")

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> pulumi.Output[Optional[str]]:
        """
        ID of the application attached to the api key.
        Only one of the `application_id` and `user_id` should be specified.
        """
        return pulumi.get(self, "application_id")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> pulumi.Output[str]:
        """
        The date and time of the creation of the iam api key.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter(name="creationIp")
    def creation_ip(self) -> pulumi.Output[str]:
        """
        The IP Address of the device which created the API key.
        """
        return pulumi.get(self, "creation_ip")

    @property
    @pulumi.getter(name="defaultProjectId")
    def default_project_id(self) -> pulumi.Output[str]:
        """
        The default project ID to use with object storage.
        """
        return pulumi.get(self, "default_project_id")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the iam api key.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def editable(self) -> pulumi.Output[bool]:
        """
        Whether the iam api key is editable.
        """
        return pulumi.get(self, "editable")

    @property
    @pulumi.getter(name="expiresAt")
    def expires_at(self) -> pulumi.Output[Optional[str]]:
        """
        The date and time of the expiration of the iam api key. Please note that in case of change,
        the resource will be recreated.
        """
        return pulumi.get(self, "expires_at")

    @property
    @pulumi.getter(name="secretKey")
    def secret_key(self) -> pulumi.Output[str]:
        """
        The secret Key of the iam api key.
        """
        return pulumi.get(self, "secret_key")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> pulumi.Output[str]:
        """
        The date and time of the last update of the iam api key.
        """
        return pulumi.get(self, "updated_at")

    @property
    @pulumi.getter(name="userId")
    def user_id(self) -> pulumi.Output[Optional[str]]:
        """
        ID of the user attached to the api key.
        Only one of the `application_id` and `user_id` should be specified.
        """
        return pulumi.get(self, "user_id")

