import org.apache.spark
import org.apache.spark.sql.{SQLContext, SparkSession}
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.Row
import scala.util.parsing.json
object TestJson {

  def main(args: Array[String]): Unit = {
    //create sqlContext
    val conf = new SparkConf().setAppName("Json Project").setMaster("local[2]")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)
    import sqlContext.implicits._
    val df = sqlContext.read.option("multiline", "true").json("test.json")
    df.show()

  }

}
