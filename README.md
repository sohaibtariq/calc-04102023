
# Getting Started with Merged Api

## Introduction

Boost API example documentation.

### Authentication

<!-- ReDoc-Inject: <security-definitions> -->, Simple calculator API hosted on APIMATIC


## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>io.sdks</groupId>
  <artifactId>apimatic-calculator-sdk</artifactId>
  <version>1.0.0</version>
</dependency>
```

You can also view the package at:
https://mvnrepository.com/artifact/io.sdks/apimatic-calculator-sdk/1.0.0

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project MergedApiLib from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](https://www.github.com/sohaibtariq/calc-04102023/tree/1.0.0/doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION22`** |
| `httpClientConfig` | [`ReadonlyHttpClientConfiguration`](https://www.github.com/sohaibtariq/calc-04102023/tree/1.0.0/doc/http-client-configuration.md) | Http Client Configuration instance. |
| `oAuthClientId` | `String` | OAuth 2 Client ID |
| `oAuthClientSecret` | `String` | OAuth 2 Client Secret |
| `oAuthToken` | `OAuthToken` | Object for storing information about the OAuth token |

The API client can be initialized as follows:

```java
MergedApiClient client = new MergedApiClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .clientCredentialsAuthCredentials("OAuthClientId", "OAuthClientSecret")
    .environment(Environment.PRODUCTION22)
    .build();
```

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| production22 | **Default** Production environment, This environment connect to the LIVE calculator API |
| development | development |

## Authorization

This API uses `OAuth 2 Client Credentials Grant`.

## Client Credentials Grant

Your application must obtain user authorization before it can execute an endpoint call in case this SDK chooses to use *OAuth 2.0 Client Credentials Grant*. This authorization includes the following steps

The `fetchToken()` method will exchange the OAuth client credentials for an *access token*. The access token is an object containing information for authorizing client requests and refreshing the token itself.

```java
try {
    OAuthToken token = client.getClientCredentialsAuth().fetchToken();
    // re-instantiate the client with oauth token
    client = client.newBuilder().oAuthToken(token).build();
} catch (Throwable e) {
    // TODO Handle exception
}
```

The client can now make authorized endpoint calls.

### Storing an access token for reuse

It is recommended that you store the access token for reuse.

```java
// store token
storeAccessToken(client.getClientCredentialsAuth().getOAuthToken());
```

### Creating a client from a stored token

To authorize a client from a stored access token, just set the access token in Configuration along with the other configuration parameters before creating the client:

```java
// load token later...
OAuthToken token = loadAccessToken();

// re-instantiate the client with oauth token
client = client.newBuilder().oAuthToken(token).build();
```

### Complete example

```java
package com.example;



public class Main {
    public Main() {
        MergedApiClient client = new MergedApiClient.Builder()
            .httpClientConfig(configBuilder -> configBuilder
                    .timeout(0))
            .clientCredentialsAuthCredentials("OAuthClientId", "OAuthClientSecret")
            .environment(Environment.PRODUCTION22)
            .build();
        
        


        try {
            OAuthToken token = client.getClientCredentialsAuth().fetchToken();
            // re-instantiate the client with oauth token
            client = client.newBuilder().oAuthToken(token).build();
        } catch (Throwable e) {
            // TODO Handle exception
        }

        // the client is now authorized; you can use client to make endpoint calls
    }
}
```

## List of APIs

* [Simple Calculator](https://www.github.com/sohaibtariq/calc-04102023/tree/1.0.0/doc/controllers/simple-calculator.md)
* [O Auth Authorization](https://www.github.com/sohaibtariq/calc-04102023/tree/1.0.0/doc/controllers/o-auth-authorization.md)
* [Authentication](https://www.github.com/sohaibtariq/calc-04102023/tree/1.0.0/doc/controllers/authentication.md)
* [Quoting](https://www.github.com/sohaibtariq/calc-04102023/tree/1.0.0/doc/controllers/quoting.md)
* [Policy](https://www.github.com/sohaibtariq/calc-04102023/tree/1.0.0/doc/controllers/policy.md)
* [Insured-Risk](https://www.github.com/sohaibtariq/calc-04102023/tree/1.0.0/doc/controllers/insured-risk.md)

## Classes Documentation

* [Utility Classes](https://www.github.com/sohaibtariq/calc-04102023/tree/1.0.0/doc/utility-classes.md)
* [HttpRequest](https://www.github.com/sohaibtariq/calc-04102023/tree/1.0.0/doc/http-request.md)
* [HttpResponse](https://www.github.com/sohaibtariq/calc-04102023/tree/1.0.0/doc/http-response.md)
* [HttpStringResponse](https://www.github.com/sohaibtariq/calc-04102023/tree/1.0.0/doc/http-string-response.md)
* [HttpContext](https://www.github.com/sohaibtariq/calc-04102023/tree/1.0.0/doc/http-context.md)
* [HttpBodyRequest](https://www.github.com/sohaibtariq/calc-04102023/tree/1.0.0/doc/http-body-request.md)
* [HttpCallback Interface](https://www.github.com/sohaibtariq/calc-04102023/tree/1.0.0/doc/http-callback-interface.md)
* [Headers](https://www.github.com/sohaibtariq/calc-04102023/tree/1.0.0/doc/headers.md)
* [ApiException](https://www.github.com/sohaibtariq/calc-04102023/tree/1.0.0/doc/api-exception.md)
* [Configuration Interface](https://www.github.com/sohaibtariq/calc-04102023/tree/1.0.0/doc/configuration-interface.md)
* [HttpClientConfiguration](https://www.github.com/sohaibtariq/calc-04102023/tree/1.0.0/doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](https://www.github.com/sohaibtariq/calc-04102023/tree/1.0.0/doc/http-client-configuration-builder.md)

