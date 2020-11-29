import com.johnsnowlabs.nlp.SparkNLP
import com.johnsnowlabs.nlp.pretrained.PretrainedPipeline
import org.apache.spark.sql.SparkSession

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello, World")
    println(SparkNLP.version())

    val spark: SparkSession = SparkSession
      .builder()
      .appName("Scala Test")
      .master("spark://max-pc:7077")
      .config("spark.driver.memory", "16G")
      .config("spark.jars.packages", "com.johnsnowlabs.nlp:spark-nlp_2.11:2.6.4")
//      .config("spark.kryoserializer.buffer.max", "1000M")
      .config("spark.driver.maxResultSize", "2G")
      //      .config("spark.serializer", "org.apache.spark.serializer.KryoSerializer")
      .getOrCreate()


    val pipeline = PretrainedPipeline("explain_document_dl", "en")
    val text = "The Mona Lisa is a 16th century oil painting created by Leonardo.It's held at the Louvre in Paris."

    val result = pipeline.annotate(text)
    println(result)
  }
}