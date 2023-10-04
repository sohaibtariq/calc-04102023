/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package dev.insurtech.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Agent type.
 */
public class Agent {
    private Data1 data;

    /**
     * Default constructor.
     */
    public Agent() {
    }

    /**
     * Initialization constructor.
     * @param  data  Data1 value for data.
     */
    public Agent(
            Data1 data) {
        this.data = data;
    }

    /**
     * Getter for Data.
     * Provided data for this agent relationship.
     * @return Returns the Data1
     */
    @JsonGetter("data")
    public Data1 getData() {
        return data;
    }

    /**
     * Setter for Data.
     * Provided data for this agent relationship.
     * @param data Value for Data1
     */
    @JsonSetter("data")
    public void setData(Data1 data) {
        this.data = data;
    }

    /**
     * Converts this Agent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Agent [" + "data=" + data + "]";
    }

    /**
     * Builds a new {@link Agent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Agent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(data);
        return builder;
    }

    /**
     * Class to build instances of {@link Agent}.
     */
    public static class Builder {
        private Data1 data;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  data  Data1 value for data.
         */
        public Builder(Data1 data) {
            this.data = data;
        }

        /**
         * Setter for data.
         * @param  data  Data1 value for data.
         * @return Builder
         */
        public Builder data(Data1 data) {
            this.data = data;
            return this;
        }

        /**
         * Builds a new {@link Agent} object using the set fields.
         * @return {@link Agent}
         */
        public Agent build() {
            return new Agent(data);
        }
    }
}