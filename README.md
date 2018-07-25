# Mock Service

## Overview
Learning Spring Boot and REST

## Exercice 1
Create a ShoppingCart REST Controller with the following endpoints:
```
GET /articles : returns all articles
GET /articles/{articleId} : returns the desired article
PUT /articles/{articleId} : updates desired article (202 is fine for now)
POST /articles : creates an article (just a 201 is fine for now)
DELETE /articles/{articleId} : deletes desired article (204 is fine for now)
```

Also, create a CartService, with necessary methods to handle all the REST controller requests.

Define necessary models (no ORM needed for now).

No DB is needed for now, just hardcode answers and use a mock json file for articles.

Test the controller and the service with JUnit.
