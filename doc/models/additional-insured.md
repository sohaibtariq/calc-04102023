
# Additional Insured

List of additional insured for this policy.

## Structure

`AdditionalInsured`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`List<Data7>`](../../doc/models/data-7.md) | Required | List of additional insured. | List<Data7> getData() | setData(List<Data7> data) |
| `Meta` | [`Meta`](../../doc/models/meta.md) | Optional | Additional meta information about this data. | Meta getMeta() | setMeta(Meta meta) |

## Example (as JSON)

```json
{
  "data": [
    {
      "type": "customer",
      "id": "55efaaf6-2bb2-4cdd-b5ec-5475af712c52"
    }
  ],
  "meta": {
    "count": 14
  }
}
```

