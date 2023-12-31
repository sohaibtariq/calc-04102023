/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package dev.insurtech.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Policy type.
 */
public class Policy {
    private Data19 data;

    /**
     * Default constructor.
     */
    public Policy() {
    }

    /**
     * Initialization constructor.
     * @param  data  Data19 value for data.
     */
    public Policy(
            Data19 data) {
        this.data = data;
    }

    /**
     * Getter for Data.
     * Provided data for this policy relationship.
     * @return Returns the Data19
     */
    @JsonGetter("data")
    public Data19 getData() {
        return data;
    }

    /**
     * Setter for Data.
     * Provided data for this policy relationship.
     * @param data Value for Data19
     */
    @JsonSetter("data")
    public void setData(Data19 data) {
        this.data = data;
    }

    /**
     * Converts this Policy into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Policy [" + "data=" + data + "]";
    }

    /**
     * Builds a new {@link Policy.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Policy.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(data);
        return builder;
    }

    /**
     * Class to build instances of {@link Policy}.
     */
    public static class Builder {
        private Data19 data;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  data  Data19 value for data.
         */
        public Builder(Data19 data) {
            this.data = data;
        }

        /**
         * Setter for data.
         * @param  data  Data19 value for data.
         * @return Builder
         */
        public Builder data(Data19 data) {
            this.data = data;
            return this;
        }

        /**
         * Builds a new {@link Policy} object using the set fields.
         * @return {@link Policy}
         */
        public Policy build() {
            return new Policy(data);
        }
    }
}
