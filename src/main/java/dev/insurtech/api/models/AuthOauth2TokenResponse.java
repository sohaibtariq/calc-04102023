/*
 * MergedApiLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package dev.insurtech.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for AuthOauth2TokenResponse type.
 */
public class AuthOauth2TokenResponse {
    private TokenTypeEnum tokenType;
    private String accessToken;
    private ExpiresInEnum expiresIn;

    /**
     * Default constructor.
     */
    public AuthOauth2TokenResponse() {
    }

    /**
     * Initialization constructor.
     * @param  tokenType  TokenTypeEnum value for tokenType.
     * @param  accessToken  String value for accessToken.
     * @param  expiresIn  ExpiresInEnum value for expiresIn.
     */
    public AuthOauth2TokenResponse(
            TokenTypeEnum tokenType,
            String accessToken,
            ExpiresInEnum expiresIn) {
        this.tokenType = tokenType;
        this.accessToken = accessToken;
        this.expiresIn = expiresIn;
    }

    /**
     * Getter for TokenType.
     * Type of token.
     * @return Returns the TokenTypeEnum
     */
    @JsonGetter("token_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TokenTypeEnum getTokenType() {
        return tokenType;
    }

    /**
     * Setter for TokenType.
     * Type of token.
     * @param tokenType Value for TokenTypeEnum
     */
    @JsonSetter("token_type")
    public void setTokenType(TokenTypeEnum tokenType) {
        this.tokenType = tokenType;
    }

    /**
     * Getter for AccessToken.
     * The token to be used in future API calls.
     * @return Returns the String
     */
    @JsonGetter("access_token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Setter for AccessToken.
     * The token to be used in future API calls.
     * @param accessToken Value for String
     */
    @JsonSetter("access_token")
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * Getter for ExpiresIn.
     * How long this token is valid for.
     * @return Returns the ExpiresInEnum
     */
    @JsonGetter("expires_in")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ExpiresInEnum getExpiresIn() {
        return expiresIn;
    }

    /**
     * Setter for ExpiresIn.
     * How long this token is valid for.
     * @param expiresIn Value for ExpiresInEnum
     */
    @JsonSetter("expires_in")
    public void setExpiresIn(ExpiresInEnum expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * Converts this AuthOauth2TokenResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AuthOauth2TokenResponse [" + "tokenType=" + tokenType + ", accessToken="
                + accessToken + ", expiresIn=" + expiresIn + "]";
    }

    /**
     * Builds a new {@link AuthOauth2TokenResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AuthOauth2TokenResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .tokenType(getTokenType())
                .accessToken(getAccessToken())
                .expiresIn(getExpiresIn());
        return builder;
    }

    /**
     * Class to build instances of {@link AuthOauth2TokenResponse}.
     */
    public static class Builder {
        private TokenTypeEnum tokenType;
        private String accessToken;
        private ExpiresInEnum expiresIn;



        /**
         * Setter for tokenType.
         * @param  tokenType  TokenTypeEnum value for tokenType.
         * @return Builder
         */
        public Builder tokenType(TokenTypeEnum tokenType) {
            this.tokenType = tokenType;
            return this;
        }

        /**
         * Setter for accessToken.
         * @param  accessToken  String value for accessToken.
         * @return Builder
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * Setter for expiresIn.
         * @param  expiresIn  ExpiresInEnum value for expiresIn.
         * @return Builder
         */
        public Builder expiresIn(ExpiresInEnum expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }

        /**
         * Builds a new {@link AuthOauth2TokenResponse} object using the set fields.
         * @return {@link AuthOauth2TokenResponse}
         */
        public AuthOauth2TokenResponse build() {
            return new AuthOauth2TokenResponse(tokenType, accessToken, expiresIn);
        }
    }
}
