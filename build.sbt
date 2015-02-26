name := """play-slick-scala"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,	
  anorm,
  cache,
  ws,
  "com.typesafe.play"      %% "play-slick"    % "0.8.1",
  "postgresql"              % "postgresql"    % "9.1-901.jdbc4"
)

instrumentSettings

ScoverageKeys.minimumCoverage := 80

ScoverageKeys.failOnMinimumCoverage := false

ScoverageKeys.highlighting := false

publishArtifact in Test := false

parallelExecution in Test := false
