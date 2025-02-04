// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scaleway.MnqNamespaceArgs;
import com.pulumi.scaleway.Utilities;
import com.pulumi.scaleway.inputs.MnqNamespaceState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates and manages Scaleway Messaging and queuing Namespace.
 * For further information please check
 * our [documentation](https://pkg.go.dev/github.com/scaleway/scaleway-sdk-go@master/api/mnq/v1alpha1#pkg-index)
 * 
 * &gt; NOTE: This resource refers to the old version of the MNQ API. You should use new resources dedicated to your protocol. SQS, NATS.
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
 * import com.pulumi.scaleway.MnqNamespace;
 * import com.pulumi.scaleway.MnqNamespaceArgs;
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
 *         var main = new MnqNamespace(&#34;main&#34;, MnqNamespaceArgs.builder()        
 *             .protocol(&#34;nats&#34;)
 *             .region(&#34;fr-par&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Namespaces can be imported using the `{region}/{id}`, e.g. bash
 * 
 * ```sh
 *  $ pulumi import scaleway:index/mnqNamespace:MnqNamespace main fr-par/11111111111111111111111111111111
 * ```
 * 
 */
@ResourceType(type="scaleway:index/mnqNamespace:MnqNamespace")
public class MnqNamespace extends com.pulumi.resources.CustomResource {
    /**
     * The date and time the Namespace was created.
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return The date and time the Namespace was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The endpoint of the service matching the Namespace protocol.
     * 
     */
    @Export(name="endpoint", refs={String.class}, tree="[0]")
    private Output<String> endpoint;

    /**
     * @return The endpoint of the service matching the Namespace protocol.
     * 
     */
    public Output<String> endpoint() {
        return this.endpoint;
    }
    /**
     * The unique name of the namespace.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The unique name of the namespace.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * `project_id`) The ID of the project the
     * namespace is associated with.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the
     * namespace is associated with.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * The protocol to apply on your namespace. Please check our
     * supported [protocols](https://pkg.go.dev/github.com/scaleway/scaleway-sdk-go@master/api/mnq/v1alpha1#pkg-constants).
     * 
     */
    @Export(name="protocol", refs={String.class}, tree="[0]")
    private Output<String> protocol;

    /**
     * @return The protocol to apply on your namespace. Please check our
     * supported [protocols](https://pkg.go.dev/github.com/scaleway/scaleway-sdk-go@master/api/mnq/v1alpha1#pkg-constants).
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }
    /**
     * `region`). The region
     * in which the namespace should be created.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return `region`). The region
     * in which the namespace should be created.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The date and time the Namespace was updated.
     * 
     */
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output<String> updatedAt;

    /**
     * @return The date and time the Namespace was updated.
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MnqNamespace(String name) {
        this(name, MnqNamespaceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MnqNamespace(String name, MnqNamespaceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MnqNamespace(String name, MnqNamespaceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/mnqNamespace:MnqNamespace", name, args == null ? MnqNamespaceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MnqNamespace(String name, Output<String> id, @Nullable MnqNamespaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/mnqNamespace:MnqNamespace", name, state, makeResourceOptions(options, id));
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
    public static MnqNamespace get(String name, Output<String> id, @Nullable MnqNamespaceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MnqNamespace(name, id, state, options);
    }
}
