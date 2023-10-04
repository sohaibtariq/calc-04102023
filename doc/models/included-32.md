
# Included 32

## Structure

`Included32`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | The type of resource being represented.<br>**Default**: `"insured_risk"` | String getType() | setType(String type) |
| `Lid` | `String` | Required | The local ID that ties this resource to a related object in `data.relationships`. | String getLid() | setLid(String lid) |
| `Attributes` | [`Attributes12`](../../doc/models/attributes-12.md) | Required | The insured risk. | Attributes12 getAttributes() | setAttributes(Attributes12 attributes) |

## Example (as JSON)

```json
{
  "type": "insured_risk",
  "lid": "2",
  "attributes": {
    "factors": {
      "key": "value"
    }
  }
}
```

