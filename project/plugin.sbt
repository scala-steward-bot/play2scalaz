scalacOptions ++= Seq("-deprecation", "-unchecked", "-language:_")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.15.0")

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.3.2")

addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "1.3.2")

addSbtPlugin("org.scala-native" % "sbt-scala-native" % "0.4.17")

addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.2.1")

addSbtPlugin("com.github.sbt" % "sbt-release" % "1.3.0")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.21")

addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.11.0")

addSbtPlugin("com.github.scalaprops" % "sbt-scalaprops" % "0.4.4")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.2")

fullResolvers ~= { _.filterNot(_.name == "jcenter") }
