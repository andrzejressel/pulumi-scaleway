// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package scaleway

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates and manages Scaleway Compute Instance servers. For more information, see [the documentation](https://developers.scaleway.com/en/products/instance/api/#servers-8bf7d7).
//
// Please check our [FAQ - Instances](https://www.scaleway.com/en/docs/faq/instances).
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
//			publicIp, err := scaleway.NewInstanceIp(ctx, "publicIp", nil)
//			if err != nil {
//				return err
//			}
//			_, err = scaleway.NewInstanceServer(ctx, "web", &scaleway.InstanceServerArgs{
//				Type:  pulumi.String("DEV1-S"),
//				Image: pulumi.String("ubuntu_jammy"),
//				IpId:  publicIp.ID(),
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
// ### With additional volumes and tags
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
//			data, err := scaleway.NewInstanceVolume(ctx, "data", &scaleway.InstanceVolumeArgs{
//				SizeInGb: pulumi.Int(100),
//				Type:     pulumi.String("b_ssd"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = scaleway.NewInstanceServer(ctx, "web", &scaleway.InstanceServerArgs{
//				Type:  pulumi.String("DEV1-S"),
//				Image: pulumi.String("ubuntu_jammy"),
//				Tags: pulumi.StringArray{
//					pulumi.String("hello"),
//					pulumi.String("public"),
//				},
//				RootVolume: &scaleway.InstanceServerRootVolumeArgs{
//					DeleteOnTermination: pulumi.Bool(false),
//				},
//				AdditionalVolumeIds: pulumi.StringArray{
//					data.ID(),
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
// ### With a reserved IP
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
//			ip, err := scaleway.NewInstanceIp(ctx, "ip", nil)
//			if err != nil {
//				return err
//			}
//			_, err = scaleway.NewInstanceServer(ctx, "web", &scaleway.InstanceServerArgs{
//				Type:  pulumi.String("DEV1-S"),
//				Image: pulumi.String("f974feac-abae-4365-b988-8ec7d1cec10d"),
//				Tags: pulumi.StringArray{
//					pulumi.String("hello"),
//					pulumi.String("public"),
//				},
//				IpId: ip.ID(),
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
// ### With security group
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
//			www, err := scaleway.NewInstanceSecurityGroup(ctx, "www", &scaleway.InstanceSecurityGroupArgs{
//				InboundDefaultPolicy:  pulumi.String("drop"),
//				OutboundDefaultPolicy: pulumi.String("accept"),
//				InboundRules: scaleway.InstanceSecurityGroupInboundRuleArray{
//					&scaleway.InstanceSecurityGroupInboundRuleArgs{
//						Action: pulumi.String("accept"),
//						Port:   pulumi.Int(22),
//						Ip:     pulumi.String("212.47.225.64"),
//					},
//					&scaleway.InstanceSecurityGroupInboundRuleArgs{
//						Action: pulumi.String("accept"),
//						Port:   pulumi.Int(80),
//					},
//					&scaleway.InstanceSecurityGroupInboundRuleArgs{
//						Action: pulumi.String("accept"),
//						Port:   pulumi.Int(443),
//					},
//				},
//				OutboundRules: scaleway.InstanceSecurityGroupOutboundRuleArray{
//					&scaleway.InstanceSecurityGroupOutboundRuleArgs{
//						Action:  pulumi.String("drop"),
//						IpRange: pulumi.String("10.20.0.0/24"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = scaleway.NewInstanceServer(ctx, "web", &scaleway.InstanceServerArgs{
//				Type:            pulumi.String("DEV1-S"),
//				Image:           pulumi.String("ubuntu_jammy"),
//				SecurityGroupId: www.ID(),
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
// ### With user data and cloud-init
//
// ```go
// package main
//
// import (
//
//	"fmt"
//	"io/ioutil"
//
//	"github.com/lbrlabs/pulumi-scaleway/sdk/go/scaleway"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func readFileOrPanic(path string) pulumi.StringPtrInput {
//		data, err := ioutil.ReadFile(path)
//		if err != nil {
//			panic(err.Error())
//		}
//		return pulumi.String(string(data))
//	}
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := scaleway.NewInstanceServer(ctx, "web", &scaleway.InstanceServerArgs{
//				Type:  pulumi.String("DEV1-S"),
//				Image: pulumi.String("ubuntu_jammy"),
//				UserData: pulumi.StringMap{
//					"foo":        pulumi.String("bar"),
//					"cloud-init": readFileOrPanic(fmt.Sprintf("%v/cloud-init.yml", path.Module)),
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
// ### With private network
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
//			pn01, err := scaleway.NewVpcPrivateNetwork(ctx, "pn01", nil)
//			if err != nil {
//				return err
//			}
//			_, err = scaleway.NewInstanceServer(ctx, "base", &scaleway.InstanceServerArgs{
//				Image: pulumi.String("ubuntu_jammy"),
//				Type:  pulumi.String("DEV1-S"),
//				PrivateNetworks: scaleway.InstanceServerPrivateNetworkArray{
//					&scaleway.InstanceServerPrivateNetworkArgs{
//						PnId: pn01.ID(),
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
// ### Root volume configuration
//
// #### Resized block volume with installed image
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
//			_, err := scaleway.NewInstanceServer(ctx, "image", &scaleway.InstanceServerArgs{
//				Image: pulumi.String("ubuntu_jammy"),
//				RootVolume: &scaleway.InstanceServerRootVolumeArgs{
//					SizeInGb:   pulumi.Int(100),
//					VolumeType: pulumi.String("b_ssd"),
//				},
//				Type: pulumi.String("PRO2-XXS"),
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
// #### From snapshot
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
//			snapshot, err := scaleway.LookupInstanceSnapshot(ctx, &scaleway.LookupInstanceSnapshotArgs{
//				Name: pulumi.StringRef("my_snapshot"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			fromSnapshotInstanceVolume, err := scaleway.NewInstanceVolume(ctx, "fromSnapshotInstanceVolume", &scaleway.InstanceVolumeArgs{
//				FromSnapshotId: pulumi.String(snapshot.Id),
//				Type:           pulumi.String("b_ssd"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = scaleway.NewInstanceServer(ctx, "fromSnapshotInstanceServer", &scaleway.InstanceServerArgs{
//				Type: pulumi.String("PRO2-XXS"),
//				RootVolume: &scaleway.InstanceServerRootVolumeArgs{
//					VolumeId: fromSnapshotInstanceVolume.ID(),
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
// ## Private Network
//
// > **Important:** Updates to `privateNetwork` will recreate a new private network interface.
//
// - `pnId` - (Required) The private network ID where to connect.
// - `macAddress` The private NIC MAC address.
// - `status` The private NIC state.
// - `zone` - (Defaults to provider `zone`) The zone in which the server must be created.
//
// > **Important:**
//
// - You can only attach an instance in the same zone as a private network.
// - Instance supports maximum 8 different private networks.
//
// ## Import
//
// Instance servers can be imported using the `{zone}/{id}`, e.g. bash
//
// ```sh
//
//	$ pulumi import scaleway:index/instanceServer:InstanceServer web fr-par-1/11111111-1111-1111-1111-111111111111
//
// ```
type InstanceServer struct {
	pulumi.CustomResourceState

	// The [additional volumes](https://developers.scaleway.com/en/products/instance/api/#volumes-7e8a39)
	// attached to the server. Updates to this field will trigger a stop/start of the server.
	AdditionalVolumeIds pulumi.StringArrayOutput `pulumi:"additionalVolumeIds"`
	// The boot Type of the server. Possible values are: `local`, `bootscript` or `rescue`.
	BootType pulumi.StringPtrOutput `pulumi:"bootType"`
	// The ID of the bootscript to use  (set bootType to `bootscript`).
	BootscriptId pulumi.StringOutput `pulumi:"bootscriptId"`
	// The cloud init script associated with this server
	CloudInit pulumi.StringOutput `pulumi:"cloudInit"`
	// If true a dynamic IP will be attached to the server.
	EnableDynamicIp pulumi.BoolPtrOutput `pulumi:"enableDynamicIp"`
	// Determines if IPv6 is enabled for the server.
	EnableIpv6 pulumi.BoolPtrOutput `pulumi:"enableIpv6"`
	// The UUID or the label of the base image used by the server. You can use [this endpoint](https://api-marketplace.scaleway.com/images?page=1&per_page=100)
	// to find either the right `label` or the right local image `ID` for a given `type`. Optional when creating an instance with an existing root volume.
	Image pulumi.StringPtrOutput `pulumi:"image"`
	// = (Optional) The ID of the reserved IP that is attached to the server.
	IpId pulumi.StringPtrOutput `pulumi:"ipId"`
	// The default ipv6 address routed to the server. ( Only set when enableIpv6 is set to true )
	Ipv6Address pulumi.StringOutput `pulumi:"ipv6Address"`
	// The ipv6 gateway address. ( Only set when enableIpv6 is set to true )
	Ipv6Gateway pulumi.StringOutput `pulumi:"ipv6Gateway"`
	// The prefix length of the ipv6 subnet routed to the server. ( Only set when enableIpv6 is set to true )
	Ipv6PrefixLength pulumi.IntOutput `pulumi:"ipv6PrefixLength"`
	// The name of the server.
	Name pulumi.StringOutput `pulumi:"name"`
	// The organization ID the server is associated with.
	OrganizationId pulumi.StringOutput `pulumi:"organizationId"`
	// The [placement group](https://developers.scaleway.com/en/products/instance/api/#placement-groups-d8f653) the server is attached to.
	PlacementGroupId pulumi.StringPtrOutput `pulumi:"placementGroupId"`
	// True when the placement group policy is respected.
	// - `rootVolume`
	PlacementGroupPolicyRespected pulumi.BoolOutput `pulumi:"placementGroupPolicyRespected"`
	// The Scaleway internal IP address of the server.
	PrivateIp pulumi.StringOutput `pulumi:"privateIp"`
	// The private network associated with the server.
	// Use the `pnId` key to attach a [privateNetwork](https://developers.scaleway.com/en/products/instance/api/#private-nics-a42eea) on your instance.
	PrivateNetworks InstanceServerPrivateNetworkArrayOutput `pulumi:"privateNetworks"`
	// `projectId`) The ID of the project the server is associated with.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// The public IPv4 address of the server.
	PublicIp pulumi.StringOutput `pulumi:"publicIp"`
	// Root [volume](https://developers.scaleway.com/en/products/instance/api/#volumes-7e8a39) attached to the server on creation.
	RootVolume InstanceServerRootVolumeOutput `pulumi:"rootVolume"`
	// The [security group](https://developers.scaleway.com/en/products/instance/api/#security-groups-8d7f89) the server is attached to.
	SecurityGroupId pulumi.StringOutput `pulumi:"securityGroupId"`
	// The state of the server. Possible values are: `started`, `stopped` or `standby`.
	State pulumi.StringPtrOutput `pulumi:"state"`
	// The tags associated with the server.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// The commercial type of the server.
	// You find all the available types on the [pricing page](https://www.scaleway.com/en/pricing/).
	// Updates to this field will recreate a new resource.
	Type pulumi.StringOutput `pulumi:"type"`
	// The user data associated with the server
	UserData pulumi.StringMapOutput `pulumi:"userData"`
	// `zone`) The zone in which the server should be created.
	Zone pulumi.StringOutput `pulumi:"zone"`
}

// NewInstanceServer registers a new resource with the given unique name, arguments, and options.
func NewInstanceServer(ctx *pulumi.Context,
	name string, args *InstanceServerArgs, opts ...pulumi.ResourceOption) (*InstanceServer, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource InstanceServer
	err := ctx.RegisterResource("scaleway:index/instanceServer:InstanceServer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInstanceServer gets an existing InstanceServer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInstanceServer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InstanceServerState, opts ...pulumi.ResourceOption) (*InstanceServer, error) {
	var resource InstanceServer
	err := ctx.ReadResource("scaleway:index/instanceServer:InstanceServer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InstanceServer resources.
type instanceServerState struct {
	// The [additional volumes](https://developers.scaleway.com/en/products/instance/api/#volumes-7e8a39)
	// attached to the server. Updates to this field will trigger a stop/start of the server.
	AdditionalVolumeIds []string `pulumi:"additionalVolumeIds"`
	// The boot Type of the server. Possible values are: `local`, `bootscript` or `rescue`.
	BootType *string `pulumi:"bootType"`
	// The ID of the bootscript to use  (set bootType to `bootscript`).
	BootscriptId *string `pulumi:"bootscriptId"`
	// The cloud init script associated with this server
	CloudInit *string `pulumi:"cloudInit"`
	// If true a dynamic IP will be attached to the server.
	EnableDynamicIp *bool `pulumi:"enableDynamicIp"`
	// Determines if IPv6 is enabled for the server.
	EnableIpv6 *bool `pulumi:"enableIpv6"`
	// The UUID or the label of the base image used by the server. You can use [this endpoint](https://api-marketplace.scaleway.com/images?page=1&per_page=100)
	// to find either the right `label` or the right local image `ID` for a given `type`. Optional when creating an instance with an existing root volume.
	Image *string `pulumi:"image"`
	// = (Optional) The ID of the reserved IP that is attached to the server.
	IpId *string `pulumi:"ipId"`
	// The default ipv6 address routed to the server. ( Only set when enableIpv6 is set to true )
	Ipv6Address *string `pulumi:"ipv6Address"`
	// The ipv6 gateway address. ( Only set when enableIpv6 is set to true )
	Ipv6Gateway *string `pulumi:"ipv6Gateway"`
	// The prefix length of the ipv6 subnet routed to the server. ( Only set when enableIpv6 is set to true )
	Ipv6PrefixLength *int `pulumi:"ipv6PrefixLength"`
	// The name of the server.
	Name *string `pulumi:"name"`
	// The organization ID the server is associated with.
	OrganizationId *string `pulumi:"organizationId"`
	// The [placement group](https://developers.scaleway.com/en/products/instance/api/#placement-groups-d8f653) the server is attached to.
	PlacementGroupId *string `pulumi:"placementGroupId"`
	// True when the placement group policy is respected.
	// - `rootVolume`
	PlacementGroupPolicyRespected *bool `pulumi:"placementGroupPolicyRespected"`
	// The Scaleway internal IP address of the server.
	PrivateIp *string `pulumi:"privateIp"`
	// The private network associated with the server.
	// Use the `pnId` key to attach a [privateNetwork](https://developers.scaleway.com/en/products/instance/api/#private-nics-a42eea) on your instance.
	PrivateNetworks []InstanceServerPrivateNetwork `pulumi:"privateNetworks"`
	// `projectId`) The ID of the project the server is associated with.
	ProjectId *string `pulumi:"projectId"`
	// The public IPv4 address of the server.
	PublicIp *string `pulumi:"publicIp"`
	// Root [volume](https://developers.scaleway.com/en/products/instance/api/#volumes-7e8a39) attached to the server on creation.
	RootVolume *InstanceServerRootVolume `pulumi:"rootVolume"`
	// The [security group](https://developers.scaleway.com/en/products/instance/api/#security-groups-8d7f89) the server is attached to.
	SecurityGroupId *string `pulumi:"securityGroupId"`
	// The state of the server. Possible values are: `started`, `stopped` or `standby`.
	State *string `pulumi:"state"`
	// The tags associated with the server.
	Tags []string `pulumi:"tags"`
	// The commercial type of the server.
	// You find all the available types on the [pricing page](https://www.scaleway.com/en/pricing/).
	// Updates to this field will recreate a new resource.
	Type *string `pulumi:"type"`
	// The user data associated with the server
	UserData map[string]string `pulumi:"userData"`
	// `zone`) The zone in which the server should be created.
	Zone *string `pulumi:"zone"`
}

type InstanceServerState struct {
	// The [additional volumes](https://developers.scaleway.com/en/products/instance/api/#volumes-7e8a39)
	// attached to the server. Updates to this field will trigger a stop/start of the server.
	AdditionalVolumeIds pulumi.StringArrayInput
	// The boot Type of the server. Possible values are: `local`, `bootscript` or `rescue`.
	BootType pulumi.StringPtrInput
	// The ID of the bootscript to use  (set bootType to `bootscript`).
	BootscriptId pulumi.StringPtrInput
	// The cloud init script associated with this server
	CloudInit pulumi.StringPtrInput
	// If true a dynamic IP will be attached to the server.
	EnableDynamicIp pulumi.BoolPtrInput
	// Determines if IPv6 is enabled for the server.
	EnableIpv6 pulumi.BoolPtrInput
	// The UUID or the label of the base image used by the server. You can use [this endpoint](https://api-marketplace.scaleway.com/images?page=1&per_page=100)
	// to find either the right `label` or the right local image `ID` for a given `type`. Optional when creating an instance with an existing root volume.
	Image pulumi.StringPtrInput
	// = (Optional) The ID of the reserved IP that is attached to the server.
	IpId pulumi.StringPtrInput
	// The default ipv6 address routed to the server. ( Only set when enableIpv6 is set to true )
	Ipv6Address pulumi.StringPtrInput
	// The ipv6 gateway address. ( Only set when enableIpv6 is set to true )
	Ipv6Gateway pulumi.StringPtrInput
	// The prefix length of the ipv6 subnet routed to the server. ( Only set when enableIpv6 is set to true )
	Ipv6PrefixLength pulumi.IntPtrInput
	// The name of the server.
	Name pulumi.StringPtrInput
	// The organization ID the server is associated with.
	OrganizationId pulumi.StringPtrInput
	// The [placement group](https://developers.scaleway.com/en/products/instance/api/#placement-groups-d8f653) the server is attached to.
	PlacementGroupId pulumi.StringPtrInput
	// True when the placement group policy is respected.
	// - `rootVolume`
	PlacementGroupPolicyRespected pulumi.BoolPtrInput
	// The Scaleway internal IP address of the server.
	PrivateIp pulumi.StringPtrInput
	// The private network associated with the server.
	// Use the `pnId` key to attach a [privateNetwork](https://developers.scaleway.com/en/products/instance/api/#private-nics-a42eea) on your instance.
	PrivateNetworks InstanceServerPrivateNetworkArrayInput
	// `projectId`) The ID of the project the server is associated with.
	ProjectId pulumi.StringPtrInput
	// The public IPv4 address of the server.
	PublicIp pulumi.StringPtrInput
	// Root [volume](https://developers.scaleway.com/en/products/instance/api/#volumes-7e8a39) attached to the server on creation.
	RootVolume InstanceServerRootVolumePtrInput
	// The [security group](https://developers.scaleway.com/en/products/instance/api/#security-groups-8d7f89) the server is attached to.
	SecurityGroupId pulumi.StringPtrInput
	// The state of the server. Possible values are: `started`, `stopped` or `standby`.
	State pulumi.StringPtrInput
	// The tags associated with the server.
	Tags pulumi.StringArrayInput
	// The commercial type of the server.
	// You find all the available types on the [pricing page](https://www.scaleway.com/en/pricing/).
	// Updates to this field will recreate a new resource.
	Type pulumi.StringPtrInput
	// The user data associated with the server
	UserData pulumi.StringMapInput
	// `zone`) The zone in which the server should be created.
	Zone pulumi.StringPtrInput
}

func (InstanceServerState) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceServerState)(nil)).Elem()
}

type instanceServerArgs struct {
	// The [additional volumes](https://developers.scaleway.com/en/products/instance/api/#volumes-7e8a39)
	// attached to the server. Updates to this field will trigger a stop/start of the server.
	AdditionalVolumeIds []string `pulumi:"additionalVolumeIds"`
	// The boot Type of the server. Possible values are: `local`, `bootscript` or `rescue`.
	BootType *string `pulumi:"bootType"`
	// The ID of the bootscript to use  (set bootType to `bootscript`).
	BootscriptId *string `pulumi:"bootscriptId"`
	// The cloud init script associated with this server
	CloudInit *string `pulumi:"cloudInit"`
	// If true a dynamic IP will be attached to the server.
	EnableDynamicIp *bool `pulumi:"enableDynamicIp"`
	// Determines if IPv6 is enabled for the server.
	EnableIpv6 *bool `pulumi:"enableIpv6"`
	// The UUID or the label of the base image used by the server. You can use [this endpoint](https://api-marketplace.scaleway.com/images?page=1&per_page=100)
	// to find either the right `label` or the right local image `ID` for a given `type`. Optional when creating an instance with an existing root volume.
	Image *string `pulumi:"image"`
	// = (Optional) The ID of the reserved IP that is attached to the server.
	IpId *string `pulumi:"ipId"`
	// The name of the server.
	Name *string `pulumi:"name"`
	// The [placement group](https://developers.scaleway.com/en/products/instance/api/#placement-groups-d8f653) the server is attached to.
	PlacementGroupId *string `pulumi:"placementGroupId"`
	// The private network associated with the server.
	// Use the `pnId` key to attach a [privateNetwork](https://developers.scaleway.com/en/products/instance/api/#private-nics-a42eea) on your instance.
	PrivateNetworks []InstanceServerPrivateNetwork `pulumi:"privateNetworks"`
	// `projectId`) The ID of the project the server is associated with.
	ProjectId *string `pulumi:"projectId"`
	// Root [volume](https://developers.scaleway.com/en/products/instance/api/#volumes-7e8a39) attached to the server on creation.
	RootVolume *InstanceServerRootVolume `pulumi:"rootVolume"`
	// The [security group](https://developers.scaleway.com/en/products/instance/api/#security-groups-8d7f89) the server is attached to.
	SecurityGroupId *string `pulumi:"securityGroupId"`
	// The state of the server. Possible values are: `started`, `stopped` or `standby`.
	State *string `pulumi:"state"`
	// The tags associated with the server.
	Tags []string `pulumi:"tags"`
	// The commercial type of the server.
	// You find all the available types on the [pricing page](https://www.scaleway.com/en/pricing/).
	// Updates to this field will recreate a new resource.
	Type string `pulumi:"type"`
	// The user data associated with the server
	UserData map[string]string `pulumi:"userData"`
	// `zone`) The zone in which the server should be created.
	Zone *string `pulumi:"zone"`
}

// The set of arguments for constructing a InstanceServer resource.
type InstanceServerArgs struct {
	// The [additional volumes](https://developers.scaleway.com/en/products/instance/api/#volumes-7e8a39)
	// attached to the server. Updates to this field will trigger a stop/start of the server.
	AdditionalVolumeIds pulumi.StringArrayInput
	// The boot Type of the server. Possible values are: `local`, `bootscript` or `rescue`.
	BootType pulumi.StringPtrInput
	// The ID of the bootscript to use  (set bootType to `bootscript`).
	BootscriptId pulumi.StringPtrInput
	// The cloud init script associated with this server
	CloudInit pulumi.StringPtrInput
	// If true a dynamic IP will be attached to the server.
	EnableDynamicIp pulumi.BoolPtrInput
	// Determines if IPv6 is enabled for the server.
	EnableIpv6 pulumi.BoolPtrInput
	// The UUID or the label of the base image used by the server. You can use [this endpoint](https://api-marketplace.scaleway.com/images?page=1&per_page=100)
	// to find either the right `label` or the right local image `ID` for a given `type`. Optional when creating an instance with an existing root volume.
	Image pulumi.StringPtrInput
	// = (Optional) The ID of the reserved IP that is attached to the server.
	IpId pulumi.StringPtrInput
	// The name of the server.
	Name pulumi.StringPtrInput
	// The [placement group](https://developers.scaleway.com/en/products/instance/api/#placement-groups-d8f653) the server is attached to.
	PlacementGroupId pulumi.StringPtrInput
	// The private network associated with the server.
	// Use the `pnId` key to attach a [privateNetwork](https://developers.scaleway.com/en/products/instance/api/#private-nics-a42eea) on your instance.
	PrivateNetworks InstanceServerPrivateNetworkArrayInput
	// `projectId`) The ID of the project the server is associated with.
	ProjectId pulumi.StringPtrInput
	// Root [volume](https://developers.scaleway.com/en/products/instance/api/#volumes-7e8a39) attached to the server on creation.
	RootVolume InstanceServerRootVolumePtrInput
	// The [security group](https://developers.scaleway.com/en/products/instance/api/#security-groups-8d7f89) the server is attached to.
	SecurityGroupId pulumi.StringPtrInput
	// The state of the server. Possible values are: `started`, `stopped` or `standby`.
	State pulumi.StringPtrInput
	// The tags associated with the server.
	Tags pulumi.StringArrayInput
	// The commercial type of the server.
	// You find all the available types on the [pricing page](https://www.scaleway.com/en/pricing/).
	// Updates to this field will recreate a new resource.
	Type pulumi.StringInput
	// The user data associated with the server
	UserData pulumi.StringMapInput
	// `zone`) The zone in which the server should be created.
	Zone pulumi.StringPtrInput
}

func (InstanceServerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*instanceServerArgs)(nil)).Elem()
}

type InstanceServerInput interface {
	pulumi.Input

	ToInstanceServerOutput() InstanceServerOutput
	ToInstanceServerOutputWithContext(ctx context.Context) InstanceServerOutput
}

func (*InstanceServer) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceServer)(nil)).Elem()
}

func (i *InstanceServer) ToInstanceServerOutput() InstanceServerOutput {
	return i.ToInstanceServerOutputWithContext(context.Background())
}

func (i *InstanceServer) ToInstanceServerOutputWithContext(ctx context.Context) InstanceServerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceServerOutput)
}

// InstanceServerArrayInput is an input type that accepts InstanceServerArray and InstanceServerArrayOutput values.
// You can construct a concrete instance of `InstanceServerArrayInput` via:
//
//	InstanceServerArray{ InstanceServerArgs{...} }
type InstanceServerArrayInput interface {
	pulumi.Input

	ToInstanceServerArrayOutput() InstanceServerArrayOutput
	ToInstanceServerArrayOutputWithContext(context.Context) InstanceServerArrayOutput
}

type InstanceServerArray []InstanceServerInput

func (InstanceServerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceServer)(nil)).Elem()
}

func (i InstanceServerArray) ToInstanceServerArrayOutput() InstanceServerArrayOutput {
	return i.ToInstanceServerArrayOutputWithContext(context.Background())
}

func (i InstanceServerArray) ToInstanceServerArrayOutputWithContext(ctx context.Context) InstanceServerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceServerArrayOutput)
}

// InstanceServerMapInput is an input type that accepts InstanceServerMap and InstanceServerMapOutput values.
// You can construct a concrete instance of `InstanceServerMapInput` via:
//
//	InstanceServerMap{ "key": InstanceServerArgs{...} }
type InstanceServerMapInput interface {
	pulumi.Input

	ToInstanceServerMapOutput() InstanceServerMapOutput
	ToInstanceServerMapOutputWithContext(context.Context) InstanceServerMapOutput
}

type InstanceServerMap map[string]InstanceServerInput

func (InstanceServerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceServer)(nil)).Elem()
}

func (i InstanceServerMap) ToInstanceServerMapOutput() InstanceServerMapOutput {
	return i.ToInstanceServerMapOutputWithContext(context.Background())
}

func (i InstanceServerMap) ToInstanceServerMapOutputWithContext(ctx context.Context) InstanceServerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InstanceServerMapOutput)
}

type InstanceServerOutput struct{ *pulumi.OutputState }

func (InstanceServerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InstanceServer)(nil)).Elem()
}

func (o InstanceServerOutput) ToInstanceServerOutput() InstanceServerOutput {
	return o
}

func (o InstanceServerOutput) ToInstanceServerOutputWithContext(ctx context.Context) InstanceServerOutput {
	return o
}

// The [additional volumes](https://developers.scaleway.com/en/products/instance/api/#volumes-7e8a39)
// attached to the server. Updates to this field will trigger a stop/start of the server.
func (o InstanceServerOutput) AdditionalVolumeIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *InstanceServer) pulumi.StringArrayOutput { return v.AdditionalVolumeIds }).(pulumi.StringArrayOutput)
}

// The boot Type of the server. Possible values are: `local`, `bootscript` or `rescue`.
func (o InstanceServerOutput) BootType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *InstanceServer) pulumi.StringPtrOutput { return v.BootType }).(pulumi.StringPtrOutput)
}

// The ID of the bootscript to use  (set bootType to `bootscript`).
func (o InstanceServerOutput) BootscriptId() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceServer) pulumi.StringOutput { return v.BootscriptId }).(pulumi.StringOutput)
}

// The cloud init script associated with this server
func (o InstanceServerOutput) CloudInit() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceServer) pulumi.StringOutput { return v.CloudInit }).(pulumi.StringOutput)
}

// If true a dynamic IP will be attached to the server.
func (o InstanceServerOutput) EnableDynamicIp() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *InstanceServer) pulumi.BoolPtrOutput { return v.EnableDynamicIp }).(pulumi.BoolPtrOutput)
}

// Determines if IPv6 is enabled for the server.
func (o InstanceServerOutput) EnableIpv6() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *InstanceServer) pulumi.BoolPtrOutput { return v.EnableIpv6 }).(pulumi.BoolPtrOutput)
}

// The UUID or the label of the base image used by the server. You can use [this endpoint](https://api-marketplace.scaleway.com/images?page=1&per_page=100)
// to find either the right `label` or the right local image `ID` for a given `type`. Optional when creating an instance with an existing root volume.
func (o InstanceServerOutput) Image() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *InstanceServer) pulumi.StringPtrOutput { return v.Image }).(pulumi.StringPtrOutput)
}

// = (Optional) The ID of the reserved IP that is attached to the server.
func (o InstanceServerOutput) IpId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *InstanceServer) pulumi.StringPtrOutput { return v.IpId }).(pulumi.StringPtrOutput)
}

// The default ipv6 address routed to the server. ( Only set when enableIpv6 is set to true )
func (o InstanceServerOutput) Ipv6Address() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceServer) pulumi.StringOutput { return v.Ipv6Address }).(pulumi.StringOutput)
}

// The ipv6 gateway address. ( Only set when enableIpv6 is set to true )
func (o InstanceServerOutput) Ipv6Gateway() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceServer) pulumi.StringOutput { return v.Ipv6Gateway }).(pulumi.StringOutput)
}

// The prefix length of the ipv6 subnet routed to the server. ( Only set when enableIpv6 is set to true )
func (o InstanceServerOutput) Ipv6PrefixLength() pulumi.IntOutput {
	return o.ApplyT(func(v *InstanceServer) pulumi.IntOutput { return v.Ipv6PrefixLength }).(pulumi.IntOutput)
}

// The name of the server.
func (o InstanceServerOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceServer) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The organization ID the server is associated with.
func (o InstanceServerOutput) OrganizationId() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceServer) pulumi.StringOutput { return v.OrganizationId }).(pulumi.StringOutput)
}

// The [placement group](https://developers.scaleway.com/en/products/instance/api/#placement-groups-d8f653) the server is attached to.
func (o InstanceServerOutput) PlacementGroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *InstanceServer) pulumi.StringPtrOutput { return v.PlacementGroupId }).(pulumi.StringPtrOutput)
}

// True when the placement group policy is respected.
// - `rootVolume`
func (o InstanceServerOutput) PlacementGroupPolicyRespected() pulumi.BoolOutput {
	return o.ApplyT(func(v *InstanceServer) pulumi.BoolOutput { return v.PlacementGroupPolicyRespected }).(pulumi.BoolOutput)
}

// The Scaleway internal IP address of the server.
func (o InstanceServerOutput) PrivateIp() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceServer) pulumi.StringOutput { return v.PrivateIp }).(pulumi.StringOutput)
}

// The private network associated with the server.
// Use the `pnId` key to attach a [privateNetwork](https://developers.scaleway.com/en/products/instance/api/#private-nics-a42eea) on your instance.
func (o InstanceServerOutput) PrivateNetworks() InstanceServerPrivateNetworkArrayOutput {
	return o.ApplyT(func(v *InstanceServer) InstanceServerPrivateNetworkArrayOutput { return v.PrivateNetworks }).(InstanceServerPrivateNetworkArrayOutput)
}

// `projectId`) The ID of the project the server is associated with.
func (o InstanceServerOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceServer) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// The public IPv4 address of the server.
func (o InstanceServerOutput) PublicIp() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceServer) pulumi.StringOutput { return v.PublicIp }).(pulumi.StringOutput)
}

// Root [volume](https://developers.scaleway.com/en/products/instance/api/#volumes-7e8a39) attached to the server on creation.
func (o InstanceServerOutput) RootVolume() InstanceServerRootVolumeOutput {
	return o.ApplyT(func(v *InstanceServer) InstanceServerRootVolumeOutput { return v.RootVolume }).(InstanceServerRootVolumeOutput)
}

// The [security group](https://developers.scaleway.com/en/products/instance/api/#security-groups-8d7f89) the server is attached to.
func (o InstanceServerOutput) SecurityGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceServer) pulumi.StringOutput { return v.SecurityGroupId }).(pulumi.StringOutput)
}

// The state of the server. Possible values are: `started`, `stopped` or `standby`.
func (o InstanceServerOutput) State() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *InstanceServer) pulumi.StringPtrOutput { return v.State }).(pulumi.StringPtrOutput)
}

// The tags associated with the server.
func (o InstanceServerOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *InstanceServer) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// The commercial type of the server.
// You find all the available types on the [pricing page](https://www.scaleway.com/en/pricing/).
// Updates to this field will recreate a new resource.
func (o InstanceServerOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceServer) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// The user data associated with the server
func (o InstanceServerOutput) UserData() pulumi.StringMapOutput {
	return o.ApplyT(func(v *InstanceServer) pulumi.StringMapOutput { return v.UserData }).(pulumi.StringMapOutput)
}

// `zone`) The zone in which the server should be created.
func (o InstanceServerOutput) Zone() pulumi.StringOutput {
	return o.ApplyT(func(v *InstanceServer) pulumi.StringOutput { return v.Zone }).(pulumi.StringOutput)
}

type InstanceServerArrayOutput struct{ *pulumi.OutputState }

func (InstanceServerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*InstanceServer)(nil)).Elem()
}

func (o InstanceServerArrayOutput) ToInstanceServerArrayOutput() InstanceServerArrayOutput {
	return o
}

func (o InstanceServerArrayOutput) ToInstanceServerArrayOutputWithContext(ctx context.Context) InstanceServerArrayOutput {
	return o
}

func (o InstanceServerArrayOutput) Index(i pulumi.IntInput) InstanceServerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *InstanceServer {
		return vs[0].([]*InstanceServer)[vs[1].(int)]
	}).(InstanceServerOutput)
}

type InstanceServerMapOutput struct{ *pulumi.OutputState }

func (InstanceServerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*InstanceServer)(nil)).Elem()
}

func (o InstanceServerMapOutput) ToInstanceServerMapOutput() InstanceServerMapOutput {
	return o
}

func (o InstanceServerMapOutput) ToInstanceServerMapOutputWithContext(ctx context.Context) InstanceServerMapOutput {
	return o
}

func (o InstanceServerMapOutput) MapIndex(k pulumi.StringInput) InstanceServerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *InstanceServer {
		return vs[0].(map[string]*InstanceServer)[vs[1].(string)]
	}).(InstanceServerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceServerInput)(nil)).Elem(), &InstanceServer{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceServerArrayInput)(nil)).Elem(), InstanceServerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*InstanceServerMapInput)(nil)).Elem(), InstanceServerMap{})
	pulumi.RegisterOutputType(InstanceServerOutput{})
	pulumi.RegisterOutputType(InstanceServerArrayOutput{})
	pulumi.RegisterOutputType(InstanceServerMapOutput{})
}
