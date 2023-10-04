
# Data 12

Provided data for this customer relationship.

## Structure

`Data12`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | The type of resource being represented.<br>**Default**: `"customer"` | String getType() | setType(String type) |
| `Id` | `UUID` | Required | UUID that identifies this resource. | UUID getId() | setId(UUID id) |

## Example (as JSON)

```json
{
  "type": "customer",
  "id": "fd5a4e30-a897-4383-a0a4-bd62970f6d23"
}
```

