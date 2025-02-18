package tw.jimwayneyeh.example.spark_scala

import org.apache.spark.sql.SparkSession

/** @author ${user.name}
  */
object App {

  def main(args: Array[String]): Unit = {
    println("Hello World!")

    val spark = SparkSession.builder().appName("exmaple app").getOrCreate()
    val customerDf =
      spark.read.options(Map("header" -> "true")).csv("customers-100.csv")
    println(s"Count: ${customerDf.count()}")

    spark.stop()
  }

}
