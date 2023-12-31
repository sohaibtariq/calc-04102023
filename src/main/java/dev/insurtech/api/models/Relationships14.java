/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package dev.insurtech.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Relationships14 type.
 */
public class Relationships14 {
    private Product6 product;
    private Agent6 agent;

    /**
     * Default constructor.
     */
    public Relationships14() {
    }

    /**
     * Initialization constructor.
     * @param  product  Product6 value for product.
     * @param  agent  Agent6 value for agent.
     */
    public Relationships14(
            Product6 product,
            Agent6 agent) {
        this.product = product;
        this.agent = agent;
    }

    /**
     * Getter for Product.
     * Boost supplied value representing the specific product type. The product's configuration will
     * determine allowable values for the Policy, such as limit and deductible.
     * @return Returns the Product6
     */
    @JsonGetter("product")
    public Product6 getProduct() {
        return product;
    }

    /**
     * Setter for Product.
     * Boost supplied value representing the specific product type. The product's configuration will
     * determine allowable values for the Policy, such as limit and deductible.
     * @param product Value for Product6
     */
    @JsonSetter("product")
    public void setProduct(Product6 product) {
        this.product = product;
    }

    /**
     * Getter for Agent.
     * The Boost UUID of the agent.
     * @return Returns the Agent6
     */
    @JsonGetter("agent")
    public Agent6 getAgent() {
        return agent;
    }

    /**
     * Setter for Agent.
     * The Boost UUID of the agent.
     * @param agent Value for Agent6
     */
    @JsonSetter("agent")
    public void setAgent(Agent6 agent) {
        this.agent = agent;
    }

    /**
     * Converts this Relationships14 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Relationships14 [" + "product=" + product + ", agent=" + agent + "]";
    }

    /**
     * Builds a new {@link Relationships14.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Relationships14.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(product, agent);
        return builder;
    }

    /**
     * Class to build instances of {@link Relationships14}.
     */
    public static class Builder {
        private Product6 product;
        private Agent6 agent;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  product  Product6 value for product.
         * @param  agent  Agent6 value for agent.
         */
        public Builder(Product6 product, Agent6 agent) {
            this.product = product;
            this.agent = agent;
        }

        /**
         * Setter for product.
         * @param  product  Product6 value for product.
         * @return Builder
         */
        public Builder product(Product6 product) {
            this.product = product;
            return this;
        }

        /**
         * Setter for agent.
         * @param  agent  Agent6 value for agent.
         * @return Builder
         */
        public Builder agent(Agent6 agent) {
            this.agent = agent;
            return this;
        }

        /**
         * Builds a new {@link Relationships14} object using the set fields.
         * @return {@link Relationships14}
         */
        public Relationships14 build() {
            return new Relationships14(product, agent);
        }
    }
}
