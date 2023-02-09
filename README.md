# TP Supermarché - Proposition de correction

## Notes de correction

La classe _AchatArticle_ n'est pas absolument requise (elle n'est pas utilisée dans le code de la classe _AppSupermarche_ fournie). Elle représente une ligne d'un ticket : un article et une quantité. La quantité achetée d'un article n'est pas une donnée propre à l'article : elle est propre à un achat. On doit donc la stocker à l'extérieur de la classe _Article_. Deux solutions se présentent alors :

1. Créer une classe supplémentaire _AchatArticle_ qui contient un article et une quantité. On peut alors stocker une liste d'objets _AchatArticle_ dans la classe _Caddie_. C'est la solution retenue dans le code fourni.

2. Associer chaque article à sa quantité par l'intermédiaire d'une autre structure de données. Le _dictionnaire_, qui associe une clé (l'article) à une valeur (sa quantité) semble approprié. On peut alors stocker ce dictionnaire dans la classe _Caddie_. Voir par exemple [cette doc](https://www.data-transitionnumerique.com/java-hashmap/).

À noter que certains étudiants ont utilisé deux tableaux pour stocker les articles et les quantités. C'est une solution possible, mais moins élégante et sujette à erreurs (il faut s'assurer que les index des deux tableaux soient « synchronisés »).

Les étudiants qui connaissent Python ou d'autres langages qui utilisent le concept de _tuple_ (structure pouvant accueillir plusieurs variables de types potentiellement différents) ont pu y voir une solution naturelle pour combiner article et quantité. Mais Java ne possède pas de type « tuple ». Néanmoins, une petite [bibliothèque permettant de créer des tuples](https://www.javatuples.org/index.html) existe.
