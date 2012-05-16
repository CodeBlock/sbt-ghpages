import sbt._
import Keys._
object ghpages extends Build {
  override def projects = Seq(root)
  lazy val root = Project("sbt-ghpages-plugin", file(".")) settings(
     resolvers += Resolver.url("scalasbt", new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns),
     resolvers += "jgit-repo" at "http://download.eclipse.org/jgit/maven",
     addSbtPlugin("com.jsuereth" % "sbt-git-plugin" % "0.4"),
     addSbtPlugin("com.jsuereth" % "sbt-site-plugin" % "0.4.0")
  )
}
