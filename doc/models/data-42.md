
# Data 42

Provided data for this insured risk relationship with local ID.

## Structure

`Data42`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | The type of resource being represented.<br>**Default**: `"insured_risk"` | String getType() | setType(String type) |
| `Lid` | `String` | Required | The local ID that ties this resource to a related object in `data.included`. | String getLid() | setLid(String lid) |

## Example (as JSON)

```json
{
  "type": "insured_risk",
  "lid": "2"
}
```

