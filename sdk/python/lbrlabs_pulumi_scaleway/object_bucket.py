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

__all__ = ['ObjectBucketArgs', 'ObjectBucket']

@pulumi.input_type
class ObjectBucketArgs:
    def __init__(__self__, *,
                 acl: Optional[pulumi.Input[str]] = None,
                 cors_rules: Optional[pulumi.Input[Sequence[pulumi.Input['ObjectBucketCorsRuleArgs']]]] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 lifecycle_rules: Optional[pulumi.Input[Sequence[pulumi.Input['ObjectBucketLifecycleRuleArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 object_lock_enabled: Optional[pulumi.Input[bool]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 versioning: Optional[pulumi.Input['ObjectBucketVersioningArgs']] = None):
        """
        The set of arguments for constructing a ObjectBucket resource.
        :param pulumi.Input[str] acl: (Deprecated) The canned ACL you want to apply to the bucket.
        :param pulumi.Input[Sequence[pulumi.Input['ObjectBucketCorsRuleArgs']]] cors_rules: A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
        :param pulumi.Input[bool] force_destroy: Enable deletion of objects in bucket before destroying, locked objects or under legal hold are also deleted and **not** recoverable
        :param pulumi.Input[Sequence[pulumi.Input['ObjectBucketLifecycleRuleArgs']]] lifecycle_rules: Lifecycle configuration is a set of rules that define actions that Scaleway Object Storage applies to a group of objects
        :param pulumi.Input[str] name: The name of the bucket.
        :param pulumi.Input[bool] object_lock_enabled: Enable object lock
        :param pulumi.Input[str] project_id: `project_id`) The ID of the project the bucket is associated with.
               
               The `acl` attribute is deprecated. See ObjectBucketAcl resource documentation.
               Please check the [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl_overview.html#canned-acl) documentation for supported values.
        :param pulumi.Input[str] region: The [region](https://developers.scaleway.com/en/quickstart/#region-definition) in which the bucket should be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A list of tags (key / value) for the bucket.
        :param pulumi.Input['ObjectBucketVersioningArgs'] versioning: A state of [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) (documented below)
        """
        if acl is not None:
            warnings.warn("""ACL attribute is deprecated. Please use the resource scaleway_object_bucket_acl instead.""", DeprecationWarning)
            pulumi.log.warn("""acl is deprecated: ACL attribute is deprecated. Please use the resource scaleway_object_bucket_acl instead.""")
        if acl is not None:
            pulumi.set(__self__, "acl", acl)
        if cors_rules is not None:
            pulumi.set(__self__, "cors_rules", cors_rules)
        if force_destroy is not None:
            pulumi.set(__self__, "force_destroy", force_destroy)
        if lifecycle_rules is not None:
            pulumi.set(__self__, "lifecycle_rules", lifecycle_rules)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if object_lock_enabled is not None:
            pulumi.set(__self__, "object_lock_enabled", object_lock_enabled)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if versioning is not None:
            pulumi.set(__self__, "versioning", versioning)

    @property
    @pulumi.getter
    def acl(self) -> Optional[pulumi.Input[str]]:
        """
        (Deprecated) The canned ACL you want to apply to the bucket.
        """
        warnings.warn("""ACL attribute is deprecated. Please use the resource scaleway_object_bucket_acl instead.""", DeprecationWarning)
        pulumi.log.warn("""acl is deprecated: ACL attribute is deprecated. Please use the resource scaleway_object_bucket_acl instead.""")

        return pulumi.get(self, "acl")

    @acl.setter
    def acl(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "acl", value)

    @property
    @pulumi.getter(name="corsRules")
    def cors_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ObjectBucketCorsRuleArgs']]]]:
        """
        A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
        """
        return pulumi.get(self, "cors_rules")

    @cors_rules.setter
    def cors_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ObjectBucketCorsRuleArgs']]]]):
        pulumi.set(self, "cors_rules", value)

    @property
    @pulumi.getter(name="forceDestroy")
    def force_destroy(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable deletion of objects in bucket before destroying, locked objects or under legal hold are also deleted and **not** recoverable
        """
        return pulumi.get(self, "force_destroy")

    @force_destroy.setter
    def force_destroy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force_destroy", value)

    @property
    @pulumi.getter(name="lifecycleRules")
    def lifecycle_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ObjectBucketLifecycleRuleArgs']]]]:
        """
        Lifecycle configuration is a set of rules that define actions that Scaleway Object Storage applies to a group of objects
        """
        return pulumi.get(self, "lifecycle_rules")

    @lifecycle_rules.setter
    def lifecycle_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ObjectBucketLifecycleRuleArgs']]]]):
        pulumi.set(self, "lifecycle_rules", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the bucket.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="objectLockEnabled")
    def object_lock_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable object lock
        """
        return pulumi.get(self, "object_lock_enabled")

    @object_lock_enabled.setter
    def object_lock_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "object_lock_enabled", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        `project_id`) The ID of the project the bucket is associated with.

        The `acl` attribute is deprecated. See ObjectBucketAcl resource documentation.
        Please check the [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl_overview.html#canned-acl) documentation for supported values.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        The [region](https://developers.scaleway.com/en/quickstart/#region-definition) in which the bucket should be created.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A list of tags (key / value) for the bucket.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def versioning(self) -> Optional[pulumi.Input['ObjectBucketVersioningArgs']]:
        """
        A state of [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) (documented below)
        """
        return pulumi.get(self, "versioning")

    @versioning.setter
    def versioning(self, value: Optional[pulumi.Input['ObjectBucketVersioningArgs']]):
        pulumi.set(self, "versioning", value)


@pulumi.input_type
class _ObjectBucketState:
    def __init__(__self__, *,
                 acl: Optional[pulumi.Input[str]] = None,
                 cors_rules: Optional[pulumi.Input[Sequence[pulumi.Input['ObjectBucketCorsRuleArgs']]]] = None,
                 endpoint: Optional[pulumi.Input[str]] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 lifecycle_rules: Optional[pulumi.Input[Sequence[pulumi.Input['ObjectBucketLifecycleRuleArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 object_lock_enabled: Optional[pulumi.Input[bool]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 versioning: Optional[pulumi.Input['ObjectBucketVersioningArgs']] = None):
        """
        Input properties used for looking up and filtering ObjectBucket resources.
        :param pulumi.Input[str] acl: (Deprecated) The canned ACL you want to apply to the bucket.
        :param pulumi.Input[Sequence[pulumi.Input['ObjectBucketCorsRuleArgs']]] cors_rules: A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
        :param pulumi.Input[str] endpoint: The endpoint URL of the bucket
        :param pulumi.Input[bool] force_destroy: Enable deletion of objects in bucket before destroying, locked objects or under legal hold are also deleted and **not** recoverable
        :param pulumi.Input[Sequence[pulumi.Input['ObjectBucketLifecycleRuleArgs']]] lifecycle_rules: Lifecycle configuration is a set of rules that define actions that Scaleway Object Storage applies to a group of objects
        :param pulumi.Input[str] name: The name of the bucket.
        :param pulumi.Input[bool] object_lock_enabled: Enable object lock
        :param pulumi.Input[str] project_id: `project_id`) The ID of the project the bucket is associated with.
               
               The `acl` attribute is deprecated. See ObjectBucketAcl resource documentation.
               Please check the [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl_overview.html#canned-acl) documentation for supported values.
        :param pulumi.Input[str] region: The [region](https://developers.scaleway.com/en/quickstart/#region-definition) in which the bucket should be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A list of tags (key / value) for the bucket.
        :param pulumi.Input['ObjectBucketVersioningArgs'] versioning: A state of [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) (documented below)
        """
        if acl is not None:
            warnings.warn("""ACL attribute is deprecated. Please use the resource scaleway_object_bucket_acl instead.""", DeprecationWarning)
            pulumi.log.warn("""acl is deprecated: ACL attribute is deprecated. Please use the resource scaleway_object_bucket_acl instead.""")
        if acl is not None:
            pulumi.set(__self__, "acl", acl)
        if cors_rules is not None:
            pulumi.set(__self__, "cors_rules", cors_rules)
        if endpoint is not None:
            pulumi.set(__self__, "endpoint", endpoint)
        if force_destroy is not None:
            pulumi.set(__self__, "force_destroy", force_destroy)
        if lifecycle_rules is not None:
            pulumi.set(__self__, "lifecycle_rules", lifecycle_rules)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if object_lock_enabled is not None:
            pulumi.set(__self__, "object_lock_enabled", object_lock_enabled)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if region is not None:
            pulumi.set(__self__, "region", region)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if versioning is not None:
            pulumi.set(__self__, "versioning", versioning)

    @property
    @pulumi.getter
    def acl(self) -> Optional[pulumi.Input[str]]:
        """
        (Deprecated) The canned ACL you want to apply to the bucket.
        """
        warnings.warn("""ACL attribute is deprecated. Please use the resource scaleway_object_bucket_acl instead.""", DeprecationWarning)
        pulumi.log.warn("""acl is deprecated: ACL attribute is deprecated. Please use the resource scaleway_object_bucket_acl instead.""")

        return pulumi.get(self, "acl")

    @acl.setter
    def acl(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "acl", value)

    @property
    @pulumi.getter(name="corsRules")
    def cors_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ObjectBucketCorsRuleArgs']]]]:
        """
        A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
        """
        return pulumi.get(self, "cors_rules")

    @cors_rules.setter
    def cors_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ObjectBucketCorsRuleArgs']]]]):
        pulumi.set(self, "cors_rules", value)

    @property
    @pulumi.getter
    def endpoint(self) -> Optional[pulumi.Input[str]]:
        """
        The endpoint URL of the bucket
        """
        return pulumi.get(self, "endpoint")

    @endpoint.setter
    def endpoint(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "endpoint", value)

    @property
    @pulumi.getter(name="forceDestroy")
    def force_destroy(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable deletion of objects in bucket before destroying, locked objects or under legal hold are also deleted and **not** recoverable
        """
        return pulumi.get(self, "force_destroy")

    @force_destroy.setter
    def force_destroy(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "force_destroy", value)

    @property
    @pulumi.getter(name="lifecycleRules")
    def lifecycle_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ObjectBucketLifecycleRuleArgs']]]]:
        """
        Lifecycle configuration is a set of rules that define actions that Scaleway Object Storage applies to a group of objects
        """
        return pulumi.get(self, "lifecycle_rules")

    @lifecycle_rules.setter
    def lifecycle_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ObjectBucketLifecycleRuleArgs']]]]):
        pulumi.set(self, "lifecycle_rules", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the bucket.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="objectLockEnabled")
    def object_lock_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable object lock
        """
        return pulumi.get(self, "object_lock_enabled")

    @object_lock_enabled.setter
    def object_lock_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "object_lock_enabled", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        `project_id`) The ID of the project the bucket is associated with.

        The `acl` attribute is deprecated. See ObjectBucketAcl resource documentation.
        Please check the [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl_overview.html#canned-acl) documentation for supported values.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def region(self) -> Optional[pulumi.Input[str]]:
        """
        The [region](https://developers.scaleway.com/en/quickstart/#region-definition) in which the bucket should be created.
        """
        return pulumi.get(self, "region")

    @region.setter
    def region(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "region", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A list of tags (key / value) for the bucket.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def versioning(self) -> Optional[pulumi.Input['ObjectBucketVersioningArgs']]:
        """
        A state of [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) (documented below)
        """
        return pulumi.get(self, "versioning")

    @versioning.setter
    def versioning(self, value: Optional[pulumi.Input['ObjectBucketVersioningArgs']]):
        pulumi.set(self, "versioning", value)


class ObjectBucket(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 acl: Optional[pulumi.Input[str]] = None,
                 cors_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ObjectBucketCorsRuleArgs']]]]] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 lifecycle_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ObjectBucketLifecycleRuleArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 object_lock_enabled: Optional[pulumi.Input[bool]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 versioning: Optional[pulumi.Input[pulumi.InputType['ObjectBucketVersioningArgs']]] = None,
                 __props__=None):
        """
        Creates and manages Scaleway object storage buckets.
        For more information, see [the documentation](https://www.scaleway.com/en/docs/object-storage-feature/).

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_scaleway as scaleway

        some_bucket = scaleway.ObjectBucket("someBucket", tags={
            "key": "value",
        })
        ```
        ### Creating the bucket in a specific project

        ```python
        import pulumi
        import lbrlabs_pulumi_scaleway as scaleway

        some_bucket = scaleway.ObjectBucket("someBucket", project_id="11111111-1111-1111-1111-111111111111")
        ```
        ### Using object lifecycle

        ```python
        import pulumi
        import lbrlabs_pulumi_scaleway as scaleway

        main = scaleway.ObjectBucket("main",
            lifecycle_rules=[
                scaleway.ObjectBucketLifecycleRuleArgs(
                    enabled=True,
                    expiration=scaleway.ObjectBucketLifecycleRuleExpirationArgs(
                        days=365,
                    ),
                    id="id1",
                    prefix="path1/",
                    transitions=[scaleway.ObjectBucketLifecycleRuleTransitionArgs(
                        days=120,
                        storage_class="GLACIER",
                    )],
                ),
                scaleway.ObjectBucketLifecycleRuleArgs(
                    enabled=True,
                    expiration=scaleway.ObjectBucketLifecycleRuleExpirationArgs(
                        days=50,
                    ),
                    id="id2",
                    prefix="path2/",
                ),
                scaleway.ObjectBucketLifecycleRuleArgs(
                    enabled=False,
                    expiration=scaleway.ObjectBucketLifecycleRuleExpirationArgs(
                        days=1,
                    ),
                    id="id3",
                    prefix="path3/",
                    tags={
                        "tagKey": "tagValue",
                        "terraform": "hashicorp",
                    },
                ),
                scaleway.ObjectBucketLifecycleRuleArgs(
                    enabled=True,
                    id="id4",
                    tags={
                        "tag1": "value1",
                    },
                    transitions=[scaleway.ObjectBucketLifecycleRuleTransitionArgs(
                        days=0,
                        storage_class="GLACIER",
                    )],
                ),
                scaleway.ObjectBucketLifecycleRuleArgs(
                    abort_incomplete_multipart_upload_days=30,
                    enabled=True,
                ),
            ],
            region="fr-par")
        ```

        ## Import

        Buckets can be imported using the `{region}/{bucketName}` identifier, e.g. bash

        ```sh
         $ pulumi import scaleway:index/objectBucket:ObjectBucket some_bucket fr-par/some-bucket
        ```

         If you are importing a bucket from a specific project (that is not your default project), you can use the following syntaxbash

        ```sh
         $ pulumi import scaleway:index/objectBucket:ObjectBucket some_bucket fr-par/some-bucket@11111111-1111-1111-1111-111111111111
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] acl: (Deprecated) The canned ACL you want to apply to the bucket.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ObjectBucketCorsRuleArgs']]]] cors_rules: A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
        :param pulumi.Input[bool] force_destroy: Enable deletion of objects in bucket before destroying, locked objects or under legal hold are also deleted and **not** recoverable
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ObjectBucketLifecycleRuleArgs']]]] lifecycle_rules: Lifecycle configuration is a set of rules that define actions that Scaleway Object Storage applies to a group of objects
        :param pulumi.Input[str] name: The name of the bucket.
        :param pulumi.Input[bool] object_lock_enabled: Enable object lock
        :param pulumi.Input[str] project_id: `project_id`) The ID of the project the bucket is associated with.
               
               The `acl` attribute is deprecated. See ObjectBucketAcl resource documentation.
               Please check the [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl_overview.html#canned-acl) documentation for supported values.
        :param pulumi.Input[str] region: The [region](https://developers.scaleway.com/en/quickstart/#region-definition) in which the bucket should be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A list of tags (key / value) for the bucket.
        :param pulumi.Input[pulumi.InputType['ObjectBucketVersioningArgs']] versioning: A state of [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) (documented below)
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ObjectBucketArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates and manages Scaleway object storage buckets.
        For more information, see [the documentation](https://www.scaleway.com/en/docs/object-storage-feature/).

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_scaleway as scaleway

        some_bucket = scaleway.ObjectBucket("someBucket", tags={
            "key": "value",
        })
        ```
        ### Creating the bucket in a specific project

        ```python
        import pulumi
        import lbrlabs_pulumi_scaleway as scaleway

        some_bucket = scaleway.ObjectBucket("someBucket", project_id="11111111-1111-1111-1111-111111111111")
        ```
        ### Using object lifecycle

        ```python
        import pulumi
        import lbrlabs_pulumi_scaleway as scaleway

        main = scaleway.ObjectBucket("main",
            lifecycle_rules=[
                scaleway.ObjectBucketLifecycleRuleArgs(
                    enabled=True,
                    expiration=scaleway.ObjectBucketLifecycleRuleExpirationArgs(
                        days=365,
                    ),
                    id="id1",
                    prefix="path1/",
                    transitions=[scaleway.ObjectBucketLifecycleRuleTransitionArgs(
                        days=120,
                        storage_class="GLACIER",
                    )],
                ),
                scaleway.ObjectBucketLifecycleRuleArgs(
                    enabled=True,
                    expiration=scaleway.ObjectBucketLifecycleRuleExpirationArgs(
                        days=50,
                    ),
                    id="id2",
                    prefix="path2/",
                ),
                scaleway.ObjectBucketLifecycleRuleArgs(
                    enabled=False,
                    expiration=scaleway.ObjectBucketLifecycleRuleExpirationArgs(
                        days=1,
                    ),
                    id="id3",
                    prefix="path3/",
                    tags={
                        "tagKey": "tagValue",
                        "terraform": "hashicorp",
                    },
                ),
                scaleway.ObjectBucketLifecycleRuleArgs(
                    enabled=True,
                    id="id4",
                    tags={
                        "tag1": "value1",
                    },
                    transitions=[scaleway.ObjectBucketLifecycleRuleTransitionArgs(
                        days=0,
                        storage_class="GLACIER",
                    )],
                ),
                scaleway.ObjectBucketLifecycleRuleArgs(
                    abort_incomplete_multipart_upload_days=30,
                    enabled=True,
                ),
            ],
            region="fr-par")
        ```

        ## Import

        Buckets can be imported using the `{region}/{bucketName}` identifier, e.g. bash

        ```sh
         $ pulumi import scaleway:index/objectBucket:ObjectBucket some_bucket fr-par/some-bucket
        ```

         If you are importing a bucket from a specific project (that is not your default project), you can use the following syntaxbash

        ```sh
         $ pulumi import scaleway:index/objectBucket:ObjectBucket some_bucket fr-par/some-bucket@11111111-1111-1111-1111-111111111111
        ```

        :param str resource_name: The name of the resource.
        :param ObjectBucketArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ObjectBucketArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 acl: Optional[pulumi.Input[str]] = None,
                 cors_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ObjectBucketCorsRuleArgs']]]]] = None,
                 force_destroy: Optional[pulumi.Input[bool]] = None,
                 lifecycle_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ObjectBucketLifecycleRuleArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 object_lock_enabled: Optional[pulumi.Input[bool]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 region: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 versioning: Optional[pulumi.Input[pulumi.InputType['ObjectBucketVersioningArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ObjectBucketArgs.__new__(ObjectBucketArgs)

            __props__.__dict__["acl"] = acl
            __props__.__dict__["cors_rules"] = cors_rules
            __props__.__dict__["force_destroy"] = force_destroy
            __props__.__dict__["lifecycle_rules"] = lifecycle_rules
            __props__.__dict__["name"] = name
            __props__.__dict__["object_lock_enabled"] = object_lock_enabled
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["region"] = region
            __props__.__dict__["tags"] = tags
            __props__.__dict__["versioning"] = versioning
            __props__.__dict__["endpoint"] = None
        super(ObjectBucket, __self__).__init__(
            'scaleway:index/objectBucket:ObjectBucket',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            acl: Optional[pulumi.Input[str]] = None,
            cors_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ObjectBucketCorsRuleArgs']]]]] = None,
            endpoint: Optional[pulumi.Input[str]] = None,
            force_destroy: Optional[pulumi.Input[bool]] = None,
            lifecycle_rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ObjectBucketLifecycleRuleArgs']]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            object_lock_enabled: Optional[pulumi.Input[bool]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            region: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            versioning: Optional[pulumi.Input[pulumi.InputType['ObjectBucketVersioningArgs']]] = None) -> 'ObjectBucket':
        """
        Get an existing ObjectBucket resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] acl: (Deprecated) The canned ACL you want to apply to the bucket.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ObjectBucketCorsRuleArgs']]]] cors_rules: A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
        :param pulumi.Input[str] endpoint: The endpoint URL of the bucket
        :param pulumi.Input[bool] force_destroy: Enable deletion of objects in bucket before destroying, locked objects or under legal hold are also deleted and **not** recoverable
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ObjectBucketLifecycleRuleArgs']]]] lifecycle_rules: Lifecycle configuration is a set of rules that define actions that Scaleway Object Storage applies to a group of objects
        :param pulumi.Input[str] name: The name of the bucket.
        :param pulumi.Input[bool] object_lock_enabled: Enable object lock
        :param pulumi.Input[str] project_id: `project_id`) The ID of the project the bucket is associated with.
               
               The `acl` attribute is deprecated. See ObjectBucketAcl resource documentation.
               Please check the [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl_overview.html#canned-acl) documentation for supported values.
        :param pulumi.Input[str] region: The [region](https://developers.scaleway.com/en/quickstart/#region-definition) in which the bucket should be created.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A list of tags (key / value) for the bucket.
        :param pulumi.Input[pulumi.InputType['ObjectBucketVersioningArgs']] versioning: A state of [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) (documented below)
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ObjectBucketState.__new__(_ObjectBucketState)

        __props__.__dict__["acl"] = acl
        __props__.__dict__["cors_rules"] = cors_rules
        __props__.__dict__["endpoint"] = endpoint
        __props__.__dict__["force_destroy"] = force_destroy
        __props__.__dict__["lifecycle_rules"] = lifecycle_rules
        __props__.__dict__["name"] = name
        __props__.__dict__["object_lock_enabled"] = object_lock_enabled
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["region"] = region
        __props__.__dict__["tags"] = tags
        __props__.__dict__["versioning"] = versioning
        return ObjectBucket(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def acl(self) -> pulumi.Output[Optional[str]]:
        """
        (Deprecated) The canned ACL you want to apply to the bucket.
        """
        warnings.warn("""ACL attribute is deprecated. Please use the resource scaleway_object_bucket_acl instead.""", DeprecationWarning)
        pulumi.log.warn("""acl is deprecated: ACL attribute is deprecated. Please use the resource scaleway_object_bucket_acl instead.""")

        return pulumi.get(self, "acl")

    @property
    @pulumi.getter(name="corsRules")
    def cors_rules(self) -> pulumi.Output[Optional[Sequence['outputs.ObjectBucketCorsRule']]]:
        """
        A rule of [Cross-Origin Resource Sharing](https://docs.aws.amazon.com/AmazonS3/latest/dev/cors.html) (documented below).
        """
        return pulumi.get(self, "cors_rules")

    @property
    @pulumi.getter
    def endpoint(self) -> pulumi.Output[str]:
        """
        The endpoint URL of the bucket
        """
        return pulumi.get(self, "endpoint")

    @property
    @pulumi.getter(name="forceDestroy")
    def force_destroy(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable deletion of objects in bucket before destroying, locked objects or under legal hold are also deleted and **not** recoverable
        """
        return pulumi.get(self, "force_destroy")

    @property
    @pulumi.getter(name="lifecycleRules")
    def lifecycle_rules(self) -> pulumi.Output[Optional[Sequence['outputs.ObjectBucketLifecycleRule']]]:
        """
        Lifecycle configuration is a set of rules that define actions that Scaleway Object Storage applies to a group of objects
        """
        return pulumi.get(self, "lifecycle_rules")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the bucket.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="objectLockEnabled")
    def object_lock_enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Enable object lock
        """
        return pulumi.get(self, "object_lock_enabled")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        `project_id`) The ID of the project the bucket is associated with.

        The `acl` attribute is deprecated. See ObjectBucketAcl resource documentation.
        Please check the [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl_overview.html#canned-acl) documentation for supported values.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def region(self) -> pulumi.Output[str]:
        """
        The [region](https://developers.scaleway.com/en/quickstart/#region-definition) in which the bucket should be created.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A list of tags (key / value) for the bucket.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def versioning(self) -> pulumi.Output['outputs.ObjectBucketVersioning']:
        """
        A state of [versioning](https://docs.aws.amazon.com/AmazonS3/latest/dev/Versioning.html) (documented below)
        """
        return pulumi.get(self, "versioning")

