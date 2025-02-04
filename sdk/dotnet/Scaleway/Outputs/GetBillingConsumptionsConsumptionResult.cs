// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Scaleway.Outputs
{

    [OutputType]
    public sealed class GetBillingConsumptionsConsumptionResult
    {
        public readonly string Category;
        public readonly string Description;
        public readonly string OperationPath;
        public readonly string ProjectId;
        public readonly string Value;

        [OutputConstructor]
        private GetBillingConsumptionsConsumptionResult(
            string category,

            string description,

            string operationPath,

            string projectId,

            string value)
        {
            Category = category;
            Description = description;
            OperationPath = operationPath;
            ProjectId = projectId;
            Value = value;
        }
    }
}
