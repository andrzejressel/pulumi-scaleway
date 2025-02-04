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

// Gets information about multiple Load Balancer Routes.
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
//			_, err := scaleway.GetLbRoutes(ctx, &scaleway.GetLbRoutesArgs{
//				FrontendId: pulumi.StringRef(scaleway_lb_frontend.Frt01.Id),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = scaleway.GetLbRoutes(ctx, &scaleway.GetLbRoutesArgs{
//				FrontendId: pulumi.StringRef("11111111-1111-1111-1111-111111111111"),
//				Zone:       pulumi.StringRef("fr-par-2"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetLbRoutes(ctx *pulumi.Context, args *GetLbRoutesArgs, opts ...pulumi.InvokeOption) (*GetLbRoutesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetLbRoutesResult
	err := ctx.Invoke("scaleway:index/getLbRoutes:getLbRoutes", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLbRoutes.
type GetLbRoutesArgs struct {
	// The frontend ID origin of redirection used as a filter. routes with a frontend ID like it are listed.
	FrontendId *string `pulumi:"frontendId"`
	ProjectId  *string `pulumi:"projectId"`
	// `zone`) The zone in which routes exist.
	Zone *string `pulumi:"zone"`
}

// A collection of values returned by getLbRoutes.
type GetLbRoutesResult struct {
	FrontendId *string `pulumi:"frontendId"`
	// The provider-assigned unique ID for this managed resource.
	Id             string `pulumi:"id"`
	OrganizationId string `pulumi:"organizationId"`
	ProjectId      string `pulumi:"projectId"`
	// List of found routes
	Routes []GetLbRoutesRoute `pulumi:"routes"`
	Zone   string             `pulumi:"zone"`
}

func GetLbRoutesOutput(ctx *pulumi.Context, args GetLbRoutesOutputArgs, opts ...pulumi.InvokeOption) GetLbRoutesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetLbRoutesResult, error) {
			args := v.(GetLbRoutesArgs)
			r, err := GetLbRoutes(ctx, &args, opts...)
			var s GetLbRoutesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetLbRoutesResultOutput)
}

// A collection of arguments for invoking getLbRoutes.
type GetLbRoutesOutputArgs struct {
	// The frontend ID origin of redirection used as a filter. routes with a frontend ID like it are listed.
	FrontendId pulumi.StringPtrInput `pulumi:"frontendId"`
	ProjectId  pulumi.StringPtrInput `pulumi:"projectId"`
	// `zone`) The zone in which routes exist.
	Zone pulumi.StringPtrInput `pulumi:"zone"`
}

func (GetLbRoutesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLbRoutesArgs)(nil)).Elem()
}

// A collection of values returned by getLbRoutes.
type GetLbRoutesResultOutput struct{ *pulumi.OutputState }

func (GetLbRoutesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLbRoutesResult)(nil)).Elem()
}

func (o GetLbRoutesResultOutput) ToGetLbRoutesResultOutput() GetLbRoutesResultOutput {
	return o
}

func (o GetLbRoutesResultOutput) ToGetLbRoutesResultOutputWithContext(ctx context.Context) GetLbRoutesResultOutput {
	return o
}

func (o GetLbRoutesResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetLbRoutesResult] {
	return pulumix.Output[GetLbRoutesResult]{
		OutputState: o.OutputState,
	}
}

func (o GetLbRoutesResultOutput) FrontendId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetLbRoutesResult) *string { return v.FrontendId }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetLbRoutesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetLbRoutesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetLbRoutesResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v GetLbRoutesResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

func (o GetLbRoutesResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v GetLbRoutesResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// List of found routes
func (o GetLbRoutesResultOutput) Routes() GetLbRoutesRouteArrayOutput {
	return o.ApplyT(func(v GetLbRoutesResult) []GetLbRoutesRoute { return v.Routes }).(GetLbRoutesRouteArrayOutput)
}

func (o GetLbRoutesResultOutput) Zone() pulumi.StringOutput {
	return o.ApplyT(func(v GetLbRoutesResult) string { return v.Zone }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetLbRoutesResultOutput{})
}
