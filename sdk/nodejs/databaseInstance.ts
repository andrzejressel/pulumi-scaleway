// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Import
 *
 * Database Instance can be imported using the `{region}/{id}`, e.g. bash
 *
 * ```sh
 *  $ pulumi import scaleway:index/databaseInstance:DatabaseInstance rdb01 fr-par/11111111-1111-1111-1111-111111111111
 * ```
 */
export class DatabaseInstance extends pulumi.CustomResource {
    /**
     * Get an existing DatabaseInstance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatabaseInstanceState, opts?: pulumi.CustomResourceOptions): DatabaseInstance {
        return new DatabaseInstance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'scaleway:index/databaseInstance:DatabaseInstance';

    /**
     * Returns true if the given object is an instance of DatabaseInstance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is DatabaseInstance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === DatabaseInstance.__pulumiType;
    }

    /**
     * Boolean to store logical backups in the same region as the database instance.
     */
    public readonly backupSameRegion!: pulumi.Output<boolean>;
    /**
     * Backup schedule frequency in hours.
     */
    public readonly backupScheduleFrequency!: pulumi.Output<number>;
    /**
     * Backup schedule retention in days.
     */
    public readonly backupScheduleRetention!: pulumi.Output<number>;
    /**
     * Certificate of the database instance.
     */
    public /*out*/ readonly certificate!: pulumi.Output<string>;
    /**
     * Disable automated backup for the database instance.
     */
    public readonly disableBackup!: pulumi.Output<boolean | undefined>;
    /**
     * (Deprecated) The IP of the Database Instance.
     *
     * @deprecated Please use the private_network or the load_balancer attribute
     */
    public /*out*/ readonly endpointIp!: pulumi.Output<string>;
    /**
     * (Deprecated) The port of the Database Instance.
     */
    public /*out*/ readonly endpointPort!: pulumi.Output<number>;
    /**
     * Database Instance's engine version (e.g. `PostgreSQL-11`).
     *
     * > **Important:** Updates to `engine` will recreate the Database Instance.
     */
    public readonly engine!: pulumi.Output<string>;
    /**
     * Map of engine settings to be set at database initialisation.
     *
     * > **Important:** Updates to `initSettings` will recreate the Database Instance.
     */
    public readonly initSettings!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Enable or disable high availability for the database instance.
     *
     * > **Important:** Updates to `isHaCluster` will recreate the Database Instance.
     */
    public readonly isHaCluster!: pulumi.Output<boolean | undefined>;
    /**
     * List of load balancer endpoints of the database instance.
     */
    public /*out*/ readonly loadBalancers!: pulumi.Output<outputs.DatabaseInstanceLoadBalancer[]>;
    /**
     * The name of the Database Instance.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The type of database instance you want to create (e.g. `db-dev-s`).
     *
     * > **Important:** Updates to `nodeType` will upgrade the Database Instance to the desired `nodeType` without any
     * interruption. Keep in mind that you cannot downgrade a Database Instance.
     */
    public readonly nodeType!: pulumi.Output<string>;
    /**
     * The organization ID the Database Instance is associated with.
     */
    public /*out*/ readonly organizationId!: pulumi.Output<string>;
    /**
     * Password for the first user of the database instance.
     */
    public readonly password!: pulumi.Output<string | undefined>;
    /**
     * List of private networks endpoints of the database instance.
     */
    public readonly privateNetwork!: pulumi.Output<outputs.DatabaseInstancePrivateNetwork | undefined>;
    /**
     * `projectId`) The ID of the project the Database
     * Instance is associated with.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * List of read replicas of the database instance.
     */
    public /*out*/ readonly readReplicas!: pulumi.Output<outputs.DatabaseInstanceReadReplica[]>;
    /**
     * `region`) The region
     * in which the Database Instance should be created.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * Map of engine settings to be set. Using this option will override default config.
     */
    public readonly settings!: pulumi.Output<{[key: string]: string}>;
    /**
     * The tags associated with the Database Instance.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * Identifier for the first user of the database instance.
     *
     * > **Important:** Updates to `userName` will recreate the Database Instance.
     */
    public readonly userName!: pulumi.Output<string | undefined>;
    /**
     * Volume size (in GB) when `volumeType` is set to `bssd`.
     */
    public readonly volumeSizeInGb!: pulumi.Output<number>;
    /**
     * Type of volume where data are stored (`bssd` or `lssd`).
     */
    public readonly volumeType!: pulumi.Output<string | undefined>;

    /**
     * Create a DatabaseInstance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DatabaseInstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DatabaseInstanceArgs | DatabaseInstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DatabaseInstanceState | undefined;
            resourceInputs["backupSameRegion"] = state ? state.backupSameRegion : undefined;
            resourceInputs["backupScheduleFrequency"] = state ? state.backupScheduleFrequency : undefined;
            resourceInputs["backupScheduleRetention"] = state ? state.backupScheduleRetention : undefined;
            resourceInputs["certificate"] = state ? state.certificate : undefined;
            resourceInputs["disableBackup"] = state ? state.disableBackup : undefined;
            resourceInputs["endpointIp"] = state ? state.endpointIp : undefined;
            resourceInputs["endpointPort"] = state ? state.endpointPort : undefined;
            resourceInputs["engine"] = state ? state.engine : undefined;
            resourceInputs["initSettings"] = state ? state.initSettings : undefined;
            resourceInputs["isHaCluster"] = state ? state.isHaCluster : undefined;
            resourceInputs["loadBalancers"] = state ? state.loadBalancers : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nodeType"] = state ? state.nodeType : undefined;
            resourceInputs["organizationId"] = state ? state.organizationId : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["privateNetwork"] = state ? state.privateNetwork : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["readReplicas"] = state ? state.readReplicas : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["settings"] = state ? state.settings : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["userName"] = state ? state.userName : undefined;
            resourceInputs["volumeSizeInGb"] = state ? state.volumeSizeInGb : undefined;
            resourceInputs["volumeType"] = state ? state.volumeType : undefined;
        } else {
            const args = argsOrState as DatabaseInstanceArgs | undefined;
            if ((!args || args.engine === undefined) && !opts.urn) {
                throw new Error("Missing required property 'engine'");
            }
            if ((!args || args.nodeType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nodeType'");
            }
            resourceInputs["backupSameRegion"] = args ? args.backupSameRegion : undefined;
            resourceInputs["backupScheduleFrequency"] = args ? args.backupScheduleFrequency : undefined;
            resourceInputs["backupScheduleRetention"] = args ? args.backupScheduleRetention : undefined;
            resourceInputs["disableBackup"] = args ? args.disableBackup : undefined;
            resourceInputs["engine"] = args ? args.engine : undefined;
            resourceInputs["initSettings"] = args ? args.initSettings : undefined;
            resourceInputs["isHaCluster"] = args ? args.isHaCluster : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nodeType"] = args ? args.nodeType : undefined;
            resourceInputs["password"] = args?.password ? pulumi.secret(args.password) : undefined;
            resourceInputs["privateNetwork"] = args ? args.privateNetwork : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["settings"] = args ? args.settings : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["userName"] = args ? args.userName : undefined;
            resourceInputs["volumeSizeInGb"] = args ? args.volumeSizeInGb : undefined;
            resourceInputs["volumeType"] = args ? args.volumeType : undefined;
            resourceInputs["certificate"] = undefined /*out*/;
            resourceInputs["endpointIp"] = undefined /*out*/;
            resourceInputs["endpointPort"] = undefined /*out*/;
            resourceInputs["loadBalancers"] = undefined /*out*/;
            resourceInputs["organizationId"] = undefined /*out*/;
            resourceInputs["readReplicas"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["password"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(DatabaseInstance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering DatabaseInstance resources.
 */
export interface DatabaseInstanceState {
    /**
     * Boolean to store logical backups in the same region as the database instance.
     */
    backupSameRegion?: pulumi.Input<boolean>;
    /**
     * Backup schedule frequency in hours.
     */
    backupScheduleFrequency?: pulumi.Input<number>;
    /**
     * Backup schedule retention in days.
     */
    backupScheduleRetention?: pulumi.Input<number>;
    /**
     * Certificate of the database instance.
     */
    certificate?: pulumi.Input<string>;
    /**
     * Disable automated backup for the database instance.
     */
    disableBackup?: pulumi.Input<boolean>;
    /**
     * (Deprecated) The IP of the Database Instance.
     *
     * @deprecated Please use the private_network or the load_balancer attribute
     */
    endpointIp?: pulumi.Input<string>;
    /**
     * (Deprecated) The port of the Database Instance.
     */
    endpointPort?: pulumi.Input<number>;
    /**
     * Database Instance's engine version (e.g. `PostgreSQL-11`).
     *
     * > **Important:** Updates to `engine` will recreate the Database Instance.
     */
    engine?: pulumi.Input<string>;
    /**
     * Map of engine settings to be set at database initialisation.
     *
     * > **Important:** Updates to `initSettings` will recreate the Database Instance.
     */
    initSettings?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Enable or disable high availability for the database instance.
     *
     * > **Important:** Updates to `isHaCluster` will recreate the Database Instance.
     */
    isHaCluster?: pulumi.Input<boolean>;
    /**
     * List of load balancer endpoints of the database instance.
     */
    loadBalancers?: pulumi.Input<pulumi.Input<inputs.DatabaseInstanceLoadBalancer>[]>;
    /**
     * The name of the Database Instance.
     */
    name?: pulumi.Input<string>;
    /**
     * The type of database instance you want to create (e.g. `db-dev-s`).
     *
     * > **Important:** Updates to `nodeType` will upgrade the Database Instance to the desired `nodeType` without any
     * interruption. Keep in mind that you cannot downgrade a Database Instance.
     */
    nodeType?: pulumi.Input<string>;
    /**
     * The organization ID the Database Instance is associated with.
     */
    organizationId?: pulumi.Input<string>;
    /**
     * Password for the first user of the database instance.
     */
    password?: pulumi.Input<string>;
    /**
     * List of private networks endpoints of the database instance.
     */
    privateNetwork?: pulumi.Input<inputs.DatabaseInstancePrivateNetwork>;
    /**
     * `projectId`) The ID of the project the Database
     * Instance is associated with.
     */
    projectId?: pulumi.Input<string>;
    /**
     * List of read replicas of the database instance.
     */
    readReplicas?: pulumi.Input<pulumi.Input<inputs.DatabaseInstanceReadReplica>[]>;
    /**
     * `region`) The region
     * in which the Database Instance should be created.
     */
    region?: pulumi.Input<string>;
    /**
     * Map of engine settings to be set. Using this option will override default config.
     */
    settings?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The tags associated with the Database Instance.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Identifier for the first user of the database instance.
     *
     * > **Important:** Updates to `userName` will recreate the Database Instance.
     */
    userName?: pulumi.Input<string>;
    /**
     * Volume size (in GB) when `volumeType` is set to `bssd`.
     */
    volumeSizeInGb?: pulumi.Input<number>;
    /**
     * Type of volume where data are stored (`bssd` or `lssd`).
     */
    volumeType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a DatabaseInstance resource.
 */
export interface DatabaseInstanceArgs {
    /**
     * Boolean to store logical backups in the same region as the database instance.
     */
    backupSameRegion?: pulumi.Input<boolean>;
    /**
     * Backup schedule frequency in hours.
     */
    backupScheduleFrequency?: pulumi.Input<number>;
    /**
     * Backup schedule retention in days.
     */
    backupScheduleRetention?: pulumi.Input<number>;
    /**
     * Disable automated backup for the database instance.
     */
    disableBackup?: pulumi.Input<boolean>;
    /**
     * Database Instance's engine version (e.g. `PostgreSQL-11`).
     *
     * > **Important:** Updates to `engine` will recreate the Database Instance.
     */
    engine: pulumi.Input<string>;
    /**
     * Map of engine settings to be set at database initialisation.
     *
     * > **Important:** Updates to `initSettings` will recreate the Database Instance.
     */
    initSettings?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Enable or disable high availability for the database instance.
     *
     * > **Important:** Updates to `isHaCluster` will recreate the Database Instance.
     */
    isHaCluster?: pulumi.Input<boolean>;
    /**
     * The name of the Database Instance.
     */
    name?: pulumi.Input<string>;
    /**
     * The type of database instance you want to create (e.g. `db-dev-s`).
     *
     * > **Important:** Updates to `nodeType` will upgrade the Database Instance to the desired `nodeType` without any
     * interruption. Keep in mind that you cannot downgrade a Database Instance.
     */
    nodeType: pulumi.Input<string>;
    /**
     * Password for the first user of the database instance.
     */
    password?: pulumi.Input<string>;
    /**
     * List of private networks endpoints of the database instance.
     */
    privateNetwork?: pulumi.Input<inputs.DatabaseInstancePrivateNetwork>;
    /**
     * `projectId`) The ID of the project the Database
     * Instance is associated with.
     */
    projectId?: pulumi.Input<string>;
    /**
     * `region`) The region
     * in which the Database Instance should be created.
     */
    region?: pulumi.Input<string>;
    /**
     * Map of engine settings to be set. Using this option will override default config.
     */
    settings?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The tags associated with the Database Instance.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Identifier for the first user of the database instance.
     *
     * > **Important:** Updates to `userName` will recreate the Database Instance.
     */
    userName?: pulumi.Input<string>;
    /**
     * Volume size (in GB) when `volumeType` is set to `bssd`.
     */
    volumeSizeInGb?: pulumi.Input<number>;
    /**
     * Type of volume where data are stored (`bssd` or `lssd`).
     */
    volumeType?: pulumi.Input<string>;
}
