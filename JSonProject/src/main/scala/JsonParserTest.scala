import org.apache.spark
import org.apache.spark.sql.{SQLContext, SparkSession}
import org.apache.spark.{SparkConf, SparkContext}
object JsonParserTest {

  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder()
      .appName("Spark SQL basic example")
      .config("spark.master", "local")
      .getOrCreate()
      val ds = spark.read.option("multiLine", true).option("mode", "PERMISSIVE").json("test.json")
      ds.show()


  }
}
