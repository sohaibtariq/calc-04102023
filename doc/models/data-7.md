
# Data 7

## Structure

`Data7`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | The type of resource being represented.<br>**Default**: `"customer"` | String getType() | setType(String type) |
| `Id` | `UUID` | Required | UUID that identifies this resource. | UUID getId() | setId(UUID id) |

## Example (as JSON)

```json
{
  "type": "customer",
  "id": "55efaaf6-2bb2-4cdd-b5ec-5475af712c52"
}
```

