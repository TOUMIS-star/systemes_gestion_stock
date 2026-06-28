# Gestion de stock
## Description
Ce projet est une application développer en Java avec Maven en utilisant git et github dans le but de gérer efficacement un stock de produit.
## Fonctionnalités
1-Ajouter un produit au stock
2-Retirer un produit du stock
3-Consulter la liste des produits du stock
4-Exécution automatique des tests avant chaque commit grâce au hook Git "pre-commit"

## Technologies utilisées
visual studio code
git
github
java
maven
Junit

## struture du projet
gestion_stock
    pom.xml
    README.md
    .gitignore
    src/main/java
        Produit.java
        Fournisseur.java
        Stock.java
    scr/test/java
        StockTest.java

## Compilation
bash mvn compile

## Lancement des tests
bash mvn test

## Equipe
Membre 1 : chef de projet
Membre 2 : Modèles(produits, fournisseur)
Membre 3 : gestion du stock
Membre 4 : Test JUnit
Membre 5 : Hook git, documentation et validation finale