(ns concert
  (:require ["@accordproject/concerto-core" :as concerto]
            [nbb.core :refer [slurp await]]
            [promesa.core :as p]
            ["fs" :as fs]
            [clojure.string :as str]))

(def modelmanager (new concerto/ModelManager))

(def full-mod (concerto/addCTOModel modelmanager model))

(def model (get-concerto new-test))

(def local-dir "/Users/tmb/coding/Clojure/cljacc/")

(def  new-test "/Users/tmb/Coding/Clojure/cljacc/test.cto")
(def test-file "Users/tmb/coding/Clojure/cljacc/test.cto")

(def test "test.cto")

(prn (def mod (new concerto/ModelManager model)))
(prn model)
(comment
  const postalAddress = {
    $class : 'org.acme.address.PostalAddress',
    streetAddress : '1 Maine Street'
};

  (defn slurp-concerto [test]
   (await (slurp test)))
  
  (defn get-concerto [test]
    (fs/readFileSync test))

   (slurp-concerto new-test)
  
   (get-concerto new-test)
  
   (str/join local-dir test)

  (concat local-dir test)
  
(def postalAddress  {
    "$class"  "org.acme.address.PostalAddress",
    "streetAddress"  "1 Maine Street"})

( postalAddress)