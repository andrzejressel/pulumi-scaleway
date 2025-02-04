// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.scaleway.inputs.BaremetalServerIpArgs;
import com.pulumi.scaleway.inputs.BaremetalServerIpv4Args;
import com.pulumi.scaleway.inputs.BaremetalServerIpv6Args;
import com.pulumi.scaleway.inputs.BaremetalServerOptionArgs;
import com.pulumi.scaleway.inputs.BaremetalServerPrivateNetworkArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BaremetalServerState extends com.pulumi.resources.ResourceArgs {

    public static final BaremetalServerState Empty = new BaremetalServerState();

    /**
     * A description for the server.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description for the server.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The domain of the server.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return The domain of the server.
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * The hostname of the server.
     * 
     */
    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    /**
     * @return The hostname of the server.
     * 
     */
    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * If True, this boolean allows to create a server without the install config if you want to provide it later.
     * 
     */
    @Import(name="installConfigAfterward")
    private @Nullable Output<Boolean> installConfigAfterward;

    /**
     * @return If True, this boolean allows to create a server without the install config if you want to provide it later.
     * 
     */
    public Optional<Output<Boolean>> installConfigAfterward() {
        return Optional.ofNullable(this.installConfigAfterward);
    }

    /**
     * (List of) The IPs of the server.
     * 
     */
    @Import(name="ips")
    private @Nullable Output<List<BaremetalServerIpArgs>> ips;

    /**
     * @return (List of) The IPs of the server.
     * 
     */
    public Optional<Output<List<BaremetalServerIpArgs>>> ips() {
        return Optional.ofNullable(this.ips);
    }

    /**
     * (List of) The IPv4 addresses of the server.
     * 
     */
    @Import(name="ipv4s")
    private @Nullable Output<List<BaremetalServerIpv4Args>> ipv4s;

    /**
     * @return (List of) The IPv4 addresses of the server.
     * 
     */
    public Optional<Output<List<BaremetalServerIpv4Args>>> ipv4s() {
        return Optional.ofNullable(this.ipv4s);
    }

    /**
     * (List of) The IPv6 addresses of the server.
     * 
     */
    @Import(name="ipv6s")
    private @Nullable Output<List<BaremetalServerIpv6Args>> ipv6s;

    /**
     * @return (List of) The IPv6 addresses of the server.
     * 
     */
    public Optional<Output<List<BaremetalServerIpv6Args>>> ipv6s() {
        return Optional.ofNullable(this.ipv6s);
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the server.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The offer name or UUID of the baremetal server.
     * Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-334154) to find the right offer.
     * 
     * &gt; **Important:** Updates to `offer` will recreate the server.
     * 
     */
    @Import(name="offer")
    private @Nullable Output<String> offer;

    /**
     * @return The offer name or UUID of the baremetal server.
     * Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-334154) to find the right offer.
     * 
     * &gt; **Important:** Updates to `offer` will recreate the server.
     * 
     */
    public Optional<Output<String>> offer() {
        return Optional.ofNullable(this.offer);
    }

    /**
     * The ID of the offer.
     * 
     */
    @Import(name="offerId")
    private @Nullable Output<String> offerId;

    /**
     * @return The ID of the offer.
     * 
     */
    public Optional<Output<String>> offerId() {
        return Optional.ofNullable(this.offerId);
    }

    /**
     * The name of the offer.
     * 
     */
    @Import(name="offerName")
    private @Nullable Output<String> offerName;

    /**
     * @return The name of the offer.
     * 
     */
    public Optional<Output<String>> offerName() {
        return Optional.ofNullable(this.offerName);
    }

    /**
     * The options to enable on the server.
     * &gt; The `options` block supports:
     * 
     */
    @Import(name="options")
    private @Nullable Output<List<BaremetalServerOptionArgs>> options;

    /**
     * @return The options to enable on the server.
     * &gt; The `options` block supports:
     * 
     */
    public Optional<Output<List<BaremetalServerOptionArgs>>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * The organization ID the server is associated with.
     * 
     */
    @Import(name="organizationId")
    private @Nullable Output<String> organizationId;

    /**
     * @return The organization ID the server is associated with.
     * 
     */
    public Optional<Output<String>> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    /**
     * The UUID of the os to install on the server.
     * Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-87598a) to find the right OS ID.
     * &gt; **Important:** Updates to `os` will reinstall the server.
     * 
     */
    @Import(name="os")
    private @Nullable Output<String> os;

    /**
     * @return The UUID of the os to install on the server.
     * Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-87598a) to find the right OS ID.
     * &gt; **Important:** Updates to `os` will reinstall the server.
     * 
     */
    public Optional<Output<String>> os() {
        return Optional.ofNullable(this.os);
    }

    /**
     * The name of the os.
     * 
     */
    @Import(name="osName")
    private @Nullable Output<String> osName;

    /**
     * @return The name of the os.
     * 
     */
    public Optional<Output<String>> osName() {
        return Optional.ofNullable(this.osName);
    }

    /**
     * Password used for the installation. May be required depending on used os.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Password used for the installation. May be required depending on used os.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The private networks to attach to the server. For more information, see [the documentation](https://www.scaleway.com/en/docs/compute/elastic-metal/how-to/use-private-networks/)
     * 
     */
    @Import(name="privateNetworks")
    private @Nullable Output<List<BaremetalServerPrivateNetworkArgs>> privateNetworks;

    /**
     * @return The private networks to attach to the server. For more information, see [the documentation](https://www.scaleway.com/en/docs/compute/elastic-metal/how-to/use-private-networks/)
     * 
     */
    public Optional<Output<List<BaremetalServerPrivateNetworkArgs>>> privateNetworks() {
        return Optional.ofNullable(this.privateNetworks);
    }

    /**
     * `project_id`) The ID of the project the server is associated with.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the server is associated with.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * If True, this boolean allows to reinstall the server on install config changes.
     * &gt; **Important:** Updates to `ssh_key_ids`, `user`, `password`, `service_user` or `service_password` will not take effect on the server, it requires to reinstall it. To do so please set &#39;reinstall_on_config_changes&#39; argument to true.
     * 
     */
    @Import(name="reinstallOnConfigChanges")
    private @Nullable Output<Boolean> reinstallOnConfigChanges;

    /**
     * @return If True, this boolean allows to reinstall the server on install config changes.
     * &gt; **Important:** Updates to `ssh_key_ids`, `user`, `password`, `service_user` or `service_password` will not take effect on the server, it requires to reinstall it. To do so please set &#39;reinstall_on_config_changes&#39; argument to true.
     * 
     */
    public Optional<Output<Boolean>> reinstallOnConfigChanges() {
        return Optional.ofNullable(this.reinstallOnConfigChanges);
    }

    /**
     * Password used for the service to install. May be required depending on used os.
     * 
     */
    @Import(name="servicePassword")
    private @Nullable Output<String> servicePassword;

    /**
     * @return Password used for the service to install. May be required depending on used os.
     * 
     */
    public Optional<Output<String>> servicePassword() {
        return Optional.ofNullable(this.servicePassword);
    }

    /**
     * User used for the service to install.
     * 
     */
    @Import(name="serviceUser")
    private @Nullable Output<String> serviceUser;

    /**
     * @return User used for the service to install.
     * 
     */
    public Optional<Output<String>> serviceUser() {
        return Optional.ofNullable(this.serviceUser);
    }

    /**
     * List of SSH keys allowed to connect to the server.
     * 
     */
    @Import(name="sshKeyIds")
    private @Nullable Output<List<String>> sshKeyIds;

    /**
     * @return List of SSH keys allowed to connect to the server.
     * 
     */
    public Optional<Output<List<String>>> sshKeyIds() {
        return Optional.ofNullable(this.sshKeyIds);
    }

    /**
     * The tags associated with the server.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return The tags associated with the server.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * User used for the installation.
     * 
     */
    @Import(name="user")
    private @Nullable Output<String> user;

    /**
     * @return User used for the installation.
     * 
     */
    public Optional<Output<String>> user() {
        return Optional.ofNullable(this.user);
    }

    /**
     * `zone`) The zone in which the server should be created.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return `zone`) The zone in which the server should be created.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private BaremetalServerState() {}

    private BaremetalServerState(BaremetalServerState $) {
        this.description = $.description;
        this.domain = $.domain;
        this.hostname = $.hostname;
        this.installConfigAfterward = $.installConfigAfterward;
        this.ips = $.ips;
        this.ipv4s = $.ipv4s;
        this.ipv6s = $.ipv6s;
        this.name = $.name;
        this.offer = $.offer;
        this.offerId = $.offerId;
        this.offerName = $.offerName;
        this.options = $.options;
        this.organizationId = $.organizationId;
        this.os = $.os;
        this.osName = $.osName;
        this.password = $.password;
        this.privateNetworks = $.privateNetworks;
        this.projectId = $.projectId;
        this.reinstallOnConfigChanges = $.reinstallOnConfigChanges;
        this.servicePassword = $.servicePassword;
        this.serviceUser = $.serviceUser;
        this.sshKeyIds = $.sshKeyIds;
        this.tags = $.tags;
        this.user = $.user;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BaremetalServerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BaremetalServerState $;

        public Builder() {
            $ = new BaremetalServerState();
        }

        public Builder(BaremetalServerState defaults) {
            $ = new BaremetalServerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description for the server.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description for the server.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param domain The domain of the server.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The domain of the server.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param hostname The hostname of the server.
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param hostname The hostname of the server.
         * 
         * @return builder
         * 
         */
        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param installConfigAfterward If True, this boolean allows to create a server without the install config if you want to provide it later.
         * 
         * @return builder
         * 
         */
        public Builder installConfigAfterward(@Nullable Output<Boolean> installConfigAfterward) {
            $.installConfigAfterward = installConfigAfterward;
            return this;
        }

        /**
         * @param installConfigAfterward If True, this boolean allows to create a server without the install config if you want to provide it later.
         * 
         * @return builder
         * 
         */
        public Builder installConfigAfterward(Boolean installConfigAfterward) {
            return installConfigAfterward(Output.of(installConfigAfterward));
        }

        /**
         * @param ips (List of) The IPs of the server.
         * 
         * @return builder
         * 
         */
        public Builder ips(@Nullable Output<List<BaremetalServerIpArgs>> ips) {
            $.ips = ips;
            return this;
        }

        /**
         * @param ips (List of) The IPs of the server.
         * 
         * @return builder
         * 
         */
        public Builder ips(List<BaremetalServerIpArgs> ips) {
            return ips(Output.of(ips));
        }

        /**
         * @param ips (List of) The IPs of the server.
         * 
         * @return builder
         * 
         */
        public Builder ips(BaremetalServerIpArgs... ips) {
            return ips(List.of(ips));
        }

        /**
         * @param ipv4s (List of) The IPv4 addresses of the server.
         * 
         * @return builder
         * 
         */
        public Builder ipv4s(@Nullable Output<List<BaremetalServerIpv4Args>> ipv4s) {
            $.ipv4s = ipv4s;
            return this;
        }

        /**
         * @param ipv4s (List of) The IPv4 addresses of the server.
         * 
         * @return builder
         * 
         */
        public Builder ipv4s(List<BaremetalServerIpv4Args> ipv4s) {
            return ipv4s(Output.of(ipv4s));
        }

        /**
         * @param ipv4s (List of) The IPv4 addresses of the server.
         * 
         * @return builder
         * 
         */
        public Builder ipv4s(BaremetalServerIpv4Args... ipv4s) {
            return ipv4s(List.of(ipv4s));
        }

        /**
         * @param ipv6s (List of) The IPv6 addresses of the server.
         * 
         * @return builder
         * 
         */
        public Builder ipv6s(@Nullable Output<List<BaremetalServerIpv6Args>> ipv6s) {
            $.ipv6s = ipv6s;
            return this;
        }

        /**
         * @param ipv6s (List of) The IPv6 addresses of the server.
         * 
         * @return builder
         * 
         */
        public Builder ipv6s(List<BaremetalServerIpv6Args> ipv6s) {
            return ipv6s(Output.of(ipv6s));
        }

        /**
         * @param ipv6s (List of) The IPv6 addresses of the server.
         * 
         * @return builder
         * 
         */
        public Builder ipv6s(BaremetalServerIpv6Args... ipv6s) {
            return ipv6s(List.of(ipv6s));
        }

        /**
         * @param name The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the server.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param offer The offer name or UUID of the baremetal server.
         * Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-334154) to find the right offer.
         * 
         * &gt; **Important:** Updates to `offer` will recreate the server.
         * 
         * @return builder
         * 
         */
        public Builder offer(@Nullable Output<String> offer) {
            $.offer = offer;
            return this;
        }

        /**
         * @param offer The offer name or UUID of the baremetal server.
         * Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-334154) to find the right offer.
         * 
         * &gt; **Important:** Updates to `offer` will recreate the server.
         * 
         * @return builder
         * 
         */
        public Builder offer(String offer) {
            return offer(Output.of(offer));
        }

        /**
         * @param offerId The ID of the offer.
         * 
         * @return builder
         * 
         */
        public Builder offerId(@Nullable Output<String> offerId) {
            $.offerId = offerId;
            return this;
        }

        /**
         * @param offerId The ID of the offer.
         * 
         * @return builder
         * 
         */
        public Builder offerId(String offerId) {
            return offerId(Output.of(offerId));
        }

        /**
         * @param offerName The name of the offer.
         * 
         * @return builder
         * 
         */
        public Builder offerName(@Nullable Output<String> offerName) {
            $.offerName = offerName;
            return this;
        }

        /**
         * @param offerName The name of the offer.
         * 
         * @return builder
         * 
         */
        public Builder offerName(String offerName) {
            return offerName(Output.of(offerName));
        }

        /**
         * @param options The options to enable on the server.
         * &gt; The `options` block supports:
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<List<BaremetalServerOptionArgs>> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options The options to enable on the server.
         * &gt; The `options` block supports:
         * 
         * @return builder
         * 
         */
        public Builder options(List<BaremetalServerOptionArgs> options) {
            return options(Output.of(options));
        }

        /**
         * @param options The options to enable on the server.
         * &gt; The `options` block supports:
         * 
         * @return builder
         * 
         */
        public Builder options(BaremetalServerOptionArgs... options) {
            return options(List.of(options));
        }

        /**
         * @param organizationId The organization ID the server is associated with.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param organizationId The organization ID the server is associated with.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param os The UUID of the os to install on the server.
         * Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-87598a) to find the right OS ID.
         * &gt; **Important:** Updates to `os` will reinstall the server.
         * 
         * @return builder
         * 
         */
        public Builder os(@Nullable Output<String> os) {
            $.os = os;
            return this;
        }

        /**
         * @param os The UUID of the os to install on the server.
         * Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-87598a) to find the right OS ID.
         * &gt; **Important:** Updates to `os` will reinstall the server.
         * 
         * @return builder
         * 
         */
        public Builder os(String os) {
            return os(Output.of(os));
        }

        /**
         * @param osName The name of the os.
         * 
         * @return builder
         * 
         */
        public Builder osName(@Nullable Output<String> osName) {
            $.osName = osName;
            return this;
        }

        /**
         * @param osName The name of the os.
         * 
         * @return builder
         * 
         */
        public Builder osName(String osName) {
            return osName(Output.of(osName));
        }

        /**
         * @param password Password used for the installation. May be required depending on used os.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password used for the installation. May be required depending on used os.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param privateNetworks The private networks to attach to the server. For more information, see [the documentation](https://www.scaleway.com/en/docs/compute/elastic-metal/how-to/use-private-networks/)
         * 
         * @return builder
         * 
         */
        public Builder privateNetworks(@Nullable Output<List<BaremetalServerPrivateNetworkArgs>> privateNetworks) {
            $.privateNetworks = privateNetworks;
            return this;
        }

        /**
         * @param privateNetworks The private networks to attach to the server. For more information, see [the documentation](https://www.scaleway.com/en/docs/compute/elastic-metal/how-to/use-private-networks/)
         * 
         * @return builder
         * 
         */
        public Builder privateNetworks(List<BaremetalServerPrivateNetworkArgs> privateNetworks) {
            return privateNetworks(Output.of(privateNetworks));
        }

        /**
         * @param privateNetworks The private networks to attach to the server. For more information, see [the documentation](https://www.scaleway.com/en/docs/compute/elastic-metal/how-to/use-private-networks/)
         * 
         * @return builder
         * 
         */
        public Builder privateNetworks(BaremetalServerPrivateNetworkArgs... privateNetworks) {
            return privateNetworks(List.of(privateNetworks));
        }

        /**
         * @param projectId `project_id`) The ID of the project the server is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId `project_id`) The ID of the project the server is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param reinstallOnConfigChanges If True, this boolean allows to reinstall the server on install config changes.
         * &gt; **Important:** Updates to `ssh_key_ids`, `user`, `password`, `service_user` or `service_password` will not take effect on the server, it requires to reinstall it. To do so please set &#39;reinstall_on_config_changes&#39; argument to true.
         * 
         * @return builder
         * 
         */
        public Builder reinstallOnConfigChanges(@Nullable Output<Boolean> reinstallOnConfigChanges) {
            $.reinstallOnConfigChanges = reinstallOnConfigChanges;
            return this;
        }

        /**
         * @param reinstallOnConfigChanges If True, this boolean allows to reinstall the server on install config changes.
         * &gt; **Important:** Updates to `ssh_key_ids`, `user`, `password`, `service_user` or `service_password` will not take effect on the server, it requires to reinstall it. To do so please set &#39;reinstall_on_config_changes&#39; argument to true.
         * 
         * @return builder
         * 
         */
        public Builder reinstallOnConfigChanges(Boolean reinstallOnConfigChanges) {
            return reinstallOnConfigChanges(Output.of(reinstallOnConfigChanges));
        }

        /**
         * @param servicePassword Password used for the service to install. May be required depending on used os.
         * 
         * @return builder
         * 
         */
        public Builder servicePassword(@Nullable Output<String> servicePassword) {
            $.servicePassword = servicePassword;
            return this;
        }

        /**
         * @param servicePassword Password used for the service to install. May be required depending on used os.
         * 
         * @return builder
         * 
         */
        public Builder servicePassword(String servicePassword) {
            return servicePassword(Output.of(servicePassword));
        }

        /**
         * @param serviceUser User used for the service to install.
         * 
         * @return builder
         * 
         */
        public Builder serviceUser(@Nullable Output<String> serviceUser) {
            $.serviceUser = serviceUser;
            return this;
        }

        /**
         * @param serviceUser User used for the service to install.
         * 
         * @return builder
         * 
         */
        public Builder serviceUser(String serviceUser) {
            return serviceUser(Output.of(serviceUser));
        }

        /**
         * @param sshKeyIds List of SSH keys allowed to connect to the server.
         * 
         * @return builder
         * 
         */
        public Builder sshKeyIds(@Nullable Output<List<String>> sshKeyIds) {
            $.sshKeyIds = sshKeyIds;
            return this;
        }

        /**
         * @param sshKeyIds List of SSH keys allowed to connect to the server.
         * 
         * @return builder
         * 
         */
        public Builder sshKeyIds(List<String> sshKeyIds) {
            return sshKeyIds(Output.of(sshKeyIds));
        }

        /**
         * @param sshKeyIds List of SSH keys allowed to connect to the server.
         * 
         * @return builder
         * 
         */
        public Builder sshKeyIds(String... sshKeyIds) {
            return sshKeyIds(List.of(sshKeyIds));
        }

        /**
         * @param tags The tags associated with the server.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags associated with the server.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The tags associated with the server.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param user User used for the installation.
         * 
         * @return builder
         * 
         */
        public Builder user(@Nullable Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user User used for the installation.
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        /**
         * @param zone `zone`) The zone in which the server should be created.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone `zone`) The zone in which the server should be created.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public BaremetalServerState build() {
            return $;
        }
    }

}
