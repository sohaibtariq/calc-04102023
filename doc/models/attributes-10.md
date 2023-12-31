
# Attributes 10

Attributes for this object.

## Structure

`Attributes10`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Deductible` | `String` | Optional | A value from the set denoting the user-selected deductible of coverage. This is dependent<br>on the product's configuration.<br>**Constraints**: *Pattern*: `^[0-9]+(\.[0-9]{1,2})?$` | String getDeductible() | setDeductible(String deductible) |
| `Limit` | `String` | Optional | A value from the set denoting the user-selected limit of coverage. This is dependent<br>on the product's configuration.<br>**Constraints**: *Pattern*: `^[0-9]+(\.[0-9]{1,2})?$` | String getLimit() | setLimit(String limit) |
| `Premium` | `String` | Optional | Calculated premium for this coverage which is included in the policy's term premium.<br>**Constraints**: *Pattern*: `^[0-9]+(\.[0-9]{1,2})?$` | String getPremium() | setPremium(String premium) |
| `Metadata` | `Object` | Optional | Additional data about the policy. The required metadata fields are specific to the product. | Object getMetadata() | setMetadata(Object metadata) |

## Example (as JSON)

```json
{
  "deductible": "1000",
  "limit": "1000",
  "premium": "100.00",
  "metadata": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

