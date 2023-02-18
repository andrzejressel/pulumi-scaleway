// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.scaleway.MnqCredentialArgs;
import com.pulumi.scaleway.Utilities;
import com.pulumi.scaleway.inputs.MnqCredentialState;
import com.pulumi.scaleway.outputs.MnqCredentialNatsCredentials;
import com.pulumi.scaleway.outputs.MnqCredentialSqsSnsCredentials;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Credential can be imported using the `{region}/{id}`, e.g. bash
 * 
 * ```sh
 *  $ pulumi import scaleway:index/mnqCredential:MnqCredential main fr-par/11111111111111111111111111111111
 * ```
 * 
 */
@ResourceType(type="scaleway:index/mnqCredential:MnqCredential")
public class MnqCredential extends com.pulumi.resources.CustomResource {
    /**
     * The credential name..
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The credential name..
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The namespace containing the Credential.
     * 
     */
    @Export(name="namespaceId", type=String.class, parameters={})
    private Output<String> namespaceId;

    /**
     * @return The namespace containing the Credential.
     * 
     */
    public Output<String> namespaceId() {
        return this.namespaceId;
    }
    /**
     * Credentials file used to connect to the NATS service. Only one of `nats_credentials` and `sqs_sns_credentials` may be set.
     * 
     */
    @Export(name="natsCredentials", type=MnqCredentialNatsCredentials.class, parameters={})
    private Output<MnqCredentialNatsCredentials> natsCredentials;

    /**
     * @return Credentials file used to connect to the NATS service. Only one of `nats_credentials` and `sqs_sns_credentials` may be set.
     * 
     */
    public Output<MnqCredentialNatsCredentials> natsCredentials() {
        return this.natsCredentials;
    }
    /**
     * The protocol associated to the Credential. Possible values are `nats` and `sqs_sns`.
     * 
     */
    @Export(name="protocol", type=String.class, parameters={})
    private Output<String> protocol;

    /**
     * @return The protocol associated to the Credential. Possible values are `nats` and `sqs_sns`.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }
    /**
     * (Defaults to provider `region`). The region
     * in which the namespace should be created.
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return (Defaults to provider `region`). The region
     * in which the namespace should be created.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Credential used to connect to the SQS/SNS service. Only one of `nats_credentials`
     * and `sqs_sns_credentials` may be set.
     * 
     */
    @Export(name="sqsSnsCredentials", type=MnqCredentialSqsSnsCredentials.class, parameters={})
    private Output</* @Nullable */ MnqCredentialSqsSnsCredentials> sqsSnsCredentials;

    /**
     * @return Credential used to connect to the SQS/SNS service. Only one of `nats_credentials`
     * and `sqs_sns_credentials` may be set.
     * 
     */
    public Output<Optional<MnqCredentialSqsSnsCredentials>> sqsSnsCredentials() {
        return Codegen.optional(this.sqsSnsCredentials);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MnqCredential(String name) {
        this(name, MnqCredentialArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MnqCredential(String name, MnqCredentialArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MnqCredential(String name, MnqCredentialArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/mnqCredential:MnqCredential", name, args == null ? MnqCredentialArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MnqCredential(String name, Output<String> id, @Nullable MnqCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("scaleway:index/mnqCredential:MnqCredential", name, state, makeResourceOptions(options, id));
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
    public static MnqCredential get(String name, Output<String> id, @Nullable MnqCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MnqCredential(name, id, state, options);
    }
}
