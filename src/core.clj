(ns core)


;; Problem 24, Sum It All Up

(defn sum-it-all-up
  [s]
  (reduce + s))

(sum-it-all-up '(1 2 3 4 ))


;; Problem 25, Find the odd numbers

(defn find-the-odd-numbers
  [s]
  (filter odd? s))

(find-the-odd-numbers (range))


;; Problem 26, Fibonacci Sequence

(defn fibonacci
  [n]
  (take n (map first (iterate (fn [[a b]] [b (+ a b)]) [1 1]))))

(fibonacci 3)
