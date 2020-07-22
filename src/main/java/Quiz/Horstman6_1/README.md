# Exercice 6.1 du livre de Horstman 

Considérons la classe BankAccount représentant un compte bancaire d’épargne:

```java
public class BankAccount
{
    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { balance -= amount; }
    public double getBalance() { return balance; }
    private double balance;
}
```

Un compte chèque est similaire au compte épargne. Cependant, avec le compte chèque, il faut payer des frais pour les dépôts et les retraits. Chaque mois, les cinq premières transactions sont gratuites. Les transactions suivantes coûtent 1$. 
Définissez une sous-classe CheckingAccount avec le constructeur :
```java
CheckingAccount(double intialBalance) 
```

et une méthode 
```java
void deductFees()
```

Celle-ci soustrait les frais du solde et remet à zéro le compteur des transactions. (L'ordinateur de la banque appellera cette méthode une fois par mois. Il n'y a pas de frais de transactions pour enlever les frais) Vous aurez aussi besoin de redéfinir les méthodes **deposit()*** et **withdraw()**.

Utiliser cette syntaxe pour définir vos constantes
```java
private static final int FREE_TRANSACTIONS_PER_MONTH = 5;
```

```plantuml
title BankAccount montly fee
class BankAccount{
    public void deposit(double amount)
    public void withdraw(double amount)
    public double getBalance()
    private double balance;
}
class CheckingAccount{
    public void deposit(double amount)
    public void withdraw(double amount)
}
CheckingAccount -|> BankAccount
```

Débuter par l'écriture des tests pour la classe BankAccount et ensuite écrivez les tests pour la classe CheckingAccout et termine par l'implémentation de celle-ci.

Ceci est un test pour les forks.