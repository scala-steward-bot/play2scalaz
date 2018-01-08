scalacOptions ++= Seq("-deprecation", "-Xlint", "-unchecked", "-language:_")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.21")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.5")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.0")

addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.7.0")

addSbtPlugin("com.github.scalaprops" % "sbt-scalaprops" % "0.2.4")

fullResolvers ~= {_.filterNot(_.name == "jcenter")}
