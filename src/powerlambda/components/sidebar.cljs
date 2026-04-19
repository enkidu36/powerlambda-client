(ns powerlambda.components.sidebar)

(defn nav-item [{:keys [label active?]}]
  [:div.nav-item {:class (when active? "active")}
   label])

(defn sidebar []
  [:div.sidebar
   [nav-item {:label "Dashboard" :active? true}]
   [nav-item {:label "Workouts"}]
   [nav-item {:label "Analysis"}]])
