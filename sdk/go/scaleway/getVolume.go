// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package scaleway

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Gets information about a Volume.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-scaleway/sdk/go/scaleway"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := scaleway.LookupVolume(ctx, &scaleway.LookupVolumeArgs{
// 			Name: "data",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		test, err := scaleway.NewServer(ctx, "test", nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = scaleway.NewVolumeAttachment(ctx, "dataVolumeAttachment", &scaleway.VolumeAttachmentArgs{
// 			Server: test.ID(),
// 			Volume: pulumi.Any(scaleway_volume.Data.Id),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupVolume(ctx *pulumi.Context, args *LookupVolumeArgs, opts ...pulumi.InvokeOption) (*LookupVolumeResult, error) {
	var rv LookupVolumeResult
	err := ctx.Invoke("scaleway:index/getVolume:getVolume", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getVolume.
type LookupVolumeArgs struct {
	// Exact name of the Volume.
	Name string `pulumi:"name"`
}

// A collection of values returned by getVolume.
type LookupVolumeResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// The ID of the Server which this Volume is currently attached to.
	Server string `pulumi:"server"`
	// (Required) size of the volume in GB
	SizeInGb int `pulumi:"sizeInGb"`
	// The type of volume this is, such as `lSsd`.
	Type string `pulumi:"type"`
}
