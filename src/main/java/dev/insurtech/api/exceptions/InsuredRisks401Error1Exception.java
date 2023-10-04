/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package dev.insurtech.api.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import dev.insurtech.api.models.Errors;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for InsuredRisks401Error1Exception type.
 */
public class InsuredRisks401Error1Exception extends ApiException {
    private static final long serialVersionUID = -5975427376392512L;
    private Errors errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public InsuredRisks401Error1Exception(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * @return Returns the Errors
     */
    @JsonGetter("errors")
    public Errors getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for Errors
     */
    @JsonSetter("errors")
    private void setErrors(Errors errors) {
        this.errors = errors;
    }
}
