// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scaleway
{
    [ScalewayResourceType("scaleway:index/functionNamespace:FunctionNamespace")]
    public partial class FunctionNamespace : Pulumi.CustomResource
    {
        /// <summary>
        /// The description of the function namespace
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The environment variables of the function namespace
        /// </summary>
        [Output("environmentVariables")]
        public Output<ImmutableDictionary<string, string>?> EnvironmentVariables { get; private set; } = null!;

        /// <summary>
        /// The name of the function namespace
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The organization_id you want to attach the resource to
        /// </summary>
        [Output("organizationId")]
        public Output<string> OrganizationId { get; private set; } = null!;

        /// <summary>
        /// The project_id you want to attach the resource to
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// The region you want to attach the resource to
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// The endpoint reachable by docker
        /// </summary>
        [Output("registryEndpoint")]
        public Output<string> RegistryEndpoint { get; private set; } = null!;

        /// <summary>
        /// The ID of the registry namespace
        /// </summary>
        [Output("registryNamespaceId")]
        public Output<string> RegistryNamespaceId { get; private set; } = null!;


        /// <summary>
        /// Create a FunctionNamespace resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FunctionNamespace(string name, FunctionNamespaceArgs? args = null, CustomResourceOptions? options = null)
            : base("scaleway:index/functionNamespace:FunctionNamespace", name, args ?? new FunctionNamespaceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FunctionNamespace(string name, Input<string> id, FunctionNamespaceState? state = null, CustomResourceOptions? options = null)
            : base("scaleway:index/functionNamespace:FunctionNamespace", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "https://github.com/pulumiverse/pulumi-scaleway/releases/download/${VERSION}",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing FunctionNamespace resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FunctionNamespace Get(string name, Input<string> id, FunctionNamespaceState? state = null, CustomResourceOptions? options = null)
        {
            return new FunctionNamespace(name, id, state, options);
        }
    }

    public sealed class FunctionNamespaceArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the function namespace
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("environmentVariables")]
        private InputMap<string>? _environmentVariables;

        /// <summary>
        /// The environment variables of the function namespace
        /// </summary>
        public InputMap<string> EnvironmentVariables
        {
            get => _environmentVariables ?? (_environmentVariables = new InputMap<string>());
            set => _environmentVariables = value;
        }

        /// <summary>
        /// The name of the function namespace
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The project_id you want to attach the resource to
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// The region you want to attach the resource to
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public FunctionNamespaceArgs()
        {
        }
    }

    public sealed class FunctionNamespaceState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the function namespace
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("environmentVariables")]
        private InputMap<string>? _environmentVariables;

        /// <summary>
        /// The environment variables of the function namespace
        /// </summary>
        public InputMap<string> EnvironmentVariables
        {
            get => _environmentVariables ?? (_environmentVariables = new InputMap<string>());
            set => _environmentVariables = value;
        }

        /// <summary>
        /// The name of the function namespace
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The organization_id you want to attach the resource to
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// The project_id you want to attach the resource to
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// The region you want to attach the resource to
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The endpoint reachable by docker
        /// </summary>
        [Input("registryEndpoint")]
        public Input<string>? RegistryEndpoint { get; set; }

        /// <summary>
        /// The ID of the registry namespace
        /// </summary>
        [Input("registryNamespaceId")]
        public Input<string>? RegistryNamespaceId { get; set; }

        public FunctionNamespaceState()
        {
        }
    }
}
