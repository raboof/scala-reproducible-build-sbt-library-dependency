organization := "net.bzzt"

scalaVersion := "2.12.2"

lazy val root = (project in file("."))
  .settings(
    packageBin in Compile := {
      val bin = (packageBin in Compile).value
      val out = new File(bin.getCanonicalPath + "_")
      import io.github.zlika.reproducible._
      new ZipStripper()
        .addFileStripper("META-INF/MANIFEST.MF", new ManifestStripper())
        .addFileStripper("META-INF/maven/\\S*/pom.properties", new PomPropertiesStripper())
        .strip(bin, out)
      bin
    }
  )
