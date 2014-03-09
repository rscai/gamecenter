name := "gamecenter"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.3.0",
  jdbc,
  anorm,
  cache,
  "com.typesafe.akka" % "akka-testkit_2.10" % "2.2.4" % "test"
)     

play.Project.playScalaSettings
