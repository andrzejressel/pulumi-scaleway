// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scaleway.DatabaseInstanceArgs;
import com.pulumi.scaleway.Utilities;
import com.pulumi.scaleway.inputs.DatabaseInstanceState;
import com.pulumi.scaleway.outputs.DatabaseInstanceLoadBalancer;
import com.pulumi.scaleway.outputs.DatabaseInstancePrivateNetwork;
import com.pulumi.scaleway.outputs.DatabaseInstanceReadReplica;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Database Instance can be imported using the `{region}/{id}`, e.g. bash
 * 
 * ```sh
 *  $ pulumi import scaleway:index/databaseInstance:DatabaseInstance rdb01 fr-par/11111111-1111-1111-1111-111111111111
 * ```
 * 
 */
@ResourceType(type="scaleway:index/databaseInstance:DatabaseInstance")
public class DatabaseInstance extends com.pulumi.resources.CustomResource {
    /**
     * Boolean to store logical backups in the same region as the database instance.
     * 
     */
    @Export(name="backupSameRegion", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> backupSameRegion;

    /**
     * @return Boolean to store logical backups in the same region as the database instance.
     * 
     */
    public Output<Boolean> backupSameRegion() {
        return this.backupSameRegion;
    }
    /**
     * Backup schedule frequency in hours.
     * 
     */
    @Export(name="backupScheduleFrequency", refs={Integer.class}, tree="[0]")
    private Output<Integer> backupScheduleFrequency;

    /**
     * @return Backup schedule frequency in hours.
     * 
     */
    public Output<Integer> backupScheduleFrequency() {
        return this.backupScheduleFrequency;
    }
    /**
     * Backup schedule retention in days.
     * 
     */
    @Export(name="backupScheduleRetention", refs={Integer.class}, tree="[0]")
    private Output<Integer> backupScheduleRetention;

    /**
     * @return Backup schedule retention in days.
     * 
     */
    public Output<Integer> backupScheduleRetention() {
        return this.backupScheduleRetention;
    }
    /**
     * Certificate of the database instance.
     * 
     */
    @Export(name="certificate", refs={String.class}, tree="[0]")
    private Output<String> certificate;

    /**
     * @return Certificate of the database instance.
     * 
     */
    public Output<String> certificate() {
        return this.certificate;
    }
    /**
     * Disable automated backup for the database instance.
     * 
     */
    @Export(name="disableBackup", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> disableBackup;

    /**
     * @return Disable automated backup for the database instance.
     * 
     */
    public Output<Optional<Boolean>> disableBackup() {
        return Codegen.optional(this.disableBackup);
    }
    /**
     * (Deprecated) The IP of the Database Instance.
     * 
     * @deprecated
     * Please use the private_network or the load_balancer attribute
     * 
     */
    @Deprecated /* Please use the private_network or the load_balancer attribute */
    @Export(name="endpointIp", refs={String.class}, tree="[0]")
    private Output<String> endpointIp;

    /**
     * @return (Deprecated) The IP of the Database Instance.
     * 
     */
    public Output<String> endpointIp() {
        return this.endpointIp;
    }
    /**
     * (Deprecated) The port of the Database Instance.
     * 
     */
    @Export(name="endpointPort", refs={Integer.class}, tree="[0]")
    private Output<Integer> endpointPort;

    /**
     * @return (Deprecated) The port of the Database Instance.
     * 
     */
    public Output<Integer> endpointPort() {
        return this.endpointPort;
    }
    /**
     * Database Instance&#39;s engine version (e.g. `PostgreSQL-11`).
     * 
     * &gt; **Important:** Updates to `engine` will recreate the Database Instance.
     * 
     */
    @Export(name="engine", refs={String.class}, tree="[0]")
    private Output<String> engine;

    /**
     * @return Database Instance&#39;s engine version (e.g. `PostgreSQL-11`).
     * 
     * &gt; **Important:** Updates to `engine` will recreate the Database Instance.
     * 
     */
    public Output<String> engine() {
        return this.engine;
    }
    /**
     * Map of engine settings to be set at database initialisation.
     * 
     * &gt; **Important:** Updates to `init_settings` will recreate the Database Instance.
     * 
     */
    @Export(name="initSettings", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> initSettings;

    /**
     * @return Map of engine settings to be set at database initialisation.
     * 
     * &gt; **Important:** Updates to `init_settings` will recreate the Database Instance.
     * 
     */
    public Output<Optional<Map<String,String>>> initSettings() {
        return Codegen.optional(this.initSettings);
    }
    /**
     * Enable or disable high availability for the database instance.
     * 
     * &gt; **Important:** Updates to `is_ha_cluster` will recreate the Database Instance.
     * 
     */
    @Export(name="isHaCluster", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isHaCluster;

    /**
     * @return Enable or disable high availability for the database instance.
     * 
     * &gt; **Important:** Updates to `is_ha_cluster` will recreate the Database Instance.
     * 
     */
    public Output<Optional<Boolean>> isHaCluster() {
        return Codegen.optional(this.isHaCluster);
    }
    /**
     * List of load balancer endpoints of the database instance.
     * 
     */
    @Export(name="loadBalancers", refs={List.class,DatabaseInstanceLoadBalancer.class}, tree="[0,1]")
    private Output<List<DatabaseInstanceLoadBalancer>> loadBalancers;

    /**
     * @return List of load balancer endpoints of the database instance.
     * 
     */
    public Output<List<DatabaseInstanceLoadBalancer>> loadBalancers() {
        return this.loadBalancers;
    }
    /**
     * The name of the Database Instance.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Database Instance.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The type of database instance you want to create (e.g. `db-dev-s`).
     * 
     * &gt; **Important:** Updates to `node_type` will upgrade the Database Instance to the desired `node_type` without any
     * interruption. Keep in mind that you cannot downgrade a Database Instance.
     * 
     */
    @Export(name="nodeType", refs={String.class}, tree="[0]")
    private Output<String> nodeType;

    /**
     * @return The type of database instance you want to create (e.g. `db-dev-s`).
     * 
     * &gt; **Important:** Updates to `node_type` will upgrade the Database Instance to the desired `node_type` without any
     * interruption. Keep in mind that you cannot downgrade a Database Instance.
     * 
     */
    public Output<String> nodeType() {
        return this.nodeType;
    }
    /**
     * The organization ID the Database Instance is associated with.
     * 
     */
    @Export(name="organizationId", refs={String.class}, tree="[0]")
    private Output<String> organizationId;

    /**
     * @return The organization ID the Database Instance is associated with.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }
    /**
     * Password for the first user of the database instance.
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> password;

    /**
     * @return Password for the first user of the database instance.
     * 
     */
    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
    }
    /**
     * List of private networks endpoints of the database instance.
     * 
     */
    @Export(name="privateNetwork", refs={DatabaseInstancePrivateNetwork.class}, tree="[0]")
    private Output</* @Nullable */ DatabaseInstancePrivateNetwork> privateNetwork;

    /**
     * @return List of private networks endpoints of the database instance.
     * 
     */
    public Output<Optional<DatabaseInstancePrivateNetwork>> privateNetwork() {
        return Codegen.optional(this.privateNetwork);
    }
    /**
     * `project_id`) The ID of the project the Database
     * Instance is associated with.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the Database
     * Instance is associated with.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * List of read replicas of the database instance.
     * 
     */
    @Export(name="readReplicas", refs={List.class,DatabaseInstanceReadReplica.class}, tree="[0,1]")
    private Output<List<DatabaseInstanceReadReplica>> readReplicas;

    /**
     * @return List of read replicas of the database instance.
     * 
     */
    public Output<List<DatabaseInstanceReadReplica>> readReplicas() {
        return this.readReplicas;
    }
    /**
     * `region`) The region
     * in which the Database Instance should be created.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return `region`) The region
     * in which the Database Instance should be created.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Map of engine settings to be set. Using this option will override default config.
     * 
     */
    @Export(name="settings", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> settings;

    /**
     * @return Map of engine settings to be set. Using this option will override default config.
     * 
     */
    public Output<Map<String,String>> settings() {
        return this.settings;
    }
    /**
     * The tags associated with the Database Instance.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return The tags associated with the Database Instance.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Identifier for the first user of the database instance.
     * 
     * &gt; **Important:** Updates to `user_name` will recreate the Database Instance.
     * 
     */
    @Export(name="userName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> userName;

    /**
     * @return Identifier for the first user of the database instance.
     * 
     * &gt; **Important:** Updates to `user_name` will recreate the Database Instance.
     * 
     */
    public Output<Optional<String>> userName() {
        return Codegen.optional(this.userName);
    }
    /**
     * Volume size (in GB) when `volume_type` is set to `bssd`.
     * 
     */
    @Export(name="volumeSizeInGb", refs={Integer.class}, tree="[0]")
    private Output<Integer> volumeSizeInGb;

    /**
     * @return Volume size (in GB) when `volume_type` is set to `bssd`.
     * 
     */
    public Output<Integer> volumeSizeInGb() {
        return this.volumeSizeInGb;
    }
    /**
     * Type of volume where data are stored (`bssd` or `lssd`).
     * 
     */
    @Export(name="volumeType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> volumeType;

    /**
     * @return Type of volume where data are stored (`bssd` or `lssd`).
     * 
     */
    public Output<Optional<String>> volumeType() {
        return Codegen.optional(this.volumeType);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DatabaseInstance(String name) {
        this(name, DatabaseInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DatabaseInstance(String name, DatabaseInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DatabaseInstance(String name, DatabaseInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/databaseInstance:DatabaseInstance", name, args == null ? DatabaseInstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DatabaseInstance(String name, Output<String> id, @Nullable DatabaseInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/databaseInstance:DatabaseInstance", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "password"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DatabaseInstance get(String name, Output<String> id, @Nullable DatabaseInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DatabaseInstance(name, id, state, options);
    }
}
