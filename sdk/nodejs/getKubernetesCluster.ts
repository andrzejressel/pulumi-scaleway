// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Gets information about a Kubernetes Cluster.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as scaleway from "@pulumi/scaleway";
 *
 * const myKey = scaleway.getKubernetesCluster({
 *     clusterId: "11111111-1111-1111-1111-111111111111",
 * });
 * ```
 */
export function getKubernetesCluster(args?: GetKubernetesClusterArgs, opts?: pulumi.InvokeOptions): Promise<GetKubernetesClusterResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("scaleway:index/getKubernetesCluster:getKubernetesCluster", {
        "clusterId": args.clusterId,
        "name": args.name,
        "region": args.region,
    }, opts);
}

/**
 * A collection of arguments for invoking getKubernetesCluster.
 */
export interface GetKubernetesClusterArgs {
    /**
     * The cluster ID. Only one of `name` and `clusterId` should be specified.
     */
    clusterId?: string;
    /**
     * The cluster name. Only one of `name` and `clusterId` should be specified.
     */
    name?: string;
    /**
     * `region`) The region in which the cluster exists.
     */
    region?: string;
}

/**
 * A collection of values returned by getKubernetesCluster.
 */
export interface GetKubernetesClusterResult {
    /**
     * The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) enabled on the cluster.
     */
    readonly admissionPlugins: string[];
    readonly apiserverCertSans: string[];
    /**
     * The URL of the Kubernetes API server.
     */
    readonly apiserverUrl: string;
    /**
     * The auto upgrade configuration.
     */
    readonly autoUpgrades: outputs.GetKubernetesClusterAutoUpgrade[];
    /**
     * The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
     */
    readonly autoscalerConfigs: outputs.GetKubernetesClusterAutoscalerConfig[];
    readonly clusterId?: string;
    /**
     * The Container Network Interface (CNI) for the Kubernetes cluster.
     */
    readonly cni: string;
    /**
     * The creation date of the cluster.
     */
    readonly createdAt: string;
    /**
     * A description for the Kubernetes cluster.
     */
    readonly description: string;
    /**
     * The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) enabled on the cluster.
     */
    readonly featureGates: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly kubeconfigs: outputs.GetKubernetesClusterKubeconfig[];
    readonly name?: string;
    readonly openIdConnectConfigs: outputs.GetKubernetesClusterOpenIdConnectConfig[];
    /**
     * The ID of the organization the cluster is associated with.
     */
    readonly organizationId: string;
    /**
     * The ID of the private network of the cluster.
     */
    readonly privateNetworkId: string;
    /**
     * The ID of the project the cluster is associated with.
     */
    readonly projectId: string;
    /**
     * The region in which the cluster is.
     */
    readonly region?: string;
    /**
     * The status of the Kubernetes cluster.
     */
    readonly status: string;
    /**
     * The tags associated with the Kubernetes cluster.
     */
    readonly tags: string[];
    /**
     * The type of the Kubernetes cluster.
     */
    readonly type: string;
    /**
     * The last update date of the cluster.
     */
    readonly updatedAt: string;
    /**
     * True if a newer Kubernetes version is available.
     */
    readonly upgradeAvailable: boolean;
    /**
     * The version of the Kubernetes cluster.
     */
    readonly version: string;
    /**
     * The DNS wildcard that points to all ready nodes.
     */
    readonly wildcardDns: string;
}
/**
 * Gets information about a Kubernetes Cluster.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as scaleway from "@pulumi/scaleway";
 *
 * const myKey = scaleway.getKubernetesCluster({
 *     clusterId: "11111111-1111-1111-1111-111111111111",
 * });
 * ```
 */
export function getKubernetesClusterOutput(args?: GetKubernetesClusterOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetKubernetesClusterResult> {
    return pulumi.output(args).apply((a: any) => getKubernetesCluster(a, opts))
}

/**
 * A collection of arguments for invoking getKubernetesCluster.
 */
export interface GetKubernetesClusterOutputArgs {
    /**
     * The cluster ID. Only one of `name` and `clusterId` should be specified.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The cluster name. Only one of `name` and `clusterId` should be specified.
     */
    name?: pulumi.Input<string>;
    /**
     * `region`) The region in which the cluster exists.
     */
    region?: pulumi.Input<string>;
}
