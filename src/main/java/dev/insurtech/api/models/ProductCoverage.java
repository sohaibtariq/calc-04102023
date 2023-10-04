/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package dev.insurtech.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ProductCoverage type.
 */
public class ProductCoverage {
    private Data44 data;

    /**
     * Default constructor.
     */
    public ProductCoverage() {
    }

    /**
     * Initialization constructor.
     * @param  data  Data44 value for data.
     */
    public ProductCoverage(
            Data44 data) {
        this.data = data;
    }

    /**
     * Getter for Data.
     * Provided data for this product coverage relationship.
     * @return Returns the Data44
     */
    @JsonGetter("data")
    public Data44 getData() {
        return data;
    }

    /**
     * Setter for Data.
     * Provided data for this product coverage relationship.
     * @param data Value for Data44
     */
    @JsonSetter("data")
    public void setData(Data44 data) {
        this.data = data;
    }

    /**
     * Converts this ProductCoverage into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ProductCoverage [" + "data=" + data + "]";
    }

    /**
     * Builds a new {@link ProductCoverage.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ProductCoverage.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(data);
        return builder;
    }

    /**
     * Class to build instances of {@link ProductCoverage}.
     */
    public static class Builder {
        private Data44 data;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  data  Data44 value for data.
         */
        public Builder(Data44 data) {
            this.data = data;
        }

        /**
         * Setter for data.
         * @param  data  Data44 value for data.
         * @return Builder
         */
        public Builder data(Data44 data) {
            this.data = data;
            return this;
        }

        /**
         * Builds a new {@link ProductCoverage} object using the set fields.
         * @return {@link ProductCoverage}
         */
        public ProductCoverage build() {
            return new ProductCoverage(data);
        }
    }
}
