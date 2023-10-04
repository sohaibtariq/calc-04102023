
# Data 6

Data for creating a policy from a quote requiring a stripe token.

## Structure

`Data6`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | The type of resource being represented.<br>**Default**: `"policy"` | String getType() | setType(String type) |
| `Attributes` | [`Attributes2`](../../doc/models/attributes-2.md) | Required | Attributes for this policy. | Attributes2 getAttributes() | setAttributes(Attributes2 attributes) |
| `Relationships` | [`Relationships2`](../../doc/models/relationships-2.md) | Required | Related items. | Relationships2 getRelationships() | setRelationships(Relationships2 relationships) |

## Example (as JSON)

```json
{
  "type": "policy",
  "attributes": {
    "quote_number": "BLU-XX-T63XWYHFE",
    "installment_plan": "ANNUAL",
    "stripe_token": "tok_mastercard",
    "external_id": "1234567890"
  },
  "relationships": {
    "additional_interests": {
      "data": [
        {
          "type": "type0",
          "id": "00001c2a-0000-0000-0000-000000000000"
        },
        {
          "type": "type0",
          "id": "00001c2a-0000-0000-0000-000000000000"
        },
        {
          "type": "type0",
          "id": "00001c2a-0000-0000-0000-000000000000"
        }
      ],
      "meta": {
        "count": 14
      }
    },
    "parent": {
      "data": {
        "type": "type0",
        "id": "00001c2a-0000-0000-0000-000000000000"
      }
    }
  }
}
```

