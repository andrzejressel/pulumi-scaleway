// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Gets information about a function namespace.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as scaleway from "@pulumi/scaleway";
 *
 * const myNamespace = scaleway.getFunctionNamespace({
 *     namespaceId: "11111111-1111-1111-1111-111111111111",
 * });
 * ```
 */
export function getFunctionNamespace(args?: GetFunctionNamespaceArgs, opts?: pulumi.InvokeOptions): Promise<GetFunctionNamespaceResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scaleway:index/getFunctionNamespace:getFunctionNamespace", {
        "name": args.name,
        "namespaceId": args.namespaceId,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getFunctionNamespace.
 */
export interface GetFunctionNamespaceArgs {
    /**
     * The namespace name.
     * Only one of `name` and `namespaceId` should be specified.
     */
    name?: string;
    /**
     * The namespace id.
     * Only one of `name` and `namespaceId` should be specified.
     */
    namespaceId?: string;
    /**
     * `region`) The region in which the namespace exists.
     */
    region?: string;
}

/**
 * A collection of values returned by getFunctionNamespace.
 */
export interface GetFunctionNamespaceResult {
    /**
     * The description of the namespace.
     */
    readonly description: string;
    /**
     * The environment variables of the namespace.
     */
    readonly environmentVariables: {[key: string]: string};
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name?: string;
    readonly namespaceId?: string;
    /**
     * The organization ID the namespace is associated with.
     */
    readonly organizationId: string;
    readonly projectId: string;
    readonly region?: string;
    /**
     * The registry endpoint of the namespace.
     */
    readonly registryEndpoint: string;
    /**
     * The registry namespace ID of the namespace.
     */
    readonly registryNamespaceId: string;
    readonly secretEnvironmentVariables: {[key: string]: string};
}

export function getFunctionNamespaceOutput(args?: GetFunctionNamespaceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFunctionNamespaceResult> {
    return pulumi.output(args).apply(a => getFunctionNamespace(a, opts))
}

/**
 * A collection of arguments for invoking getFunctionNamespace.
 */
export interface GetFunctionNamespaceOutputArgs {
    /**
     * The namespace name.
     * Only one of `name` and `namespaceId` should be specified.
     */
    name?: pulumi.Input<string>;
    /**
     * The namespace id.
     * Only one of `name` and `namespaceId` should be specified.
     */
    namespaceId?: pulumi.Input<string>;
    /**
     * `region`) The region in which the namespace exists.
     */
    region?: pulumi.Input<string>;
}
