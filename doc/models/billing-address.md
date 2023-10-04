
# Billing Address

The billing address of this customer.

## Structure

`BillingAddress`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Address1` | `String` | Required | The first line of the address. | String getAddress1() | setAddress1(String address1) |
| `Address2` | `String` | Optional | The second line of the address. | String getAddress2() | setAddress2(String address2) |
| `City` | `String` | Required | The city of the address. | String getCity() | setCity(String city) |
| `State` | [`StateEnum`](../../doc/models/state-enum.md) | Required | Two letter state code of the address. | StateEnum getState() | setState(StateEnum state) |
| `Zip` | `String` | Required | 5 or 10 character postal code of the address.<br>**Constraints**: *Pattern*: `^[0-9]{5}(-[0-9]{4})?$` | String getZip() | setZip(String zip) |

## Example (as JSON)

```json
{
  "address1": "123 Main St",
  "address2": "Suite 123",
  "city": "New York",
  "state": "NY",
  "zip": "10016"
}
```

