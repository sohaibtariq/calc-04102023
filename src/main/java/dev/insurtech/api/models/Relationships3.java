/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package dev.insurtech.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Relationships3 type.
 */
public class Relationships3 {
    private Coverages coverages;
    private InsuredRisk insuredRisk;
    private Customer customer;
    private Product2 product;
    private Parent parent;
    private AdditionalInterests additionalInterests;
    private AdditionalInsured additionalInsured;
    private Agent agent;
    private InstallmentPlan installmentPlan;

    /**
     * Default constructor.
     */
    public Relationships3() {
    }

    /**
     * Initialization constructor.
     * @param  coverages  Coverages value for coverages.
     * @param  insuredRisk  InsuredRisk value for insuredRisk.
     * @param  customer  Customer value for customer.
     * @param  product  Product2 value for product.
     * @param  parent  Parent value for parent.
     * @param  additionalInterests  AdditionalInterests value for additionalInterests.
     * @param  additionalInsured  AdditionalInsured value for additionalInsured.
     * @param  agent  Agent value for agent.
     * @param  installmentPlan  InstallmentPlan value for installmentPlan.
     */
    public Relationships3(
            Coverages coverages,
            InsuredRisk insuredRisk,
            Customer customer,
            Product2 product,
            Parent parent,
            AdditionalInterests additionalInterests,
            AdditionalInsured additionalInsured,
            Agent agent,
            InstallmentPlan installmentPlan) {
        this.coverages = coverages;
        this.insuredRisk = insuredRisk;
        this.customer = customer;
        this.product = product;
        this.parent = parent;
        this.additionalInterests = additionalInterests;
        this.additionalInsured = additionalInsured;
        this.agent = agent;
        this.installmentPlan = installmentPlan;
    }

    /**
     * Getter for Coverages.
     * List of coverages that apply to this policy.
     * @return Returns the Coverages
     */
    @JsonGetter("coverages")
    public Coverages getCoverages() {
        return coverages;
    }

    /**
     * Setter for Coverages.
     * List of coverages that apply to this policy.
     * @param coverages Value for Coverages
     */
    @JsonSetter("coverages")
    public void setCoverages(Coverages coverages) {
        this.coverages = coverages;
    }

    /**
     * Getter for InsuredRisk.
     * The risk insured by the policy.
     * @return Returns the InsuredRisk
     */
    @JsonGetter("insured_risk")
    public InsuredRisk getInsuredRisk() {
        return insuredRisk;
    }

    /**
     * Setter for InsuredRisk.
     * The risk insured by the policy.
     * @param insuredRisk Value for InsuredRisk
     */
    @JsonSetter("insured_risk")
    public void setInsuredRisk(InsuredRisk insuredRisk) {
        this.insuredRisk = insuredRisk;
    }

    /**
     * Getter for Customer.
     * Relationship containing the id that identifies the customer for this policy.
     * @return Returns the Customer
     */
    @JsonGetter("customer")
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * Relationship containing the id that identifies the customer for this policy.
     * @param customer Value for Customer
     */
    @JsonSetter("customer")
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Getter for Product.
     * Boost supplied value representing the specific product type. The product's configuration
     * Determines allowable values, such as limit and deductible.
     * @return Returns the Product2
     */
    @JsonGetter("product")
    public Product2 getProduct() {
        return product;
    }

    /**
     * Setter for Product.
     * Boost supplied value representing the specific product type. The product's configuration
     * Determines allowable values, such as limit and deductible.
     * @param product Value for Product2
     */
    @JsonSetter("product")
    public void setProduct(Product2 product) {
        this.product = product;
    }

    /**
     * Getter for Parent.
     * ID of parent policy. Product must also be a parent product.
     * @return Returns the Parent
     */
    @JsonGetter("parent")
    public Parent getParent() {
        return parent;
    }

    /**
     * Setter for Parent.
     * ID of parent policy. Product must also be a parent product.
     * @param parent Value for Parent
     */
    @JsonSetter("parent")
    public void setParent(Parent parent) {
        this.parent = parent;
    }

    /**
     * Getter for AdditionalInterests.
     * List of additional interests for this policy.
     * @return Returns the AdditionalInterests
     */
    @JsonGetter("additional_interests")
    public AdditionalInterests getAdditionalInterests() {
        return additionalInterests;
    }

    /**
     * Setter for AdditionalInterests.
     * List of additional interests for this policy.
     * @param additionalInterests Value for AdditionalInterests
     */
    @JsonSetter("additional_interests")
    public void setAdditionalInterests(AdditionalInterests additionalInterests) {
        this.additionalInterests = additionalInterests;
    }

    /**
     * Getter for AdditionalInsured.
     * List of additional insured for this policy.
     * @return Returns the AdditionalInsured
     */
    @JsonGetter("additional_insured")
    public AdditionalInsured getAdditionalInsured() {
        return additionalInsured;
    }

    /**
     * Setter for AdditionalInsured.
     * List of additional insured for this policy.
     * @param additionalInsured Value for AdditionalInsured
     */
    @JsonSetter("additional_insured")
    public void setAdditionalInsured(AdditionalInsured additionalInsured) {
        this.additionalInsured = additionalInsured;
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
     * Getter for InstallmentPlan.
     * The Boost UUID for the `installment_plan` based on the chosen installment plan.
     * @return Returns the InstallmentPlan
     */
    @JsonGetter("installment_plan")
    public InstallmentPlan getInstallmentPlan() {
        return installmentPlan;
    }

    /**
     * Setter for InstallmentPlan.
     * The Boost UUID for the `installment_plan` based on the chosen installment plan.
     * @param installmentPlan Value for InstallmentPlan
     */
    @JsonSetter("installment_plan")
    public void setInstallmentPlan(InstallmentPlan installmentPlan) {
        this.installmentPlan = installmentPlan;
    }

    /**
     * Converts this Relationships3 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Relationships3 [" + "coverages=" + coverages + ", insuredRisk=" + insuredRisk
                + ", customer=" + customer + ", product=" + product + ", parent=" + parent
                + ", additionalInterests=" + additionalInterests + ", additionalInsured="
                + additionalInsured + ", agent=" + agent + ", installmentPlan=" + installmentPlan
                + "]";
    }

    /**
     * Builds a new {@link Relationships3.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Relationships3.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(coverages, insuredRisk, customer, product, parent,
                additionalInterests, additionalInsured, agent, installmentPlan);
        return builder;
    }

    /**
     * Class to build instances of {@link Relationships3}.
     */
    public static class Builder {
        private Coverages coverages;
        private InsuredRisk insuredRisk;
        private Customer customer;
        private Product2 product;
        private Parent parent;
        private AdditionalInterests additionalInterests;
        private AdditionalInsured additionalInsured;
        private Agent agent;
        private InstallmentPlan installmentPlan;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  coverages  Coverages value for coverages.
         * @param  insuredRisk  InsuredRisk value for insuredRisk.
         * @param  customer  Customer value for customer.
         * @param  product  Product2 value for product.
         * @param  parent  Parent value for parent.
         * @param  additionalInterests  AdditionalInterests value for additionalInterests.
         * @param  additionalInsured  AdditionalInsured value for additionalInsured.
         * @param  agent  Agent value for agent.
         * @param  installmentPlan  InstallmentPlan value for installmentPlan.
         */
        public Builder(Coverages coverages, InsuredRisk insuredRisk, Customer customer,
                Product2 product, Parent parent, AdditionalInterests additionalInterests,
                AdditionalInsured additionalInsured, Agent agent, InstallmentPlan installmentPlan) {
            this.coverages = coverages;
            this.insuredRisk = insuredRisk;
            this.customer = customer;
            this.product = product;
            this.parent = parent;
            this.additionalInterests = additionalInterests;
            this.additionalInsured = additionalInsured;
            this.agent = agent;
            this.installmentPlan = installmentPlan;
        }

        /**
         * Setter for coverages.
         * @param  coverages  Coverages value for coverages.
         * @return Builder
         */
        public Builder coverages(Coverages coverages) {
            this.coverages = coverages;
            return this;
        }

        /**
         * Setter for insuredRisk.
         * @param  insuredRisk  InsuredRisk value for insuredRisk.
         * @return Builder
         */
        public Builder insuredRisk(InsuredRisk insuredRisk) {
            this.insuredRisk = insuredRisk;
            return this;
        }

        /**
         * Setter for customer.
         * @param  customer  Customer value for customer.
         * @return Builder
         */
        public Builder customer(Customer customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Setter for product.
         * @param  product  Product2 value for product.
         * @return Builder
         */
        public Builder product(Product2 product) {
            this.product = product;
            return this;
        }

        /**
         * Setter for parent.
         * @param  parent  Parent value for parent.
         * @return Builder
         */
        public Builder parent(Parent parent) {
            this.parent = parent;
            return this;
        }

        /**
         * Setter for additionalInterests.
         * @param  additionalInterests  AdditionalInterests value for additionalInterests.
         * @return Builder
         */
        public Builder additionalInterests(AdditionalInterests additionalInterests) {
            this.additionalInterests = additionalInterests;
            return this;
        }

        /**
         * Setter for additionalInsured.
         * @param  additionalInsured  AdditionalInsured value for additionalInsured.
         * @return Builder
         */
        public Builder additionalInsured(AdditionalInsured additionalInsured) {
            this.additionalInsured = additionalInsured;
            return this;
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
         * Setter for installmentPlan.
         * @param  installmentPlan  InstallmentPlan value for installmentPlan.
         * @return Builder
         */
        public Builder installmentPlan(InstallmentPlan installmentPlan) {
            this.installmentPlan = installmentPlan;
            return this;
        }

        /**
         * Builds a new {@link Relationships3} object using the set fields.
         * @return {@link Relationships3}
         */
        public Relationships3 build() {
            return new Relationships3(coverages, insuredRisk, customer, product, parent,
                    additionalInterests, additionalInsured, agent, installmentPlan);
        }
    }
}
