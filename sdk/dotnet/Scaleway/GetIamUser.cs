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
    public static class GetIamUser
    {
        /// <summary>
        /// Use this data source to get information on an existing IAM user based on its ID or email address.
        /// For more information,
        /// see [the documentation](https://developers.scaleway.com/en/products/iam/api/v1alpha1/#users-06bdcf).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Scaleway = Pulumi.Scaleway;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var findById = Scaleway.GetIamUser.Invoke(new()
        ///     {
        ///         UserId = "11111111-1111-1111-1111-111111111111",
        ///     });
        /// 
        ///     var findByEmail = Scaleway.GetIamUser.Invoke(new()
        ///     {
        ///         Email = "foo@bar.com",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetIamUserResult> InvokeAsync(GetIamUserArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIamUserResult>("scaleway:index/getIamUser:getIamUser", args ?? new GetIamUserArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information on an existing IAM user based on its ID or email address.
        /// For more information,
        /// see [the documentation](https://developers.scaleway.com/en/products/iam/api/v1alpha1/#users-06bdcf).
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Scaleway = Pulumi.Scaleway;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var findById = Scaleway.GetIamUser.Invoke(new()
        ///     {
        ///         UserId = "11111111-1111-1111-1111-111111111111",
        ///     });
        /// 
        ///     var findByEmail = Scaleway.GetIamUser.Invoke(new()
        ///     {
        ///         Email = "foo@bar.com",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetIamUserResult> Invoke(GetIamUserInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetIamUserResult>("scaleway:index/getIamUser:getIamUser", args ?? new GetIamUserInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetIamUserArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The email address of the IAM user. Only one of the `email` and `user_id` should be specified.
        /// </summary>
        [Input("email")]
        public string? Email { get; set; }

        /// <summary>
        /// `organization_id`) The ID of the
        /// organization the user is associated with.
        /// </summary>
        [Input("organizationId")]
        public string? OrganizationId { get; set; }

        /// <summary>
        /// The ID of the IAM user. Only one of the `email` and `user_id` should be specified.
        /// </summary>
        [Input("userId")]
        public string? UserId { get; set; }

        public GetIamUserArgs()
        {
        }
        public static new GetIamUserArgs Empty => new GetIamUserArgs();
    }

    public sealed class GetIamUserInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The email address of the IAM user. Only one of the `email` and `user_id` should be specified.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        /// <summary>
        /// `organization_id`) The ID of the
        /// organization the user is associated with.
        /// </summary>
        [Input("organizationId")]
        public Input<string>? OrganizationId { get; set; }

        /// <summary>
        /// The ID of the IAM user. Only one of the `email` and `user_id` should be specified.
        /// </summary>
        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public GetIamUserInvokeArgs()
        {
        }
        public static new GetIamUserInvokeArgs Empty => new GetIamUserInvokeArgs();
    }


    [OutputType]
    public sealed class GetIamUserResult
    {
        public readonly string? Email;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? OrganizationId;
        public readonly string? UserId;

        [OutputConstructor]
        private GetIamUserResult(
            string? email,

            string id,

            string? organizationId,

            string? userId)
        {
            Email = email;
            Id = id;
            OrganizationId = organizationId;
            UserId = userId;
        }
    }
}
