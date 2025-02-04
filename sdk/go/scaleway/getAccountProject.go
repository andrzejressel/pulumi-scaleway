// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package scaleway

import (
	"context"
	"reflect"

	"github.com/lbrlabs/pulumi-scaleway/sdk/go/scaleway/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Gets information about an existing Project.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-scaleway/sdk/go/scaleway"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := scaleway.LookupAccountProject(ctx, &scaleway.LookupAccountProjectArgs{
//				Name: pulumi.StringRef("default"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = scaleway.LookupAccountProject(ctx, &scaleway.LookupAccountProjectArgs{
//				ProjectId: pulumi.StringRef("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupAccountProject(ctx *pulumi.Context, args *LookupAccountProjectArgs, opts ...pulumi.InvokeOption) (*LookupAccountProjectResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAccountProjectResult
	err := ctx.Invoke("scaleway:index/getAccountProject:getAccountProject", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccountProject.
type LookupAccountProjectArgs struct {
	// The name of the Project.
	// Only one of the `name` and `projectId` should be specified.
	Name *string `pulumi:"name"`
	// The organization ID the Project is associated with.
	// If no default organizationId is set, one must be set explicitly in this datasource
	OrganizationId *string `pulumi:"organizationId"`
	// The ID of the Project.
	// Only one of the `name` and `projectId` should be specified.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getAccountProject.
type LookupAccountProjectResult struct {
	CreatedAt   string `pulumi:"createdAt"`
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id             string  `pulumi:"id"`
	Name           *string `pulumi:"name"`
	OrganizationId *string `pulumi:"organizationId"`
	ProjectId      string  `pulumi:"projectId"`
	UpdatedAt      string  `pulumi:"updatedAt"`
}

func LookupAccountProjectOutput(ctx *pulumi.Context, args LookupAccountProjectOutputArgs, opts ...pulumi.InvokeOption) LookupAccountProjectResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAccountProjectResult, error) {
			args := v.(LookupAccountProjectArgs)
			r, err := LookupAccountProject(ctx, &args, opts...)
			var s LookupAccountProjectResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAccountProjectResultOutput)
}

// A collection of arguments for invoking getAccountProject.
type LookupAccountProjectOutputArgs struct {
	// The name of the Project.
	// Only one of the `name` and `projectId` should be specified.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// The organization ID the Project is associated with.
	// If no default organizationId is set, one must be set explicitly in this datasource
	OrganizationId pulumi.StringPtrInput `pulumi:"organizationId"`
	// The ID of the Project.
	// Only one of the `name` and `projectId` should be specified.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupAccountProjectOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAccountProjectArgs)(nil)).Elem()
}

// A collection of values returned by getAccountProject.
type LookupAccountProjectResultOutput struct{ *pulumi.OutputState }

func (LookupAccountProjectResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAccountProjectResult)(nil)).Elem()
}

func (o LookupAccountProjectResultOutput) ToLookupAccountProjectResultOutput() LookupAccountProjectResultOutput {
	return o
}

func (o LookupAccountProjectResultOutput) ToLookupAccountProjectResultOutputWithContext(ctx context.Context) LookupAccountProjectResultOutput {
	return o
}

func (o LookupAccountProjectResultOutput) ToOutput(ctx context.Context) pulumix.Output[LookupAccountProjectResult] {
	return pulumix.Output[LookupAccountProjectResult]{
		OutputState: o.OutputState,
	}
}

func (o LookupAccountProjectResultOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountProjectResult) string { return v.CreatedAt }).(pulumi.StringOutput)
}

func (o LookupAccountProjectResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountProjectResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAccountProjectResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountProjectResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupAccountProjectResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAccountProjectResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

func (o LookupAccountProjectResultOutput) OrganizationId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAccountProjectResult) *string { return v.OrganizationId }).(pulumi.StringPtrOutput)
}

func (o LookupAccountProjectResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountProjectResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func (o LookupAccountProjectResultOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAccountProjectResult) string { return v.UpdatedAt }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAccountProjectResultOutput{})
}
