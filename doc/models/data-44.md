
# Data 44

Provided data for this product coverage relationship.

## Structure

`Data44`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | The type of resource being represented.<br>**Default**: `"product_coverage"` | String getType() | setType(String type) |
| `Id` | `UUID` | Required | Unique Boost-generated UUID that identifies this resource. | UUID getId() | setId(UUID id) |

## Example (as JSON)

```json
{
  "type": "product_coverage",
  "id": "d64d47eb-c7a6-4128-985b-0ecc79284608"
}
```

