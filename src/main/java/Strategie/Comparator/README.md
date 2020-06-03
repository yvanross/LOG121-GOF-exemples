# Patron stratégie Comparateur
## sous-titre
- list
  - list2

- list3

![class](https://www.plantuml.com/plantuml/png/0/PP7D2i8m48JlUOebnq84hoAbKZnu4to2jQvj83zbcnn4V7TZQMrBRilCjyDiKWq1EKHhX6WC3WESMggzxP4nU7v_9dMKMgSfAVMedEqTOzDjuTdgZNyjw9N9UJk351VoXWOrqzQwk43yn8PWoJvEcMNonQOYx6AloXKgycOvarNAaRnRploV1UHUWagcBEHyFno0VfEc5GU5OjrsGOqRgoXHaNkaV_W2 "class")





![Diagramme de séquence](https://www.plantuml.com/plantuml/svg/0/hP51YiCm34NtFeMMQM5wWC2Kbfa35782uGeZ9fOpjaB9aNgENgpo5Dg6T7PT6Vt_llZ8kwAOTOmzV3E6Z34I70dAvVmxadXovOTbG3EWqwatHpFx6d3AQlFh61nGSv9ECuRBEJ1zfLYtQChEeRS78h8uqvGz3oWA-p2ZgWyVsxaCwpMqW3Ff4uHEpUeU-BE2CDrWVnzlu2pyAjM2KXoCrcJzMSBJxcugPcxIg8ODPcelJSLNZy8TziXvKReivF-B6qtw8EiPbSBKB7Qyi_-Ev6Z_UWK0 "Diagramme de séquence")


Inclusion du diagramme directement dans Markdown

```mermaid
graph TD;


class AgeComparator{}
class Compagnie{}
Class EmbaucheComparator{}
Class Employe{}
Class PrenomComparateur{}
Class SalaireComparateur{}
class Comparator<T>{}

AgeComparator -up-> Comparator
EmbaucheComparator -up-> Comparator
PrenomComparateur -up-> Comparator
SalaireComparateur -up-> Comparator


```

```mermaid
graph TD;
A-->B;
A-->C;
B-->D;
C-->D; 
```