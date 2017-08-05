organization := "net.bzzt"

scalaVersion := "2.12.2"

lazy val root = (project in file("."))
  .enablePlugins(ReproducibleBuildsPlugin)
