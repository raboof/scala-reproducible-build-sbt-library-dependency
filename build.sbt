organization := "net.bzzt"

scalaVersion := "2.13.1"

lazy val root = (project in file(".")).aggregate(tlib, prog)

lazy val prog = (project in file("project-using-test-lib"))
  .dependsOn(tlib)

lazy val tlib = project in file("test-lib")

