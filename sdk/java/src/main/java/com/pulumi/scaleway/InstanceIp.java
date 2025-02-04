// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scaleway.InstanceIpArgs;
import com.pulumi.scaleway.Utilities;
import com.pulumi.scaleway.inputs.InstanceIpState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates and manages Scaleway Compute Instance IPs. For more information, see [the documentation](https://developers.scaleway.com/en/products/instance/api/#ips-268151).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.scaleway.InstanceIp;
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
 *         var serverIp = new InstanceIp(&#34;serverIp&#34;);
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * IPs can be imported using the `{zone}/{id}`, e.g. bash
 * 
 * ```sh
 *  $ pulumi import scaleway:index/instanceIp:InstanceIp server_ip fr-par-1/11111111-1111-1111-1111-111111111111
 * ```
 * 
 */
@ResourceType(type="scaleway:index/instanceIp:InstanceIp")
public class InstanceIp extends com.pulumi.resources.CustomResource {
    /**
     * The IP address.
     * 
     */
    @Export(name="address", refs={String.class}, tree="[0]")
    private Output<String> address;

    /**
     * @return The IP address.
     * 
     */
    public Output<String> address() {
        return this.address;
    }
    /**
     * The organization ID the IP is associated with.
     * 
     */
    @Export(name="organizationId", refs={String.class}, tree="[0]")
    private Output<String> organizationId;

    /**
     * @return The organization ID the IP is associated with.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }
    /**
     * The IP Prefix.
     * 
     */
    @Export(name="prefix", refs={String.class}, tree="[0]")
    private Output<String> prefix;

    /**
     * @return The IP Prefix.
     * 
     */
    public Output<String> prefix() {
        return this.prefix;
    }
    /**
     * `project_id`) The ID of the project the IP is associated with.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the IP is associated with.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * The reverse dns attached to this IP
     * 
     */
    @Export(name="reverse", refs={String.class}, tree="[0]")
    private Output<String> reverse;

    /**
     * @return The reverse dns attached to this IP
     * 
     */
    public Output<String> reverse() {
        return this.reverse;
    }
    /**
     * The server associated with this IP
     * 
     */
    @Export(name="serverId", refs={String.class}, tree="[0]")
    private Output<String> serverId;

    /**
     * @return The server associated with this IP
     * 
     */
    public Output<String> serverId() {
        return this.serverId;
    }
    /**
     * The tags associated with the IP.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return The tags associated with the IP.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The type of the IP (`nat`, `routed_ipv4`, `routed_ipv6`), more information in [the documentation](https://www.scaleway.com/en/docs/compute/instances/api-cli/using-routed-ips/)
     * 
     * &gt; **Important:** An IP can migrate from `nat` to `routed_ipv4` but cannot be converted back
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of the IP (`nat`, `routed_ipv4`, `routed_ipv6`), more information in [the documentation](https://www.scaleway.com/en/docs/compute/instances/api-cli/using-routed-ips/)
     * 
     * &gt; **Important:** An IP can migrate from `nat` to `routed_ipv4` but cannot be converted back
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * `zone`) The zone in which the IP should be reserved.
     * 
     */
    @Export(name="zone", refs={String.class}, tree="[0]")
    private Output<String> zone;

    /**
     * @return `zone`) The zone in which the IP should be reserved.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceIp(String name) {
        this(name, InstanceIpArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceIp(String name, @Nullable InstanceIpArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceIp(String name, @Nullable InstanceIpArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/instanceIp:InstanceIp", name, args == null ? InstanceIpArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InstanceIp(String name, Output<String> id, @Nullable InstanceIpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/instanceIp:InstanceIp", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static InstanceIp get(String name, Output<String> id, @Nullable InstanceIpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InstanceIp(name, id, state, options);
    }
}
