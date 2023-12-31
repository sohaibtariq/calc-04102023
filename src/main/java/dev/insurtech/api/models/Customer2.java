/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package dev.insurtech.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Customer2 type.
 */
public class Customer2 {
    private Data41 data;

    /**
     * Default constructor.
     */
    public Customer2() {
    }

    /**
     * Initialization constructor.
     * @param  data  Data41 value for data.
     */
    public Customer2(
            Data41 data) {
        this.data = data;
    }

    /**
     * Getter for Data.
     * Provided data for this customer relationship with local ID.
     * @return Returns the Data41
     */
    @JsonGetter("data")
    public Data41 getData() {
        return data;
    }

    /**
     * Setter for Data.
     * Provided data for this customer relationship with local ID.
     * @param data Value for Data41
     */
    @JsonSetter("data")
    public void setData(Data41 data) {
        this.data = data;
    }

    /**
     * Converts this Customer2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Customer2 [" + "data=" + data + "]";
    }

    /**
     * Builds a new {@link Customer2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Customer2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(data);
        return builder;
    }

    /**
     * Class to build instances of {@link Customer2}.
     */
    public static class Builder {
        private Data41 data;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  data  Data41 value for data.
         */
        public Builder(Data41 data) {
            this.data = data;
        }

        /**
         * Setter for data.
         * @param  data  Data41 value for data.
         * @return Builder
         */
        public Builder data(Data41 data) {
            this.data = data;
            return this;
        }

        /**
         * Builds a new {@link Customer2} object using the set fields.
         * @return {@link Customer2}
         */
        public Customer2 build() {
            return new Customer2(data);
        }
    }
}
