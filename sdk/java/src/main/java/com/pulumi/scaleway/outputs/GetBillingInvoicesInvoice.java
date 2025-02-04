// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBillingInvoicesInvoice {
    /**
     * @return The payment time limit, set according to the Organization&#39;s payment conditions (RFC 3339 format).
     * 
     */
    private String dueDate;
    /**
     * @return The associated invoice ID.
     * 
     */
    private String id;
    /**
     * @return Invoices with the given type are listed. Valid values are `periodic` and `purchase`.
     * 
     */
    private String invoiceType;
    /**
     * @return The date when the invoice was sent to the customer (RFC 3339 format).
     * 
     */
    private String issuedDate;
    /**
     * @return The invoice number.
     * 
     */
    private Integer number;
    /**
     * @return The start date of the billing period (RFC 3339 format).
     * 
     */
    private String startDate;
    /**
     * @return The total amount, taxed.
     * 
     */
    private String totalTaxed;
    /**
     * @return The total amount, untaxed.
     * 
     */
    private String totalUntaxed;

    private GetBillingInvoicesInvoice() {}
    /**
     * @return The payment time limit, set according to the Organization&#39;s payment conditions (RFC 3339 format).
     * 
     */
    public String dueDate() {
        return this.dueDate;
    }
    /**
     * @return The associated invoice ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Invoices with the given type are listed. Valid values are `periodic` and `purchase`.
     * 
     */
    public String invoiceType() {
        return this.invoiceType;
    }
    /**
     * @return The date when the invoice was sent to the customer (RFC 3339 format).
     * 
     */
    public String issuedDate() {
        return this.issuedDate;
    }
    /**
     * @return The invoice number.
     * 
     */
    public Integer number() {
        return this.number;
    }
    /**
     * @return The start date of the billing period (RFC 3339 format).
     * 
     */
    public String startDate() {
        return this.startDate;
    }
    /**
     * @return The total amount, taxed.
     * 
     */
    public String totalTaxed() {
        return this.totalTaxed;
    }
    /**
     * @return The total amount, untaxed.
     * 
     */
    public String totalUntaxed() {
        return this.totalUntaxed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBillingInvoicesInvoice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dueDate;
        private String id;
        private String invoiceType;
        private String issuedDate;
        private Integer number;
        private String startDate;
        private String totalTaxed;
        private String totalUntaxed;
        public Builder() {}
        public Builder(GetBillingInvoicesInvoice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dueDate = defaults.dueDate;
    	      this.id = defaults.id;
    	      this.invoiceType = defaults.invoiceType;
    	      this.issuedDate = defaults.issuedDate;
    	      this.number = defaults.number;
    	      this.startDate = defaults.startDate;
    	      this.totalTaxed = defaults.totalTaxed;
    	      this.totalUntaxed = defaults.totalUntaxed;
        }

        @CustomType.Setter
        public Builder dueDate(String dueDate) {
            this.dueDate = Objects.requireNonNull(dueDate);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder invoiceType(String invoiceType) {
            this.invoiceType = Objects.requireNonNull(invoiceType);
            return this;
        }
        @CustomType.Setter
        public Builder issuedDate(String issuedDate) {
            this.issuedDate = Objects.requireNonNull(issuedDate);
            return this;
        }
        @CustomType.Setter
        public Builder number(Integer number) {
            this.number = Objects.requireNonNull(number);
            return this;
        }
        @CustomType.Setter
        public Builder startDate(String startDate) {
            this.startDate = Objects.requireNonNull(startDate);
            return this;
        }
        @CustomType.Setter
        public Builder totalTaxed(String totalTaxed) {
            this.totalTaxed = Objects.requireNonNull(totalTaxed);
            return this;
        }
        @CustomType.Setter
        public Builder totalUntaxed(String totalUntaxed) {
            this.totalUntaxed = Objects.requireNonNull(totalUntaxed);
            return this;
        }
        public GetBillingInvoicesInvoice build() {
            final var o = new GetBillingInvoicesInvoice();
            o.dueDate = dueDate;
            o.id = id;
            o.invoiceType = invoiceType;
            o.issuedDate = issuedDate;
            o.number = number;
            o.startDate = startDate;
            o.totalTaxed = totalTaxed;
            o.totalUntaxed = totalUntaxed;
            return o;
        }
    }
}
