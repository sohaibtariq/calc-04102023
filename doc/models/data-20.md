
# Data 20

Provided data for this endorsement relationship.

## Structure

`Data20`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | Name of this related object. Must be `endorsement`.<br>**Default**: `"endorsement"` | String getType() | setType(String type) |
| `Id` | `UUID` | Required | UUID that identifies this resource. | UUID getId() | setId(UUID id) |

## Example (as JSON)

```json
{
  "type": "endorsement",
  "id": "b1deb55f-8108-400c-9443-e8bc61d1928d"
}
```

