# Quoting

Quote Management

```java
QuotingController quotingController = client.getQuotingController();
```

## Class Name

`QuotingController`


# Post Quote

Issues a new quote.

```java
CompletableFuture<QuotesResponse> postQuoteAsync(
    final UUID boostUser,
    final QuotesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `boostUser` | `UUID` | Header, Required | Boost provided agent UUID that identifies the user. |
| `body` | [`QuotesRequest`](../../doc/models/quotes-request.md) | Body, Required | - |

## Response Type

[`QuotesResponse`](../../doc/models/quotes-response.md)

## Example Usage

```java
UUID boostUser = UUID.fromString("0aa54c55-7890-abcd-1234-789012345678");
QuotesRequest body = new QuotesRequest.Builder(
    new Data39.Builder(
        "quote",
        new Attributes9.Builder(
            PolicyState2Enum.AZ,
            DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"),
            DateTimeHelper.fromRfc8601DateTime("08/01/2018 00:00:00")
        )
        .limit("1000")
        .deductible("1000")
        .externalReference("000000001")
        .bindableOn(DateTimeHelper.fromRfc8601DateTime("08/01/2018 00:00:00"))
        .termPremium("123.45")
        .validUntil(DateTimeHelper.fromRfc8601DateTime("08/01/2018 00:00:00"))
        .convertableOn(DateTimeHelper.fromRfc8601DateTime("08/01/2018 00:00:00"))
        .convertedOn(DateTimeHelper.fromRfc8601DateTime("08/01/2018 00:00:00"))
        .status(Status2Enum.DRAFT)
        .minPremium("12.34")
        .stateTax("12.34")
        .stateFees("12.34")
        .serviceFees("12.34")
        .billingFees("12.34")
        .build(),
        new Relationships9.Builder(
            new Customer2.Builder(
                new Data41.Builder(
                    "customer",
                    "2"
                )
                .build()
            )
            .build(),
            new Product6.Builder(
                new Data43.Builder(
                    "product",
                    UUID.fromString("d64d47eb-c7a6-4128-985b-0ecc79284608")
                )
                .build()
            )
            .build()
        )
        .build()
    )
    .build(),
    Arrays.asList(
        ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"),
        ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}")
    )
)
.build();

quotingController.postQuoteAsync(boostUser, body).thenAccept(result -> {
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
| 400 | Request is invalid. | [`Quotes400Error1Exception`](../../doc/models/quotes-400-error-1-exception.md) |
| 401 | Unauthorized. The bearer authentication failed. | [`Quotes401Error1Exception`](../../doc/models/quotes-401-error-1-exception.md) |
| 500 | Internal Server Error. | [`Quotes500Error1Exception`](../../doc/models/quotes-500-error-1-exception.md) |

