## API Reference

#### Get all products

```http
  GET /api/v1/Products
```

#### Insert product

```http
  POST /api/v1/Products/insert
```

| Body          | Type     | 
|:--------------|:---------| 
| `productName` | `string` |
| `productYear` | `int`    |
| `price`       | `double` |
| `url`         | `string` |

#### Update product

```http
  PUT /api/v1/Products/{id}
```

| Body          | Type     | 
|:--------------|:---------| 
| `id`          | `long`   |
| `productName` | `string` |
| `productYear` | `int`    |
| `price`       | `double` |
| `url`         | `string` |

#### Delete product

```http
  DELETE /api/v1/Products/{id}
```

#### Upload Image

```http
  POST /api/v1/FileUpload/files/{id}
```

| Body   | Type                        | 
|:-------|:----------------------------| 
| `file` | `jpg`, `jpeg`, `png`, `bmp` |

#### Read Image

```http
  GET /api/v1/FileUpload/files/{id}
```
