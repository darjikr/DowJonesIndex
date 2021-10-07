DowJonesIndex Spring Rest API:

Once started, accessible on localhost port 8090

Endpoints: /api/stocks </br>
i. Search records by ticker: GET /api/stocks?ticker={value}; ticker query param is optional, if not provided, retruns all records </br>
ii. Add a new record: POST /api/products/ </br>
iii. Upload bulk data set: POST /api/stocks/bulk </br>
