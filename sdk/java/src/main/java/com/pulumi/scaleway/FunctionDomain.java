// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scaleway.FunctionDomainArgs;
import com.pulumi.scaleway.Utilities;
import com.pulumi.scaleway.inputs.FunctionDomainState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates and manages Scaleway Function Domain bindings.
 * For more information see [the documentation](https://developers.scaleway.com/en/products/functions/api/).
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
 * import com.pulumi.scaleway.FunctionNamespace;
 * import com.pulumi.scaleway.Function;
 * import com.pulumi.scaleway.FunctionArgs;
 * import com.pulumi.scaleway.FunctionDomain;
 * import com.pulumi.scaleway.FunctionDomainArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var mainFunctionNamespace = new FunctionNamespace(&#34;mainFunctionNamespace&#34;);
 * 
 *         var mainFunction = new Function(&#34;mainFunction&#34;, FunctionArgs.builder()        
 *             .namespaceId(mainFunctionNamespace.id())
 *             .runtime(&#34;go118&#34;)
 *             .privacy(&#34;private&#34;)
 *             .handler(&#34;Handle&#34;)
 *             .zipFile(&#34;testfixture/gofunction.zip&#34;)
 *             .deploy(true)
 *             .build());
 * 
 *         var mainFunctionDomain = new FunctionDomain(&#34;mainFunctionDomain&#34;, FunctionDomainArgs.builder()        
 *             .functionId(mainFunction.id())
 *             .hostname(&#34;example.com&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(mainFunction)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Domain can be imported using the `{region}/{id}`, e.g. bash
 * 
 * ```sh
 *  $ pulumi import scaleway:index/functionDomain:FunctionDomain main fr-par/11111111-1111-1111-1111-111111111111
 * ```
 * 
 */
@ResourceType(type="scaleway:index/functionDomain:FunctionDomain")
public class FunctionDomain extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the function you want to create a domain with.
     * 
     */
    @Export(name="functionId", refs={String.class}, tree="[0]")
    private Output<String> functionId;

    /**
     * @return The ID of the function you want to create a domain with.
     * 
     */
    public Output<String> functionId() {
        return this.functionId;
    }
    /**
     * The hostname that should resolve to your function id native domain.
     * You should use a CNAME domain record that point to your native function `domain_name` for it.
     * 
     * &gt; **Important** Updates to `function_id` or `hostname` will recreate the domain.
     * 
     */
    @Export(name="hostname", refs={String.class}, tree="[0]")
    private Output<String> hostname;

    /**
     * @return The hostname that should resolve to your function id native domain.
     * You should use a CNAME domain record that point to your native function `domain_name` for it.
     * 
     * &gt; **Important** Updates to `function_id` or `hostname` will recreate the domain.
     * 
     */
    public Output<String> hostname() {
        return this.hostname;
    }
    /**
     * (Defaults to provider `region`) The region in where the domain was created.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return (Defaults to provider `region`) The region in where the domain was created.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The URL that triggers the function
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    /**
     * @return The URL that triggers the function
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FunctionDomain(String name) {
        this(name, FunctionDomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FunctionDomain(String name, FunctionDomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FunctionDomain(String name, FunctionDomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/functionDomain:FunctionDomain", name, args == null ? FunctionDomainArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FunctionDomain(String name, Output<String> id, @Nullable FunctionDomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/functionDomain:FunctionDomain", name, state, makeResourceOptions(options, id));
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
    public static FunctionDomain get(String name, Output<String> id, @Nullable FunctionDomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FunctionDomain(name, id, state, options);
    }
}
