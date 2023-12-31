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
 * This is a model class for Data3 type.
 */
public class Data3 {
    private String type;
    private UUID id;
    private Attributes1 attributes;
    private Relationships1 relationships;

    /**
     * Default constructor.
     */
    public Data3() {
        type = "insured_risk";
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  id  UUID value for id.
     * @param  attributes  Attributes1 value for attributes.
     * @param  relationships  Relationships1 value for relationships.
     */
    public Data3(
            String type,
            UUID id,
            Attributes1 attributes,
            Relationships1 relationships) {
        this.type = type;
        this.id = id;
        this.attributes = attributes;
        this.relationships = relationships;
    }

    /**
     * Getter for Type.
     * The type of resource being represented.
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * The type of resource being represented.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for Id.
     * @return Returns the UUID
     */
    @JsonGetter("id")
    public UUID getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for UUID
     */
    @JsonSetter("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Getter for Attributes.
     * Attributes that describe an Insured Risk.
     * @return Returns the Attributes1
     */
    @JsonGetter("attributes")
    public Attributes1 getAttributes() {
        return attributes;
    }

    /**
     * Setter for Attributes.
     * Attributes that describe an Insured Risk.
     * @param attributes Value for Attributes1
     */
    @JsonSetter("attributes")
    public void setAttributes(Attributes1 attributes) {
        this.attributes = attributes;
    }

    /**
     * Getter for Relationships.
     * Related objects.
     * @return Returns the Relationships1
     */
    @JsonGetter("relationships")
    public Relationships1 getRelationships() {
        return relationships;
    }

    /**
     * Setter for Relationships.
     * Related objects.
     * @param relationships Value for Relationships1
     */
    @JsonSetter("relationships")
    public void setRelationships(Relationships1 relationships) {
        this.relationships = relationships;
    }

    /**
     * Converts this Data3 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Data3 [" + "type=" + type + ", id=" + id + ", attributes=" + attributes
                + ", relationships=" + relationships + "]";
    }

    /**
     * Builds a new {@link Data3.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Data3.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type, id, attributes, relationships);
        return builder;
    }

    /**
     * Class to build instances of {@link Data3}.
     */
    public static class Builder {
        private String type = "insured_risk";
        private UUID id;
        private Attributes1 attributes;
        private Relationships1 relationships;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  String value for type.
         * @param  id  UUID value for id.
         * @param  attributes  Attributes1 value for attributes.
         * @param  relationships  Relationships1 value for relationships.
         */
        public Builder(String type, UUID id, Attributes1 attributes, Relationships1 relationships) {
            this.type = type;
            this.id = id;
            this.attributes = attributes;
            this.relationships = relationships;
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
         * Setter for attributes.
         * @param  attributes  Attributes1 value for attributes.
         * @return Builder
         */
        public Builder attributes(Attributes1 attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * Setter for relationships.
         * @param  relationships  Relationships1 value for relationships.
         * @return Builder
         */
        public Builder relationships(Relationships1 relationships) {
            this.relationships = relationships;
            return this;
        }

        /**
         * Builds a new {@link Data3} object using the set fields.
         * @return {@link Data3}
         */
        public Data3 build() {
            return new Data3(type, id, attributes, relationships);
        }
    }
}
