name := "sbt-scalatest-demo"

version := "1.0-SNAPSHOT"

organization := "com.charandeepmatta"

scalaVersion := "2.9.1"

resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"

libraryDependencies ++= Seq(
                            "joda-time" % "joda-time" % "2.1",
                            "org.joda" % "joda-convert" % "1.2",
                            "org.scalatest" %% "scalatest" % "1.7.1" % "test"
                           )
