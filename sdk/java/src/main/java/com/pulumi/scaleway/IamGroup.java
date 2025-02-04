// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scaleway.IamGroupArgs;
import com.pulumi.scaleway.Utilities;
import com.pulumi.scaleway.inputs.IamGroupState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates and manages Scaleway IAM Groups.
 * For more information, see [the documentation](https://developers.scaleway.com/en/products/iam/api/v1alpha1/#groups-f592eb).
 * 
 * ## Examples
 * 
 * ### Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.scaleway.IamGroup;
 * import com.pulumi.scaleway.IamGroupArgs;
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
 *         var basic = new IamGroup(&#34;basic&#34;, IamGroupArgs.builder()        
 *             .applicationIds()
 *             .description(&#34;basic description&#34;)
 *             .userIds()
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ### With applications
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.scaleway.IamApplication;
 * import com.pulumi.scaleway.IamGroup;
 * import com.pulumi.scaleway.IamGroupArgs;
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
 *         var app = new IamApplication(&#34;app&#34;);
 * 
 *         var withApp = new IamGroup(&#34;withApp&#34;, IamGroupArgs.builder()        
 *             .applicationIds(app.id())
 *             .userIds()
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * IAM groups can be imported using the `{id}`, e.g. bash
 * 
 * ```sh
 *  $ pulumi import scaleway:index/iamGroup:IamGroup basic 11111111-1111-1111-1111-111111111111
 * ```
 * 
 */
@ResourceType(type="scaleway:index/iamGroup:IamGroup")
public class IamGroup extends com.pulumi.resources.CustomResource {
    /**
     * The list of IDs of the applications attached to the group.
     * 
     */
    @Export(name="applicationIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> applicationIds;

    /**
     * @return The list of IDs of the applications attached to the group.
     * 
     */
    public Output<Optional<List<String>>> applicationIds() {
        return Codegen.optional(this.applicationIds);
    }
    /**
     * The date and time of the creation of the group
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return The date and time of the creation of the group
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The description of the IAM group.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the IAM group.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Manage membership externally. This make the resource ignore user_ids and application_ids. Should be used when using iam_group_membership
     * 
     */
    @Export(name="externalMembership", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> externalMembership;

    /**
     * @return Manage membership externally. This make the resource ignore user_ids and application_ids. Should be used when using iam_group_membership
     * 
     */
    public Output<Optional<Boolean>> externalMembership() {
        return Codegen.optional(this.externalMembership);
    }
    /**
     * The name of the IAM group.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the IAM group.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * `organization_id`) The ID of the organization the group is associated with.
     * 
     */
    @Export(name="organizationId", refs={String.class}, tree="[0]")
    private Output<String> organizationId;

    /**
     * @return `organization_id`) The ID of the organization the group is associated with.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }
    /**
     * The date and time of the last update of the group
     * 
     */
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output<String> updatedAt;

    /**
     * @return The date and time of the last update of the group
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }
    /**
     * The list of IDs of the users attached to the group.
     * 
     */
    @Export(name="userIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> userIds;

    /**
     * @return The list of IDs of the users attached to the group.
     * 
     */
    public Output<Optional<List<String>>> userIds() {
        return Codegen.optional(this.userIds);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IamGroup(String name) {
        this(name, IamGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IamGroup(String name, @Nullable IamGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IamGroup(String name, @Nullable IamGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/iamGroup:IamGroup", name, args == null ? IamGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IamGroup(String name, Output<String> id, @Nullable IamGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/iamGroup:IamGroup", name, state, makeResourceOptions(options, id));
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
    public static IamGroup get(String name, Output<String> id, @Nullable IamGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IamGroup(name, id, state, options);
    }
}
