/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package dev.insurtech.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for PoliciesResponse1 type.
 */
public class PoliciesResponse1 {
    private List<Data24> data;

    /**
     * Default constructor.
     */
    public PoliciesResponse1() {
    }

    /**
     * Initialization constructor.
     * @param  data  List of Data24 value for data.
     */
    public PoliciesResponse1(
            List<Data24> data) {
        this.data = data;
    }

    /**
     * Getter for Data.
     * Array of policy objects.
     * @return Returns the List of Data24
     */
    @JsonGetter("data")
    public List<Data24> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * Array of policy objects.
     * @param data Value for List of Data24
     */
    @JsonSetter("data")
    public void setData(List<Data24> data) {
        this.data = data;
    }

    /**
     * Converts this PoliciesResponse1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PoliciesResponse1 [" + "data=" + data + "]";
    }

    /**
     * Builds a new {@link PoliciesResponse1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PoliciesResponse1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(data);
        return builder;
    }

    /**
     * Class to build instances of {@link PoliciesResponse1}.
     */
    public static class Builder {
        private List<Data24> data;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  data  List of Data24 value for data.
         */
        public Builder(List<Data24> data) {
            this.data = data;
        }

        /**
         * Setter for data.
         * @param  data  List of Data24 value for data.
         * @return Builder
         */
        public Builder data(List<Data24> data) {
            this.data = data;
            return this;
        }

        /**
         * Builds a new {@link PoliciesResponse1} object using the set fields.
         * @return {@link PoliciesResponse1}
         */
        public PoliciesResponse1 build() {
            return new PoliciesResponse1(data);
        }
    }
}
