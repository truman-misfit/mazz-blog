name := """mazz-blog"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test,
  "org.specs2" %% "specs2-core" % "3.6.4"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// erqx dependency
resolvers += "ERQX Releases" at "https://jroper.github.io/releases"
libraryDependencies += "au.id.jazzy.erqx" %% "erqx-engine" % "1.0.0"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
