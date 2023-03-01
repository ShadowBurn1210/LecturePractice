ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"


lazy val root = (project in file("."))
  .settings(
    name := "LecturePractice"
  )
libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.15"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % "test"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.8.0-M4"
libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.8.0-M4" % Test

// https://mvnrepository.com/artifact/com.corundumstudio.socketio/netty-socketio
libraryDependencies += "com.corundumstudio.socketio" % "netty-socketio" % "1.7.23"


