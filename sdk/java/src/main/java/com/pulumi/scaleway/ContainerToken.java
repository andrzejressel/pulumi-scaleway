// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scaleway.ContainerTokenArgs;
import com.pulumi.scaleway.Utilities;
import com.pulumi.scaleway.inputs.ContainerTokenState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates and manages Scaleway Container Token.
 * For more information see [the documentation](https://developers.scaleway.com/en/products/containers/api/#tokens-26b085).
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
 * import com.pulumi.scaleway.ContainerNamespace;
 * import com.pulumi.scaleway.Container;
 * import com.pulumi.scaleway.ContainerArgs;
 * import com.pulumi.scaleway.ContainerToken;
 * import com.pulumi.scaleway.ContainerTokenArgs;
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
 *         var mainContainerNamespace = new ContainerNamespace(&#34;mainContainerNamespace&#34;);
 * 
 *         var mainContainer = new Container(&#34;mainContainer&#34;, ContainerArgs.builder()        
 *             .namespaceId(mainContainerNamespace.id())
 *             .build());
 * 
 *         var namespace = new ContainerToken(&#34;namespace&#34;, ContainerTokenArgs.builder()        
 *             .namespaceId(mainContainerNamespace.id())
 *             .expiresAt(&#34;2022-10-18T11:35:15+02:00&#34;)
 *             .build());
 * 
 *         var container = new ContainerToken(&#34;container&#34;, ContainerTokenArgs.builder()        
 *             .containerId(mainContainer.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Tokens can be imported using the `{region}/{id}`, e.g. bash
 * 
 * ```sh
 *  $ pulumi import scaleway:index/containerToken:ContainerToken main fr-par/11111111-1111-1111-1111-111111111111
 * ```
 * 
 */
@ResourceType(type="scaleway:index/containerToken:ContainerToken")
public class ContainerToken extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the container.
     * 
     * &gt; Only one of `namespace_id` or `container_id` must be set.
     * 
     */
    @Export(name="containerId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> containerId;

    /**
     * @return The ID of the container.
     * 
     * &gt; Only one of `namespace_id` or `container_id` must be set.
     * 
     */
    public Output<Optional<String>> containerId() {
        return Codegen.optional(this.containerId);
    }
    /**
     * The description of the token.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the token.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The expiration date of the token.
     * 
     */
    @Export(name="expiresAt", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> expiresAt;

    /**
     * @return The expiration date of the token.
     * 
     */
    public Output<Optional<String>> expiresAt() {
        return Codegen.optional(this.expiresAt);
    }
    /**
     * The ID of the container namespace.
     * 
     */
    @Export(name="namespaceId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> namespaceId;

    /**
     * @return The ID of the container namespace.
     * 
     */
    public Output<Optional<String>> namespaceId() {
        return Codegen.optional(this.namespaceId);
    }
    /**
     * `region`). The region in which the namespace should be created.
     * 
     * &gt; **Important** Updates to any fields will recreate the token.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return `region`). The region in which the namespace should be created.
     * 
     * &gt; **Important** Updates to any fields will recreate the token.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The token.
     * 
     */
    @Export(name="token", refs={String.class}, tree="[0]")
    private Output<String> token;

    /**
     * @return The token.
     * 
     */
    public Output<String> token() {
        return this.token;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ContainerToken(String name) {
        this(name, ContainerTokenArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ContainerToken(String name, @Nullable ContainerTokenArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContainerToken(String name, @Nullable ContainerTokenArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/containerToken:ContainerToken", name, args == null ? ContainerTokenArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ContainerToken(String name, Output<String> id, @Nullable ContainerTokenState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/containerToken:ContainerToken", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "token"
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
    public static ContainerToken get(String name, Output<String> id, @Nullable ContainerTokenState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ContainerToken(name, id, state, options);
    }
}
