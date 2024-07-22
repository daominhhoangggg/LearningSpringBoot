## API Reference

#### Get all products

```
  GET /api/v1/Products
```

#### Insert product

``` 
  POST /api/v1/Products/insert
```

| Body          | Type     | 
|:--------------|:---------| 
| `productName` | `string` |
| `productYear` | `int`    |
| `price`       | `double` |
| `url`         | `string` |

#### Update product

``` 
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

``` 
  DELETE /api/v1/Products/{id}
```

#### Upload Image

``` 
  POST /api/v1/FileUpload/files/{id}
```

| Body   | Type                        | 
|:-------|:----------------------------| 
| `file` | `jpg`, `jpeg`, `png`, `bmp` |

#### Read Image

``` 
  GET /api/v1/FileUpload/files/{id}
```

