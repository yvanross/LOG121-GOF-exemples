# Container iterator

|Nom dans le modèle de conception | Nom actuel |
|-|-|
|Aggregate|Container|                
|ConcreteAggregate| NameRepository|
|Iterator| Iterator|
|ConcreteIterator| NameIterator|
|createIterator()| getIterator()|
|next()| next()|
|isDone()| hasNext()|
|currentItem()| next()|

# Diagramme de classe
![Diagramme de classe](https://www.plantuml.com/plantuml/svg/VP51Ry8m38Nl-HK-ZWD_e48LqhXmOTDsH1nCwtNP4gUA3HgQzjzn9y8gr769h4_lFJyvIr7CUeW1LXwxZ34Ij0HDG15oykcvHwCWUWfaR_RDe7QUbV8RDWIFYHKzKuR5ObreNSEt0-X8rqPGKtwOLL1czpFo5pXXVqVPq9SErdrAWTWONy3J_eCQjQJVgh31I2_K9_4MTHhCRAI2LslCtNPtjynVH85Js_7E-k9xHhM9LnJJ417jCAO-9j_-qnHyx0D5OfNH9ISQZOLN1cvYCSphsoKL78J4tT2BxffM0OfpI-BMVlWC "Diagramme de classe")

# Diagramme de séquence

![Diagramme de Séquence](https://www.plantuml.com/plantuml/png/bLBDJiCm3BxdAQoTjadZ0Ig1TjY5ouJO4rYPDI8QfoIkjZuIpy6BuNQaaArCa4DaV_7tOxNh91YbzJLi71uYUa-m9zXzlB-rn9PCUdNSe3v0aguclQEpFS4Oj18YF0f5rE89HIlUa0_6A4ESTGsom8pHqpCr8JaTwwfjqSu04vJGDJjx3DpSZCmCbBnTbuJyNMXb63otnap4XTNguI82B9TGGHaSxe7fE5zCIrmfL70WoQFAkdZEdddYst54ijy4Sof2oRwLSdIeu0NJbawYNb-L-e6UEeGcGmFGdxz9sZP6udvrFwmmQjwGE7yT9JVHiTGy_o6o-AV_RoiHxyrQB_rtFm40 "Diagramme de Séquence")