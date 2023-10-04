
# Auth Oauth 2 Token Response

## Structure

`AuthOauth2TokenResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TokenType` | [`TokenTypeEnum`](../../doc/models/token-type-enum.md) | Optional | Type of token. | TokenTypeEnum getTokenType() | setTokenType(TokenTypeEnum tokenType) |
| `AccessToken` | `String` | Optional | The token to be used in future API calls. | String getAccessToken() | setAccessToken(String accessToken) |
| `ExpiresIn` | [`ExpiresInEnum`](../../doc/models/expires-in-enum.md) | Optional | How long this token is valid for. | ExpiresInEnum getExpiresIn() | setExpiresIn(ExpiresInEnum expiresIn) |

## Example (as JSON)

```json
{
  "token_type": "bearer",
  "access_token": "JDKSjkdnasknxkasjd",
  "expires_in": 7200
}
```

