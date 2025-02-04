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

// Creates and manages Scaleway Messaging and queuing SQS Credentials.
// For further information please check
// our [documentation](https://www.scaleway.com/en/docs/serverless/messaging/reference-content/sqs-overview/)
//
// ## Examples
//
// ### Basic
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
//			mainMnqSqs, err := scaleway.NewMnqSqs(ctx, "mainMnqSqs", nil)
//			if err != nil {
//				return err
//			}
//			_, err = scaleway.NewMnqSqsCredentials(ctx, "mainMnqSqsCredentials", &scaleway.MnqSqsCredentialsArgs{
//				ProjectId: mainMnqSqs.ProjectId,
//				Permissions: &scaleway.MnqSqsCredentialsPermissionsArgs{
//					CanManage:  pulumi.Bool(false),
//					CanReceive: pulumi.Bool(true),
//					CanPublish: pulumi.Bool(false),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// SQS credentials can be imported using the `{region}/{id}`, e.g. bash
//
// ```sh
//
//	$ pulumi import scaleway:index/mnqSqsCredentials:MnqSqsCredentials main fr-par/11111111111111111111111111111111
//
// ```
type MnqSqsCredentials struct {
	pulumi.CustomResourceState

	// The ID of the key.
	AccessKey pulumi.StringOutput `pulumi:"accessKey"`
	// The unique name of the sqs credentials.
	Name pulumi.StringOutput `pulumi:"name"`
	// . List of permissions associated to these credentials. Only one of permissions may be set.
	Permissions MnqSqsCredentialsPermissionsOutput `pulumi:"permissions"`
	// `projectId`) The ID of the project the sqs is enabled for.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// `region`). The region in which sqs is enabled.
	Region pulumi.StringOutput `pulumi:"region"`
	// The secret value of the key.
	SecretKey pulumi.StringOutput `pulumi:"secretKey"`
}

// NewMnqSqsCredentials registers a new resource with the given unique name, arguments, and options.
func NewMnqSqsCredentials(ctx *pulumi.Context,
	name string, args *MnqSqsCredentialsArgs, opts ...pulumi.ResourceOption) (*MnqSqsCredentials, error) {
	if args == nil {
		args = &MnqSqsCredentialsArgs{}
	}

	secrets := pulumi.AdditionalSecretOutputs([]string{
		"accessKey",
		"secretKey",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MnqSqsCredentials
	err := ctx.RegisterResource("scaleway:index/mnqSqsCredentials:MnqSqsCredentials", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMnqSqsCredentials gets an existing MnqSqsCredentials resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMnqSqsCredentials(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MnqSqsCredentialsState, opts ...pulumi.ResourceOption) (*MnqSqsCredentials, error) {
	var resource MnqSqsCredentials
	err := ctx.ReadResource("scaleway:index/mnqSqsCredentials:MnqSqsCredentials", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MnqSqsCredentials resources.
type mnqSqsCredentialsState struct {
	// The ID of the key.
	AccessKey *string `pulumi:"accessKey"`
	// The unique name of the sqs credentials.
	Name *string `pulumi:"name"`
	// . List of permissions associated to these credentials. Only one of permissions may be set.
	Permissions *MnqSqsCredentialsPermissions `pulumi:"permissions"`
	// `projectId`) The ID of the project the sqs is enabled for.
	ProjectId *string `pulumi:"projectId"`
	// `region`). The region in which sqs is enabled.
	Region *string `pulumi:"region"`
	// The secret value of the key.
	SecretKey *string `pulumi:"secretKey"`
}

type MnqSqsCredentialsState struct {
	// The ID of the key.
	AccessKey pulumi.StringPtrInput
	// The unique name of the sqs credentials.
	Name pulumi.StringPtrInput
	// . List of permissions associated to these credentials. Only one of permissions may be set.
	Permissions MnqSqsCredentialsPermissionsPtrInput
	// `projectId`) The ID of the project the sqs is enabled for.
	ProjectId pulumi.StringPtrInput
	// `region`). The region in which sqs is enabled.
	Region pulumi.StringPtrInput
	// The secret value of the key.
	SecretKey pulumi.StringPtrInput
}

func (MnqSqsCredentialsState) ElementType() reflect.Type {
	return reflect.TypeOf((*mnqSqsCredentialsState)(nil)).Elem()
}

type mnqSqsCredentialsArgs struct {
	// The unique name of the sqs credentials.
	Name *string `pulumi:"name"`
	// . List of permissions associated to these credentials. Only one of permissions may be set.
	Permissions *MnqSqsCredentialsPermissions `pulumi:"permissions"`
	// `projectId`) The ID of the project the sqs is enabled for.
	ProjectId *string `pulumi:"projectId"`
	// `region`). The region in which sqs is enabled.
	Region *string `pulumi:"region"`
}

// The set of arguments for constructing a MnqSqsCredentials resource.
type MnqSqsCredentialsArgs struct {
	// The unique name of the sqs credentials.
	Name pulumi.StringPtrInput
	// . List of permissions associated to these credentials. Only one of permissions may be set.
	Permissions MnqSqsCredentialsPermissionsPtrInput
	// `projectId`) The ID of the project the sqs is enabled for.
	ProjectId pulumi.StringPtrInput
	// `region`). The region in which sqs is enabled.
	Region pulumi.StringPtrInput
}

func (MnqSqsCredentialsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*mnqSqsCredentialsArgs)(nil)).Elem()
}

type MnqSqsCredentialsInput interface {
	pulumi.Input

	ToMnqSqsCredentialsOutput() MnqSqsCredentialsOutput
	ToMnqSqsCredentialsOutputWithContext(ctx context.Context) MnqSqsCredentialsOutput
}

func (*MnqSqsCredentials) ElementType() reflect.Type {
	return reflect.TypeOf((**MnqSqsCredentials)(nil)).Elem()
}

func (i *MnqSqsCredentials) ToMnqSqsCredentialsOutput() MnqSqsCredentialsOutput {
	return i.ToMnqSqsCredentialsOutputWithContext(context.Background())
}

func (i *MnqSqsCredentials) ToMnqSqsCredentialsOutputWithContext(ctx context.Context) MnqSqsCredentialsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MnqSqsCredentialsOutput)
}

func (i *MnqSqsCredentials) ToOutput(ctx context.Context) pulumix.Output[*MnqSqsCredentials] {
	return pulumix.Output[*MnqSqsCredentials]{
		OutputState: i.ToMnqSqsCredentialsOutputWithContext(ctx).OutputState,
	}
}

// MnqSqsCredentialsArrayInput is an input type that accepts MnqSqsCredentialsArray and MnqSqsCredentialsArrayOutput values.
// You can construct a concrete instance of `MnqSqsCredentialsArrayInput` via:
//
//	MnqSqsCredentialsArray{ MnqSqsCredentialsArgs{...} }
type MnqSqsCredentialsArrayInput interface {
	pulumi.Input

	ToMnqSqsCredentialsArrayOutput() MnqSqsCredentialsArrayOutput
	ToMnqSqsCredentialsArrayOutputWithContext(context.Context) MnqSqsCredentialsArrayOutput
}

type MnqSqsCredentialsArray []MnqSqsCredentialsInput

func (MnqSqsCredentialsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MnqSqsCredentials)(nil)).Elem()
}

func (i MnqSqsCredentialsArray) ToMnqSqsCredentialsArrayOutput() MnqSqsCredentialsArrayOutput {
	return i.ToMnqSqsCredentialsArrayOutputWithContext(context.Background())
}

func (i MnqSqsCredentialsArray) ToMnqSqsCredentialsArrayOutputWithContext(ctx context.Context) MnqSqsCredentialsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MnqSqsCredentialsArrayOutput)
}

func (i MnqSqsCredentialsArray) ToOutput(ctx context.Context) pulumix.Output[[]*MnqSqsCredentials] {
	return pulumix.Output[[]*MnqSqsCredentials]{
		OutputState: i.ToMnqSqsCredentialsArrayOutputWithContext(ctx).OutputState,
	}
}

// MnqSqsCredentialsMapInput is an input type that accepts MnqSqsCredentialsMap and MnqSqsCredentialsMapOutput values.
// You can construct a concrete instance of `MnqSqsCredentialsMapInput` via:
//
//	MnqSqsCredentialsMap{ "key": MnqSqsCredentialsArgs{...} }
type MnqSqsCredentialsMapInput interface {
	pulumi.Input

	ToMnqSqsCredentialsMapOutput() MnqSqsCredentialsMapOutput
	ToMnqSqsCredentialsMapOutputWithContext(context.Context) MnqSqsCredentialsMapOutput
}

type MnqSqsCredentialsMap map[string]MnqSqsCredentialsInput

func (MnqSqsCredentialsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MnqSqsCredentials)(nil)).Elem()
}

func (i MnqSqsCredentialsMap) ToMnqSqsCredentialsMapOutput() MnqSqsCredentialsMapOutput {
	return i.ToMnqSqsCredentialsMapOutputWithContext(context.Background())
}

func (i MnqSqsCredentialsMap) ToMnqSqsCredentialsMapOutputWithContext(ctx context.Context) MnqSqsCredentialsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MnqSqsCredentialsMapOutput)
}

func (i MnqSqsCredentialsMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*MnqSqsCredentials] {
	return pulumix.Output[map[string]*MnqSqsCredentials]{
		OutputState: i.ToMnqSqsCredentialsMapOutputWithContext(ctx).OutputState,
	}
}

type MnqSqsCredentialsOutput struct{ *pulumi.OutputState }

func (MnqSqsCredentialsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MnqSqsCredentials)(nil)).Elem()
}

func (o MnqSqsCredentialsOutput) ToMnqSqsCredentialsOutput() MnqSqsCredentialsOutput {
	return o
}

func (o MnqSqsCredentialsOutput) ToMnqSqsCredentialsOutputWithContext(ctx context.Context) MnqSqsCredentialsOutput {
	return o
}

func (o MnqSqsCredentialsOutput) ToOutput(ctx context.Context) pulumix.Output[*MnqSqsCredentials] {
	return pulumix.Output[*MnqSqsCredentials]{
		OutputState: o.OutputState,
	}
}

// The ID of the key.
func (o MnqSqsCredentialsOutput) AccessKey() pulumi.StringOutput {
	return o.ApplyT(func(v *MnqSqsCredentials) pulumi.StringOutput { return v.AccessKey }).(pulumi.StringOutput)
}

// The unique name of the sqs credentials.
func (o MnqSqsCredentialsOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *MnqSqsCredentials) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// . List of permissions associated to these credentials. Only one of permissions may be set.
func (o MnqSqsCredentialsOutput) Permissions() MnqSqsCredentialsPermissionsOutput {
	return o.ApplyT(func(v *MnqSqsCredentials) MnqSqsCredentialsPermissionsOutput { return v.Permissions }).(MnqSqsCredentialsPermissionsOutput)
}

// `projectId`) The ID of the project the sqs is enabled for.
func (o MnqSqsCredentialsOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *MnqSqsCredentials) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// `region`). The region in which sqs is enabled.
func (o MnqSqsCredentialsOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *MnqSqsCredentials) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// The secret value of the key.
func (o MnqSqsCredentialsOutput) SecretKey() pulumi.StringOutput {
	return o.ApplyT(func(v *MnqSqsCredentials) pulumi.StringOutput { return v.SecretKey }).(pulumi.StringOutput)
}

type MnqSqsCredentialsArrayOutput struct{ *pulumi.OutputState }

func (MnqSqsCredentialsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MnqSqsCredentials)(nil)).Elem()
}

func (o MnqSqsCredentialsArrayOutput) ToMnqSqsCredentialsArrayOutput() MnqSqsCredentialsArrayOutput {
	return o
}

func (o MnqSqsCredentialsArrayOutput) ToMnqSqsCredentialsArrayOutputWithContext(ctx context.Context) MnqSqsCredentialsArrayOutput {
	return o
}

func (o MnqSqsCredentialsArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*MnqSqsCredentials] {
	return pulumix.Output[[]*MnqSqsCredentials]{
		OutputState: o.OutputState,
	}
}

func (o MnqSqsCredentialsArrayOutput) Index(i pulumi.IntInput) MnqSqsCredentialsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MnqSqsCredentials {
		return vs[0].([]*MnqSqsCredentials)[vs[1].(int)]
	}).(MnqSqsCredentialsOutput)
}

type MnqSqsCredentialsMapOutput struct{ *pulumi.OutputState }

func (MnqSqsCredentialsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MnqSqsCredentials)(nil)).Elem()
}

func (o MnqSqsCredentialsMapOutput) ToMnqSqsCredentialsMapOutput() MnqSqsCredentialsMapOutput {
	return o
}

func (o MnqSqsCredentialsMapOutput) ToMnqSqsCredentialsMapOutputWithContext(ctx context.Context) MnqSqsCredentialsMapOutput {
	return o
}

func (o MnqSqsCredentialsMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*MnqSqsCredentials] {
	return pulumix.Output[map[string]*MnqSqsCredentials]{
		OutputState: o.OutputState,
	}
}

func (o MnqSqsCredentialsMapOutput) MapIndex(k pulumi.StringInput) MnqSqsCredentialsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MnqSqsCredentials {
		return vs[0].(map[string]*MnqSqsCredentials)[vs[1].(string)]
	}).(MnqSqsCredentialsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MnqSqsCredentialsInput)(nil)).Elem(), &MnqSqsCredentials{})
	pulumi.RegisterInputType(reflect.TypeOf((*MnqSqsCredentialsArrayInput)(nil)).Elem(), MnqSqsCredentialsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MnqSqsCredentialsMapInput)(nil)).Elem(), MnqSqsCredentialsMap{})
	pulumi.RegisterOutputType(MnqSqsCredentialsOutput{})
	pulumi.RegisterOutputType(MnqSqsCredentialsArrayOutput{})
	pulumi.RegisterOutputType(MnqSqsCredentialsMapOutput{})
}
