/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package dev.insurtech.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.UUID;

/**
 * This is a model class for Data20 type.
 */
public class Data20 {
    private String type;
    private UUID id;

    /**
     * Default constructor.
     */
    public Data20() {
        type = "endorsement";
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  id  UUID value for id.
     */
    public Data20(
            String type,
            UUID id) {
        this.type = type;
        this.id = id;
    }

    /**
     * Getter for Type.
     * Name of this related object. Must be `endorsement`.
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Name of this related object. Must be `endorsement`.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for Id.
     * UUID that identifies this resource.
     * @return Returns the UUID
     */
    @JsonGetter("id")
    public UUID getId() {
        return id;
    }

    /**
     * Setter for Id.
     * UUID that identifies this resource.
     * @param id Value for UUID
     */
    @JsonSetter("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Converts this Data20 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Data20 [" + "type=" + type + ", id=" + id + "]";
    }

    /**
     * Builds a new {@link Data20.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Data20.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type, id);
        return builder;
    }

    /**
     * Class to build instances of {@link Data20}.
     */
    public static class Builder {
        private String type = "endorsement";
        private UUID id;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  String value for type.
         * @param  id  UUID value for id.
         */
        public Builder(String type, UUID id) {
            this.type = type;
            this.id = id;
        }

        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  UUID value for id.
         * @return Builder
         */
        public Builder id(UUID id) {
            this.id = id;
            return this;
        }

        /**
         * Builds a new {@link Data20} object using the set fields.
         * @return {@link Data20}
         */
        public Data20 build() {
            return new Data20(type, id);
        }
    }
}
