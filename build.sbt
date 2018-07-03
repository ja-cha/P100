
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.problems",
      scalaVersion := "2.12.6",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "P100",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
   )
