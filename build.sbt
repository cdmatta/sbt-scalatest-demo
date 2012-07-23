name := "sbt-scalatest-demo"
 
version := "1.0-SNAPSHOT"
 
organization := "com.charandeepmatta"
 
scalaVersion := "2.9.1"
 
resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"

libraryDependencies ++= Seq(
                            "org.scalatest" %% "scalatest" % "1.7.1" % "test"
                           )
