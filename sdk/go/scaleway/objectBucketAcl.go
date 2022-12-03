// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package scaleway

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

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
//			_, err := scaleway.NewObjectBucket(ctx, "someBucket", nil)
//			if err != nil {
//				return err
//			}
//			_, err = scaleway.NewObjectBucketAcl(ctx, "main", &scaleway.ObjectBucketAclArgs{
//				Bucket: pulumi.Any(scaleway_object_bucket.Main.Name),
//				Acl:    pulumi.String("private"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ## Example with Grants
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
//			mainObjectBucket, err := scaleway.NewObjectBucket(ctx, "mainObjectBucket", nil)
//			if err != nil {
//				return err
//			}
//			_, err = scaleway.NewObjectBucketAcl(ctx, "mainObjectBucketAcl", &scaleway.ObjectBucketAclArgs{
//				Bucket: mainObjectBucket.Name,
//				AccessControlPolicy: &scaleway.ObjectBucketAclAccessControlPolicyArgs{
//					Grants: scaleway.ObjectBucketAclAccessControlPolicyGrantArray{
//						&scaleway.ObjectBucketAclAccessControlPolicyGrantArgs{
//							Grantee: &scaleway.ObjectBucketAclAccessControlPolicyGrantGranteeArgs{
//								Id:   pulumi.String("<project-id>:<project-id>"),
//								Type: pulumi.String("CanonicalUser"),
//							},
//							Permission: pulumi.String("FULL_CONTROL"),
//						},
//						&scaleway.ObjectBucketAclAccessControlPolicyGrantArgs{
//							Grantee: &scaleway.ObjectBucketAclAccessControlPolicyGrantGranteeArgs{
//								Id:   pulumi.String("<project-id>"),
//								Type: pulumi.String("CanonicalUser"),
//							},
//							Permission: pulumi.String("WRITE"),
//						},
//					},
//					Owner: &scaleway.ObjectBucketAclAccessControlPolicyOwnerArgs{
//						Id: pulumi.String("<project-id>"),
//					},
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
// ## The ACL
//
// Please check the [canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl_overview.html#canned-acl)
//
// ## The Access Control policy
//
// The `accessControlPolicy` configuration block supports the following arguments:
//
// * `grant` - (Required) Set of grant configuration blocks documented below.
// * `owner` - (Required) Configuration block of the bucket owner's display name and ID documented below.
//
// ## The Grant
//
// The `grant` configuration block supports the following arguments:
//
// * `grantee` - (Required) Configuration block for the project being granted permissions documented below.
// * `permission` - (Required) Logging permissions assigned to the grantee for the bucket.
//
// ## The permission
//
// The following list shows each access policy permissions supported.
//
// `READ`, `WRITE`, `READ_ACP`, `WRITE_ACP`, `FULL_CONTROL`
//
// For more information about ACL permissions in the S3 bucket, see [ACL permissions](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html).
//
// ## The owner
//
// The `owner` configuration block supports the following arguments:
//
// * `id` - (Required) The ID of the project owner.
// * `displayName` - (Optional) The display name of the owner.
//
// ## the grantee
//
// The `grantee` configuration block supports the following arguments:
//
// * `id` - (Required) The canonical user ID of the grantee.
// * `type` - (Required) Type of grantee. Valid values: CanonicalUser.
//
// ## Import
//
// Buckets can be imported using the `{region}/{bucketName}/{acl}` identifier, e.g. bash
//
// ```sh
//
//	$ pulumi import scaleway:index/objectBucketAcl:ObjectBucketAcl some_bucket fr-par/some-bucket
//
// ```
//
//	/private
type ObjectBucketAcl struct {
	pulumi.CustomResourceState

	// A configuration block that sets the ACL permissions for an object per grantee documented below.
	AccessControlPolicy ObjectBucketAclAccessControlPolicyOutput `pulumi:"accessControlPolicy"`
	// The canned ACL you want to apply to the bucket.
	Acl pulumi.StringPtrOutput `pulumi:"acl"`
	// The name of the bucket.
	Bucket pulumi.StringOutput `pulumi:"bucket"`
	// The project ID of the expected bucket owner.
	ExpectedBucketOwner pulumi.StringPtrOutput `pulumi:"expectedBucketOwner"`
	// The [region](https://developers.scaleway.com/en/quickstart/#region-definition) in which the bucket should be created.
	Region pulumi.StringOutput `pulumi:"region"`
}

// NewObjectBucketAcl registers a new resource with the given unique name, arguments, and options.
func NewObjectBucketAcl(ctx *pulumi.Context,
	name string, args *ObjectBucketAclArgs, opts ...pulumi.ResourceOption) (*ObjectBucketAcl, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Bucket == nil {
		return nil, errors.New("invalid value for required argument 'Bucket'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource ObjectBucketAcl
	err := ctx.RegisterResource("scaleway:index/objectBucketAcl:ObjectBucketAcl", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetObjectBucketAcl gets an existing ObjectBucketAcl resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetObjectBucketAcl(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ObjectBucketAclState, opts ...pulumi.ResourceOption) (*ObjectBucketAcl, error) {
	var resource ObjectBucketAcl
	err := ctx.ReadResource("scaleway:index/objectBucketAcl:ObjectBucketAcl", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ObjectBucketAcl resources.
type objectBucketAclState struct {
	// A configuration block that sets the ACL permissions for an object per grantee documented below.
	AccessControlPolicy *ObjectBucketAclAccessControlPolicy `pulumi:"accessControlPolicy"`
	// The canned ACL you want to apply to the bucket.
	Acl *string `pulumi:"acl"`
	// The name of the bucket.
	Bucket *string `pulumi:"bucket"`
	// The project ID of the expected bucket owner.
	ExpectedBucketOwner *string `pulumi:"expectedBucketOwner"`
	// The [region](https://developers.scaleway.com/en/quickstart/#region-definition) in which the bucket should be created.
	Region *string `pulumi:"region"`
}

type ObjectBucketAclState struct {
	// A configuration block that sets the ACL permissions for an object per grantee documented below.
	AccessControlPolicy ObjectBucketAclAccessControlPolicyPtrInput
	// The canned ACL you want to apply to the bucket.
	Acl pulumi.StringPtrInput
	// The name of the bucket.
	Bucket pulumi.StringPtrInput
	// The project ID of the expected bucket owner.
	ExpectedBucketOwner pulumi.StringPtrInput
	// The [region](https://developers.scaleway.com/en/quickstart/#region-definition) in which the bucket should be created.
	Region pulumi.StringPtrInput
}

func (ObjectBucketAclState) ElementType() reflect.Type {
	return reflect.TypeOf((*objectBucketAclState)(nil)).Elem()
}

type objectBucketAclArgs struct {
	// A configuration block that sets the ACL permissions for an object per grantee documented below.
	AccessControlPolicy *ObjectBucketAclAccessControlPolicy `pulumi:"accessControlPolicy"`
	// The canned ACL you want to apply to the bucket.
	Acl *string `pulumi:"acl"`
	// The name of the bucket.
	Bucket string `pulumi:"bucket"`
	// The project ID of the expected bucket owner.
	ExpectedBucketOwner *string `pulumi:"expectedBucketOwner"`
	// The [region](https://developers.scaleway.com/en/quickstart/#region-definition) in which the bucket should be created.
	Region *string `pulumi:"region"`
}

// The set of arguments for constructing a ObjectBucketAcl resource.
type ObjectBucketAclArgs struct {
	// A configuration block that sets the ACL permissions for an object per grantee documented below.
	AccessControlPolicy ObjectBucketAclAccessControlPolicyPtrInput
	// The canned ACL you want to apply to the bucket.
	Acl pulumi.StringPtrInput
	// The name of the bucket.
	Bucket pulumi.StringInput
	// The project ID of the expected bucket owner.
	ExpectedBucketOwner pulumi.StringPtrInput
	// The [region](https://developers.scaleway.com/en/quickstart/#region-definition) in which the bucket should be created.
	Region pulumi.StringPtrInput
}

func (ObjectBucketAclArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*objectBucketAclArgs)(nil)).Elem()
}

type ObjectBucketAclInput interface {
	pulumi.Input

	ToObjectBucketAclOutput() ObjectBucketAclOutput
	ToObjectBucketAclOutputWithContext(ctx context.Context) ObjectBucketAclOutput
}

func (*ObjectBucketAcl) ElementType() reflect.Type {
	return reflect.TypeOf((**ObjectBucketAcl)(nil)).Elem()
}

func (i *ObjectBucketAcl) ToObjectBucketAclOutput() ObjectBucketAclOutput {
	return i.ToObjectBucketAclOutputWithContext(context.Background())
}

func (i *ObjectBucketAcl) ToObjectBucketAclOutputWithContext(ctx context.Context) ObjectBucketAclOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObjectBucketAclOutput)
}

// ObjectBucketAclArrayInput is an input type that accepts ObjectBucketAclArray and ObjectBucketAclArrayOutput values.
// You can construct a concrete instance of `ObjectBucketAclArrayInput` via:
//
//	ObjectBucketAclArray{ ObjectBucketAclArgs{...} }
type ObjectBucketAclArrayInput interface {
	pulumi.Input

	ToObjectBucketAclArrayOutput() ObjectBucketAclArrayOutput
	ToObjectBucketAclArrayOutputWithContext(context.Context) ObjectBucketAclArrayOutput
}

type ObjectBucketAclArray []ObjectBucketAclInput

func (ObjectBucketAclArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ObjectBucketAcl)(nil)).Elem()
}

func (i ObjectBucketAclArray) ToObjectBucketAclArrayOutput() ObjectBucketAclArrayOutput {
	return i.ToObjectBucketAclArrayOutputWithContext(context.Background())
}

func (i ObjectBucketAclArray) ToObjectBucketAclArrayOutputWithContext(ctx context.Context) ObjectBucketAclArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObjectBucketAclArrayOutput)
}

// ObjectBucketAclMapInput is an input type that accepts ObjectBucketAclMap and ObjectBucketAclMapOutput values.
// You can construct a concrete instance of `ObjectBucketAclMapInput` via:
//
//	ObjectBucketAclMap{ "key": ObjectBucketAclArgs{...} }
type ObjectBucketAclMapInput interface {
	pulumi.Input

	ToObjectBucketAclMapOutput() ObjectBucketAclMapOutput
	ToObjectBucketAclMapOutputWithContext(context.Context) ObjectBucketAclMapOutput
}

type ObjectBucketAclMap map[string]ObjectBucketAclInput

func (ObjectBucketAclMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ObjectBucketAcl)(nil)).Elem()
}

func (i ObjectBucketAclMap) ToObjectBucketAclMapOutput() ObjectBucketAclMapOutput {
	return i.ToObjectBucketAclMapOutputWithContext(context.Background())
}

func (i ObjectBucketAclMap) ToObjectBucketAclMapOutputWithContext(ctx context.Context) ObjectBucketAclMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ObjectBucketAclMapOutput)
}

type ObjectBucketAclOutput struct{ *pulumi.OutputState }

func (ObjectBucketAclOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ObjectBucketAcl)(nil)).Elem()
}

func (o ObjectBucketAclOutput) ToObjectBucketAclOutput() ObjectBucketAclOutput {
	return o
}

func (o ObjectBucketAclOutput) ToObjectBucketAclOutputWithContext(ctx context.Context) ObjectBucketAclOutput {
	return o
}

// A configuration block that sets the ACL permissions for an object per grantee documented below.
func (o ObjectBucketAclOutput) AccessControlPolicy() ObjectBucketAclAccessControlPolicyOutput {
	return o.ApplyT(func(v *ObjectBucketAcl) ObjectBucketAclAccessControlPolicyOutput { return v.AccessControlPolicy }).(ObjectBucketAclAccessControlPolicyOutput)
}

// The canned ACL you want to apply to the bucket.
func (o ObjectBucketAclOutput) Acl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ObjectBucketAcl) pulumi.StringPtrOutput { return v.Acl }).(pulumi.StringPtrOutput)
}

// The name of the bucket.
func (o ObjectBucketAclOutput) Bucket() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectBucketAcl) pulumi.StringOutput { return v.Bucket }).(pulumi.StringOutput)
}

// The project ID of the expected bucket owner.
func (o ObjectBucketAclOutput) ExpectedBucketOwner() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ObjectBucketAcl) pulumi.StringPtrOutput { return v.ExpectedBucketOwner }).(pulumi.StringPtrOutput)
}

// The [region](https://developers.scaleway.com/en/quickstart/#region-definition) in which the bucket should be created.
func (o ObjectBucketAclOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *ObjectBucketAcl) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

type ObjectBucketAclArrayOutput struct{ *pulumi.OutputState }

func (ObjectBucketAclArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ObjectBucketAcl)(nil)).Elem()
}

func (o ObjectBucketAclArrayOutput) ToObjectBucketAclArrayOutput() ObjectBucketAclArrayOutput {
	return o
}

func (o ObjectBucketAclArrayOutput) ToObjectBucketAclArrayOutputWithContext(ctx context.Context) ObjectBucketAclArrayOutput {
	return o
}

func (o ObjectBucketAclArrayOutput) Index(i pulumi.IntInput) ObjectBucketAclOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ObjectBucketAcl {
		return vs[0].([]*ObjectBucketAcl)[vs[1].(int)]
	}).(ObjectBucketAclOutput)
}

type ObjectBucketAclMapOutput struct{ *pulumi.OutputState }

func (ObjectBucketAclMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ObjectBucketAcl)(nil)).Elem()
}

func (o ObjectBucketAclMapOutput) ToObjectBucketAclMapOutput() ObjectBucketAclMapOutput {
	return o
}

func (o ObjectBucketAclMapOutput) ToObjectBucketAclMapOutputWithContext(ctx context.Context) ObjectBucketAclMapOutput {
	return o
}

func (o ObjectBucketAclMapOutput) MapIndex(k pulumi.StringInput) ObjectBucketAclOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ObjectBucketAcl {
		return vs[0].(map[string]*ObjectBucketAcl)[vs[1].(string)]
	}).(ObjectBucketAclOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ObjectBucketAclInput)(nil)).Elem(), &ObjectBucketAcl{})
	pulumi.RegisterInputType(reflect.TypeOf((*ObjectBucketAclArrayInput)(nil)).Elem(), ObjectBucketAclArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ObjectBucketAclMapInput)(nil)).Elem(), ObjectBucketAclMap{})
	pulumi.RegisterOutputType(ObjectBucketAclOutput{})
	pulumi.RegisterOutputType(ObjectBucketAclArrayOutput{})
	pulumi.RegisterOutputType(ObjectBucketAclMapOutput{})
}
