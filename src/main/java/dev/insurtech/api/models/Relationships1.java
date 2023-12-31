/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package dev.insurtech.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Relationships1 type.
 */
public class Relationships1 {
    private Agent agent;
    private Product product;

    /**
     * Default constructor.
     */
    public Relationships1() {
    }

    /**
     * Initialization constructor.
     * @param  agent  Agent value for agent.
     * @param  product  Product value for product.
     */
    public Relationships1(
            Agent agent,
            Product product) {
        this.agent = agent;
        this.product = product;
    }

    /**
     * Getter for Agent.
     * UUID of the agent.
     * @return Returns the Agent
     */
    @JsonGetter("agent")
    public Agent getAgent() {
        return agent;
    }

    /**
     * Setter for Agent.
     * UUID of the agent.
     * @param agent Value for Agent
     */
    @JsonSetter("agent")
    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    /**
     * Getter for Product.
     * Boost supplied value representing the specific product type. The product's configuration
     * Determines allowable values, such as limits and deductibles.
     * @return Returns the Product
     */
    @JsonGetter("product")
    public Product getProduct() {
        return product;
    }

    /**
     * Setter for Product.
     * Boost supplied value representing the specific product type. The product's configuration
     * Determines allowable values, such as limits and deductibles.
     * @param product Value for Product
     */
    @JsonSetter("product")
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * Converts this Relationships1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Relationships1 [" + "agent=" + agent + ", product=" + product + "]";
    }

    /**
     * Builds a new {@link Relationships1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Relationships1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(agent, product);
        return builder;
    }

    /**
     * Class to build instances of {@link Relationships1}.
     */
    public static class Builder {
        private Agent agent;
        private Product product;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  agent  Agent value for agent.
         * @param  product  Product value for product.
         */
        public Builder(Agent agent, Product product) {
            this.agent = agent;
            this.product = product;
        }

        /**
         * Setter for agent.
         * @param  agent  Agent value for agent.
         * @return Builder
         */
        public Builder agent(Agent agent) {
            this.agent = agent;
            return this;
        }

        /**
         * Setter for product.
         * @param  product  Product value for product.
         * @return Builder
         */
        public Builder product(Product product) {
            this.product = product;
            return this;
        }

        /**
         * Builds a new {@link Relationships1} object using the set fields.
         * @return {@link Relationships1}
         */
        public Relationships1 build() {
            return new Relationships1(agent, product);
        }
    }
}
