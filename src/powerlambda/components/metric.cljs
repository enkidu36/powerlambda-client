(ns powerlambda.components.metric)

(defn metric-card [{:keys [label value trend positive?]}]
  [:div.card.metric-card
   [:div.label label]
   [:div.value value]
   [:div.trend {:class (if positive? "positive" "negative")}
    trend]])
