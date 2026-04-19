(ns powerlambda.components.header)

(defn header []
  [:div.header
   [:div.logo
    ;; Option 1: image logo
    [:img {:src "/img/power-lambda3.png"
           :alt "Powerλ"
           :class "logo-img"}]

    ;; Option 2: text fallback
    ;; [:span.logo-text "Powerλ"]
    ]])
