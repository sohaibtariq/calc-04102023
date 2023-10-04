
# Included 42

## Structure

`Included42`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | The type of resource being represented.<br>**Default**: `"insured_risk"` | String getType() | setType(String type) |
| `Id` | `UUID` | Required | Unique Boost-generated UUID that identifies this resource. | UUID getId() | setId(UUID id) |
| `Lid` | `String` | Required | The local ID that ties this resource to a related object in `data.relationships`. | String getLid() | setLid(String lid) |
| `Attributes` | [`Attributes12`](../../doc/models/attributes-12.md) | Required | The insured risk. | Attributes12 getAttributes() | setAttributes(Attributes12 attributes) |
| `Relationships` | [`Relationships14`](../../doc/models/relationships-14.md) | Required | Related items. | Relationships14 getRelationships() | setRelationships(Relationships14 relationships) |

## Example (as JSON)

```json
{
  "type": "insured_risk",
  "id": "d64d47eb-c7a6-4128-985b-0ecc79284608",
  "lid": "2",
  "attributes": {
    "factors": {
      "key": "value"
    }
  },
  "relationships": {
    "product": {
      "data": {
        "type": "product",
        "id": "d64d47eb-c7a6-4128-985b-0ecc79284608"
      }
    },
    "agent": {
      "data": {
        "type": "product",
        "id": "d64d47eb-c7a6-4128-985b-0ecc79284608"
      }
    }
  }
}
```

