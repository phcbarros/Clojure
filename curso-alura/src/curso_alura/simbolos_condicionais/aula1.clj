(ns curso_alura.simbolos_condicionais.aula1)
(defn valor-descontado
  "Retorna o valor com desconto de 10%"
  [valor-bruto]
  (* valor-bruto (- 1 0.1)))

(println "Usando função valor-descontado modificada")
(println (valor-descontado 100))
(println (valor-descontado 1000))

(defn valor-descontado
  [valor-bruto]
  (let [desconto (- 1 0.1)]
    (println  "Calculando desconto" desconto)
    (* valor-bruto desconto)))

(println "Executando função valor descontado definindo simbolo local com let")
(println (valor-descontado 100))

(defn valor-descontado
  [valor-bruto]
  (let [desconto (/ 10 100)]
    (println  "Calculando desconto" desconto)
    (* valor-bruto desconto)))

(println "Executando função valor descontado alterando a forma que o simbolo desconto é calculado")
(println (valor-descontado 100))
(println (class (valor-descontado 100)))
