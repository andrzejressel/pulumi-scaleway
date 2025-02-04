// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package scaleway

import (
	"context"
	"reflect"

	"errors"
	"github.com/lbrlabs/pulumi-scaleway/sdk/go/scaleway/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

type LoadbalancerCertificate struct {
	pulumi.CustomResourceState

	// Main domain of the certificate. A new certificate will be created if this field is changed.
	CommonName pulumi.StringOutput `pulumi:"commonName"`
	// Configuration block for custom certificate chain. Only one of `letsencrypt` and `customCertificate` should be specified.
	CustomCertificate LoadbalancerCertificateCustomCertificatePtrOutput `pulumi:"customCertificate"`
	// The identifier (SHA-1) of the certificate
	Fingerprint pulumi.StringOutput `pulumi:"fingerprint"`
	// The load-balancer ID this certificate is attached to.
	//
	// > **Important:** Updates to `lbId` will recreate the load-balancer certificate.
	LbId pulumi.StringOutput `pulumi:"lbId"`
	// Configuration block for Let's Encrypt configuration. Only one of `letsencrypt` and `customCertificate` should be specified.
	Letsencrypt LoadbalancerCertificateLetsencryptPtrOutput `pulumi:"letsencrypt"`
	// The name of the certificate backend.
	Name pulumi.StringOutput `pulumi:"name"`
	// The not valid after validity bound timestamp
	NotValidAfter pulumi.StringOutput `pulumi:"notValidAfter"`
	// The not valid before validity bound timestamp
	NotValidBefore pulumi.StringOutput `pulumi:"notValidBefore"`
	// Certificate status
	Status pulumi.StringOutput `pulumi:"status"`
	// Array of alternative domain names.  A new certificate will be created if this field is changed.
	//
	// > **Important:** Updates to `letsencrypt` will recreate the load-balancer certificate.
	SubjectAlternativeNames pulumi.StringArrayOutput `pulumi:"subjectAlternativeNames"`
}

// NewLoadbalancerCertificate registers a new resource with the given unique name, arguments, and options.
func NewLoadbalancerCertificate(ctx *pulumi.Context,
	name string, args *LoadbalancerCertificateArgs, opts ...pulumi.ResourceOption) (*LoadbalancerCertificate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LbId == nil {
		return nil, errors.New("invalid value for required argument 'LbId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LoadbalancerCertificate
	err := ctx.RegisterResource("scaleway:index/loadbalancerCertificate:LoadbalancerCertificate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLoadbalancerCertificate gets an existing LoadbalancerCertificate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoadbalancerCertificate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LoadbalancerCertificateState, opts ...pulumi.ResourceOption) (*LoadbalancerCertificate, error) {
	var resource LoadbalancerCertificate
	err := ctx.ReadResource("scaleway:index/loadbalancerCertificate:LoadbalancerCertificate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LoadbalancerCertificate resources.
type loadbalancerCertificateState struct {
	// Main domain of the certificate. A new certificate will be created if this field is changed.
	CommonName *string `pulumi:"commonName"`
	// Configuration block for custom certificate chain. Only one of `letsencrypt` and `customCertificate` should be specified.
	CustomCertificate *LoadbalancerCertificateCustomCertificate `pulumi:"customCertificate"`
	// The identifier (SHA-1) of the certificate
	Fingerprint *string `pulumi:"fingerprint"`
	// The load-balancer ID this certificate is attached to.
	//
	// > **Important:** Updates to `lbId` will recreate the load-balancer certificate.
	LbId *string `pulumi:"lbId"`
	// Configuration block for Let's Encrypt configuration. Only one of `letsencrypt` and `customCertificate` should be specified.
	Letsencrypt *LoadbalancerCertificateLetsencrypt `pulumi:"letsencrypt"`
	// The name of the certificate backend.
	Name *string `pulumi:"name"`
	// The not valid after validity bound timestamp
	NotValidAfter *string `pulumi:"notValidAfter"`
	// The not valid before validity bound timestamp
	NotValidBefore *string `pulumi:"notValidBefore"`
	// Certificate status
	Status *string `pulumi:"status"`
	// Array of alternative domain names.  A new certificate will be created if this field is changed.
	//
	// > **Important:** Updates to `letsencrypt` will recreate the load-balancer certificate.
	SubjectAlternativeNames []string `pulumi:"subjectAlternativeNames"`
}

type LoadbalancerCertificateState struct {
	// Main domain of the certificate. A new certificate will be created if this field is changed.
	CommonName pulumi.StringPtrInput
	// Configuration block for custom certificate chain. Only one of `letsencrypt` and `customCertificate` should be specified.
	CustomCertificate LoadbalancerCertificateCustomCertificatePtrInput
	// The identifier (SHA-1) of the certificate
	Fingerprint pulumi.StringPtrInput
	// The load-balancer ID this certificate is attached to.
	//
	// > **Important:** Updates to `lbId` will recreate the load-balancer certificate.
	LbId pulumi.StringPtrInput
	// Configuration block for Let's Encrypt configuration. Only one of `letsencrypt` and `customCertificate` should be specified.
	Letsencrypt LoadbalancerCertificateLetsencryptPtrInput
	// The name of the certificate backend.
	Name pulumi.StringPtrInput
	// The not valid after validity bound timestamp
	NotValidAfter pulumi.StringPtrInput
	// The not valid before validity bound timestamp
	NotValidBefore pulumi.StringPtrInput
	// Certificate status
	Status pulumi.StringPtrInput
	// Array of alternative domain names.  A new certificate will be created if this field is changed.
	//
	// > **Important:** Updates to `letsencrypt` will recreate the load-balancer certificate.
	SubjectAlternativeNames pulumi.StringArrayInput
}

func (LoadbalancerCertificateState) ElementType() reflect.Type {
	return reflect.TypeOf((*loadbalancerCertificateState)(nil)).Elem()
}

type loadbalancerCertificateArgs struct {
	// Configuration block for custom certificate chain. Only one of `letsencrypt` and `customCertificate` should be specified.
	CustomCertificate *LoadbalancerCertificateCustomCertificate `pulumi:"customCertificate"`
	// The load-balancer ID this certificate is attached to.
	//
	// > **Important:** Updates to `lbId` will recreate the load-balancer certificate.
	LbId string `pulumi:"lbId"`
	// Configuration block for Let's Encrypt configuration. Only one of `letsencrypt` and `customCertificate` should be specified.
	Letsencrypt *LoadbalancerCertificateLetsencrypt `pulumi:"letsencrypt"`
	// The name of the certificate backend.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a LoadbalancerCertificate resource.
type LoadbalancerCertificateArgs struct {
	// Configuration block for custom certificate chain. Only one of `letsencrypt` and `customCertificate` should be specified.
	CustomCertificate LoadbalancerCertificateCustomCertificatePtrInput
	// The load-balancer ID this certificate is attached to.
	//
	// > **Important:** Updates to `lbId` will recreate the load-balancer certificate.
	LbId pulumi.StringInput
	// Configuration block for Let's Encrypt configuration. Only one of `letsencrypt` and `customCertificate` should be specified.
	Letsencrypt LoadbalancerCertificateLetsencryptPtrInput
	// The name of the certificate backend.
	Name pulumi.StringPtrInput
}

func (LoadbalancerCertificateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*loadbalancerCertificateArgs)(nil)).Elem()
}

type LoadbalancerCertificateInput interface {
	pulumi.Input

	ToLoadbalancerCertificateOutput() LoadbalancerCertificateOutput
	ToLoadbalancerCertificateOutputWithContext(ctx context.Context) LoadbalancerCertificateOutput
}

func (*LoadbalancerCertificate) ElementType() reflect.Type {
	return reflect.TypeOf((**LoadbalancerCertificate)(nil)).Elem()
}

func (i *LoadbalancerCertificate) ToLoadbalancerCertificateOutput() LoadbalancerCertificateOutput {
	return i.ToLoadbalancerCertificateOutputWithContext(context.Background())
}

func (i *LoadbalancerCertificate) ToLoadbalancerCertificateOutputWithContext(ctx context.Context) LoadbalancerCertificateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadbalancerCertificateOutput)
}

func (i *LoadbalancerCertificate) ToOutput(ctx context.Context) pulumix.Output[*LoadbalancerCertificate] {
	return pulumix.Output[*LoadbalancerCertificate]{
		OutputState: i.ToLoadbalancerCertificateOutputWithContext(ctx).OutputState,
	}
}

// LoadbalancerCertificateArrayInput is an input type that accepts LoadbalancerCertificateArray and LoadbalancerCertificateArrayOutput values.
// You can construct a concrete instance of `LoadbalancerCertificateArrayInput` via:
//
//	LoadbalancerCertificateArray{ LoadbalancerCertificateArgs{...} }
type LoadbalancerCertificateArrayInput interface {
	pulumi.Input

	ToLoadbalancerCertificateArrayOutput() LoadbalancerCertificateArrayOutput
	ToLoadbalancerCertificateArrayOutputWithContext(context.Context) LoadbalancerCertificateArrayOutput
}

type LoadbalancerCertificateArray []LoadbalancerCertificateInput

func (LoadbalancerCertificateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoadbalancerCertificate)(nil)).Elem()
}

func (i LoadbalancerCertificateArray) ToLoadbalancerCertificateArrayOutput() LoadbalancerCertificateArrayOutput {
	return i.ToLoadbalancerCertificateArrayOutputWithContext(context.Background())
}

func (i LoadbalancerCertificateArray) ToLoadbalancerCertificateArrayOutputWithContext(ctx context.Context) LoadbalancerCertificateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadbalancerCertificateArrayOutput)
}

func (i LoadbalancerCertificateArray) ToOutput(ctx context.Context) pulumix.Output[[]*LoadbalancerCertificate] {
	return pulumix.Output[[]*LoadbalancerCertificate]{
		OutputState: i.ToLoadbalancerCertificateArrayOutputWithContext(ctx).OutputState,
	}
}

// LoadbalancerCertificateMapInput is an input type that accepts LoadbalancerCertificateMap and LoadbalancerCertificateMapOutput values.
// You can construct a concrete instance of `LoadbalancerCertificateMapInput` via:
//
//	LoadbalancerCertificateMap{ "key": LoadbalancerCertificateArgs{...} }
type LoadbalancerCertificateMapInput interface {
	pulumi.Input

	ToLoadbalancerCertificateMapOutput() LoadbalancerCertificateMapOutput
	ToLoadbalancerCertificateMapOutputWithContext(context.Context) LoadbalancerCertificateMapOutput
}

type LoadbalancerCertificateMap map[string]LoadbalancerCertificateInput

func (LoadbalancerCertificateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoadbalancerCertificate)(nil)).Elem()
}

func (i LoadbalancerCertificateMap) ToLoadbalancerCertificateMapOutput() LoadbalancerCertificateMapOutput {
	return i.ToLoadbalancerCertificateMapOutputWithContext(context.Background())
}

func (i LoadbalancerCertificateMap) ToLoadbalancerCertificateMapOutputWithContext(ctx context.Context) LoadbalancerCertificateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadbalancerCertificateMapOutput)
}

func (i LoadbalancerCertificateMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*LoadbalancerCertificate] {
	return pulumix.Output[map[string]*LoadbalancerCertificate]{
		OutputState: i.ToLoadbalancerCertificateMapOutputWithContext(ctx).OutputState,
	}
}

type LoadbalancerCertificateOutput struct{ *pulumi.OutputState }

func (LoadbalancerCertificateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LoadbalancerCertificate)(nil)).Elem()
}

func (o LoadbalancerCertificateOutput) ToLoadbalancerCertificateOutput() LoadbalancerCertificateOutput {
	return o
}

func (o LoadbalancerCertificateOutput) ToLoadbalancerCertificateOutputWithContext(ctx context.Context) LoadbalancerCertificateOutput {
	return o
}

func (o LoadbalancerCertificateOutput) ToOutput(ctx context.Context) pulumix.Output[*LoadbalancerCertificate] {
	return pulumix.Output[*LoadbalancerCertificate]{
		OutputState: o.OutputState,
	}
}

// Main domain of the certificate. A new certificate will be created if this field is changed.
func (o LoadbalancerCertificateOutput) CommonName() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadbalancerCertificate) pulumi.StringOutput { return v.CommonName }).(pulumi.StringOutput)
}

// Configuration block for custom certificate chain. Only one of `letsencrypt` and `customCertificate` should be specified.
func (o LoadbalancerCertificateOutput) CustomCertificate() LoadbalancerCertificateCustomCertificatePtrOutput {
	return o.ApplyT(func(v *LoadbalancerCertificate) LoadbalancerCertificateCustomCertificatePtrOutput {
		return v.CustomCertificate
	}).(LoadbalancerCertificateCustomCertificatePtrOutput)
}

// The identifier (SHA-1) of the certificate
func (o LoadbalancerCertificateOutput) Fingerprint() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadbalancerCertificate) pulumi.StringOutput { return v.Fingerprint }).(pulumi.StringOutput)
}

// The load-balancer ID this certificate is attached to.
//
// > **Important:** Updates to `lbId` will recreate the load-balancer certificate.
func (o LoadbalancerCertificateOutput) LbId() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadbalancerCertificate) pulumi.StringOutput { return v.LbId }).(pulumi.StringOutput)
}

// Configuration block for Let's Encrypt configuration. Only one of `letsencrypt` and `customCertificate` should be specified.
func (o LoadbalancerCertificateOutput) Letsencrypt() LoadbalancerCertificateLetsencryptPtrOutput {
	return o.ApplyT(func(v *LoadbalancerCertificate) LoadbalancerCertificateLetsencryptPtrOutput { return v.Letsencrypt }).(LoadbalancerCertificateLetsencryptPtrOutput)
}

// The name of the certificate backend.
func (o LoadbalancerCertificateOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadbalancerCertificate) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The not valid after validity bound timestamp
func (o LoadbalancerCertificateOutput) NotValidAfter() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadbalancerCertificate) pulumi.StringOutput { return v.NotValidAfter }).(pulumi.StringOutput)
}

// The not valid before validity bound timestamp
func (o LoadbalancerCertificateOutput) NotValidBefore() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadbalancerCertificate) pulumi.StringOutput { return v.NotValidBefore }).(pulumi.StringOutput)
}

// Certificate status
func (o LoadbalancerCertificateOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *LoadbalancerCertificate) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Array of alternative domain names.  A new certificate will be created if this field is changed.
//
// > **Important:** Updates to `letsencrypt` will recreate the load-balancer certificate.
func (o LoadbalancerCertificateOutput) SubjectAlternativeNames() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *LoadbalancerCertificate) pulumi.StringArrayOutput { return v.SubjectAlternativeNames }).(pulumi.StringArrayOutput)
}

type LoadbalancerCertificateArrayOutput struct{ *pulumi.OutputState }

func (LoadbalancerCertificateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LoadbalancerCertificate)(nil)).Elem()
}

func (o LoadbalancerCertificateArrayOutput) ToLoadbalancerCertificateArrayOutput() LoadbalancerCertificateArrayOutput {
	return o
}

func (o LoadbalancerCertificateArrayOutput) ToLoadbalancerCertificateArrayOutputWithContext(ctx context.Context) LoadbalancerCertificateArrayOutput {
	return o
}

func (o LoadbalancerCertificateArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*LoadbalancerCertificate] {
	return pulumix.Output[[]*LoadbalancerCertificate]{
		OutputState: o.OutputState,
	}
}

func (o LoadbalancerCertificateArrayOutput) Index(i pulumi.IntInput) LoadbalancerCertificateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LoadbalancerCertificate {
		return vs[0].([]*LoadbalancerCertificate)[vs[1].(int)]
	}).(LoadbalancerCertificateOutput)
}

type LoadbalancerCertificateMapOutput struct{ *pulumi.OutputState }

func (LoadbalancerCertificateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LoadbalancerCertificate)(nil)).Elem()
}

func (o LoadbalancerCertificateMapOutput) ToLoadbalancerCertificateMapOutput() LoadbalancerCertificateMapOutput {
	return o
}

func (o LoadbalancerCertificateMapOutput) ToLoadbalancerCertificateMapOutputWithContext(ctx context.Context) LoadbalancerCertificateMapOutput {
	return o
}

func (o LoadbalancerCertificateMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*LoadbalancerCertificate] {
	return pulumix.Output[map[string]*LoadbalancerCertificate]{
		OutputState: o.OutputState,
	}
}

func (o LoadbalancerCertificateMapOutput) MapIndex(k pulumi.StringInput) LoadbalancerCertificateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LoadbalancerCertificate {
		return vs[0].(map[string]*LoadbalancerCertificate)[vs[1].(string)]
	}).(LoadbalancerCertificateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LoadbalancerCertificateInput)(nil)).Elem(), &LoadbalancerCertificate{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoadbalancerCertificateArrayInput)(nil)).Elem(), LoadbalancerCertificateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LoadbalancerCertificateMapInput)(nil)).Elem(), LoadbalancerCertificateMap{})
	pulumi.RegisterOutputType(LoadbalancerCertificateOutput{})
	pulumi.RegisterOutputType(LoadbalancerCertificateArrayOutput{})
	pulumi.RegisterOutputType(LoadbalancerCertificateMapOutput{})
}
