// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package scaleway

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Gets information about a baremetal option.
// For more information, see [the documentation](https://developers.scaleway.com/en/products/baremetal/api).
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
//			_, err = scaleway.GetBaremetalOption(ctx, &GetBaremetalOptionArgs{
//				Name: pulumi.StringRef("Remote Access"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = scaleway.GetBaremetalOption(ctx, &GetBaremetalOptionArgs{
//				OptionId: pulumi.StringRef("931df052-d713-4674-8b58-96a63244c8e2"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetBaremetalOption(ctx *pulumi.Context, args *GetBaremetalOptionArgs, opts ...pulumi.InvokeOption) (*GetBaremetalOptionResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetBaremetalOptionResult
	err := ctx.Invoke("scaleway:index/getBaremetalOption:getBaremetalOption", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getBaremetalOption.
type GetBaremetalOptionArgs struct {
	// The option name. Only one of `name` and `optionId` should be specified.
	Name *string `pulumi:"name"`
	// The option id. Only one of `name` and `optionId` should be specified.
	OptionId *string `pulumi:"optionId"`
	// `zone`) The zone in which the option exists.
	Zone *string `pulumi:"zone"`
}

// A collection of values returned by getBaremetalOption.
type GetBaremetalOptionResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Is false if the option could not be added or removed.
	Manageable bool `pulumi:"manageable"`
	// The name of the option.
	Name     *string `pulumi:"name"`
	OptionId *string `pulumi:"optionId"`
	Zone     string  `pulumi:"zone"`
}

func GetBaremetalOptionOutput(ctx *pulumi.Context, args GetBaremetalOptionOutputArgs, opts ...pulumi.InvokeOption) GetBaremetalOptionResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetBaremetalOptionResult, error) {
			args := v.(GetBaremetalOptionArgs)
			r, err := GetBaremetalOption(ctx, &args, opts...)
			var s GetBaremetalOptionResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetBaremetalOptionResultOutput)
}

// A collection of arguments for invoking getBaremetalOption.
type GetBaremetalOptionOutputArgs struct {
	// The option name. Only one of `name` and `optionId` should be specified.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// The option id. Only one of `name` and `optionId` should be specified.
	OptionId pulumi.StringPtrInput `pulumi:"optionId"`
	// `zone`) The zone in which the option exists.
	Zone pulumi.StringPtrInput `pulumi:"zone"`
}

func (GetBaremetalOptionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBaremetalOptionArgs)(nil)).Elem()
}

// A collection of values returned by getBaremetalOption.
type GetBaremetalOptionResultOutput struct{ *pulumi.OutputState }

func (GetBaremetalOptionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetBaremetalOptionResult)(nil)).Elem()
}

func (o GetBaremetalOptionResultOutput) ToGetBaremetalOptionResultOutput() GetBaremetalOptionResultOutput {
	return o
}

func (o GetBaremetalOptionResultOutput) ToGetBaremetalOptionResultOutputWithContext(ctx context.Context) GetBaremetalOptionResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetBaremetalOptionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetBaremetalOptionResult) string { return v.Id }).(pulumi.StringOutput)
}

// Is false if the option could not be added or removed.
func (o GetBaremetalOptionResultOutput) Manageable() pulumi.BoolOutput {
	return o.ApplyT(func(v GetBaremetalOptionResult) bool { return v.Manageable }).(pulumi.BoolOutput)
}

// The name of the option.
func (o GetBaremetalOptionResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBaremetalOptionResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

func (o GetBaremetalOptionResultOutput) OptionId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetBaremetalOptionResult) *string { return v.OptionId }).(pulumi.StringPtrOutput)
}

func (o GetBaremetalOptionResultOutput) Zone() pulumi.StringOutput {
	return o.ApplyT(func(v GetBaremetalOptionResult) string { return v.Zone }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetBaremetalOptionResultOutput{})
}
