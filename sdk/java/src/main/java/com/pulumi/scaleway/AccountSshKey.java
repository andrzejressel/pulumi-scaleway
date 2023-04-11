// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scaleway.AccountSshKeyArgs;
import com.pulumi.scaleway.Utilities;
import com.pulumi.scaleway.inputs.AccountSshKeyState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages user SSH keys to access servers provisioned on Scaleway.
 * 
 * &gt; **Important:**  The resource `scaleway.AccountSshKey` has been deprecated and will no longer be supported. Instead, use `scaleway.IamSshKey`.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.scaleway.AccountSshKey;
 * import com.pulumi.scaleway.AccountSshKeyArgs;
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
 *         var main = new AccountSshKey(&#34;main&#34;, AccountSshKeyArgs.builder()        
 *             .publicKey(&#34;&lt;YOUR-PUBLIC-SSH-KEY&gt;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * SSH keys can be imported using the `id`, e.g. bash
 * 
 * ```sh
 *  $ pulumi import scaleway:index/accountSshKey:AccountSshKey main 11111111-1111-1111-1111-111111111111
 * ```
 * 
 */
@ResourceType(type="scaleway:index/accountSshKey:AccountSshKey")
public class AccountSshKey extends com.pulumi.resources.CustomResource {
    /**
     * The date and time of the creation of the iam SSH Key
     * 
     */
    @Export(name="createdAt", refs={String.class}, tree="[0]")
    private Output<String> createdAt;

    /**
     * @return The date and time of the creation of the iam SSH Key
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The SSH key status
     * 
     */
    @Export(name="disabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> disabled;

    /**
     * @return The SSH key status
     * 
     */
    public Output<Optional<Boolean>> disabled() {
        return Codegen.optional(this.disabled);
    }
    /**
     * The fingerprint of the iam SSH key
     * 
     */
    @Export(name="fingerprint", refs={String.class}, tree="[0]")
    private Output<String> fingerprint;

    /**
     * @return The fingerprint of the iam SSH key
     * 
     */
    public Output<String> fingerprint() {
        return this.fingerprint;
    }
    /**
     * The name of the SSH key.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the SSH key.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The organization ID the SSH key is associated with.
     * 
     */
    @Export(name="organizationId", refs={String.class}, tree="[0]")
    private Output<String> organizationId;

    /**
     * @return The organization ID the SSH key is associated with.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }
    /**
     * `project_id`) The ID of the project the SSH key is associated with.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the SSH key is associated with.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * The public SSH key to be added.
     * 
     */
    @Export(name="publicKey", refs={String.class}, tree="[0]")
    private Output<String> publicKey;

    /**
     * @return The public SSH key to be added.
     * 
     */
    public Output<String> publicKey() {
        return this.publicKey;
    }
    /**
     * The date and time of the last update of the iam SSH Key
     * 
     */
    @Export(name="updatedAt", refs={String.class}, tree="[0]")
    private Output<String> updatedAt;

    /**
     * @return The date and time of the last update of the iam SSH Key
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccountSshKey(String name) {
        this(name, AccountSshKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccountSshKey(String name, AccountSshKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccountSshKey(String name, AccountSshKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/accountSshKey:AccountSshKey", name, args == null ? AccountSshKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccountSshKey(String name, Output<String> id, @Nullable AccountSshKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/accountSshKey:AccountSshKey", name, state, makeResourceOptions(options, id));
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
    public static AccountSshKey get(String name, Output<String> id, @Nullable AccountSshKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccountSshKey(name, id, state, options);
    }
}
