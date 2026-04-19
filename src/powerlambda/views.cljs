(ns powerlambda.views
  (:require
   [powerlambda.components.header :refer [header]]
   [powerlambda.components.sidebar :refer [sidebar]]
   [powerlambda.components.button :refer [button]]
   [powerlambda.components.metric :refer [metric-card]]))

(defn dashboard []
  [:div
   [header]
   [sidebar]

   [:div.main
    [:h1 "Dashboard"]

    [button {:variant "primary" :label "Start Ride"}]

    [:div.row
     [metric-card {:label "FTP" :value "285w" :trend "+5%" :positive? true}]
     [metric-card {:label "CTL" :value "72" :trend "+2" :positive? true}]]]])
