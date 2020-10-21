// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package scaleway

import (
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

type KubernetesClusterBeta struct {
	pulumi.CustomResourceState

	// The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) to enable on the cluster.
	AdmissionPlugins pulumi.StringArrayOutput `pulumi:"admissionPlugins"`
	// The URL of the Kubernetes API server.
	ApiserverUrl pulumi.StringOutput `pulumi:"apiserverUrl"`
	// The auto upgrade configuration.
	AutoUpgrade KubernetesClusterBetaAutoUpgradeOutput `pulumi:"autoUpgrade"`
	// The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
	AutoscalerConfig KubernetesClusterBetaAutoscalerConfigOutput `pulumi:"autoscalerConfig"`
	// The Container Network Interface (CNI) for the Kubernetes cluster.
	// > **Important:** Updates to this field will recreate a new resource.
	Cni pulumi.StringOutput `pulumi:"cni"`
	// The creation date of the cluster.
	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// See below.
	//
	// Deprecated: This fields is deprecated and will be removed in the next major version, please use scaleway_k8s_pool_beta instead.
	DefaultPool KubernetesClusterBetaDefaultPoolPtrOutput `pulumi:"defaultPool"`
	// A description for the Kubernetes cluster.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Enables the [Kubernetes dashboard](https://github.com/kubernetes/dashboard) for the Kubernetes cluster.
	EnableDashboard pulumi.BoolPtrOutput `pulumi:"enableDashboard"`
	// The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) to enable on the cluster.
	FeatureGates pulumi.StringArrayOutput `pulumi:"featureGates"`
	// The [ingress controller](https://kubernetes.io/docs/concepts/services-networking/ingress-controllers/) to be deployed on the Kubernetes cluster.
	Ingress pulumi.StringPtrOutput `pulumi:"ingress"`
	// The kubeconfig configuration file of the Kubernetes cluster
	Kubeconfig KubernetesClusterBetaKubeconfigOutput `pulumi:"kubeconfig"`
	// The name for the Kubernetes cluster.
	Name pulumi.StringOutput `pulumi:"name"`
	// `organizationId`) The ID of the organization the cluster is associated with.
	OrganizationId pulumi.StringOutput `pulumi:"organizationId"`
	// `region`) The region in which the cluster should be created.
	Region pulumi.StringOutput `pulumi:"region"`
	// The status of the Kubernetes cluster.
	Status pulumi.StringOutput `pulumi:"status"`
	// The tags associated with the Kubernetes cluster.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// The last update date of the cluster.
	UpdatedAt pulumi.StringOutput `pulumi:"updatedAt"`
	// Set to `true` if a newer Kubernetes version is available.
	UpgradeAvailable pulumi.BoolOutput `pulumi:"upgradeAvailable"`
	// The version of the Kubernetes cluster.
	Version pulumi.StringOutput `pulumi:"version"`
	// The DNS wildcard that points to all ready nodes.
	// - `kubeconfig`
	WildcardDns pulumi.StringOutput `pulumi:"wildcardDns"`
}

// NewKubernetesClusterBeta registers a new resource with the given unique name, arguments, and options.
func NewKubernetesClusterBeta(ctx *pulumi.Context,
	name string, args *KubernetesClusterBetaArgs, opts ...pulumi.ResourceOption) (*KubernetesClusterBeta, error) {
	if args == nil || args.Cni == nil {
		return nil, errors.New("missing required argument 'Cni'")
	}
	if args == nil || args.Version == nil {
		return nil, errors.New("missing required argument 'Version'")
	}
	if args == nil {
		args = &KubernetesClusterBetaArgs{}
	}
	var resource KubernetesClusterBeta
	err := ctx.RegisterResource("scaleway:index/kubernetesClusterBeta:KubernetesClusterBeta", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetKubernetesClusterBeta gets an existing KubernetesClusterBeta resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetKubernetesClusterBeta(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *KubernetesClusterBetaState, opts ...pulumi.ResourceOption) (*KubernetesClusterBeta, error) {
	var resource KubernetesClusterBeta
	err := ctx.ReadResource("scaleway:index/kubernetesClusterBeta:KubernetesClusterBeta", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering KubernetesClusterBeta resources.
type kubernetesClusterBetaState struct {
	// The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) to enable on the cluster.
	AdmissionPlugins []string `pulumi:"admissionPlugins"`
	// The URL of the Kubernetes API server.
	ApiserverUrl *string `pulumi:"apiserverUrl"`
	// The auto upgrade configuration.
	AutoUpgrade *KubernetesClusterBetaAutoUpgrade `pulumi:"autoUpgrade"`
	// The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
	AutoscalerConfig *KubernetesClusterBetaAutoscalerConfig `pulumi:"autoscalerConfig"`
	// The Container Network Interface (CNI) for the Kubernetes cluster.
	// > **Important:** Updates to this field will recreate a new resource.
	Cni *string `pulumi:"cni"`
	// The creation date of the cluster.
	CreatedAt *string `pulumi:"createdAt"`
	// See below.
	//
	// Deprecated: This fields is deprecated and will be removed in the next major version, please use scaleway_k8s_pool_beta instead.
	DefaultPool *KubernetesClusterBetaDefaultPool `pulumi:"defaultPool"`
	// A description for the Kubernetes cluster.
	Description *string `pulumi:"description"`
	// Enables the [Kubernetes dashboard](https://github.com/kubernetes/dashboard) for the Kubernetes cluster.
	EnableDashboard *bool `pulumi:"enableDashboard"`
	// The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) to enable on the cluster.
	FeatureGates []string `pulumi:"featureGates"`
	// The [ingress controller](https://kubernetes.io/docs/concepts/services-networking/ingress-controllers/) to be deployed on the Kubernetes cluster.
	Ingress *string `pulumi:"ingress"`
	// The kubeconfig configuration file of the Kubernetes cluster
	Kubeconfig *KubernetesClusterBetaKubeconfig `pulumi:"kubeconfig"`
	// The name for the Kubernetes cluster.
	Name *string `pulumi:"name"`
	// `organizationId`) The ID of the organization the cluster is associated with.
	OrganizationId *string `pulumi:"organizationId"`
	// `region`) The region in which the cluster should be created.
	Region *string `pulumi:"region"`
	// The status of the Kubernetes cluster.
	Status *string `pulumi:"status"`
	// The tags associated with the Kubernetes cluster.
	Tags []string `pulumi:"tags"`
	// The last update date of the cluster.
	UpdatedAt *string `pulumi:"updatedAt"`
	// Set to `true` if a newer Kubernetes version is available.
	UpgradeAvailable *bool `pulumi:"upgradeAvailable"`
	// The version of the Kubernetes cluster.
	Version *string `pulumi:"version"`
	// The DNS wildcard that points to all ready nodes.
	// - `kubeconfig`
	WildcardDns *string `pulumi:"wildcardDns"`
}

type KubernetesClusterBetaState struct {
	// The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) to enable on the cluster.
	AdmissionPlugins pulumi.StringArrayInput
	// The URL of the Kubernetes API server.
	ApiserverUrl pulumi.StringPtrInput
	// The auto upgrade configuration.
	AutoUpgrade KubernetesClusterBetaAutoUpgradePtrInput
	// The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
	AutoscalerConfig KubernetesClusterBetaAutoscalerConfigPtrInput
	// The Container Network Interface (CNI) for the Kubernetes cluster.
	// > **Important:** Updates to this field will recreate a new resource.
	Cni pulumi.StringPtrInput
	// The creation date of the cluster.
	CreatedAt pulumi.StringPtrInput
	// See below.
	//
	// Deprecated: This fields is deprecated and will be removed in the next major version, please use scaleway_k8s_pool_beta instead.
	DefaultPool KubernetesClusterBetaDefaultPoolPtrInput
	// A description for the Kubernetes cluster.
	Description pulumi.StringPtrInput
	// Enables the [Kubernetes dashboard](https://github.com/kubernetes/dashboard) for the Kubernetes cluster.
	EnableDashboard pulumi.BoolPtrInput
	// The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) to enable on the cluster.
	FeatureGates pulumi.StringArrayInput
	// The [ingress controller](https://kubernetes.io/docs/concepts/services-networking/ingress-controllers/) to be deployed on the Kubernetes cluster.
	Ingress pulumi.StringPtrInput
	// The kubeconfig configuration file of the Kubernetes cluster
	Kubeconfig KubernetesClusterBetaKubeconfigPtrInput
	// The name for the Kubernetes cluster.
	Name pulumi.StringPtrInput
	// `organizationId`) The ID of the organization the cluster is associated with.
	OrganizationId pulumi.StringPtrInput
	// `region`) The region in which the cluster should be created.
	Region pulumi.StringPtrInput
	// The status of the Kubernetes cluster.
	Status pulumi.StringPtrInput
	// The tags associated with the Kubernetes cluster.
	Tags pulumi.StringArrayInput
	// The last update date of the cluster.
	UpdatedAt pulumi.StringPtrInput
	// Set to `true` if a newer Kubernetes version is available.
	UpgradeAvailable pulumi.BoolPtrInput
	// The version of the Kubernetes cluster.
	Version pulumi.StringPtrInput
	// The DNS wildcard that points to all ready nodes.
	// - `kubeconfig`
	WildcardDns pulumi.StringPtrInput
}

func (KubernetesClusterBetaState) ElementType() reflect.Type {
	return reflect.TypeOf((*kubernetesClusterBetaState)(nil)).Elem()
}

type kubernetesClusterBetaArgs struct {
	// The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) to enable on the cluster.
	AdmissionPlugins []string `pulumi:"admissionPlugins"`
	// The auto upgrade configuration.
	AutoUpgrade *KubernetesClusterBetaAutoUpgrade `pulumi:"autoUpgrade"`
	// The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
	AutoscalerConfig *KubernetesClusterBetaAutoscalerConfig `pulumi:"autoscalerConfig"`
	// The Container Network Interface (CNI) for the Kubernetes cluster.
	// > **Important:** Updates to this field will recreate a new resource.
	Cni string `pulumi:"cni"`
	// See below.
	//
	// Deprecated: This fields is deprecated and will be removed in the next major version, please use scaleway_k8s_pool_beta instead.
	DefaultPool *KubernetesClusterBetaDefaultPool `pulumi:"defaultPool"`
	// A description for the Kubernetes cluster.
	Description *string `pulumi:"description"`
	// Enables the [Kubernetes dashboard](https://github.com/kubernetes/dashboard) for the Kubernetes cluster.
	EnableDashboard *bool `pulumi:"enableDashboard"`
	// The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) to enable on the cluster.
	FeatureGates []string `pulumi:"featureGates"`
	// The [ingress controller](https://kubernetes.io/docs/concepts/services-networking/ingress-controllers/) to be deployed on the Kubernetes cluster.
	Ingress *string `pulumi:"ingress"`
	// The name for the Kubernetes cluster.
	Name *string `pulumi:"name"`
	// `organizationId`) The ID of the organization the cluster is associated with.
	OrganizationId *string `pulumi:"organizationId"`
	// `region`) The region in which the cluster should be created.
	Region *string `pulumi:"region"`
	// The tags associated with the Kubernetes cluster.
	Tags []string `pulumi:"tags"`
	// The version of the Kubernetes cluster.
	Version string `pulumi:"version"`
}

// The set of arguments for constructing a KubernetesClusterBeta resource.
type KubernetesClusterBetaArgs struct {
	// The list of [admission plugins](https://kubernetes.io/docs/reference/access-authn-authz/admission-controllers/) to enable on the cluster.
	AdmissionPlugins pulumi.StringArrayInput
	// The auto upgrade configuration.
	AutoUpgrade KubernetesClusterBetaAutoUpgradePtrInput
	// The configuration options for the [Kubernetes cluster autoscaler](https://github.com/kubernetes/autoscaler/tree/master/cluster-autoscaler).
	AutoscalerConfig KubernetesClusterBetaAutoscalerConfigPtrInput
	// The Container Network Interface (CNI) for the Kubernetes cluster.
	// > **Important:** Updates to this field will recreate a new resource.
	Cni pulumi.StringInput
	// See below.
	//
	// Deprecated: This fields is deprecated and will be removed in the next major version, please use scaleway_k8s_pool_beta instead.
	DefaultPool KubernetesClusterBetaDefaultPoolPtrInput
	// A description for the Kubernetes cluster.
	Description pulumi.StringPtrInput
	// Enables the [Kubernetes dashboard](https://github.com/kubernetes/dashboard) for the Kubernetes cluster.
	EnableDashboard pulumi.BoolPtrInput
	// The list of [feature gates](https://kubernetes.io/docs/reference/command-line-tools-reference/feature-gates/) to enable on the cluster.
	FeatureGates pulumi.StringArrayInput
	// The [ingress controller](https://kubernetes.io/docs/concepts/services-networking/ingress-controllers/) to be deployed on the Kubernetes cluster.
	Ingress pulumi.StringPtrInput
	// The name for the Kubernetes cluster.
	Name pulumi.StringPtrInput
	// `organizationId`) The ID of the organization the cluster is associated with.
	OrganizationId pulumi.StringPtrInput
	// `region`) The region in which the cluster should be created.
	Region pulumi.StringPtrInput
	// The tags associated with the Kubernetes cluster.
	Tags pulumi.StringArrayInput
	// The version of the Kubernetes cluster.
	Version pulumi.StringInput
}

func (KubernetesClusterBetaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*kubernetesClusterBetaArgs)(nil)).Elem()
}
