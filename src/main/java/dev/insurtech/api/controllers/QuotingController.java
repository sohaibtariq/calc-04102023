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
import dev.insurtech.api.exceptions.Quotes400Error1Exception;
import dev.insurtech.api.exceptions.Quotes401Error1Exception;
import dev.insurtech.api.exceptions.Quotes500Error1Exception;
import dev.insurtech.api.http.request.HttpMethod;
import dev.insurtech.api.models.QuotesRequest;
import dev.insurtech.api.models.QuotesResponse;
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
public final class QuotingController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public QuotingController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Issues a new quote.
     * @param  boostUser  Required parameter: Boost provided agent UUID that identifies the user.
     * @param  body  Required parameter: Example:
     * @return    Returns the QuotesResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public QuotesResponse postQuote(
            final UUID boostUser,
            final QuotesRequest body) throws ApiException, IOException {
        return preparePostQuoteRequest(boostUser, body).execute();
    }

    /**
     * Issues a new quote.
     * @param  boostUser  Required parameter: Boost provided agent UUID that identifies the user.
     * @param  body  Required parameter: Example:
     * @return    Returns the QuotesResponse response from the API call
     */
    public CompletableFuture<QuotesResponse> postQuoteAsync(
            final UUID boostUser,
            final QuotesRequest body) {
        try { 
            return preparePostQuoteRequest(boostUser, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for postQuote.
     */
    private ApiCall<QuotesResponse, ApiException> preparePostQuoteRequest(
            final UUID boostUser,
            final QuotesRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<QuotesResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/quotes")
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
                                response -> ApiHelper.deserialize(response, QuotesResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Request is invalid.",
                                (reason, context) -> new Quotes400Error1Exception(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized. The bearer authentication failed.",
                                (reason, context) -> new Quotes401Error1Exception(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("Internal Server Error.",
                                (reason, context) -> new Quotes500Error1Exception(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}