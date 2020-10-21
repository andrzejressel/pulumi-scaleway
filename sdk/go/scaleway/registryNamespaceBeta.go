// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package scaleway

import (
	"reflect"

	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Creates and manages Scaleway Container Registry. For more information see [the documentation](https://developers.scaleway.com/en/products/registry/api/).
//
// ## Examples
//
// ### Basic
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-scaleway/sdk/go/scaleway"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := scaleway.NewRegistryNamespaceBeta(ctx, "main", &scaleway.RegistryNamespaceBetaArgs{
// 			Description: pulumi.String("Main container registry"),
// 			IsPublic:    pulumi.Bool(false),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Attibutes Reference
//
// In addition to all arguments above, the following attibutes are exported:
//
// - `id` - The ID of the namespace
// - `endpoint` - Endpoint reachable by docker.
type RegistryNamespaceBeta struct {
	pulumi.CustomResourceState

	// The description of the container registry namespace.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The endpoint reachable by docker
	Endpoint pulumi.StringOutput `pulumi:"endpoint"`
	// Whether or not the registry images stored in the namespace should be downloadable publicly (docker pull).
	IsPublic pulumi.BoolPtrOutput `pulumi:"isPublic"`
	// The unique name of the container registry namespace.
	Name pulumi.StringOutput `pulumi:"name"`
	// `organizationId`) The ID of the organization the registry is associated with.
	OrganizationId pulumi.StringOutput `pulumi:"organizationId"`
	// `region`). The region in which the container registry namespace should be created.
	Region pulumi.StringOutput `pulumi:"region"`
}

// NewRegistryNamespaceBeta registers a new resource with the given unique name, arguments, and options.
func NewRegistryNamespaceBeta(ctx *pulumi.Context,
	name string, args *RegistryNamespaceBetaArgs, opts ...pulumi.ResourceOption) (*RegistryNamespaceBeta, error) {
	if args == nil {
		args = &RegistryNamespaceBetaArgs{}
	}
	var resource RegistryNamespaceBeta
	err := ctx.RegisterResource("scaleway:index/registryNamespaceBeta:RegistryNamespaceBeta", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRegistryNamespaceBeta gets an existing RegistryNamespaceBeta resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRegistryNamespaceBeta(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RegistryNamespaceBetaState, opts ...pulumi.ResourceOption) (*RegistryNamespaceBeta, error) {
	var resource RegistryNamespaceBeta
	err := ctx.ReadResource("scaleway:index/registryNamespaceBeta:RegistryNamespaceBeta", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RegistryNamespaceBeta resources.
type registryNamespaceBetaState struct {
	// The description of the container registry namespace.
	Description *string `pulumi:"description"`
	// The endpoint reachable by docker
	Endpoint *string `pulumi:"endpoint"`
	// Whether or not the registry images stored in the namespace should be downloadable publicly (docker pull).
	IsPublic *bool `pulumi:"isPublic"`
	// The unique name of the container registry namespace.
	Name *string `pulumi:"name"`
	// `organizationId`) The ID of the organization the registry is associated with.
	OrganizationId *string `pulumi:"organizationId"`
	// `region`). The region in which the container registry namespace should be created.
	Region *string `pulumi:"region"`
}

type RegistryNamespaceBetaState struct {
	// The description of the container registry namespace.
	Description pulumi.StringPtrInput
	// The endpoint reachable by docker
	Endpoint pulumi.StringPtrInput
	// Whether or not the registry images stored in the namespace should be downloadable publicly (docker pull).
	IsPublic pulumi.BoolPtrInput
	// The unique name of the container registry namespace.
	Name pulumi.StringPtrInput
	// `organizationId`) The ID of the organization the registry is associated with.
	OrganizationId pulumi.StringPtrInput
	// `region`). The region in which the container registry namespace should be created.
	Region pulumi.StringPtrInput
}

func (RegistryNamespaceBetaState) ElementType() reflect.Type {
	return reflect.TypeOf((*registryNamespaceBetaState)(nil)).Elem()
}

type registryNamespaceBetaArgs struct {
	// The description of the container registry namespace.
	Description *string `pulumi:"description"`
	// Whether or not the registry images stored in the namespace should be downloadable publicly (docker pull).
	IsPublic *bool `pulumi:"isPublic"`
	// The unique name of the container registry namespace.
	Name *string `pulumi:"name"`
	// `organizationId`) The ID of the organization the registry is associated with.
	OrganizationId *string `pulumi:"organizationId"`
	// `region`). The region in which the container registry namespace should be created.
	Region *string `pulumi:"region"`
}

// The set of arguments for constructing a RegistryNamespaceBeta resource.
type RegistryNamespaceBetaArgs struct {
	// The description of the container registry namespace.
	Description pulumi.StringPtrInput
	// Whether or not the registry images stored in the namespace should be downloadable publicly (docker pull).
	IsPublic pulumi.BoolPtrInput
	// The unique name of the container registry namespace.
	Name pulumi.StringPtrInput
	// `organizationId`) The ID of the organization the registry is associated with.
	OrganizationId pulumi.StringPtrInput
	// `region`). The region in which the container registry namespace should be created.
	Region pulumi.StringPtrInput
}

func (RegistryNamespaceBetaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*registryNamespaceBetaArgs)(nil)).Elem()
}
