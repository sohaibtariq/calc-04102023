
# Attributes 3

Attributes that describe a policy resource with optional writeable money fields.

## Structure

`Attributes3`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CreatedDate` | `LocalDateTime` | Optional | Date time when this resource was created in our system. | LocalDateTime getCreatedDate() | setCreatedDate(LocalDateTime createdDate) |
| `ModifiedDate` | `LocalDateTime` | Optional | Date time when this resource was last modified in our system. | LocalDateTime getModifiedDate() | setModifiedDate(LocalDateTime modifiedDate) |
| `ActualEndDate` | `LocalDateTime` | Optional | The end date for this policy if it has been ended. | LocalDateTime getActualEndDate() | setActualEndDate(LocalDateTime actualEndDate) |
| `Status` | [`StatusEnum`](../../doc/models/status-enum.md) | Optional | The status of the policy. | StatusEnum getStatus() | setStatus(StatusEnum status) |
| `EarnedPremium` | `String` | Optional | Our calculated earned premium thus far for this policy.<br>**Constraints**: *Pattern*: `^[0-9]+(\.[0-9]{5})?$` | String getEarnedPremium() | setEarnedPremium(String earnedPremium) |
| `EarnedTax` | `String` | Optional | Our calculated earned tax thus far for this policy.<br>**Constraints**: *Pattern*: `^[0-9]+(\.[0-9]{5})?$` | String getEarnedTax() | setEarnedTax(String earnedTax) |
| `EarnedFees` | `String` | Optional | Our calculated earned fees thus far for this policy.<br>**Constraints**: *Pattern*: `^[0-9]+(\.[0-9]{5})?$` | String getEarnedFees() | setEarnedFees(String earnedFees) |
| `CancelReason` | `String` | Optional | A value from the set denoting the reason for policy cancellation. | String getCancelReason() | setCancelReason(String cancelReason) |
| `CancelDescription` | `String` | Optional | User provided description for why policy was cancelled. | String getCancelDescription() | setCancelDescription(String cancelDescription) |
| `PolicyNumber` | `String` | Optional | A unique alphanumeric string used as a human-readable value for the Policy.<br>**Constraints**: *Pattern*: `^BLU-[0-9a-zA-Z]{2}-[0-9a-zA-Z]{9}$` | String getPolicyNumber() | setPolicyNumber(String policyNumber) |
| `EffectiveDate` | `LocalDateTime` | Optional | The date and time this policy went into effect. | LocalDateTime getEffectiveDate() | setEffectiveDate(LocalDateTime effectiveDate) |
| `ExternalReference` | `String` | Optional | Any value you wish to associate with this policy such as an ID from your system. | String getExternalReference() | setExternalReference(String externalReference) |
| `Limit` | `String` | Optional | A value from the set denoting the user-selected limit of coverage. This is dependent on your product's configuration.<br>**Constraints**: *Pattern*: `^[0-9]+(\.[0-9]{1,2})?$` | String getLimit() | setLimit(String limit) |
| `Deductible` | `String` | Optional | A value from the set denoting the user-selected deductible of coverage. This is dependent on your product's configuration.<br>**Constraints**: *Pattern*: `^[0-9]+(\.[0-9]{1,2})?$` | String getDeductible() | setDeductible(String deductible) |
| `PolicyState` | [`PolicyStateEnum`](../../doc/models/policy-state-enum.md) | Optional | The two letter state code (including Washington DC) for the state in which the issured entity resides. | PolicyStateEnum getPolicyState() | setPolicyState(PolicyStateEnum policyState) |
| `Metadata` | `Object` | Optional | Additional data about the policy. The required metadata fields are specific to your product. | Object getMetadata() | setMetadata(Object metadata) |
| `TermEndDate` | `LocalDateTime` | Optional | The policy's natural term end date and time. | LocalDateTime getTermEndDate() | setTermEndDate(LocalDateTime termEndDate) |
| `InstallmentPlan` | `String` | Optional | The installment plan schedule that determines invoicing and/or automatic payment dates. | String getInstallmentPlan() | setInstallmentPlan(String installmentPlan) |
| `WrittenPremium` | `String` | Optional | The written premium for this policy.<br>**Constraints**: *Pattern*: `^[0-9]+(\.[0-9]{1,2})?$` | String getWrittenPremium() | setWrittenPremium(String writtenPremium) |
| `IssueDate` | `LocalDateTime` | Optional | The date and time that the policy was issued. | LocalDateTime getIssueDate() | setIssueDate(LocalDateTime issueDate) |
| `NonRenewalNoticeDate` | `LocalDateTime` | Optional | The most recently set date and time that a non-renewal notice was set to be sent. | LocalDateTime getNonRenewalNoticeDate() | setNonRenewalNoticeDate(LocalDateTime nonRenewalNoticeDate) |
| `CancellationNoticeDate` | `LocalDateTime` | Optional | The most recently set date and time that a cancellation notice was set to be sent. | LocalDateTime getCancellationNoticeDate() | setCancellationNoticeDate(LocalDateTime cancellationNoticeDate) |
| `RequestedCancellationDate` | `LocalDateTime` | Optional | The most recently set date and time that an allowed party requested a policy to be cancelled. | LocalDateTime getRequestedCancellationDate() | setRequestedCancellationDate(LocalDateTime requestedCancellationDate) |
| `StateTax` | `String` | Optional | The term state tax<br>**Constraints**: *Pattern*: `^[0-9]+(\.[0-9]{1,2})?$` | String getStateTax() | setStateTax(String stateTax) |
| `StateFees` | `String` | Optional | The aggregate term state fees.<br>**Constraints**: *Pattern*: `^[0-9]+(\.[0-9]{1,2})?$` | String getStateFees() | setStateFees(String stateFees) |
| `ServiceFees` | `String` | Optional | The term aggregate service fees<br>**Constraints**: *Pattern*: `^[0-9]+(\.[0-9]{1,2})?$` | String getServiceFees() | setServiceFees(String serviceFees) |
| `TermPremium` | `String` | Optional | This term premium . This value includes taxes only for admitted products<br>**Constraints**: *Pattern*: `^[0-9]+(\.[0-9]{1,2})?$` | String getTermPremium() | setTermPremium(String termPremium) |
| `BillingFees` | `String` | Optional | The term aggregate billing fees<br>**Constraints**: *Pattern*: `^[0-9]+(\.[0-9]{1,2})?$` | String getBillingFees() | setBillingFees(String billingFees) |

## Example (as JSON)

```json
{
  "created_date": "08/01/2018 10:41:32",
  "modified_date": "08/01/2018 10:41:32",
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
}
```

