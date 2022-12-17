// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Gets information about an existing IAM application.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as scaleway from "@pulumi/scaleway";
 *
 * const findByName = scaleway.getIamApplication({
 *     name: "foobar",
 * });
 * const findById = scaleway.getIamApplication({
 *     applicationId: "11111111-1111-1111-1111-111111111111",
 * });
 * ```
 */
export function getIamApplication(args?: GetIamApplicationArgs, opts?: pulumi.InvokeOptions): Promise<GetIamApplicationResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scaleway:index/getIamApplication:getIamApplication", {
        "applicationId": args.applicationId,
        "name": args.name,
        "organizationId": args.organizationId,
    }, opts);
}

/**
 * A collection of arguments for invoking getIamApplication.
 */
export interface GetIamApplicationArgs {
    /**
     * The ID of the IAM application.
     * Only one of the `name` and `applicationId` should be specified.
     */
    applicationId?: string;
    /**
     * The name of the IAM application.
     * Only one of the `name` and `applicationId` should be specified.
     */
    name?: string;
    /**
     * `organizationId`) The ID of the
     * organization the application is associated with.
     */
    organizationId?: string;
}

/**
 * A collection of values returned by getIamApplication.
 */
export interface GetIamApplicationResult {
    readonly applicationId?: string;
    readonly createdAt: string;
    readonly description: string;
    readonly editable: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name?: string;
    readonly organizationId?: string;
    readonly updatedAt: string;
}
/**
 * Gets information about an existing IAM application.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as scaleway from "@pulumi/scaleway";
 *
 * const findByName = scaleway.getIamApplication({
 *     name: "foobar",
 * });
 * const findById = scaleway.getIamApplication({
 *     applicationId: "11111111-1111-1111-1111-111111111111",
 * });
 * ```
 */
export function getIamApplicationOutput(args?: GetIamApplicationOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetIamApplicationResult> {
    return pulumi.output(args).apply((a: any) => getIamApplication(a, opts))
}

/**
 * A collection of arguments for invoking getIamApplication.
 */
export interface GetIamApplicationOutputArgs {
    /**
     * The ID of the IAM application.
     * Only one of the `name` and `applicationId` should be specified.
     */
    applicationId?: pulumi.Input<string>;
    /**
     * The name of the IAM application.
     * Only one of the `name` and `applicationId` should be specified.
     */
    name?: pulumi.Input<string>;
    /**
     * `organizationId`) The ID of the
     * organization the application is associated with.
     */
    organizationId?: pulumi.Input<string>;
}
