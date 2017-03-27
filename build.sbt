import sbt.Keys.libraryDependencies

javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")

lazy val root = (project in file(".")).
  settings(
    name := "lambda-demo",
    version := "1.0",
    scalaVersion := "2.11.4",
    retrieveManaged := true,
    target in assembly := file("project"),
    libraryDependencies += "com.amazonaws" % "aws-lambda-java-core" % "1.0.0",
    libraryDependencies += "com.amazonaws" % "aws-lambda-java-events" % "1.0.0",
    libraryDependencies += "com.amazonaws" % "aws-lambda-java-log4j" % "1.0.0",
    libraryDependencies += "io.github.yeghishe" %% "scala-aws-lambda-utils" % "0.0.2"
  )