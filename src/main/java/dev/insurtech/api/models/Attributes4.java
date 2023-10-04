/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package dev.insurtech.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.insurtech.api.DateTimeHelper;
import java.time.LocalDateTime;

/**
 * This is a model class for Attributes4 type.
 */
public class Attributes4 {
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private String deductible;
    private String limit;
    private String premium;
    private String additionalFees;
    private LocalDateTime revisionDate;

    /**
     * Default constructor.
     */
    public Attributes4() {
    }

    /**
     * Initialization constructor.
     * @param  createdDate  LocalDateTime value for createdDate.
     * @param  modifiedDate  LocalDateTime value for modifiedDate.
     * @param  deductible  String value for deductible.
     * @param  limit  String value for limit.
     * @param  premium  String value for premium.
     * @param  additionalFees  String value for additionalFees.
     * @param  revisionDate  LocalDateTime value for revisionDate.
     */
    public Attributes4(
            LocalDateTime createdDate,
            LocalDateTime modifiedDate,
            String deductible,
            String limit,
            String premium,
            String additionalFees,
            LocalDateTime revisionDate) {
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.deductible = deductible;
        this.limit = limit;
        this.premium = premium;
        this.additionalFees = additionalFees;
        this.revisionDate = revisionDate;
    }

    /**
     * Getter for CreatedDate.
     * Date time when this resource was created in our system.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_date")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    /**
     * Setter for CreatedDate.
     * Date time when this resource was created in our system.
     * @param createdDate Value for LocalDateTime
     */
    @JsonSetter("created_date")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Getter for ModifiedDate.
     * Date time when this resource was last modified in our system.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("modified_date")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Setter for ModifiedDate.
     * Date time when this resource was last modified in our system.
     * @param modifiedDate Value for LocalDateTime
     */
    @JsonSetter("modified_date")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * Getter for Deductible.
     * A value from the set denoting the user-selected deductible of coverage. This is dependent on
     * the product's configuration.
     * @return Returns the String
     */
    @JsonGetter("deductible")
    public String getDeductible() {
        return deductible;
    }

    /**
     * Setter for Deductible.
     * A value from the set denoting the user-selected deductible of coverage. This is dependent on
     * the product's configuration.
     * @param deductible Value for String
     */
    @JsonSetter("deductible")
    public void setDeductible(String deductible) {
        this.deductible = deductible;
    }

    /**
     * Getter for Limit.
     * A value from the set denoting the user-selected limit of coverage. This is dependent on the
     * product's configuration.
     * @return Returns the String
     */
    @JsonGetter("limit")
    public String getLimit() {
        return limit;
    }

    /**
     * Setter for Limit.
     * A value from the set denoting the user-selected limit of coverage. This is dependent on the
     * product's configuration.
     * @param limit Value for String
     */
    @JsonSetter("limit")
    public void setLimit(String limit) {
        this.limit = limit;
    }

    /**
     * Getter for Premium.
     * Term premium for this coverage
     * @return Returns the String
     */
    @JsonGetter("premium")
    public String getPremium() {
        return premium;
    }

    /**
     * Setter for Premium.
     * Term premium for this coverage
     * @param premium Value for String
     */
    @JsonSetter("premium")
    public void setPremium(String premium) {
        this.premium = premium;
    }

    /**
     * Getter for AdditionalFees.
     * Additional fees relating to this coverage.
     * @return Returns the String
     */
    @JsonGetter("additional_fees")
    public String getAdditionalFees() {
        return additionalFees;
    }

    /**
     * Setter for AdditionalFees.
     * Additional fees relating to this coverage.
     * @param additionalFees Value for String
     */
    @JsonSetter("additional_fees")
    public void setAdditionalFees(String additionalFees) {
        this.additionalFees = additionalFees;
    }

    /**
     * Getter for RevisionDate.
     * Date for when this coverage goes into effect on the policy.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("revision_date")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getRevisionDate() {
        return revisionDate;
    }

    /**
     * Setter for RevisionDate.
     * Date for when this coverage goes into effect on the policy.
     * @param revisionDate Value for LocalDateTime
     */
    @JsonSetter("revision_date")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setRevisionDate(LocalDateTime revisionDate) {
        this.revisionDate = revisionDate;
    }

    /**
     * Converts this Attributes4 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Attributes4 [" + "createdDate=" + createdDate + ", modifiedDate=" + modifiedDate
                + ", deductible=" + deductible + ", limit=" + limit + ", premium=" + premium
                + ", additionalFees=" + additionalFees + ", revisionDate=" + revisionDate + "]";
    }

    /**
     * Builds a new {@link Attributes4.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Attributes4.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(createdDate, modifiedDate, deductible, limit, premium,
                additionalFees, revisionDate);
        return builder;
    }

    /**
     * Class to build instances of {@link Attributes4}.
     */
    public static class Builder {
        private LocalDateTime createdDate;
        private LocalDateTime modifiedDate;
        private String deductible;
        private String limit;
        private String premium;
        private String additionalFees;
        private LocalDateTime revisionDate;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  createdDate  LocalDateTime value for createdDate.
         * @param  modifiedDate  LocalDateTime value for modifiedDate.
         * @param  deductible  String value for deductible.
         * @param  limit  String value for limit.
         * @param  premium  String value for premium.
         * @param  additionalFees  String value for additionalFees.
         * @param  revisionDate  LocalDateTime value for revisionDate.
         */
        public Builder(LocalDateTime createdDate, LocalDateTime modifiedDate, String deductible,
                String limit, String premium, String additionalFees, LocalDateTime revisionDate) {
            this.createdDate = createdDate;
            this.modifiedDate = modifiedDate;
            this.deductible = deductible;
            this.limit = limit;
            this.premium = premium;
            this.additionalFees = additionalFees;
            this.revisionDate = revisionDate;
        }

        /**
         * Setter for createdDate.
         * @param  createdDate  LocalDateTime value for createdDate.
         * @return Builder
         */
        public Builder createdDate(LocalDateTime createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        /**
         * Setter for modifiedDate.
         * @param  modifiedDate  LocalDateTime value for modifiedDate.
         * @return Builder
         */
        public Builder modifiedDate(LocalDateTime modifiedDate) {
            this.modifiedDate = modifiedDate;
            return this;
        }

        /**
         * Setter for deductible.
         * @param  deductible  String value for deductible.
         * @return Builder
         */
        public Builder deductible(String deductible) {
            this.deductible = deductible;
            return this;
        }

        /**
         * Setter for limit.
         * @param  limit  String value for limit.
         * @return Builder
         */
        public Builder limit(String limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Setter for premium.
         * @param  premium  String value for premium.
         * @return Builder
         */
        public Builder premium(String premium) {
            this.premium = premium;
            return this;
        }

        /**
         * Setter for additionalFees.
         * @param  additionalFees  String value for additionalFees.
         * @return Builder
         */
        public Builder additionalFees(String additionalFees) {
            this.additionalFees = additionalFees;
            return this;
        }

        /**
         * Setter for revisionDate.
         * @param  revisionDate  LocalDateTime value for revisionDate.
         * @return Builder
         */
        public Builder revisionDate(LocalDateTime revisionDate) {
            this.revisionDate = revisionDate;
            return this;
        }

        /**
         * Builds a new {@link Attributes4} object using the set fields.
         * @return {@link Attributes4}
         */
        public Attributes4 build() {
            return new Attributes4(createdDate, modifiedDate, deductible, limit, premium,
                    additionalFees, revisionDate);
        }
    }
}
