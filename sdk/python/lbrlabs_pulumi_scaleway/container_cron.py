# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ContainerCronArgs', 'ContainerCron']

@pulumi.input_type
class ContainerCronArgs:
    def __init__(__self__, *,
                 args: pulumi.Input[str],
                 container_id: pulumi.Input[str],
                 schedule: pulumi.Input[str]):
        """
        The set of arguments for constructing a ContainerCron resource.
        :param pulumi.Input[str] args: The key-value mapping to define arguments that will be passed to your container’s event object
               during
        :param pulumi.Input[str] container_id: The container ID to link with your cron.
        :param pulumi.Input[str] schedule: Cron format string, e.g. @hourly, as schedule time of its jobs to be created and
               executed.
        """
        pulumi.set(__self__, "args", args)
        pulumi.set(__self__, "container_id", container_id)
        pulumi.set(__self__, "schedule", schedule)

    @property
    @pulumi.getter
    def args(self) -> pulumi.Input[str]:
        """
        The key-value mapping to define arguments that will be passed to your container’s event object
        during
        """
        return pulumi.get(self, "args")

    @args.setter
    def args(self, value: pulumi.Input[str]):
        pulumi.set(self, "args", value)

    @property
    @pulumi.getter(name="containerId")
    def container_id(self) -> pulumi.Input[str]:
        """
        The container ID to link with your cron.
        """
        return pulumi.get(self, "container_id")

    @container_id.setter
    def container_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "container_id", value)

    @property
    @pulumi.getter
    def schedule(self) -> pulumi.Input[str]:
        """
        Cron format string, e.g. @hourly, as schedule time of its jobs to be created and
        executed.
        """
        return pulumi.get(self, "schedule")

    @schedule.setter
    def schedule(self, value: pulumi.Input[str]):
        pulumi.set(self, "schedule", value)


@pulumi.input_type
class _ContainerCronState:
    def __init__(__self__, *,
                 args: Optional[pulumi.Input[str]] = None,
                 container_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 schedule: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ContainerCron resources.
        :param pulumi.Input[str] args: The key-value mapping to define arguments that will be passed to your container’s event object
               during
        :param pulumi.Input[str] container_id: The container ID to link with your cron.
        :param pulumi.Input[str] region: (Defaults to provider `region`) The region
               in where the job was created.
        :param pulumi.Input[str] schedule: Cron format string, e.g. @hourly, as schedule time of its jobs to be created and
               executed.
        :param pulumi.Input[str] status: The cron status.
        """
        if args is not None:
            pulumi.set(__self__, "args", args)
        if container_id is not None:
            pulumi.set(__self__, "container_id", container_id)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if schedule is not None:
            pulumi.set(__self__, "schedule", schedule)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def args(self) -> Optional[pulumi.Input[str]]:
        """
        The key-value mapping to define arguments that will be passed to your container’s event object
        during
        """
        return pulumi.get(self, "args")

    @args.setter
    def args(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "args", value)

    @property
    @pulumi.getter(name="containerId")
    def container_id(self) -> Optional[pulumi.Input[str]]:
        """
        The container ID to link with your cron.
        """
        return pulumi.get(self, "container_id")

    @container_id.setter
    def container_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "container_id", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        (Defaults to provider `region`) The region
        in where the job was created.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter
    def schedule(self) -> Optional[pulumi.Input[str]]:
        """
        Cron format string, e.g. @hourly, as schedule time of its jobs to be created and
        executed.
        """
        return pulumi.get(self, "schedule")

    @schedule.setter
    def schedule(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schedule", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The cron status.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class ContainerCron(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 args: Optional[pulumi.Input[str]] = None,
                 container_id: Optional[pulumi.Input[str]] = None,
                 schedule: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates and manages Scaleway Container Triggers. For the moment, the feature is limited to CRON Schedule (time-based).

        For more information consult
        the [documentation](https://www.scaleway.com/en/docs/compute/containers/api-cli/cont-uploading-with-serverless-framework/#configuring-events)
        .

        For more details about the limitation
        check [containers-limitations](https://www.scaleway.com/en/docs/compute/containers/reference-content/containers-limitations/)
        .

        You can check also
        our [containers cron api documentation](https://developers.scaleway.com/en/products/containers/api/#crons-942bf4).

        ## Example Usage

        ```python
        import pulumi
        import json
        import lbrlabs_pulumi_scaleway as scaleway

        main_container_namespace = scaleway.ContainerNamespace("mainContainerNamespace")
        main_container = scaleway.Container("mainContainer", namespace_id=main_container_namespace.id)
        main_container_cron = scaleway.ContainerCron("mainContainerCron",
            container_id=main_container.id,
            schedule="5 4 1 * *",
            args=json.dumps({
                "address": {
                    "city": "Paris",
                    "country": "FR",
                },
                "age": 23,
                "firstName": "John",
                "isAlive": True,
                "lastName": "Smith",
            }))
        ```

        ## Import

        Container Cron can be imported using the `{region}/{id}`, e.g. bash

        ```sh
         $ pulumi import scaleway:index/containerCron:ContainerCron main fr-par/11111111-1111-1111-1111-111111111111
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] args: The key-value mapping to define arguments that will be passed to your container’s event object
               during
        :param pulumi.Input[str] container_id: The container ID to link with your cron.
        :param pulumi.Input[str] schedule: Cron format string, e.g. @hourly, as schedule time of its jobs to be created and
               executed.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ContainerCronArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates and manages Scaleway Container Triggers. For the moment, the feature is limited to CRON Schedule (time-based).

        For more information consult
        the [documentation](https://www.scaleway.com/en/docs/compute/containers/api-cli/cont-uploading-with-serverless-framework/#configuring-events)
        .

        For more details about the limitation
        check [containers-limitations](https://www.scaleway.com/en/docs/compute/containers/reference-content/containers-limitations/)
        .

        You can check also
        our [containers cron api documentation](https://developers.scaleway.com/en/products/containers/api/#crons-942bf4).

        ## Example Usage

        ```python
        import pulumi
        import json
        import lbrlabs_pulumi_scaleway as scaleway

        main_container_namespace = scaleway.ContainerNamespace("mainContainerNamespace")
        main_container = scaleway.Container("mainContainer", namespace_id=main_container_namespace.id)
        main_container_cron = scaleway.ContainerCron("mainContainerCron",
            container_id=main_container.id,
            schedule="5 4 1 * *",
            args=json.dumps({
                "address": {
                    "city": "Paris",
                    "country": "FR",
                },
                "age": 23,
                "firstName": "John",
                "isAlive": True,
                "lastName": "Smith",
            }))
        ```

        ## Import

        Container Cron can be imported using the `{region}/{id}`, e.g. bash

        ```sh
         $ pulumi import scaleway:index/containerCron:ContainerCron main fr-par/11111111-1111-1111-1111-111111111111
        ```

        :param str resource_name: The name of the resource.
        :param ContainerCronArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ContainerCronArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 args: Optional[pulumi.Input[str]] = None,
                 container_id: Optional[pulumi.Input[str]] = None,
                 schedule: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ContainerCronArgs.__new__(ContainerCronArgs)

            if args is None and not opts.urn:
                raise TypeError("Missing required property 'args'")
            __props__.__dict__["args"] = args
            if container_id is None and not opts.urn:
                raise TypeError("Missing required property 'container_id'")
            __props__.__dict__["container_id"] = container_id
            if schedule is None and not opts.urn:
                raise TypeError("Missing required property 'schedule'")
            __props__.__dict__["schedule"] = schedule
            __props__.__dict__["region"] = None
            __props__.__dict__["status"] = None
        super(ContainerCron, __self__).__init__(
            'scaleway:index/containerCron:ContainerCron',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            args: Optional[pulumi.Input[str]] = None,
            container_id: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None,
            schedule: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'ContainerCron':
        """
        Get an existing ContainerCron resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] args: The key-value mapping to define arguments that will be passed to your container’s event object
               during
        :param pulumi.Input[str] container_id: The container ID to link with your cron.
        :param pulumi.Input[str] region: (Defaults to provider `region`) The region
               in where the job was created.
        :param pulumi.Input[str] schedule: Cron format string, e.g. @hourly, as schedule time of its jobs to be created and
               executed.
        :param pulumi.Input[str] status: The cron status.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ContainerCronState.__new__(_ContainerCronState)

        __props__.__dict__["args"] = args
        __props__.__dict__["container_id"] = container_id
        __props__.__dict__["region"] = region
        __props__.__dict__["schedule"] = schedule
        __props__.__dict__["status"] = status
        return ContainerCron(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def args(self) -> pulumi.Output[str]:
        """
        The key-value mapping to define arguments that will be passed to your container’s event object
        during
        """
        return pulumi.get(self, "args")

    @property
    @pulumi.getter(name="containerId")
    def container_id(self) -> pulumi.Output[str]:
        """
        The container ID to link with your cron.
        """
        return pulumi.get(self, "container_id")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        (Defaults to provider `region`) The region
        in where the job was created.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def schedule(self) -> pulumi.Output[str]:
        """
        Cron format string, e.g. @hourly, as schedule time of its jobs to be created and
        executed.
        """
        return pulumi.get(self, "schedule")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The cron status.
        """
        return pulumi.get(self, "status")

