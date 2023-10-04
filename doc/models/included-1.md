
# Included 1

## Structure

`Included1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | The type of resource being represented.<br>**Default**: `"insured_risk"` | String getType() | setType(String type) |
| `Id` | `UUID` | Required | UUID that identifies this resource. | UUID getId() | setId(UUID id) |
| `Attributes` | [`Attributes5`](../../doc/models/attributes-5.md) | Required | Attributes of this insured risk. | Attributes5 getAttributes() | setAttributes(Attributes5 attributes) |
| `Relationships` | [`Relationships5`](../../doc/models/relationships-5.md) | Required | Items related to this insured risk. | Relationships5 getRelationships() | setRelationships(Relationships5 relationships) |

## Example (as JSON)

```json
{
  "type": "insured_risk",
  "id": "3c0313fb-d441-4d90-82ea-5b23931349be",
  "attributes": {
    "created_date": "08/01/2018 10:41:32",
    "modified_date": "08/01/2018 10:41:32",
    "factors": {
      "key1": "val1",
      "key2": "val2"
    }
  },
  "relationships": {
    "product": {
      "data": {
        "type": "product",
        "id": "7fca5107-79c0-4b1d-88e7-0a3155a42aba"
      }
    },
    "agent": {
      "data": {
        "type": "agent",
        "id": "6a04ddef-b9fa-48b0-8c46-1a580868491e"
      }
    }
  }
}
```

