/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package dev.insurtech.api.controllers;

import dev.insurtech.api.ApiHelper;
import dev.insurtech.api.Server;
import dev.insurtech.api.exceptions.ApiException;
import dev.insurtech.api.exceptions.AuthOauth2Token400Error1Exception;
import dev.insurtech.api.http.request.HttpMethod;
import dev.insurtech.api.models.AuthOauth2TokenResponse;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class AuthenticationController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public AuthenticationController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Generates an access token which must be used on all subsequent API calls.
     * @param  clientId  Required parameter: Your Client ID
     * @param  clientSecret  Required parameter: Your Client Secret
     * @return    Returns the AuthOauth2TokenResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public AuthOauth2TokenResponse getOAuthToken(
            final String clientId,
            final String clientSecret) throws ApiException, IOException {
        return prepareGetOAuthTokenRequest(clientId, clientSecret).execute();
    }

    /**
     * Generates an access token which must be used on all subsequent API calls.
     * @param  clientId  Required parameter: Your Client ID
     * @param  clientSecret  Required parameter: Your Client Secret
     * @return    Returns the AuthOauth2TokenResponse response from the API call
     */
    public CompletableFuture<AuthOauth2TokenResponse> getOAuthTokenAsync(
            final String clientId,
            final String clientSecret) {
        try { 
            return prepareGetOAuthTokenRequest(clientId, clientSecret).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getOAuthToken.
     */
    private ApiCall<AuthOauth2TokenResponse, ApiException> prepareGetOAuthTokenRequest(
            final String clientId,
            final String clientSecret) throws IOException {
        return new ApiCall.Builder<AuthOauth2TokenResponse, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.ENUM_DEFAULT.value())
                        .path("/auth/oauth2/token")
                        .formParam(param -> param.key("client_id")
                                .value(clientId))
                        .formParam(param -> param.key("client_secret")
                                .value(clientSecret))
                        .formParam(param -> param.key("grant_type")
                                .value("client_credentials").isRequired(false))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/x-www-form-urlencoded").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .deserializer(
                                response -> ApiHelper.deserialize(response, AuthOauth2TokenResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Request is invalid",
                                (reason, context) -> new AuthOauth2Token400Error1Exception(reason, context)))
                        .localErrorCase("500",
                                 ErrorCase.setReason("Internal Server Error",
                                (reason, context) -> new ApiException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}