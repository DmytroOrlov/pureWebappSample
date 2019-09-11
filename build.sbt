val Http4sVersion = "0.21.0-M4"
val Specs2Version = "4.7.0"
val H2Version = "1.4.199"
val doobieVersion = "0.8.0-RC1"
val circeVersion = "0.12.1"
val ScalaMockVersion = "4.0.0"
val ZioVersion = "1.0.0-RC12-1"

lazy val root = (project in file("."))
  .settings(
    organization := "io.github.loicdescotte",
    name := "pureWebAppSample",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.13.0",
    libraryDependencies ++= Seq(
      "org.http4s" %% "http4s-blaze-server" % Http4sVersion,
      "org.typelevel" %% "cats-core" % "2.0.0",
      "org.typelevel" %% "cats-effect" % "2.0.0",
      "dev.zio" %% "zio" % ZioVersion,
      "dev.zio" %% "zio-interop-cats" % "2.0.0.0-RC3",
      "org.http4s" %% "http4s-circe" % Http4sVersion,
      "org.http4s" %% "http4s-dsl" % Http4sVersion,
      "org.tpolecat" %% "doobie-core" % doobieVersion,
      "io.circe" %% "circe-generic" % circeVersion,
      "com.h2database" % "h2" % H2Version,
      "org.slf4j" % "slf4j-simple" % "1.7.28",
      "org.specs2" %% "specs2-core" % Specs2Version % Test
    )
  )
