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
import dev.insurtech.api.exceptions.InsuredRisks400Error1Exception;
import dev.insurtech.api.exceptions.InsuredRisks401Error1Exception;
import dev.insurtech.api.exceptions.InsuredRisks403Error1Exception;
import dev.insurtech.api.exceptions.InsuredRisks415Error1Exception;
import dev.insurtech.api.exceptions.InsuredRisks500Error1Exception;
import dev.insurtech.api.http.request.HttpMethod;
import dev.insurtech.api.models.InsuredRisksRequest;
import dev.insurtech.api.models.InsuredRisksResponse;
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
public final class InsuredRiskController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public InsuredRiskController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Creates a new insured risk to then utilize when creating a policy.
     * @param  boostUser  Required parameter: UUID that identifies the user.
     * @param  body  Required parameter: Example:
     * @return    Returns the InsuredRisksResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public InsuredRisksResponse postInsuredRisk(
            final UUID boostUser,
            final InsuredRisksRequest body) throws ApiException, IOException {
        return preparePostInsuredRiskRequest(boostUser, body).execute();
    }

    /**
     * Creates a new insured risk to then utilize when creating a policy.
     * @param  boostUser  Required parameter: UUID that identifies the user.
     * @param  body  Required parameter: Example:
     * @return    Returns the InsuredRisksResponse response from the API call
     */
    public CompletableFuture<InsuredRisksResponse> postInsuredRiskAsync(
            final UUID boostUser,
            final InsuredRisksRequest body) {
        try { 
            return preparePostInsuredRiskRequest(boostUser, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for postInsuredRisk.
     */
    private ApiCall<InsuredRisksResponse, ApiException> preparePostInsuredRiskRequest(
            final UUID boostUser,
            final InsuredRisksRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<InsuredRisksResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/insured-risks")
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
                                response -> ApiHelper.deserialize(response, InsuredRisksResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Request is invalid.",
                                (reason, context) -> new InsuredRisks400Error1Exception(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized. The bearer authentication failed.",
                                (reason, context) -> new InsuredRisks401Error1Exception(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden. The operation is not allowed.",
                                (reason, context) -> new InsuredRisks403Error1Exception(reason, context)))
                        .localErrorCase("415",
                                 ErrorCase.setReason("Unsupported Media Type. Only JSONAPI is supported.",
                                (reason, context) -> new InsuredRisks415Error1Exception(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("Internal Server Error.",
                                (reason, context) -> new InsuredRisks500Error1Exception(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}