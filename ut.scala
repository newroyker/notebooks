// Databricks notebook source
object Fib{
  def get(l: Long): Long = if (l < 2) l else (2L to l).foldLeft((0L, 1L)){case((f_i_2, f_i_1), _) => (f_i_1, f_i_2 + f_i_1)}._2 
}

// COMMAND ----------

import org.scalatest._

// COMMAND ----------

class FibSpec extends FlatSpec with Matchers {

  "Fib" should "return f(0)" in {
    Fib.get(0) should be (0)
  }
  
  it should "return f(1)" in {
    Fib.get(1) should be (1)
  }

  it should "return f(2)" in {
    Fib.get(2) should be (1)
  }
  
  it should "return f(3)" in {
    Fib.get(3) should be (2)
  }
  
  it should "return f(8)" in {
    Fib.get(8) should be (21)
  }
}

// COMMAND ----------

(new FibSpec).execute()

// COMMAND ----------

