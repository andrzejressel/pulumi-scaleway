// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package scaleway

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Use this data source to get SSH key information based on its ID or name.
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
// 		opt0 := "11111111-1111-1111-1111-111111111111"
// 		_, err := scaleway.LookupAccountSshKey(ctx, &scaleway.LookupAccountSshKeyArgs{
// 			SshKeyId: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupAccountSshKey(ctx *pulumi.Context, args *LookupAccountSshKeyArgs, opts ...pulumi.InvokeOption) (*LookupAccountSshKeyResult, error) {
	var rv LookupAccountSshKeyResult
	err := ctx.Invoke("scaleway:index/getAccountSshKey:getAccountSshKey", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAccountSshKey.
type LookupAccountSshKeyArgs struct {
	// The SSH key name. Only one of `name` and `sshKeyId` should be specified.
	Name *string `pulumi:"name"`
	// `organizationId`) The ID of the organization the server is associated with.
	OrganizationId *string `pulumi:"organizationId"`
	// The SSH key id. Only one of `name` and `sshKeyId` should be specified.
	SshKeyId *string `pulumi:"sshKeyId"`
}

// A collection of values returned by getAccountSshKey.
type LookupAccountSshKeyResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id             string `pulumi:"id"`
	Name           string `pulumi:"name"`
	OrganizationId string `pulumi:"organizationId"`
	// The SSH public key string
	PublicKey string `pulumi:"publicKey"`
	SshKeyId  string `pulumi:"sshKeyId"`
}
