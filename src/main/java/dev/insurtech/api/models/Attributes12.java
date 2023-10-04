/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package dev.insurtech.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Attributes12 type.
 */
public class Attributes12 {
    private Object factors;

    /**
     * Default constructor.
     */
    public Attributes12() {
    }

    /**
     * Initialization constructor.
     * @param  factors  Object value for factors.
     */
    public Attributes12(
            Object factors) {
        this.factors = factors;
    }

    /**
     * Getter for Factors.
     * Object representation of the insured risk.
     * @return Returns the Object
     */
    @JsonGetter("factors")
    public Object getFactors() {
        return factors;
    }

    /**
     * Setter for Factors.
     * Object representation of the insured risk.
     * @param factors Value for Object
     */
    @JsonSetter("factors")
    public void setFactors(Object factors) {
        this.factors = factors;
    }

    /**
     * Converts this Attributes12 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Attributes12 [" + "factors=" + factors + "]";
    }

    /**
     * Builds a new {@link Attributes12.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Attributes12.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(factors);
        return builder;
    }

    /**
     * Class to build instances of {@link Attributes12}.
     */
    public static class Builder {
        private Object factors;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  factors  Object value for factors.
         */
        public Builder(Object factors) {
            this.factors = factors;
        }

        /**
         * Setter for factors.
         * @param  factors  Object value for factors.
         * @return Builder
         */
        public Builder factors(Object factors) {
            this.factors = factors;
            return this;
        }

        /**
         * Builds a new {@link Attributes12} object using the set fields.
         * @return {@link Attributes12}
         */
        public Attributes12 build() {
            return new Attributes12(factors);
        }
    }
}