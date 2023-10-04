/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package dev.insurtech.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Data39 type.
 */
public class Data39 {
    private String type;
    private Attributes9 attributes;
    private Relationships9 relationships;

    /**
     * Default constructor.
     */
    public Data39() {
        type = "quote";
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  attributes  Attributes9 value for attributes.
     * @param  relationships  Relationships9 value for relationships.
     */
    public Data39(
            String type,
            Attributes9 attributes,
            Relationships9 relationships) {
        this.type = type;
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
     * Getter for Attributes.
     * Attributes for this object.
     * @return Returns the Attributes9
     */
    @JsonGetter("attributes")
    public Attributes9 getAttributes() {
        return attributes;
    }

    /**
     * Setter for Attributes.
     * Attributes for this object.
     * @param attributes Value for Attributes9
     */
    @JsonSetter("attributes")
    public void setAttributes(Attributes9 attributes) {
        this.attributes = attributes;
    }

    /**
     * Getter for Relationships.
     * Related items.
     * @return Returns the Relationships9
     */
    @JsonGetter("relationships")
    public Relationships9 getRelationships() {
        return relationships;
    }

    /**
     * Setter for Relationships.
     * Related items.
     * @param relationships Value for Relationships9
     */
    @JsonSetter("relationships")
    public void setRelationships(Relationships9 relationships) {
        this.relationships = relationships;
    }

    /**
     * Converts this Data39 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Data39 [" + "type=" + type + ", attributes=" + attributes + ", relationships="
                + relationships + "]";
    }

    /**
     * Builds a new {@link Data39.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Data39.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type, attributes, relationships);
        return builder;
    }

    /**
     * Class to build instances of {@link Data39}.
     */
    public static class Builder {
        private String type = "quote";
        private Attributes9 attributes;
        private Relationships9 relationships;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  String value for type.
         * @param  attributes  Attributes9 value for attributes.
         * @param  relationships  Relationships9 value for relationships.
         */
        public Builder(String type, Attributes9 attributes, Relationships9 relationships) {
            this.type = type;
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
         * Setter for attributes.
         * @param  attributes  Attributes9 value for attributes.
         * @return Builder
         */
        public Builder attributes(Attributes9 attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * Setter for relationships.
         * @param  relationships  Relationships9 value for relationships.
         * @return Builder
         */
        public Builder relationships(Relationships9 relationships) {
            this.relationships = relationships;
            return this;
        }

        /**
         * Builds a new {@link Data39} object using the set fields.
         * @return {@link Data39}
         */
        public Data39 build() {
            return new Data39(type, attributes, relationships);
        }
    }
}