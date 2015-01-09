(ns swagger-ui-demo.handler
  (:require [compojure.api.sweet :refer :all]
            [ring.util.http-response :refer :all]
            [schema.core :as s]))

(s/defschema Message {:message String})

(defapi app
  (swagger-ui)
  (swagger-docs
    :title "Swagger-ui-demo")
  (swaggered "api"
    :description "hello world"
    (GET* "/hello" []
      :return Message
      :query-params [name :- String]
      :summary "say hello"
      (ok {:message (str "Hello, " name)}))))
