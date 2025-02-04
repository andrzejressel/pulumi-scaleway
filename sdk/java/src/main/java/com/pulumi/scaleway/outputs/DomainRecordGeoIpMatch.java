// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DomainRecordGeoIpMatch {
    /**
     * @return List of continents (eg: `EU` for Europe, `NA` for North America, `AS` for Asia...). [List of all continents code](https://api.scaleway.com/domain-private/v2beta1/continents)
     * 
     */
    private @Nullable List<String> continents;
    /**
     * @return List of countries (eg: `FR` for France, `US` for the United States, `GB` for Great Britain...). [List of all countries code](https://api.scaleway.com/domain-private/v2beta1/countries)
     * 
     */
    private @Nullable List<String> countries;
    /**
     * @return The content of the record (an IPv4 for an `A`, a string for a `TXT`...).
     * 
     */
    private String data;

    private DomainRecordGeoIpMatch() {}
    /**
     * @return List of continents (eg: `EU` for Europe, `NA` for North America, `AS` for Asia...). [List of all continents code](https://api.scaleway.com/domain-private/v2beta1/continents)
     * 
     */
    public List<String> continents() {
        return this.continents == null ? List.of() : this.continents;
    }
    /**
     * @return List of countries (eg: `FR` for France, `US` for the United States, `GB` for Great Britain...). [List of all countries code](https://api.scaleway.com/domain-private/v2beta1/countries)
     * 
     */
    public List<String> countries() {
        return this.countries == null ? List.of() : this.countries;
    }
    /**
     * @return The content of the record (an IPv4 for an `A`, a string for a `TXT`...).
     * 
     */
    public String data() {
        return this.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainRecordGeoIpMatch defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> continents;
        private @Nullable List<String> countries;
        private String data;
        public Builder() {}
        public Builder(DomainRecordGeoIpMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continents = defaults.continents;
    	      this.countries = defaults.countries;
    	      this.data = defaults.data;
        }

        @CustomType.Setter
        public Builder continents(@Nullable List<String> continents) {
            this.continents = continents;
            return this;
        }
        public Builder continents(String... continents) {
            return continents(List.of(continents));
        }
        @CustomType.Setter
        public Builder countries(@Nullable List<String> countries) {
            this.countries = countries;
            return this;
        }
        public Builder countries(String... countries) {
            return countries(List.of(countries));
        }
        @CustomType.Setter
        public Builder data(String data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }
        public DomainRecordGeoIpMatch build() {
            final var o = new DomainRecordGeoIpMatch();
            o.continents = continents;
            o.countries = countries;
            o.data = data;
            return o;
        }
    }
}
