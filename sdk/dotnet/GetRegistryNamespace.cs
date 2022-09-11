// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs_Pulumi.Scaleway
{
    public static class GetRegistryNamespace
    {
        /// <summary>
        /// Gets information about a registry namespace.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Scaleway = Pulumi.Scaleway;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myNamespace = Scaleway.GetRegistryNamespace.Invoke(new()
        ///     {
        ///         NamespaceId = "11111111-1111-1111-1111-111111111111",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetRegistryNamespaceResult> InvokeAsync(GetRegistryNamespaceArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetRegistryNamespaceResult>("scaleway:index/getRegistryNamespace:getRegistryNamespace", args ?? new GetRegistryNamespaceArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about a registry namespace.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Scaleway = Pulumi.Scaleway;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myNamespace = Scaleway.GetRegistryNamespace.Invoke(new()
        ///     {
        ///         NamespaceId = "11111111-1111-1111-1111-111111111111",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetRegistryNamespaceResult> Invoke(GetRegistryNamespaceInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetRegistryNamespaceResult>("scaleway:index/getRegistryNamespace:getRegistryNamespace", args ?? new GetRegistryNamespaceInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRegistryNamespaceArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The namespace name.
        /// Only one of `name` and `namespace_id` should be specified.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The namespace id.
        /// Only one of `name` and `namespace_id` should be specified.
        /// </summary>
        [Input("namespaceId")]
        public string? NamespaceId { get; set; }

        /// <summary>
        /// `region`) The region in which the namespace exists.
        /// </summary>
        [Input("region")]
        public string? Region { get; set; }

        public GetRegistryNamespaceArgs()
        {
        }
        public static new GetRegistryNamespaceArgs Empty => new GetRegistryNamespaceArgs();
    }

    public sealed class GetRegistryNamespaceInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The namespace name.
        /// Only one of `name` and `namespace_id` should be specified.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The namespace id.
        /// Only one of `name` and `namespace_id` should be specified.
        /// </summary>
        [Input("namespaceId")]
        public Input<string>? NamespaceId { get; set; }

        /// <summary>
        /// `region`) The region in which the namespace exists.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public GetRegistryNamespaceInvokeArgs()
        {
        }
        public static new GetRegistryNamespaceInvokeArgs Empty => new GetRegistryNamespaceInvokeArgs();
    }


    [OutputType]
    public sealed class GetRegistryNamespaceResult
    {
        public readonly string Description;
        /// <summary>
        /// The endpoint of the Registry Namespace.
        /// </summary>
        public readonly string Endpoint;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Namespace Privacy Policy: whether or not the images are public.
        /// </summary>
        public readonly bool IsPublic;
        public readonly string? Name;
        public readonly string? NamespaceId;
        /// <summary>
        /// The organization ID the namespace is associated with.
        /// </summary>
        public readonly string OrganizationId;
        public readonly string ProjectId;
        public readonly string? Region;

        [OutputConstructor]
        private GetRegistryNamespaceResult(
            string description,

            string endpoint,

            string id,

            bool isPublic,

            string? name,

            string? namespaceId,

            string organizationId,

            string projectId,

            string? region)
        {
            Description = description;
            Endpoint = endpoint;
            Id = id;
            IsPublic = isPublic;
            Name = name;
            NamespaceId = namespaceId;
            OrganizationId = organizationId;
            ProjectId = projectId;
            Region = region;
        }
    }
}
