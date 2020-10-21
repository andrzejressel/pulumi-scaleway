// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * **DEPRECATED**: This resource is deprecated and will be removed in `v2.0+`.
 * Please use `scaleway.InstanceIP` instead.
 *
 * Provides reverse DNS settings for IPs.
 * For additional details please refer to [API documentation](https://developer.scaleway.com/#ips).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as scaleway from "@pulumi/scaleway";
 *
 * const testService = new scaleway.IP("testService", {});
 * const google = new scaleway.IPReverseDNS("google", {
 *     ip: testService.id,
 *     reverse: "test_service.awesome-corp.com",
 * });
 * ```
 */
export class IPReverseDNS extends pulumi.CustomResource {
    /**
     * Get an existing IPReverseDNS resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IPReverseDNSState, opts?: pulumi.CustomResourceOptions): IPReverseDNS {
        return new IPReverseDNS(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'scaleway:index/iPReverseDNS:IPReverseDNS';

    /**
     * Returns true if the given object is an instance of IPReverseDNS.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IPReverseDNS {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IPReverseDNS.__pulumiType;
    }

    /**
     * ID or Address of IP
     */
    public readonly ip!: pulumi.Output<string>;
    /**
     * Reverse DNS of the IP
     */
    public readonly reverse!: pulumi.Output<string>;

    /**
     * Create a IPReverseDNS resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IPReverseDNSArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IPReverseDNSArgs | IPReverseDNSState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as IPReverseDNSState | undefined;
            inputs["ip"] = state ? state.ip : undefined;
            inputs["reverse"] = state ? state.reverse : undefined;
        } else {
            const args = argsOrState as IPReverseDNSArgs | undefined;
            if (!args || args.ip === undefined) {
                throw new Error("Missing required property 'ip'");
            }
            if (!args || args.reverse === undefined) {
                throw new Error("Missing required property 'reverse'");
            }
            inputs["ip"] = args ? args.ip : undefined;
            inputs["reverse"] = args ? args.reverse : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(IPReverseDNS.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IPReverseDNS resources.
 */
export interface IPReverseDNSState {
    /**
     * ID or Address of IP
     */
    readonly ip?: pulumi.Input<string>;
    /**
     * Reverse DNS of the IP
     */
    readonly reverse?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a IPReverseDNS resource.
 */
export interface IPReverseDNSArgs {
    /**
     * ID or Address of IP
     */
    readonly ip: pulumi.Input<string>;
    /**
     * Reverse DNS of the IP
     */
    readonly reverse: pulumi.Input<string>;
}
