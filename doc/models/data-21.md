
# Data 21

Provided data for this product coverage relationship.

## Structure

`Data21`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | The type of resource being represented.<br>**Default**: `"product_coverage"` | String getType() | setType(String type) |
| `Id` | `UUID` | Required | UUID that identifies this resource. | UUID getId() | setId(UUID id) |

## Example (as JSON)

```json
{
  "type": "product_coverage",
  "id": "902522f9-f38c-40c5-9b4c-bb401be5f0d9"
}
```

