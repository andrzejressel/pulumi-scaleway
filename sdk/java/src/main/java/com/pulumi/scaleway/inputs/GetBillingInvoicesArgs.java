// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBillingInvoicesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBillingInvoicesArgs Empty = new GetBillingInvoicesArgs();

    /**
     * Invoices with the given type are listed. Valid values are `periodic` and `purchase`.
     * 
     */
    @Import(name="invoiceType")
    private @Nullable Output<String> invoiceType;

    /**
     * @return Invoices with the given type are listed. Valid values are `periodic` and `purchase`.
     * 
     */
    public Optional<Output<String>> invoiceType() {
        return Optional.ofNullable(this.invoiceType);
    }

    /**
     * Invoices with a start date that are greater or equal to `started_after` are listed (RFC 3339 format).
     * 
     */
    @Import(name="startedAfter")
    private @Nullable Output<String> startedAfter;

    /**
     * @return Invoices with a start date that are greater or equal to `started_after` are listed (RFC 3339 format).
     * 
     */
    public Optional<Output<String>> startedAfter() {
        return Optional.ofNullable(this.startedAfter);
    }

    /**
     * Invoices with a start date that precedes `started_before` are listed (RFC 3339 format).
     * 
     */
    @Import(name="startedBefore")
    private @Nullable Output<String> startedBefore;

    /**
     * @return Invoices with a start date that precedes `started_before` are listed (RFC 3339 format).
     * 
     */
    public Optional<Output<String>> startedBefore() {
        return Optional.ofNullable(this.startedBefore);
    }

    private GetBillingInvoicesArgs() {}

    private GetBillingInvoicesArgs(GetBillingInvoicesArgs $) {
        this.invoiceType = $.invoiceType;
        this.startedAfter = $.startedAfter;
        this.startedBefore = $.startedBefore;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBillingInvoicesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBillingInvoicesArgs $;

        public Builder() {
            $ = new GetBillingInvoicesArgs();
        }

        public Builder(GetBillingInvoicesArgs defaults) {
            $ = new GetBillingInvoicesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param invoiceType Invoices with the given type are listed. Valid values are `periodic` and `purchase`.
         * 
         * @return builder
         * 
         */
        public Builder invoiceType(@Nullable Output<String> invoiceType) {
            $.invoiceType = invoiceType;
            return this;
        }

        /**
         * @param invoiceType Invoices with the given type are listed. Valid values are `periodic` and `purchase`.
         * 
         * @return builder
         * 
         */
        public Builder invoiceType(String invoiceType) {
            return invoiceType(Output.of(invoiceType));
        }

        /**
         * @param startedAfter Invoices with a start date that are greater or equal to `started_after` are listed (RFC 3339 format).
         * 
         * @return builder
         * 
         */
        public Builder startedAfter(@Nullable Output<String> startedAfter) {
            $.startedAfter = startedAfter;
            return this;
        }

        /**
         * @param startedAfter Invoices with a start date that are greater or equal to `started_after` are listed (RFC 3339 format).
         * 
         * @return builder
         * 
         */
        public Builder startedAfter(String startedAfter) {
            return startedAfter(Output.of(startedAfter));
        }

        /**
         * @param startedBefore Invoices with a start date that precedes `started_before` are listed (RFC 3339 format).
         * 
         * @return builder
         * 
         */
        public Builder startedBefore(@Nullable Output<String> startedBefore) {
            $.startedBefore = startedBefore;
            return this;
        }

        /**
         * @param startedBefore Invoices with a start date that precedes `started_before` are listed (RFC 3339 format).
         * 
         * @return builder
         * 
         */
        public Builder startedBefore(String startedBefore) {
            return startedBefore(Output.of(startedBefore));
        }

        public GetBillingInvoicesArgs build() {
            return $;
        }
    }

}
