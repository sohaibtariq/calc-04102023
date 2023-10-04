
# Included 4

## Structure

`Included4`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | The type of resource being represented.<br>**Default**: `"coverage"` | String getType() | setType(String type) |
| `Id` | `UUID` | Required | Unique Boost-generated UUID that identifies this resource. | UUID getId() | setId(UUID id) |
| `Lid` | `String` | Required | The local ID that ties this resource to a related object in `data.relationships`. | String getLid() | setLid(String lid) |
| `Attributes` | [`Attributes10`](../../doc/models/attributes-10.md) | Required | Attributes for this object. | Attributes10 getAttributes() | setAttributes(Attributes10 attributes) |
| `Relationships` | [`Relationships10`](../../doc/models/relationships-10.md) | Required | Related items. | Relationships10 getRelationships() | setRelationships(Relationships10 relationships) |

## Example (as JSON)

```json
{
  "type": "coverage",
  "id": "d64d47eb-c7a6-4128-985b-0ecc79284608",
  "lid": "2",
  "attributes": {
    "deductible": "1000",
    "limit": "1000",
    "premium": "100.00",
    "metadata": {
      "key1": "val1",
      "key2": "val2"
    }
  },
  "relationships": {
    "product_coverage": {
      "data": {
        "type": "product_coverage",
        "id": "d64d47eb-c7a6-4128-985b-0ecc79284608"
      }
    }
  }
}
```

