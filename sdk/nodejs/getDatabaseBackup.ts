// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Gets information about an RDB backup.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as scaleway from "@pulumi/scaleway";
 *
 * const findByName = scaleway.getDatabaseBackup({
 *     name: "mybackup",
 * });
 * const findByNameAndInstance = scaleway.getDatabaseBackup({
 *     instanceId: "11111111-1111-1111-1111-111111111111",
 *     name: "mybackup",
 * });
 * const findById = scaleway.getDatabaseBackup({
 *     backupId: "11111111-1111-1111-1111-111111111111",
 * });
 * ```
 */
export function getDatabaseBackup(args?: GetDatabaseBackupArgs, opts?: pulumi.InvokeOptions): Promise<GetDatabaseBackupResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scaleway:index/getDatabaseBackup:getDatabaseBackup", {
        "backupId": args.backupId,
        "instanceId": args.instanceId,
        "name": args.name,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getDatabaseBackup.
 */
export interface GetDatabaseBackupArgs {
    /**
     * The RDB backup ID.
     * Only one of the `name` and `backupId` should be specified.
     */
    backupId?: string;
    /**
     * The RDB instance ID.
     */
    instanceId?: string;
    /**
     * The name of the RDB instance.
     * Only one of the `name` and `backupId` should be specified.
     */
    name?: string;
    region?: string;
}

/**
 * A collection of values returned by getDatabaseBackup.
 */
export interface GetDatabaseBackupResult {
    readonly backupId?: string;
    readonly createdAt: string;
    readonly databaseName: string;
    readonly expiresAt: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly instanceId?: string;
    readonly instanceName: string;
    readonly name?: string;
    readonly region?: string;
    readonly size: number;
    readonly updatedAt: string;
}
/**
 * Gets information about an RDB backup.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as scaleway from "@pulumi/scaleway";
 *
 * const findByName = scaleway.getDatabaseBackup({
 *     name: "mybackup",
 * });
 * const findByNameAndInstance = scaleway.getDatabaseBackup({
 *     instanceId: "11111111-1111-1111-1111-111111111111",
 *     name: "mybackup",
 * });
 * const findById = scaleway.getDatabaseBackup({
 *     backupId: "11111111-1111-1111-1111-111111111111",
 * });
 * ```
 */
export function getDatabaseBackupOutput(args?: GetDatabaseBackupOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDatabaseBackupResult> {
    return pulumi.output(args).apply((a: any) => getDatabaseBackup(a, opts))
}

/**
 * A collection of arguments for invoking getDatabaseBackup.
 */
export interface GetDatabaseBackupOutputArgs {
    /**
     * The RDB backup ID.
     * Only one of the `name` and `backupId` should be specified.
     */
    backupId?: pulumi.Input<string>;
    /**
     * The RDB instance ID.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * The name of the RDB instance.
     * Only one of the `name` and `backupId` should be specified.
     */
    name?: pulumi.Input<string>;
    region?: pulumi.Input<string>;
}
