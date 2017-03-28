import sbt.Keys.libraryDependencies

javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")

lazy val root = (project in file(".")).
  settings(
    name := "HelloLambda",
    version := "1.0",
    scalaVersion := "2.11.4",
    retrieveManaged := true,
    libraryDependencies += "com.amazonaws" % "aws-lambda-java-core" % "1.0.0",
    libraryDependencies += "com.amazonaws" % "aws-lambda-java-events" % "1.0.0",
    libraryDependencies += "com.amazonaws" % "aws-lambda-java-log4j" % "1.0.0",
    libraryDependencies += "io.github.yeghishe" %% "scala-aws-lambda-utils" % "0.0.2",
    libraryDependencies += "junit" % "junit" % "4.10" % "test",
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
  )

assemblyMergeStrategy in assembly :=
    {
      case PathList("META-INF", xs @ _*) => MergeStrategy.discard
      case x => MergeStrategy.first
    }
