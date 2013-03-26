name := "jacks"

version := "2.1.4"

organization := "com.lambdaworks"

scalaVersion := "2.10.1"

libraryDependencies ++= Seq(
      "com.fasterxml.jackson.core"  %   "jackson-databind"  % "2.1.4",
      "org.scalacheck"              %%  "scalacheck"        % "1.10.0"  % "test",
      "org.scalatest"               %   "scalatest_2.10.0"  % "1.8"     % "test"
)

scalacOptions ++= Seq("-unchecked", "-optimize")
publishArtifact in Test := false
publishMavenStyle       := true

// ref: https://groups.google.com/forum/?fromgroups=#!topic/simple-build-tool/CJS8GvXO4j0
//publishTo <<= version {
//      val nexus = "https://oss.sonatype.org/"
//      _.trim.endsWith("SNAPSHOT") match {
//        case false => //Some("releases"  at nexus + "service/local/staging/deploy/maven2")
//                      Some( "Local Maven Repository" at """file:///W:/repository/""")
//##  [error] (*:publish) java.lang.UnsupportedOperationException: URL repository only support HTTP PUT at the moment
//        case true  => Some("snapshots" at nexus + "content/repositories/snapshots")
//   }
//}

publishTo := Some(Resolver.file("file",  new File( """X:\repository""" )))

pomIncludeRepository := { _ => false }

pomExtra := (
    <url>http://github.com/wg/jacks</url>
      <scm>
        <connection>scm:git:git://github.com/wg/jacks.git</connection>
        <developerConnection>scm:git:git://github.com/wg/jacks.git</developerConnection>
        <url>http://github.com/wg/jacks</url>
      </scm>
      <licenses>
        <license>
          <name>Apache License, Version 2.0</name>
          <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
          <distribution>repo</distribution>
        </license>
      </licenses>
      <developers>
        <developer>
          <id>will</id>
          <name>Will Glozer</name>
        </developer>
      </developers>)




