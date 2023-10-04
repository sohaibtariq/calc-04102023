
# Product

Boost supplied value representing the specific product type. The product's configuration
Determines allowable values, such as limits and deductibles.

## Structure

`Product`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`Data2`](../../doc/models/data-2.md) | Required | Provided data for this product relationship. | Data2 getData() | setData(Data2 data) |

## Example (as JSON)

```json
{
  "data": {
    "type": "product",
    "id": "7fca5107-79c0-4b1d-88e7-0a3155a42aba"
  }
}
```

