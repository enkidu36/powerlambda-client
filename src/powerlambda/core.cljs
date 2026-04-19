(ns powerlambda.core
  (:require
   [reagent.dom :as rdom]
   [powerlambda.views :refer [dashboard]]))

(defn ^:export init []
  (rdom/render [dashboard]
               (.getElementById js/document "app")))
