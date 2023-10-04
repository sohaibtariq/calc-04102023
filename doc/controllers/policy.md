# Policy

Policy Management

```java
PolicyController policyController = client.getPolicyController();
```

## Class Name

`PolicyController`

## Methods

* [Post Policy](../../doc/controllers/policy.md#post-policy)
* [List Policies](../../doc/controllers/policy.md#list-policies)


# Post Policy

Issues a new policy with the given the input data. Policy goes in force on the specified effective_date.

```java
CompletableFuture<PoliciesResponse> postPolicyAsync(
    final UUID boostUser,
    final PoliciesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `boostUser` | `UUID` | Header, Required | UUID that identifies the user. |
| `body` | [`PoliciesRequest`](../../doc/models/policies-request.md) | Body, Required | - |

## Response Type

[`PoliciesResponse`](../../doc/models/policies-response.md)

## Example Usage

```java
UUID boostUser = UUID.fromString("53f85c54-f471-444d-80a7-9feb1951ff46");
PoliciesRequest body = new PoliciesRequest.Builder(
    new Data6.Builder(
        "policy",
        new Attributes2.Builder(
            "BLU-XX-T63XWYHFE",
            "ANNUAL",
            "tok_mastercard"
        )
        .externalId("1234567890")
        .build(),
        new Relationships2.Builder()
            .build()
    )
    .build()
)
.build();

policyController.postPolicyAsync(boostUser, body).thenAccept(result -> {
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
| 400 | Request is invalid. | [`Policies400Error1Exception`](../../doc/models/policies-400-error-1-exception.md) |
| 401 | Unauthorized. The bearer authentication failed. | [`Policies401Error1Exception`](../../doc/models/policies-401-error-1-exception.md) |
| 403 | Forbidden. The operation is not allowed. | [`Policies403Error1Exception`](../../doc/models/policies-403-error-1-exception.md) |
| 500 | Internal Server Error. | [`Policies500Error1Exception`](../../doc/models/policies-500-error-1-exception.md) |


# List Policies

List previously created policies

```java
CompletableFuture<PoliciesResponse1> listPoliciesAsync(
    final UUID boostUser,
    final ContentType1Enum accept)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `boostUser` | `UUID` | Header, Required | UUID that identifies the user. |
| `accept` | [`ContentType1Enum`](../../doc/models/content-type-1-enum.md) | Header, Optional | Header to indicate that desired response type is JSON:API. |

## Response Type

[`PoliciesResponse1`](../../doc/models/policies-response-1.md)

## Example Usage

```java
UUID boostUser = UUID.fromString("53f85c54-f471-444d-80a7-9feb1951ff46");

policyController.listPoliciesAsync(boostUser, null).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

