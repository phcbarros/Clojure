(ns curso_alura.aula3)

(defn valor-descontado
  "Aplica desconto de 10% se valor bruto for estritamente maior que 100"
  [valor-bruto]
  (if (> valor-bruto 100)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (println  "Taxa de desconto" taxa-de-desconto)
      (println  "Desconto" desconto)
      (- valor-bruto desconto))
    valor-bruto))

(println (valor-descontado 1000))
(println (valor-descontado 100))

; PREDICATE
(defn aplica-desconto?
  [valor-bruto]
  (if (> valor-bruto 100)
    true))

(println (aplica-desconto? 1000))
(println (aplica-desconto? 100))

(defn valor-descontado
  "Aplica desconto de 10% se valor bruto for estritamente maior que 100"
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (println  "Taxa de desconto" taxa-de-desconto)
      (println  "Desconto" desconto)
      (- valor-bruto desconto))
    valor-bruto))

(println (valor-descontado 1000))
(println (valor-descontado 100))

(defn aplica-desconto?
  [valor-bruto]
  (println "Usando when")
  (when (> valor-bruto 100)
    true))

(defn aplica-desconto?
  [valor-bruto]
  (println "Usando >")
  (> valor-bruto 100))

(println (aplica-desconto? 1000))
(println (aplica-desconto? 100))