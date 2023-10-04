
# Data 8

Provided data for this parent policy relationship.

## Structure

`Data8`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | The type of resource being represented.<br>**Default**: `"policy"` | String getType() | setType(String type) |
| `Id` | `UUID` | Required | UUID that identifies this resource. | UUID getId() | setId(UUID id) |

## Example (as JSON)

```json
{
  "type": "policy",
  "id": "9c5fa6b9-4107-4709-8b44-e188b9a45d33"
}
```

