
# Relationships 5

Items related to this insured risk.

## Structure

`Relationships5`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Product` | [`Product3`](../../doc/models/product-3.md) | Required | UUID that identifies this product. | Product3 getProduct() | setProduct(Product3 product) |
| `Agent` | [`Agent3`](../../doc/models/agent-3.md) | Required | UUID that identifies this agent. | Agent3 getAgent() | setAgent(Agent3 agent) |

## Example (as JSON)

```json
{
  "product": {
    "data": {
      "type": "product",
      "id": "7fca5107-79c0-4b1d-88e7-0a3155a42aba"
    }
  },
  "agent": {
    "data": {
      "type": "agent",
      "id": "6a04ddef-b9fa-48b0-8c46-1a580868491e"
    }
  }
}
```

