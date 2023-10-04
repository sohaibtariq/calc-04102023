
# Data 46

## Structure

`Data46`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | The type of resource being represented.<br>**Default**: `"coverage"` | String getType() | setType(String type) |
| `Id` | `UUID` | Required | Unique Boost-generated UUID that identifies this resource. | UUID getId() | setId(UUID id) |

## Example (as JSON)

```json
{
  "type": "coverage",
  "id": "d64d47eb-c7a6-4128-985b-0ecc79284608"
}
```

