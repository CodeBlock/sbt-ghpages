sbtPlugin := true

name := "sbt-ghpages-plugin"

organization := "com.jsuereth"

version := "0.5.0"

publishTo := Some(Resolver.url("sbt-plugin-releases", new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns))

publishMavenStyle := false

