resolvers += Resolver.mavenLocal

// Based on https://github.com/raboof/sbt-reproducible-builds
// You'll also need https://github.com/raboof/reproducible-build-maven-plugin
addSbtPlugin("net.bzzt" % "sbt-reproducible-builds" % "0.1-SNAPSHOT")
