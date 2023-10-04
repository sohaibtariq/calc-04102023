# Insured-Risk

Insured Risk Management

```java
InsuredRiskController insuredRiskController = client.getInsuredRiskController();
```

## Class Name

`InsuredRiskController`


# Post Insured Risk

Creates a new insured risk to then utilize when creating a policy.

```java
CompletableFuture<InsuredRisksResponse> postInsuredRiskAsync(
    final UUID boostUser,
    final InsuredRisksRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `boostUser` | `UUID` | Header, Required | UUID that identifies the user. |
| `body` | [`InsuredRisksRequest`](../../doc/models/insured-risks-request.md) | Body, Required | - |

## Response Type

[`InsuredRisksResponse`](../../doc/models/insured-risks-response.md)

## Example Usage

```java
UUID boostUser = UUID.fromString("c336620b-4444-4a42-a2f1-643084046a01");
InsuredRisksRequest body = new InsuredRisksRequest.Builder(
    new Data.Builder(
        "insured_risk",
        new Attributes.Builder(
            ApiHelper.deserialize("{\"foo\":\"bar\",\"baz\":true}")
        )
        .build(),
        new Relationships.Builder(
            new Product.Builder(
                new Data2.Builder(
                    "product",
                    UUID.fromString("7c09a876-b53f-4939-b98d-a3630c936593")
                )
                .build()
            )
            .build()
        )
        .build()
    )
    .build()
)
.build();

insuredRiskController.postInsuredRiskAsync(boostUser, body).thenAccept(result -> {
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
| 400 | Request is invalid. | [`InsuredRisks400Error1Exception`](../../doc/models/insured-risks-400-error-1-exception.md) |
| 401 | Unauthorized. The bearer authentication failed. | [`InsuredRisks401Error1Exception`](../../doc/models/insured-risks-401-error-1-exception.md) |
| 403 | Forbidden. The operation is not allowed. | [`InsuredRisks403Error1Exception`](../../doc/models/insured-risks-403-error-1-exception.md) |
| 415 | Unsupported Media Type. Only JSONAPI is supported. | [`InsuredRisks415Error1Exception`](../../doc/models/insured-risks-415-error-1-exception.md) |
| 500 | Internal Server Error. | [`InsuredRisks500Error1Exception`](../../doc/models/insured-risks-500-error-1-exception.md) |

