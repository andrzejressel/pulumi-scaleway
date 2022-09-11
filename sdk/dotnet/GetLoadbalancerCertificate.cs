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
    public static class GetLoadbalancerCertificate
    {
        /// <summary>
        /// Get information about Scaleway Load-Balancer Certificates.
        /// 
        /// This data source can prove useful when a module accepts an LB Certificate as an input variable and needs to, for example, determine the security of a certificate for your LB Frontend associated with your domain, etc.
        /// 
        /// For more information, see [the documentation](https://developers.scaleway.com/en/products/lb/zoned_api/#certificate-330754).
        /// 
        /// ## Examples
        /// </summary>
        public static Task<GetLoadbalancerCertificateResult> InvokeAsync(GetLoadbalancerCertificateArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetLoadbalancerCertificateResult>("scaleway:index/getLoadbalancerCertificate:getLoadbalancerCertificate", args ?? new GetLoadbalancerCertificateArgs(), options.WithDefaults());

        /// <summary>
        /// Get information about Scaleway Load-Balancer Certificates.
        /// 
        /// This data source can prove useful when a module accepts an LB Certificate as an input variable and needs to, for example, determine the security of a certificate for your LB Frontend associated with your domain, etc.
        /// 
        /// For more information, see [the documentation](https://developers.scaleway.com/en/products/lb/zoned_api/#certificate-330754).
        /// 
        /// ## Examples
        /// </summary>
        public static Output<GetLoadbalancerCertificateResult> Invoke(GetLoadbalancerCertificateInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetLoadbalancerCertificateResult>("scaleway:index/getLoadbalancerCertificate:getLoadbalancerCertificate", args ?? new GetLoadbalancerCertificateInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLoadbalancerCertificateArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The certificate id.
        /// - Only one of `name` and `certificate_id` should be specified.
        /// </summary>
        [Input("certificateId")]
        public string? CertificateId { get; set; }

        /// <summary>
        /// The load-balancer ID this certificate is attached to.
        /// </summary>
        [Input("lbId")]
        public string? LbId { get; set; }

        /// <summary>
        /// The name of the certificate backend.
        /// - When using a certificate `name` you should specify the `lb-id`
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        public GetLoadbalancerCertificateArgs()
        {
        }
        public static new GetLoadbalancerCertificateArgs Empty => new GetLoadbalancerCertificateArgs();
    }

    public sealed class GetLoadbalancerCertificateInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The certificate id.
        /// - Only one of `name` and `certificate_id` should be specified.
        /// </summary>
        [Input("certificateId")]
        public Input<string>? CertificateId { get; set; }

        /// <summary>
        /// The load-balancer ID this certificate is attached to.
        /// </summary>
        [Input("lbId")]
        public Input<string>? LbId { get; set; }

        /// <summary>
        /// The name of the certificate backend.
        /// - When using a certificate `name` you should specify the `lb-id`
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GetLoadbalancerCertificateInvokeArgs()
        {
        }
        public static new GetLoadbalancerCertificateInvokeArgs Empty => new GetLoadbalancerCertificateInvokeArgs();
    }


    [OutputType]
    public sealed class GetLoadbalancerCertificateResult
    {
        public readonly string? CertificateId;
        public readonly string CommonName;
        public readonly ImmutableArray<Outputs.GetLoadbalancerCertificateCustomCertificateResult> CustomCertificates;
        public readonly string Fingerprint;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string? LbId;
        public readonly ImmutableArray<Outputs.GetLoadbalancerCertificateLetsencryptResult> Letsencrypts;
        public readonly string? Name;
        public readonly string NotValidAfter;
        public readonly string NotValidBefore;
        public readonly string Status;
        public readonly ImmutableArray<string> SubjectAlternativeNames;

        [OutputConstructor]
        private GetLoadbalancerCertificateResult(
            string? certificateId,

            string commonName,

            ImmutableArray<Outputs.GetLoadbalancerCertificateCustomCertificateResult> customCertificates,

            string fingerprint,

            string id,

            string? lbId,

            ImmutableArray<Outputs.GetLoadbalancerCertificateLetsencryptResult> letsencrypts,

            string? name,

            string notValidAfter,

            string notValidBefore,

            string status,

            ImmutableArray<string> subjectAlternativeNames)
        {
            CertificateId = certificateId;
            CommonName = commonName;
            CustomCertificates = customCertificates;
            Fingerprint = fingerprint;
            Id = id;
            LbId = lbId;
            Letsencrypts = letsencrypts;
            Name = name;
            NotValidAfter = notValidAfter;
            NotValidBefore = notValidBefore;
            Status = status;
            SubjectAlternativeNames = subjectAlternativeNames;
        }
    }
}
