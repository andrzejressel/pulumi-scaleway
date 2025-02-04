// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scaleway.Utilities;
import com.pulumi.scaleway.WebhostingArgs;
import com.pulumi.scaleway.inputs.WebhostingState;
import com.pulumi.scaleway.outputs.WebhostingCpanelUrl;
import com.pulumi.scaleway.outputs.WebhostingOption;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates and manages Scaleway Web Hostings.
 * For more information, see [the documentation](https://www.scaleway.com/en/developers/api/webhosting/).
 * 
 * ## Example
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.scaleway.ScalewayFunctions;
 * import com.pulumi.scaleway.inputs.GetWebHostOfferArgs;
 * import com.pulumi.scaleway.Webhosting;
 * import com.pulumi.scaleway.WebhostingArgs;
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
 *         final var byName = ScalewayFunctions.getWebHostOffer(GetWebHostOfferArgs.builder()
 *             .name(&#34;lite&#34;)
 *             .build());
 * 
 *         var main = new Webhosting(&#34;main&#34;, WebhostingArgs.builder()        
 *             .offerId(byName.applyValue(getWebHostOfferResult -&gt; getWebHostOfferResult.offerId()))
 *             .email(&#34;your@email.com&#34;)
 *             .domain(&#34;yourdomain.com&#34;)
 *             .tags(            
 *                 &#34;webhosting&#34;,
 *                 &#34;provider&#34;,
 *                 &#34;terraform&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Hostings can be imported using the `{region}/{id}`, e.g. bash
 * 
 * ```sh
 *  $ pulumi import scaleway:index/webhosting:Webhosting hosting01 fr-par/11111111-1111-1111-1111-111111111111
 * ```
 * 
 */
@ResourceType(type="scaleway:index/webhosting:Webhosting")
public class Webhosting extends com.pulumi.resources.CustomResource {
    /**
     * The URL to connect to cPanel Dashboard and to Webmail interface.
     * 
     */
    @Export(name="cpanelUrls", refs={List.class,WebhostingCpanelUrl.class}, tree="[0,1]")
    private Output<List<WebhostingCpanelUrl>> cpanelUrls;

    /**
     * @return The URL to connect to cPanel Dashboard and to Webmail interface.
     * 
     */
    public Output<List<WebhostingCpanelUrl>> cpanelUrls() {
        return this.cpanelUrls;
    }
    /**
     * Date and time of hosting&#39;s creation (RFC 3339 format).
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return Date and time of hosting&#39;s creation (RFC 3339 format).
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The DNS status of the hosting.
     * 
     */
    @Export(name="dnsStatus", refs={String.class}, tree="[0]")
    private Output<String> dnsStatus;

    /**
     * @return The DNS status of the hosting.
     * 
     */
    public Output<String> dnsStatus() {
        return this.dnsStatus;
    }
    /**
     * The domain name of the hosting.
     * 
     */
    @Export(name="domain", refs={String.class}, tree="[0]")
    private Output<String> domain;

    /**
     * @return The domain name of the hosting.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }
    /**
     * The contact email of the client for the hosting.
     * 
     */
    @Export(name="email", refs={String.class}, tree="[0]")
    private Output<String> email;

    /**
     * @return The contact email of the client for the hosting.
     * 
     */
    public Output<String> email() {
        return this.email;
    }
    /**
     * The ID of the selected offer for the hosting.
     * 
     */
    @Export(name="offerId", refs={String.class}, tree="[0]")
    private Output<String> offerId;

    /**
     * @return The ID of the selected offer for the hosting.
     * 
     */
    public Output<String> offerId() {
        return this.offerId;
    }
    /**
     * The name of the active offer.
     * 
     */
    @Export(name="offerName", refs={String.class}, tree="[0]")
    private Output<String> offerName;

    /**
     * @return The name of the active offer.
     * 
     */
    public Output<String> offerName() {
        return this.offerName;
    }
    /**
     * The IDs of the selected options for the hosting.
     * 
     */
    @Export(name="optionIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> optionIds;

    /**
     * @return The IDs of the selected options for the hosting.
     * 
     */
    public Output<Optional<List<String>>> optionIds() {
        return Codegen.optional(this.optionIds);
    }
    /**
     * The active options of the hosting.
     * 
     */
    @Export(name="options", refs={List.class,WebhostingOption.class}, tree="[0,1]")
    private Output<List<WebhostingOption>> options;

    /**
     * @return The active options of the hosting.
     * 
     */
    public Output<List<WebhostingOption>> options() {
        return this.options;
    }
    /**
     * The organization ID the hosting is associated with.
     * 
     */
    @Export(name="organizationId", refs={String.class}, tree="[0]")
    private Output<String> organizationId;

    /**
     * @return The organization ID the hosting is associated with.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }
    /**
     * The hostname of the host platform.
     * 
     */
    @Export(name="platformHostname", refs={String.class}, tree="[0]")
    private Output<String> platformHostname;

    /**
     * @return The hostname of the host platform.
     * 
     */
    public Output<String> platformHostname() {
        return this.platformHostname;
    }
    /**
     * The number of the host platform.
     * 
     */
    @Export(name="platformNumber", refs={Integer.class}, tree="[0]")
    private Output<Integer> platformNumber;

    /**
     * @return The number of the host platform.
     * 
     */
    public Output<Integer> platformNumber() {
        return this.platformNumber;
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
     * `region`) The region of the Hosting.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return `region`) The region of the Hosting.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The hosting status.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The hosting status.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The tags associated with the hosting.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> tags;

    /**
     * @return The tags associated with the hosting.
     * 
     */
    public Output<List<String>> tags() {
        return this.tags;
    }
    /**
     * Date and time of hosting&#39;s last update (RFC 3339 format).
     * 
     */
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output<String> updatedAt;

    /**
     * @return Date and time of hosting&#39;s last update (RFC 3339 format).
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }
    /**
     * The main hosting cPanel username.
     * 
     */
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output<String> username;

    /**
     * @return The main hosting cPanel username.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Webhosting(String name) {
        this(name, WebhostingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Webhosting(String name, WebhostingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Webhosting(String name, WebhostingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/webhosting:Webhosting", name, args == null ? WebhostingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Webhosting(String name, Output<String> id, @Nullable WebhostingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/webhosting:Webhosting", name, state, makeResourceOptions(options, id));
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
    public static Webhosting get(String name, Output<String> id, @Nullable WebhostingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Webhosting(name, id, state, options);
    }
}
