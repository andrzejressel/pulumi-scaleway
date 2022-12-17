// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BaremetalServerIpArgs extends com.pulumi.resources.ResourceArgs {

    public static final BaremetalServerIpArgs Empty = new BaremetalServerIpArgs();

    /**
     * The address of the IP.
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return The address of the IP.
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * The id of the option to enable. Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-012dcc) to find the available options IDs.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The id of the option to enable. Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-012dcc) to find the available options IDs.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The reverse of the IP.
     * 
     */
    @Import(name="reverse")
    private @Nullable Output<String> reverse;

    /**
     * @return The reverse of the IP.
     * 
     */
    public Optional<Output<String>> reverse() {
        return Optional.ofNullable(this.reverse);
    }

    @Import(name="version")
    private @Nullable Output<String> version;

    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private BaremetalServerIpArgs() {}

    private BaremetalServerIpArgs(BaremetalServerIpArgs $) {
        this.address = $.address;
        this.id = $.id;
        this.reverse = $.reverse;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BaremetalServerIpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BaremetalServerIpArgs $;

        public Builder() {
            $ = new BaremetalServerIpArgs();
        }

        public Builder(BaremetalServerIpArgs defaults) {
            $ = new BaremetalServerIpArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The address of the IP.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The address of the IP.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param id The id of the option to enable. Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-012dcc) to find the available options IDs.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The id of the option to enable. Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-012dcc) to find the available options IDs.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param reverse The reverse of the IP.
         * 
         * @return builder
         * 
         */
        public Builder reverse(@Nullable Output<String> reverse) {
            $.reverse = reverse;
            return this;
        }

        /**
         * @param reverse The reverse of the IP.
         * 
         * @return builder
         * 
         */
        public Builder reverse(String reverse) {
            return reverse(Output.of(reverse));
        }

        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        public Builder version(String version) {
            return version(Output.of(version));
        }

        public BaremetalServerIpArgs build() {
            return $;
        }
    }

}
