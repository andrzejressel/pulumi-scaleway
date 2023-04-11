// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Scaleway
{
    /// <summary>
    /// Creates and manages Scaleway Database Instances.
    /// For more information, see [the documentation](https://developers.scaleway.com/en/products/rdb/api).
    /// 
    /// ## Examples
    /// 
    /// ### Example Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Scaleway = Lbrlabs.PulumiPackage.Scaleway;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var main = new Scaleway.DatabaseInstance("main", new()
    ///     {
    ///         DisableBackup = true,
    ///         Engine = "PostgreSQL-11",
    ///         IsHaCluster = true,
    ///         NodeType = "DB-DEV-S",
    ///         Password = "thiZ_is_v&amp;ry_s3cret",
    ///         UserName = "my_initial_user",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Example with Settings
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Scaleway = Lbrlabs.PulumiPackage.Scaleway;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var main = new Scaleway.DatabaseInstance("main", new()
    ///     {
    ///         DisableBackup = true,
    ///         Engine = "MySQL-8",
    ///         InitSettings = 
    ///         {
    ///             { "lower_case_table_names", "1" },
    ///         },
    ///         NodeType = "db-dev-s",
    ///         Password = "thiZ_is_v&amp;ry_s3cret",
    ///         Settings = 
    ///         {
    ///             { "max_connections", "350" },
    ///         },
    ///         UserName = "my_initial_user",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Example with backup schedule
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Scaleway = Lbrlabs.PulumiPackage.Scaleway;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var main = new Scaleway.DatabaseInstance("main", new()
    ///     {
    ///         BackupScheduleFrequency = 24,
    ///         BackupScheduleRetention = 7,
    ///         DisableBackup = false,
    ///         Engine = "PostgreSQL-11",
    ///         IsHaCluster = true,
    ///         NodeType = "DB-DEV-S",
    ///         Password = "thiZ_is_v&amp;ry_s3cret",
    ///         UserName = "my_initial_user",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Example with private network and dhcp configuration
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Scaleway = Lbrlabs.PulumiPackage.Scaleway;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var pn02 = new Scaleway.VpcPrivateNetwork("pn02");
    /// 
    ///     var mainVpcPublicGatewayDhcp = new Scaleway.VpcPublicGatewayDhcp("mainVpcPublicGatewayDhcp", new()
    ///     {
    ///         Subnet = "192.168.1.0/24",
    ///     });
    /// 
    ///     var mainVpcPublicGatewayIp = new Scaleway.VpcPublicGatewayIp("mainVpcPublicGatewayIp");
    /// 
    ///     var mainVpcPublicGateway = new Scaleway.VpcPublicGateway("mainVpcPublicGateway", new()
    ///     {
    ///         Type = "VPC-GW-S",
    ///         IpId = mainVpcPublicGatewayIp.Id,
    ///     });
    /// 
    ///     var mainVpcGatewayNetwork = new Scaleway.VpcGatewayNetwork("mainVpcGatewayNetwork", new()
    ///     {
    ///         GatewayId = mainVpcPublicGateway.Id,
    ///         PrivateNetworkId = pn02.Id,
    ///         DhcpId = mainVpcPublicGatewayDhcp.Id,
    ///         CleanupDhcp = true,
    ///         EnableMasquerade = true,
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             mainVpcPublicGatewayIp,
    ///             pn02,
    ///         },
    ///     });
    /// 
    ///     var mainDatabaseInstance = new Scaleway.DatabaseInstance("mainDatabaseInstance", new()
    ///     {
    ///         NodeType = "db-dev-s",
    ///         Engine = "PostgreSQL-11",
    ///         IsHaCluster = false,
    ///         DisableBackup = true,
    ///         UserName = "my_initial_user",
    ///         Password = "thiZ_is_v&amp;ry_s3cret",
    ///         Region = "fr-par",
    ///         Tags = new[]
    ///         {
    ///             "terraform-test",
    ///             "scaleway_rdb_instance",
    ///             "volume",
    ///             "rdb_pn",
    ///         },
    ///         VolumeType = "bssd",
    ///         VolumeSizeInGb = 10,
    ///         PrivateNetwork = new Scaleway.Inputs.DatabaseInstancePrivateNetworkArgs
    ///         {
    ///             IpNet = "192.168.1.254/24",
    ///             PnId = pn02.Id,
    ///         },
    ///     });
    /// 
    ///     var mainVpcPublicGatewayPatRule = new Scaleway.VpcPublicGatewayPatRule("mainVpcPublicGatewayPatRule", new()
    ///     {
    ///         GatewayId = mainVpcPublicGateway.Id,
    ///         PrivateIp = mainVpcPublicGatewayDhcp.Address,
    ///         PrivatePort = mainDatabaseInstance.PrivateNetwork.Apply(privateNetwork =&gt; privateNetwork?.Port),
    ///         PublicPort = 42,
    ///         Protocol = "both",
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             mainVpcGatewayNetwork,
    ///             pn02,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Settings
    /// 
    /// Please consult the [GoDoc](https://pkg.go.dev/github.com/scaleway/scaleway-sdk-go@v1.0.0-beta.9/api/rdb/v1#EngineVersion) to list all available `settings` and `init_settings` on your `node_type` of your convenient.
    /// 
    /// ## Private Network
    /// 
    /// &gt; **Important:** Updates to `private_network` will recreate the attachment Instance.
    /// 
    /// - `ip_net` - (Required) The IP network where to con.
    /// - `pn_id` - (Required) The ID of the private network. If not provided it will be randomly generated.
    /// 
    /// ## Limitations
    /// 
    /// The Managed Database product is only compliant with the private network in the default availability zone (AZ).
    /// i.e. `fr-par-1`, `nl-ams-1`, `pl-waw-1`. To learn more, read our section [How to connect a PostgreSQL and MySQL Database Instance to a Private Network](https://www.scaleway.com/en/docs/managed-databases/postgresql-and-mysql/how-to/connect-database-private-network/)
    /// 
    /// ## Import
    /// 
    /// Database Instance can be imported using the `{region}/{id}`, e.g. bash
    /// 
    /// ```sh
    ///  $ pulumi import scaleway:index/databaseInstance:DatabaseInstance rdb01 fr-par/11111111-1111-1111-1111-111111111111
    /// ```
    /// </summary>
    [ScalewayResourceType("scaleway:index/databaseInstance:DatabaseInstance")]
    public partial class DatabaseInstance : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Boolean to store logical backups in the same region as the database instance.
        /// </summary>
        [Output("backupSameRegion")]
        public Output<bool> BackupSameRegion { get; private set; } = null!;

        /// <summary>
        /// Backup schedule frequency in hours.
        /// </summary>
        [Output("backupScheduleFrequency")]
        public Output<int> BackupScheduleFrequency { get; private set; } = null!;

        /// <summary>
        /// Backup schedule retention in days.
        /// </summary>
        [Output("backupScheduleRetention")]
        public Output<int> BackupScheduleRetention { get; private set; } = null!;

        /// <summary>
        /// Certificate of the database instance.
        /// </summary>
        [Output("certificate")]
        public Output<string> Certificate { get; private set; } = null!;

        /// <summary>
        /// Disable automated backup for the database instance.
        /// </summary>
        [Output("disableBackup")]
        public Output<bool?> DisableBackup { get; private set; } = null!;

        /// <summary>
        /// (Deprecated) The IP of the Database Instance.
        /// </summary>
        [Output("endpointIp")]
        public Output<string> EndpointIp { get; private set; } = null!;

        /// <summary>
        /// (Deprecated) The port of the Database Instance.
        /// </summary>
        [Output("endpointPort")]
        public Output<int> EndpointPort { get; private set; } = null!;

        /// <summary>
        /// Database Instance's engine version (e.g. `PostgreSQL-11`).
        /// </summary>
        [Output("engine")]
        public Output<string> Engine { get; private set; } = null!;

        /// <summary>
        /// Map of engine settings to be set at database initialisation.
        /// </summary>
        [Output("initSettings")]
        public Output<ImmutableDictionary<string, string>?> InitSettings { get; private set; } = null!;

        /// <summary>
        /// Enable or disable high availability for the database instance.
        /// </summary>
        [Output("isHaCluster")]
        public Output<bool?> IsHaCluster { get; private set; } = null!;

        /// <summary>
        /// List of load balancer endpoints of the database instance.
        /// </summary>
        [Output("loadBalancers")]
        public Output<ImmutableArray<Outputs.DatabaseInstanceLoadBalancer>> LoadBalancers { get; private set; } = null!;

        /// <summary>
        /// The name of the Database Instance.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The type of database instance you want to create (e.g. `db-dev-s`).
        /// </summary>
        [Output("nodeType")]
        public Output<string> NodeType { get; private set; } = null!;

        /// <summary>
        /// The organization ID the Database Instance is associated with.
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;

        /// <summary>
        /// Password for the first user of the database instance.
        /// </summary>
        [Output("password")]
        public Output<string?> Password { get; private set; } = null!;

        /// <summary>
        /// List of private networks endpoints of the database instance.
        /// </summary>
        [Output("privateNetwork")]
        public Output<Outputs.DatabaseInstancePrivateNetwork?> PrivateNetwork { get; private set; } = null!;

        /// <summary>
        /// `project_id`) The ID of the project the Database Instance is associated with.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// List of read replicas of the database instance.
        /// </summary>
        [Output("readReplicas")]
        public Output<ImmutableArray<Outputs.DatabaseInstanceReadReplica>> ReadReplicas { get; private set; } = null!;

        /// <summary>
        /// `region`) The region in which the Database Instance should be created.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// Map of engine settings to be set. Using this option will override default config.
        /// </summary>
        [Output("settings")]
        public Output<ImmutableDictionary<string, string>> Settings { get; private set; } = null!;

        /// <summary>
        /// The tags associated with the Database Instance.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// Identifier for the first user of the database instance.
        /// </summary>
        [Output("userName")]
        public Output<string?> UserName { get; private set; } = null!;

        /// <summary>
        /// Volume size (in GB) when `volume_type` is set to `bssd`. Must be a multiple of 5000000000.
        /// </summary>
        [Output("volumeSizeInGb")]
        public Output<int> VolumeSizeInGb { get; private set; } = null!;

        /// <summary>
        /// Type of volume where data are stored (`bssd` or `lssd`).
        /// </summary>
        [Output("volumeType")]
        public Output<string?> VolumeType { get; private set; } = null!;


        /// <summary>
        /// Create a DatabaseInstance resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DatabaseInstance(string name, DatabaseInstanceArgs args, CustomResourceOptions? options = null)
            : base("scaleway:index/databaseInstance:DatabaseInstance", name, args ?? new DatabaseInstanceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DatabaseInstance(string name, Input<string> id, DatabaseInstanceState? state = null, CustomResourceOptions? options = null)
            : base("scaleway:index/databaseInstance:DatabaseInstance", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
                AdditionalSecretOutputs =
                {
                    "password",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing DatabaseInstance resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DatabaseInstance Get(string name, Input<string> id, DatabaseInstanceState? state = null, CustomResourceOptions? options = null)
        {
            return new DatabaseInstance(name, id, state, options);
        }
    }

    public sealed class DatabaseInstanceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean to store logical backups in the same region as the database instance.
        /// </summary>
        [Input("backupSameRegion")]
        public Input<bool>? BackupSameRegion { get; set; }

        /// <summary>
        /// Backup schedule frequency in hours.
        /// </summary>
        [Input("backupScheduleFrequency")]
        public Input<int>? BackupScheduleFrequency { get; set; }

        /// <summary>
        /// Backup schedule retention in days.
        /// </summary>
        [Input("backupScheduleRetention")]
        public Input<int>? BackupScheduleRetention { get; set; }

        /// <summary>
        /// Disable automated backup for the database instance.
        /// </summary>
        [Input("disableBackup")]
        public Input<bool>? DisableBackup { get; set; }

        /// <summary>
        /// Database Instance's engine version (e.g. `PostgreSQL-11`).
        /// </summary>
        [Input("engine", required: true)]
        public Input<string> Engine { get; set; } = null!;

        [Input("initSettings")]
        private InputMap<string>? _initSettings;

        /// <summary>
        /// Map of engine settings to be set at database initialisation.
        /// </summary>
        public InputMap<string> InitSettings
        {
            get => _initSettings ?? (_initSettings = new InputMap<string>());
            set => _initSettings = value;
        }

        /// <summary>
        /// Enable or disable high availability for the database instance.
        /// </summary>
        [Input("isHaCluster")]
        public Input<bool>? IsHaCluster { get; set; }

        /// <summary>
        /// The name of the Database Instance.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The type of database instance you want to create (e.g. `db-dev-s`).
        /// </summary>
        [Input("nodeType", required: true)]
        public Input<string> NodeType { get; set; } = null!;

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// Password for the first user of the database instance.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// List of private networks endpoints of the database instance.
        /// </summary>
        [Input("privateNetwork")]
        public Input<Inputs.DatabaseInstancePrivateNetworkArgs>? PrivateNetwork { get; set; }

        /// <summary>
        /// `project_id`) The ID of the project the Database Instance is associated with.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// `region`) The region in which the Database Instance should be created.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("settings")]
        private InputMap<string>? _settings;

        /// <summary>
        /// Map of engine settings to be set. Using this option will override default config.
        /// </summary>
        public InputMap<string> Settings
        {
            get => _settings ?? (_settings = new InputMap<string>());
            set => _settings = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The tags associated with the Database Instance.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Identifier for the first user of the database instance.
        /// </summary>
        [Input("userName")]
        public Input<string>? UserName { get; set; }

        /// <summary>
        /// Volume size (in GB) when `volume_type` is set to `bssd`. Must be a multiple of 5000000000.
        /// </summary>
        [Input("volumeSizeInGb")]
        public Input<int>? VolumeSizeInGb { get; set; }

        /// <summary>
        /// Type of volume where data are stored (`bssd` or `lssd`).
        /// </summary>
        [Input("volumeType")]
        public Input<string>? VolumeType { get; set; }

        public DatabaseInstanceArgs()
        {
        }
        public static new DatabaseInstanceArgs Empty => new DatabaseInstanceArgs();
    }

    public sealed class DatabaseInstanceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Boolean to store logical backups in the same region as the database instance.
        /// </summary>
        [Input("backupSameRegion")]
        public Input<bool>? BackupSameRegion { get; set; }

        /// <summary>
        /// Backup schedule frequency in hours.
        /// </summary>
        [Input("backupScheduleFrequency")]
        public Input<int>? BackupScheduleFrequency { get; set; }

        /// <summary>
        /// Backup schedule retention in days.
        /// </summary>
        [Input("backupScheduleRetention")]
        public Input<int>? BackupScheduleRetention { get; set; }

        /// <summary>
        /// Certificate of the database instance.
        /// </summary>
        [Input("certificate")]
        public Input<string>? Certificate { get; set; }

        /// <summary>
        /// Disable automated backup for the database instance.
        /// </summary>
        [Input("disableBackup")]
        public Input<bool>? DisableBackup { get; set; }

        /// <summary>
        /// (Deprecated) The IP of the Database Instance.
        /// </summary>
        [Input("endpointIp")]
        public Input<string>? EndpointIp { get; set; }

        /// <summary>
        /// (Deprecated) The port of the Database Instance.
        /// </summary>
        [Input("endpointPort")]
        public Input<int>? EndpointPort { get; set; }

        /// <summary>
        /// Database Instance's engine version (e.g. `PostgreSQL-11`).
        /// </summary>
        [Input("engine")]
        public Input<string>? Engine { get; set; }

        [Input("initSettings")]
        private InputMap<string>? _initSettings;

        /// <summary>
        /// Map of engine settings to be set at database initialisation.
        /// </summary>
        public InputMap<string> InitSettings
        {
            get => _initSettings ?? (_initSettings = new InputMap<string>());
            set => _initSettings = value;
        }

        /// <summary>
        /// Enable or disable high availability for the database instance.
        /// </summary>
        [Input("isHaCluster")]
        public Input<bool>? IsHaCluster { get; set; }

        [Input("loadBalancers")]
        private InputList<Inputs.DatabaseInstanceLoadBalancerGetArgs>? _loadBalancers;

        /// <summary>
        /// List of load balancer endpoints of the database instance.
        /// </summary>
        public InputList<Inputs.DatabaseInstanceLoadBalancerGetArgs> LoadBalancers
        {
            get => _loadBalancers ?? (_loadBalancers = new InputList<Inputs.DatabaseInstanceLoadBalancerGetArgs>());
            set => _loadBalancers = value;
        }

        /// <summary>
        /// The name of the Database Instance.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The type of database instance you want to create (e.g. `db-dev-s`).
        /// </summary>
        [Input("nodeType")]
        public Input<string>? NodeType { get; set; }

        /// <summary>
        /// The organization ID the Database Instance is associated with.
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// Password for the first user of the database instance.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// List of private networks endpoints of the database instance.
        /// </summary>
        [Input("privateNetwork")]
        public Input<Inputs.DatabaseInstancePrivateNetworkGetArgs>? PrivateNetwork { get; set; }

        /// <summary>
        /// `project_id`) The ID of the project the Database Instance is associated with.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("readReplicas")]
        private InputList<Inputs.DatabaseInstanceReadReplicaGetArgs>? _readReplicas;

        /// <summary>
        /// List of read replicas of the database instance.
        /// </summary>
        public InputList<Inputs.DatabaseInstanceReadReplicaGetArgs> ReadReplicas
        {
            get => _readReplicas ?? (_readReplicas = new InputList<Inputs.DatabaseInstanceReadReplicaGetArgs>());
            set => _readReplicas = value;
        }

        /// <summary>
        /// `region`) The region in which the Database Instance should be created.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("settings")]
        private InputMap<string>? _settings;

        /// <summary>
        /// Map of engine settings to be set. Using this option will override default config.
        /// </summary>
        public InputMap<string> Settings
        {
            get => _settings ?? (_settings = new InputMap<string>());
            set => _settings = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The tags associated with the Database Instance.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Identifier for the first user of the database instance.
        /// </summary>
        [Input("userName")]
        public Input<string>? UserName { get; set; }

        /// <summary>
        /// Volume size (in GB) when `volume_type` is set to `bssd`. Must be a multiple of 5000000000.
        /// </summary>
        [Input("volumeSizeInGb")]
        public Input<int>? VolumeSizeInGb { get; set; }

        /// <summary>
        /// Type of volume where data are stored (`bssd` or `lssd`).
        /// </summary>
        [Input("volumeType")]
        public Input<string>? VolumeType { get; set; }

        public DatabaseInstanceState()
        {
        }
        public static new DatabaseInstanceState Empty => new DatabaseInstanceState();
    }
}
