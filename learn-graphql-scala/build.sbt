import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "me.kholodilov"

lazy val root = (project in file("."))
  .settings(
    name := "learn-graphql-scala",
    libraryDependencies ++= sangria,
    libraryDependencies ++= akka,
    libraryDependencies += scalaTest % Test
  )

