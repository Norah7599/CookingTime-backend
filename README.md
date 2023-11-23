

[MyTrello](https://trello.com/b/996uo2Wb/my-project)

![use case](https://github.com/Norah7599/CookingTime-backend/assets/145451780/63045a1d-aacb-4450-b2c5-39c07271c0b5)
![relationship](https://github.com/Norah7599/CookingTime-backend/assets/145451780/7b5fec6c-8e17-4589-9f0a-02a6ee2509f3)


# CookingTime-backend
This is the backend for the CookingTime application, built using Spring Boot.
## Controllers

### 1. Recipes Controller

- **Description:** Manages recipes-related operations.
- **Endpoint:** `/CooK`
- **Operations:**
  - `POST /store`: Save a new recipe.
  - `POST /storeUser`: Save a new user.
  - `GET /recipesList`: Get a list of recipes.
  - `DELETE /delete/{recipeid}`: Delete a recipe by ID.
  - `PUT /update`: Update a recipe.
  - `POST /storeFavorite`: Save a favorite recipe for a user.
  - `GET /Favoriterecipes`: Get a list of favorite recipes.
  - `DELETE /deleteFavorite/{favoriteid}`: Delete a favorite recipe by ID.

## Data Transfer Objects (DTO)

### 1. Favorite DTO

- **Description:** Represents a favorite recipe DTO.
- **Fields:**
  - `userid`: User ID.
  - `recipesid`: Recipe ID.

## Entities

### 1. Admin Entity

- **Description:** Represents an admin user.
- **Inherits from:** `Users` entity.

### 2. FavoriteRecipes Entity

- **Description:** Represents a favorite recipe relationship.
- **Fields:**
  - `favoriteid`: Favorite ID.
  - `regularuser`: User who favorited the recipe.
  - `recipes`: The favorited recipe.

### 3. Recipes Entity

- **Description:** Represents a recipe.
- **Fields:**
  - `recipeid`: Recipe ID.
  - `title`: Recipe title.
  - `ingredients`: Recipe ingredients.
  - `instructions`: Recipe instructions.
  - `R`: List of favorite recipes relationships.

### 4. Users Entity

- **Description:** Represents a generic user.
- **Fields:**
  - `userid`: User ID.
  - `username`: User username.
  - `email`: User email.
  - `password`: User password.

## Repositories

- **AdminRepository:** Manages CRUD operations for admin entities.
- **FavoriteRecipesRepository:** Manages CRUD operations for favorite recipes entities.
- **RecipesRepository:** Manages CRUD operations for recipes entities.
- **RegularuserRepository:** Manages CRUD operations for regular user entities.
- **UsersRepository:** Manages CRUD operations for generic user entities.

## Services

### 1. CookingTimeImple Service

- **Description:** Implements business logic for recipe-related operations.
- **Operations:**
  - `saveRecipes`: Save a new recipe.
  - `saveUser`: Save a new user.
  - `getRecipesList`: Get a list of recipes.
  - `deleterecipeid`: Delete a recipe by ID.
  - `updateRecipes`: Update a recipe.
  - `saveFavorite`: Save a favorite recipe for a user.
  - `getAllFavoriterecipes`: Get a list of favorite recipes.
  - `deleteFavoriteid`: Delete a favorite recipe by ID.

## How to Run

1. Make sure you have Java and Maven installed.
2. Clone this repository.
3. Navigate to the project directory in the terminal.
4. Run `mvn spring-boot:run` to start the backend server.
5. The server will run on `http://localhost:8080/`.

## Technologies Used

- Spring Boot
- Spring Data JPA
- Hibernate
- Other Spring dependencies...


