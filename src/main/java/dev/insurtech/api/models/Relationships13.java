/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package dev.insurtech.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Relationships13 type.
 */
public class Relationships13 {
    private Agent6 agent;

    /**
     * Default constructor.
     */
    public Relationships13() {
    }

    /**
     * Initialization constructor.
     * @param  agent  Agent6 value for agent.
     */
    public Relationships13(
            Agent6 agent) {
        this.agent = agent;
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
     * Converts this Relationships13 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Relationships13 [" + "agent=" + agent + "]";
    }

    /**
     * Builds a new {@link Relationships13.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Relationships13.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(agent);
        return builder;
    }

    /**
     * Class to build instances of {@link Relationships13}.
     */
    public static class Builder {
        private Agent6 agent;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  agent  Agent6 value for agent.
         */
        public Builder(Agent6 agent) {
            this.agent = agent;
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
         * Builds a new {@link Relationships13} object using the set fields.
         * @return {@link Relationships13}
         */
        public Relationships13 build() {
            return new Relationships13(agent);
        }
    }
}
