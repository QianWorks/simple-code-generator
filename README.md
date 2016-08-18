# simple-code-generator
A light business code generator for faster code.

## Usage

### Configration
modify `config.json` under the path `assembly/{env}/conf/` ,with the following content:

```javascript
{
  "host": "localhost",
  "database": "dbtest1",
  "user": "test",
  "password": "test",
  "connectionLimit": 10,
  "dbPort": 3306,
  "jdbcDriver": "com.mysql.jdbc.jdbc2.optional.MysqlDataSource"
}
```
### Start

```bash
mvn spring-boot:run -Dserver.port=8888
```
or Run `Application.java` directly.
