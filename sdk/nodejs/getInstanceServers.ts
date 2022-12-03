// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Gets information about multiple instance servers.
 *
 * ## Examples
 *
 * ### Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as scaleway from "@pulumi/scaleway";
 *
 * const myKey = scaleway.getInstanceServers({
 *     name: "myserver",
 *     zone: "fr-par-2",
 * });
 * ```
 */
export function getInstanceServers(args?: GetInstanceServersArgs, opts?: pulumi.InvokeOptions): Promise<GetInstanceServersResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scaleway:index/getInstanceServers:getInstanceServers", {
        "name": args.name,
        "projectId": args.projectId,
        "tags": args.tags,
        "zone": args.zone,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstanceServers.
 */
export interface GetInstanceServersArgs {
    /**
     * The server name used as filter. Servers with a name like it are listed.
     */
    name?: string;
    /**
     * The ID of the project the server is associated with.
     */
    projectId?: string;
    /**
     * List of tags used as filter. Servers with these exact tags are listed.
     */
    tags?: string[];
    /**
     * `zone`) The zone in which servers exist.
     */
    zone?: string;
}

/**
 * A collection of values returned by getInstanceServers.
 */
export interface GetInstanceServersResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The name of the server.
     */
    readonly name?: string;
    /**
     * The organization ID the server is associated with.
     */
    readonly organizationId: string;
    /**
     * The ID of the project the server is associated with.
     */
    readonly projectId: string;
    /**
     * List of found servers
     */
    readonly servers: outputs.GetInstanceServersServer[];
    /**
     * The tags associated with the server.
     */
    readonly tags?: string[];
    /**
     * The zone in which the server is.
     */
    readonly zone: string;
}

export function getInstanceServersOutput(args?: GetInstanceServersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetInstanceServersResult> {
    return pulumi.output(args).apply(a => getInstanceServers(a, opts))
}

/**
 * A collection of arguments for invoking getInstanceServers.
 */
export interface GetInstanceServersOutputArgs {
    /**
     * The server name used as filter. Servers with a name like it are listed.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project the server is associated with.
     */
    projectId?: pulumi.Input<string>;
    /**
     * List of tags used as filter. Servers with these exact tags are listed.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * `zone`) The zone in which servers exist.
     */
    zone?: pulumi.Input<string>;
}
