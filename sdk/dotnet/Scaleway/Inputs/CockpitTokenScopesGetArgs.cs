// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Scaleway.Inputs
{

    public sealed class CockpitTokenScopesGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Query logs
        /// </summary>
        [Input("queryLogs")]
        public Input<bool>? QueryLogs { get; set; }

        /// <summary>
        /// Query metrics
        /// </summary>
        [Input("queryMetrics")]
        public Input<bool>? QueryMetrics { get; set; }

        /// <summary>
        /// Setup alerts
        /// </summary>
        [Input("setupAlerts")]
        public Input<bool>? SetupAlerts { get; set; }

        /// <summary>
        /// Setup logs rules
        /// </summary>
        [Input("setupLogsRules")]
        public Input<bool>? SetupLogsRules { get; set; }

        /// <summary>
        /// Setup metrics rules
        /// </summary>
        [Input("setupMetricsRules")]
        public Input<bool>? SetupMetricsRules { get; set; }

        /// <summary>
        /// Write logs
        /// </summary>
        [Input("writeLogs")]
        public Input<bool>? WriteLogs { get; set; }

        /// <summary>
        /// Write metrics
        /// </summary>
        [Input("writeMetrics")]
        public Input<bool>? WriteMetrics { get; set; }

        public CockpitTokenScopesGetArgs()
        {
        }
        public static new CockpitTokenScopesGetArgs Empty => new CockpitTokenScopesGetArgs();
    }
}
