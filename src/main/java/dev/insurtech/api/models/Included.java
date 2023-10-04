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
 * This is a model class for Included type.
 */
public class Included {
    private String type;
    private UUID id;
    private Attributes4 attributes;
    private Relationships4 relationships;

    /**
     * Default constructor.
     */
    public Included() {
        type = "coverage";
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  id  UUID value for id.
     * @param  attributes  Attributes4 value for attributes.
     * @param  relationships  Relationships4 value for relationships.
     */
    public Included(
            String type,
            UUID id,
            Attributes4 attributes,
            Relationships4 relationships) {
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
     * Getter for Attributes.
     * Attributes of this coverage.
     * @return Returns the Attributes4
     */
    @JsonGetter("attributes")
    public Attributes4 getAttributes() {
        return attributes;
    }

    /**
     * Setter for Attributes.
     * Attributes of this coverage.
     * @param attributes Value for Attributes4
     */
    @JsonSetter("attributes")
    public void setAttributes(Attributes4 attributes) {
        this.attributes = attributes;
    }

    /**
     * Getter for Relationships.
     * Items related to this coverage.
     * @return Returns the Relationships4
     */
    @JsonGetter("relationships")
    public Relationships4 getRelationships() {
        return relationships;
    }

    /**
     * Setter for Relationships.
     * Items related to this coverage.
     * @param relationships Value for Relationships4
     */
    @JsonSetter("relationships")
    public void setRelationships(Relationships4 relationships) {
        this.relationships = relationships;
    }

    /**
     * Converts this Included into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Included [" + "type=" + type + ", id=" + id + ", attributes=" + attributes
                + ", relationships=" + relationships + "]";
    }

    /**
     * Builds a new {@link Included.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Included.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type, id, attributes, relationships);
        return builder;
    }

    /**
     * Class to build instances of {@link Included}.
     */
    public static class Builder {
        private String type = "coverage";
        private UUID id;
        private Attributes4 attributes;
        private Relationships4 relationships;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  String value for type.
         * @param  id  UUID value for id.
         * @param  attributes  Attributes4 value for attributes.
         * @param  relationships  Relationships4 value for relationships.
         */
        public Builder(String type, UUID id, Attributes4 attributes, Relationships4 relationships) {
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
         * @param  attributes  Attributes4 value for attributes.
         * @return Builder
         */
        public Builder attributes(Attributes4 attributes) {
            this.attributes = attributes;
            return this;
        }

        /**
         * Setter for relationships.
         * @param  relationships  Relationships4 value for relationships.
         * @return Builder
         */
        public Builder relationships(Relationships4 relationships) {
            this.relationships = relationships;
            return this;
        }

        /**
         * Builds a new {@link Included} object using the set fields.
         * @return {@link Included}
         */
        public Included build() {
            return new Included(type, id, attributes, relationships);
        }
    }
}