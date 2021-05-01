(defn valor-descontado
  [valor-bruto]
  (let [taxa-de-desconto (/ 10 100)
        desconto (* valor-bruto taxa-de-desconto)]
    (println  "Taxa de desconto" taxa-de-desconto)
    (println  "Desconto" desconto)
    (- valor-bruto desconto)))

(println (valor-descontado 100))

(println (if (> 500 100) "maior"))
(println (if (> 500 100) "maior" "menor ou igual"))


(defn valor-descontado
  "Aplica desconto de 10% se valor bruto for estritamente maior que 100"
  [valor-bruto]
  (if (> valor-bruto 100)
  (let [taxa-de-desconto (/ 10 100)
        desconto (* valor-bruto taxa-de-desconto)]
    (println  "Taxa de desconto" taxa-de-desconto)
    (println  "Desconto" desconto)
    (- valor-bruto desconto))))
  
(println (valor-descontado 1000))
(println (valor-descontado 100))

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