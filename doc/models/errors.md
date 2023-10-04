
# Errors

## Structure

`Errors`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Error` | `String` | Optional | Type of error. | String getError() | setError(String error) |
| `ErrorDescription` | `String` | Optional | Detailed information about the error. | String getErrorDescription() | setErrorDescription(String errorDescription) |

## Example (as JSON)

```json
{
  "error": "invalid_client",
  "error_description": "Invalid client authentication"
}
```

