// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * **DEPRECATED**: This resource is deprecated and will be removed in `v2.0+`.
 * Please use `scalewayInstanceSecurityGroupRule` instead.
 *
 * Provides security group rules. This allows security group rules to be created, updated and deleted.
 * For additional details please refer to [API documentation](https://developer.scaleway.com/#security-groups-manage-rules).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as scaleway from "@pulumi/scaleway";
 *
 * const test = new scaleway.SecurityGroup("test", {description: "test"});
 * const smtpDrop1 = new scaleway.SecurityGroupRule("smtpDrop1", {
 *     securityGroup: test.id,
 *     action: "accept",
 *     direction: "inbound",
 *     ipRange: "0.0.0.0/0",
 *     protocol: "TCP",
 *     port: 25,
 * });
 * ```
 */
export class SecurityGroupRule extends pulumi.CustomResource {
    /**
     * Get an existing SecurityGroupRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecurityGroupRuleState, opts?: pulumi.CustomResourceOptions): SecurityGroupRule {
        return new SecurityGroupRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'scaleway:index/securityGroupRule:SecurityGroupRule';

    /**
     * Returns true if the given object is an instance of SecurityGroupRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SecurityGroupRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SecurityGroupRule.__pulumiType;
    }

    /**
     * action of rule (`accept`, `drop`)
     */
    public readonly action!: pulumi.Output<string>;
    /**
     * direction of rule (`inbound`, `outbound`)
     */
    public readonly direction!: pulumi.Output<string>;
    /**
     * ip_range of rule
     */
    public readonly ipRange!: pulumi.Output<string>;
    /**
     * port of the rule
     */
    public readonly port!: pulumi.Output<number | undefined>;
    /**
     * protocol of rule (`ICMP`, `TCP`, `UDP`)
     */
    public readonly protocol!: pulumi.Output<string>;
    /**
     * the security group which should be associated with this rule
     */
    public readonly securityGroup!: pulumi.Output<string>;

    /**
     * Create a SecurityGroupRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SecurityGroupRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecurityGroupRuleArgs | SecurityGroupRuleState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as SecurityGroupRuleState | undefined;
            inputs["action"] = state ? state.action : undefined;
            inputs["direction"] = state ? state.direction : undefined;
            inputs["ipRange"] = state ? state.ipRange : undefined;
            inputs["port"] = state ? state.port : undefined;
            inputs["protocol"] = state ? state.protocol : undefined;
            inputs["securityGroup"] = state ? state.securityGroup : undefined;
        } else {
            const args = argsOrState as SecurityGroupRuleArgs | undefined;
            if (!args || args.action === undefined) {
                throw new Error("Missing required property 'action'");
            }
            if (!args || args.direction === undefined) {
                throw new Error("Missing required property 'direction'");
            }
            if (!args || args.ipRange === undefined) {
                throw new Error("Missing required property 'ipRange'");
            }
            if (!args || args.protocol === undefined) {
                throw new Error("Missing required property 'protocol'");
            }
            if (!args || args.securityGroup === undefined) {
                throw new Error("Missing required property 'securityGroup'");
            }
            inputs["action"] = args ? args.action : undefined;
            inputs["direction"] = args ? args.direction : undefined;
            inputs["ipRange"] = args ? args.ipRange : undefined;
            inputs["port"] = args ? args.port : undefined;
            inputs["protocol"] = args ? args.protocol : undefined;
            inputs["securityGroup"] = args ? args.securityGroup : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(SecurityGroupRule.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SecurityGroupRule resources.
 */
export interface SecurityGroupRuleState {
    /**
     * action of rule (`accept`, `drop`)
     */
    readonly action?: pulumi.Input<string>;
    /**
     * direction of rule (`inbound`, `outbound`)
     */
    readonly direction?: pulumi.Input<string>;
    /**
     * ip_range of rule
     */
    readonly ipRange?: pulumi.Input<string>;
    /**
     * port of the rule
     */
    readonly port?: pulumi.Input<number>;
    /**
     * protocol of rule (`ICMP`, `TCP`, `UDP`)
     */
    readonly protocol?: pulumi.Input<string>;
    /**
     * the security group which should be associated with this rule
     */
    readonly securityGroup?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SecurityGroupRule resource.
 */
export interface SecurityGroupRuleArgs {
    /**
     * action of rule (`accept`, `drop`)
     */
    readonly action: pulumi.Input<string>;
    /**
     * direction of rule (`inbound`, `outbound`)
     */
    readonly direction: pulumi.Input<string>;
    /**
     * ip_range of rule
     */
    readonly ipRange: pulumi.Input<string>;
    /**
     * port of the rule
     */
    readonly port?: pulumi.Input<number>;
    /**
     * protocol of rule (`ICMP`, `TCP`, `UDP`)
     */
    readonly protocol: pulumi.Input<string>;
    /**
     * the security group which should be associated with this rule
     */
    readonly securityGroup: pulumi.Input<string>;
}
