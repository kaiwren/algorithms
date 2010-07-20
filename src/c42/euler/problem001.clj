;; If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
;; Find the sum of all the multiples of 3 or 5 below 1000.10 12 15 18

(ns c42.euler (:use clojure.test))

(defn multiple-of?
	"Determines if a given natural number m is a multiple of another natural number n"
	[n m]
	(zero? (mod m n)))

(defn natural-numbers-multiples-of-3-or-5-less-than 
	[n]
	(filter 
	 (fn [x] (or (multiple-of? 3 x) (multiple-of? 5 x)))
	 (range n)))

(defn sum-multiples-less-than 
	"Calculates the sum of all natural numbers smaller than the input that are multiples of 3 and 5" 
	[n]
	(reduce + (natural-numbers-multiples-of-3-or-5-less-than n)))

(testing "The sum of all natural numbers that are multiples of 3 or 5"
	(is (= 23 (sum-multiples-less-than 10)) "smaller than 10")
	(is (= 78 (sum-multiples-less-than 20)) "smaller than 20")
	(is (= 233168 (sum-multiples-less-than 1000)) "smaller than 1000"))

(testing "Multiples of"
	(testing "3"
		(is (not (multiple-of? 3 1)))
		(is (multiple-of? 3 3))
		(is (multiple-of? 3 6))
		(is (not (multiple-of? 3 7))))
	(testing "5"
		(is (not (multiple-of? 5 1)))
		(is (multiple-of? 5 5))
		(is (multiple-of? 5 10))
		(is (not (multiple-of? 5 6)))))

(testing "Natural numbers upto"
	(is (= '(0 1 2 3 4) (take 5 (range 5))))) ;; this is more in the vein of a how-to experiment with the range fn.

(testing "Filtering multiples of 3 or 5"
	(is (= '(0 3 5 6 9) (natural-numbers-multiples-of-3-or-5-less-than 10))))

