// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scaleway.inputs.RedisClusterAclArgs;
import com.pulumi.scaleway.inputs.RedisClusterPrivateNetworkArgs;
import com.pulumi.scaleway.inputs.RedisClusterPublicNetworkArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RedisClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final RedisClusterArgs Empty = new RedisClusterArgs();

    /**
     * List of acl rules, this is cluster&#39;s authorized IPs. More details on the ACL section.
     * 
     */
    @Import(name="acls")
    private @Nullable Output<List<RedisClusterAclArgs>> acls;

    /**
     * @return List of acl rules, this is cluster&#39;s authorized IPs. More details on the ACL section.
     * 
     */
    public Optional<Output<List<RedisClusterAclArgs>>> acls() {
        return Optional.ofNullable(this.acls);
    }

    /**
     * The number of nodes in the Redis Cluster.
     * 
     * &gt; **Important:** You cannot set `cluster_size` to 2, you either have to choose Standalone mode (1 node) or Cluster mode
     * which is minimum 3 (1 main node + 2 secondary nodes)
     * 
     * &gt; **Important:** You can set a bigger `cluster_size` than you initially did, it will migrate the Redis Cluster, but
     * keep in mind that you cannot downgrade a Redis Cluster so setting a smaller `cluster_size` will not have any effect.
     * 
     */
    @Import(name="clusterSize")
    private @Nullable Output<Integer> clusterSize;

    /**
     * @return The number of nodes in the Redis Cluster.
     * 
     * &gt; **Important:** You cannot set `cluster_size` to 2, you either have to choose Standalone mode (1 node) or Cluster mode
     * which is minimum 3 (1 main node + 2 secondary nodes)
     * 
     * &gt; **Important:** You can set a bigger `cluster_size` than you initially did, it will migrate the Redis Cluster, but
     * keep in mind that you cannot downgrade a Redis Cluster so setting a smaller `cluster_size` will not have any effect.
     * 
     */
    public Optional<Output<Integer>> clusterSize() {
        return Optional.ofNullable(this.clusterSize);
    }

    /**
     * The name of the Redis Cluster.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Redis Cluster.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The type of Redis Cluster you want to create (e.g. `RED1-M`).
     * 
     * &gt; **Important:** Updates to `node_type` will migrate the Redis Cluster to the desired `node_type`. Keep in mind that
     * you cannot downgrade a Redis Cluster.
     * 
     */
    @Import(name="nodeType", required=true)
    private Output<String> nodeType;

    /**
     * @return The type of Redis Cluster you want to create (e.g. `RED1-M`).
     * 
     * &gt; **Important:** Updates to `node_type` will migrate the Redis Cluster to the desired `node_type`. Keep in mind that
     * you cannot downgrade a Redis Cluster.
     * 
     */
    public Output<String> nodeType() {
        return this.nodeType;
    }

    /**
     * Password for the first user of the Redis Cluster.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    /**
     * @return Password for the first user of the Redis Cluster.
     * 
     */
    public Output<String> password() {
        return this.password;
    }

    /**
     * Describes the private network you want to connect to your cluster. If not set, a public
     * network will be provided. More details on the Private Network section
     * 
     * &gt; **Important:** The way to use private networks differs whether you are using redis in standalone or cluster mode.
     * 
     * - Standalone mode (`cluster_size` = 1) : you can attach as many private networks as you want (each must be a separate
     * block). If you detach your only private network, your cluster won&#39;t be reachable until you define a new private or
     * public network. You can modify your private_network and its specs, you can have both a private and public network side
     * by side.
     * 
     * - Cluster mode (`cluster_size` &gt; 1) : you can define a single private network as you create your cluster, you won&#39;t be
     * able to edit or detach it afterward, unless you create another cluster. Your `service_ips` must be listed as follows:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * 
     */
    @Import(name="privateNetworks")
    private @Nullable Output<List<RedisClusterPrivateNetworkArgs>> privateNetworks;

    /**
     * @return Describes the private network you want to connect to your cluster. If not set, a public
     * network will be provided. More details on the Private Network section
     * 
     * &gt; **Important:** The way to use private networks differs whether you are using redis in standalone or cluster mode.
     * 
     * - Standalone mode (`cluster_size` = 1) : you can attach as many private networks as you want (each must be a separate
     * block). If you detach your only private network, your cluster won&#39;t be reachable until you define a new private or
     * public network. You can modify your private_network and its specs, you can have both a private and public network side
     * by side.
     * 
     * - Cluster mode (`cluster_size` &gt; 1) : you can define a single private network as you create your cluster, you won&#39;t be
     * able to edit or detach it afterward, unless you create another cluster. Your `service_ips` must be listed as follows:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * 
     */
    public Optional<Output<List<RedisClusterPrivateNetworkArgs>>> privateNetworks() {
        return Optional.ofNullable(this.privateNetworks);
    }

    /**
     * `project_id`) The ID of the project the Redis Cluster is
     * associated with.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the Redis Cluster is
     * associated with.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * (Optional) Public network details. Only one of `private_network` and `public_network` may be set.
     * &gt; The `public_network` block exports:
     * 
     */
    @Import(name="publicNetwork")
    private @Nullable Output<RedisClusterPublicNetworkArgs> publicNetwork;

    /**
     * @return (Optional) Public network details. Only one of `private_network` and `public_network` may be set.
     * &gt; The `public_network` block exports:
     * 
     */
    public Optional<Output<RedisClusterPublicNetworkArgs>> publicNetwork() {
        return Optional.ofNullable(this.publicNetwork);
    }

    /**
     * Map of settings for redis cluster. Available settings can be found by listing redis versions
     * with scaleway API or CLI
     * 
     */
    @Import(name="settings")
    private @Nullable Output<Map<String,String>> settings;

    /**
     * @return Map of settings for redis cluster. Available settings can be found by listing redis versions
     * with scaleway API or CLI
     * 
     */
    public Optional<Output<Map<String,String>>> settings() {
        return Optional.ofNullable(this.settings);
    }

    /**
     * The tags associated with the Redis Cluster.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return The tags associated with the Redis Cluster.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Whether TLS is enabled or not.
     * 
     * &gt; The changes on `tls_enabled` will force the resource creation.
     * 
     */
    @Import(name="tlsEnabled")
    private @Nullable Output<Boolean> tlsEnabled;

    /**
     * @return Whether TLS is enabled or not.
     * 
     * &gt; The changes on `tls_enabled` will force the resource creation.
     * 
     */
    public Optional<Output<Boolean>> tlsEnabled() {
        return Optional.ofNullable(this.tlsEnabled);
    }

    /**
     * Identifier for the first user of the Redis Cluster.
     * 
     */
    @Import(name="userName", required=true)
    private Output<String> userName;

    /**
     * @return Identifier for the first user of the Redis Cluster.
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }

    /**
     * Redis&#39;s Cluster version (e.g. `6.2.6`).
     * 
     * &gt; **Important:** Updates to `version` will migrate the Redis Cluster to the desired `version`. Keep in mind that you
     * cannot downgrade a Redis Cluster.
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    /**
     * @return Redis&#39;s Cluster version (e.g. `6.2.6`).
     * 
     * &gt; **Important:** Updates to `version` will migrate the Redis Cluster to the desired `version`. Keep in mind that you
     * cannot downgrade a Redis Cluster.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     * `zone`) The zone in which the
     * Redis Cluster should be created.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return `zone`) The zone in which the
     * Redis Cluster should be created.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private RedisClusterArgs() {}

    private RedisClusterArgs(RedisClusterArgs $) {
        this.acls = $.acls;
        this.clusterSize = $.clusterSize;
        this.name = $.name;
        this.nodeType = $.nodeType;
        this.password = $.password;
        this.privateNetworks = $.privateNetworks;
        this.projectId = $.projectId;
        this.publicNetwork = $.publicNetwork;
        this.settings = $.settings;
        this.tags = $.tags;
        this.tlsEnabled = $.tlsEnabled;
        this.userName = $.userName;
        this.version = $.version;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RedisClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RedisClusterArgs $;

        public Builder() {
            $ = new RedisClusterArgs();
        }

        public Builder(RedisClusterArgs defaults) {
            $ = new RedisClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acls List of acl rules, this is cluster&#39;s authorized IPs. More details on the ACL section.
         * 
         * @return builder
         * 
         */
        public Builder acls(@Nullable Output<List<RedisClusterAclArgs>> acls) {
            $.acls = acls;
            return this;
        }

        /**
         * @param acls List of acl rules, this is cluster&#39;s authorized IPs. More details on the ACL section.
         * 
         * @return builder
         * 
         */
        public Builder acls(List<RedisClusterAclArgs> acls) {
            return acls(Output.of(acls));
        }

        /**
         * @param acls List of acl rules, this is cluster&#39;s authorized IPs. More details on the ACL section.
         * 
         * @return builder
         * 
         */
        public Builder acls(RedisClusterAclArgs... acls) {
            return acls(List.of(acls));
        }

        /**
         * @param clusterSize The number of nodes in the Redis Cluster.
         * 
         * &gt; **Important:** You cannot set `cluster_size` to 2, you either have to choose Standalone mode (1 node) or Cluster mode
         * which is minimum 3 (1 main node + 2 secondary nodes)
         * 
         * &gt; **Important:** You can set a bigger `cluster_size` than you initially did, it will migrate the Redis Cluster, but
         * keep in mind that you cannot downgrade a Redis Cluster so setting a smaller `cluster_size` will not have any effect.
         * 
         * @return builder
         * 
         */
        public Builder clusterSize(@Nullable Output<Integer> clusterSize) {
            $.clusterSize = clusterSize;
            return this;
        }

        /**
         * @param clusterSize The number of nodes in the Redis Cluster.
         * 
         * &gt; **Important:** You cannot set `cluster_size` to 2, you either have to choose Standalone mode (1 node) or Cluster mode
         * which is minimum 3 (1 main node + 2 secondary nodes)
         * 
         * &gt; **Important:** You can set a bigger `cluster_size` than you initially did, it will migrate the Redis Cluster, but
         * keep in mind that you cannot downgrade a Redis Cluster so setting a smaller `cluster_size` will not have any effect.
         * 
         * @return builder
         * 
         */
        public Builder clusterSize(Integer clusterSize) {
            return clusterSize(Output.of(clusterSize));
        }

        /**
         * @param name The name of the Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodeType The type of Redis Cluster you want to create (e.g. `RED1-M`).
         * 
         * &gt; **Important:** Updates to `node_type` will migrate the Redis Cluster to the desired `node_type`. Keep in mind that
         * you cannot downgrade a Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder nodeType(Output<String> nodeType) {
            $.nodeType = nodeType;
            return this;
        }

        /**
         * @param nodeType The type of Redis Cluster you want to create (e.g. `RED1-M`).
         * 
         * &gt; **Important:** Updates to `node_type` will migrate the Redis Cluster to the desired `node_type`. Keep in mind that
         * you cannot downgrade a Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder nodeType(String nodeType) {
            return nodeType(Output.of(nodeType));
        }

        /**
         * @param password Password for the first user of the Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password for the first user of the Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param privateNetworks Describes the private network you want to connect to your cluster. If not set, a public
         * network will be provided. More details on the Private Network section
         * 
         * &gt; **Important:** The way to use private networks differs whether you are using redis in standalone or cluster mode.
         * 
         * - Standalone mode (`cluster_size` = 1) : you can attach as many private networks as you want (each must be a separate
         * block). If you detach your only private network, your cluster won&#39;t be reachable until you define a new private or
         * public network. You can modify your private_network and its specs, you can have both a private and public network side
         * by side.
         * 
         * - Cluster mode (`cluster_size` &gt; 1) : you can define a single private network as you create your cluster, you won&#39;t be
         * able to edit or detach it afterward, unless you create another cluster. Your `service_ips` must be listed as follows:
         * ```java
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import java.util.List;
         * import java.util.ArrayList;
         * import java.util.Map;
         * import java.io.File;
         * import java.nio.file.Files;
         * import java.nio.file.Paths;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *     }
         * }
         * ```
         * 
         * @return builder
         * 
         */
        public Builder privateNetworks(@Nullable Output<List<RedisClusterPrivateNetworkArgs>> privateNetworks) {
            $.privateNetworks = privateNetworks;
            return this;
        }

        /**
         * @param privateNetworks Describes the private network you want to connect to your cluster. If not set, a public
         * network will be provided. More details on the Private Network section
         * 
         * &gt; **Important:** The way to use private networks differs whether you are using redis in standalone or cluster mode.
         * 
         * - Standalone mode (`cluster_size` = 1) : you can attach as many private networks as you want (each must be a separate
         * block). If you detach your only private network, your cluster won&#39;t be reachable until you define a new private or
         * public network. You can modify your private_network and its specs, you can have both a private and public network side
         * by side.
         * 
         * - Cluster mode (`cluster_size` &gt; 1) : you can define a single private network as you create your cluster, you won&#39;t be
         * able to edit or detach it afterward, unless you create another cluster. Your `service_ips` must be listed as follows:
         * ```java
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import java.util.List;
         * import java.util.ArrayList;
         * import java.util.Map;
         * import java.io.File;
         * import java.nio.file.Files;
         * import java.nio.file.Paths;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *     }
         * }
         * ```
         * 
         * @return builder
         * 
         */
        public Builder privateNetworks(List<RedisClusterPrivateNetworkArgs> privateNetworks) {
            return privateNetworks(Output.of(privateNetworks));
        }

        /**
         * @param privateNetworks Describes the private network you want to connect to your cluster. If not set, a public
         * network will be provided. More details on the Private Network section
         * 
         * &gt; **Important:** The way to use private networks differs whether you are using redis in standalone or cluster mode.
         * 
         * - Standalone mode (`cluster_size` = 1) : you can attach as many private networks as you want (each must be a separate
         * block). If you detach your only private network, your cluster won&#39;t be reachable until you define a new private or
         * public network. You can modify your private_network and its specs, you can have both a private and public network side
         * by side.
         * 
         * - Cluster mode (`cluster_size` &gt; 1) : you can define a single private network as you create your cluster, you won&#39;t be
         * able to edit or detach it afterward, unless you create another cluster. Your `service_ips` must be listed as follows:
         * ```java
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import java.util.List;
         * import java.util.ArrayList;
         * import java.util.Map;
         * import java.io.File;
         * import java.nio.file.Files;
         * import java.nio.file.Paths;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *     }
         * }
         * ```
         * 
         * @return builder
         * 
         */
        public Builder privateNetworks(RedisClusterPrivateNetworkArgs... privateNetworks) {
            return privateNetworks(List.of(privateNetworks));
        }

        /**
         * @param projectId `project_id`) The ID of the project the Redis Cluster is
         * associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId `project_id`) The ID of the project the Redis Cluster is
         * associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param publicNetwork (Optional) Public network details. Only one of `private_network` and `public_network` may be set.
         * &gt; The `public_network` block exports:
         * 
         * @return builder
         * 
         */
        public Builder publicNetwork(@Nullable Output<RedisClusterPublicNetworkArgs> publicNetwork) {
            $.publicNetwork = publicNetwork;
            return this;
        }

        /**
         * @param publicNetwork (Optional) Public network details. Only one of `private_network` and `public_network` may be set.
         * &gt; The `public_network` block exports:
         * 
         * @return builder
         * 
         */
        public Builder publicNetwork(RedisClusterPublicNetworkArgs publicNetwork) {
            return publicNetwork(Output.of(publicNetwork));
        }

        /**
         * @param settings Map of settings for redis cluster. Available settings can be found by listing redis versions
         * with scaleway API or CLI
         * 
         * @return builder
         * 
         */
        public Builder settings(@Nullable Output<Map<String,String>> settings) {
            $.settings = settings;
            return this;
        }

        /**
         * @param settings Map of settings for redis cluster. Available settings can be found by listing redis versions
         * with scaleway API or CLI
         * 
         * @return builder
         * 
         */
        public Builder settings(Map<String,String> settings) {
            return settings(Output.of(settings));
        }

        /**
         * @param tags The tags associated with the Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags associated with the Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The tags associated with the Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param tlsEnabled Whether TLS is enabled or not.
         * 
         * &gt; The changes on `tls_enabled` will force the resource creation.
         * 
         * @return builder
         * 
         */
        public Builder tlsEnabled(@Nullable Output<Boolean> tlsEnabled) {
            $.tlsEnabled = tlsEnabled;
            return this;
        }

        /**
         * @param tlsEnabled Whether TLS is enabled or not.
         * 
         * &gt; The changes on `tls_enabled` will force the resource creation.
         * 
         * @return builder
         * 
         */
        public Builder tlsEnabled(Boolean tlsEnabled) {
            return tlsEnabled(Output.of(tlsEnabled));
        }

        /**
         * @param userName Identifier for the first user of the Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder userName(Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName Identifier for the first user of the Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        /**
         * @param version Redis&#39;s Cluster version (e.g. `6.2.6`).
         * 
         * &gt; **Important:** Updates to `version` will migrate the Redis Cluster to the desired `version`. Keep in mind that you
         * cannot downgrade a Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder version(Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version Redis&#39;s Cluster version (e.g. `6.2.6`).
         * 
         * &gt; **Important:** Updates to `version` will migrate the Redis Cluster to the desired `version`. Keep in mind that you
         * cannot downgrade a Redis Cluster.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        /**
         * @param zone `zone`) The zone in which the
         * Redis Cluster should be created.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone `zone`) The zone in which the
         * Redis Cluster should be created.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public RedisClusterArgs build() {
            $.nodeType = Objects.requireNonNull($.nodeType, "expected parameter 'nodeType' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.userName = Objects.requireNonNull($.userName, "expected parameter 'userName' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
