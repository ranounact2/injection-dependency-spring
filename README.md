# 🔗 Projet Spring - Injection de Dépendances

##  Introduction

Ce projet est une implémentation pratique du concept d’**Injection de Dépendances (Dependency Injection - DI)** en utilisant le **framework Spring**. Il illustre comment concevoir des applications Java modernes en adoptant une architecture **faiblement couplée (loosely coupled)**, ce qui améliore la maintenabilité, la testabilité et l’évolutivité du code.

L’injection de dépendances est un principe fondamental du framework Spring et repose sur le concept d’**Inversion de Contrôle (IoC)**. Au lieu de créer manuellement les objets dans le code, c’est le conteneur Spring qui s’en charge automatiquement.

Ce projet est conçu comme un support pédagogique pour comprendre :

* Le fonctionnement du conteneur Spring
* La gestion des objets (Beans)
* L’injection automatique des dépendances
* Les bonnes pratiques en développement Spring

---

##  Objectifs du Projet

Les objectifs principaux de ce projet sont :

* Comprendre le concept d’injection de dépendances
* Maîtriser le fonctionnement du conteneur IoC de Spring
* Implémenter différentes formes d’injection
* Développer une application modulaire et maintenable
* Appliquer les bonnes pratiques du développement avec Spring Boot

---

##  Qu’est-ce que l’Injection de Dépendances ?

L’injection de dépendances est un **design pattern** qui consiste à fournir les dépendances d’une classe depuis l’extérieur, au lieu de les créer directement à l’intérieur de la classe.

###  Approche classique (couplage fort)

```java
Service service = new Service();
```

###  Approche avec Spring (couplage faible)

```java
@Autowired
private Service service;
```

 Cela permet :

* de réduire le couplage entre les classes
* de faciliter les tests
* de rendre le code plus flexible

---

##  Inversion de Contrôle (IoC)

L’**Inversion de Contrôle (IoC)** est le principe fondamental derrière l’injection de dépendances.

###  Différence :

| Approche classique             | Spring (IoC)           |
| ------------------------------ | ---------------------- |
| Le développeur crée les objets | Spring crée les objets |
| Couplage fort                  | Couplage faible        |
| Code rigide                    | Code flexible          |

Le conteneur Spring :

* crée les objets (Beans)
* injecte les dépendances
* gère le cycle de vie des objets

---

##  Types d’Injection de Dépendances

Spring propose trois types principaux :

###  Injection par Constructeur (Recommandée)

```java
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }
}
```

✔️ Recommandée
✔️ Sécurisée
✔️ Facilite les tests

---

###  Injection par Setter

```java
public void setRepository(ProductRepository repository) {
    this.repository = repository;
}
```

✔️ Flexible
❌ Risque de valeurs nulles

---

### Injection par Champ (Field Injection)

```java
@Autowired
private ProductRepository repository;
```

 Simple
 Moins recommandée pour les projets professionnels

---

##  Technologies Utilisées

* **Java**
* **Spring Boot**
* **Spring Core**
* **Spring Context**
* **Maven**

---

## 📂 Structure du Projet

```bash
src/main/java/

├── controller       # Gestion des requêtes (Controllers)
├── service          # Logique métier
├── repository       # Accès aux données
├── model            # Classes entités
└── Application.java # Classe principale
```

---

## ⚙️ Fonctionnement du Projet

1. L’application démarre avec Spring Boot
2. Le conteneur Spring analyse le projet (scan des composants)
3. Les classes annotées sont détectées automatiquement :

   * `@Component`
   * `@Service`
   * `@Repository`
4. Spring crée les objets (Beans)
5. Les dépendances sont injectées automatiquement
6. L’application fonctionne avec des composants connectés

---

##  Annotations Importantes

###  `@Component`

Déclare une classe comme composant géré par Spring

###  `@Service`

Utilisée pour la logique métier

###  `@Repository`

Utilisée pour l’accès aux données

###  `@Autowired`

Permet l’injection automatique des dépendances

---

##  Lancer le Projet

### 1️⃣ Cloner le projet

```bash
git clone https://github.com/ranounact2/injection-dependency-spring.git
```

### 2️⃣ Ouvrir avec IntelliJ IDEA

* File → Open → sélectionner le dossier du projet

### 3️⃣ Installer les dépendances

Maven installe automatiquement les dépendances

### 4️⃣ Lancer l’application

Exécuter :

```bash
Application.java
```

---

## Avantages de l’Injection de Dépendances

* ✅ Réduction du couplage entre les classes
* ✅ Code plus lisible et organisé
* ✅ Tests unitaires facilités
* ✅ Maintenance simplifiée
* ✅ Évolutivité améliorée

---

##  Erreurs Courantes

* ❌ Abuser de l’injection par champ
* ❌ Ne pas utiliser d’interfaces
* ❌ Oublier les annotations Spring
* ❌ Créer des dépendances circulaires

---

##  Améliorations Futures

* Ajouter des API REST
* Connecter une base de données (MySQL)
* Ajouter Spring Security
* Implémenter des tests unitaires
* Améliorer l’architecture (microservices)

---

##  Auteur

* **Rania**

---

##  Licence

Ce projet est réalisé à des fins pédagogiques pour l’apprentissage du framework Spring.

---

##  Conclusion

Ce projet constitue une excellente introduction à l’injection de dépendances avec Spring. Il met en évidence l’importance d’une architecture modulaire et bien structurée dans le développement d’applications modernes.

Il représente une base solide pour approfondir :

* Spring Boot
* Les API REST
* La sécurité (Spring Security)
* Les architectures avancées

---
