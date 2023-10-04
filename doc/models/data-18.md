
# Data 18

Provided data for this installment plan relationship.

## Structure

`Data18`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | The type of resource being represented.<br>**Default**: `"installment_plan"` | String getType() | setType(String type) |
| `Id` | `UUID` | Required | UUID that identifies this resource. | UUID getId() | setId(UUID id) |

## Example (as JSON)

```json
{
  "type": "installment_plan",
  "id": "2e3dc75c-3f7d-4721-80df-b5fac6617825"
}
```

