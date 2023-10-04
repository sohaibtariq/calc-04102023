/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package dev.insurtech.api.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import dev.insurtech.api.ApiHelper;
import dev.insurtech.api.Server;
import dev.insurtech.api.exceptions.ApiException;
import dev.insurtech.api.exceptions.Policies400Error1Exception;
import dev.insurtech.api.exceptions.Policies401Error1Exception;
import dev.insurtech.api.exceptions.Policies403Error1Exception;
import dev.insurtech.api.exceptions.Policies500Error1Exception;
import dev.insurtech.api.http.request.HttpMethod;
import dev.insurtech.api.models.ContentType1Enum;
import dev.insurtech.api.models.PoliciesRequest;
import dev.insurtech.api.models.PoliciesResponse;
import dev.insurtech.api.models.PoliciesResponse1;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class PolicyController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public PolicyController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Issues a new policy with the given the input data. Policy goes in force on the specified
     * effective_date.
     * @param  boostUser  Required parameter: UUID that identifies the user.
     * @param  body  Required parameter: Example:
     * @return    Returns the PoliciesResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PoliciesResponse postPolicy(
            final UUID boostUser,
            final PoliciesRequest body) throws ApiException, IOException {
        return preparePostPolicyRequest(boostUser, body).execute();
    }

    /**
     * Issues a new policy with the given the input data. Policy goes in force on the specified
     * effective_date.
     * @param  boostUser  Required parameter: UUID that identifies the user.
     * @param  body  Required parameter: Example:
     * @return    Returns the PoliciesResponse response from the API call
     */
    public CompletableFuture<PoliciesResponse> postPolicyAsync(
            final UUID boostUser,
            final PoliciesRequest body) {
        try { 
            return preparePostPolicyRequest(boostUser, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for postPolicy.
     */
    private ApiCall<PoliciesResponse, ApiException> preparePostPolicyRequest(
            final UUID boostUser,
            final PoliciesRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<PoliciesResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/policies")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Boost-User")
                                .value(String.valueOf(boostUser)).isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/vnd.api+json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PoliciesResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Request is invalid.",
                                (reason, context) -> new Policies400Error1Exception(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized. The bearer authentication failed.",
                                (reason, context) -> new Policies401Error1Exception(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden. The operation is not allowed.",
                                (reason, context) -> new Policies403Error1Exception(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("Internal Server Error.",
                                (reason, context) -> new Policies500Error1Exception(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * List previously created policies.
     * @param  boostUser  Required parameter: UUID that identifies the user.
     * @param  accept  Optional parameter: Header to indicate that desired response type is
     *         JSON:API.
     * @return    Returns the PoliciesResponse1 response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public PoliciesResponse1 listPolicies(
            final UUID boostUser,
            final ContentType1Enum accept) throws ApiException, IOException {
        return prepareListPoliciesRequest(boostUser, accept).execute();
    }

    /**
     * List previously created policies.
     * @param  boostUser  Required parameter: UUID that identifies the user.
     * @param  accept  Optional parameter: Header to indicate that desired response type is
     *         JSON:API.
     * @return    Returns the PoliciesResponse1 response from the API call
     */
    public CompletableFuture<PoliciesResponse1> listPoliciesAsync(
            final UUID boostUser,
            final ContentType1Enum accept) {
        try { 
            return prepareListPoliciesRequest(boostUser, accept).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for listPolicies.
     */
    private ApiCall<PoliciesResponse1, ApiException> prepareListPoliciesRequest(
            final UUID boostUser,
            final ContentType1Enum accept) throws IOException {
        return new ApiCall.Builder<PoliciesResponse1, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/policies")
                        .headerParam(param -> param.key("Boost-User")
                                .value(String.valueOf(boostUser)).isRequired(false))
                        .headerParam(param -> param.key("Accept")
                                .value((accept != null) ? accept.value() : null).isRequired(false))
                        .authenticationKey(BaseController.AUTHENTICATION_KEY)
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, PoliciesResponse1.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}