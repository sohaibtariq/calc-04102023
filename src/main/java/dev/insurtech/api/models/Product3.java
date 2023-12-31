/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package dev.insurtech.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Product3 type.
 */
public class Product3 {
    private Data2 data;

    /**
     * Default constructor.
     */
    public Product3() {
    }

    /**
     * Initialization constructor.
     * @param  data  Data2 value for data.
     */
    public Product3(
            Data2 data) {
        this.data = data;
    }

    /**
     * Getter for Data.
     * Provided data for this product relationship.
     * @return Returns the Data2
     */
    @JsonGetter("data")
    public Data2 getData() {
        return data;
    }

    /**
     * Setter for Data.
     * Provided data for this product relationship.
     * @param data Value for Data2
     */
    @JsonSetter("data")
    public void setData(Data2 data) {
        this.data = data;
    }

    /**
     * Converts this Product3 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Product3 [" + "data=" + data + "]";
    }

    /**
     * Builds a new {@link Product3.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Product3.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(data);
        return builder;
    }

    /**
     * Class to build instances of {@link Product3}.
     */
    public static class Builder {
        private Data2 data;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  data  Data2 value for data.
         */
        public Builder(Data2 data) {
            this.data = data;
        }

        /**
         * Setter for data.
         * @param  data  Data2 value for data.
         * @return Builder
         */
        public Builder data(Data2 data) {
            this.data = data;
            return this;
        }

        /**
         * Builds a new {@link Product3} object using the set fields.
         * @return {@link Product3}
         */
        public Product3 build() {
            return new Product3(data);
        }
    }
}
