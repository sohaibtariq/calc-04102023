
# Data 41

Provided data for this customer relationship with local ID.

## Structure

`Data41`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | The type of resource being represented.<br>**Default**: `"customer"` | String getType() | setType(String type) |
| `Lid` | `String` | Required | The local ID that ties this resource to a related object in `data.included`. | String getLid() | setLid(String lid) |

## Example (as JSON)

```json
{
  "type": "customer",
  "lid": "2"
}
```

