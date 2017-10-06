resolvers += Classpaths.sbtPluginReleases

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.5")

// For formatting of the source code.
addSbtPlugin("com.lucidchart" % "sbt-scalafmt" % "1.12")

// For publishing.
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.6")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.0")