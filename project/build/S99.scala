import sbt._

class S99(info: ProjectInfo) extends DefaultProject(info) with IdeaProject {

   val scalatest = "org.scalatest" % "scalatest_2.9.0" % "1.4.1"
}
