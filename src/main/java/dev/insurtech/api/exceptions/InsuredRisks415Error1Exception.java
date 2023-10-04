/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package dev.insurtech.api.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import dev.insurtech.api.models.Errors1;
import io.apimatic.coreinterfaces.http.Context;
import java.util.List;

/**
 * This is a model class for InsuredRisks415Error1Exception type.
 */
public class InsuredRisks415Error1Exception extends ApiException {
    private static final long serialVersionUID = -40744087239527224L;
    private List<Errors1> errors;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public InsuredRisks415Error1Exception(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Errors.
     * @return Returns the List of Errors1
     */
    @JsonGetter("errors")
    public List<Errors1> getErrors() {
        return this.errors;
    }

    /**
     * Setter for Errors.
     * @param errors Value for List of Errors1
     */
    @JsonSetter("errors")
    private void setErrors(List<Errors1> errors) {
        this.errors = errors;
    }
}
