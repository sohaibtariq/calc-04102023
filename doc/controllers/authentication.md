# Authentication

```java
AuthenticationController authenticationController = client.getAuthenticationController();
```

## Class Name

`AuthenticationController`


# Get O Auth Token

Generates an access token which must be used on all subsequent API calls.

:information_source: **Note** This endpoint does not require authentication.

```java
CompletableFuture<AuthOauth2TokenResponse> getOAuthTokenAsync(
    final String clientId,
    final String clientSecret)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `clientId` | `String` | Form, Required | Your Client ID |
| `clientSecret` | `String` | Form, Required | Your Client Secret |

## Response Type

[`AuthOauth2TokenResponse`](../../doc/models/auth-oauth-2-token-response.md)

## Example Usage

```java
String clientId = "client_id8";
String clientSecret = "client_secret8";

authenticationController.getOAuthTokenAsync(clientId, clientSecret).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Request is invalid | [`AuthOauth2Token400Error1Exception`](../../doc/models/auth-oauth-2-token-400-error-1-exception.md) |
| 500 | Internal Server Error | `ApiException` |

