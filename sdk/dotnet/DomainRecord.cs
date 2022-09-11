// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs_Pulumi.Scaleway
{
    /// <summary>
    /// Creates and manages Scaleway Domain record.\
    /// For more information, see [the documentation](https://www.scaleway.com/en/docs/scaleway-dns/).
    /// 
    /// ## Examples
    /// 
    /// ### Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Scaleway = Lbrlabs_Pulumi.Scaleway;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var www = new Scaleway.DomainRecord("www", new()
    ///     {
    ///         Data = "1.2.3.4",
    ///         DnsZone = "domain.tld",
    ///         Ttl = 3600,
    ///         Type = "A",
    ///     });
    /// 
    ///     var www2 = new Scaleway.DomainRecord("www2", new()
    ///     {
    ///         Data = "1.2.3.5",
    ///         DnsZone = "domain.tld",
    ///         Ttl = 3600,
    ///         Type = "A",
    ///     });
    /// 
    ///     var mx = new Scaleway.DomainRecord("mx", new()
    ///     {
    ///         Data = "mx.online.net.",
    ///         DnsZone = "domain.tld",
    ///         Priority = 10,
    ///         Ttl = 3600,
    ///         Type = "MX",
    ///     });
    /// 
    ///     var mx2 = new Scaleway.DomainRecord("mx2", new()
    ///     {
    ///         Data = "mx-cache.online.net.",
    ///         DnsZone = "domain.tld",
    ///         Priority = 20,
    ///         Ttl = 3600,
    ///         Type = "MX",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### With dynamic records
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Scaleway = Lbrlabs_Pulumi.Scaleway;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var geoIp = new Scaleway.DomainRecord("geoIp", new()
    ///     {
    ///         Data = "1.2.3.4",
    ///         DnsZone = "domain.tld",
    ///         GeoIp = new Scaleway.Inputs.DomainRecordGeoIpArgs
    ///         {
    ///             Matches = new[]
    ///             {
    ///                 new Scaleway.Inputs.DomainRecordGeoIpMatchArgs
    ///                 {
    ///                     Continents = new[]
    ///                     {
    ///                         "EU",
    ///                     },
    ///                     Countries = new[]
    ///                     {
    ///                         "FR",
    ///                     },
    ///                     Data = "1.2.3.5",
    ///                 },
    ///                 new Scaleway.Inputs.DomainRecordGeoIpMatchArgs
    ///                 {
    ///                     Continents = new[]
    ///                     {
    ///                         "NA",
    ///                     },
    ///                     Data = "4.3.2.1",
    ///                 },
    ///             },
    ///         },
    ///         Ttl = 3600,
    ///         Type = "A",
    ///     });
    /// 
    ///     var httpService = new Scaleway.DomainRecord("httpService", new()
    ///     {
    ///         Data = "1.2.3.4",
    ///         DnsZone = "domain.tld",
    ///         HttpService = new Scaleway.Inputs.DomainRecordHttpServiceArgs
    ///         {
    ///             Ips = new[]
    ///             {
    ///                 "1.2.3.5",
    ///                 "1.2.3.6",
    ///             },
    ///             MustContain = "up",
    ///             Strategy = "hashed",
    ///             Url = "http://mywebsite.com/health",
    ///             UserAgent = "scw_service_up",
    ///         },
    ///         Ttl = 3600,
    ///         Type = "A",
    ///     });
    /// 
    ///     var view = new Scaleway.DomainRecord("view", new()
    ///     {
    ///         Data = "1.2.3.4",
    ///         DnsZone = "domain.tld",
    ///         Ttl = 3600,
    ///         Type = "A",
    ///         Views = new[]
    ///         {
    ///             new Scaleway.Inputs.DomainRecordViewArgs
    ///             {
    ///                 Data = "1.2.3.5",
    ///                 Subnet = "100.0.0.0/16",
    ///             },
    ///             new Scaleway.Inputs.DomainRecordViewArgs
    ///             {
    ///                 Data = "1.2.3.6",
    ///                 Subnet = "100.1.0.0/16",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var weighted = new Scaleway.DomainRecord("weighted", new()
    ///     {
    ///         Data = "1.2.3.4",
    ///         DnsZone = "domain.tld",
    ///         Ttl = 3600,
    ///         Type = "A",
    ///         Weighteds = new[]
    ///         {
    ///             new Scaleway.Inputs.DomainRecordWeightedArgs
    ///             {
    ///                 Ip = "1.2.3.5",
    ///                 Weight = 1,
    ///             },
    ///             new Scaleway.Inputs.DomainRecordWeightedArgs
    ///             {
    ///                 Ip = "1.2.3.6",
    ///                 Weight = 2,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Create an instance and add records with the new instance IP
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Scaleway = Lbrlabs_Pulumi.Scaleway;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var projectId = config.Require("projectId");
    ///     var dnsZone = config.Require("dnsZone");
    ///     var publicIp = new Scaleway.InstanceIp("publicIp", new()
    ///     {
    ///         ProjectId = projectId,
    ///     });
    /// 
    ///     var web = new Scaleway.InstanceServer("web", new()
    ///     {
    ///         ProjectId = projectId,
    ///         Type = "DEV1-S",
    ///         Image = "ubuntu_focal",
    ///         Tags = new[]
    ///         {
    ///             "front",
    ///             "web",
    ///         },
    ///         IpId = publicIp.Id,
    ///         RootVolume = new Scaleway.Inputs.InstanceServerRootVolumeArgs
    ///         {
    ///             SizeInGb = 20,
    ///         },
    ///     });
    /// 
    ///     var webA = new Scaleway.DomainRecord("webA", new()
    ///     {
    ///         DnsZone = dnsZone,
    ///         Type = "A",
    ///         Data = web.PublicIp,
    ///         Ttl = 3600,
    ///     });
    /// 
    ///     var webCname = new Scaleway.DomainRecord("webCname", new()
    ///     {
    ///         DnsZone = dnsZone,
    ///         Type = "CNAME",
    ///         Data = $"web.{dnsZone}.",
    ///         Ttl = 3600,
    ///     });
    /// 
    ///     var webAlias = new Scaleway.DomainRecord("webAlias", new()
    ///     {
    ///         DnsZone = dnsZone,
    ///         Type = "ALIAS",
    ///         Data = $"web.{dnsZone}.",
    ///         Ttl = 3600,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Multiple records
    /// 
    /// Some record types can have multiple `data` with the same `name` (eg: `A`, `AAAA`, `MX`, `NS`...).\
    /// You can duplicate a resource `scaleway.DomainRecord` with the same `name`, the records will be added.
    /// 
    /// Please note, some record (eg: `CNAME`, Multiple dynamic records of different types...) has to be unique.
    /// 
    /// ## Import
    /// 
    /// Record can be imported using the `{dns_zone}/{id}`, e.g. bash
    /// 
    /// ```sh
    ///  $ pulumi import scaleway:index/domainRecord:DomainRecord www subdomain.domain.tld/11111111-1111-1111-1111-111111111111
    /// ```
    /// </summary>
    [ScalewayResourceType("scaleway:index/domainRecord:DomainRecord")]
    public partial class DomainRecord : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The data of the view record
        /// </summary>
        [Output("data")]
        public Output<string> Data { get; private set; } = null!;

        /// <summary>
        /// The DNS Zone of the domain. If the DNS zone doesn't exist, it will be automatically created.
        /// </summary>
        [Output("dnsZone")]
        public Output<string> DnsZone { get; private set; } = null!;

        /// <summary>
        /// The Geo IP feature provides DNS resolution, based on the user’s geographical location. You can define a default IP that resolves if no Geo IP rule matches, and specify IPs for each geographical zone. [Documentation and usage example](https://www.scaleway.com/en/docs/scaleway-dns/#-Geo-IP-Records)
        /// </summary>
        [Output("geoIp")]
        public Output<Outputs.DomainRecordGeoIp?> GeoIp { get; private set; } = null!;

        /// <summary>
        /// The DNS service checks the provided URL on the configured IPs and resolves the request to one of the IPs by excluding the ones not responding to the given string to check. [Documentation and usage example](https://www.scaleway.com/en/docs/scaleway-dns/#-Healthcheck-records)
        /// </summary>
        [Output("httpService")]
        public Output<Outputs.DomainRecordHttpService?> HttpService { get; private set; } = null!;

        /// <summary>
        /// When destroying a resource, if only NS records remain and this is set to `false`, the zone will be deleted. Please note, each zone not deleted will [cost you money](https://www.scaleway.com/en/dns/)
        /// </summary>
        [Output("keepEmptyZone")]
        public Output<bool?> KeepEmptyZone { get; private set; } = null!;

        /// <summary>
        /// The name of the record (can be an empty string for a root record).
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The priority of the record (mostly used with an `MX` record)
        /// </summary>
        [Output("priority")]
        public Output<int> Priority { get; private set; } = null!;

        /// <summary>
        /// The project_id you want to attach the resource to
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Does the DNS zone is the root zone or not
        /// </summary>
        [Output("rootZone")]
        public Output<bool> RootZone { get; private set; } = null!;

        /// <summary>
        /// Time To Live of the record in seconds.
        /// </summary>
        [Output("ttl")]
        public Output<int?> Ttl { get; private set; } = null!;

        /// <summary>
        /// The type of the record (`A`, `AAAA`, `MX`, `CNAME`, `DNAME`, `ALIAS`, `NS`, `PTR`, `SRV`, `TXT`, `TLSA`, or `CAA`).
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// The answer to a DNS request is based on the client’s (resolver) subnet. *(Can be more than 1)* [Documentation and usage example](https://www.scaleway.com/en/docs/scaleway-dns/#-Views-records)
        /// </summary>
        [Output("views")]
        public Output<ImmutableArray<Outputs.DomainRecordView>> Views { get; private set; } = null!;

        /// <summary>
        /// You provide a list of IPs with their corresponding weights. These weights are used to proportionally direct requests to each IP. Depending on the weight of a record more or fewer requests are answered with its related IP compared to the others in the list. *(Can be more than 1)* [Documentation and usage example](https://www.scaleway.com/en/docs/scaleway-dns/#-Weight-Records)
        /// </summary>
        [Output("weighteds")]
        public Output<ImmutableArray<Outputs.DomainRecordWeighted>> Weighteds { get; private set; } = null!;


        /// <summary>
        /// Create a DomainRecord resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DomainRecord(string name, DomainRecordArgs args, CustomResourceOptions? options = null)
            : base("scaleway:index/domainRecord:DomainRecord", name, args ?? new DomainRecordArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DomainRecord(string name, Input<string> id, DomainRecordState? state = null, CustomResourceOptions? options = null)
            : base("scaleway:index/domainRecord:DomainRecord", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing DomainRecord resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DomainRecord Get(string name, Input<string> id, DomainRecordState? state = null, CustomResourceOptions? options = null)
        {
            return new DomainRecord(name, id, state, options);
        }
    }

    public sealed class DomainRecordArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The data of the view record
        /// </summary>
        [Input("data", required: true)]
        public Input<string> Data { get; set; } = null!;

        /// <summary>
        /// The DNS Zone of the domain. If the DNS zone doesn't exist, it will be automatically created.
        /// </summary>
        [Input("dnsZone", required: true)]
        public Input<string> DnsZone { get; set; } = null!;

        /// <summary>
        /// The Geo IP feature provides DNS resolution, based on the user’s geographical location. You can define a default IP that resolves if no Geo IP rule matches, and specify IPs for each geographical zone. [Documentation and usage example](https://www.scaleway.com/en/docs/scaleway-dns/#-Geo-IP-Records)
        /// </summary>
        [Input("geoIp")]
        public Input<Inputs.DomainRecordGeoIpArgs>? GeoIp { get; set; }

        /// <summary>
        /// The DNS service checks the provided URL on the configured IPs and resolves the request to one of the IPs by excluding the ones not responding to the given string to check. [Documentation and usage example](https://www.scaleway.com/en/docs/scaleway-dns/#-Healthcheck-records)
        /// </summary>
        [Input("httpService")]
        public Input<Inputs.DomainRecordHttpServiceArgs>? HttpService { get; set; }

        /// <summary>
        /// When destroying a resource, if only NS records remain and this is set to `false`, the zone will be deleted. Please note, each zone not deleted will [cost you money](https://www.scaleway.com/en/dns/)
        /// </summary>
        [Input("keepEmptyZone")]
        public Input<bool>? KeepEmptyZone { get; set; }

        /// <summary>
        /// The name of the record (can be an empty string for a root record).
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The priority of the record (mostly used with an `MX` record)
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The project_id you want to attach the resource to
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Time To Live of the record in seconds.
        /// </summary>
        [Input("ttl")]
        public Input<int>? Ttl { get; set; }

        /// <summary>
        /// The type of the record (`A`, `AAAA`, `MX`, `CNAME`, `DNAME`, `ALIAS`, `NS`, `PTR`, `SRV`, `TXT`, `TLSA`, or `CAA`).
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        [Input("views")]
        private InputList<Inputs.DomainRecordViewArgs>? _views;

        /// <summary>
        /// The answer to a DNS request is based on the client’s (resolver) subnet. *(Can be more than 1)* [Documentation and usage example](https://www.scaleway.com/en/docs/scaleway-dns/#-Views-records)
        /// </summary>
        public InputList<Inputs.DomainRecordViewArgs> Views
        {
            get => _views ?? (_views = new InputList<Inputs.DomainRecordViewArgs>());
            set => _views = value;
        }

        [Input("weighteds")]
        private InputList<Inputs.DomainRecordWeightedArgs>? _weighteds;

        /// <summary>
        /// You provide a list of IPs with their corresponding weights. These weights are used to proportionally direct requests to each IP. Depending on the weight of a record more or fewer requests are answered with its related IP compared to the others in the list. *(Can be more than 1)* [Documentation and usage example](https://www.scaleway.com/en/docs/scaleway-dns/#-Weight-Records)
        /// </summary>
        public InputList<Inputs.DomainRecordWeightedArgs> Weighteds
        {
            get => _weighteds ?? (_weighteds = new InputList<Inputs.DomainRecordWeightedArgs>());
            set => _weighteds = value;
        }

        public DomainRecordArgs()
        {
        }
        public static new DomainRecordArgs Empty => new DomainRecordArgs();
    }

    public sealed class DomainRecordState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The data of the view record
        /// </summary>
        [Input("data")]
        public Input<string>? Data { get; set; }

        /// <summary>
        /// The DNS Zone of the domain. If the DNS zone doesn't exist, it will be automatically created.
        /// </summary>
        [Input("dnsZone")]
        public Input<string>? DnsZone { get; set; }

        /// <summary>
        /// The Geo IP feature provides DNS resolution, based on the user’s geographical location. You can define a default IP that resolves if no Geo IP rule matches, and specify IPs for each geographical zone. [Documentation and usage example](https://www.scaleway.com/en/docs/scaleway-dns/#-Geo-IP-Records)
        /// </summary>
        [Input("geoIp")]
        public Input<Inputs.DomainRecordGeoIpGetArgs>? GeoIp { get; set; }

        /// <summary>
        /// The DNS service checks the provided URL on the configured IPs and resolves the request to one of the IPs by excluding the ones not responding to the given string to check. [Documentation and usage example](https://www.scaleway.com/en/docs/scaleway-dns/#-Healthcheck-records)
        /// </summary>
        [Input("httpService")]
        public Input<Inputs.DomainRecordHttpServiceGetArgs>? HttpService { get; set; }

        /// <summary>
        /// When destroying a resource, if only NS records remain and this is set to `false`, the zone will be deleted. Please note, each zone not deleted will [cost you money](https://www.scaleway.com/en/dns/)
        /// </summary>
        [Input("keepEmptyZone")]
        public Input<bool>? KeepEmptyZone { get; set; }

        /// <summary>
        /// The name of the record (can be an empty string for a root record).
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The priority of the record (mostly used with an `MX` record)
        /// </summary>
        [Input("priority")]
        public Input<int>? Priority { get; set; }

        /// <summary>
        /// The project_id you want to attach the resource to
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Does the DNS zone is the root zone or not
        /// </summary>
        [Input("rootZone")]
        public Input<bool>? RootZone { get; set; }

        /// <summary>
        /// Time To Live of the record in seconds.
        /// </summary>
        [Input("ttl")]
        public Input<int>? Ttl { get; set; }

        /// <summary>
        /// The type of the record (`A`, `AAAA`, `MX`, `CNAME`, `DNAME`, `ALIAS`, `NS`, `PTR`, `SRV`, `TXT`, `TLSA`, or `CAA`).
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        [Input("views")]
        private InputList<Inputs.DomainRecordViewGetArgs>? _views;

        /// <summary>
        /// The answer to a DNS request is based on the client’s (resolver) subnet. *(Can be more than 1)* [Documentation and usage example](https://www.scaleway.com/en/docs/scaleway-dns/#-Views-records)
        /// </summary>
        public InputList<Inputs.DomainRecordViewGetArgs> Views
        {
            get => _views ?? (_views = new InputList<Inputs.DomainRecordViewGetArgs>());
            set => _views = value;
        }

        [Input("weighteds")]
        private InputList<Inputs.DomainRecordWeightedGetArgs>? _weighteds;

        /// <summary>
        /// You provide a list of IPs with their corresponding weights. These weights are used to proportionally direct requests to each IP. Depending on the weight of a record more or fewer requests are answered with its related IP compared to the others in the list. *(Can be more than 1)* [Documentation and usage example](https://www.scaleway.com/en/docs/scaleway-dns/#-Weight-Records)
        /// </summary>
        public InputList<Inputs.DomainRecordWeightedGetArgs> Weighteds
        {
            get => _weighteds ?? (_weighteds = new InputList<Inputs.DomainRecordWeightedGetArgs>());
            set => _weighteds = value;
        }

        public DomainRecordState()
        {
        }
        public static new DomainRecordState Empty => new DomainRecordState();
    }
}
