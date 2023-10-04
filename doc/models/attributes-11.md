
# Attributes 11

The insured entity.

## Structure

`Attributes11`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ExternalReference` | `String` | Optional | A reference that can be used to identify this customer in your system. | String getExternalReference() | setExternalReference(String externalReference) |
| `EntityType` | [`EntityTypeEnum`](../../doc/models/entity-type-enum.md) | Required | The kind of customer this is. | EntityTypeEnum getEntityType() | setEntityType(EntityTypeEnum entityType) |
| `BusinessName` | `String` | Optional | The legal name of the business. | String getBusinessName() | setBusinessName(String businessName) |
| `FirstName` | `String` | Required | The first name of the contact. | String getFirstName() | setFirstName(String firstName) |
| `LastName` | `String` | Required | The last name of the contact. | String getLastName() | setLastName(String lastName) |
| `Email` | `String` | Required | The email address of the contact. | String getEmail() | setEmail(String email) |
| `Phone` | `String` | Required | The primary phone number of the contact. | String getPhone() | setPhone(String phone) |
| `Website` | `String` | Optional | The website of the contact. | String getWebsite() | setWebsite(String website) |
| `MailingAddress` | [`MailingAddress`](../../doc/models/mailing-address.md) | Required | The mailing address of this customer. | MailingAddress getMailingAddress() | setMailingAddress(MailingAddress mailingAddress) |
| `BillingAddress` | [`BillingAddress`](../../doc/models/billing-address.md) | Optional | The billing address of this customer. | BillingAddress getBillingAddress() | setBillingAddress(BillingAddress billingAddress) |

## Example (as JSON)

```json
{
  "external_reference": "d64d47eb-c7a6-4128-985b-0ecc79284608",
  "entity_type": "business",
  "business_name": "Acme, Inc.",
  "first_name": "John",
  "last_name": "Smith",
  "email": "john.smith@example.com",
  "phone": "9175551212",
  "website": "https://www.insurtech.dev",
  "mailing_address": {
    "address1": "123 Main St",
    "address2": "Suite 123",
    "city": "New York",
    "state": "NY",
    "zip": "10016"
  },
  "billing_address": {
    "address1": "address16",
    "address2": "address20",
    "city": "city2",
    "state": "NM",
    "zip": "zip8"
  }
}
```

