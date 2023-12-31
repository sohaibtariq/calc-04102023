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
 * This is a model class for Coverages3 type.
 */
public class Coverages3 {
    private List<Data46> data;

    /**
     * Default constructor.
     */
    public Coverages3() {
    }

    /**
     * Initialization constructor.
     * @param  data  List of Data46 value for data.
     */
    public Coverages3(
            List<Data46> data) {
        this.data = data;
    }

    /**
     * Getter for Data.
     * List of objects.
     * @return Returns the List of Data46
     */
    @JsonGetter("data")
    public List<Data46> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * List of objects.
     * @param data Value for List of Data46
     */
    @JsonSetter("data")
    public void setData(List<Data46> data) {
        this.data = data;
    }

    /**
     * Converts this Coverages3 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Coverages3 [" + "data=" + data + "]";
    }

    /**
     * Builds a new {@link Coverages3.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Coverages3.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(data);
        return builder;
    }

    /**
     * Class to build instances of {@link Coverages3}.
     */
    public static class Builder {
        private List<Data46> data;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  data  List of Data46 value for data.
         */
        public Builder(List<Data46> data) {
            this.data = data;
        }

        /**
         * Setter for data.
         * @param  data  List of Data46 value for data.
         * @return Builder
         */
        public Builder data(List<Data46> data) {
            this.data = data;
            return this;
        }

        /**
         * Builds a new {@link Coverages3} object using the set fields.
         * @return {@link Coverages3}
         */
        public Coverages3 build() {
            return new Coverages3(data);
        }
    }
}
