// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scaleway.Utilities;
import com.pulumi.scaleway.VpcArgs;
import com.pulumi.scaleway.inputs.VpcState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates and manages Scaleway Virtual Private Clouds.
 * For more information, see [the documentation](https://www.scaleway.com/en/docs/network/vpc/concepts/).
 * 
 * ## Example
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.scaleway.Vpc;
 * import com.pulumi.scaleway.VpcArgs;
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
 *         var vpc01 = new Vpc(&#34;vpc01&#34;, VpcArgs.builder()        
 *             .tags(            
 *                 &#34;demo&#34;,
 *                 &#34;terraform&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * VPCs can be imported using the `{region}/{id}`, e.g. bash
 * 
 * ```sh
 *  $ pulumi import scaleway:index/vpc:Vpc vpc_demo fr-par/11111111-1111-1111-1111-111111111111
 * ```
 * 
 */
@ResourceType(type="scaleway:index/vpc:Vpc")
public class Vpc extends com.pulumi.resources.CustomResource {
    /**
     * Date and time of VPC&#39;s creation (RFC 3339 format).
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return Date and time of VPC&#39;s creation (RFC 3339 format).
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * Defines whether the VPC is the default one for its Project.
     * 
     */
    @Export(name="isDefault", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isDefault;

    /**
     * @return Defines whether the VPC is the default one for its Project.
     * 
     */
    public Output<Boolean> isDefault() {
        return this.isDefault;
    }
    /**
     * The name of the VPC. If not provided it will be randomly generated.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the VPC. If not provided it will be randomly generated.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The organization ID the VPC is associated with.
     * 
     */
    @Export(name="organizationId", refs={String.class}, tree="[0]")
    private Output<String> organizationId;

    /**
     * @return The organization ID the VPC is associated with.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }
    /**
     * `project_id`) The ID of the project the VPC is associated with.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the VPC is associated with.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * `region`) The region of the VPC.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return `region`) The region of the VPC.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The tags associated with the VPC.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return The tags associated with the VPC.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Date and time of VPC&#39;s last update (RFC 3339 format).
     * 
     */
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output<String> updatedAt;

    /**
     * @return Date and time of VPC&#39;s last update (RFC 3339 format).
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Vpc(String name) {
        this(name, VpcArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Vpc(String name, @Nullable VpcArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Vpc(String name, @Nullable VpcArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/vpc:Vpc", name, args == null ? VpcArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Vpc(String name, Output<String> id, @Nullable VpcState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/vpc:Vpc", name, state, makeResourceOptions(options, id));
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
    public static Vpc get(String name, Output<String> id, @Nullable VpcState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Vpc(name, id, state, options);
    }
}
