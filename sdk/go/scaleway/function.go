// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package scaleway

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates and manages Scaleway Functions.
// For more information see [the documentation](https://developers.scaleway.com/en/products/functions/api/).
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
//			mainFunctionNamespace, err := scaleway.NewFunctionNamespace(ctx, "mainFunctionNamespace", &scaleway.FunctionNamespaceArgs{
//				Description: pulumi.String("Main function namespace"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = scaleway.NewFunction(ctx, "mainFunction", &scaleway.FunctionArgs{
//				NamespaceId: mainFunctionNamespace.ID(),
//				Runtime:     pulumi.String("go118"),
//				Handler:     pulumi.String("Handle"),
//				Privacy:     pulumi.String("private"),
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
// Functions can be imported using the `{region}/{id}`, e.g. bash
//
// ```sh
//
//	$ pulumi import scaleway:index/function:Function main fr-par/11111111-1111-1111-1111-111111111111
//
// ```
type Function struct {
	pulumi.CustomResourceState

	// The CPU limit in mCPU for your function. More infos on resources [here](https://developers.scaleway.com/en/products/functions/api/#functions)
	CpuLimit pulumi.IntOutput `pulumi:"cpuLimit"`
	// Define if the function should be deployed, terraform will wait for function to be deployed
	Deploy pulumi.BoolPtrOutput `pulumi:"deploy"`
	// The description of the function.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The native domain name of the function
	DomainName pulumi.StringOutput `pulumi:"domainName"`
	// The environment variables of the function.
	EnvironmentVariables pulumi.StringMapOutput `pulumi:"environmentVariables"`
	// Handler of the function. Depends on the runtime ([function guide](https://developers.scaleway.com/en/products/functions/api/#create-a-function))
	Handler pulumi.StringOutput `pulumi:"handler"`
	// HTTP traffic configuration
	HttpOption pulumi.StringPtrOutput `pulumi:"httpOption"`
	// Maximum replicas for your function (defaults to 20), our system will scale your functions automatically based on incoming workload, but will never scale the number of replicas above the configured max_scale.
	MaxScale pulumi.IntPtrOutput `pulumi:"maxScale"`
	// Memory limit in MB for your function, defaults to 128MB
	MemoryLimit pulumi.IntPtrOutput `pulumi:"memoryLimit"`
	// Minimum replicas for your function, defaults to 0, Note that a function is billed when it gets executed, and using a minScale greater than 0 will cause your function container to run constantly.
	MinScale pulumi.IntPtrOutput `pulumi:"minScale"`
	// The unique name of the function.
	//
	// > **Important** Updates to `name` will recreate the function.
	Name pulumi.StringOutput `pulumi:"name"`
	// The namespace ID associated with this function
	NamespaceId pulumi.StringOutput `pulumi:"namespaceId"`
	// The organization ID the function is associated with.
	OrganizationId pulumi.StringOutput `pulumi:"organizationId"`
	// Privacy of the function. Can be either `private` or `public`. Read more on [authentication](https://developers.scaleway.com/en/products/functions/api/#authentication)
	Privacy pulumi.StringOutput `pulumi:"privacy"`
	// `projectId`) The ID of the project the namespace is associated with.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// `region`). The region in which the namespace should be created.
	Region pulumi.StringOutput `pulumi:"region"`
	// Runtime of the function. Runtimes can be fetched using [specific route](https://developers.scaleway.com/en/products/functions/api/#get-f7de6a)
	Runtime pulumi.StringOutput `pulumi:"runtime"`
	// The [secret environment](https://www.scaleway.com/en/docs/compute/functions/concepts/#secrets) variables of the function.
	SecretEnvironmentVariables pulumi.StringMapOutput `pulumi:"secretEnvironmentVariables"`
	// Holds the max duration (in seconds) the function is allowed for responding to a request
	Timeout pulumi.IntOutput `pulumi:"timeout"`
	// Location of the zip file to upload containing your function sources
	ZipFile pulumi.StringPtrOutput `pulumi:"zipFile"`
	// The hash of your source zip file, changing it will re-apply function. Can be any string
	ZipHash pulumi.StringPtrOutput `pulumi:"zipHash"`
}

// NewFunction registers a new resource with the given unique name, arguments, and options.
func NewFunction(ctx *pulumi.Context,
	name string, args *FunctionArgs, opts ...pulumi.ResourceOption) (*Function, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Handler == nil {
		return nil, errors.New("invalid value for required argument 'Handler'")
	}
	if args.NamespaceId == nil {
		return nil, errors.New("invalid value for required argument 'NamespaceId'")
	}
	if args.Privacy == nil {
		return nil, errors.New("invalid value for required argument 'Privacy'")
	}
	if args.Runtime == nil {
		return nil, errors.New("invalid value for required argument 'Runtime'")
	}
	if args.SecretEnvironmentVariables != nil {
		args.SecretEnvironmentVariables = pulumi.ToSecret(args.SecretEnvironmentVariables).(pulumi.StringMapInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"secretEnvironmentVariables",
	})
	opts = append(opts, secrets)
	opts = pkgResourceDefaultOpts(opts)
	var resource Function
	err := ctx.RegisterResource("scaleway:index/function:Function", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFunction gets an existing Function resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFunction(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FunctionState, opts ...pulumi.ResourceOption) (*Function, error) {
	var resource Function
	err := ctx.ReadResource("scaleway:index/function:Function", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Function resources.
type functionState struct {
	// The CPU limit in mCPU for your function. More infos on resources [here](https://developers.scaleway.com/en/products/functions/api/#functions)
	CpuLimit *int `pulumi:"cpuLimit"`
	// Define if the function should be deployed, terraform will wait for function to be deployed
	Deploy *bool `pulumi:"deploy"`
	// The description of the function.
	Description *string `pulumi:"description"`
	// The native domain name of the function
	DomainName *string `pulumi:"domainName"`
	// The environment variables of the function.
	EnvironmentVariables map[string]string `pulumi:"environmentVariables"`
	// Handler of the function. Depends on the runtime ([function guide](https://developers.scaleway.com/en/products/functions/api/#create-a-function))
	Handler *string `pulumi:"handler"`
	// HTTP traffic configuration
	HttpOption *string `pulumi:"httpOption"`
	// Maximum replicas for your function (defaults to 20), our system will scale your functions automatically based on incoming workload, but will never scale the number of replicas above the configured max_scale.
	MaxScale *int `pulumi:"maxScale"`
	// Memory limit in MB for your function, defaults to 128MB
	MemoryLimit *int `pulumi:"memoryLimit"`
	// Minimum replicas for your function, defaults to 0, Note that a function is billed when it gets executed, and using a minScale greater than 0 will cause your function container to run constantly.
	MinScale *int `pulumi:"minScale"`
	// The unique name of the function.
	//
	// > **Important** Updates to `name` will recreate the function.
	Name *string `pulumi:"name"`
	// The namespace ID associated with this function
	NamespaceId *string `pulumi:"namespaceId"`
	// The organization ID the function is associated with.
	OrganizationId *string `pulumi:"organizationId"`
	// Privacy of the function. Can be either `private` or `public`. Read more on [authentication](https://developers.scaleway.com/en/products/functions/api/#authentication)
	Privacy *string `pulumi:"privacy"`
	// `projectId`) The ID of the project the namespace is associated with.
	ProjectId *string `pulumi:"projectId"`
	// `region`). The region in which the namespace should be created.
	Region *string `pulumi:"region"`
	// Runtime of the function. Runtimes can be fetched using [specific route](https://developers.scaleway.com/en/products/functions/api/#get-f7de6a)
	Runtime *string `pulumi:"runtime"`
	// The [secret environment](https://www.scaleway.com/en/docs/compute/functions/concepts/#secrets) variables of the function.
	SecretEnvironmentVariables map[string]string `pulumi:"secretEnvironmentVariables"`
	// Holds the max duration (in seconds) the function is allowed for responding to a request
	Timeout *int `pulumi:"timeout"`
	// Location of the zip file to upload containing your function sources
	ZipFile *string `pulumi:"zipFile"`
	// The hash of your source zip file, changing it will re-apply function. Can be any string
	ZipHash *string `pulumi:"zipHash"`
}

type FunctionState struct {
	// The CPU limit in mCPU for your function. More infos on resources [here](https://developers.scaleway.com/en/products/functions/api/#functions)
	CpuLimit pulumi.IntPtrInput
	// Define if the function should be deployed, terraform will wait for function to be deployed
	Deploy pulumi.BoolPtrInput
	// The description of the function.
	Description pulumi.StringPtrInput
	// The native domain name of the function
	DomainName pulumi.StringPtrInput
	// The environment variables of the function.
	EnvironmentVariables pulumi.StringMapInput
	// Handler of the function. Depends on the runtime ([function guide](https://developers.scaleway.com/en/products/functions/api/#create-a-function))
	Handler pulumi.StringPtrInput
	// HTTP traffic configuration
	HttpOption pulumi.StringPtrInput
	// Maximum replicas for your function (defaults to 20), our system will scale your functions automatically based on incoming workload, but will never scale the number of replicas above the configured max_scale.
	MaxScale pulumi.IntPtrInput
	// Memory limit in MB for your function, defaults to 128MB
	MemoryLimit pulumi.IntPtrInput
	// Minimum replicas for your function, defaults to 0, Note that a function is billed when it gets executed, and using a minScale greater than 0 will cause your function container to run constantly.
	MinScale pulumi.IntPtrInput
	// The unique name of the function.
	//
	// > **Important** Updates to `name` will recreate the function.
	Name pulumi.StringPtrInput
	// The namespace ID associated with this function
	NamespaceId pulumi.StringPtrInput
	// The organization ID the function is associated with.
	OrganizationId pulumi.StringPtrInput
	// Privacy of the function. Can be either `private` or `public`. Read more on [authentication](https://developers.scaleway.com/en/products/functions/api/#authentication)
	Privacy pulumi.StringPtrInput
	// `projectId`) The ID of the project the namespace is associated with.
	ProjectId pulumi.StringPtrInput
	// `region`). The region in which the namespace should be created.
	Region pulumi.StringPtrInput
	// Runtime of the function. Runtimes can be fetched using [specific route](https://developers.scaleway.com/en/products/functions/api/#get-f7de6a)
	Runtime pulumi.StringPtrInput
	// The [secret environment](https://www.scaleway.com/en/docs/compute/functions/concepts/#secrets) variables of the function.
	SecretEnvironmentVariables pulumi.StringMapInput
	// Holds the max duration (in seconds) the function is allowed for responding to a request
	Timeout pulumi.IntPtrInput
	// Location of the zip file to upload containing your function sources
	ZipFile pulumi.StringPtrInput
	// The hash of your source zip file, changing it will re-apply function. Can be any string
	ZipHash pulumi.StringPtrInput
}

func (FunctionState) ElementType() reflect.Type {
	return reflect.TypeOf((*functionState)(nil)).Elem()
}

type functionArgs struct {
	// Define if the function should be deployed, terraform will wait for function to be deployed
	Deploy *bool `pulumi:"deploy"`
	// The description of the function.
	Description *string `pulumi:"description"`
	// The environment variables of the function.
	EnvironmentVariables map[string]string `pulumi:"environmentVariables"`
	// Handler of the function. Depends on the runtime ([function guide](https://developers.scaleway.com/en/products/functions/api/#create-a-function))
	Handler string `pulumi:"handler"`
	// HTTP traffic configuration
	HttpOption *string `pulumi:"httpOption"`
	// Maximum replicas for your function (defaults to 20), our system will scale your functions automatically based on incoming workload, but will never scale the number of replicas above the configured max_scale.
	MaxScale *int `pulumi:"maxScale"`
	// Memory limit in MB for your function, defaults to 128MB
	MemoryLimit *int `pulumi:"memoryLimit"`
	// Minimum replicas for your function, defaults to 0, Note that a function is billed when it gets executed, and using a minScale greater than 0 will cause your function container to run constantly.
	MinScale *int `pulumi:"minScale"`
	// The unique name of the function.
	//
	// > **Important** Updates to `name` will recreate the function.
	Name *string `pulumi:"name"`
	// The namespace ID associated with this function
	NamespaceId string `pulumi:"namespaceId"`
	// Privacy of the function. Can be either `private` or `public`. Read more on [authentication](https://developers.scaleway.com/en/products/functions/api/#authentication)
	Privacy string `pulumi:"privacy"`
	// `projectId`) The ID of the project the namespace is associated with.
	ProjectId *string `pulumi:"projectId"`
	// `region`). The region in which the namespace should be created.
	Region *string `pulumi:"region"`
	// Runtime of the function. Runtimes can be fetched using [specific route](https://developers.scaleway.com/en/products/functions/api/#get-f7de6a)
	Runtime string `pulumi:"runtime"`
	// The [secret environment](https://www.scaleway.com/en/docs/compute/functions/concepts/#secrets) variables of the function.
	SecretEnvironmentVariables map[string]string `pulumi:"secretEnvironmentVariables"`
	// Holds the max duration (in seconds) the function is allowed for responding to a request
	Timeout *int `pulumi:"timeout"`
	// Location of the zip file to upload containing your function sources
	ZipFile *string `pulumi:"zipFile"`
	// The hash of your source zip file, changing it will re-apply function. Can be any string
	ZipHash *string `pulumi:"zipHash"`
}

// The set of arguments for constructing a Function resource.
type FunctionArgs struct {
	// Define if the function should be deployed, terraform will wait for function to be deployed
	Deploy pulumi.BoolPtrInput
	// The description of the function.
	Description pulumi.StringPtrInput
	// The environment variables of the function.
	EnvironmentVariables pulumi.StringMapInput
	// Handler of the function. Depends on the runtime ([function guide](https://developers.scaleway.com/en/products/functions/api/#create-a-function))
	Handler pulumi.StringInput
	// HTTP traffic configuration
	HttpOption pulumi.StringPtrInput
	// Maximum replicas for your function (defaults to 20), our system will scale your functions automatically based on incoming workload, but will never scale the number of replicas above the configured max_scale.
	MaxScale pulumi.IntPtrInput
	// Memory limit in MB for your function, defaults to 128MB
	MemoryLimit pulumi.IntPtrInput
	// Minimum replicas for your function, defaults to 0, Note that a function is billed when it gets executed, and using a minScale greater than 0 will cause your function container to run constantly.
	MinScale pulumi.IntPtrInput
	// The unique name of the function.
	//
	// > **Important** Updates to `name` will recreate the function.
	Name pulumi.StringPtrInput
	// The namespace ID associated with this function
	NamespaceId pulumi.StringInput
	// Privacy of the function. Can be either `private` or `public`. Read more on [authentication](https://developers.scaleway.com/en/products/functions/api/#authentication)
	Privacy pulumi.StringInput
	// `projectId`) The ID of the project the namespace is associated with.
	ProjectId pulumi.StringPtrInput
	// `region`). The region in which the namespace should be created.
	Region pulumi.StringPtrInput
	// Runtime of the function. Runtimes can be fetched using [specific route](https://developers.scaleway.com/en/products/functions/api/#get-f7de6a)
	Runtime pulumi.StringInput
	// The [secret environment](https://www.scaleway.com/en/docs/compute/functions/concepts/#secrets) variables of the function.
	SecretEnvironmentVariables pulumi.StringMapInput
	// Holds the max duration (in seconds) the function is allowed for responding to a request
	Timeout pulumi.IntPtrInput
	// Location of the zip file to upload containing your function sources
	ZipFile pulumi.StringPtrInput
	// The hash of your source zip file, changing it will re-apply function. Can be any string
	ZipHash pulumi.StringPtrInput
}

func (FunctionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*functionArgs)(nil)).Elem()
}

type FunctionInput interface {
	pulumi.Input

	ToFunctionOutput() FunctionOutput
	ToFunctionOutputWithContext(ctx context.Context) FunctionOutput
}

func (*Function) ElementType() reflect.Type {
	return reflect.TypeOf((**Function)(nil)).Elem()
}

func (i *Function) ToFunctionOutput() FunctionOutput {
	return i.ToFunctionOutputWithContext(context.Background())
}

func (i *Function) ToFunctionOutputWithContext(ctx context.Context) FunctionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FunctionOutput)
}

// FunctionArrayInput is an input type that accepts FunctionArray and FunctionArrayOutput values.
// You can construct a concrete instance of `FunctionArrayInput` via:
//
//	FunctionArray{ FunctionArgs{...} }
type FunctionArrayInput interface {
	pulumi.Input

	ToFunctionArrayOutput() FunctionArrayOutput
	ToFunctionArrayOutputWithContext(context.Context) FunctionArrayOutput
}

type FunctionArray []FunctionInput

func (FunctionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Function)(nil)).Elem()
}

func (i FunctionArray) ToFunctionArrayOutput() FunctionArrayOutput {
	return i.ToFunctionArrayOutputWithContext(context.Background())
}

func (i FunctionArray) ToFunctionArrayOutputWithContext(ctx context.Context) FunctionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FunctionArrayOutput)
}

// FunctionMapInput is an input type that accepts FunctionMap and FunctionMapOutput values.
// You can construct a concrete instance of `FunctionMapInput` via:
//
//	FunctionMap{ "key": FunctionArgs{...} }
type FunctionMapInput interface {
	pulumi.Input

	ToFunctionMapOutput() FunctionMapOutput
	ToFunctionMapOutputWithContext(context.Context) FunctionMapOutput
}

type FunctionMap map[string]FunctionInput

func (FunctionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Function)(nil)).Elem()
}

func (i FunctionMap) ToFunctionMapOutput() FunctionMapOutput {
	return i.ToFunctionMapOutputWithContext(context.Background())
}

func (i FunctionMap) ToFunctionMapOutputWithContext(ctx context.Context) FunctionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FunctionMapOutput)
}

type FunctionOutput struct{ *pulumi.OutputState }

func (FunctionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Function)(nil)).Elem()
}

func (o FunctionOutput) ToFunctionOutput() FunctionOutput {
	return o
}

func (o FunctionOutput) ToFunctionOutputWithContext(ctx context.Context) FunctionOutput {
	return o
}

// The CPU limit in mCPU for your function. More infos on resources [here](https://developers.scaleway.com/en/products/functions/api/#functions)
func (o FunctionOutput) CpuLimit() pulumi.IntOutput {
	return o.ApplyT(func(v *Function) pulumi.IntOutput { return v.CpuLimit }).(pulumi.IntOutput)
}

// Define if the function should be deployed, terraform will wait for function to be deployed
func (o FunctionOutput) Deploy() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Function) pulumi.BoolPtrOutput { return v.Deploy }).(pulumi.BoolPtrOutput)
}

// The description of the function.
func (o FunctionOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Function) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The native domain name of the function
func (o FunctionOutput) DomainName() pulumi.StringOutput {
	return o.ApplyT(func(v *Function) pulumi.StringOutput { return v.DomainName }).(pulumi.StringOutput)
}

// The environment variables of the function.
func (o FunctionOutput) EnvironmentVariables() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Function) pulumi.StringMapOutput { return v.EnvironmentVariables }).(pulumi.StringMapOutput)
}

// Handler of the function. Depends on the runtime ([function guide](https://developers.scaleway.com/en/products/functions/api/#create-a-function))
func (o FunctionOutput) Handler() pulumi.StringOutput {
	return o.ApplyT(func(v *Function) pulumi.StringOutput { return v.Handler }).(pulumi.StringOutput)
}

// HTTP traffic configuration
func (o FunctionOutput) HttpOption() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Function) pulumi.StringPtrOutput { return v.HttpOption }).(pulumi.StringPtrOutput)
}

// Maximum replicas for your function (defaults to 20), our system will scale your functions automatically based on incoming workload, but will never scale the number of replicas above the configured max_scale.
func (o FunctionOutput) MaxScale() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Function) pulumi.IntPtrOutput { return v.MaxScale }).(pulumi.IntPtrOutput)
}

// Memory limit in MB for your function, defaults to 128MB
func (o FunctionOutput) MemoryLimit() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Function) pulumi.IntPtrOutput { return v.MemoryLimit }).(pulumi.IntPtrOutput)
}

// Minimum replicas for your function, defaults to 0, Note that a function is billed when it gets executed, and using a minScale greater than 0 will cause your function container to run constantly.
func (o FunctionOutput) MinScale() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Function) pulumi.IntPtrOutput { return v.MinScale }).(pulumi.IntPtrOutput)
}

// The unique name of the function.
//
// > **Important** Updates to `name` will recreate the function.
func (o FunctionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Function) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The namespace ID associated with this function
func (o FunctionOutput) NamespaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *Function) pulumi.StringOutput { return v.NamespaceId }).(pulumi.StringOutput)
}

// The organization ID the function is associated with.
func (o FunctionOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v *Function) pulumi.StringOutput { return v.OrganizationId }).(pulumi.StringOutput)
}

// Privacy of the function. Can be either `private` or `public`. Read more on [authentication](https://developers.scaleway.com/en/products/functions/api/#authentication)
func (o FunctionOutput) Privacy() pulumi.StringOutput {
	return o.ApplyT(func(v *Function) pulumi.StringOutput { return v.Privacy }).(pulumi.StringOutput)
}

// `projectId`) The ID of the project the namespace is associated with.
func (o FunctionOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *Function) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// `region`). The region in which the namespace should be created.
func (o FunctionOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v *Function) pulumi.StringOutput { return v.Region }).(pulumi.StringOutput)
}

// Runtime of the function. Runtimes can be fetched using [specific route](https://developers.scaleway.com/en/products/functions/api/#get-f7de6a)
func (o FunctionOutput) Runtime() pulumi.StringOutput {
	return o.ApplyT(func(v *Function) pulumi.StringOutput { return v.Runtime }).(pulumi.StringOutput)
}

// The [secret environment](https://www.scaleway.com/en/docs/compute/functions/concepts/#secrets) variables of the function.
func (o FunctionOutput) SecretEnvironmentVariables() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Function) pulumi.StringMapOutput { return v.SecretEnvironmentVariables }).(pulumi.StringMapOutput)
}

// Holds the max duration (in seconds) the function is allowed for responding to a request
func (o FunctionOutput) Timeout() pulumi.IntOutput {
	return o.ApplyT(func(v *Function) pulumi.IntOutput { return v.Timeout }).(pulumi.IntOutput)
}

// Location of the zip file to upload containing your function sources
func (o FunctionOutput) ZipFile() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Function) pulumi.StringPtrOutput { return v.ZipFile }).(pulumi.StringPtrOutput)
}

// The hash of your source zip file, changing it will re-apply function. Can be any string
func (o FunctionOutput) ZipHash() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Function) pulumi.StringPtrOutput { return v.ZipHash }).(pulumi.StringPtrOutput)
}

type FunctionArrayOutput struct{ *pulumi.OutputState }

func (FunctionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Function)(nil)).Elem()
}

func (o FunctionArrayOutput) ToFunctionArrayOutput() FunctionArrayOutput {
	return o
}

func (o FunctionArrayOutput) ToFunctionArrayOutputWithContext(ctx context.Context) FunctionArrayOutput {
	return o
}

func (o FunctionArrayOutput) Index(i pulumi.IntInput) FunctionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Function {
		return vs[0].([]*Function)[vs[1].(int)]
	}).(FunctionOutput)
}

type FunctionMapOutput struct{ *pulumi.OutputState }

func (FunctionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Function)(nil)).Elem()
}

func (o FunctionMapOutput) ToFunctionMapOutput() FunctionMapOutput {
	return o
}

func (o FunctionMapOutput) ToFunctionMapOutputWithContext(ctx context.Context) FunctionMapOutput {
	return o
}

func (o FunctionMapOutput) MapIndex(k pulumi.StringInput) FunctionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Function {
		return vs[0].(map[string]*Function)[vs[1].(string)]
	}).(FunctionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FunctionInput)(nil)).Elem(), &Function{})
	pulumi.RegisterInputType(reflect.TypeOf((*FunctionArrayInput)(nil)).Elem(), FunctionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FunctionMapInput)(nil)).Elem(), FunctionMap{})
	pulumi.RegisterOutputType(FunctionOutput{})
	pulumi.RegisterOutputType(FunctionArrayOutput{})
	pulumi.RegisterOutputType(FunctionMapOutput{})
}
