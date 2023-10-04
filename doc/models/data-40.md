
# Data 40

## Structure

`Data40`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | The type of resource being represented.<br>**Default**: `"coverage"` | String getType() | setType(String type) |
| `Lid` | `String` | Required | The local ID that ties this resource to a related object in `data.included`. | String getLid() | setLid(String lid) |

## Example (as JSON)

```json
{
  "type": "coverage",
  "lid": "2"
}
```

