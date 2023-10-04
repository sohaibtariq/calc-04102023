
# Data 19

Provided data for this policy relationship.

## Structure

`Data19`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | The type of resource being represented.<br>**Default**: `"policy"` | String getType() | setType(String type) |
| `Id` | `UUID` | Required | UUID that identifies this resource. | UUID getId() | setId(UUID id) |

## Example (as JSON)

```json
{
  "type": "policy",
  "id": "f445dde9-32d2-46cf-8cac-9fe4409fee0b"
}
```

