import sbt._

object Dependencies {
  val sangriaVersion = "1.4.2"
  
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.5"
  lazy val sangria = Seq("org.sangria-graphql" %% "sangria", 
                         "org.sangria-graphql" %% "sangria-relay").map(_ % sangriaVersion) ++
                     Seq("org.sangria-graphql" %% "sangria-circe" % "1.2.1",
                         "org.sangria-graphql" %% "sangria-spray-json" % "1.0.1")
  lazy val akka = Seq("com.typesafe.akka" %% "akka-actor" % "2.5.23",
                      "com.typesafe.akka" %% "akka-stream" % "2.5.23",
                      "com.typesafe.akka" %% "akka-http" % "10.1.8",
                      "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.8")
  
}
