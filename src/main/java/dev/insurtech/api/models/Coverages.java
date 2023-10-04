/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package dev.insurtech.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for Coverages type.
 */
public class Coverages {
    private List<Data7> data;
    private Meta meta;

    /**
     * Default constructor.
     */
    public Coverages() {
    }

    /**
     * Initialization constructor.
     * @param  data  List of Data7 value for data.
     * @param  meta  Meta value for meta.
     */
    public Coverages(
            List<Data7> data,
            Meta meta) {
        this.data = data;
        this.meta = meta;
    }

    /**
     * Getter for Data.
     * List of coverages.
     * @return Returns the List of Data7
     */
    @JsonGetter("data")
    public List<Data7> getData() {
        return data;
    }

    /**
     * Setter for Data.
     * List of coverages.
     * @param data Value for List of Data7
     */
    @JsonSetter("data")
    public void setData(List<Data7> data) {
        this.data = data;
    }

    /**
     * Getter for Meta.
     * Additional meta information about this data.
     * @return Returns the Meta
     */
    @JsonGetter("meta")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Meta getMeta() {
        return meta;
    }

    /**
     * Setter for Meta.
     * Additional meta information about this data.
     * @param meta Value for Meta
     */
    @JsonSetter("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * Converts this Coverages into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Coverages [" + "data=" + data + ", meta=" + meta + "]";
    }

    /**
     * Builds a new {@link Coverages.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Coverages.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(data)
                .meta(getMeta());
        return builder;
    }

    /**
     * Class to build instances of {@link Coverages}.
     */
    public static class Builder {
        private List<Data7> data;
        private Meta meta;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  data  List of Data7 value for data.
         */
        public Builder(List<Data7> data) {
            this.data = data;
        }

        /**
         * Setter for data.
         * @param  data  List of Data7 value for data.
         * @return Builder
         */
        public Builder data(List<Data7> data) {
            this.data = data;
            return this;
        }

        /**
         * Setter for meta.
         * @param  meta  Meta value for meta.
         * @return Builder
         */
        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        /**
         * Builds a new {@link Coverages} object using the set fields.
         * @return {@link Coverages}
         */
        public Coverages build() {
            return new Coverages(data, meta);
        }
    }
}
