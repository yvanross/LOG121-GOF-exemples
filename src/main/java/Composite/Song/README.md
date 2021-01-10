# Quiz3 - Patron composite et Test unitaires
1. Convertir SongListGenerator en fonction de test
2. Utiliser ```mvn -P jacoco test``` pour générer le rapport de couverture de test
3. Consulter le rapport de test dans ```./target/site/jacoco/index.html```
4. Objectif: Avoir une couverture de test de 100%
5. Vous pouvez utiliser Utils/OutStream pour tester le contenu de la console
6. Assurez vous de tester adéquatement la classe Abstraite SongComponent. C'est a dire de générer les exceptions de chaque fonction.
7. En mode TDD, ajouter le test suivant dans DiskJockeyTest, assertEquals(7,diskJockey.numberOfSong()) qui doit vérifier le nombre de chanson.

![Diagramme de classe](https://www.plantuml.com/plantuml/svg/TP31IWD138RFdQS8Uz923xqkPQXO4AHuwKdePJeJrw4xcMMIgcNnNNmMdynqYxGkU9c1vFk_X2nPN953Qc4LNLDSIWW1mRUE6Gtl8tLEgy1oR57V4ls9DcT2G-mViz_ZiJSJW0PbawbPHvQRsnhUSWpm_MK-pPa-zNe3mFe_kOJrHdtKcCdEKHWAy5ifsA9ZV4PNQeWawhYItEVKPK8IM2pkThgLys9jR_vI3oKVEYK6cgEWjO0VWXH6bglCFu2v-AQpaDzf1jMq6krIWuN8M_B3F0nRoY_cSY5DbjYyYaRdrTY_rA5wrny0 "Diagramme de classe")
