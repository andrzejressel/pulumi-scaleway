// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Scaleway
{
    /// <summary>
    /// Creates and manages Scaleway object storage bucket policy.
    /// For more information, see [the documentation](https://www.scaleway.com/en/docs/storage/object/api-cli/using-bucket-policies/).
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using Scaleway = Lbrlabs.PulumiPackage.Scaleway;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var bucket = new Scaleway.ObjectBucket("bucket");
    /// 
    ///     var policy = new Scaleway.ObjectBucketPolicy("policy", new()
    ///     {
    ///         Bucket = bucket.Name,
    ///         Policy = Output.Tuple(bucket.Name, bucket.Name).Apply(values =&gt;
    ///         {
    ///             var bucketName = values.Item1;
    ///             var bucketName1 = values.Item2;
    ///             return JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///             {
    ///                 ["Version"] = "2023-04-17",
    ///                 ["Id"] = "MyBucketPolicy",
    ///                 ["Statement"] = new[]
    ///                 {
    ///                     new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         ["Sid"] = "Delegate access",
    ///                         ["Effect"] = "Allow",
    ///                         ["Principal"] = new Dictionary&lt;string, object?&gt;
    ///                         {
    ///                             ["SCW"] = "application_id:&lt;APPLICATION_ID&gt;",
    ///                         },
    ///                         ["Action"] = "s3:ListBucket",
    ///                         ["Resources"] = new[]
    ///                         {
    ///                             bucketName,
    ///                             $"{bucketName1}/*",
    ///                         },
    ///                     },
    ///                 },
    ///             });
    ///         }),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Buckets can be imported using the `{region}/{bucketName}` identifier, e.g. bash
    /// 
    /// ```sh
    ///  $ pulumi import scaleway:index/objectBucketPolicy:ObjectBucketPolicy some_bucket fr-par/some-bucket
    /// ```
    /// </summary>
    [ScalewayResourceType("scaleway:index/objectBucketPolicy:ObjectBucketPolicy")]
    public partial class ObjectBucketPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the bucket.
        /// </summary>
        [Output("bucket")]
        public Output<string> Bucket { get; private set; } = null!;

        /// <summary>
        /// The text of the policy.
        /// </summary>
        [Output("policy")]
        public Output<string> Policy { get; private set; } = null!;

        /// <summary>
        /// `project_id`) The ID of the project the bucket is associated with.
        /// 
        /// &gt; **Important:** The aws_iam_policy_document data source may be used, so long as it specifies a principal.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// The Scaleway region this bucket resides in.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;


        /// <summary>
        /// Create a ObjectBucketPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ObjectBucketPolicy(string name, ObjectBucketPolicyArgs args, CustomResourceOptions? options = null)
            : base("scaleway:index/objectBucketPolicy:ObjectBucketPolicy", name, args ?? new ObjectBucketPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ObjectBucketPolicy(string name, Input<string> id, ObjectBucketPolicyState? state = null, CustomResourceOptions? options = null)
            : base("scaleway:index/objectBucketPolicy:ObjectBucketPolicy", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ObjectBucketPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ObjectBucketPolicy Get(string name, Input<string> id, ObjectBucketPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new ObjectBucketPolicy(name, id, state, options);
        }
    }

    public sealed class ObjectBucketPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the bucket.
        /// </summary>
        [Input("bucket", required: true)]
        public Input<string> Bucket { get; set; } = null!;

        /// <summary>
        /// The text of the policy.
        /// </summary>
        [Input("policy", required: true)]
        public Input<string> Policy { get; set; } = null!;

        /// <summary>
        /// `project_id`) The ID of the project the bucket is associated with.
        /// 
        /// &gt; **Important:** The aws_iam_policy_document data source may be used, so long as it specifies a principal.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// The Scaleway region this bucket resides in.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public ObjectBucketPolicyArgs()
        {
        }
        public static new ObjectBucketPolicyArgs Empty => new ObjectBucketPolicyArgs();
    }

    public sealed class ObjectBucketPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the bucket.
        /// </summary>
        [Input("bucket")]
        public Input<string>? Bucket { get; set; }

        /// <summary>
        /// The text of the policy.
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// `project_id`) The ID of the project the bucket is associated with.
        /// 
        /// &gt; **Important:** The aws_iam_policy_document data source may be used, so long as it specifies a principal.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// The Scaleway region this bucket resides in.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public ObjectBucketPolicyState()
        {
        }
        public static new ObjectBucketPolicyState Empty => new ObjectBucketPolicyState();
    }
}
