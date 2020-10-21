// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Scaleway
{
    /// <summary>
    /// **DEPRECATED**: This resource is deprecated and will be removed in `v2.0+`.
    /// Please use `scaleway.InstanceServer` instead.
    /// 
    /// Provides user data for servers.
    /// For additional details please refer to [API documentation](https://developer.scaleway.com/#user-data).
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Scaleway = Pulumi.Scaleway;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var @base = new Scaleway.Server("base", new Scaleway.ServerArgs
    ///         {
    ///             Image = "5faef9cd-ea9b-4a63-9171-9e26bec03dbc",
    ///             Type = "C1",
    ///             State = "stopped",
    ///         });
    ///         var gcp = new Scaleway.UserData("gcp", new Scaleway.UserDataArgs
    ///         {
    ///             Server = @base.Id,
    ///             Key = "gcp_username",
    ///             Value = "supersecret",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class UserData : Pulumi.CustomResource
    {
        /// <summary>
        /// The key of the user data object
        /// </summary>
        [Output("key")]
        public Output<string> Key { get; private set; } = null!;

        /// <summary>
        /// ID of server to associate the user data with
        /// </summary>
        [Output("server")]
        public Output<string> Server { get; private set; } = null!;

        /// <summary>
        /// The value of the user data object
        /// </summary>
        [Output("value")]
        public Output<string> Value { get; private set; } = null!;


        /// <summary>
        /// Create a UserData resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UserData(string name, UserDataArgs args, CustomResourceOptions? options = null)
            : base("scaleway:index/userData:UserData", name, args ?? new UserDataArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UserData(string name, Input<string> id, UserDataState? state = null, CustomResourceOptions? options = null)
            : base("scaleway:index/userData:UserData", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing UserData resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UserData Get(string name, Input<string> id, UserDataState? state = null, CustomResourceOptions? options = null)
        {
            return new UserData(name, id, state, options);
        }
    }

    public sealed class UserDataArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The key of the user data object
        /// </summary>
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        /// <summary>
        /// ID of server to associate the user data with
        /// </summary>
        [Input("server", required: true)]
        public Input<string> Server { get; set; } = null!;

        /// <summary>
        /// The value of the user data object
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public UserDataArgs()
        {
        }
    }

    public sealed class UserDataState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The key of the user data object
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// ID of server to associate the user data with
        /// </summary>
        [Input("server")]
        public Input<string>? Server { get; set; }

        /// <summary>
        /// The value of the user data object
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public UserDataState()
        {
        }
    }
}
