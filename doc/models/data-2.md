
# Data 2

Provided data for this product relationship.

## Structure

`Data2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | The type of resource being represented.<br>**Default**: `"product"` | String getType() | setType(String type) |
| `Id` | `UUID` | Required | UUID that identifies this resource. | UUID getId() | setId(UUID id) |

## Example (as JSON)

```json
{
  "type": "product",
  "id": "7fca5107-79c0-4b1d-88e7-0a3155a42aba"
}
```

