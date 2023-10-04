/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package dev.insurtech.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Attributes10 type.
 */
public class Attributes10 {
    private String deductible;
    private String limit;
    private String premium;
    private Object metadata;

    /**
     * Default constructor.
     */
    public Attributes10() {
    }

    /**
     * Initialization constructor.
     * @param  deductible  String value for deductible.
     * @param  limit  String value for limit.
     * @param  premium  String value for premium.
     * @param  metadata  Object value for metadata.
     */
    public Attributes10(
            String deductible,
            String limit,
            String premium,
            Object metadata) {
        this.deductible = deductible;
        this.limit = limit;
        this.premium = premium;
        this.metadata = metadata;
    }

    /**
     * Getter for Deductible.
     * A value from the set denoting the user-selected deductible of coverage. This is dependent on
     * the product's configuration.
     * @return Returns the String
     */
    @JsonGetter("deductible")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDeductible() {
        return deductible;
    }

    /**
     * Setter for Deductible.
     * A value from the set denoting the user-selected deductible of coverage. This is dependent on
     * the product's configuration.
     * @param deductible Value for String
     */
    @JsonSetter("deductible")
    public void setDeductible(String deductible) {
        this.deductible = deductible;
    }

    /**
     * Getter for Limit.
     * A value from the set denoting the user-selected limit of coverage. This is dependent on the
     * product's configuration.
     * @return Returns the String
     */
    @JsonGetter("limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLimit() {
        return limit;
    }

    /**
     * Setter for Limit.
     * A value from the set denoting the user-selected limit of coverage. This is dependent on the
     * product's configuration.
     * @param limit Value for String
     */
    @JsonSetter("limit")
    public void setLimit(String limit) {
        this.limit = limit;
    }

    /**
     * Getter for Premium.
     * Calculated premium for this coverage which is included in the policy's term premium.
     * @return Returns the String
     */
    @JsonGetter("premium")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPremium() {
        return premium;
    }

    /**
     * Setter for Premium.
     * Calculated premium for this coverage which is included in the policy's term premium.
     * @param premium Value for String
     */
    @JsonSetter("premium")
    public void setPremium(String premium) {
        this.premium = premium;
    }

    /**
     * Getter for Metadata.
     * Additional data about the policy. The required metadata fields are specific to the product.
     * @return Returns the Object
     */
    @JsonGetter("metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * Additional data about the policy. The required metadata fields are specific to the product.
     * @param metadata Value for Object
     */
    @JsonSetter("metadata")
    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    /**
     * Converts this Attributes10 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Attributes10 [" + "deductible=" + deductible + ", limit=" + limit + ", premium="
                + premium + ", metadata=" + metadata + "]";
    }

    /**
     * Builds a new {@link Attributes10.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Attributes10.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .deductible(getDeductible())
                .limit(getLimit())
                .premium(getPremium())
                .metadata(getMetadata());
        return builder;
    }

    /**
     * Class to build instances of {@link Attributes10}.
     */
    public static class Builder {
        private String deductible;
        private String limit;
        private String premium;
        private Object metadata;



        /**
         * Setter for deductible.
         * @param  deductible  String value for deductible.
         * @return Builder
         */
        public Builder deductible(String deductible) {
            this.deductible = deductible;
            return this;
        }

        /**
         * Setter for limit.
         * @param  limit  String value for limit.
         * @return Builder
         */
        public Builder limit(String limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Setter for premium.
         * @param  premium  String value for premium.
         * @return Builder
         */
        public Builder premium(String premium) {
            this.premium = premium;
            return this;
        }

        /**
         * Setter for metadata.
         * @param  metadata  Object value for metadata.
         * @return Builder
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds a new {@link Attributes10} object using the set fields.
         * @return {@link Attributes10}
         */
        public Attributes10 build() {
            return new Attributes10(deductible, limit, premium, metadata);
        }
    }
}