# Projet de gestion des patients - Hôpital

Ce projet est une application de gestion des patients pour un hôpital, développée avec Spring Boot, Thymeleaf et Bootstrap pour l'interface utilisateur. L'application permet de gérer les patients avec des fonctionnalités telles que l'affichage, la recherche, la pagination et la suppression.

## Prérequis

- Java 17+
- Spring Boot
- MySQL
- Maven
- Bootstrap

## Installation

1. Clonez le dépôt de l'application.
   
   ```bash
   git clone https://github.com/oussamabartil/Hopital

2. Naviguez dans le répertoire du projet.

   ```bash
   cd hopital
3. Configurez la base de données MySQL avec les informations suivantes dans application.properties :

   ```bash
   spring.datasource.url=jdbc:mysql://localhost:3306/hopital?createDatabaseIfNotExist=true
   spring.datasource.username=root
   spring.datasource.password=your-password
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MariaDBDialect

4. Installez les dépendances Maven.

    ```bash
    mvn install

5. Démarrez l'application Spring Boot.

    ```bash
    mvn spring-boot:run

## Fonctionnalités
### Affichage des patients
L'application permet de visualiser la liste des patients avec leurs informations : ID, Nom, Date de naissance, Malade, et Score.

### Pagination dynamique
La liste des patients est paginée avec des options de navigation entre les pages.

### Recherche des patients
Il est possible de rechercher des patients par nom avec une pagination dynamique.

### Suppression des patients
L'application permet de supprimer des patients avec confirmation avant la suppression.

## Images
### 1. Installation des dépendances
   ![Installation des dépendances](images/1installation-des-dependance.jpg)
### 2. Ajout de la base de données
   ![Ajout de la base de données](images/2ajout-bd.jpg)
### 3. Liste des patients
   ![Liste des patients](images/3liste-patients.jpg)
### 4. Ajout de Bootstrap
   ![Ajout de Bootstrap](images/4ajout-de-bootstrap.jpg)
### 5.Design Bootstrap
   ![Design Bootstrap](images/5design-bootstrap.jpg)
### 6. Avant la pagination
   ![Avant la pagination](images/6avant-la-pagination.jpg)
### 7. Après la pagination
   ![Après la pagination](images/7apres-pagination.jpg)
### 8. Pagination avec paramètres
   ![Pagination avec paramètres](images/8pagination-en-utilisant-les-parametres.jpg)
### 9. Application du design de la pagination
   ![Application du design de la pagination](images/9appliquer-le-design-de-la-pagination.jpg)
### 10. Surbrillance de la pagination
   ![Surbrillance de la pagination](images/10surbrillance-pagination.jpg)
### 11. Recherche des patients
   ![Recherche des patients](images/11la-recherche.jpg)
### 12. Ajout de la suppression des patients
   ![Ajout de la suppression des patients](images/12ajouter-la-suppression-des-patient.jpg)
### 13. Message de confirmation de suppression
   ![Message de confirmation de suppression](images/13message-de-confirmation-de-supression.jpg)
### 14. Utilisation des icônes Bootstrap
   ![Utilisation des icônes Bootstrap](images/14utilisation-des-icons-bootstrap.jpg)
