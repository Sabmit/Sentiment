
logLevel := Level.Info

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.9"

//addSbtPlugin("com.typesafe.sbt" % "sbt-twirl" % "1.3.0")

//addSbtPlugin("com.typesafe.sbt" % "sbt-web" % "1.4.0")

//addSbtPlugin("com.untyped" % "sbt-sass" % "0.7")

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.2.2-RC2")

addSbtPlugin("se.marcuslonnberg" % "sbt-docker" % "1.4.1")

//addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.4")

//addSbtPlugin("com.softwaremill.clippy" % "plugin-sbt" % "0.5.0")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.6")

//addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")

addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.7.0")

addSbtPlugin("net.vonbuchholtz" % "sbt-dependency-check" % "0.1.10")
