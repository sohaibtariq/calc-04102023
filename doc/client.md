
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `environment` | Environment | The API environment. <br> **Default: `Environment.PRODUCTION22`** |
| `httpClientConfig` | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) | Http Client Configuration instance. |
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

## Merged ApiClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getAuthenticationController()` | Provides access to Authentication controller. | `AuthenticationController` |
| `getQuotingController()` | Provides access to Quoting controller. | `QuotingController` |
| `getPolicyController()` | Provides access to Policy controller. | `PolicyController` |
| `getInsuredRiskController()` | Provides access to InsuredRisk controller. | `InsuredRiskController` |
| `getSimpleCalculatorController()` | Provides access to SimpleCalculator controller. | `SimpleCalculatorController` |
| `getOAuthAuthorizationController()` | Provides access to OAuthAuthorization controller. | `OAuthAuthorizationController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

