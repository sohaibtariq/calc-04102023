
# Attributes 4

Attributes of this coverage.

## Structure

`Attributes4`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreatedDate` | `LocalDateTime` | Required | Date time when this resource was created in our system. | LocalDateTime getCreatedDate() | setCreatedDate(LocalDateTime createdDate) |
| `ModifiedDate` | `LocalDateTime` | Required | Date time when this resource was last modified in our system. | LocalDateTime getModifiedDate() | setModifiedDate(LocalDateTime modifiedDate) |
| `Deductible` | `String` | Required | A value from the set denoting the user-selected deductible of coverage. This is dependent<br>on the product's configuration.<br>**Constraints**: *Pattern*: `^[0-9]+(\.[0-9]{1,2})?$` | String getDeductible() | setDeductible(String deductible) |
| `Limit` | `String` | Required | A value from the set denoting the user-selected limit of coverage. This is dependent<br>on the product's configuration.<br>**Constraints**: *Pattern*: `^[0-9]+(\.[0-9]{1,2})?$` | String getLimit() | setLimit(String limit) |
| `Premium` | `String` | Required | Term premium for this coverage<br>**Constraints**: *Pattern*: `^[0-9]+(\.[0-9]{1,2})?$` | String getPremium() | setPremium(String premium) |
| `AdditionalFees` | `String` | Required | Additional fees relating to this coverage.<br>**Constraints**: *Pattern*: `^[0-9]+(\.[0-9]{1,2})?$` | String getAdditionalFees() | setAdditionalFees(String additionalFees) |
| `RevisionDate` | `LocalDateTime` | Required | Date for when this coverage goes into effect on the policy. | LocalDateTime getRevisionDate() | setRevisionDate(LocalDateTime revisionDate) |

## Example (as JSON)

```json
{
  "created_date": "08/01/2018 10:41:32",
  "modified_date": "08/01/2018 10:41:32",
  "deductible": "1000",
  "limit": "1000000",
  "premium": "150.00",
  "additional_fees": "1.23",
  "revision_date": "01/30/2019 12:32:15"
}
```

