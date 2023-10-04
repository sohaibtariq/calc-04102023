
# Data 1

Provided data for this agent relationship.

## Structure

`Data1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | The type of resource being represented.<br>**Default**: `"agent"` | String getType() | setType(String type) |
| `Id` | `UUID` | Required | UUID that identifies this resource. | UUID getId() | setId(UUID id) |

## Example (as JSON)

```json
{
  "type": "agent",
  "id": "6a04ddef-b9fa-48b0-8c46-1a580868491e"
}
```

