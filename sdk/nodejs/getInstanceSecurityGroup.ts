// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Gets information about a Security Group.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as scaleway from "@pulumi/scaleway";
 *
 * // Get info by security group id
 * const myKey = pulumi.output(scaleway.getInstanceSecurityGroup({
 *     securityGroupId: "11111111-1111-1111-1111-111111111111",
 * }, { async: true }));
 * ```
 */
export function getInstanceSecurityGroup(args?: GetInstanceSecurityGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetInstanceSecurityGroupResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("scaleway:index/getInstanceSecurityGroup:getInstanceSecurityGroup", {
        "name": args.name,
        "securityGroupId": args.securityGroupId,
        "zone": args.zone,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstanceSecurityGroup.
 */
export interface GetInstanceSecurityGroupArgs {
    /**
     * The security group name. Only one of `name` and `securityGroupId` should be specified.
     */
    readonly name?: string;
    /**
     * The security group id. Only one of `name` and `securityGroupId` should be specified.
     */
    readonly securityGroupId?: string;
    /**
     * `zone`) The zone in which the security group exists.
     */
    readonly zone?: string;
}

/**
 * A collection of values returned by getInstanceSecurityGroup.
 */
export interface GetInstanceSecurityGroupResult {
    readonly description: string;
    readonly externalRules: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The default policy on incoming traffic. Possible values are: `accept` or `drop`.
     */
    readonly inboundDefaultPolicy: string;
    /**
     * A list of inbound rule to add to the security group. (Structure is documented below.)
     */
    readonly inboundRules: outputs.GetInstanceSecurityGroupInboundRule[];
    readonly name?: string;
    /**
     * The ID of the organization the security group is associated with.
     */
    readonly organizationId: string;
    /**
     * The default policy on outgoing traffic. Possible values are: `accept` or `drop`.
     */
    readonly outboundDefaultPolicy: string;
    /**
     * A list of outbound rule to add to the security group. (Structure is documented below.)
     */
    readonly outboundRules: outputs.GetInstanceSecurityGroupOutboundRule[];
    readonly securityGroupId?: string;
    readonly stateful: boolean;
    readonly zone?: string;
}
