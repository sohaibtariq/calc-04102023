
# Data 24

All values that describe this policy resource are listed in here.

## Structure

`Data24`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | The type of resource being represented.<br>**Default**: `"policy"` | String getType() | setType(String type) |
| `Id` | `UUID` | Required | - | UUID getId() | setId(UUID id) |
| `Attributes` | [`Attributes6`](../../doc/models/attributes-6.md) | Required | Attributes that describe a policy resource with optional writeable money fields. | Attributes6 getAttributes() | setAttributes(Attributes6 attributes) |
| `Relationships` | [`Relationships3`](../../doc/models/relationships-3.md) | Required | Items related to this policy. | Relationships3 getRelationships() | setRelationships(Relationships3 relationships) |
| `Included` | `List<Object>` | Required | Array of included objects which provide additional data about an object from the<br>above `data.relationships`. | List<Object> getIncluded() | setIncluded(List<Object> included) |

## Example (as JSON)

```json
{
  "type": "policy",
  "id": "00001dc6-0000-0000-0000-000000000000",
  "attributes": {
    "created_date": "08/01/2018 10:41:32",
    "modified_date": "08/01/2018 10:41:32",
    "document_id": "530c8393-ebb6-4625-a4be-fe9bc5a75d4a",
    "actual_end_date": "06/01/2019 00:00:00",
    "status": "issued",
    "earned_premium": "100.00000",
    "earned_tax": "0.01644",
    "earned_fees": "0.10142",
    "cancel_reason": "fraud",
    "cancel_description": "Client committed fraud when applying for this policy.",
    "policy_number": "BLU-XX-2FM83109D",
    "effective_date": "08/01/2018 00:00:00",
    "external_reference": "000000001",
    "limit": "1000000",
    "deductible": "1000",
    "policy_state": "AZ",
    "term_end_date": "08/01/2019 00:00:00",
    "installment_plan": "ANNUAL",
    "written_premium": "1234.56",
    "issue_date": "08/01/2018 00:00:00",
    "non_renewal_notice_date": "08/01/2018 00:00:00",
    "cancellation_notice_date": "08/01/2018 00:00:00",
    "requested_cancellation_date": "08/01/2018 00:00:00",
    "state_tax": "12.34",
    "state_fees": "12.34",
    "service_fees": "12.34",
    "term_premium": "1234.56",
    "billing_fees": "12.34"
  },
  "relationships": {
    "coverages": {
      "data": [
        {
          "type": "customer",
          "id": "55efaaf6-2bb2-4cdd-b5ec-5475af712c52"
        }
      ],
      "meta": {
        "count": 14
      }
    },
    "insured_risk": {
      "data": {
        "type": "insured_risk",
        "id": "889c16f9-c236-4c29-9721-aa5bbaeb7107"
      }
    },
    "customer": {
      "data": {
        "type": "customer",
        "id": "fd5a4e30-a897-4383-a0a4-bd62970f6d23"
      }
    },
    "product": {
      "data": {
        "type": "product",
        "id": "7fca5107-79c0-4b1d-88e7-0a3155a42aba"
      }
    },
    "parent": {
      "data": {
        "type": "policy",
        "id": "9c5fa6b9-4107-4709-8b44-e188b9a45d33"
      }
    },
    "additional_interests": {
      "data": [
        {
          "type": "customer",
          "id": "55efaaf6-2bb2-4cdd-b5ec-5475af712c52"
        }
      ],
      "meta": {
        "count": 14
      }
    },
    "additional_insured": {
      "data": [
        {
          "type": "customer",
          "id": "55efaaf6-2bb2-4cdd-b5ec-5475af712c52"
        }
      ],
      "meta": {
        "count": 14
      }
    },
    "agent": {
      "data": {
        "type": "agent",
        "id": "6a04ddef-b9fa-48b0-8c46-1a580868491e"
      }
    },
    "installment_plan": {
      "data": {
        "type": "installment_plan",
        "id": "2e3dc75c-3f7d-4721-80df-b5fac6617825"
      }
    }
  },
  "included": [
    {
      "key1": "val1",
      "key2": "val2"
    },
    {
      "key1": "val1",
      "key2": "val2"
    }
  ]
}
```

