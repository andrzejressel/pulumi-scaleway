// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package scaleway

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates and manages Scaleway object storage bucket policy.
// For more information, see [the documentation](https://www.scaleway.com/en/docs/storage/object/api-cli/using-bucket-policies/).
//
// ## Import
//
// Buckets can be imported using the `{region}/{bucketName}` identifier, e.g. bash
//
// ```sh
//
//	$ pulumi import scaleway:index/objectBucketPolicy:ObjectBucketPolicy some_bucket fr-par/some-bucket
//
// ```
type ObjectBucketPolicy struct {
	pulumi.CustomResourceState

	// The name of the bucket.
	Bucket pulumi.StringOutput `pulumi:"bucket"`
	// The text of the policy.
	Policy pulumi.StringOutput `pulumi:"policy"`
	// `projectId`) The ID of the project the bucket is associated with.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// The Scaleway region this bucket resides in.
	Region pulumi.StringOutput `pulumi:"region"`
}

// NewObjectBucketPolicy registers a new resource with the given unique name, arguments, and options.
func NewObjectBucketPolicy(ctx *pulumi.Context,
	name string, args *ObjectBucketPolicyArgs, opts ...pulumi.ResourceOption) (*ObjectBucketPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Bucket == nil {
		return nil, errors.New("invalid value for required argument 'Bucket'")
	}
	if args.Policy == nil {
		return nil, errors.New("invalid value for required argument 'Policy'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource ObjectBucketPolicy
	err := ctx.RegisterResource("scaleway:index/objectBucketPolicy:ObjectBucketPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetObjectBucketPolicy gets an existing ObjectBucketPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetObjectBucketPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ObjectBucketPolicyState, opts ...pulumi.ResourceOption) (*ObjectBucketPolicy, error) {
	var resource ObjectBucketPolicy
	err := ctx.ReadResource("scaleway:index/objectBucketPolicy:ObjectBucketPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ObjectBucketPolicy resources.
type objectBucketPolicyState struct {
	// The name of the bucket.
	Bucket *string `pulumi:"bucket"`
	// The text of the policy.
	Policy *string `pulumi:"policy"`
	// `projectId`) The ID of the project the bucket is associated with.
	ProjectId *string `pulumi:"projectId"`
	// The Scaleway region this bucket resides in.
	Region *string `pulumi:"region"`
}

type ObjectBucketPolicyState struct {
	// The name of the bucket.
	Bucket pulumi.StringPtrInput
	// The text of the policy.
	Policy pulumi.StringPtrInput
	// `projectId`) The ID of the project the bucket is associated with.
	ProjectId pulumi.StringPtrInput
	// The Scaleway region this bucket resides in.
	Region pulumi.StringPtrInput
}

func (ObjectBucketPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*objectBucketPolicyState)(nil)).Elem()
}

type objectBucketPolicyArgs struct {
	// The name of the bucket.
	Bucket string `pulumi:"bucket"`
	// The text of the policy.
	Policy string `pulumi:"policy"`
	// `projectId`) The ID of the project the bucket is associated with.
	ProjectId *string `pulumi:"projectId"`
	// The Scaleway region this bucket resides in.
	Region *string `pulumi:"region"`
}

// The set of arguments for constructing a ObjectBucketPolicy resource.
type ObjectBucketPolicyArgs struct {
	// The name of the bucket.
	Bucket pulumi.StringInput
	// The text of the policy.
	Policy pulumi.StringInput
	// `projectId`) The ID of the project the bucket is associated with.
	ProjectId pulumi.StringPtrInput
	// The Scaleway region this bucket resides in.
	Region pulumi.StringPtrInput
}

func (ObjectBucketPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*objectBucketPolicyArgs)(nil)).Elem()
}

type ObjectBucketPolicyInput interface {
	pulumi.Input

	ToObjectBucketPolicyOutput() ObjectBucketPolicyOutput
	ToObjectBucketPolicyOutputWithContext(ctx context.Context) ObjectBucketPolicyOutput
}

func (*ObjectBucketPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**ObjectBucketPolicy)(nil)).Elem()
}

func (i *ObjectBucketPolicy) ToObjectBucketPolicyOutput() ObjectBucketPolicyOutput {
	return i.ToObjectBucketPolicyOutputWithContext(context.Background())
}

func (i *ObjectBucketPolicy) ToObjectBucketPolicyOutputWithContext(ctx context.Context) ObjectBucketPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObjectBucketPolicyOutput)
}

// ObjectBucketPolicyArrayInput is an input type that accepts ObjectBucketPolicyArray and ObjectBucketPolicyArrayOutput values.
// You can construct a concrete instance of `ObjectBucketPolicyArrayInput` via:
//
//	ObjectBucketPolicyArray{ ObjectBucketPolicyArgs{...} }
type ObjectBucketPolicyArrayInput interface {
	pulumi.Input

	ToObjectBucketPolicyArrayOutput() ObjectBucketPolicyArrayOutput
	ToObjectBucketPolicyArrayOutputWithContext(context.Context) ObjectBucketPolicyArrayOutput
}

type ObjectBucketPolicyArray []ObjectBucketPolicyInput

func (ObjectBucketPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ObjectBucketPolicy)(nil)).Elem()
}

func (i ObjectBucketPolicyArray) ToObjectBucketPolicyArrayOutput() ObjectBucketPolicyArrayOutput {
	return i.ToObjectBucketPolicyArrayOutputWithContext(context.Background())
}

func (i ObjectBucketPolicyArray) ToObjectBucketPolicyArrayOutputWithContext(ctx context.Context) ObjectBucketPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObjectBucketPolicyArrayOutput)
}

// ObjectBucketPolicyMapInput is an input type that accepts ObjectBucketPolicyMap and ObjectBucketPolicyMapOutput values.
// You can construct a concrete instance of `ObjectBucketPolicyMapInput` via:
//
//	ObjectBucketPolicyMap{ "key": ObjectBucketPolicyArgs{...} }
type ObjectBucketPolicyMapInput interface {
	pulumi.Input

	ToObjectBucketPolicyMapOutput() ObjectBucketPolicyMapOutput
	ToObjectBucketPolicyMapOutputWithContext(context.Context) ObjectBucketPolicyMapOutput
}

type ObjectBucketPolicyMap map[string]ObjectBucketPolicyInput

func (ObjectBucketPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ObjectBucketPolicy)(nil)).Elem()
}

func (i ObjectBucketPolicyMap) ToObjectBucketPolicyMapOutput() ObjectBucketPolicyMapOutput {
	return i.ToObjectBucketPolicyMapOutputWithContext(context.Background())
}

func (i ObjectBucketPolicyMap) ToObjectBucketPolicyMapOutputWithContext(ctx context.Context) ObjectBucketPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObjectBucketPolicyMapOutput)
}

type ObjectBucketPolicyOutput struct{ *pulumi.OutputState }

func (ObjectBucketPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ObjectBucketPolicy)(nil)).Elem()
}

func (o ObjectBucketPolicyOutput) ToObjectBucketPolicyOutput() ObjectBucketPolicyOutput {
	return o
}

func (o ObjectBucketPolicyOutput) ToObjectBucketPolicyOutputWithContext(ctx context.Context) ObjectBucketPolicyOutput {
	return o
}

// The name of the bucket.
func (o ObjectBucketPolicyOutput) Bucket() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectBucketPolicy) pulumi.StringOutput { return v.Bucket }).(pulumi.StringOutput)
}

// The text of the policy.
func (o ObjectBucketPolicyOutput) Policy() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectBucketPolicy) pulumi.StringOutput { return v.Policy }).(pulumi.StringOutput)
}

// `projectId`) The ID of the project the bucket is associated with.
func (o ObjectBucketPolicyOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectBucketPolicy) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// The Scaleway region this bucket resides in.
func (o ObjectBucketPolicyOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectBucketPolicy) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

type ObjectBucketPolicyArrayOutput struct{ *pulumi.OutputState }

func (ObjectBucketPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ObjectBucketPolicy)(nil)).Elem()
}

func (o ObjectBucketPolicyArrayOutput) ToObjectBucketPolicyArrayOutput() ObjectBucketPolicyArrayOutput {
	return o
}

func (o ObjectBucketPolicyArrayOutput) ToObjectBucketPolicyArrayOutputWithContext(ctx context.Context) ObjectBucketPolicyArrayOutput {
	return o
}

func (o ObjectBucketPolicyArrayOutput) Index(i pulumi.IntInput) ObjectBucketPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ObjectBucketPolicy {
		return vs[0].([]*ObjectBucketPolicy)[vs[1].(int)]
	}).(ObjectBucketPolicyOutput)
}

type ObjectBucketPolicyMapOutput struct{ *pulumi.OutputState }

func (ObjectBucketPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ObjectBucketPolicy)(nil)).Elem()
}

func (o ObjectBucketPolicyMapOutput) ToObjectBucketPolicyMapOutput() ObjectBucketPolicyMapOutput {
	return o
}

func (o ObjectBucketPolicyMapOutput) ToObjectBucketPolicyMapOutputWithContext(ctx context.Context) ObjectBucketPolicyMapOutput {
	return o
}

func (o ObjectBucketPolicyMapOutput) MapIndex(k pulumi.StringInput) ObjectBucketPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ObjectBucketPolicy {
		return vs[0].(map[string]*ObjectBucketPolicy)[vs[1].(string)]
	}).(ObjectBucketPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ObjectBucketPolicyInput)(nil)).Elem(), &ObjectBucketPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*ObjectBucketPolicyArrayInput)(nil)).Elem(), ObjectBucketPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ObjectBucketPolicyMapInput)(nil)).Elem(), ObjectBucketPolicyMap{})
	pulumi.RegisterOutputType(ObjectBucketPolicyOutput{})
	pulumi.RegisterOutputType(ObjectBucketPolicyArrayOutput{})
	pulumi.RegisterOutputType(ObjectBucketPolicyMapOutput{})
}
