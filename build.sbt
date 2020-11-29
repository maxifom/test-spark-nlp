name := "test-spark-nlp"

version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.4.7"
libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.4.7"
libraryDependencies += "org.apache.spark" % "spark-mllib_2.11" % "2.4.7"
libraryDependencies += "com.johnsnowlabs.nlp" %% "spark-nlp" % "2.6.4"
