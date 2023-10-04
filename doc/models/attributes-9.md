
# Attributes 9

Attributes for this object.

## Structure

`Attributes9`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Limit` | `String` | Optional | A value from the set denoting the user-selected limit of coverage. This is dependent<br>on the product's configuration.<br>**Constraints**: *Pattern*: `^[0-9]+(\.[0-9]{1,2})?$` | String getLimit() | setLimit(String limit) |
| `Deductible` | `String` | Optional | A value from the set denoting the user-selected deductible of coverage. This is dependent<br>on the product's configuration.<br>**Constraints**: *Pattern*: `^[0-9]+(\.[0-9]{1,2})?$` | String getDeductible() | setDeductible(String deductible) |
| `PolicyState` | [`PolicyState2Enum`](../../doc/models/policy-state-2-enum.md) | Required | The two letter state code (including Washington DC). | PolicyState2Enum getPolicyState() | setPolicyState(PolicyState2Enum policyState) |
| `EffectiveDate` | `LocalDateTime` | Required | Effective date for when the resulting policy would go into effective should it be generated. | LocalDateTime getEffectiveDate() | setEffectiveDate(LocalDateTime effectiveDate) |
| `TermEndDate` | `LocalDateTime` | Required | The desired end date for the policy that results from this quote. The span from effective_date to this term_end_date must be allowable by the product's terms. | LocalDateTime getTermEndDate() | setTermEndDate(LocalDateTime termEndDate) |
| `ExternalReference` | `String` | Optional | Any value you wish to associate with this policy such as an ID from your system. | String getExternalReference() | setExternalReference(String externalReference) |
| `Metadata` | `Object` | Optional | Additional data about the policy. The required metadata fields are specific to the product. | Object getMetadata() | setMetadata(Object metadata) |
| `BindableOn` | `LocalDateTime` | Optional | The date this quote was rated and set to bindable. | LocalDateTime getBindableOn() | setBindableOn(LocalDateTime bindableOn) |
| `TermPremium` | `String` | Optional | Boost generated term premium for this quote.<br>**Constraints**: *Pattern*: `^[0-9]+(\.[0-9]{1,2})?$` | String getTermPremium() | setTermPremium(String termPremium) |
| `ValidUntil` | `LocalDateTime` | Optional | The date this quote is valid until after which point a new quote will need to be generated. | LocalDateTime getValidUntil() | setValidUntil(LocalDateTime validUntil) |
| `ConvertableOn` | `LocalDateTime` | Optional | The date this quote satisfied all its dependencies to become a policy. | LocalDateTime getConvertableOn() | setConvertableOn(LocalDateTime convertableOn) |
| `ConvertedOn` | `LocalDateTime` | Optional | The date this quote was converted into a policy. | LocalDateTime getConvertedOn() | setConvertedOn(LocalDateTime convertedOn) |
| `Status` | [`Status2Enum`](../../doc/models/status-2-enum.md) | Optional | The status of the quote. | Status2Enum getStatus() | setStatus(Status2Enum status) |
| `InstallmentPlans` | `Map<String, Object>` | Optional | Payment installment plans that are available for this quote | Map<String, Object> getInstallmentPlans() | setInstallmentPlans(Map<String, Object> installmentPlans) |
| `MinPremium` | `String` | Optional | Boost generated minimum premium for this product.<br>**Constraints**: *Pattern*: `^[0-9]+(\.[0-9]{1,2})?$` | String getMinPremium() | setMinPremium(String minPremium) |
| `StateTax` | `String` | Optional | Any state taxes that apply to this quote.<br>**Constraints**: *Pattern*: `^[0-9]+(\.[0-9]{1,2})?$` | String getStateTax() | setStateTax(String stateTax) |
| `StateFees` | `String` | Optional | Any state fees that apply to this quote.<br>**Constraints**: *Pattern*: `^[0-9]+(\.[0-9]{1,2})?$` | String getStateFees() | setStateFees(String stateFees) |
| `ServiceFees` | `String` | Optional | Any service fees that apply to this quote.<br>**Constraints**: *Pattern*: `^[0-9]+(\.[0-9]{1,2})?$` | String getServiceFees() | setServiceFees(String serviceFees) |
| `BillingFees` | `String` | Optional | Any billing fees that apply to this quote.<br>**Constraints**: *Pattern*: `^[0-9]+(\.[0-9]{1,2})?$` | String getBillingFees() | setBillingFees(String billingFees) |

## Example (as JSON)

```json
{
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
}
```

