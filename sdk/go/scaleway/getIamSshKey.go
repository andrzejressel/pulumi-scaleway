// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package scaleway

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get SSH key information based on its ID or name.
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
//			_, err = scaleway.LookupIamSshKey(ctx, &scaleway.LookupIamSshKeyArgs{
//				SshKeyId: pulumi.StringRef("11111111-1111-1111-1111-111111111111"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupIamSshKey(ctx *pulumi.Context, args *LookupIamSshKeyArgs, opts ...pulumi.InvokeOption) (*LookupIamSshKeyResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupIamSshKeyResult
	err := ctx.Invoke("scaleway:index/getIamSshKey:getIamSshKey", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getIamSshKey.
type LookupIamSshKeyArgs struct {
	// The SSH key name. Only one of `name` and `sshKeyId` should be specified.
	Name *string `pulumi:"name"`
	// The SSH key id. Only one of `name` and `sshKeyId` should be specified.
	SshKeyId *string `pulumi:"sshKeyId"`
}

// A collection of values returned by getIamSshKey.
type LookupIamSshKeyResult struct {
	// The date and time of the creation of the SSH key.
	CreatedAt string `pulumi:"createdAt"`
	// The SSH key status.
	Disabled    bool   `pulumi:"disabled"`
	Fingerprint string `pulumi:"fingerprint"`
	// The provider-assigned unique ID for this managed resource.
	Id   string  `pulumi:"id"`
	Name *string `pulumi:"name"`
	// The ID of the organization the SSH key is associated with.
	OrganizationId string `pulumi:"organizationId"`
	ProjectId      string `pulumi:"projectId"`
	// The SSH public key string
	PublicKey string  `pulumi:"publicKey"`
	SshKeyId  *string `pulumi:"sshKeyId"`
	// The date and time of the last update of the SSH key.
	UpdatedAt string `pulumi:"updatedAt"`
}

func LookupIamSshKeyOutput(ctx *pulumi.Context, args LookupIamSshKeyOutputArgs, opts ...pulumi.InvokeOption) LookupIamSshKeyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupIamSshKeyResult, error) {
			args := v.(LookupIamSshKeyArgs)
			r, err := LookupIamSshKey(ctx, &args, opts...)
			var s LookupIamSshKeyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupIamSshKeyResultOutput)
}

// A collection of arguments for invoking getIamSshKey.
type LookupIamSshKeyOutputArgs struct {
	// The SSH key name. Only one of `name` and `sshKeyId` should be specified.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// The SSH key id. Only one of `name` and `sshKeyId` should be specified.
	SshKeyId pulumi.StringPtrInput `pulumi:"sshKeyId"`
}

func (LookupIamSshKeyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupIamSshKeyArgs)(nil)).Elem()
}

// A collection of values returned by getIamSshKey.
type LookupIamSshKeyResultOutput struct{ *pulumi.OutputState }

func (LookupIamSshKeyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupIamSshKeyResult)(nil)).Elem()
}

func (o LookupIamSshKeyResultOutput) ToLookupIamSshKeyResultOutput() LookupIamSshKeyResultOutput {
	return o
}

func (o LookupIamSshKeyResultOutput) ToLookupIamSshKeyResultOutputWithContext(ctx context.Context) LookupIamSshKeyResultOutput {
	return o
}

// The date and time of the creation of the SSH key.
func (o LookupIamSshKeyResultOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIamSshKeyResult) string { return v.CreatedAt }).(pulumi.StringOutput)
}

// The SSH key status.
func (o LookupIamSshKeyResultOutput) Disabled() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupIamSshKeyResult) bool { return v.Disabled }).(pulumi.BoolOutput)
}

func (o LookupIamSshKeyResultOutput) Fingerprint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIamSshKeyResult) string { return v.Fingerprint }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupIamSshKeyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIamSshKeyResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupIamSshKeyResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupIamSshKeyResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// The ID of the organization the SSH key is associated with.
func (o LookupIamSshKeyResultOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIamSshKeyResult) string { return v.OrganizationId }).(pulumi.StringOutput)
}

func (o LookupIamSshKeyResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIamSshKeyResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

// The SSH public key string
func (o LookupIamSshKeyResultOutput) PublicKey() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIamSshKeyResult) string { return v.PublicKey }).(pulumi.StringOutput)
}

func (o LookupIamSshKeyResultOutput) SshKeyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupIamSshKeyResult) *string { return v.SshKeyId }).(pulumi.StringPtrOutput)
}

// The date and time of the last update of the SSH key.
func (o LookupIamSshKeyResultOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v LookupIamSshKeyResult) string { return v.UpdatedAt }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupIamSshKeyResultOutput{})
}
