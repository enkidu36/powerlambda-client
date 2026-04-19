(ns powerlambda.components.button)

(defn button [{:keys [variant label on-click]}]
  [:button
   {:class (str "btn btn-" (or variant "primary"))
    :on-click on-click}
   label])
