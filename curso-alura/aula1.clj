(println "Bem vindo ao sistema de estoque")

(def total-de-produto 15)
(println "Total:" total-de-produto)

(println (+ 5 5))

(def total-de-produto (+ total-de-produto 5))
(println "Novo Total:" total-de-produto)

(def estoque ["PS4", "Notebook"])
(println estoque)

(println "Quantidade de itens no array" (count estoque))
(println (estoque 0))
(println (estoque 1))
(println (conj estoque "Mouse"))
(println "Valor atual de estoque" estoque)

(def estoque (conj estoque "Mouse"))
(println "Valor atualizado de estoque" estoque)
