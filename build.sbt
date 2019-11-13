organization := "net.bzzt"

scalaVersion := "2.13.1"

lazy val root = (project in file(".")).aggregate(lib, prog)

lazy val prog = (project in file("project-using-test-lib"))
  .dependsOn(lib)

lazy val lib = (project in file("test-lib"))
  .enablePlugins(ReproducibleBuildsPlugin)

