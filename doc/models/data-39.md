
# Data 39

All values for the request are in this top-level object.

## Structure

`Data39`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | The type of resource being represented.<br>**Default**: `"quote"` | String getType() | setType(String type) |
| `Attributes` | [`Attributes9`](../../doc/models/attributes-9.md) | Required | Attributes for this object. | Attributes9 getAttributes() | setAttributes(Attributes9 attributes) |
| `Relationships` | [`Relationships9`](../../doc/models/relationships-9.md) | Required | Related items. | Relationships9 getRelationships() | setRelationships(Relationships9 relationships) |

## Example (as JSON)

```json
{
  "type": "quote",
  "attributes": {
    "limit": "1000",
    "deductible": "1000",
    "policy_state": "AZ",
    "effective_date": "2016-03-13T12:52:32.123Z",
    "term_end_date": "08/01/2018 00:00:00",
    "external_reference": "000000001",
    "bindable_on": "08/01/2018 00:00:00",
    "term_premium": "123.45",
    "valid_until": "08/01/2018 00:00:00",
    "convertable_on": "08/01/2018 00:00:00",
    "converted_on": "08/01/2018 00:00:00",
    "status": "draft",
    "min_premium": "12.34",
    "state_tax": "12.34",
    "state_fees": "12.34",
    "service_fees": "12.34",
    "billing_fees": "12.34",
    "metadata": {
      "key1": "val1",
      "key2": "val2"
    }
  },
  "relationships": {
    "customer": {
      "data": {
        "type": "customer",
        "lid": "2"
      }
    },
    "product": {
      "data": {
        "type": "product",
        "id": "d64d47eb-c7a6-4128-985b-0ecc79284608"
      }
    },
    "coverages": {
      "data": [
        {
          "type": "type0",
          "lid": "lid2"
        },
        {
          "type": "type0",
          "lid": "lid2"
        }
      ]
    },
    "insured_risk": {
      "data": {
        "type": "type0",
        "lid": "lid2"
      }
    }
  }
}
```

