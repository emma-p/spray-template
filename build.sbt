import com.typesafe.sbt.SbtNativePackager

name := "test-native-packager"

version := "1.0"

scalaVersion := "2.11.7"

resolvers += "spray repo" at "http://repo.spray.io"

libraryDependencies ++= {
  val akkaV = "2.3.9"
  val sprayV = "1.3.3"
  Seq(
    "io.spray" %% "spray-can" % sprayV,
    "io.spray" %% "spray-routing" % sprayV,
    "com.typesafe.akka" %% "akka-actor" % akkaV
  )
}

mainClass in Compile := Some("testnativepackager.Main")

lazy val root = (project in file(".")).enablePlugins(SbtNativePackager).enablePlugins(JavaServerAppPackaging)
