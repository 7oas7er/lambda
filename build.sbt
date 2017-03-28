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
    libraryDependencies += "io.github.yeghishe" %% "scala-aws-lambda-utils" % "0.0.2"
  )

assemblyMergeStrategy in assembly :=
    {
      case PathList("META-INF", xs @ _*) => MergeStrategy.discard
      case x => MergeStrategy.first
    }
