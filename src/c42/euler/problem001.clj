;; If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
;; Find the sum of all the multiples of 3 or 5 below 1000.

(ns c42.euler (:use clojure.test))

(def natural-numbers (iterate inc 0))

(defn sum-multiples-less-than 
	"Calculates the sum of all natural numbers smaller than the input that are multiples of 3 and 5" 
	[n]
	n)

(defn multiple-of?
	"Determines if a given natural number m is a multiple of another natural number n"
	[n m]
	(= 0 (mod m n)))

(testing "The sum of all natural numbers that are multiples of 3 or 5"
	(is (= 23 (sum-multiples-less-than 10)) "smaller than 10 is 23"))

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

(testing "Natural numbers"
	(testing "summation"
		(is (= 1 1))))