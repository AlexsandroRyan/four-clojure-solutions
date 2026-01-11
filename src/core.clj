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


;; Problem 27, Palindrome Detector

(defn palindrome-detector
  [s]
  (let [mid-point (Math/ceil (/ (count s) 2))
        ; Need to use js/Math.ceil above when sending this function as the result, 
        ; 4clojure doesn't recognize Math/ceil.
        splitted-sequence (split-at mid-point s)
        last-part (last splitted-sequence)
        first-part (first splitted-sequence)
        first-part (if (not (= (count last-part) (count first-part)))
                     (butlast first-part)
                     first-part)]
    (= first-part (reverse last-part))))

(palindrome-detector '(1 2 37 6 3 2 1))
