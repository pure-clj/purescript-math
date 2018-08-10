(ns Math._foreign
  (:refer-clojure :exclude [min max]))

(defn abs [^double n]
  (Math/abs n))

(defn acos [^double n]
  (Math/acos n))

(defn asin [^double n]
  (Math/asin n))

(defn atan [^double n]
  (Math/atan n))

(defn atan2 [^double y]
  (fn [^double x]
    (Math/atan2 y x)))

(defn ceil [^double n]
  (Math/ceil n))

(defn cos [^double n]
  (Math/cos n))

(defn exp [^double n]
  (Math/exp n))

(defn floor [^double n]
  (Math/floor n))

(defn trunc [^double n]
  (if (neg? n)
    (Math/ceil n)
    (Math/floor n)))

(defn log [^double n]
  (Math/log n))

(defn max [^double n1]
  (fn [^double n2]
    (Math/max n1 n2)))

(defn min [^double n1]
  (fn [^double n2]
    (Math/min n1 n2)))

(defn pow [^double n]
  (fn [^double p]
    (Math/pow n p)))

(defn remainder [^double n]
  (fn [^double m]
    (rem n m)))

(defn round [^double n]
  (cond
    (Double/isNaN n) Double/NaN
    (Double/isInfinite n) n
    :else (double (Math/round n))))

(defn sin [^double n]
  (Math/sin n))

(defn sqrt [^double n]
  (Math/sqrt n))

(defn tan [^double n]
  (Math/tan n))

(def e Math/E)

(def ln2 0.6931471805599453)

(def ln10 2.302585092994046)

(def log2e 1.4426950408889634)

(def log10e 0.4342944819032518)

(def pi Math/PI)

(def tau (* 2 Math/PI))

(def sqrt1_2 0.7071067811865476)

(def sqrt2 (Math/sqrt 2))
