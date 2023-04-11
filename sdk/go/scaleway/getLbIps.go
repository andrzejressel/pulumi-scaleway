// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package scaleway

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Gets information about multiple Load Balancer IPs.
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
//			_, err := scaleway.GetLbIps(ctx, &scaleway.GetLbIpsArgs{
//				IpCidrRange: pulumi.StringRef("0.0.0.0/0"),
//				Zone:        pulumi.StringRef("fr-par-2"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetLbIps(ctx *pulumi.Context, args *GetLbIpsArgs, opts ...pulumi.InvokeOption) (*GetLbIpsResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetLbIpsResult
	err := ctx.Invoke("scaleway:index/getLbIps:getLbIps", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getLbIps.
type GetLbIpsArgs struct {
	// The IP CIDR range used as a filter. IPs within a CIDR block like it are listed.
	IpCidrRange *string `pulumi:"ipCidrRange"`
	// The ID of the project the load-balancer is associated with.
	ProjectId *string `pulumi:"projectId"`
	// `zone`) The zone in which IPs exist.
	Zone *string `pulumi:"zone"`
}

// A collection of values returned by getLbIps.
type GetLbIpsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id          string  `pulumi:"id"`
	IpCidrRange *string `pulumi:"ipCidrRange"`
	// List of found IPs
	Ips []GetLbIpsIp `pulumi:"ips"`
	// The organization ID the load-balancer is associated with.
	OrganizationId string `pulumi:"organizationId"`
	// The ID of the project the load-balancer is associated with.
	ProjectId string `pulumi:"projectId"`
	// The zone in which the load-balancer is.
	Zone string `pulumi:"zone"`
}

func GetLbIpsOutput(ctx *pulumi.Context, args GetLbIpsOutputArgs, opts ...pulumi.InvokeOption) GetLbIpsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetLbIpsResult, error) {
			args := v.(GetLbIpsArgs)
			r, err := GetLbIps(ctx, &args, opts...)
			var s GetLbIpsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetLbIpsResultOutput)
}

// A collection of arguments for invoking getLbIps.
type GetLbIpsOutputArgs struct {
	// The IP CIDR range used as a filter. IPs within a CIDR block like it are listed.
	IpCidrRange pulumi.StringPtrInput `pulumi:"ipCidrRange"`
	// The ID of the project the load-balancer is associated with.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
	// `zone`) The zone in which IPs exist.
	Zone pulumi.StringPtrInput `pulumi:"zone"`
}

func (GetLbIpsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLbIpsArgs)(nil)).Elem()
}

// A collection of values returned by getLbIps.
type GetLbIpsResultOutput struct{ *pulumi.OutputState }

func (GetLbIpsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetLbIpsResult)(nil)).Elem()
}

func (o GetLbIpsResultOutput) ToGetLbIpsResultOutput() GetLbIpsResultOutput {
	return o
}

func (o GetLbIpsResultOutput) ToGetLbIpsResultOutputWithContext(ctx context.Context) GetLbIpsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetLbIpsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetLbIpsResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetLbIpsResultOutput) IpCidrRange() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetLbIpsResult) *string { return v.IpCidrRange }).(pulumi.StringPtrOutput)
}

// List of found IPs
func (o GetLbIpsResultOutput) Ips() GetLbIpsIpArrayOutput {
	return o.ApplyT(func(v GetLbIpsResult) []GetLbIpsIp { return v.Ips }).(GetLbIpsIpArrayOutput)
}

// The organization ID the load-balancer is associated with.
func (o GetLbIpsResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v GetLbIpsResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

// The ID of the project the load-balancer is associated with.
func (o GetLbIpsResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v GetLbIpsResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// The zone in which the load-balancer is.
func (o GetLbIpsResultOutput) Zone() pulumi.StringOutput {
	return o.ApplyT(func(v GetLbIpsResult) string { return v.Zone }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetLbIpsResultOutput{})
}
