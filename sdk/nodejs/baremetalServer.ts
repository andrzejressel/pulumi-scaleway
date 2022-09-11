// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Creates and manages Scaleway Compute Baremetal servers. For more information, see [the documentation](https://developers.scaleway.com/en/products/baremetal/api).
 *
 * ## Examples
 *
 * ### Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as pulumi_scaleway from "@lbrlabs/pulumi-scaleway";
 * import * as scaleway from "@pulumi/scaleway";
 *
 * const main = scaleway.getAccountSshKey({
 *     name: "main",
 * });
 * const base = new scaleway.BaremetalServer("base", {
 *     zone: "fr-par-2",
 *     offer: "GP-BM1-S",
 *     os: "d17d6872-0412-45d9-a198-af82c34d3c5c",
 *     sshKeyIds: [main.then(main => main.id)],
 * });
 * ```
 *
 * ## Import
 *
 * Baremetal servers can be imported using the `{zone}/{id}`, e.g. bash
 *
 * ```sh
 *  $ pulumi import scaleway:index/baremetalServer:BaremetalServer web fr-par-2/11111111-1111-1111-1111-111111111111
 * ```
 */
export class BaremetalServer extends pulumi.CustomResource {
    /**
     * Get an existing BaremetalServer resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BaremetalServerState, opts?: pulumi.CustomResourceOptions): BaremetalServer {
        return new BaremetalServer(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'scaleway:index/baremetalServer:BaremetalServer';

    /**
     * Returns true if the given object is an instance of BaremetalServer.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BaremetalServer {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BaremetalServer.__pulumiType;
    }

    /**
     * A description for the server.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The domain of the server.
     */
    public /*out*/ readonly domain!: pulumi.Output<string>;
    /**
     * The hostname of the server.
     */
    public readonly hostname!: pulumi.Output<string | undefined>;
    /**
     * (List of) The IPs of the server.
     */
    public /*out*/ readonly ips!: pulumi.Output<outputs.BaremetalServerIp[]>;
    /**
     * The name of the server.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The offer name or UUID of the baremetal server.
     * Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-334154) to find the right offer.
     */
    public readonly offer!: pulumi.Output<string>;
    /**
     * The ID of the offer.
     */
    public /*out*/ readonly offerId!: pulumi.Output<string>;
    /**
     * The organization ID the server is associated with.
     */
    public /*out*/ readonly organizationId!: pulumi.Output<string>;
    /**
     * The UUID of the os to install on the server.
     * Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-87598a) to find the right OS ID.
     * > **Important:** Updates to `os` will reinstall the server.
     */
    public readonly os!: pulumi.Output<string>;
    /**
     * The ID of the os.
     */
    public /*out*/ readonly osId!: pulumi.Output<string>;
    /**
     * `projectId`) The ID of the project the server is associated with.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * List of SSH keys allowed to connect to the server.
     * > **Important:** Updates to `sshKeyIds` will reinstall the server.
     */
    public readonly sshKeyIds!: pulumi.Output<string[]>;
    /**
     * The tags associated with the server.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * `zone`) The zone in which the server should be created.
     */
    public readonly zone!: pulumi.Output<string>;

    /**
     * Create a BaremetalServer resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BaremetalServerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BaremetalServerArgs | BaremetalServerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BaremetalServerState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["domain"] = state ? state.domain : undefined;
            resourceInputs["hostname"] = state ? state.hostname : undefined;
            resourceInputs["ips"] = state ? state.ips : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["offer"] = state ? state.offer : undefined;
            resourceInputs["offerId"] = state ? state.offerId : undefined;
            resourceInputs["organizationId"] = state ? state.organizationId : undefined;
            resourceInputs["os"] = state ? state.os : undefined;
            resourceInputs["osId"] = state ? state.osId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["sshKeyIds"] = state ? state.sshKeyIds : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["zone"] = state ? state.zone : undefined;
        } else {
            const args = argsOrState as BaremetalServerArgs | undefined;
            if ((!args || args.offer === undefined) && !opts.urn) {
                throw new Error("Missing required property 'offer'");
            }
            if ((!args || args.os === undefined) && !opts.urn) {
                throw new Error("Missing required property 'os'");
            }
            if ((!args || args.sshKeyIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sshKeyIds'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["hostname"] = args ? args.hostname : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["offer"] = args ? args.offer : undefined;
            resourceInputs["os"] = args ? args.os : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["sshKeyIds"] = args ? args.sshKeyIds : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["zone"] = args ? args.zone : undefined;
            resourceInputs["domain"] = undefined /*out*/;
            resourceInputs["ips"] = undefined /*out*/;
            resourceInputs["offerId"] = undefined /*out*/;
            resourceInputs["organizationId"] = undefined /*out*/;
            resourceInputs["osId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BaremetalServer.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BaremetalServer resources.
 */
export interface BaremetalServerState {
    /**
     * A description for the server.
     */
    description?: pulumi.Input<string>;
    /**
     * The domain of the server.
     */
    domain?: pulumi.Input<string>;
    /**
     * The hostname of the server.
     */
    hostname?: pulumi.Input<string>;
    /**
     * (List of) The IPs of the server.
     */
    ips?: pulumi.Input<pulumi.Input<inputs.BaremetalServerIp>[]>;
    /**
     * The name of the server.
     */
    name?: pulumi.Input<string>;
    /**
     * The offer name or UUID of the baremetal server.
     * Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-334154) to find the right offer.
     */
    offer?: pulumi.Input<string>;
    /**
     * The ID of the offer.
     */
    offerId?: pulumi.Input<string>;
    /**
     * The organization ID the server is associated with.
     */
    organizationId?: pulumi.Input<string>;
    /**
     * The UUID of the os to install on the server.
     * Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-87598a) to find the right OS ID.
     * > **Important:** Updates to `os` will reinstall the server.
     */
    os?: pulumi.Input<string>;
    /**
     * The ID of the os.
     */
    osId?: pulumi.Input<string>;
    /**
     * `projectId`) The ID of the project the server is associated with.
     */
    projectId?: pulumi.Input<string>;
    /**
     * List of SSH keys allowed to connect to the server.
     * > **Important:** Updates to `sshKeyIds` will reinstall the server.
     */
    sshKeyIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The tags associated with the server.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * `zone`) The zone in which the server should be created.
     */
    zone?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BaremetalServer resource.
 */
export interface BaremetalServerArgs {
    /**
     * A description for the server.
     */
    description?: pulumi.Input<string>;
    /**
     * The hostname of the server.
     */
    hostname?: pulumi.Input<string>;
    /**
     * The name of the server.
     */
    name?: pulumi.Input<string>;
    /**
     * The offer name or UUID of the baremetal server.
     * Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-334154) to find the right offer.
     */
    offer: pulumi.Input<string>;
    /**
     * The UUID of the os to install on the server.
     * Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-87598a) to find the right OS ID.
     * > **Important:** Updates to `os` will reinstall the server.
     */
    os: pulumi.Input<string>;
    /**
     * `projectId`) The ID of the project the server is associated with.
     */
    projectId?: pulumi.Input<string>;
    /**
     * List of SSH keys allowed to connect to the server.
     * > **Important:** Updates to `sshKeyIds` will reinstall the server.
     */
    sshKeyIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The tags associated with the server.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * `zone`) The zone in which the server should be created.
     */
    zone?: pulumi.Input<string>;
}
