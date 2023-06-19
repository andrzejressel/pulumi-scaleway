// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package scaleway

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get the available zones information based on its Region.
//
// For technical and legal reasons, some products are split by Region or by Availability Zones. When using such product,
// you can choose the location that better fits your need (country, latency, …).
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
//			_, err := scaleway.GetAvailabilityZones(ctx, &scaleway.GetAvailabilityZonesArgs{
//				Region: pulumi.StringRef("nl-ams"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetAvailabilityZones(ctx *pulumi.Context, args *GetAvailabilityZonesArgs, opts ...pulumi.InvokeOption) (*GetAvailabilityZonesResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetAvailabilityZonesResult
	err := ctx.Invoke("scaleway:index/getAvailabilityZones:getAvailabilityZones", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAvailabilityZones.
type GetAvailabilityZonesArgs struct {
	// Region is represented as a Geographical area such as France. Defaults: `fr-par`.
	Region *string `pulumi:"region"`
}

// A collection of values returned by getAvailabilityZones.
type GetAvailabilityZonesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id     string  `pulumi:"id"`
	Region *string `pulumi:"region"`
	// List of availability zones by regions
	Zones []string `pulumi:"zones"`
}

func GetAvailabilityZonesOutput(ctx *pulumi.Context, args GetAvailabilityZonesOutputArgs, opts ...pulumi.InvokeOption) GetAvailabilityZonesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAvailabilityZonesResult, error) {
			args := v.(GetAvailabilityZonesArgs)
			r, err := GetAvailabilityZones(ctx, &args, opts...)
			var s GetAvailabilityZonesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAvailabilityZonesResultOutput)
}

// A collection of arguments for invoking getAvailabilityZones.
type GetAvailabilityZonesOutputArgs struct {
	// Region is represented as a Geographical area such as France. Defaults: `fr-par`.
	Region pulumi.StringPtrInput `pulumi:"region"`
}

func (GetAvailabilityZonesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAvailabilityZonesArgs)(nil)).Elem()
}

// A collection of values returned by getAvailabilityZones.
type GetAvailabilityZonesResultOutput struct{ *pulumi.OutputState }

func (GetAvailabilityZonesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAvailabilityZonesResult)(nil)).Elem()
}

func (o GetAvailabilityZonesResultOutput) ToGetAvailabilityZonesResultOutput() GetAvailabilityZonesResultOutput {
	return o
}

func (o GetAvailabilityZonesResultOutput) ToGetAvailabilityZonesResultOutputWithContext(ctx context.Context) GetAvailabilityZonesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetAvailabilityZonesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAvailabilityZonesResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetAvailabilityZonesResultOutput) Region() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetAvailabilityZonesResult) *string { return v.Region }).(pulumi.StringPtrOutput)
}

// List of availability zones by regions
func (o GetAvailabilityZonesResultOutput) Zones() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAvailabilityZonesResult) []string { return v.Zones }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAvailabilityZonesResultOutput{})
}
