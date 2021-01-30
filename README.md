# LOG121 GOF Exemples

Ce Git contient un ensemble de code source d'exemple java pour les patrons GOF.

Pour exécuter tout les tests
```bash
mvn test 
```

Pour obtenir le rapport de couverture de test
```bash
mvn -P jacoco test
```
[Ouvrir le rapport jacoco dans votre browser](./target/jacoco/site/../../site/jacoco/index.html)

# Maven file Watch
https://github.com/rzymek/watcher-maven-plugin
mvn watcher:run

# Generation des diagramme de classes
 java -jar plantuml-dependency-cli-1.4.0-jar-with-dependencies.jar -o plantuml.puml -b . -i **/*.java -e **/*Test*.jva -dn .*Test.* -v


  java -jar plantuml-dependency-cli-1.4.0-jar-with-dependencies.jar -o plantuml-framework-graphed2.puml -b . -i ./src/main/java/Framework/**/*.java -e **/*Test*.jva -dn .*Test.* -v