classpathTypes += "maven-plugin"

resolvers += Resolver.mavenLocal

// resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

// Based on https://github.com/raboof/reproducible-build-maven-plugin
libraryDependencies += "io.github.zlika" % "reproducible-build-maven-plugin" % "0.3-SNAPSHOT"
