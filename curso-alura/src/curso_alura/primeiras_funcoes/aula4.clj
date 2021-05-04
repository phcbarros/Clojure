(ns curso_alura.primeiras_funcoes.aula2)
(defn imprime-mensagem
  []
  (println "Bem-vindo(a) ao sistema de estoque!!!"))

(imprime-mensagem)

(defn aplica-desconto
  [valor-bruto]
  (* valor-bruto 0.9))

(println "Usando função aplica-desconto")
(println (aplica-desconto 100))
(println (aplica-desconto 1000))

(defn valor-descontado
  "Retorna o valor com descontado que é 90% do valor bruto"
  [valor-bruto]
  (* valor-bruto 0.9))

(println "Usando função valor-descontado")
(println (valor-descontado 100))
(println (valor-descontado 1000))

(defn valor-descontado
  "Retorna o valor com desconto de 10%"
  [valor-bruto]
  (* valor-bruto (- 1 0.1)))

(println "Usando função valor-descontado modificada")
(println (valor-descontado 100))
(println (valor-descontado 1000))
