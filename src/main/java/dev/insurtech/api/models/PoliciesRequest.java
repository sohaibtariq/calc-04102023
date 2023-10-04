/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package dev.insurtech.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for PoliciesRequest type.
 */
public class PoliciesRequest {
    private Data6 data;

    /**
     * Default constructor.
     */
    public PoliciesRequest() {
    }

    /**
     * Initialization constructor.
     * @param  data  Data6 value for data.
     */
    public PoliciesRequest(
            Data6 data) {
        this.data = data;
    }

    /**
     * Getter for Data.
     * Data for creating a policy from a quote requiring a stripe token.
     * @return Returns the Data6
     */
    @JsonGetter("data")
    public Data6 getData() {
        return data;
    }

    /**
     * Setter for Data.
     * Data for creating a policy from a quote requiring a stripe token.
     * @param data Value for Data6
     */
    @JsonSetter("data")
    public void setData(Data6 data) {
        this.data = data;
    }

    /**
     * Converts this PoliciesRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PoliciesRequest [" + "data=" + data + "]";
    }

    /**
     * Builds a new {@link PoliciesRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PoliciesRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(data);
        return builder;
    }

    /**
     * Class to build instances of {@link PoliciesRequest}.
     */
    public static class Builder {
        private Data6 data;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  data  Data6 value for data.
         */
        public Builder(Data6 data) {
            this.data = data;
        }

        /**
         * Setter for data.
         * @param  data  Data6 value for data.
         * @return Builder
         */
        public Builder data(Data6 data) {
            this.data = data;
            return this;
        }

        /**
         * Builds a new {@link PoliciesRequest} object using the set fields.
         * @return {@link PoliciesRequest}
         */
        public PoliciesRequest build() {
            return new PoliciesRequest(data);
        }
    }
}